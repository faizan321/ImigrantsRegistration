package com.hisdu.meas.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00e8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 h2\u00020\u0001:\u0001hB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J$\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00192\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0016J$\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u001c2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J,\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020&0\u0016J$\u0010\'\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020(0\u0016J\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020$J\u001c\u0010.\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020/0\u0016J$\u00100\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002010\u0016J\f\u00102\u001a\b\u0012\u0004\u0012\u0002030*J.\u00104\u001a\u00020!2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002062\u0006\u0010%\u001a\u00020$2\u0006\u00108\u001a\u00020$2\u0006\u00109\u001a\u00020$J\u000e\u0010:\u001a\u00020!2\u0006\u0010;\u001a\u00020$J\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020!0=2\u0006\u00107\u001a\u000206J\f\u0010>\u001a\b\u0012\u0004\u0012\u00020?0*J\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020?0*2\u0006\u0010A\u001a\u000206J\f\u0010B\u001a\b\u0012\u0004\u0012\u00020C0*J\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020!0=2\u0006\u0010E\u001a\u000206J$\u0010F\u001a\u00020\u00102\u0006\u0010G\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020H0\u0016J\u0010\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010K\u001a\u00020$J\u000e\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u000206J\u001c\u0010O\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020P0\u0016J$\u0010Q\u001a\b\u0012\u0004\u0012\u00020M0=2\u0006\u0010R\u001a\u00020$2\u0006\u0010-\u001a\u0002062\u0006\u0010K\u001a\u000206J\u000e\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020!J\u0014\u0010V\u001a\b\u0012\u0004\u0012\u00020W0=2\u0006\u0010X\u001a\u00020$J\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u00020W0=2\u0006\u0010Z\u001a\u00020$2\u0006\u0010[\u001a\u00020$J\u001c\u0010\\\u001a\b\u0012\u0004\u0012\u00020W0=2\u0006\u0010]\u001a\u0002062\u0006\u0010[\u001a\u00020$J\u0014\u0010^\u001a\b\u0012\u0004\u0012\u00020W0=2\u0006\u0010G\u001a\u00020$J\u001c\u0010_\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020`0\u0016J$\u0010a\u001a\u00020\u00102\u0006\u0010b\u001a\u00020c2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020d0\u0016J\u000e\u0010e\u001a\u00020\u001f2\u0006\u0010U\u001a\u00020!J\u000e\u0010f\u001a\u00020\u001f2\u0006\u0010g\u001a\u00020MR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006i"}, d2 = {"Lcom/hisdu/meas/data/repository/IndicatorRepository;", "", "apiService", "Lcom/hisdu/meas/data/source/remote/APIService;", "appDatabase", "Lcom/hisdu/meas/data/source/local/AppDatabase;", "(Lcom/hisdu/meas/data/source/remote/APIService;Lcom/hisdu/meas/data/source/local/AppDatabase;)V", "getApiService", "()Lcom/hisdu/meas/data/source/remote/APIService;", "setApiService", "(Lcom/hisdu/meas/data/source/remote/APIService;)V", "getAppDatabase", "()Lcom/hisdu/meas/data/source/local/AppDatabase;", "setAppDatabase", "(Lcom/hisdu/meas/data/source/local/AppDatabase;)V", "SaveBed", "Lio/reactivex/rxjava3/disposables/Disposable;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "input", "Lcom/hisdu/meas/data/model/BedDetailsViewModel;", "onResponse", "Lcom/hisdu/meas/data/source/remote/APIResponse;", "Lcom/hisdu/meas/data/model/BedResponseModel;", "SaveWheelChair", "Lcom/hisdu/meas/data/model/WheelChairDetailsViewModel;", "Lcom/hisdu/meas/data/model/WheelChairResponseModel;", "SavecBHU", "Lokhttp3/RequestBody;", "Lcom/hisdu/meas/data/model/ResponseModel;", "deleteRecord", "", "record", "Lcom/hisdu/meas/ui/Indicators/SubmitFormModel;", "getBHU", "tehsilCode", "", "facilityType", "Lcom/hisdu/meas/data/model/BHUModel;", "getBHUImages", "Lcom/hisdu/meas/ui/revamp/ImagesResponseModel;", "getDesignation", "", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$designation;", "hftype", "shiftId", "getDistrict", "Lcom/hisdu/meas/data/model/DistrictModel;", "getFacilityDetail", "Lcom/hisdu/meas/data/model/AlreadyExisitHF;", "getHealthFacilityTypes", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$HealthFacilityType;", "getPendingForId", "moduleId", "", "applicationTypeid", "facilty", "visitType", "getPendingRecord", "facilityId", "getPendingRecordByModule", "", "getShifts", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$Shift;", "getShiftsById", "hfTypeid", "getStatus", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$PresanceStatus;", "getSynForm", "syncId", "getTehsil", "districtcode", "Lcom/hisdu/meas/data/model/TehsilModel;", "getUserById", "Lcom/zest/android/ui/login/UserModel;", "userId", "getVisitById", "Lcom/hisdu/meas/ui/Visits/Visits;", "visitid", "getVisitedFacilities", "Lcom/hisdu/meas/ui/revamp/FacilitesResponseModel;", "getVisits", "hfcode", "insertSaveForm", "", "model", "loadDistricts", "Lcom/zest/android/ui/login/HealthFacility$HealthFacilityModel;", "divisionCode", "loadHFLocation", "locationCode", "modename", "loadHealthFacility", "zoneId", "loadTehsil", "migrationRoute", "Lcom/hisdu/meas/ui/migration/MigrationRouteModel;", "saveMigration", "saveModel", "Lcom/hisdu/meas/ui/migration/SaveMigrantModel;", "Lcom/hisdu/meas/ui/migration/MigrationSaveResponseModel;", "updateSaveForms", "updateVisit", "visit", "Companion", "app_debug"})
public final class IndicatorRepository {
    @org.jetbrains.annotations.NotNull
    private com.hisdu.meas.data.source.remote.APIService apiService;
    @org.jetbrains.annotations.NotNull
    private com.hisdu.meas.data.source.local.AppDatabase appDatabase;
    @org.jetbrains.annotations.NotNull
    public static final com.hisdu.meas.data.repository.IndicatorRepository.Companion Companion = null;
    private static final java.lang.String TAG = null;
    
    @javax.inject.Inject
    public IndicatorRepository(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIService apiService, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.local.AppDatabase appDatabase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.data.source.remote.APIService getApiService() {
        return null;
    }
    
    public final void setApiService(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIService p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.data.source.local.AppDatabase getAppDatabase() {
        return null;
    }
    
    public final void setAppDatabase(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.local.AppDatabase p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.zest.android.ui.login.UserModel getUserById(@org.jetbrains.annotations.NotNull
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.HealthFacilityType> getHealthFacilityTypes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Visits.Visits> getVisits(@org.jetbrains.annotations.NotNull
    java.lang.String hfcode, int shiftId, int userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.Visits.Visits getVisitById(int visitid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Shift> getShifts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Shift> getShiftsById(int hfTypeid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.PresanceStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.designation> getDesignation(@org.jetbrains.annotations.NotNull
    java.lang.String hftype, @org.jetbrains.annotations.NotNull
    java.lang.String shiftId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel> loadHealthFacility(int zoneId, @org.jetbrains.annotations.NotNull
    java.lang.String modename) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel> loadHFLocation(@org.jetbrains.annotations.NotNull
    java.lang.String locationCode, @org.jetbrains.annotations.NotNull
    java.lang.String modename) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel> loadDistricts(@org.jetbrains.annotations.NotNull
    java.lang.String divisionCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel> loadTehsil(@org.jetbrains.annotations.NotNull
    java.lang.String districtcode) {
        return null;
    }
    
    public final long insertSaveForm(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.SubmitFormModel model) {
        return 0L;
    }
    
    public final void updateSaveForms(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.SubmitFormModel model) {
    }
    
    public final void updateVisit(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Visits.Visits visit) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.Indicators.SubmitFormModel getPendingRecord(@org.jetbrains.annotations.NotNull
    java.lang.String facilityId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Indicators.SubmitFormModel> getPendingRecordByModule(int applicationTypeid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.Indicators.SubmitFormModel getPendingForId(int moduleId, int applicationTypeid, @org.jetbrains.annotations.NotNull
    java.lang.String facilityType, @org.jetbrains.annotations.NotNull
    java.lang.String facilty, @org.jetbrains.annotations.NotNull
    java.lang.String visitType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Indicators.SubmitFormModel> getSynForm(int syncId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable getTehsil(@org.jetbrains.annotations.NotNull
    java.lang.String districtcode, @org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.hisdu.meas.data.model.TehsilModel> onResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable getDistrict(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.hisdu.meas.data.model.DistrictModel> onResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable getBHU(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    java.lang.String tehsilCode, @org.jetbrains.annotations.NotNull
    java.lang.String facilityType, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.hisdu.meas.data.model.BHUModel> onResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable getVisitedFacilities(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.hisdu.meas.ui.revamp.FacilitesResponseModel> onResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable getBHUImages(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    java.lang.String tehsilCode, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.hisdu.meas.ui.revamp.ImagesResponseModel> onResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable getFacilityDetail(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    java.lang.String tehsilCode, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.hisdu.meas.data.model.AlreadyExisitHF> onResponse) {
        return null;
    }
    
    public final void deleteRecord(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.SubmitFormModel record) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable SavecBHU(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    okhttp3.RequestBody input, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.hisdu.meas.data.model.ResponseModel> onResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable SaveBed(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.BedDetailsViewModel input, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.hisdu.meas.data.model.BedResponseModel> onResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable SaveWheelChair(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.WheelChairDetailsViewModel input, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.hisdu.meas.data.model.WheelChairResponseModel> onResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable migrationRoute(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.hisdu.meas.ui.migration.MigrationRouteModel> onResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable saveMigration(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.migration.SaveMigrantModel saveModel, @org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.hisdu.meas.ui.migration.MigrationSaveResponseModel> onResponse) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/hisdu/meas/data/repository/IndicatorRepository$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}