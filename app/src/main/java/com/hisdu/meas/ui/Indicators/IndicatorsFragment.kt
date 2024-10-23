package com.hisdu.meas.ui.Indicators

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.*
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.dhaval2404.imagepicker.ImagePicker
import com.hisdu.meas.data.model.Recipe
import com.hisdu.meas.databinding.IndicatorFragmentBinding
import com.hisdu.meas.ui.main.MainActivity
import com.hisdu.meas.util.ImageUtil
import com.zest.android.ui.login.IndicatorViewModel
import javax.inject.Inject
import javax.inject.Provider

class IndicatorsFragment() : Fragment(), IndicatorListener {


    private var mRecipe: Recipe? = null
    private lateinit var binding: IndicatorFragmentBinding
    private lateinit var viewModel: IndicatorViewModel
    private lateinit var mAdapter: IndicatorsAdapter
    private lateinit var indicatorForImagePicker: Indicator

    @Inject
    lateinit var viewModelProvider: Provider<IndicatorViewModel>
    private lateinit var currenImageview: ImageView
    lateinit var indicaorsmodel: IndicatorCategoryResponse
    public var test: String = ""
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

            binding = IndicatorFragmentBinding.inflate(layoutInflater,container,false)

//        activity?.getWindow()?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);


            mAdapter = IndicatorsAdapter(requireActivity(), this)
//

            val llm = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            binding.indicatorRecycler.layoutManager = llm
            binding.indicatorRecycler.adapter = mAdapter
//            binding.indicatorRecycler.setHasFixedSize(true)

            val bundle = this.arguments
            if (bundle != null) {
                indicaorsmodel = bundle.getParcelable("indicators")!!
                if (indicaorsmodel?.indicators != null) {
                    indicaorsmodel?.indicators!!.add(dummyIndicator())
//                    mAdapter.setHasStableIds(true)
                    mAdapter.indicatorlist = indicaorsmodel?.indicators

                }

                indicaorsmodel.indicators?.size?.let {
//                    binding.indicatorRecycler.setItemViewCacheSize(it)
                }
            }

//        indicaorsmode?.indicators?.size?.let { binding.indicatorRecycler.setItemViewCacheSize(it) }
        }


        return binding.root
    }


    fun dummyIndicator(): Indicator {
        var indicator = Indicator(
            -1, null, "", -1, -1, -1, "Empty", "", "", null,
            null, -1, null, null, null, "", "", -1, -1, null, null, null, null,
            null, null, null
        )

        return indicator
    }

    companion object {

        private val TAG = IndicatorsFragment::class.java.name
    }

    override fun onDataChange(recipe: Indicator) {

        Log.d("indicatorsValue", "indicatorValue")
    }

    override fun onLoadDatePicker(indicator: Indicator) {

    }

    override fun onImagePicker(indicator: Indicator, imageview: ImageView) {
        if (!requireActivity().isFinishing) {
//            activity?.getExternalFilesDir(Environment.DIRECTORY_PICTURES)?.let {
//                ImagePicker.with(this)
//                    //Final image size will be less than 1 MB(Optional)
//                    .maxResultSize(
//                        600,
//                        600
//                    )    //Final image resolution will be less than 1080 x 1080(Optional)
//                    .cameraOnly()
//                    .saveDir(it)
//                    .start()
//            }
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, 100)
        }
        indicatorForImagePicker = indicator
        currenImageview = imageview
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == 100) {
                //Image Uri will not be null for RESULT_OK
                val bitmap: Bitmap = data?.extras?.get("data") as Bitmap
//                val bitmap: Bitmap
                try {
                    currenImageview.setImageBitmap(bitmap)
                    try {
                        indicatorForImagePicker.selectedValue = ImageUtil.convert(bitmap)
                    } catch (e: Exception) {

                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }

        } else if (resultCode == ImagePicker.RESULT_ERROR) {
            Toast.makeText(requireContext(), ImagePicker.getError(data), Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(requireContext(), "Task Cancelled", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onSaveInstanceState(oldInstanceState: Bundle) {
        super.onSaveInstanceState(oldInstanceState)
        oldInstanceState.clear()
    }
}
