package com.hisdu.meas.ui.Indicators

import android.Manifest
import android.R
import android.annotation.SuppressLint
import android.app.Activity
import android.app.AlertDialog
import android.content.ContentValues
import android.content.Intent
import android.content.IntentSender
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.ImageDecoder
import android.location.Location
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.view.*
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cn.pedant.SweetAlert.SweetAlertDialog
import com.github.dhaval2404.imagepicker.ImagePicker
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.common.api.ResolvableApiException
import com.google.android.gms.location.*
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import com.google.gson.Gson
import com.hisdu.meas.data.model.*
import com.hisdu.meas.databinding.MasterFormBinding
import com.hisdu.meas.ui.Dashboard.AppDropdown
import com.hisdu.meas.ui.Visits.Visits
import com.hisdu.meas.ui.main.MainActivity
import com.hisdu.meas.ui.migration.SaveMigrantModel
import com.hisdu.meas.ui.revamp.BHUImageClickListener
import com.hisdu.meas.ui.revamp.ImagesAdapter
import com.hisdu.meas.ui.revamp.ImagesResponseModel
import com.hisdu.meas.ui.roles.InProcessClickListener
import com.hisdu.meas.util.ImageUtil
import com.hisdu.meas.util.SwipeHelper
import com.hisdu.meas.util.getBackStackData
import com.hisdu.meas.util.isLocationEnabled
import com.hisdu.specialized.ui.Indicators.InProcessSurveysAdapter
import com.ozoned.customerapp.Utils.AppConstant
import com.pixplicity.easyprefs.library.Prefs
import com.squareup.picasso.Picasso
import com.tbruyelle.rxpermissions3.RxPermissions
import com.zest.android.ui.login.IndicatorViewModel
import com.zest.android.ui.login.UserModel
import dmax.dialog.SpotsDialog
import kotlinx.android.synthetic.main.master_form.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File
import java.util.*
import javax.inject.Inject
import javax.inject.Provider


class MasterIndicatorsFragment : Fragment(), InProcessClickListener,BHUImageClickListener{
    private lateinit var binding: MasterFormBinding
    private lateinit var viewModel: IndicatorViewModel

    //    private var selectedModule = -1
    val healthFacilityTypes: MutableList<AppDropdown.DropdownData.HealthFacilityType> = arrayListOf()

    private lateinit var dialog: AlertDialog
    //Primary Selected Values
    var selectedLocationCode: String = ""
    var selectedDistrict: String = ""
    var selectedType:String?=""
    var selectedDesignation: String = ""
    lateinit var user: UserModel
    var masterModel = BHUSurveyModel()
    var saveModel = SaveMigrantModel()
    var selectedBHUCode: String = ""
    var selectedNoOfBed: String = ""
    var selectedPhase: String = ""
    var selectedwheelChairs: String = ""
    var buildingPicture: String = ""
    var selectedImageView:ImageView?=null
    var selectedImage= ImagesResponseModel.BHUImageModel()
    private val FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS: Long = 5000
    private var mFusedLocationClient: FusedLocationProviderClient? = null
    var latitude = ""
    var longitude = ""
    private var mLocationRequest: LocationRequest? = null
    private val UPDATE_INTERVAL_IN_MILLISECONDS: Long = 10000

    private var allImagesList: MutableList<ImagesResponseModel.BHUImageModel> = arrayListOf()

    @Inject
    lateinit var viewModelProvider: Provider<IndicatorViewModel>
    private lateinit var mAdapter: InProcessSurveysAdapter
    private var imagesAdapter= ImagesAdapter(this)
    private var recordList = mutableListOf<SubmitFormModel>()


    private var mSettingsClient: SettingsClient? = null
    private var mLocationSettingsRequest: LocationSettingsRequest? = null
    private var mLocationCallback: LocationCallback? = null
    private var mCurrentLocation: Location? = null
    private val REQUEST_CHECK_SETTINGS = 100

    var totalBedsSubmitted = 0
    var totalWheelChairSubmitted = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        (activity as MainActivity).mainComponent.inject(this)

        viewModel = ViewModelProvider(this, object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T =
                viewModelProvider.get() as T
        }).get(IndicatorViewModel::class.java)
        dialog = SpotsDialog.Builder().setContext(requireContext()).build()

    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //mew
        if (!this::binding.isInitialized) {
            binding = MasterFormBinding.inflate(layoutInflater)
            viewModel.getHealthFacilityType()

            var userid = Prefs.getString(AppConstant.USERID, "0")
            viewModel.getUser(userid)
            init()
            locationPermission()

//            viewModel.getDistrict(requireContext())
//            viewModel.getTehsil(requireContext(),Prefs.getString(AppConstant.HFCode,""))
//
////            masterModel.latitude="34.43052"
////            masterModel.longitude="34.43052"
//
//            viewModel.tehsillist.observe(viewLifecycleOwner, Observer {
//                getTehsilList(it)
//            })
//
//            viewModel.districtlist.observe(viewLifecycleOwner, Observer {
//                getDistrictList(it)
//            })
//
//            viewModel.bhuList.observe(viewLifecycleOwner, Observer {
//                if (it.size > 0) {
//                    binding.bhuLayout.visibility = View.VISIBLE
//                    getBHUList(it)
//                } else {
//                    binding.bhuLayout.visibility = View.GONE
//                }
//
//            })


            selectedBHUCode= Prefs.getString(AppConstant.HFCode,"")
//            viewModel.getBHUImages(requireContext(),selectedBHUCode)




            viewModel.facilitydetail.observe(viewLifecycleOwner, Observer {
                masterModel.Id = it.Id
                masterModel.InspectionId = it.Id
                if(it.TotalWheelChair!=null){
                    totalWheelChairSubmitted = it.TotalWheelChair
                }

                if(it.TotalBeds!=null){
                    totalBedsSubmitted = it.TotalBeds
                }

                if (!it.BHUImage.isNullOrEmpty()) {
                    buildingPicture = it.BHUImage
                }

                SweetAlertDialog(requireContext(), SweetAlertDialog.NORMAL_TYPE)
                    .setTitleText("Health Facility Data Exist")
                    .setContentText("Data already exist against this Health Facility, you can just add Beds and WheelChairs")
                    .show()

            })

            binding.backButtonCustom?.setOnClickListener {
                requireActivity().onBackPressed()
            }

            binding.btSubmit.setOnClickListener {


                if (isLocationEnabled(requireContext())) {
                    try {
                        SweetAlertDialog(requireContext(), SweetAlertDialog.WARNING_TYPE)
                            .setTitleText("Are you sure?")
                            .setContentText("Are your sure you want to submit from!")
                            .setConfirmText("Yes, Submit!")
                            .setCancelText("No")
                            .setCancelClickListener { sDialog -> sDialog.dismissWithAnimation() }
                            .setConfirmClickListener { sDialog ->
                                if (validate()) {

                                    viewModel.saveMigration(saveModel)
                                }
//

                                sDialog.dismissWithAnimation()
                            }
                            .show()
                    } catch (e: Exception) {

                    }

                } else {
                    startLocationUpdates()
                }

            }

            mAdapter = InProcessSurveysAdapter(this, requireContext())
            binding.inprocessForms.adapter = mAdapter
            binding.inprocessForms.layoutManager = LinearLayoutManager(requireContext())
            object : SwipeHelper(requireContext(), binding.inprocessForms) {
                override fun instantiateUnderlayButton(
                    viewHolder: RecyclerView.ViewHolder,
                    underlayButtons: MutableList<UnderlayButton>
                ) {
                    underlayButtons.add(UnderlayButton(
                        "Delete",
                        0,
                        Color.parseColor("#FF3C30")
                    ) {
                        val position = viewHolder.adapterPosition
                        deleteDialog(recordList[position])
                    })
                }
            }


        }

        viewModel.isLoading.observe(viewLifecycleOwner, Observer { isloading ->

            if (isloading) {
                dialog.show()
            } else {
                dialog.dismiss()
            }
        })

        viewModel.dataSubmited.observe(viewLifecycleOwner, Observer {
            if(it!=null){
                SweetAlertDialog(requireContext(), SweetAlertDialog.SUCCESS_TYPE)
                    .setTitleText("")
                    .setContentText("Record Submitted Successfully")
                    .show()

                requireActivity().onBackPressed()
//                masterModel.Id=it.res
//                masterModel.InspectionId = it.res
            }


//            activity?.onBackPressed()
        })



        viewModel.migrationSave.observe(viewLifecycleOwner, Observer {
            if(it!=null){
                var type:Int?=null
                if(it.err=="N"){
                    type=SweetAlertDialog.SUCCESS_TYPE
                    requireActivity().onBackPressed()
                }else{
                    type=SweetAlertDialog.ERROR_TYPE
                }

                SweetAlertDialog(requireContext(),type)
                    .setTitleText("Alert!")
                    .setContentText(it.Msg)
                    .show()
            }
        })
        formFields()
        getMigrationRoute()
        return binding!!.root

    }

    fun formFields(){
        binding.familyHeadName.addTextChangedListener {
            saveModel.FamilyHeadName=it.toString()
        }
        binding.familyHeadCnic.addTextChangedListener {
            saveModel.FamilyHeadCNIC=it.toString()
        }

        binding.address.addTextChangedListener {
            saveModel.Address=it.toString()
        }

        binding.noOfHousehold.addTextChangedListener {
            if(it.toString().isNotEmpty()){
                try {
                    saveModel.NoOfHouseHold=Integer.parseInt(it.toString())
                }catch (e:Exception){

                }

            }else{
                saveModel.NoOfHouseHold=null
            }

        }

        binding.adults.addTextChangedListener {
            if(it.toString().isNotEmpty()){
                try {
                    saveModel.Adult=Integer.parseInt(it.toString())
                }catch (e:Exception){

                }

            }else{
                saveModel.Adult=null
            }

        }

        binding.kids.addTextChangedListener {
            if(it.toString().isNotEmpty()){
                try {
                    saveModel.Kids=Integer.parseInt(it.toString())
                }catch (e:Exception){

                }

            }else{
                saveModel.Kids=null
            }

        }
    }

    fun validate(): Boolean {
        return validatePrimaryMonitoring()
    }


    fun validatePrimaryMonitoring(): Boolean {

        if(saveModel.FamilyHeadCNIC.isNullOrEmpty()){
            showErrorMessage("Please Add Family Head CNIC")
            return false
        }
        if(saveModel.FamilyHeadName.isNullOrEmpty()){
            showErrorMessage("Please Add Family Head Name")
            return false
        }
        if(saveModel.RouteOfMigrants==null){
            showErrorMessage("Please Add Route Of Migration")
            return false
        }
        if(saveModel.NoOfHouseHold==null){
            showErrorMessage("Please Add No of HouseHold")
            return false
        }
        if(saveModel.Adult==null){
            showErrorMessage("Please Add No of Adult")
            return false
        }
        if(saveModel.Kids==null){
            showErrorMessage("Please Add No of Kids")
            return false
        }

        if(saveModel.Address==null){
            showErrorMessage("Please Add Address")
            return false
        }



        return true
    }
    fun getMigrationRoute() {

        viewModel.migrationRoute()

        var list = mutableListOf<String>()
        binding.migrationRoute.setTitle("Search Migration Route")
        val epiCentersAdapter = ArrayAdapter(requireActivity(), R.layout.simple_spinner_dropdown_item, list)


        viewModel.migrationRouteList.observe(viewLifecycleOwner, Observer {
          if(it!=null){

              list.add(0, "Select Migration Route")
              for (j in 0 until it.size) {
                  it[j].MigrantsFrom1?.let { it1 -> list.add(it1) }
              }
              binding.migrationRoute.setAdapter(epiCentersAdapter)

          }
        })



        binding.migrationRoute.setOnItemSelectedListener(object : OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View, i: Int, l: Long) {
                if (i > 0) {

                    saveModel.RouteOfMigrants=list[i]
                } else {
                    saveModel.RouteOfMigrants=null
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        })

    }



    companion object {

        private val TAG = MasterIndicatorsFragment::class.java.name
    }

    fun showErrorMessage(msg: String) {
        SweetAlertDialog(requireContext(), SweetAlertDialog.ERROR_TYPE)
            .setTitleText("Oops...!")
            .setContentText(msg)
            .show()
    }





    fun deleteDialog(record: SubmitFormModel) {
        SweetAlertDialog(requireContext(), SweetAlertDialog.WARNING_TYPE)
            .setTitleText("Are you sure?")
            .setContentText("Are you sure you want to Delete!")
            .setConfirmText("Yes, Delete!")
            .setCancelText("No")
            .setCancelClickListener { sDialog ->
                sDialog.dismissWithAnimation()
//                mAdapter.recipes = attendanceList
            }
            .setConfirmClickListener { sDialog ->
                sDialog.dismissWithAnimation()

                viewModel.deleteRecord(record)

            }
            .show()
    }

    override fun onClick(recipe: SubmitFormModel) {

        findNavController().navigate(
            MasterIndicatorsFragmentDirections.actionMasterIndicatorsFragmentToModuleFragment(
                recipe, Visits(), "false"
            )
        )
    }


//    fun onImagePicker() {
//        var rxPermissions = RxPermissions(this)
//        rxPermissions.request(
//            Manifest.permission.CAMERA,
//            Manifest.permission.READ_EXTERNAL_STORAGE
//        )
//            .subscribe { granted ->
//                if (granted) { // Always true pre-M
//
//
//                    if (!requireActivity().isFinishing) {
//                        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//                        startActivityForResult(intent, 100)
//                    }
//
//
//                    Log.d("Granted", "Granted")
//                } else {
//                    SweetAlertDialog(requireContext(), SweetAlertDialog.ERROR_TYPE)
//                        .setTitleText("Please Grant Camera permission")
//                        .show()
//                    // Oups permission denied
//                }
//            }
//
//
//    }

    fun onImagePicker() {
        if (!requireActivity().isFinishing) {
            activity?.getExternalFilesDir(Environment.DIRECTORY_PICTURES)?.let {
                ImagePicker.with(this)
                    .compress(800) //Final image size will be less than 1 MB(Optional)
                    .maxResultSize(
                        600,
                        600
                    )    //Final image resolution will be less than 1080 x 1080(Optional)

                    .saveDir(it)
                    .start()
            }
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            //Image Uri will not be null for RESULT_OK
            val uri: Uri = data?.data!!
            val bitmap: Bitmap
            try {
                uri.let {
                    if (Build.VERSION.SDK_INT < 28) {
                        bitmap =
                            MediaStore.Images.Media.getBitmap(requireContext().contentResolver, uri)
                    } else {
                        val source =
                            ImageDecoder.createSource(requireContext().contentResolver, uri)
                        bitmap = ImageDecoder.decodeBitmap(source)
                        selectedImageView?.setImageBitmap(bitmap)


                        val index = allImagesList.indexOfFirst { it.Id == selectedImage.Id }
                        allImagesList[index].imagePath = uri.path

                    }
                    when (requestCode) {

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
//                    latitude = mCurrentLocation?.latitude
//                    longitude = mCurrentLocation?.longitude
                    saveModel.Latitude =  mCurrentLocation?.latitude
                    saveModel.longitude = mCurrentLocation?.longitude
                }
            }
        }
        mLocationRequest = LocationRequest()
        mLocationRequest!!.setInterval(UPDATE_INTERVAL_IN_MILLISECONDS)
        mLocationRequest!!.setFastestInterval(FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS)
        mLocationRequest!!.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY)
        val builder: LocationSettingsRequest.Builder = LocationSettingsRequest.Builder()
        builder.addLocationRequest(mLocationRequest)
        mLocationSettingsRequest = builder.build()
    }

    override fun onBHUImageClick(model: ImagesResponseModel.BHUImageModel, imageView: ImageView) {
        selectedImageView= imageView
        selectedImage= model

        onImagePicker()
    }


}
