package com.hisdu.meas.data.repository

import android.util.Log
import com.hisdu.meas.data.model.AlreadyExisitHF
import com.hisdu.meas.data.model.AppVersionModel
import com.hisdu.meas.data.model.BHUModel
import com.hisdu.meas.data.model.NewAppversion
import com.hisdu.meas.data.source.local.AppDatabase
import com.hisdu.meas.data.source.remote.APIResponse
import com.hisdu.meas.data.source.remote.APIService
import com.hisdu.meas.ui.Dashboard.AppDropdown
import com.hisdu.meas.ui.Indicators.*
import com.hisdu.meas.ui.Visits.VisitModel
import com.hisdu.meas.ui.Visits.Visits
import com.hisdu.meas.ui.migration.MigrantsListResponse
import com.hisdu.meas.ui.migration.MigrationRouteModel
import com.hisdu.meas.ui.revamp.EligibilityResponseModel
import com.hisdu.meas.ui.revamp.FacilitesResponseModel
import com.ozoned.customerapp.Utils.AppConstant
import com.pixplicity.easyprefs.library.Prefs
import com.zest.android.ui.login.*
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import javax.inject.Inject

class UserRepository @Inject constructor(var apiService: APIService, var appDatabase: AppDatabase) {


    fun insertUser(user: UserModel) {
        appDatabase.userDao.insert(user)
    }


    fun loadAllUsers(): MutableList<UserModel> {
        return appDatabase.userDao.loadAll()
    }

    fun getUserById(userId: String): UserModel? {
        return appDatabase.userDao.loadOneByUserId(userId)
    }

    fun deleteFavorite(recipe: UserModel) {
        appDatabase.userDao.delete(recipe)
    }


    //Health Faclitiy
    fun insertHealthFacility(facility: List<HealthFacility.HealthFacilityModel>) {
        appDatabase.healthFacilityDao.insertAll(facility)
    }


    fun insertHealthFacilityType(data: List<AppDropdown.DropdownData.HealthFacilityType>) {
        appDatabase.healthFacilityTypeDao.insertAll(data)
    }

    fun insertShifts(data: List<AppDropdown.DropdownData.Shift>) {
        appDatabase.shiftsDao.insertAll(data)
    }

    fun insertModules(data: List<AppDropdown.DropdownData.Module>) {
        appDatabase.modulesDao.insertAll(data)
    }

    fun insertProfile(data: List<AppDropdown.DropdownData.PresanceStatus>) {
        appDatabase.presenceStatusDao.insertAll(data)
    }

    fun insertdesignation(data: List<AppDropdown.DropdownData.designation>) {
        appDatabase.designationDao.insertAll(data)
    }


    fun getHealthFacilityTypes(): List<AppDropdown.DropdownData.HealthFacilityType> {

        return appDatabase.healthFacilityTypeDao.loadAll()
    }

    fun getShifts(): List<AppDropdown.DropdownData.Shift> {

        return appDatabase.shiftsDao.loadAll()
    }

    fun getModules(): List<AppDropdown.DropdownData.Module> {

        return appDatabase.modulesDao.loadAll()
    }

    fun getModulesById(applicationTypeid: Int): List<AppDropdown.DropdownData.Module> {

        return appDatabase.modulesDao.loadById(applicationTypeid)
    }

    fun getDesignation(
        hftype: String,
        shiftId: String
    ): List<AppDropdown.DropdownData.designation> {

        return appDatabase.designationDao.loadAll(hftype, shiftId)
    }


    fun getSynForm(syncId: Int): MutableList<SubmitFormModel> {
        return appDatabase.submitFormDao.loadBySyncId(syncId, Prefs.getString(AppConstant.USERID, ""))
//        return appDatabase.submitFormDao.loadBySyncId(syncId,101)
    }


    fun updateVisit(visit: Visits) {
        appDatabase.userVisitsDao.update(visit)
    }


    fun updateSyncStatus(user: SubmitFormModel) {
        appDatabase.submitFormDao.update(user)
    }

    fun getAllVisits(): MutableList<Visits> {

        return appDatabase.userVisitsDao.loadAll()
    }

    fun getStatus(): List<AppDropdown.DropdownData.PresanceStatus> {

        return appDatabase.presenceStatusDao.loadAll()
    }


    fun insertSaveForm(model: SubmitFormModel) {
        appDatabase.submitFormDao.insert(model)
    }

    fun login(
        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
        input: LoginRequest,
        onResponse: APIResponse<UserModel>
    ): io.reactivex.rxjava3.disposables.Disposable {
        return apiService.login(input.userName,input.password,input.grant_type)
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


//        fun getIndicators(
//        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
//        input: IndicatorRequest,
//        onResponse: APIResponse<IndicatorModel>
//    ): io.reactivex.rxjava3.disposables.Disposable {
//        return apiService.getAllIndicators(input)
//            .subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe({
//                onResponse.onSuccess(it)
//            }, {
//                onResponse.onError(it)
//            }).also {
//                compositeDisposable.add(it)
//            }
//
//    }

    fun getIndicators(
        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
        input: List<IndicatorRequest>,
        onResponse: APIResponse<Any>
    ): io.reactivex.rxjava3.disposables.Disposable {
        val requests = ArrayList<Observable<*>>()

        for(i in 0 until input.size){
            requests.add(apiService.getAllIndicators(input[i]))
        }

        return  Observable
            .zip(requests) {
                // do something with those results and emit new event
//                Any() // <-- Here we emit just new empty Object(), but you can emit anything
                Log.d("DATA RECEIVED",it.toString())
                onResponse.onSuccess(it)
            }
            .subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            // Will be triggered if all requests will end successfully (4xx and 5xx also are successful requests too)
            .subscribe({
                //Do something on successful completion of all requests
                Log.d("APISUCEESS","AllData Retrived")

            }) {
                //Do something on error completion of requests
                Log.d("Error","AllData Retrived")
                onResponse.onError(it)
            }

//        return apiService.getAllIndicators(input)
//            .subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe({
//                onResponse.onSuccess(it)
//            }, {
//                onResponse.onError(it)
//            }).also {
//                compositeDisposable.add(it)
//            }

    }

    fun SavecForm(
        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
        input: SubmitFormModel,
        onResponse: APIResponse<IndicatorModel>
    ): io.reactivex.rxjava3.disposables.Disposable {
        return apiService.saveForm("Bearer " + Prefs.getString(AppConstant.TOKEN, ""), input)
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


    fun getHealthFacilities(
        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
        onResponse: APIResponse<HealthFacility>
    ): io.reactivex.rxjava3.disposables.Disposable {
        return apiService.getHealthFacilities()
            .subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                onResponse.onSuccess(it)
//              insertHealthFacility(it)
            }, {
                onResponse.onError(it)
            }).also {
                compositeDisposable.add(it)
            }

    }

    fun getZones(
        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
        onResponse: APIResponse<ZoneModel>
    ): io.reactivex.rxjava3.disposables.Disposable {
        return apiService.getZone()
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


    fun getDropDownData(
        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
        onResponse: APIResponse<AppDropdown>
    ): io.reactivex.rxjava3.disposables.Disposable {
        return apiService.getGetAppDropdownData()
            .subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                onResponse.onSuccess(it)
//              insertHealthFacility(it)
            }, {
                onResponse.onError(it)
            }).also {
                compositeDisposable.add(it)
            }

    }

    companion object {

        private val TAG = UserRepository::class.java.simpleName
    }

    fun getVisitById(visitid: Int): Visits {

        return appDatabase.userVisitsDao.loadByVisitId(visitid)
    }

    fun getUserVisits(
        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
        onResponse: APIResponse<VisitModel>
    ): io.reactivex.rxjava3.disposables.Disposable {
        return apiService.getUserVisits(Prefs.getString(AppConstant.TOKEN, ""))
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


//    fun getAppVersion(
//        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
//        onResponse: APIResponse<NewAppversion>
//    ): io.reactivex.rxjava3.disposables.Disposable {
//        return apiService.getAppVersion()
//            .subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe({
//                onResponse.onSuccess(it)
//            }, {
//                onResponse.onError(it)
//            }).also {
//                compositeDisposable.add(it)
//            }
//
//    }



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

    fun loadSyncByHF(syncId: Int, facilityId: String): MutableList<SubmitFormModel> {
        return appDatabase.submitFormDao.loadSyncByHF(
            syncId,
            Prefs.getInt(AppConstant.USERID, -1),
            facilityId
        )
    }

    fun getAppVersion(
        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
        onResponse: APIResponse<AppVersionModel>
    ): io.reactivex.rxjava3.disposables.Disposable {
        return apiService.getAppVersion("https://hisduapps.pshealthpunjab.gov.pk/api/AppStatus/GetAppSettingwithID/133")
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
    fun checkEligibility(
        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
        tehsilCode:String,
        onResponse: APIResponse<EligibilityResponseModel>

    ): io.reactivex.rxjava3.disposables.Disposable {
        return apiService.checkEligibility(Prefs.getString(AppConstant.TOKEN,""),tehsilCode)
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

    fun getMigrantsRecord(
        compositeDisposable: io.reactivex.rxjava3.disposables.CompositeDisposable,
        onResponse: APIResponse<MigrantsListResponse>): io.reactivex.rxjava3.disposables.Disposable {
        return apiService.getMigrantsRecord(Prefs.getString(AppConstant.TOKEN, ""))
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
