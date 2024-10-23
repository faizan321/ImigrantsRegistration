package com.hisdu.meas.ui.roles

import android.app.AlertDialog
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.*
import androidx.constraintlayout.widget.ConstraintLayout
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
import com.hisdu.meas.databinding.ModuleFragmentBinding
import com.hisdu.meas.databinding.SectionFragmentBinding
import com.hisdu.meas.ui.Dashboard.*
import com.hisdu.meas.ui.Dashboard.DashboardModuleAdapter
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

class ModuleFragment : Fragment(), ModuleClickListener {


    private var mRecipe: IndicatorCategory? = null
    private lateinit var binding: ModuleFragmentBinding
    private lateinit var viewModel: DashboardViewModel
    private lateinit var mAdapter: DashboardModuleAdapter
    private lateinit var dialog: AlertDialog

    @Inject
    lateinit var viewModelProvider: Provider<DashboardViewModel>

    //    private var inProcessForm= mutableListOf<SubmitFormModel>()
    lateinit var masterModel: SubmitFormModel
    private var pendingSections = 0
    private var visit: Visits? = null

    var selectedHfTYpe: String = ""
    var selectedShift: String = ""
    var isNew: String = ""
    var sectionLoaded = 0
    private var currentVisit:Visits?=null


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
            binding = ModuleFragmentBinding.inflate(layoutInflater)
            mAdapter = DashboardModuleAdapter(this, requireActivity())
            arguments?.let {


                masterModel = ModuleFragmentArgs.fromBundle(it).masterform
                selectedHfTYpe = masterModel.visityType.toString()
                selectedShift = masterModel.facilityType.toString()
                isNew = ModuleFragmentArgs.fromBundle(it).isNew.toString()
                visit = ModuleFragmentArgs.fromBundle(it).visit

                binding.toolbarTitle.text = masterModel.facilityName

            }
            binding.backButtonCustom?.setOnClickListener {
                requireActivity().onBackPressed()
            }

            masterModel.visitId?.let { viewModel.loadVisitById(it) }

            val fieldHeight = resources?.getDimension(R.dimen.item_height_small)?.roundToInt()
            binding.formsButtonRecycler.setLayoutManager(object : GridLayoutManager(context, 3) {
                override fun checkLayoutParams(lp: RecyclerView.LayoutParams): Boolean {
                    // force height of viewHolder here, this will override layout_height from xml
                    if (fieldHeight != null) {
                        lp.width = width / 3
                        lp.height = fieldHeight
                    }

                    return true
                }
            })


            var userid = Prefs.getInt(AppConstant.USERID, 0)



            loadCategoriesAndIndicators()
            viewModel.applicationModule.observe(viewLifecycleOwner, Observer {

                var assignedModuel = mutableListOf<AppDropdown.DropdownData.Module>()
                for (j in 0 until it?.size!!) {
                    if (it[j].applicationTypeId == userid) {
                        assignedModuel.add(it[j])
                    }

                    var module = ModuleToSave()
                    module.moduleName = it[j].moduleName
                    module.moduleId = it[j].moduleId
                    module.applicationTypeId = it[j].applicationTypeId
                    module.isRequired = it[j].IsRequired

                    masterModel.listofModules.add(module)

                    it[j].applicationTypeId?.let { it1 ->
                        it[j].moduleId?.let { it2 ->
                        }
                    }

                }


                var finalModuelList = mutableListOf<ModuleToSave>()

                if (masterModel.applicationTypeid == 1) {

                    if (masterModel.facilityStatus == true) {
                        finalModuelList.add(attendanceModuel())
                        finalModuelList.addAll(masterModel.listofModules)
                        finalModuelList.add(feedbacKModule())
                    } else {
                        finalModuelList.add(feedbacKModule())
                    }
                } else if (masterModel.applicationTypeid == 2) {
//                    if (masterModel.facilityStatus == true) {
//                        finalModuelList.addAll(masterModel.listofModules)
//                    } else {
//                        finalModuelList.add(feedbacKModule())
//                    }
                    finalModuelList.addAll(masterModel.listofModules)
                    finalModuelList.add(feedbacKModule())
                }





                binding.formsButtonRecycler.adapter = mAdapter

                mAdapter.recipes = finalModuelList
                viewModel.updateSyncStatus(masterModel)

            })

            viewModel.visit.observe(viewLifecycleOwner, Observer {
                if(it!=null){
                    currentVisit=it
                }
            })
            binding.syncForm.setOnClickListener {
//                if (masterModel.attendanceList.isNullOrEmpty()) {
//                    SweetAlertDialog(requireContext(), SweetAlertDialog.WARNING_TYPE)
//                        .setTitleText("Please Mark Attendance!")
//                        .setContentText("")
//                        .show()
//                } else
                if (masterModel.isFeedbackSubmited == null) {
                    SweetAlertDialog(requireContext(), SweetAlertDialog.WARNING_TYPE)
                        .setTitleText("Please Submit Feedback!")
                        .setContentText("")
                        .show()
                } else {
                    var allsubmited = true
                    for (moudle in masterModel.listofModules) {
                        if (moudle.isRequired != null) {
                            if (moudle.isRequired == true) {
                                if (moudle.isSubmited == null) {
                                    SweetAlertDialog(
                                        requireContext(),
                                        SweetAlertDialog.WARNING_TYPE
                                    )
                                        .setTitleText("Please Survey All Sections !")
                                        .setContentText("")
                                        .show()
                                    allsubmited = false
                                    break
                                }
                            }
                        }

                    }

                    if (allsubmited) {
                        masterModel.isSync = 1

                        if (currentVisit != null) {
                            currentVisit?.isVisited = true
                            currentVisit?.let { viewModel.updateVisit(it) }
                        }
                        viewModel.updateSyncStatus(masterModel)
                        SweetAlertDialog(requireContext(), SweetAlertDialog.SUCCESS_TYPE)
                            .setTitleText("Data Save Successfully!")
                            .show()

                        requireActivity().onBackPressed()
                    }


                }
            }

        }
        if (isNew == "true") {
            var roleid = Prefs.getInt(AppConstant.SELECTEDROLE, 0)
            viewModel.getApplicationModuleById(roleid)
        } else {

            try {
                for (i in 0 until masterModel.listofModules.size) {
                    if (masterModel.listofModules[i].moduleId == -1 || masterModel.listofModules[i].moduleId == -2) {
                        masterModel.listofModules.removeAt(i)
                    }
                }
            } catch (e: Exception) {
            }


            var finalModuelList = masterModel.listofModules
            if (masterModel.applicationTypeid == 1) {

                if (masterModel.facilityStatus == true) {
                    finalModuelList.add(0, attendanceModuel())

                    finalModuelList.add(masterModel.listofModules.size, feedbacKModule())
                } else {
                    finalModuelList.clear()
                    finalModuelList.add(feedbacKModule())
                }
            } else if (masterModel.applicationTypeid == 2) {
//                if (masterModel.facilityStatus == true) {
//
//                } else {
//                    finalModuelList.clear()
//                    finalModuelList.add(feedbacKModule())
//                }
//                finalModuelList.clear()
                finalModuelList.add(feedbacKModule())
            }


//            finalModuelList.add(0, attendanceModuel())
//            finalModuelList.add(finalModuelList.size, feedbacKModule())
            binding.formsButtonRecycler.adapter = mAdapter
            mAdapter.recipes = finalModuelList
        }

        return binding.root
    }


    fun attendanceModuel(): ModuleToSave {
        var attendance = ModuleToSave()
        attendance.moduleId = -1
        attendance.moduleName = "Attendance"

        return attendance
    }

    fun feedbacKModule(): ModuleToSave {
        var attendance = ModuleToSave()
        attendance.moduleId = -2

        attendance.isRequired = true
        attendance.moduleName = "Feedback"
        if (masterModel.isFeedbackSubmited != null) {
            attendance.isSubmited = true
        }
        return attendance
    }


    fun loadCategoriesAndIndicators() {
        viewModel.allCategories.observe(viewLifecycleOwner, Observer {


            for (j in 0 until masterModel.listofModules.size) {

                for (i in 0 until it.size) {

                    if (it[i].moduleId == masterModel.listofModules[j].moduleId) {
                        var categoryResponse = IndicatorCategoryResponse()
                        categoryResponse.caegoryId = it[i].caegoryId
                        categoryResponse.categoryName = it[i].categoryName
                        categoryResponse.applicationType = it[i].applicationType
                        categoryResponse.moduleId = it[i].moduleId
                        categoryResponse.SequenceNo = it[i].SequenceNo
                        categoryResponse.isRequired = it[i].IsRequired

                        masterModel.listofModules[j].indicatorslist.add(categoryResponse)
                        
                    }
                }

            }

        })


        viewModel.allIndicators.observe(viewLifecycleOwner, Observer {

            sectionLoaded += 1
            for (k in 0 until masterModel.listofModules.size) {
                for (j in 0 until masterModel.listofModules[k].indicatorslist.size) {
//                    for (i in 0 until it.size) {
//                        if (masterModel.listofModules[k].indicatorslist[j].caegoryId == it[i].CategoryId) {
//
//                        }
//                    }
                    if (it.size > 0) {
                        if (masterModel.listofModules[k].indicatorslist[j].caegoryId == it[0].CategoryId) {
                            if (it.size > 0) {
                                masterModel.listofModules[k].indicatorslist[j].indicators?.addAll(
                                    getIndicator(it)
                                )
                            }

                        }
                    }

                }
            }



            dialog.dismiss()

            viewModel.updateSyncStatus(masterModel)


        })
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

    override fun onClick(recipe: ModuleToSave) {
        isNew = "false"
        try {
            if (recipe.moduleId == -1) {
                findNavController().navigate(
                    ModuleFragmentDirections.actionModuleFragmentToAttendanceFragment(
                        masterModel,
                        recipe.moduleName
                    )
                )
            } else if (recipe.moduleId == -2) {
                findNavController().navigate(
                    ModuleFragmentDirections.actionModuleFragmentToFeedbackFragment(
                        masterModel,

                        recipe.moduleName, null
                    )
                )
            } else {

                if (recipe.isSubmited == null) {
                    recipe.moduleId?.let {
                        Prefs.edit().putInt(AppConstant.SELECTEDMODULE, it).apply()
                    }
                    findNavController().navigate(
                        ModuleFragmentDirections.actionModuleFragmentToSectionFragment(
                            masterModel,
                            visit,
                            recipe,
                            "true"
                        )
                    )
                }

            }
        } catch (e: Exception) {

        }

    }

}
