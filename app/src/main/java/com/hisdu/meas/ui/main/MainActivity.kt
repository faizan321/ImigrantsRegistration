package com.hisdu.meas.ui.main

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.WindowManager
import androidx.lifecycle.*
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import cn.pedant.SweetAlert.SweetAlertDialog
import com.hisdu.meas.BuildConfig
import com.hisdu.meas.CategoryDirections
import com.hisdu.meas.LifecycleLoggingActivity
import com.hisdu.meas.MainApplication
import com.hisdu.meas.R
import com.hisdu.meas.data.model.Category
import com.hisdu.meas.databinding.ActivityMainBinding
import com.hisdu.meas.di.component.MainComponent
import com.hisdu.meas.ui.Dashboard.AppDropdown
import com.hisdu.meas.ui.Dashboard.DashboardViewModel
import com.hisdu.meas.util.isNetworkAvailable
import com.hisdu.meas.util.setupWithNavController
import com.ozoned.customerapp.Utils.AppConstant
import com.pixplicity.easyprefs.library.Prefs
import dmax.dialog.SpotsDialog
import java.io.*
import javax.inject.Inject
import javax.inject.Provider


class MainActivity : LifecycleLoggingActivity(), OnMainCallback {

    lateinit var mainComponent: MainComponent
    private lateinit var binding: ActivityMainBinding
    private var currentNavController: LiveData<NavController>? = null
    private lateinit var viewModel: DashboardViewModel
    private var doubleBackToExitPressedOnce = false
    private lateinit var dialog: AlertDialog

    @Inject
    lateinit var viewModelProvider: Provider<DashboardViewModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        adjustFontScale(resources.configuration)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.mainToolbar)

        supportActionBar?.setDisplayShowTitleEnabled(true)
        dialog = SpotsDialog.Builder().setContext(this).build()

        // Creation of the main graph using the application graph
        mainComponent =
            (applicationContext as MainApplication).provideAppComponent().mainComponent().create()

        // Make Dagger instantiate @Inject fields in MainActivity
        mainComponent.inject(this)
        viewModel = ViewModelProviders.of(this, object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T =
                viewModelProvider.get() as T
        }).get(DashboardViewModel::class.java)


        if(isNetworkAvailable(this)){
//            viewModel.getAppVersion(this)
//            checkAppVersion()
        }





        if (savedInstanceState == null) {
            setupBottomNavigationBar()
        }

        var userid = Prefs.getString(AppConstant.USERID, "")
//        if (userid != 0) {
//            viewModel.getUser(userid)
//        }


        viewModel.isLoading.observe(this, Observer { isloading ->

            if (isloading) {
                dialog.show()
            } else {
                dialog.dismiss()
            }
        })
        viewModel.uiEventLiveData.observe(this, Observer {
            when (it) {
                1 -> {
                    try {

                        finish()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://hisduapps.pshealthpunjab.gov.pk/Home/AppDetail/133")
                            )
//
                        )
                    } catch (e: Exception) {

                    }
                }
                2 -> {
                }
            }
        })


        viewModel.applicationModule.observe(this, Observer {
//            for (i in 0 until moduleList.size) {
//                for (j in 0 until it.size) {
//                    if (it[j].applicationTypeId == moduleList[i].roleId) {
//
//                        var indicatorRequest = IndicatorRequest()
//                        indicatorRequest.ModuleId = it[j].moduleId
//                        indicatorRequest.ApplicationType = it[j].applicationTypeId
//                        viewModel.getIndcators(indicatorRequest)
//                    }
//                }
//
//            }
            var assignedModuel = mutableListOf<AppDropdown.DropdownData.Module>()
            for (j in 0 until it?.size!!) {
//                if (it[j].applicationTypeId == userid) {
//                    assignedModuel.add(it[j])
//                }
            }
        })


    }
    fun checkAppVersion(){
        viewModel.checkAppVersion(this)
        viewModel.appVersion.observe(this, Observer {
            if(it!=null){
                if(it.AppVersion== BuildConfig.VERSION_NAME){
                    return@Observer
                }else{

                    val pDialog = SweetAlertDialog(this, SweetAlertDialog.NORMAL_TYPE)
                    pDialog.titleText = "Version Update (${it.AppVersion})"
                    pDialog.contentText = "Please Update App to new Version"
                    pDialog.confirmText = "Update"
                    pDialog.setCancelable(false)
                    pDialog.setConfirmClickListener { sDialog ->
                        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://hisduapps.pshealthpunjab.gov.pk/Home/AppDetail/133")))
                    }

                    pDialog.show()

                }
            }
        })
    }

    /**
     * Called on first creation and when restoring state.
     */
    private fun setupBottomNavigationBar() {

        val navGraphIds = listOf(

            R.navigation.recipes,
            R.navigation.category,
            R.navigation.favorites
        )

        // Setup the bottom navigation view with a list of navigation graphs
        val controller = binding.mainBottomNavigationView.setupWithNavController(
            navGraphIds = navGraphIds,
            fragmentManager = supportFragmentManager,
            containerId = R.id.nav_host_fragment_container,
            intent = intent
        )

        // Whenever the selected controller changes, setup the action bar.
        controller.observe(this, Observer { navController ->
            setupActionBarWithNavController(navController)
        })

        currentNavController = controller

    }

    override fun onSupportNavigateUp(): Boolean {
        return currentNavController?.value?.navigateUp() ?: false
    }

//    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
//        super.onRestoreInstanceState(savedInstanceState)
//        // Now that BottomNavigationBar has restored its instance state
//        // and its selectedItemId, we can proceed with setting up the
//        // BottomNavigationBar with Navigation
//        setupBottomNavigationBar()
//    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
            }
        }
        return super.onOptionsItemSelected(item)
    }


    override fun gotoSubCategories(category: Category) {
        if (findNavController(R.id.nav_host_fragment_container).currentDestination?.id == R.id.categoryFragment) {
            findNavController(R.id.nav_host_fragment_container)
                .navigate(CategoryDirections.actionCategoryFragmentToSearchFragment(category.title))
        }
    }

    companion object {

        private val TAG = MainActivity::class.java.name

        fun start(context: Context) {
            context.startActivity(Intent(context, MainActivity::class.java))
        }
    }

    override fun onSaveInstanceState(oldInstanceState: Bundle) {
        super.onSaveInstanceState(oldInstanceState)
        oldInstanceState.clear()
    }


    //    private void exportDB() {
    //        try {
    //            File folder = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + "/irmnch");
    //            boolean success = true;
    //            if (!folder.exists()) {
    //                success = folder.mkdirs();
    //            }
    //            if (success) {
    //                File dbFile = new File(getActivity().getDatabasePath("IRMNCH_Local_DB.db").getAbsolutePath());
    //                FileInputStream fis = new FileInputStream(dbFile);
    //
    //                String outFileName = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + "/irmnch" + File.separator + "irmnch_" + new SharedPref(getActivity()).GetserverID() + ".db";
    //
    //
    //                OutputStream output = new FileOutputStream(outFileName);
    //
    //                byte[] buffer = new byte[1024];
    //                int length;
    //                while ((length = fis.read(buffer)) > 0) {
    //                    output.write(buffer, 0, length);
    //                }
    //
    //                output.flush();
    //                output.close();
    //                fis.close();
    //
    //                File File = new File(outFileName);
    //
    //
    //                shareFile(File);
    //
    //            } else {
    ////                Toast.makeText(MainActivity.main, "Failed to create directory", Toast.LENGTH_SHORT).show();
    //            }
    //
    //
    //        } catch (IOException e) {
    //            Log.e("dbBackup:", e.getMessage());
    //        }
    //    }

//    override fun dispatchTouchEvent(event: MotionEvent): Boolean {
//        if (event.action == MotionEvent.ACTION_DOWN) {
//            val v: View? = currentFocus
//            if (v is EditText) {
//                val outRect = Rect()
//                v.getGlobalVisibleRect(outRect)
//                if (!outRect.contains(event.rawX.toInt(), event.rawY.toInt())) {
//                    v.clearFocus()
//                    val imm: InputMethodManager =
//                        getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
//                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0)
//                }
//            }
//        }
//        return super.dispatchTouchEvent(event)
//    }

    fun cameraPermission() {



//        var rxPermissions = RxPermissions(this); // where this is an Activity or Fragment instance
//
//
//        rxPermissions
//            .request(Manifest.permission.CAMERA)
//            .subscribe { granted ->
//                if (granted) { // Always true pre-M
//                    // I can control the camera now
//
//                    startLocationUpdates()
//
//                    Log.d("Granted", "Granted")
//                } else {
//                    SweetAlertDialog(requireContext(), SweetAlertDialog.ERROR_TYPE)
//                        .setTitleText("Please Grant Location permission")
//                        .show()
//                    // Oups permission denied
//                }
//            }
    }

    fun adjustFontScale(configuration: Configuration) {
        if (configuration.fontScale > 1.30) {
            configuration.fontScale = 1.0f
            val metrics = resources.displayMetrics
            val wm = getSystemService(WINDOW_SERVICE) as WindowManager
            wm.defaultDisplay.getMetrics(metrics)
            metrics.scaledDensity = configuration.fontScale * metrics.density
            baseContext.resources.updateConfiguration(configuration, metrics)
        }
    }

}
