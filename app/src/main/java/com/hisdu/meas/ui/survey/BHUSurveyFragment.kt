package com.hisdu.meas.ui.survey

import android.Manifest
import android.R
import android.app.Activity
import android.content.ContentValues
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.view.*
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.recyclerview.widget.LinearLayoutManager
import cn.pedant.SweetAlert.SweetAlertDialog
import com.github.dhaval2404.imagepicker.ImagePicker
import com.google.gson.Gson
import com.hisdu.meas.data.model.BedDetailsViewModel
import com.hisdu.meas.data.model.ImageModel
import com.hisdu.meas.data.model.Recipe
import com.hisdu.meas.data.model.WheelChairDetailsViewModel
import com.hisdu.meas.databinding.BhuSurveyLayoutBinding
import com.hisdu.meas.databinding.IndicatorFragmentBinding
import com.hisdu.meas.ui.main.MainActivity
import com.hisdu.meas.ui.roles.ModuleFragmentArgs
import com.hisdu.meas.util.ImageUtil
import com.hisdu.meas.util.setBackStackData
import com.ozoned.customerapp.Utils.AppConstant
import com.pixplicity.easyprefs.library.Prefs
import com.tbruyelle.rxpermissions3.RxPermissions
import com.zest.android.ui.login.IndicatorViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Provider

class BHUSurveyFragment() : Fragment() {

    private lateinit var binding: BhuSurveyLayoutBinding
    private lateinit var viewModel: IndicatorViewModel
    private var picture = 0

    @Inject
    lateinit var viewModelProvider: Provider<IndicatorViewModel>

    //Bed
    private var selectedBedType = ""
    private var selectedBedStatus = ""
    private var selectedBedPlacement = ""
    private var bedPicLeft = ""
    private var bedPicRight = ""
    private var bedPicUP = ""
    private var bedPicDown = ""

    //Mattress
    private var selectedMattressStatus = ""
    private var selectedMattressCover = ""
    private var mattressPicFront = ""
    private var mattressPicBack = ""

    //FootStep
    private var selectedFootStepStatus = ""
    private var footStepPic = ""

    //WheelChair
    private var selectedWheelChairStatus = ""
    private var WheelChairpPic = ""

    private var bedSaveModel = BedDetailsViewModel()
    private var whellchairSaveModel = WheelChairDetailsViewModel()
    private var screenMode = ""
    private var inspectionid = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        (activity as MainActivity).mainComponent.inject(this)

        viewModel = ViewModelProvider(this, object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T =
                viewModelProvider.get() as T
        }).get(IndicatorViewModel::class.java)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (!this::binding.isInitialized) {

            binding = BhuSurveyLayoutBinding.inflate(layoutInflater, container, false)

            arguments?.let {


                screenMode = BHUSurveyFragmentArgs.fromBundle(it).screenMode
                inspectionid=  BHUSurveyFragmentArgs.fromBundle(it).inspectionid
                if (screenMode.equals("Bed")) {
                    binding.toolbarTitle.text = "Add Bed"
                } else if (screenMode.equals("Chair")) {
                    binding.toolbarTitle.text = "Add WheelChair"
                }


            }


            if (screenMode == "Bed") {
                binding.wheelchairlayout.visibility = View.GONE
                binding.bedMainLayout.visibility = View.VISIBLE
                tabBar()
                getBedType()
                getBedStatus()
                getBedPlacement()
                getMattressStatus()
                getMattressCover()
                getFootStepStatus()
                mattressAvailibility()
                footStepAvailibility()
            } else if (screenMode == "Chair") {
                binding.wheelchairlayout.visibility = View.VISIBLE
                binding.bedMainLayout.visibility = View.GONE
                getWheelChairStatus()
            }


            //BedImages
            binding.bedPic1.setOnClickListener {
                onImagePicker()
                picture = 1
            }
            binding.bedPic2.setOnClickListener {
                onImagePicker()
                picture = 2
            }
            binding.bedPic3.setOnClickListener {
                onImagePicker()
                picture = 3
            }
            binding.rightPicture.setOnClickListener {
                onImagePicker()
                picture = 4
            }

            //MattressImages
            binding.mattressPicFront.setOnClickListener {
                onImagePicker()
                picture = 5
            }
            binding.mattressPicBack.setOnClickListener {
                onImagePicker()
                picture = 6
            }

            //FootStep Pictures
            binding.footStepPicture.setOnClickListener {
                onImagePicker()
                picture = 7
            }

            //WheellChairImages
            binding.wheelchairPicture.setOnClickListener {
                onImagePicker()
                picture = 8
            }

            binding.btSubmit.setOnClickListener {
                if (validate()) {
                    submit()
                }
            }

            viewModel.wheelChairSubmitted.observe(viewLifecycleOwner, Observer {
                if(it.err=="Y"){
                    SweetAlertDialog(requireContext(), SweetAlertDialog.SUCCESS_TYPE)
                        .setTitleText("")
                        .setContentText(it.Msg)
                        .show()
                }else if(it.err=="N"){
                    SweetAlertDialog(requireContext(), SweetAlertDialog.SUCCESS_TYPE)
                        .setTitleText("")
                        .setContentText("WheelChair Submitted Successfully")
                        .show()
                    setBackStackData("chair", whellchairSaveModel, true)
                }

//            activity?.onBackPressed()
            })

            viewModel.bedSubmitted.observe(viewLifecycleOwner, Observer {
                if(it.err=="Y"){
                    SweetAlertDialog(requireContext(), SweetAlertDialog.SUCCESS_TYPE)
                        .setTitleText("")
                        .setContentText(it.Msg)
                        .show()
                }else if(it.err=="N"){
                    SweetAlertDialog(requireContext(), SweetAlertDialog.SUCCESS_TYPE)
                        .setTitleText("")
                        .setContentText("Bed Submitted Successfully")
                        .show()
                    setBackStackData("bed", bedSaveModel, true)
                }

//            activity?.onBackPressed()
            })

        }


        return binding.root
    }


    //     fun onImagePicker() {
//         var rxPermissions = RxPermissions(this)
//         rxPermissions.request(
//             Manifest.permission.CAMERA,
//             Manifest.permission.READ_EXTERNAL_STORAGE
//         )
//             .subscribe { granted ->
//                 if (granted) { // Always true pre-M
//
//
//                     if (!requireActivity().isFinishing) {
//                         val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//                         startActivityForResult(intent, 100)
//                     }
//
//                     Log.d("Granted", "Granted")
//                 } else {
//                     SweetAlertDialog(requireContext(), SweetAlertDialog.ERROR_TYPE)
//                         .setTitleText("Please Grant Camera permission")
//                         .show()
//                     // Oups permission denied
//                 }
//             }
//
//
//    }
    fun onImagePicker() {
        if (!requireActivity().isFinishing) {
            activity?.getExternalFilesDir(Environment.DIRECTORY_PICTURES)?.let {
                ImagePicker.with(this)
                    .compress(800)            //Final image size will be less than 1 MB(Optional)
                    .maxResultSize(
                        600,
                        600
                    )    //Final image resolution will be less than 1080 x 1080(Optional)
                    .cameraOnly()
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

                    try {
                        when (picture) {

                            1 -> {

                                binding.bedPic1.setImageBitmap(bitmap)
                                GlobalScope.launch(Dispatchers.Main) {
                                    try {
                                        async(Dispatchers.IO) {

                                            bedPicUP = ImageUtil.convert(bitmap)


                                        }.await()
                                    } catch (e: Exception) {

                                    }
                                }
                            }
                            2 -> {

                                binding.bedPic2.setImageBitmap(bitmap)
                                GlobalScope.launch(Dispatchers.Main) {
                                    try {
                                        async(Dispatchers.IO) {

                                            bedPicDown = ImageUtil.convert(bitmap)

                                        }.await()
                                    } catch (e: Exception) {

                                    }
                                }
                            }
                            3 -> {

                                binding.bedPic3.setImageBitmap(bitmap)
                                GlobalScope.launch(Dispatchers.Main) {
                                    try {
                                        async(Dispatchers.IO) {

                                            bedPicLeft = ImageUtil.convert(bitmap)
                                        }.await()
                                    } catch (e: Exception) {

                                    }
                                }
                            }
                            4 -> {

                                binding.rightPicture.setImageBitmap(bitmap)
                                GlobalScope.launch(Dispatchers.Main) {
                                    try {
                                        async(Dispatchers.IO) {

                                            bedPicRight = ImageUtil.convert(bitmap)
                                        }.await()
                                    } catch (e: Exception) {

                                    }
                                }
                            }
                            5 -> {
                                binding.mattressPicFront.setImageBitmap(bitmap)
                                GlobalScope.launch(Dispatchers.Main) {
                                    try {
                                        async(Dispatchers.IO) {

                                            mattressPicFront = ImageUtil.convert(bitmap)
                                        }.await()
                                    } catch (e: Exception) {

                                    }
                                }

                            }
                            6 -> {
                                binding.mattressPicBack.setImageBitmap(bitmap)
                                GlobalScope.launch(Dispatchers.Main) {
                                    try {
                                        async(Dispatchers.IO) {

                                            mattressPicBack = ImageUtil.convert(bitmap)
                                        }.await()
                                    } catch (e: Exception) {

                                    }
                                }

                            }
                            7 -> {
                                binding.footStepPicture.setImageBitmap(bitmap)

                                GlobalScope.launch(Dispatchers.Main) {
                                    try {
                                        async(Dispatchers.IO) {

                                            footStepPic = ImageUtil.convert(bitmap)
                                        }.await()
                                    } catch (e: Exception) {

                                    }
                                }

                            }
                            8 -> {
                                binding.wheelchairPicture.setImageBitmap(bitmap)

                                GlobalScope.launch(Dispatchers.Main) {
                                    try {
                                        async(Dispatchers.IO) {

                                            WheelChairpPic = ImageUtil.convert(bitmap)
                                        }.await()
                                    } catch (e: Exception) {

                                    }
                                }

                            }
                        }
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


//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if (resultCode == Activity.RESULT_OK) {
//            if (requestCode == 100) {
//                //Image Uri will not be null for RESULT_OK
//                val bitmap: Bitmap = data?.extras?.get("data") as Bitmap
////                val bitmap: Bitmap
//                try {
////                    currenImageview.setImageBitmap(bitmap)
//                    when(picture){
//
//                        1->{
//                            binding.bedPic1.setImageBitmap(bitmap)
//                            bedPicUP=ImageUtil.convert(bitmap)
//                        }
//                        2->{
//                            binding.bedPic2.setImageBitmap(bitmap)
//                            bedPicDown=ImageUtil.convert(bitmap)
//                        }
//                        3->{
//                            binding.bedPic3.setImageBitmap(bitmap)
//                            bedPicLeft=ImageUtil.convert(bitmap)
//                        }
//                        4->{
//                            binding.rightPicture.setImageBitmap(bitmap)
//                            bedPicRight=ImageUtil.convert(bitmap)
//                        }
//                        5->{
//                            binding.mattressPicFront.setImageBitmap(bitmap)
//                            mattressPicFront=ImageUtil.convert(bitmap)
//                        }
//                        6->{
//                            binding.mattressPicBack.setImageBitmap(bitmap)
//                            mattressPicBack=ImageUtil.convert(bitmap)
//                        }
//                        7->{
//                            binding.footStepPicture.setImageBitmap(bitmap)
//                            footStepPic=ImageUtil.convert(bitmap)
//                        }
//                        8->{
//                            binding.wheelchairPicture.setImageBitmap(bitmap)
//                            WheelChairpPic=ImageUtil.convert(bitmap)
//                        }
//                    }
//                    try {
////                        indicatorForImagePicker.selectedValue = ImageUtil.convert(bitmap)
//                    } catch (e: Exception) {
//
//                    }
//                } catch (e: Exception) {
//                    e.printStackTrace()
//                }
//            }
//
//        } else if (resultCode == ImagePicker.RESULT_ERROR) {
//            Toast.makeText(requireContext(), ImagePicker.getError(data), Toast.LENGTH_SHORT).show()
//        } else {
//            Toast.makeText(requireContext(), "Task Cancelled", Toast.LENGTH_SHORT).show()
//        }
//    }


    fun getBedType() {


        var designations = mutableListOf<String>()
        designations.add(0, "Select Bed Type*")
//            for (i in 0 until it?.size!!) {
//                it[i].DesignationName?.let { list.add(it) }
//            }

        designations.add("Normal")
        designations.add("Fowler with Accessories")
        designations.add("Examination Couch")
        val epiCentersAdapter =
            ArrayAdapter(requireActivity(), R.layout.simple_spinner_dropdown_item, designations)
        binding?.beddType.adapter = epiCentersAdapter
        binding?.beddType.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View,
                i: Int,
                l: Long
            ) {
                try {
                    if (i > 0) {
                        selectedBedType = designations[i]
//                        inspectorModel.designation = designations[i-1]
                    } else {
                        selectedBedType = ""
//                        inspectorModel.designation = null
                    }
                } catch (e: Exception) {
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }


    }

    fun getBedStatus() {


        var designations = mutableListOf<String>()
        designations.add(0, "Select Bed Status*")
//            for (i in 0 until it?.size!!) {
//                it[i].DesignationName?.let { list.add(it) }
//            }

        designations.add("Functional")
        designations.add("Non Functional (Irrepairable)")
        designations.add("Damaged (Repairable)")
        val epiCentersAdapter =
            ArrayAdapter(requireActivity(), R.layout.simple_spinner_dropdown_item, designations)
        binding?.bedStatus.adapter = epiCentersAdapter
        binding?.bedStatus.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View,
                i: Int,
                l: Long
            ) {
                try {
                    if (i > 0) {
                        selectedBedStatus = designations[i]
                        Log.d("status", selectedBedStatus)
//                        inspectorModel.designation = designations[i-1]
                    } else {
                        selectedBedStatus = ""
//                        inspectorModel.designation = null
                    }
                } catch (e: Exception) {
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }


    }

    fun getBedPlacement() {


        var designations = mutableListOf<String>()
        designations.add(0, "Select Bed Placement*")
//            for (i in 0 until it?.size!!) {
//                it[i].DesignationName?.let { list.add(it) }
//            }

        designations.add("MO Room")
        designations.add("LHV Room")
        designations.add("Labor Room")
        designations.add("Ward")
        val epiCentersAdapter =
            ArrayAdapter(requireActivity(), R.layout.simple_spinner_dropdown_item, designations)
        binding?.bedPlacement.adapter = epiCentersAdapter
        binding?.bedPlacement.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View,
                i: Int,
                l: Long
            ) {
                try {
                    if (i > 0) {
                        selectedBedPlacement = designations[i]
//                        inspectorModel.designation = designations[i-1]
                    } else {
                        selectedBedPlacement = ""
//                        inspectorModel.designation = null
                    }
                } catch (e: Exception) {
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }


    }


    fun getMattressStatus() {


        var designations = mutableListOf<String>()
        designations.add(0, "Select Mattress Status*")
//            for (i in 0 until it?.size!!) {
//                it[i].DesignationName?.let { list.add(it) }
//            }

        designations.add("Good")
        designations.add("Average")
        designations.add("Poor")
        val epiCentersAdapter =
            ArrayAdapter(requireActivity(), R.layout.simple_spinner_dropdown_item, designations)
        binding?.mattressStatus.adapter = epiCentersAdapter
        binding?.mattressStatus.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View,
                i: Int,
                l: Long
            ) {
                try {
                    if (i > 0) {
                        selectedMattressStatus = designations[i]
//                        inspectorModel.designation = designations[i-1]
                    } else {
                        selectedMattressStatus = ""
//                        inspectorModel.designation = null
                    }
                } catch (e: Exception) {
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }


    }

    fun getMattressCover() {


        var designations = mutableListOf<String>()
        designations.add(0, "Select Mattress Cover*")
//            for (i in 0 until it?.size!!) {
//                it[i].DesignationName?.let { list.add(it) }
//            }

        designations.add("Plastic")
        designations.add("Cloth")
        designations.add("Not Available")
        val epiCentersAdapter =
            ArrayAdapter(requireActivity(), R.layout.simple_spinner_dropdown_item, designations)
        binding?.mattressCover.adapter = epiCentersAdapter
        binding?.mattressCover.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View,
                i: Int,
                l: Long
            ) {
                try {
                    if (i > 0) {
                        selectedMattressCover = designations[i]
//                        inspectorModel.designation = designations[i-1]
                    } else {
                        selectedMattressCover = ""
//                        inspectorModel.designation = null
                    }
                } catch (e: Exception) {
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }


    }

    fun getFootStepStatus() {


        var designations = mutableListOf<String>()
        designations.add(0, "Select FootStep Status*")
//            for (i in 0 until it?.size!!) {
//                it[i].DesignationName?.let { list.add(it) }
//            }

        designations.add("Good")
        designations.add("Average")
        designations.add("Poor")
        val epiCentersAdapter =
            ArrayAdapter(requireActivity(), R.layout.simple_spinner_dropdown_item, designations)
        binding?.footstepStatus.adapter = epiCentersAdapter
        binding?.footstepStatus.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View,
                i: Int,
                l: Long
            ) {
                try {
                    if (i > 0) {
                        selectedFootStepStatus = designations[i]
//                        inspectorModel.designation = designations[i-1]
                    } else {
                        selectedFootStepStatus = ""
//                        inspectorModel.designation = null
                    }
                } catch (e: Exception) {
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }


    }

    fun getWheelChairStatus() {


        var designations = mutableListOf<String>()
        designations.add(0, "Select WheelChair Status*")

        designations.add("Good")
        designations.add("Average")
        designations.add("Poor")
        val epiCentersAdapter =
            ArrayAdapter(requireActivity(), R.layout.simple_spinner_dropdown_item, designations)
        binding.wheelchairStatus.adapter = epiCentersAdapter
        binding.wheelchairStatus.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View,
                i: Int,
                l: Long
            ) {
                try {
                    if (i > 0) {
                        selectedWheelChairStatus = designations[i]
//                        inspectorModel.designation = designations[i-1]
                    } else {
                        selectedWheelChairStatus = ""
//                        inspectorModel.designation = null
                    }
                } catch (e: Exception) {
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }


    }

    override fun onSaveInstanceState(oldInstanceState: Bundle) {
        super.onSaveInstanceState(oldInstanceState)
        oldInstanceState.clear()
    }

    fun tabBar() {
        binding.selectSurveyGroup.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                binding.bed.id -> {
                    binding.bedLayout.visibility = View.VISIBLE
                    binding.mattressLayout.visibility = View.GONE
                    binding.footstepLayout.visibility = View.GONE

                }
                binding.mattress.id -> {
                    binding.bedLayout.visibility = View.GONE
                    binding.mattressLayout.visibility = View.VISIBLE
                    binding.footstepLayout.visibility = View.GONE
                }
                binding.footStep.id -> {
                    binding.bedLayout.visibility = View.GONE
                    binding.mattressLayout.visibility = View.GONE
                    binding.footstepLayout.visibility = View.VISIBLE
                }
            }
        }
    }

    fun mattressAvailibility() {
        binding.mattressAvailableYes.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                binding.mattressAvailableLayout.visibility = View.VISIBLE
            }
        }
        binding.mattressAvailableNo.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                binding.mattressAvailableLayout.visibility = View.GONE
            }
        }
    }

    fun footStepAvailibility() {
        binding.footstepAvailableYes.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                binding.footStepAvailableLayout.visibility = View.VISIBLE
            }
        }
        binding.footstepAvailableNo.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                binding.footStepAvailableLayout.visibility = View.GONE
            }
        }
    }


    fun submit() {
        if (screenMode == "Chair") {
            whellchairSaveModel.WheelChairStatus = selectedWheelChairStatus
            whellchairSaveModel.WheelchairImage = WheelChairpPic
            whellchairSaveModel.WheelChairRemarks = binding.wheelchairRemarks.text.toString()
            whellchairSaveModel.InspectionId=Integer.parseInt(inspectionid)
            viewModel.SubmitWheelChair(whellchairSaveModel,requireContext())

            val gson = Gson()
            val json = gson.toJson(whellchairSaveModel)
            Log.d("whellchairSaveModel", json.toString())

        } else if (screenMode == "Bed") {

            bedSaveModel.BedType = selectedBedType
            bedSaveModel.BedStatus = selectedBedStatus
            bedSaveModel.BedPlacement = selectedBedPlacement
            bedSaveModel.BedImageUp = bedPicUP
            bedSaveModel.BedImageDown = bedPicDown
            bedSaveModel.BedImageLeft = bedPicLeft
            bedSaveModel.BedImageRight = bedPicRight
            bedSaveModel.InspectionId=Integer.parseInt(inspectionid)

            bedSaveModel.BedRemarks = binding.bedRemarks.text.toString()
            //Mattress
            if (binding.mattressAvailableYes.isChecked) {
                bedSaveModel.MattressAvailable = "true"
                bedSaveModel.MattressStatus = selectedMattressStatus
                bedSaveModel.MattressCover = selectedMattressCover
                bedSaveModel.MattressImageFront = mattressPicFront
                bedSaveModel.MattressImageBack = mattressPicBack
                bedSaveModel.MattressRemarks = binding.bedRemarks.text.toString()
            }
            if (binding.mattressAvailableNo.isChecked) {
                bedSaveModel.MattressAvailable = "false"
            }
            if (binding.footstepAvailableYes.isChecked) {
                bedSaveModel.IsFootStepAvailable = "true"
                bedSaveModel.FootStepStatus = selectedFootStepStatus
                bedSaveModel.FootstepImage = footStepPic
                bedSaveModel.FootStepRemarks = binding.footstepRemakrs.text.toString()
            }
            if (binding.footstepAvailableNo.isChecked) {
                bedSaveModel.IsFootStepAvailable = "false"
            }
            viewModel.SubmitBed(bedSaveModel,requireContext())

            val gson = Gson()
            val json = gson.toJson(bedSaveModel)
            Log.d("bedSaveModel", json.toString())

        }


    }

    fun validate(): Boolean {
        if (screenMode == "Chair") {
            if (selectedWheelChairStatus.isEmpty()) {
                showErrorMessage("Please Select WheelChair Status")
                return false
            }
        } else if (screenMode == "Bed") {
            if (selectedBedType.isEmpty()) {
                showErrorMessage("Please Select Bed Type")
                return false
            }
            if (selectedBedStatus.isEmpty()) {
                showErrorMessage("Please Select Bed Status")
                return false
            }
            if (selectedBedPlacement.isEmpty()) {
                showErrorMessage("Please Select Bed Placement")
                return false
            }
            if (bedPicUP.isNullOrEmpty()) {
                showErrorMessage("Please Add Front Picture")
                return false
            }
            if (bedPicDown.isNullOrEmpty()) {
                showErrorMessage("Please Add Back Picture")
                return false
            }
            if (bedPicLeft.isNullOrEmpty()) {
                showErrorMessage("Please Add Left Picture")
                return false
            }
            if (bedPicRight.isNullOrEmpty()) {
                showErrorMessage("Please Add Right Picture")
                return false
            }

            //Mattress validation

            if (binding.mattressAvailableYes.isChecked) {

                if (selectedMattressStatus.isEmpty()) {
                    showErrorMessage("Please Select Mattress Status")
                    return false
                }
                if (selectedMattressCover.isEmpty()) {
                    showErrorMessage("Please Select Mattress Cover")
                    return false
                }
                if (mattressPicFront.isNullOrEmpty()) {
                    showErrorMessage("Please Add Mattress Front Picture")
                    return false
                }
                if (mattressPicBack.isNullOrEmpty()) {
                    showErrorMessage("Please Add Mattress Back Picture")
                    return false
                }
            } else if (binding.mattressAvailableNo.isChecked) {

            } else {
                showErrorMessage("Please Select Mattress Available")
                return false
            }

            //FootStep Validation

            if (binding.footstepAvailableYes.isChecked) {
                if (selectedFootStepStatus.isEmpty()) {
                    showErrorMessage("Please Select FootStep Status")
                    return false
                }
                if (footStepPic.isNullOrEmpty()) {
                    showErrorMessage("Please Add FootStep Picture")
                    return false
                }
            } else if (binding.footstepAvailableNo.isChecked) {

            } else {
                showErrorMessage("Please Select FootStep Available")
                return false
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

}
