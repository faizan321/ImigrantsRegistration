package com.hisdu.meas.ui.Feedback

import android.Manifest
import android.app.Activity
import android.content.ContentValues
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.*
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cn.pedant.SweetAlert.SweetAlertDialog
import com.github.dhaval2404.imagepicker.ImagePicker
import com.hisdu.meas.R
import com.hisdu.meas.data.model.Recipe
import com.hisdu.meas.databinding.ImagesFragmentBinding
import com.hisdu.meas.ui.Dashboard.DashboardViewModel
import com.hisdu.meas.ui.Indicators.SubmitFormModel
import com.hisdu.meas.ui.main.MainActivity
import com.hisdu.meas.ui.roles.SectionFragmentDirections
import com.hisdu.meas.ui.survey.SurveyFragmentArgs
import com.hisdu.meas.util.ImageUtil
import com.hisdu.meas.util.ImageUtil.getRealPathFromURI
import com.ozoned.customerapp.Utils.AppConstant
import com.pixplicity.easyprefs.library.Prefs
import com.tbruyelle.rxpermissions3.RxPermissions
import kotlinx.android.synthetic.main.images_fragment.view.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import java.io.File
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import javax.inject.Provider
import kotlin.math.roundToInt


class FeedbackFragment : Fragment(), ImageClickListener {


    private var mRecipe: Recipe? = null
    private lateinit var binding: ImagesFragmentBinding
    private lateinit var viewModel: DashboardViewModel
    private var mAdapter = ImagesAdapter(this)
    var imageslit = mutableListOf<ImagesModel>()
    var REQUEST_CAMERA = 0
    var selectedid: Int? = null
    var submitFeedbackModel = FeedbackSubmitModel()
    private lateinit var currenImageview: ImageView

    @Inject
    lateinit var viewModelProvider: Provider<DashboardViewModel>
    var imageUri: Uri? = null
    var selectedHfTYpe: String? = null
    var shiftid: String? = null
    lateinit var masterModel: SubmitFormModel
    var categoryName = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        (activity as MainActivity).mainComponent.inject(this)

        viewModel = ViewModelProvider(this, object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T =
                viewModelProvider.get() as T
        }).get(DashboardViewModel::class.java)
    }

    override fun onDestroyView() {
        super.onDestroyView()
//        requireActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING);

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        requireActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);

        if (!this::binding.isInitialized) {
            binding = ImagesFragmentBinding.inflate(layoutInflater, container, false)


            arguments?.let {
//                selectedHfTYpe = FeedbackFragmentArgs.fromBundle(it).hftype
//                shiftid = FeedbackFragmentArgs.fromBundle(it).shift
                masterModel = FeedbackFragmentArgs.fromBundle(it).masterform
                categoryName = FeedbackFragmentArgs.fromBundle(it).categoryname.toString()

                binding.toolbarTitle.text = masterModel.facilityName
                binding.facilityName.text = categoryName
            }

            showImages()
            binding.measComment.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {
                }

                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    submitFeedbackModel.meaComment = s.toString()
                }
            })

            binding.inchargeComment.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {
                }

                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    submitFeedbackModel.facility_incharge_comment = s.toString()
                }
            })

            binding.submitBtn.setOnClickListener {

                masterModel.feedback = submitFeedbackModel
//
                masterModel.isFeedbackSubmited = true
                viewModel.updateSyncStatus(masterModel)
                requireActivity().onBackPressed()
            }


            binding.backButtonCustom.setOnClickListener {
                (requireActivity().onBackPressed())
            }
        }

        return binding.root
    }

    fun showImages() {
        binding.imagesRecycler.adapter = mAdapter
        val fieldHeight = resources?.getDimension(R.dimen.item_height_medium)?.roundToInt()
        binding.imagesRecycler.setLayoutManager(object : GridLayoutManager(context, 2) {
            override fun checkLayoutParams(lp: RecyclerView.LayoutParams): Boolean {
                // force height of viewHolder here, this will override layout_height from xml
                if (fieldHeight != null) {
                    lp.width = width / 3
                    lp.height = width / 3
                }

                return true
            }
        })

//        var userid = Prefs.getS(AppConstant.USERID, 0)
//        if (userid != 0) {
//            viewModel.getUser(userid)
//        }
        val df = SimpleDateFormat(AppConstant.DefaultDatePattern)
        val date = df.format(Calendar.getInstance().time)
        imageslit.clear()
        if (masterModel.feedback != null) {

            if(!masterModel.feedback!!.images.isNullOrEmpty()){
                for (i in 0 until masterModel.feedback!!.images.size) {
                    imageslit.add(masterModel.feedback!!.images[i]) }
            }else{
                imageslit.add(ImagesModel("Picture 1 Name", 1, "", "", true, date))
                imageslit.add(ImagesModel("Picture 2 Name", 2, "", "", true, date))
                imageslit.add(ImagesModel("Picture with Health Representative/Facility Sign Board", 3, "", "", false, date))
            }

            binding.measComment.setText(masterModel.feedback!!.meaComment)
            binding.inchargeComment.setText(masterModel.feedback!!.facility_incharge_comment)
            submitFeedbackModel.images= masterModel.feedback!!.images
            submitFeedbackModel.meaComment=masterModel.feedback!!.meaComment
            submitFeedbackModel.facility_incharge_comment= masterModel.feedback!!.facility_incharge_comment
        } else {
            imageslit.add(ImagesModel("Picture 1 Name", 1, "", "", true, date))
            imageslit.add(ImagesModel("Picture 2 Name", 2, "", "", true, date))
            imageslit.add(ImagesModel("Picture with Health Representative/Facility Sign Board", 3, "", "", false, date))

        }
        mAdapter.recipes = imageslit

//        imageslit.add(ImagesModel("Image 4",4))




    }


//    companion object {
//
//        private val TAG = FeedbackFragment::class.java.name
//    }

    override fun onImageClick(id: Int, imageview: ImageView) {
        if (!requireActivity().isFinishing) {
//            activity?.getExternalFilesDir(Environment.DIRECTORY_PICTURES)?.let {
//                ImagePicker.with(this)
//                    .compress(200)			//Final image size will be less than 1 MB(Optional)
//                    .maxResultSize(500, 500)	//Final image resolution will be less than 1080 x 1080(Optional)
//                    .cameraOnly()
//                    .saveDir(it)
//                    .start()
//            }
            var rxPermissions = RxPermissions(this)
            rxPermissions.request(
                Manifest.permission.CAMERA,
                Manifest.permission.READ_EXTERNAL_STORAGE
            )
                .subscribe { granted ->
                    if (granted) { // Always true pre-M
                        // I can control the camera now
//                    val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//                    intent.putExtra(MediaStore.EXTRA_OUTPUT, Environment.DIRECTORY_PICTURES)
//                    startActivityForResult(intent, REQUEST_CAMERA)

                        //


                        var values = ContentValues()
                        values.put(MediaStore.Images.Media.TITLE, "New Picture")
                        values.put(MediaStore.Images.Media.DESCRIPTION, "From your Camera")
                        imageUri = requireActivity().contentResolver.insert(
                            MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values
                        )
//                    val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//                    intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri)
//                    startActivityForResult(intent, REQUEST_CAMERA)
                        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//                        intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri)
                        startActivityForResult(intent, 100)


                        selectedid = id
                        currenImageview = imageview

                        Log.d("Granted", "Granted")
                    } else {
                        SweetAlertDialog(requireContext(), SweetAlertDialog.ERROR_TYPE)
                            .setTitleText("Please Grant Camera permission")
                            .show()
                        // Oups permission denied
                    }
                }
        }


    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {

            try {
                if (requestCode == 100) {

                    try {
                        val bitmap: Bitmap = data?.extras?.get("data") as Bitmap
                        for (i in 0 until imageslit.size) {
                            if (selectedid == imageslit[i].id) {
                                GlobalScope.launch(Dispatchers.Main) {
                                    try {
                                        async(Dispatchers.IO) {
                                            imageslit[i].image = ImageUtil.convert(bitmap)
                                        }.await()
                                    } catch (e: Exception) {

                                    }
                                }

                                currenImageview.setImageBitmap(bitmap)
                            }
                        }
                        submitFeedbackModel.images = imageslit

                    } catch (e: Exception) {
                        e.printStackTrace()
                    }

                }

                Log.d("ImageCaptured", "imagecaptured")

            } catch (e: Exception) {
                e.printStackTrace()
            }

//            val bitmap = MediaStore.Images.Media.getBitmap(requireActivity().getContentResolver(), imageUri);


        } else if (resultCode == ImagePicker.RESULT_ERROR) {
            Toast.makeText(requireContext(), ImagePicker.getError(data), Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(requireContext(), "Task Cancelled", Toast.LENGTH_SHORT).show()
        }
    }

}
