package com.hisdu.meas.ui.survey

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.app.AlertDialog
import android.content.ContentValues
import android.content.Intent
import android.content.IntentSender
import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.location.Location
import android.net.Uri
import android.os.*
import android.provider.MediaStore
import android.util.Log
import android.view.*
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import cn.pedant.SweetAlert.SweetAlertDialog
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.hisdu.meas.databinding.SurveyFragmentBinding
import com.hisdu.meas.ui.Attendance.AttendanceFragment
import com.hisdu.meas.ui.Feedback.FeedbackFragment
import com.hisdu.meas.ui.main.MainActivity
import com.zest.android.ui.login.IndicatorViewModel
import javax.inject.Inject
import javax.inject.Provider
import androidx.activity.OnBackPressedCallback
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.dhaval2404.imagepicker.ImagePicker
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.common.api.ResolvableApiException
import com.google.android.gms.location.*
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import com.hisdu.meas.R
import com.ozoned.customerapp.Utils.AppConstant
import com.pixplicity.easyprefs.library.Prefs
import com.google.gson.Gson
import com.hisdu.meas.ui.Dashboard.DashboardFragmentDirections
import com.hisdu.meas.ui.Visits.VisitModel
import com.hisdu.meas.ui.Visits.Visits
import com.hisdu.meas.util.isLocationEnabled
import com.tbruyelle.rxpermissions3.RxPermissions
import dmax.dialog.SpotsDialog
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList
import com.gu.toolargetool.TooLargeTool;
import com.hisdu.meas.ui.Indicators.*
import com.hisdu.meas.util.ImageUtil


class SurveyFragment : Fragment(), IndicatorListener {


    private lateinit var binding: SurveyFragmentBinding
    private lateinit var viewModel: IndicatorViewModel

    private var indicatorLoaded = 0
    var selectedHfTYpe: String? = null
    private var selectedShift: String? = null
    private var visit: Visits? = null
    lateinit var masterModel: SubmitFormModel
    private var mSettingsClient: SettingsClient? = null
    private var mLocationSettingsRequest: LocationSettingsRequest? = null
    private var mLocationCallback: LocationCallback? = null
    private var mCurrentLocation: Location? = null
    private val REQUEST_CHECK_SETTINGS = 100
    private var interviewmasterModel = mutableListOf<SubmitFormModel>()
    private var nextInteview = false
    private lateinit var indicatorForImagePicker: Indicator

    @Inject
    lateinit var viewModelProvider: Provider<IndicatorViewModel>
    private var mLocationRequest: LocationRequest? = null
    private var mRequestingLocationUpdates: Boolean? = null

    // location updates interval - 10sec
    private val UPDATE_INTERVAL_IN_MILLISECONDS: Long = 10000
    private lateinit var dialog: AlertDialog
    private var category_id = ""
    private var category_name = ""

    // fastest updates interval - 5 sec
    // location updates will be received if another app is requesting the locations
    // than your app can handle
    private val FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS: Long = 5000
    private var mFusedLocationClient: FusedLocationProviderClient? = null
    var latitude = ""
    var longitude = ""
    private lateinit var mAdapter: IndicatorsAdapter
    private lateinit var currenImageview: ImageView

    lateinit var indicaorsmodel: IndicatorCategoryResponse
//    var inciator = IndicatorCategoryResponse()
     lateinit var callback: OnBackPressedCallback

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        (activity as MainActivity).mainComponent.inject(this)

        viewModel = ViewModelProvider(this, object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T =
                viewModelProvider.get() as T
        }).get(IndicatorViewModel::class.java)

        // This callback will only be called when MyFragment is at least Started.
        callback=
            object : OnBackPressedCallback(true /* enabled by default */) {
                override fun handleOnBackPressed() {

                    // Handle the back button event
                    try {
                        SweetAlertDialog(context, SweetAlertDialog.WARNING_TYPE)
                            .setTitleText("Are you sure?")
                            .setContentText("Form Data will be lost!")
                            .setConfirmText("Yes, Go Back!")
                            .setCancelText("No")
                            .setCancelClickListener { sDialog ->
                                sDialog.dismissWithAnimation()
                            }
                            .setConfirmClickListener { sDialog ->
                                sDialog.dismissWithAnimation()

                                this.remove()
                                requireActivity().onBackPressed()
//                                findNavController().navigate(SurveyFragmentDirections.actionSurveyFragmentToSectionFragment(selectedShift,selectedHfTYpe,masterModel,visit))

                            }
                            .show()
                    } catch (e: Exception) {

                    }
                }
            }

        requireActivity().onBackPressedDispatcher.addCallback(this, callback)
        init()
        locationPermission()
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SurveyFragmentBinding.inflate(layoutInflater, container, false)

        arguments?.let {
//            selectedHfTYpe = SurveyFragmentArgs.fromBundle(it).hftype
//            selectedShift = SurveyFragmentArgs.fromBundle(it).shift
            masterModel = SurveyFragmentArgs.fromBundle(it).masterform
            indicaorsmodel = SurveyFragmentArgs.fromBundle(it).indicators!!


            visit = SurveyFragmentArgs.fromBundle(it).visit

            if(masterModel.facilityName?.contains("Ambulance",true)!!){
                binding.ambulanceName.text=masterModel.AmbulanceNo
            }
            binding.toolbarTitle.text=masterModel.facilityName
            binding.facilityName.text=indicaorsmodel.categoryName

        }

        dialog = SpotsDialog.Builder().setContext(requireContext()).build()


        mAdapter = IndicatorsAdapter(requireActivity(), this)
        val llm = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.indicatorRecycler.layoutManager = llm
        binding.indicatorRecycler.adapter = mAdapter
        mAdapter.indicatorlist =indicaorsmodel.indicators

//        viewModel.allIndicators.observe(viewLifecycleOwner, Observer {
//            indicatorLoaded += 1
//            if (!it.isNullOrEmpty()) {
//
////                indicaorsmodel.indicators=getIndicator(it)
//                inciator.indicators = getIndicator(it)
////                indicators()
//
////                binding.indicatorRecycler.setItemViewCacheSize(inciator.indicators!!.size)
//                mAdapter.indicatorlist = inciator.indicators
//
//            }
//
//        })
        viewModel.inprocessFormForId.observe(viewLifecycleOwner, Observer {
            if (it != null) {
                masterModel.id = it.id
                viewModel.updateSaveForm(masterModel)
            }
        })

        binding.nextInterview.setOnClickListener {
            nextInteview = true
            next()
        }
        binding.nextBtn.setOnClickListener {
            next()

        }

        binding.previousBtn.setOnClickListener {
        }

        binding.backButtonCustom.setOnClickListener {
            requireActivity().onBackPressed()
        }


        binding.saveForm.setOnClickListener {

            SweetAlertDialog(context, SweetAlertDialog.WARNING_TYPE)
                .setTitleText("Are you sure?")
                .setContentText("Are your sure you Save From!")
                .setConfirmText("Yes, Save!")
                .setCancelText("No")
                .setCancelClickListener { sDialog ->
                    sDialog.dismissWithAnimation()
                }
                .setConfirmClickListener { sDialog ->
                    viewModel.updateSaveForm(masterModel)
                    SweetAlertDialog(requireContext(), SweetAlertDialog.SUCCESS_TYPE)
                        .setTitleText("Data Save Successfully!")
                        .show()
//                    findNavController().navigate(
//                        SurveyFragmentDirections.actionSurveyFragmentToSectionFragment(
//                            null,
//                            null,
//                            masterModel,
//                            visit
//                        )
//                    )
                    callback.remove()
                    requireActivity().onBackPressed()
                    sDialog.dismissWithAnimation()
                }
                .show()

        }

        return binding.root
    }




    fun next() {
        if (isLocationEnabled(requireContext())) {
            try {
                SweetAlertDialog(context, SweetAlertDialog.WARNING_TYPE)
                    .setTitleText("Are you sure?")
                    .setContentText("Are your sure you want to submit from!")
                    .setConfirmText("Yes, Submit!")
                    .setCancelText("No")
                    .setCancelClickListener { sDialog ->
                        sDialog.dismissWithAnimation()
                    }
                    .setConfirmClickListener { sDialog ->
                        submitForm()
                        sDialog.dismissWithAnimation()
                    }
                    .show()
            } catch (e: Exception) {

            }

        } else {
            startLocationUpdates()
        }
    }

    fun getIndicator(data: MutableList<Indicator>): MutableList<Indicator> {

        var indicator = mutableListOf<Indicator>()
        for (i in 0 until data.size) {
            if (data[i].ParentIndicatorId == null) {
                data[i].subIndicators = getSubIndicators(data[i].indicatorId, data)
                indicator.add(data[i])
            }
        }

        return indicator
    }

    fun getSubIndicators(pId: Int?, data: MutableList<Indicator>): MutableList<Indicator> {
        var indicator = mutableListOf<Indicator>()
        for (i in 0 until data.size) {
            if (data[i].ParentIndicatorId == pId) {

                data[i].indicatorId?.let {
                    data[i].subIndicators = getSubIndicators(it, data)
                }
                indicator.add(data[i])
            }
        }

        return indicator
    }

    fun submitForm() {
        var isvalid = true
//        masterModel.indicatorslist.clear()


        if (!formValidation(indicaorsmodel.indicators!!)) {
            isvalid = false
        }


        if (isvalid) {
            locationPermission()

//            var inciator = IndicatorCategoryResponse()
            var categoryFound = false

//            indicaorsmodel.categoryName = indicaorsmodel.categoryName
//            indicaorsmodel.caegoryId = indicaorsmodel.caegoryId
//            inciator.moduleId = indicaorsmodel.moduleId
//            inciator.applicationType = indicaorsmodel.applicationType

            indicaorsmodel.IsSubmitted = true
            if (!categoryFound) {
//                masterModel.indicatorslist.add(indicaorsmodel)
            }

//            masterModel.indicatorslist.distinct()

            masterModel.isSync = 2
            val df = SimpleDateFormat(AppConstant.DefaultDatePattern)
            val date = df.format(Calendar.getInstance().time)
            masterModel.CreatedOn = date
            Prefs.getInt(AppConstant.USERID, -1).let {
                masterModel.userid = it
            }


            viewModel.updateSaveForm(masterModel)
//            if (masterModel.id == null) {
//                viewModel.getPendingForId(
//                    Prefs.getInt(AppConstant.SELECTEDMODULE, -1),
//                    Prefs.getInt(AppConstant.SELECTEDROLE, -1),
//                    masterModel.facilityType.toString(),
//                    masterModel.facility.toString(),
//                    masterModel.visityType.toString()
//                )
//
//            } else {
//                viewModel.updateSaveForm(masterModel)
//
//            }

            SweetAlertDialog(requireContext(), SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Data Save Successfully!")
                .show()

            callback.remove()
            requireActivity().onBackPressed()
//            findNavController().navigate(
//                SurveyFragmentDirections.actionSurveyFragmentToSectionFragment(
//                    null,
//                    null,
////                    selectedShift,
////                    selectedHfTYpe,
//                    masterModel,
//                    visit
//                )
//            )

        }

    }
//    fun submitForm() {
//        var isvalid = true
//        masterModel.indicatorslist.clear()
//        for (i in 0 until fragmentsList.size) {
//            val myFragment = requireActivity().supportFragmentManager.findFragmentByTag("f" + i)
//
//            // Attendance
//            if (myFragment is AttendanceFragment) {
//                masterModel.attendanceList = myFragment.attendanceList
//            }
//            // Dynamic Indicators
//            if (myFragment is IndicatorsFragment) {
//                masterModel.indicatorslist.add(myFragment.indicaorsmodel)
//                if (myFragment.indicaorsmodel.indicators?.isNotEmpty() == true) {
//                    if (!formValidation(myFragment.indicaorsmodel.indicators!!, i)) {
//                        isvalid = false
//                        break
//                    }
//                }
//            }
//            // Feedback
//            if (myFragment is FeedbackFragment) {
//                masterModel.feedback = myFragment.submitFeedbackModel
//            }
//
//        }
//
//        if (isvalid) {
//            locationPermission()
//
//            if (visit != null) {
//                visit?.isVisited = true
//                visit?.let { viewModel.updateVisit(it) }
//            }
//
//            masterModel.isSync = 1
//            val df = SimpleDateFormat(AppConstant.DefaultDatePattern)
//            val date = df.format(Calendar.getInstance().time)
//            masterModel.CreatedOn = date
//            Prefs.getInt(AppConstant.USERID, -1).let {
//                masterModel.userid = it
//            }
//
//            val module = Prefs.getInt(AppConstant.SELECTEDMODULE, -1)
//            if (module == 3) {
//
//                interviewmasterModel.add(masterModel)
//                binding.submitedInterview.text = interviewmasterModel.size.toString() + "/3"
//                if (interviewmasterModel.size == 3) {
//                    nextInteview = false
//                    for (i in 0 until interviewmasterModel.size) {
//                        viewModel.insertSaveForm(interviewmasterModel[i])
//                    }
//                    submitSuccess()
//                } else {
//                    if (nextInteview) {
//                        nextInteview = false
////                        tabLayout(categorieslist)
//                        viewModel.loadAllCategories(
//                            Prefs.getInt(AppConstant.SELECTEDROLE, -1),
//                            Prefs.getInt(AppConstant.SELECTEDMODULE, -1)
//                        )
//
//                    } else {
//                        for (i in 0 until interviewmasterModel.size) {
//                            viewModel.insertSaveForm(interviewmasterModel[i])
//                        }
//                        submitSuccess()
//                    }
//
//                }
//                masterModel.indicatorslist = arrayListOf()
//            } else {
//
//                viewModel.insertSaveForm(masterModel)
//                SweetAlertDialog(requireContext(), SweetAlertDialog.SUCCESS_TYPE)
//                    .setTitleText("Data Save Successfully!")
//                    .show()
//                findNavController().navigate(SurveyFragmentDirections.actionSurveyFragmentToSectionFragment(selectedShift,selectedHfTYpe,masterModel,visit))
//            }
//        }
//
//    }

    fun submitSuccess() {

        SweetAlertDialog(requireContext(), SweetAlertDialog.SUCCESS_TYPE)
            .setTitleText("Data Save Successfully!")
            .show()
        findNavController().navigate(
            SurveyFragmentDirections.actionSurveyFragmentToSectionFragment(
                null,
                null,
//                selectedShift,
//                selectedHfTYpe,
                masterModel,
                visit
            )
        )
    }

    fun formValidation(indicators: List<Indicator>): Boolean {

        for (i in indicators.indices) {
            if (indicators[i].optionsType.equals("Heading", true)) {
                var total = 0
                var caluclatedValue = 0
                if (indicators[i].subIndicators?.isNotEmpty()!!) {
                    for (k in 0 until indicators[i].subIndicators?.size!!) {
                        if (indicators[i].subIndicators?.get(k)?.IsCalculation == true) {
                            if (indicators[i].subIndicators?.get(k)?.selectedValue.isNullOrEmpty()) {
                                showErrorMessage(
                                    "Please Select ${
                                        indicators[i].subIndicators?.get(
                                            k
                                        )?.question
                                    }"
                                )
                                return false
                            } else {
                                if (indicators[i].subIndicators?.get(k)?.IsOptionTotal == true) {
                                    total =
                                        Integer.parseInt(indicators[i].subIndicators?.get(k)?.selectedValue.toString())
                                } else {
                                    caluclatedValue += Integer.parseInt(
                                        indicators[i].subIndicators?.get(
                                            k
                                        )?.selectedValue.toString()
                                    )
                                }
                            }
                        } else {
                            if (indicators[i].subIndicators?.get(k)?.IsRequired == true) {
                                if (indicators[i].subIndicators?.get(k)?.selectedValue.isNullOrEmpty()) {
                                    showErrorMessage("Please Select ${indicators[i].question}")
                                    return false
                                }
                            }
                            if (indicators[i].subIndicators?.get(k)?.subIndicators?.isNotEmpty()!!) {

                                var validateSublist = mutableListOf<Indicator>()
                                for (l in 0 until indicators[i].subIndicators?.get(k)?.subIndicators?.size!!) {

                                    if (indicators[i].subIndicators?.get(k)?.selectedValue.isNullOrEmpty()) {

                                    } else {
                                        val sv =
                                            Integer.parseInt(indicators[i].subIndicators?.get(k)?.selectedValue.toString())
                                        if (indicators[i].subIndicators?.get(k)?.subIndicators?.get(
                                                l
                                            )?.showInCase == sv
                                        ) {
                                            indicators[i].subIndicators?.get(k)?.subIndicators?.get(
                                                l
                                            )
                                                ?.let {
                                                    validateSublist.add(
                                                        it
                                                    )
                                                }
                                        }
                                    }

                                }
                                validateSublist.let {
                                    if (!formValidation(it)) {
                                        return false
                                    }
                                }

                            }
                        }

                    }

                    if (total != caluclatedValue) {
                        showErrorMessage("Invalid Calculation${indicators[i].question}")
                        return false
                    }

                }
            } else {
                if (indicators[i].IsRequired == true) {
                    if (indicators[i].selectedValue.isNullOrEmpty()) {
                        showErrorMessage("Please Select ${indicators[i].question}")
                        return false

                    } else {


                        if (!indicators[i].subIndicators?.isNullOrEmpty()!!) {
                            if (indicators[i].selectedValue.isNotEmpty()) {
                                var validateSublist = mutableListOf<Indicator>()
                                for (k in 0 until indicators[i].subIndicators?.size!!) {
                                    if (indicators[i].subIndicators?.get(k)?.showInCase == Integer.parseInt(
                                            indicators[i].selectedValue
                                        )
                                    ) {
                                        indicators[i].subIndicators?.get(k)?.let {
                                            validateSublist.add(
                                                it
                                            )
                                        }
                                    }
                                }
                                validateSublist.let {
                                    if (!formValidation(it)) {
                                        return false
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (indicators[i].subIndicators != null) {
                        if (indicators[i].subIndicators?.isNotEmpty()!!) {
                            var validateSublist = mutableListOf<Indicator>()
                            if (indicators[i].optionsType == "Radiobutton") {
                                if (indicators[i].selectedValue.isNotEmpty()) {

                                    for (k in 0 until indicators[i].subIndicators?.size!!) {
                                        if (indicators[i].subIndicators?.get(k)?.showInCase == Integer.parseInt(
                                                indicators[i].selectedValue
                                            )
                                        ) {
                                            indicators[i].subIndicators?.get(k)?.let {
                                                validateSublist.add(
                                                    it
                                                )
                                            }
                                        }
                                    }
                                }
                            } else {
                                for (k in 0 until indicators[i].subIndicators?.size!!) {
                                    indicators[i].subIndicators?.get(k)?.let {
                                        validateSublist.add(
                                            it
                                        )
                                    }
                                }
                            }
                            validateSublist.let {
                                if (!formValidation(it)) {
                                    return false
                                }
                            }
                        }

                    }
                }
            }


        }
        return true
    }

    fun showErrorMessage(msg: String) {
        SweetAlertDialog(requireContext(), SweetAlertDialog.ERROR_TYPE)
            .setTitleText("Oops...!")
            .setContentText(msg)
            .show()
    }

    companion object {

        private val TAG = SurveyFragment::class.java.name
    }

    private class ViewPagerFragmentAdapter(
        @androidx.annotation.NonNull fragmentActivity: androidx.fragment.app.FragmentActivity?,
        var fragments: ArrayList<Fragment>
    ) :
        androidx.viewpager2.adapter.FragmentStateAdapter(fragmentActivity!!) {

        @androidx.annotation.NonNull
        override fun createFragment(position: Int): Fragment {
//            fragments[position]

            return fragments[position]
        }

        override fun getItemCount(): Int {
            return fragments.size
        }


    }

    fun indicators() {
        mAdapter = IndicatorsAdapter(requireActivity(), this)
        val llm = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.indicatorRecycler.layoutManager = llm
        binding.indicatorRecycler.adapter = mAdapter
    }

    fun androidx.viewpager2.widget.ViewPager2.findFragmentAtPosition(
        fragmentManager: androidx.fragment.app.FragmentManager,
        position: Int
    ): Fragment? {
        return fragmentManager.findFragmentByTag("f$position")
    }

    fun androidx.viewpager2.widget.ViewPager2.findCurrentFragment(fragmentManager: androidx.fragment.app.FragmentManager): Fragment? {
        return fragmentManager.findFragmentByTag("f$currentItem")
    }


    fun locationPermission() {


        var rxPermissions = RxPermissions(this); // where this is an Activity or Fragment instance


        rxPermissions
            .request(Manifest.permission.ACCESS_FINE_LOCATION)
            .subscribe { granted ->
                if (granted) { // Always true pre-M
                    // I can control the camera now

                    startLocationUpdates()

                    Log.d("Granted", "Granted")
                } else {
                    SweetAlertDialog(requireContext(), SweetAlertDialog.ERROR_TYPE)
                        .setTitleText("Please Grant Location permission")
                        .show()
                    // Oups permission denied
                }
            }
    }

    /**
     * Starting location updates
     * Check whether location settings are satisfied and then
     * location updates will be requested
     */
    @SuppressLint("MissingPermission")
    private fun startLocationUpdates() {
        mSettingsClient!!.checkLocationSettings(mLocationSettingsRequest)
            .addOnSuccessListener(requireActivity(), OnSuccessListener<LocationSettingsResponse?> {
                Log.i(ContentValues.TAG, "All location settings are satisfied.")
//                Toast.makeText(context, "Started location updates!", Toast.LENGTH_SHORT).show()
                mFusedLocationClient?.requestLocationUpdates(
                    mLocationRequest,
                    mLocationCallback,
                    Looper.myLooper()
                )
//                updateLocationUI()
            })
            .addOnFailureListener(requireActivity(), OnFailureListener { e ->
                val statusCode = (e as ApiException).statusCode
                when (statusCode) {
                    LocationSettingsStatusCodes.RESOLUTION_REQUIRED -> {
                        Log.i(
                            ContentValues.TAG,
                            "Location settings are not satisfied. Attempting to upgrade " +
                                    "location settings "
                        )
                        try {
                            // Show the dialog by calling startResolutionForResult(), and check the
                            // result in onActivityResult().
                            val rae = e as ResolvableApiException
                            rae.startResolutionForResult(
                                activity, REQUEST_CHECK_SETTINGS
                            )
                        } catch (sie: IntentSender.SendIntentException) {
                            Log.i(ContentValues.TAG, "PendingIntent unable to execute request.")
                        }
                    }
                    LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE -> {
                        val errorMessage =
                            "Location settings are inadequate, and cannot be " +
                                    "fixed here. Fix in Settings."
//                        Log.e(TAG, errorMessage)
                        Toast.makeText(activity, errorMessage, Toast.LENGTH_LONG)
                            .show()
                    }
                }
//                updateLocationUI()
            })
    }

    override fun onSaveInstanceState(oldInstanceState: Bundle) {
        super.onSaveInstanceState(oldInstanceState)
        oldInstanceState.clear()
    }

    fun init() {
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(context)
        mSettingsClient = LocationServices.getSettingsClient(context)
        mLocationCallback = object : LocationCallback() {
            override fun onLocationResult(locationResult: LocationResult) {
                super.onLocationResult(locationResult)
                // location is received
                mCurrentLocation = locationResult.lastLocation
                if (mCurrentLocation != null) {
                    latitude = mCurrentLocation?.latitude.toString()
                    longitude = mCurrentLocation?.longitude.toString()
                    masterModel.latitude = latitude
                    masterModel.longitude = longitude
                }
            }
        }
        mRequestingLocationUpdates = false
        mLocationRequest = LocationRequest()
        mLocationRequest!!.setInterval(UPDATE_INTERVAL_IN_MILLISECONDS)
        mLocationRequest!!.setFastestInterval(FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS)
        mLocationRequest!!.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY)
        val builder: LocationSettingsRequest.Builder = LocationSettingsRequest.Builder()
        builder.addLocationRequest(mLocationRequest)
        mLocationSettingsRequest = builder.build()
    }

    override fun onDataChange(recipe: Indicator) {

    }

    override fun onLoadDatePicker(indicator: Indicator) {

    }

    override fun onImagePicker(indicator: Indicator, imageview: ImageView) {
        if (!requireActivity().isFinishing) {
            activity?.getExternalFilesDir(Environment.DIRECTORY_PICTURES)?.let {
                ImagePicker.with(this)
                    .compress(1024)            //Final image size will be less than 1 MB(Optional)
                    .maxResultSize(
                        600,
                        600
                    )    //Final image resolution will be less than 1080 x 1080(Optional)
                    .cameraOnly()
                    .saveDir(it)
                    .start()
            }
        }
        indicatorForImagePicker = indicator
        currenImageview = imageview
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            //Image Uri will not be null for RESULT_OK
            val uri: Uri = data?.data!!
            val bitmap: Bitmap
            try {
                uri?.let {
                    if (Build.VERSION.SDK_INT < 28) {
                        bitmap = MediaStore.Images.Media.getBitmap(
                            requireContext().contentResolver,
                            uri
                        )
//                        imageView.setImageBitmap(bitmap)
                    } else {
                        val source =
                            ImageDecoder.createSource(requireContext().contentResolver, uri)
                        bitmap = ImageDecoder.decodeBitmap(source)
//                        imageView.setImageBitmap(bitmap)
                    }
                    currenImageview.setImageBitmap(bitmap)
                    try {
                        indicatorForImagePicker.selectedValue = ImageUtil.convert(bitmap)
                    } catch (e: Exception) {

                    }


                    Log.d("ImageCaptured", "imagecaptured")
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        } else if (resultCode == ImagePicker.RESULT_ERROR) {
            Toast.makeText(requireContext(), ImagePicker.getError(data), Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(requireContext(), "Task Cancelled", Toast.LENGTH_SHORT).show()
        }
    }

}
