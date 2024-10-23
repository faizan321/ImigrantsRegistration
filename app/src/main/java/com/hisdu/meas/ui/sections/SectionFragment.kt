package com.hisdu.meas.ui.roles

import android.app.AlertDialog
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cn.pedant.SweetAlert.SweetAlertDialog
import com.hisdu.meas.R
import com.hisdu.meas.databinding.SectionFragmentBinding
import com.hisdu.meas.ui.Dashboard.DashboardViewModel
import com.hisdu.meas.ui.Feedback.FeedbackFragment
import com.hisdu.meas.ui.Indicators.*
import com.hisdu.meas.ui.Visits.Visits
import com.hisdu.meas.ui.main.MainActivity
import com.hisdu.meas.ui.survey.SurveyFragmentArgs
import com.ozoned.customerapp.Utils.AppConstant
import com.pixplicity.easyprefs.library.Prefs
import dmax.dialog.SpotsDialog
import javax.inject.Inject
import javax.inject.Provider
import kotlin.math.roundToInt

class SectionFragment : Fragment(), SectionClickListener {


    private var mRecipe: IndicatorCategory? = null
    private lateinit var binding: SectionFragmentBinding
    private lateinit var viewModel: DashboardViewModel
    private lateinit var mAdapter: SectionAdapter
    private lateinit var dialog: AlertDialog

    @Inject
    lateinit var viewModelProvider: Provider<DashboardViewModel>
    private var categorieslist = mutableListOf<IndicatorCategoryResponse>()

    //    private var inProcessForm= mutableListOf<SubmitFormModel>()
    lateinit var masterModel: SubmitFormModel
    private var pendingSections = 0
    private var visit: Visits? = null

    var selectedHfTYpe: String = ""
    var selectedShift: String = ""
    var isNew: String = ""
    var sectionLoaded = 0
    var totalCategories = 0

    var selectedModule = ModuleToSave()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        (activity as MainActivity).mainComponent.inject(this)

        viewModel = ViewModelProvider(this, object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T =
                viewModelProvider.get() as T
        }).get(DashboardViewModel::class.java)

        dialog = SpotsDialog.Builder().setContext(requireContext()).build()

    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (!this::binding.isInitialized) {
            binding = SectionFragmentBinding.inflate(layoutInflater)
            mAdapter = SectionAdapter(this, requireContext())
            arguments?.let {
                masterModel = SectionFragmentArgs.fromBundle(it).masterform
                selectedHfTYpe = masterModel.visityType.toString()
                selectedShift = masterModel.facilityType.toString()
                isNew = SectionFragmentArgs.fromBundle(it).isNew.toString()
                visit = SectionFragmentArgs.fromBundle(it).visit
                selectedModule = SectionFragmentArgs.fromBundle(it).module!!
                binding.toolbarTitle.text = masterModel.facilityName

            }
        }
        binding.backButtonCustom?.setOnClickListener {
            requireActivity().onBackPressed()
        }

        binding.rolesRecycler.adapter = mAdapter
        val fieldHeight = resources?.getDimension(R.dimen.item_height_small)?.roundToInt()
        binding.rolesRecycler.setLayoutManager(object : GridLayoutManager(context, 3) {
            override fun checkLayoutParams(lp: RecyclerView.LayoutParams): Boolean {
                // force height of viewHolder here, this will override layout_height from xml
                if (fieldHeight != null) {
                    lp.width = width / 3
                    lp.height = fieldHeight
                }

                return true
            }
        })

        mAdapter.recipes = selectedModule.indicatorslist
        binding.syncForm.setOnClickListener {

            var allSurvey = true
            for (i in 0 until selectedModule.indicatorslist.size) {
                if(selectedModule.indicatorslist[i].isRequired!=null){
                    if(selectedModule.indicatorslist[i].isRequired==true){
                        if (selectedModule.indicatorslist[i].IsSubmitted == null) {
                            Log.d("Module Name ",selectedModule.indicatorslist[i].categoryName.toString())
                            allSurvey = false
                            break
                        }
                    }

                }

            }
            if (allSurvey) {
//                    if (isAttendanceRequireAndNotFilled()) {
//                        SweetAlertDialog(requireContext(), SweetAlertDialog.WARNING_TYPE)
//                            .setTitleText("Please Mark Attendance!")
//                            .setContentText("")
//                            .show()
//                    } else {
//                        masterModel.isSync = 1
//                        viewModel.updateSyncStatus(masterModel)
//                        SweetAlertDialog(requireContext(), SweetAlertDialog.SUCCESS_TYPE)
//                            .setTitleText("Data Save Successfully!")
//                            .show()
//
//                        requireActivity().onBackPressed()
//
//                        findNavController().navigate(SectionFragmentDirections.actionSectionFragmentToDashboardFragment())
//
//                    }

                for (i in 0 until masterModel.listofModules.size) {
                    if (masterModel.listofModules[i].moduleId == selectedModule.moduleId) {
                        masterModel.listofModules[i].isSubmited = true
                    }
                }
                selectedModule.isSubmited=true
                viewModel.updateSyncStatus(masterModel)
                SweetAlertDialog(requireContext(), SweetAlertDialog.SUCCESS_TYPE)
                    .setTitleText("Data Save Successfully!")
                    .show()

                requireActivity().onBackPressed()

            } else {
                SweetAlertDialog(requireContext(), SweetAlertDialog.WARNING_TYPE)
                    .setTitleText("Please Survey All Sections !")
                    .setContentText("")
                    .show()
            }
        }




        return binding.root
    }


    fun isAttendanceRequireAndNotFilled(): Boolean {
        for (j in 0 until categorieslist.size) {
            if (categorieslist[j].caegoryId == -1) {
                if (masterModel.attendanceList.isEmpty()) {
                    return true
                }
            }
        }
        return false
    }

    companion object {

        private val TAG = SectionFragment::class.java.name
    }

    fun loadSections(indicators: MutableList<IndicatorCategoryResponse>) {
        categorieslist.clear()
        categorieslist.addAll(indicators)
        val module = Prefs.getInt(AppConstant.SELECTEDMODULE, -1)
        var attendacneCategory = IndicatorCategoryResponse(-1, "Attendance", -1, module, -1)
        var FeedbackCategory = IndicatorCategoryResponse(-2, "Feedback", -1, module, -1)

        when (module) {
            1 -> {
                categorieslist.add(0, attendacneCategory)
                categorieslist.add(indicators.size + 1, FeedbackCategory)

            }
            12 -> {
                categorieslist.add(FeedbackCategory)
            }
            13 -> {
                categorieslist.add(FeedbackCategory)
            }
            14 -> {
                categorieslist.add(FeedbackCategory)
            }
        }

        mAdapter.recipes = categorieslist


//        for (i in 0 until masterModel.indicatorslist.size) {
//            for (j in 0 until categorieslist.size) {
//                if (categorieslist[j].caegoryId == masterModel.indicatorslist[i].caegoryId) {
//                    categorieslist[j].IsSubmitted = true
//                }
//            }
//
//        }

//        if (pendingSections == 0) {
//            masterModel.isSync = 1
//            viewModel.updateSyncStatus(masterModel)
//        }
    }

    override fun onClick(recipe: IndicatorCategoryResponse) {
//        recipe.roleId?.let { Prefs.edit().putInt(AppConstant.SELECTEDROLE, it) }?.apply()
//        findNavController().navigate(RolesFragmentDirections.actionRolesFragmentToDashboardFragment())

        //Attendance Screen
        if (recipe.IsSubmitted == null) {
            findNavController().navigate(
                SectionFragmentDirections.actionSectionFragmentToSurveyFragment(
                    masterModel,
                    visit,
                    recipe
                )
            )
        }
    }
}
