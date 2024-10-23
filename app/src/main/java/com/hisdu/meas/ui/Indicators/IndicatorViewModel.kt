package com.zest.android.ui.login

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hisdu.meas.data.model.*
import com.hisdu.meas.data.repository.IndicatorRepository
import com.hisdu.meas.data.source.remote.APIResponse
import com.hisdu.meas.ui.Dashboard.AppDropdown
import com.hisdu.meas.ui.Indicators.*
import com.hisdu.meas.ui.Visits.Visits
import com.hisdu.meas.ui.migration.MigrationRouteModel
import com.hisdu.meas.ui.migration.MigrationSaveResponseModel
import com.hisdu.meas.ui.migration.SaveMigrantModel
import com.hisdu.meas.ui.revamp.ImagesResponseModel
import com.hisdu.meas.util.serverError
import com.hisdu.meas.util.serverErrorThrowable
import com.ozoned.customerapp.Utils.AppConstant
import com.pixplicity.easyprefs.library.Prefs
import io.reactivex.rxjava3.disposables.CompositeDisposable
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import okhttp3.RequestBody
import javax.inject.Inject


class IndicatorViewModel @Inject constructor(private val indicatorRepository: IndicatorRepository) :
    ViewModel() {


    val isLoading = MutableLiveData<Boolean>()
    val allDataLoaded = MutableLiveData<Boolean>()
    val allCategories = MutableLiveData<MutableList<IndicatorCategory>>()
    val allIndicators = MutableLiveData<MutableList<Indicator>>()

    val healthFacilities = MutableLiveData<MutableList<HealthFacility.HealthFacilityModel>>()
    val getFacilityBylocationCode =
        MutableLiveData<MutableList<HealthFacility.HealthFacilityModel>>()
    val districtList = MutableLiveData<MutableList<HealthFacility.HealthFacilityModel>>()
    val TehsilList = MutableLiveData<MutableList<HealthFacility.HealthFacilityModel>>()
    val designationList = MutableLiveData<List<AppDropdown.DropdownData.designation>>()
    val allDivision = MutableLiveData<List<HealthFacility.HealthFacilityModel>>()
    val zoneslist = MutableLiveData<List<ZoneModel.Zone>>()
    val inprocessForm = MutableLiveData<List<SubmitFormModel>>()
    val inprocessFormByModule = MutableLiveData<List<SubmitFormModel>>()
    val inprocessFormForId = MutableLiveData<SubmitFormModel>()

    val districtlist = MutableLiveData<MutableList<Districtlists>>()

    val tehsillist = MutableLiveData<MutableList<Districtlists>>()
    val bhuList = MutableLiveData<MutableList<Bhulists>>()
    val facilitydetail = MutableLiveData<AlreadyExist>()

    val imagesList= MutableLiveData<MutableList<ImagesResponseModel.BHUImageModel>>()

    val migrationRouteList= MutableLiveData<MutableList<MigrationRouteModel.MigrationRoute>>()
    val migrationSave= MutableLiveData<MigrationSaveResponseModel>()

    private val userData = MutableLiveData<UserModel>()
    val currentUse = MutableLiveData<UserModel>()

    //    val testList=  MutableLiveData<UserModel>()
    var pendingRecord = MutableLiveData<SubmitFormModel>()

    private val compositeDisposable = CompositeDisposable()
//    val dropdownData= MutableLiveData<AppDropdown.DropdownData>()

    val healthFacilityTye = MutableLiveData<List<AppDropdown.DropdownData.HealthFacilityType>>()
    val visits = MutableLiveData<List<Visits>>()

    val shiftsList = MutableLiveData<List<AppDropdown.DropdownData.Shift>>()

    var dataSubmited = MutableLiveData<ResponseModel>()

    var bedSubmitted = MutableLiveData<BedResponseModel>()
    var wheelChairSubmitted = MutableLiveData<WheelChairResponseModel>()


    private fun showLoading(isVisible: Boolean) {
        isLoading.postValue(isVisible)
    }

    private fun allDataLoaded(isLoaded: Boolean) {
        allDataLoaded.value = isLoaded
    }

    fun getUser(userid: String) {

        currentUse.value = indicatorRepository.getUserById(userid)
    }


    fun dispose() {
        if (compositeDisposable.isDisposed) {
            compositeDisposable.dispose()
        }
    }

    fun getHealthFacilityType() {
        healthFacilityTye.value = indicatorRepository.getHealthFacilityTypes()
    }

    fun getShifts() {
        shiftsList.value = indicatorRepository.getShifts()
    }

    fun getShiftsById(hfTypeId: Int) {
        shiftsList.value = indicatorRepository.getShiftsById(hfTypeId)
    }


    fun getVisit(hfcode: String, shiftId: Int, userId: Int) {
        visits.value = indicatorRepository.getVisits(hfcode, shiftId, userId)
    }

    fun getVisitById(visitid: Int) {
//        visits.value=indicatorRepository.getVisitById(visitid)
    }


    fun loadHealthFacility(zoneid: Int, modename: String) {
        healthFacilities.value = indicatorRepository.loadHealthFacility(zoneid, modename)
    }

    fun loadHFLocation(locationCode: String, modename: String) {
        healthFacilities.value = indicatorRepository.loadHFLocation(locationCode, modename)
    }

    fun loadByDistrictId(divisioncode: String) {
        districtList.value = indicatorRepository.loadDistricts(divisioncode)
    }

    fun loadTehsils(divisioncode: String) {
        TehsilList.value = indicatorRepository.loadTehsil(divisioncode)
    }

    fun insertSaveForm(model: SubmitFormModel): Long {
        return indicatorRepository.insertSaveForm(model)
    }

    fun updateSaveForm(model: SubmitFormModel) {
        indicatorRepository.updateSaveForms(model)
    }

    fun updateVisit(visit: Visits) {
        indicatorRepository.updateVisit(visit)
    }

    fun getDesignations(hftype: String, shiftId: String) {
        designationList.value = indicatorRepository.getDesignation(hftype, shiftId)
    }

    fun getPendingRecord(facilityId: String) {
        pendingRecord.value = indicatorRepository.getPendingRecord(facilityId)
    }

    fun getinProcessForms() {
        inprocessForm.value = indicatorRepository.getSynForm(2)
    }

    fun getinProcessFormsByModule(applicationTypeid: Int) {
        inprocessFormByModule.value =
            indicatorRepository.getPendingRecordByModule(applicationTypeid)
    }

    fun getPendingForId(
        moduleId: Int,
        applicationTypeid: Int,
        facilityType: String,
        facilty: String,
        visitType: String
    ) {
        inprocessFormForId.value = indicatorRepository.getPendingForId(
            moduleId,
            applicationTypeid,
            facilityType,
            facilty,
            visitType
        )
    }

        fun submitForm(savemodel: RequestBody, context: Context) {
        showLoading(true)
        indicatorRepository.SavecBHU(
            compositeDisposable,
            savemodel,
            object : APIResponse<ResponseModel> {
                override fun onSuccess(result: ResponseModel?) {

                    if(result!=null){
                        if(result.StatusCode ==200){
                            dataSubmited.postValue(result!!)
                        }
                    }


                    showLoading(false)

                }

                override fun onError(t: Throwable) {

                    serverErrorThrowable(t, context)
                    t.printStackTrace()
                    showLoading(false)
                }
            })
    }

    fun SubmitBed(savemodel: BedDetailsViewModel, context: Context) {
        showLoading(true)
        indicatorRepository.SaveBed(
            compositeDisposable,
            savemodel,
            object : APIResponse<BedResponseModel> {
                override fun onSuccess(result: BedResponseModel?) {

//                    if(result?.res==10){
//
//                    }
                    bedSubmitted.postValue(result!!)
                    showLoading(false)

                }

                override fun onError(t: Throwable) {

                    serverErrorThrowable(t, context)
                    t.printStackTrace()
                    showLoading(false)
                }
            })
    }

    fun SubmitWheelChair(savemodel: WheelChairDetailsViewModel, context: Context) {
        showLoading(true)
        indicatorRepository.SaveWheelChair(
            compositeDisposable,
            savemodel,
            object : APIResponse<WheelChairResponseModel> {
                override fun onSuccess(result: WheelChairResponseModel?) {


                    wheelChairSubmitted.postValue(result!!)
                    showLoading(false)

                }

                override fun onError(t: Throwable) {

                    serverErrorThrowable(t, context)
                    t.printStackTrace()
                    showLoading(false)
                }
            })
    }

    fun deleteRecord(record: SubmitFormModel) {

        GlobalScope.launch(Dispatchers.Main) {
            try {
                async(Dispatchers.IO) {
                    indicatorRepository.deleteRecord(record)
                }.await()
                getinProcessFormsByModule(Prefs.getInt(AppConstant.SELECTEDROLE, -1))

            } catch (e: Exception) {

            }
        }


    }

    fun getDistrict(context: Context) {
        showLoading(true)
        indicatorRepository.getDistrict(compositeDisposable, object : APIResponse<DistrictModel> {
            override fun onSuccess(result: DistrictModel?) {
                districtlist.value = result?.districtlists!!
                showLoading(false)
//                Log.d("Error",result.toString())
            }

            override fun onError(t: Throwable) {
                showLoading(false)
                Log.d("Error", t.message.toString())
            }

        })
    }

    fun getTehsil(context: Context,districtCode: String) {
        showLoading(true)
        indicatorRepository.getTehsil(districtCode,compositeDisposable, object : APIResponse<TehsilModel> {
            override fun onSuccess(result: TehsilModel?) {
                tehsillist.value = result?.districtlists!!
                showLoading(false)
//                Log.d("Error",result.toString())
            }

            override fun onError(t: Throwable) {
                showLoading(false)
                Log.d("Error", t.message.toString())
            }

        })
    }

    fun getBHU(context: Context, tehsilCode: String,facilityType:String) {
        showLoading(true)
        indicatorRepository.getBHU(compositeDisposable, tehsilCode,facilityType, object : APIResponse<BHUModel> {
            override fun onSuccess(result: BHUModel?) {
                bhuList.value = result?.bhulists
                showLoading(false)
            }

            override fun onError(t: Throwable) {
                showLoading(false)
            }

        })
    }

    fun getBHUImages(context: Context, tehsilCode: String) {
        showLoading(true)
        indicatorRepository.getBHUImages(compositeDisposable, tehsilCode, object : APIResponse<ImagesResponseModel> {
            override fun onSuccess(result: ImagesResponseModel?) {
                try {
                    val filterlist= result?.imageList?.filter { it.ShowInHIS == true }
                    imagesList.postValue(filterlist as MutableList<ImagesResponseModel.BHUImageModel>?)
                }catch (e:Exception){

                }

                showLoading(false)
            }

            override fun onError(t: Throwable) {
                showLoading(false)
            }

        })
    }

    fun getFacilityDetail(context: Context, facilityCode: String) {
        showLoading(true)
        indicatorRepository.getFacilityDetail(compositeDisposable, facilityCode, object : APIResponse<AlreadyExisitHF> {
            override fun onSuccess(result: AlreadyExisitHF?) {
                facilitydetail.value = result?.AlreadyExist
                showLoading(false)
            }

            override fun onError(t: Throwable) {
                showLoading(false)
            }

        })
    }

    fun migrationRoute() {
        showLoading(true)
        indicatorRepository.migrationRoute(compositeDisposable, object : APIResponse<MigrationRouteModel> {
            override fun onSuccess(result: MigrationRouteModel?) {
                try {
                    migrationRouteList.postValue(result?.res)
                }catch (e:Exception){

                }

                showLoading(false)
            }

            override fun onError(t: Throwable) {
                showLoading(false)
            }

        })
    }


    fun saveMigration(saveModel:SaveMigrantModel) {
        showLoading(true)
        indicatorRepository.saveMigration(saveModel,compositeDisposable, object : APIResponse<MigrationSaveResponseModel> {
            override fun onSuccess(result: MigrationSaveResponseModel?) {
                try {
                    if(result?.err=="N"){
                        migrationSave.postValue(result)
                    }
                }catch (e:Exception){

                }

                showLoading(false)
            }

            override fun onError(t: Throwable) {
                showLoading(false)
            }

        })
    }

}