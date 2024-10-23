package com.hisdu.meas.ui.Attendance
import android.app.Dialog
import android.os.Bundle
import android.view.*
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import cn.pedant.SweetAlert.SweetAlertDialog
import com.hisdu.meas.R
import com.hisdu.meas.data.model.Recipe
import com.hisdu.meas.databinding.AddNewStaffBinding
import com.hisdu.meas.databinding.AttendanceFragmentBinding
import com.hisdu.meas.ui.Dashboard.DashboardViewModel
import com.hisdu.meas.ui.main.MainActivity
import com.hisdu.meas.util.KeyboardUtils
import com.ozoned.customerapp.Utils.AppConstant
import com.pixplicity.easyprefs.library.Prefs
import java.lang.Exception
import javax.inject.Inject
import javax.inject.Provider
import android.widget.Toast

import android.app.ListActivity
import android.content.Intent
import android.graphics.Color
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewmodel.CreationExtras

import androidx.recyclerview.widget.RecyclerView

import androidx.recyclerview.widget.ItemTouchHelper
import com.hisdu.meas.ui.Dashboard.AppDropdown
import com.hisdu.meas.ui.Indicators.SubmitFormModel
import com.hisdu.meas.ui.survey.SurveyFragmentArgs
import com.zest.android.ui.login.LoginActivity
import com.hisdu.meas.util.SwipeHelper
import com.hisdu.meas.util.SwipeHelper.UnderlayButton
import com.hisdu.meas.util.SwipeHelper.UnderlayButtonClickListener


class AttendanceFragment : Fragment() {

    private var mRecipe: Recipe? = null
    private lateinit var binding: AttendanceFragmentBinding
    private lateinit var viewModel: DashboardViewModel
    private var mAdapter = AttendanceAdapter()
    private var selectedStatus: String = ""
    private var selectedDesignation: String = ""
    var selectedHfTYpe: String? = null
    var shiftid: String? = null
    var statusModellist = mutableListOf<AppDropdown.DropdownData.PresanceStatus>()
    val designationList = mutableListOf<AppDropdown.DropdownData.designation>()
    lateinit var masterModel: SubmitFormModel

    @Inject
    lateinit var viewModelProvider: Provider<DashboardViewModel>
    val attendanceList: MutableList<StaffModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        (activity as MainActivity).mainComponent.inject(this)

        viewModel = ViewModelProvider(this, object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T =
                viewModelProvider.get() as T
        }).get(DashboardViewModel::class.java)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (!this::binding.isInitialized) {


            binding = AttendanceFragmentBinding.inflate(layoutInflater)
            binding.staffRecycler.adapter = mAdapter

//            val bundle = this.arguments
//            if (bundle != null) {
//                selectedHfTYpe = bundle.getString("hftype", "")
//                shiftid= bundle.getString("shiftid", "")
//            }

            arguments?.let {
//                selectedHfTYpe = AttendanceFragmentArgs.fromBundle(it).hftype
//                shiftid = AttendanceFragmentArgs.fromBundle(it).shift
                masterModel = AttendanceFragmentArgs.fromBundle(it).masterform

                if(masterModel.attendanceList.isNotEmpty()){
                    attendanceList.addAll(masterModel.attendanceList)
                    mAdapter.recipes=attendanceList
                }
            }

            viewModel.getPresenceStatus()
            masterModel.visityType?.let { masterModel.facilityType?.let { it1 ->
                viewModel.getDesignations(it1,
                    it
                )
            } }


            viewModel.presenceStatusList.observe(viewLifecycleOwner, Observer {
                statusModellist.clear()
                statusModellist.addAll(it)
            })

            viewModel.designationList.observe(viewLifecycleOwner, Observer {
                designationList.clear()
                designationList.addAll(it)
            })


            binding.saveAttendance.setOnClickListener {
                if(attendanceList.isNullOrEmpty()){
                    showErrorMessage("Please Mark Attendance")
                }else{
//                    for(i in 0 until  masterModel.indicatorslist.size){
//                        if( masterModel.indicatorslist[i].caegoryId==-1){
//                            masterModel.indicatorslist[i].IsSubmitted=true
//                            break
//                        }
//                    }
                    viewModel.updateSyncStatus(masterModel)
                    requireActivity().onBackPressed()
                }
            }

            var swipeHelper: SwipeHelper = object : SwipeHelper(requireContext(),    binding.staffRecycler) {
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
                        deleteDialog(position)
                    })
                    underlayButtons.add(UnderlayButton(
                        "Edit",
                        0,
                        Color.parseColor("#FF9502")
                    ) {
                        addNewMember(inflater,true,attendanceList[viewHolder.adapterPosition],viewHolder.adapterPosition)

                    })
                }
            }



            var userid = Prefs.getString(AppConstant.USERID, "")
            viewModel.getUser(userid)

            binding.addNewPerson.setOnClickListener {
                addNewMember(inflater,false,null,0)
            }

            binding.backButtonCustom.setOnClickListener {
                (requireActivity().onBackPressed())
            }
        }

//        val simpleItemTouchCallback: ItemTouchHelper.SimpleCallback = object :
//            ItemTouchHelper.SimpleCallback(
//                0,
//                ItemTouchHelper.LEFT
//            ) {
//            override fun onMove(
//                recyclerView: RecyclerView,
//                viewHolder: RecyclerView.ViewHolder,
//                target: RecyclerView.ViewHolder
//            ): Boolean {
////                Toast.makeText(requireContext(), "on Move", Toast.LENGTH_SHORT).show()
//                return false
//            }
//
//            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, swipeDir: Int) {
////                Toast.makeText(requireContext(), "on Swiped ", Toast.LENGTH_SHORT).show()
//                //Remove swiped item from list and notify the RecyclerViewF
//                val position = viewHolder.adapterPosition
//
//                deleteDialog(position)
//            }
//        }
//
//        val itemTouchHelper = ItemTouchHelper(simpleItemTouchCallback)
//        itemTouchHelper.attachToRecyclerView(binding.staffRecycler)

        return binding.root
    }

    fun deleteDialog(position:Int){
        SweetAlertDialog(requireContext(), SweetAlertDialog.WARNING_TYPE)
            .setTitleText("Are you sure?")
            .setContentText("Are you sure you want to Delete!")
            .setConfirmText("Yes, Delete!")
            .setCancelText("No")
            .setCancelClickListener { sDialog ->
                sDialog.dismissWithAnimation()
                mAdapter.recipes = attendanceList
            }
            .setConfirmClickListener { sDialog ->
                sDialog.dismissWithAnimation()
                attendanceList.removeAt(position)
//                mAdapter.notifyItemRemoved(position)
                mAdapter.recipes = attendanceList
            }
            .show()
    }


    fun validateStaff(name: String, cnic: String, mobile: String): Boolean {


        if (name.isNullOrEmpty()) {
            showErrorMessage("Pleas Enter Name")
            return false
        }
//        if (cnic.isNullOrEmpty()) {
//            showErrorMessage("Pleas Enter CNIC")
//            return false
//        }
//        if (cnic.length<13) {
//            showErrorMessage("Pleas Enter Valid CNIC")
//            return false
//        }
//        if (mobile.isNullOrEmpty()) {
//            showErrorMessage("Pleas Enter Mobile Number")
//            return false
//        }
//        if (mobile.length<11) {
//            showErrorMessage("Pleas Enter Valid Mobile Number")
//            return false
//        }
        if (selectedDesignation.isNullOrEmpty()) {
            showErrorMessage("Please Select Designation")
            return false
        }
        if (selectedStatus.isNullOrEmpty()) {
            showErrorMessage("Please Select Presence Status")
            return false
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

        private val TAG = AttendanceFragment::class.java.name
    }


    private fun addNewMember(inflater: LayoutInflater,isEdit:Boolean,member:StaffModel?,position: Int) {
        var designationTitle = ""
        var statusTitle = ""
        val binding: AddNewStaffBinding = AddNewStaffBinding.inflate(inflater)
        val dialog = Dialog(requireContext())
        var statuslist = mutableListOf<String>()

        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(binding.root)
        dialog.window?.setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        dialog.window?.attributes?.windowAnimations = R.style.DialogAnimation

        var designations = mutableListOf<String>()
        designations.add(0, "Select Designation")
        for (i in 0 until designationList.size) {
            designationList[i].DesignationName?.let { designations.add(it) }
        }
        val designationadapter = ArrayAdapter(requireActivity(), android.R.layout.simple_spinner_dropdown_item, designations)
        binding.designation.adapter = designationadapter
        binding.designation.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View,
                i: Int,
                l: Long
            ) {
                try {
                    if (i > 0) {
                        selectedDesignation = designationList[i - 1].DesignationId.toString()
                        designationTitle = designationList[i - 1].DesignationName.toString()
                    } else {
                        selectedDesignation = ""
                        designationTitle = ""
                    }
                } catch (e: Exception) {

                }

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        statuslist.add(0, "Select Status")
        for (i in 0 until statusModellist.size) {
            statusModellist[i].ProfileName?.let { statuslist.add(it) }
        }
        val epiCentersAdapter = ArrayAdapter(requireActivity(), android.R.layout.simple_spinner_dropdown_item, statuslist)
        binding.presenceStatus.adapter = epiCentersAdapter
        binding.presenceStatus.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View,
                i: Int,
                l: Long
            ) {
                try {
                    if (i > 0) {
                        selectedStatus = statusModellist[i - 1].ProfileId.toString()
                        statusTitle = statusModellist[i - 1].ProfileName.toString()
                    } else {
                        selectedStatus = ""
                        statusTitle = ""
                    }
                } catch (e: Exception) {

                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        if(isEdit){
            binding.name.setText(member?.name)
            binding.cnic.setText(member?.cnic)
            binding.mobile.setText(member?.mobile)
            for(i in 0 until designationList.size){
                if(designationList[i].DesignationId== member?.designationId?.let {
                        Integer.parseInt(
                            it
                        )
                    }){
                    binding.designation.setSelection(i+1)
                }
            }

            for(j in 0 until statusModellist.size){
                if(statusModellist[j].ProfileId== member?.presenceStatusId?.let { Integer.parseInt(it) }){
                    binding.presenceStatus.setSelection(j+1)
                }
            }
        }

        binding.saveStaff.setOnClickListener {
            KeyboardUtils.hideKeyboard(requireActivity())
            val name = binding.name.text.toString()
            val cnic = binding.cnic.getText(true).toString()
            val mobile = binding.mobile.getText(true).toString()
            if (validateStaff(name, cnic, mobile)) {

                val member = StaffModel(
                    attendanceList.size + 1,
                    name,
                    designationTitle,
                    mobile,
                    cnic,
                    statusTitle,
                    selectedDesignation,
                    selectedStatus
                )

                if(isEdit){
                    attendanceList.removeAt(position)
                    attendanceList.add(member)
                }else{
                    attendanceList.add(member)
                }
                mAdapter.recipes = attendanceList

                masterModel.attendanceList.clear()
                masterModel.attendanceList.addAll(attendanceList)

                viewModel.updateSyncStatus(masterModel)

                binding.addStaffLayout.visibility = View.GONE
                binding.name.setText("")
                binding.cnic.setText("")
                binding.mobile.setText("")

                dialog.dismiss()
            }
        }
        binding.cancelStaff.setOnClickListener {
            KeyboardUtils.hideKeyboard(requireActivity())
            binding.addStaffLayout.visibility = View.GONE
            binding.name.setText("")
            binding.cnic.setText("")
            binding.mobile.setText("")
            dialog.dismiss()


        }
        dialog.show()

    }



}
