package com.hisdu.meas.ui.Dashboard

import android.Manifest
import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.graphics.Color
import android.net.ConnectivityManager
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.view.*
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.navigation.fragment.findNavController
import cn.pedant.SweetAlert.SweetAlertDialog
import com.hisdu.meas.BuildConfig
import com.hisdu.meas.R
import com.hisdu.meas.data.source.local.AppDatabase
import com.hisdu.meas.databinding.DashboardFragmentBinding
import com.hisdu.meas.databinding.VisitDetailBinding
import com.hisdu.meas.ui.Visits.Visits
import com.hisdu.meas.ui.main.MainActivity
import com.hisdu.meas.ui.main.OnMainCallback
import com.hisdu.meas.ui.revamp.FacilitiesAdapter
import com.hisdu.meas.util.KeyboardUtils
import com.hisdu.meas.util.NetworkStateReceiver
import com.hisdu.meas.util.isNetworkAvailable
import com.ozoned.customerapp.Utils.AppConstant
import com.pixplicity.easyprefs.library.Prefs
import com.tbruyelle.rxpermissions3.RxPermissions
import com.zest.android.ui.login.LoginActivity
import dmax.dialog.SpotsDialog
import java.io.*
import javax.inject.Inject
import javax.inject.Provider


class DashboardFragment : Fragment(), NetworkStateReceiver.OnNetworkStateReceiverListener, VisitClickListener{
    private var mCallback: OnMainCallback? = null
    private var mNetworkReceiver = NetworkStateReceiver()
    private lateinit var binding: DashboardFragmentBinding
    private lateinit var viewModel: DashboardViewModel
    private lateinit var dialog: AlertDialog
    private var visitsAdapter = VisitsAdapter(this)
    private var mInflater: LayoutInflater? = null
    private var facilityAdapter=FacilitiesAdapter()
    @Inject
    lateinit var viewModelProvider: Provider<DashboardViewModel>


    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnMainCallback) {
            mCallback = context
        } else {
            throw ClassCastException("$context must implement OnMainCallback!")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

        (activity as MainActivity).mainComponent.inject(this)

        viewModel = ViewModelProvider(this, object : ViewModelProvider.Factory { override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T =viewModelProvider.get() as T }).get(DashboardViewModel::class.java)

        mNetworkReceiver.addListener(this)
        context?.registerReceiver(mNetworkReceiver, IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION))

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        if (!this::binding.isInitialized) {
        binding = DashboardFragmentBinding.inflate(inflater)
        (activity as MainActivity).supportActionBar?.setDisplayHomeAsUpEnabled(false)

        mInflater = inflater

        dialog = SpotsDialog.Builder().setContext(requireContext()).build()

        binding.facilitiesRecycler.adapter=facilityAdapter


        viewModel.getVisitedFacilities()
        binding.version.text = "Version (" + BuildConfig.VERSION_NAME + ") "
        viewModel.isLoading.observe(viewLifecycleOwner, Observer { isloading ->

            if (isloading) {
                dialog.show()
            } else {
                dialog.dismiss()
            }
        })

//        viewModel.faciliteslist.observe(viewLifecycleOwner, Observer {
//            facilityAdapter.recipes=it
//            if(it!=null){
//                binding.facilityCount.text=it.size.toString()
//            }
//
//        })

        viewModel.migrationsList.observe(viewLifecycleOwner, Observer {
            facilityAdapter.recipes=it
            if(it!=null){
                binding.facilityCount.text=it.size.toString()
            }

        })

        viewModel.getMigrantsRecord(requireContext())

//        viewModel.getSynForm(0, requireContext())
//        viewModel.getSynForm(1, requireContext())
//        viewModel.getSynForm(2, requireContext())



        binding.logoutBtn.setOnClickListener {
            logout()
        }


        binding.startSurvey.setOnClickListener {
            if (isNetworkAvailable(requireContext())){
                findNavController().navigate(DashboardFragmentDirections.actionDashboardFragmentToMasterIndicatorsFragment())
            }else{
                Toast.makeText(requireContext(), "No Internet Connection", Toast.LENGTH_SHORT).show()
            }
        }

//        viewModel.eligibilityModel.observe(viewLifecycleOwner, Observer {
//            if(it!=null){
//                if(it.isElgible==true){
//                    findNavController().navigate(DashboardFragmentDirections.actionDashboardFragmentToMasterIndicatorsFragment())
//                }else{
//                    SweetAlertDialog(requireContext(), SweetAlertDialog.WARNING_TYPE).setTitleText("Alert!").setContentText(it.Msg).show()
//                }
//            }
//        })

        binding.importDb.setOnClickListener {
            exportDB()
        }

//        binding.startSurvey.setOnClickListener {
//            try {
//                findNavController().navigate(DashboardFragmentDirections.actionDashboardFragmentToMasterIndicatorsFragment())
//            } catch (e: Exception) {
//
//            }
//
//        }
        return binding.root
    }


    override fun networkAvailable() {

    }

    override fun networkUnavailable() {
        //nothing yet
    }

    private fun checkEmptyView() {
//        binding.recipesEmptyContainer.visibility = if (mAdapter.itemCount == 0) View.VISIBLE else View.GONE
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.recipes, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.search -> {
                gotoSearchPage()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }


    private fun gotoSearchPage() {
        if (findNavController().currentDestination?.id == R.id.recipesFragment) {
            findNavController().navigate(R.id.action_recipesFragment_to_searchFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mNetworkReceiver.removeListener(this)
        unregisterNetworkChanges()
    }

    private fun unregisterNetworkChanges() {
        context?.unregisterReceiver(mNetworkReceiver)
    }


    override fun onDetach() {
        super.onDetach()
        mCallback = null
    }

    companion object {

        private val TAG = DashboardFragment::class.java.name
    }




    fun logout() {

        SweetAlertDialog(requireContext(), SweetAlertDialog.WARNING_TYPE)
            .setTitleText("Are you sure?")
            .setContentText("Are you sure you want to logout!")
            .setConfirmText("Yes, Logout!")
            .setCancelText("No")
            .setCancelClickListener { sDialog ->
                sDialog.dismissWithAnimation()
            }
            .setConfirmClickListener { sDialog ->
                sDialog.dismissWithAnimation()
                Prefs.clear()
                viewModel.clearAllTables()
                requireActivity().finish()
                startActivity(Intent(requireContext(), LoginActivity::class.java))
            }
            .show()

    }


    private fun exportDB() {
        var rxPermissions = RxPermissions(this); // where this is an Activity or Fragment instance

        rxPermissions
            .request(
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE
            )
            .subscribe { granted ->
                if (granted) { // Always true pre-M
                    // I can control the camera now

                    try {
                        val folder = File(
                            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)
                                .toString() + "/meas"
                        )
                        var success = true
                        if (!folder.exists()) {
                            success = folder.mkdirs()
                        }
                        if (success) {
                            val dbFile: File =
                                File(
                                    requireActivity().getDatabasePath(AppDatabase.DB_NAME)
                                        .getAbsolutePath()
                                )
                            val fis = FileInputStream(dbFile)
                            val outFileName =
                                Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)
                                    .toString() + "/meas" + File.separator + "meas_" + Prefs.getInt(
                                    AppConstant.USERID,
                                    -1
                                ) + ".db"
                            val output: OutputStream = FileOutputStream(outFileName)
                            val buffer = ByteArray(1024)
                            var length: Int
                            while (fis.read(buffer).also { length = it } > 0) {
                                output.write(buffer, 0, length)
                            }
                            output.flush()
                            output.close()
                            fis.close()
                            val File = File(outFileName)
                            shareFile(File)
                        } else {
                            Toast.makeText(
                                requireActivity(),
                                "Failed to create directory",
                                Toast.LENGTH_SHORT
                            )
                                .show()
                        }
                    } catch (e: IOException) {
                        Log.e("dbBackup:", e.message.toString())
                    }

                    Log.d("Granted", "Granted")
                } else {
                    // Oups permission denied
                }
            }

    }

    private fun shareFile(file: File) {

        val u = Uri.fromFile(file)
//        val u = FileProvider.getUriForFile(requireActivity(), "com.hisdu.meas.fileprovider", file)
        val shareIntent = Intent()
        shareIntent.action = Intent.ACTION_SEND
        shareIntent.putExtra(Intent.EXTRA_STREAM, u)
        shareIntent.type = "text/*"
        startActivity(Intent.createChooser(shareIntent, "Share File"))
    }

    override fun onClick(visit: Visits) {
        showVisitDetail(visit)
    }

    private fun showVisitDetail(visit: Visits) {

        val binding: VisitDetailBinding = mInflater?.let { VisitDetailBinding.inflate(it) }!!
        val dialog = Dialog(requireContext())
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(binding.root)

        dialog.window?.setLayout(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        dialog.window?.attributes?.windowAnimations = R.style.DialogAnimation

        binding.healthFacilityName.text = visit.healthFacilityName
        binding.shiftName.text = visit.shiftName
        binding.facilityType.text = visit.ModeName

        if (visit.isVisited == true) {
            binding.visitStatus.text = "Visited"
            binding.visitStatus.setTextColor(Color.parseColor("#2c7973"))
        } else {
            binding.visitStatus.text = "Not Visited"
            binding.visitStatus.setTextColor(Color.parseColor("#F44336"))
        }

        if (visit.isRepeat == true) {
            binding.repeat.text = "Yes"
        } else {
            binding.repeat.text = "No"
        }

        binding.cancelStaff.setOnClickListener {
            KeyboardUtils.hideKeyboard(requireActivity())
            dialog.dismiss()
        }
        dialog.show()

    }

}
