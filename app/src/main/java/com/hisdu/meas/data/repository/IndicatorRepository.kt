package com.hisdu.meas.data.repository

import com.hisdu.meas.data.model.*
import com.hisdu.meas.data.source.local.AppDatabase
import com.hisdu.meas.data.source.remote.APIResponse
import com.hisdu.meas.data.source.remote.APIService
import com.hisdu.meas.ui.Dashboard.AppDropdown
import com.hisdu.meas.ui.Indicators.SubmitFormModel
import com.hisdu.meas.ui.Visits.Visits
import com.hisdu.meas.ui.migration.MigrantsListResponse
import com.hisdu.meas.ui.migration.MigrationRouteModel
import com.hisdu.meas.ui.migration.MigrationSaveResponseModel
import com.hisdu.meas.ui.migration.SaveMigrantModel
import com.hisdu.meas.ui.revamp.EligibilityResponseModel
import com.hisdu.meas.ui.revamp.FacilitesResponseModel
import com.hisdu.meas.ui.revamp.ImagesResponseModel
import com.ozoned.customerapp.Utils.AppConstant
import com.pixplicity.easyprefs.library.Prefs
import com.zest.android.ui.login.HealthFacility
import com.zest.android.ui.login.UserModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import okhttp3.RequestBody
import javax.inject.Inject

class IndicatorRepository @Inject constructor(var apiService: APIService, var appDatabase: AppDatabase) {





    fun getUserById(userId: String): UserModel? {
        return appDatabase.userDao.loadOneByUserId(userId)
    }



   fun  getHealthFacilityTypes(): List<AppDropdown.DropdownData.HealthFacilityType>{

       return appDatabase.healthFacilityTypeDao.loadByid(Prefs.getInt(AppConstant.SELECTEDROLE,-1))
    }

    fun  getVisits(hfcode: String,shiftId:Int,userId:Int): MutableList<Visits>{

        return appDatabase.userVisitsDao.loadVisitByid(hfcode,shiftId,userId)
    }


    fun  getVisitById(visitid:Int): Visits{

        return appDatabase.userVisitsDao.loadByVisitId(visitid)
    }
    fun  getShifts(): List<AppDropdown.DropdownData.Shift>{

        return appDatabase.shiftsDao.loadAll()
    }

    fun  getShiftsById(hfTypeid:Int): List<AppDropdown.DropdownData.Shift>{

        return appDatabase.shiftsDao.loadByHfTypeID(hfTypeid)
    }
//    fun  getModules(): List<AppDropdown.DropdownData.Module>{
//
//        return appDatabase.modulesDao.loadAll()
//    }

    fun  getStatus(): List<AppDropdown.DropdownData.PresanceStatus>{

        return appDatabase.presenceStatusDao.loadAll()
    }

    fun  getDesignation(hftype:String,shiftId: String): List<AppDropdown.DropdownData.designation>{

        return appDatabase.designationDao.loadAll(hftype,shiftId)
    }

    fun loadHealthFacility(zoneId:Int,modename:String):MutableList<HealthFacility.HealthFacilityModel>{
        //Load BY zone id
        return appDatabase.healthFacilityDao.loadByZoneId(zoneId,modename)
    }


    fun loadHFLocation(locationCode:String,modename:String):MutableList<HealthFacility.HealthFacilityModel>{
        //Load BY zone id
        return appDatabase.healthFacilityDao.loadByLocation(locationCode,modename)
    }

    fun loadDistricts(divisionCode:String):MutableList<HealthFacility.HealthFacilityModel>{
        //Load BY zone id
        return appDatabase.healthFacilityDao.loadByDistrictBycode(divisionCode)
    }

    fun loadTehsil(districtcode:String):MutableList<HealthFacility.HealthFacilityModel>{
        return appDatabase.healthFacilityDao.loadByTehsilId(districtcode)
    }

//    fun getDropDownData(id:Int):AppDropdown.DropdownData {
//        return appDatabase.dropdownDao.loadModuleById(id)!!
//    }



    fun insertSaveForm(model: SubmitFormModel):Long {
        return appDatabase.submitFormDao.insert(model)
    }

    fun updateSaveForms(model: SubmitFormModel) {
        appDatabase.submitFormDao.update(model)
    }

    fun updateVisit(visit:Visits){
        appDatabase.userVisitsDao.update(visit)
    }

    fun getPendingRecord(facilityId:String):SubmitFormModel{
        return appDatabase.submitFormDao.getPendingRecord(Prefs.getInt(AppConstant.USERID,-1),facilityId)
    }

    fun getPendingRecordByModule(applicationTypeid:Int):MutableList<SubmitFormModel>{
        return appDatabase.submitFormDao.getPendingRecordByModule(Prefs.getInt(AppConstant.USERID,-1),applicationTypeid)
    }

    fun getPendingForId( moduleId:Int,applicationTypeid:Int,facilityType:String,facilty:String,visitType:String):SubmitFormModel{
        return appDatabase.submitFormDao.getPendingForId(Prefs.getInt(AppConstant.USERID,-1),moduleId,applicationTypeid,facilityType,facilty,visitType)
    }

    fun getSynForm(syncId:Int):MutableList<SubmitFormModel>{
        return appDatabase.submitFormDao.loadBySyncId(syncId,Prefs.getString(AppConstant.USERID,""))
    }

    fun getTehsil(
        districtcode: String,
        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
        onResponse: APIResponse<TehsilModel>
    ): io.reactivex.rxjava3.disposables.Disposable {
        return apiService.getTehsils(Prefs.getString(AppConstant.TOKEN,""),districtcode)
            .subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                onResponse.onSuccess(it)
            }, {
                onResponse.onError(it)
            }).also {
                compositeDisposable.add(it)
            }

    }


    fun getDistrict(
        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
        onResponse: APIResponse<DistrictModel>
    ): io.reactivex.rxjava3.disposables.Disposable {
        return apiService.getDistrict(Prefs.getString(AppConstant.TOKEN,""))
            .subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                onResponse.onSuccess(it)
            }, {
                onResponse.onError(it)
            }).also {
                compositeDisposable.add(it)
            }

    }

    fun getBHU(
        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
        tehsilCode:String,
        facilityType:String,
        onResponse: APIResponse<BHUModel>

    ): io.reactivex.rxjava3.disposables.Disposable {
        return apiService.getBHU(Prefs.getString(AppConstant.TOKEN,""),tehsilCode,facilityType)
            .subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                onResponse.onSuccess(it)
            }, {
                onResponse.onError(it)
            }).also {
                compositeDisposable.add(it)
            }

    }


    fun getVisitedFacilities(
        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
        onResponse: APIResponse<FacilitesResponseModel>

    ): io.reactivex.rxjava3.disposables.Disposable {
        return apiService.getVisitedFacilities(Prefs.getString(AppConstant.TOKEN,""))
            .subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                onResponse.onSuccess(it)
            }, {
                onResponse.onError(it)
            }).also {
                compositeDisposable.add(it)
            }

    }

    fun getBHUImages(
        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
        tehsilCode:String,
        onResponse: APIResponse<ImagesResponseModel>

    ): io.reactivex.rxjava3.disposables.Disposable {
        return apiService.getBHUImages(Prefs.getString(AppConstant.TOKEN,""),tehsilCode)
            .subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                onResponse.onSuccess(it)
            }, {
                onResponse.onError(it)
            }).also {
                compositeDisposable.add(it)
            }

    }



    fun getFacilityDetail(
        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
        tehsilCode:String,
        onResponse: APIResponse<AlreadyExisitHF>

    ): io.reactivex.rxjava3.disposables.Disposable {
        return apiService.getFacilityDetail(Prefs.getString(AppConstant.TOKEN,""),tehsilCode)
            .subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                onResponse.onSuccess(it)
            }, {
                onResponse.onError(it)
            }).also {
                compositeDisposable.add(it)
            }

    }

    fun deleteRecord(record:SubmitFormModel){
        return appDatabase.submitFormDao.delete(record)
    }
    companion object {

        private val TAG = IndicatorRepository::class.java.simpleName
    }


    fun SavecBHU(
        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
        input: RequestBody,
        onResponse: APIResponse<ResponseModel>
    ): io.reactivex.rxjava3.disposables.Disposable {
        return apiService.saveBHU( Prefs.getString(AppConstant.TOKEN, ""), input)
            .subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                onResponse.onSuccess(it)
            }, {
                onResponse.onError(it)
            }).also {
                compositeDisposable.add(it)
            }

    }

    fun SaveBed(
        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
        input: BedDetailsViewModel,
        onResponse: APIResponse<BedResponseModel>
    ): io.reactivex.rxjava3.disposables.Disposable {
        return apiService.saveBed( Prefs.getString(AppConstant.TOKEN, ""), input)
            .subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                onResponse.onSuccess(it)
            }, {
                onResponse.onError(it)
            }).also {
                compositeDisposable.add(it)
            }

    }


    fun SaveWheelChair(
        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
        input: WheelChairDetailsViewModel,
        onResponse: APIResponse<WheelChairResponseModel>
    ): io.reactivex.rxjava3.disposables.Disposable {
        return apiService.saveWheelChair( Prefs.getString(AppConstant.TOKEN, ""), input)
            .subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                onResponse.onSuccess(it)
            }, {
                onResponse.onError(it)
            }).also {
                compositeDisposable.add(it)
            }

    }




    fun migrationRoute(
        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
        onResponse: APIResponse<MigrationRouteModel>

    ): io.reactivex.rxjava3.disposables.Disposable {
        return apiService.migrationRoute(Prefs.getString(AppConstant.TOKEN, ""))
            .subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                onResponse.onSuccess(it)
            }, {
                onResponse.onError(it)
            }).also {
                compositeDisposable.add(it)
            }

    }

    fun saveMigration(
        saveModel: SaveMigrantModel,
        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
        onResponse: APIResponse<MigrationSaveResponseModel>

    ): io.reactivex.rxjava3.disposables.Disposable {
        return apiService.saveMigration(Prefs.getString(AppConstant.TOKEN, ""),saveModel)
            .subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                onResponse.onSuccess(it)
            }, {
                onResponse.onError(it)
            }).also {
                compositeDisposable.add(it)
            }

    }



}
