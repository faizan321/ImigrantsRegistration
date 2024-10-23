package com.hisdu.meas.ui.Dashboard

import android.content.Context
import android.text.TextUtils
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import cn.pedant.SweetAlert.SweetAlertDialog
import com.google.gson.Gson
import com.hisdu.meas.BuildConfig
import com.hisdu.meas.data.model.AppVersionModel
import com.hisdu.meas.data.model.BHUModel
import com.hisdu.meas.data.model.NewAppversion
import com.hisdu.meas.data.model.Recipe
import com.hisdu.meas.data.repository.UserRepository
import com.hisdu.meas.data.source.remote.APIResponse
import com.hisdu.meas.ui.Indicators.Indicator
import com.hisdu.meas.ui.Indicators.IndicatorCategory
import com.hisdu.meas.ui.Indicators.IndicatorModel
import com.hisdu.meas.ui.Indicators.SubmitFormModel
import com.hisdu.meas.ui.Visits.VisitModel
import com.hisdu.meas.ui.Visits.Visits
import com.hisdu.meas.ui.migration.MigrantsListResponse
import com.hisdu.meas.ui.revamp.EligibilityResponseModel
import com.hisdu.meas.ui.revamp.FacilitesResponseModel
import com.hisdu.meas.util.serverError
import com.hisdu.meas.util.serverErrorThrowable
import com.orhanobut.logger.Logger
import com.ozoned.customerapp.Utils.AppConstant
import com.pixplicity.easyprefs.library.Prefs
import com.zest.android.ui.login.UserModel
import io.reactivex.rxjava3.disposables.CompositeDisposable
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import javax.inject.Inject

class DashboardViewModel @Inject constructor(private val recipeRepository: UserRepository) :
    ViewModel() {
    val allIndicators = MutableLiveData<MutableList<Indicator>>()

    //    val dropdowndata= MutableLiveData<AppDropdown.DropdownData>()
    val user = MutableLiveData<UserModel>()
    val applicationModule = MutableLiveData<List<AppDropdown.DropdownData.Module>>()
    val designationList = MutableLiveData<List<AppDropdown.DropdownData.designation>>()
    val presenceStatusList = MutableLiveData<List<AppDropdown.DropdownData.PresanceStatus>>()
    val syncForm = MutableLiveData<List<SubmitFormModel>>()
    val unsyncForm = MutableLiveData<List<SubmitFormModel>>()
    val pendingForm = MutableLiveData<List<SubmitFormModel>>()
    var newversion = ""
    val uiEventLiveData = MutableLiveData<Int>()
    val visit = MutableLiveData<Visits>()
    var appVersion= MutableLiveData<AppVersionModel.GetAppStatus?>()

    val visitsList = MutableLiveData<List<Visits>>()
    val inprocessForm = MutableLiveData<List<SubmitFormModel>>()
    val allCategories = MutableLiveData<MutableList<IndicatorCategory>>()

    val faciliteslist = MutableLiveData<List<FacilitesResponseModel.Facility>>()

    val eligibilityModel = MutableLiveData<EligibilityResponseModel>()

    val migrationsList = MutableLiveData<MutableList<MigrantsListResponse.MigrantRecord>>()

    fun onClick(item: Int) {
        uiEventLiveData.value = item // can be predefined values
    }

    val isLoading = MutableLiveData(false)
    private val compositeDisposable = CompositeDisposable()


//    fun getDropDownData(){
//      setLoading(true)
//        dropdowndata.value= recipeRepository.getDropDownData(0)
//    }


    fun clearAllTables(){
        GlobalScope.launch(Dispatchers.Main) {
            try {
                async(Dispatchers.IO) {

                    recipeRepository.appDatabase.userDao.deleteAllData()
                    recipeRepository.appDatabase.shiftsDao.deleteAllData()
                    recipeRepository.appDatabase.recipeDao.deleteAllData()
                    recipeRepository.appDatabase.presenceStatusDao.deleteAllData()
                    recipeRepository.appDatabase.modulesDao.deleteAllData()
                    recipeRepository.appDatabase.healthFacilityTypeDao.deleteAllData()
                    recipeRepository.appDatabase.healthFacilityDao.deleteAllData()
                    recipeRepository.appDatabase.designationDao.deleteAllData()
                    recipeRepository.appDatabase.userVisitsDao.deleteAllData()

                }.await()
            } catch (e: Exception) {

            }
        }

    }

    fun getVisitedFacilities() {
        setLoading(true)
        recipeRepository.getVisitedFacilities(compositeDisposable, object : APIResponse<FacilitesResponseModel> {
            override fun onSuccess(result: FacilitesResponseModel?) {
                faciliteslist.postValue(result?.UserDoneList!!)
                setLoading(false)
            }

            override fun onError(t: Throwable) {
                setLoading(false)
            }

        })
    }

    fun getApplicationModule() {
        applicationModule.value = recipeRepository.getModules( )
    }
    fun getApplicationModuleById(applicationTypeid: Int) {
        applicationModule.value = recipeRepository.getModulesById(applicationTypeid )
    }

    fun getDesignations(hftype:String,shiftId:String) {
        designationList.value = recipeRepository.getDesignation(hftype,shiftId)
    }

    fun getPresenceStatus() {
        presenceStatusList.value = recipeRepository.getStatus()
    }

    fun getUser(userid: String) {

        user.value = recipeRepository.getUserById(userid)
    }
    fun updateVisit(visit: Visits){
        recipeRepository.updateVisit(visit)
    }
    fun getAllVisits() {
        visitsList.value = recipeRepository.getAllVisits()
    }

    fun getSynForm(syncId: Int,context: Context) {
        when (syncId) {
            0 -> {
//                unsyncForm.value = recipeRepository.getSynForm(syncId)
            }
            1 -> {
//                syncForm.value = recipeRepository.getSynForm(syncId)
            }
            2->{
//                pendingForm.value=recipeRepository.getSynForm(syncId)
            }
            3 -> {
//                submitForm.value = recipeRepository.getSynForm(1)
                GlobalScope.launch(Dispatchers.Main) {
                    try {
                        var synclist = mutableListOf<SubmitFormModel>()
                        async(Dispatchers.IO) {
//                            synclist = recipeRepository.getSynForm(1)
                        }.await()

                        if(synclist.isNotEmpty()){
                            for (i in synclist.indices) {
                                val gson = Gson()
                                val json = gson.toJson(synclist[i])
                                Log.d("SubmittedModel", json.toString())
                                Logger.json(json)
                                submitForm(synclist[i], context)
                            }
                        }else{
                            SweetAlertDialog(context, SweetAlertDialog.ERROR_TYPE)
                                .setTitleText("Data Already Sync")
                                .show()
                        }


                    } catch (e: Exception) {

                    }
                }

            }

        }
    }

    private fun generateRandomChar(): Char {
        return ('a' + (Math.random() * ('z' - 'a' + 1)).toInt())
    }


    fun setLoading(isVisible: Boolean) {
        this.isLoading.value = isVisible
    }

    fun loadTags(recipe: Recipe): Array<String>? {
        val tags = recipe.tag
        if (TextUtils.isEmpty(tags)) {
            return null
        }
        return tags?.split(",".toRegex())?.dropLastWhile { it.isEmpty() }?.toTypedArray()
    }

    fun dispose() {
        if (compositeDisposable.isDisposed) compositeDisposable.dispose()
    }





//    fun getAppVersion(context: Context) {
////        setLoading(true)
//        recipeRepository.getAppVersion(
//            compositeDisposable,
//            object : APIResponse<AppVersionModel> {
//                override fun onSuccess(result: AppVersionModel?) {
//                    setLoading(false)
//                    val version: String = BuildConfig.VERSION_NAME
//                    val checklistprimary = Prefs.getString(AppConstant.ChecklistPrimary, "")
//                    val checklistSecondary = Prefs.getString(AppConstant.ChecklistSceondary, "")
//                    val checkListMEAS = Prefs.getString(AppConstant.ChecklistMACS, "")
//
//                    if (version != result?.list?.version) {
//                        newversion = result?.list?.version.toString()
//                        val pDialog = SweetAlertDialog(context, SweetAlertDialog.NORMAL_TYPE)
//
//                        pDialog.titleText = "Version Update (${result?.list?.version})"
//                        pDialog.contentText = "Please Update App to new Version"
//                        pDialog.confirmText = "Update"
//                        pDialog.setCancelable(false)
//                        pDialog.setConfirmClickListener { sDialog ->
//                            onClick(1)
//
//                        }
//                        pDialog.show()
//                    }
//                    if (checklistprimary != result?.list?.checklistPrimary) {
//                        GlobalScope.launch(Dispatchers.Main) {
//                            try {
////                                async(Dispatchers.IO) {
////                                    result?.list?.let {
////                                        recipeRepository.appDatabase.categoryDao.clearTable()
////                                        recipeRepository.appDatabase.indicatorDao.clearTable()
////                                    }
////                                }.await()
//                                Prefs.edit().putString(
//                                    AppConstant.ChecklistPrimary,
//                                    result?.list?.checklistPrimary
//                                ).apply()
//                                var userid = Prefs.getString(AppConstant.USERID, "")
//                                getUser(userid)
//                            } catch (e: Exception) {
//
//                            }
//                        }
//                    }
//
//                }
//
//                override fun onError(t: Throwable) {
////                    setLoading(false)
//                    t.printStackTrace()
//                }
//            })
//    }

//    fun getAppVersion(context: Context) {
////        setLoading(true)
//        recipeRepository.getAppVersion(
//            compositeDisposable,
//            object : APIResponse<AppVersion> {
//                override fun onSuccess(result: AppVersion?) {
//                    setLoading(false)
//                    val version: String = BuildConfig.VERSION_NAME
//                    val checklistprimary = Prefs.getString(AppConstant.ChecklistPrimary, "")
//                    val checklistSecondary = Prefs.getString(AppConstant.ChecklistSceondary, "")
//                    val checkListMEAS = Prefs.getString(AppConstant.ChecklistMACS, "")
//
//                    if (version != result?.list?.version) {
//                        newversion = result?.list?.version.toString()
//                        val pDialog = SweetAlertDialog(context, SweetAlertDialog.NORMAL_TYPE)
//
//                        pDialog.titleText = "Version Update (${result?.list?.version})"
//                        pDialog.contentText = "Please Update App to new Version"
//                        pDialog.confirmText = "Update"
//                        pDialog.setCancelable(false)
//                        pDialog.setConfirmClickListener { sDialog ->
//                            onClick(1)
//
//                        }
//                        pDialog.show()
//                    }
//                    if (checklistprimary != result?.list?.checklistPrimary) {
//                        GlobalScope.launch(Dispatchers.Main) {
//                            try {
////                                async(Dispatchers.IO) {
////                                    result?.list?.let {
////                                        recipeRepository.appDatabase.categoryDao.clearTable()
////                                        recipeRepository.appDatabase.indicatorDao.clearTable()
////                                    }
////                                }.await()
//                                Prefs.edit().putString(
//                                    AppConstant.ChecklistPrimary,
//                                    result?.list?.checklistPrimary
//                                ).apply()
//                                var userid = Prefs.getInt(AppConstant.USERID, 0)
//                                if (userid != 0) {
//                                    getUser(userid)
//                                }
//                            } catch (e: Exception) {
//
//                            }
//                        }
//                    }
//
//                }
//
//                override fun onError(t: Throwable) {
////                    setLoading(false)
//                    t.printStackTrace()
//                }
//            })
//    }


    fun submitForm(savemodel: SubmitFormModel, context: Context) {
        setLoading(true)
        recipeRepository.SavecForm(
            compositeDisposable,
            savemodel,
            object : APIResponse<IndicatorModel> {
                override fun onSuccess(result: IndicatorModel?) {

                    if (result?.statusCode == 200) {
                        savemodel.isSync = 0
                        recipeRepository.updateSyncStatus(savemodel)
//                        getSynForm(0,context)
//                        getSynForm(1,context)
                    } else {
                        serverError(result?.message.toString(), context)
                    }
                    setLoading(false)
                }

                override fun onError(t: Throwable) {

                    serverErrorThrowable(t, context)
                    t.printStackTrace()
                    setLoading(false)
                }
            })
    }

    companion object {
        private val TAG = DashboardViewModel::class.java.name
    }


    fun loadVisitById(visitId:Int){
        visit.value=recipeRepository.getVisitById(visitId)
    }
    fun getUserVisits(context: Context) {
        setLoading(true)
        recipeRepository.getUserVisits(
            compositeDisposable,
            object : APIResponse<VisitModel> {
                override fun onSuccess(result: VisitModel?) {
                    setLoading(false)
                    if (result?.statusCode == 200) {
                        GlobalScope.launch(Dispatchers.Main) {
                            try {
                                async(Dispatchers.IO) {
                                    result?.list?.let {
                                        recipeRepository.appDatabase.userVisitsDao.insertAll(it)
                                    }
                                }.await()
                                getAllVisits()
                            } catch (e: Exception) {

                            }
                        }
                    }else {
                        serverError(result?.message.toString(), context)
                    }
                }

                override fun onError(t: Throwable) {
//                    serverErrorThrowable(t, context)
//                    setLoading(false)
                    t.printStackTrace()
                }
            })
    }


    fun getinProcessForms(facilityId:String){
        inprocessForm.value=recipeRepository.loadSyncByHF(2,facilityId)
    }

    fun insertSaveForm(model: SubmitFormModel){
        recipeRepository.insertSaveForm(model)
    }

    fun updateSyncStatus(savemodel: SubmitFormModel) {
        recipeRepository.updateSyncStatus(savemodel)
    }

    fun checkAppVersion(context:Context) {
        setLoading(true)
        recipeRepository.getAppVersion(compositeDisposable, object : APIResponse<AppVersionModel> {
            override fun onSuccess(result: AppVersionModel?) {
                if (result != null){
                    if(result.Err.equals("N")){
                        appVersion.postValue(result.getAppStatus)
                    }
                }
                setLoading(false)
            }
            override fun onError(t: Throwable) {
                setLoading(false)
                t.printStackTrace()
                serverErrorThrowable(t, context)
            }
        })
    }

    fun checkEligibility(context:Context) {
        setLoading(true)
        recipeRepository.checkEligibility(compositeDisposable,Prefs.getString(AppConstant.HFCode,""), object : APIResponse<EligibilityResponseModel> {
            override fun onSuccess(result: EligibilityResponseModel?) {
                if (result != null){
                    eligibilityModel.postValue(result)
                }
                setLoading(false)
            }
            override fun onError(t: Throwable) {
                setLoading(false)
                t.printStackTrace()
                serverErrorThrowable(t, context)
            }
        })
    }


    fun getMigrantsRecord(context:Context) {
        setLoading(true)
        recipeRepository.getMigrantsRecord(compositeDisposable, object : APIResponse<MigrantsListResponse> {
            override fun onSuccess(result: MigrantsListResponse?) {
                if (result != null){
                    if(result.err.equals("N")){
                        migrationsList.postValue(result.res)
                    }
                }
                setLoading(false)
            }
            override fun onError(t: Throwable) {
                setLoading(false)
                t.printStackTrace()
                serverErrorThrowable(t, context)
            }
        })
    }

}
