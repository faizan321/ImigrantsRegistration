package com.hisdu.meas.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00c8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ^2\u00020\u0001:\u0001^B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J$\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0016J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!J\u001c\u0010#\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020$0\u0016J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&2\u0006\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001aJ\u001c\u0010*\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020+0\u0016J\u001c\u0010,\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020-0\u0016J\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0&J*\u00100\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002010&2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016J\u001c\u00102\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002030\u0016J\f\u00104\u001a\b\u0012\u0004\u0012\u0002050&J\u0014\u00106\u001a\b\u0012\u0004\u0012\u0002050&2\u0006\u00107\u001a\u000208J\f\u00109\u001a\b\u0012\u0004\u0012\u00020:0&J\f\u0010;\u001a\b\u0012\u0004\u0012\u00020<0&J\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00140!2\u0006\u0010>\u001a\u000208J\u0010\u0010?\u001a\u0004\u0018\u00010\u001f2\u0006\u0010@\u001a\u00020\u001aJ\u001c\u0010A\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020B0\u0016J\u000e\u0010C\u001a\u00020\"2\u0006\u0010D\u001a\u000208J\u001c\u0010E\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020F0\u0016J\u001c\u0010G\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020H0\u0016J\u0014\u0010I\u001a\u00020\u001d2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020K0&J\u0014\u0010L\u001a\u00020\u001d2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020/0&J\u0014\u0010N\u001a\u00020\u001d2\f\u0010M\u001a\b\u0012\u0004\u0012\u0002050&J\u0014\u0010O\u001a\u00020\u001d2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020<0&J\u000e\u0010P\u001a\u00020\u001d2\u0006\u0010Q\u001a\u00020\u0014J\u0014\u0010R\u001a\u00020\u001d2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020:0&J\u000e\u0010S\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020\u001fJ\u0014\u0010U\u001a\u00020\u001d2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\'0&J\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u001f0!J\u001c\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00140!2\u0006\u0010>\u001a\u0002082\u0006\u0010X\u001a\u00020\u001aJ$\u0010Y\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020Z2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0016J\u000e\u0010[\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020\u0014J\u000e\u0010\\\u001a\u00020\u001d2\u0006\u0010]\u001a\u00020\"R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006_"}, d2 = {"Lcom/hisdu/meas/data/repository/UserRepository;", "", "apiService", "Lcom/hisdu/meas/data/source/remote/APIService;", "appDatabase", "Lcom/hisdu/meas/data/source/local/AppDatabase;", "(Lcom/hisdu/meas/data/source/remote/APIService;Lcom/hisdu/meas/data/source/local/AppDatabase;)V", "getApiService", "()Lcom/hisdu/meas/data/source/remote/APIService;", "setApiService", "(Lcom/hisdu/meas/data/source/remote/APIService;)V", "getAppDatabase", "()Lcom/hisdu/meas/data/source/local/AppDatabase;", "setAppDatabase", "(Lcom/hisdu/meas/data/source/local/AppDatabase;)V", "SavecForm", "Lio/reactivex/rxjava3/disposables/Disposable;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "input", "Lcom/hisdu/meas/ui/Indicators/SubmitFormModel;", "onResponse", "Lcom/hisdu/meas/data/source/remote/APIResponse;", "Lcom/hisdu/meas/ui/Indicators/IndicatorModel;", "checkEligibility", "tehsilCode", "", "Lcom/hisdu/meas/ui/revamp/EligibilityResponseModel;", "deleteFavorite", "", "recipe", "Lcom/zest/android/ui/login/UserModel;", "getAllVisits", "", "Lcom/hisdu/meas/ui/Visits/Visits;", "getAppVersion", "Lcom/hisdu/meas/data/model/AppVersionModel;", "getDesignation", "", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$designation;", "hftype", "shiftId", "getDropDownData", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown;", "getHealthFacilities", "Lcom/zest/android/ui/login/HealthFacility;", "getHealthFacilityTypes", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$HealthFacilityType;", "getIndicators", "Lcom/zest/android/ui/login/IndicatorRequest;", "getMigrantsRecord", "Lcom/hisdu/meas/ui/migration/MigrantsListResponse;", "getModules", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$Module;", "getModulesById", "applicationTypeid", "", "getShifts", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$Shift;", "getStatus", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$PresanceStatus;", "getSynForm", "syncId", "getUserById", "userId", "getUserVisits", "Lcom/hisdu/meas/ui/Visits/VisitModel;", "getVisitById", "visitid", "getVisitedFacilities", "Lcom/hisdu/meas/ui/revamp/FacilitesResponseModel;", "getZones", "Lcom/hisdu/meas/ui/Indicators/ZoneModel;", "insertHealthFacility", "facility", "Lcom/zest/android/ui/login/HealthFacility$HealthFacilityModel;", "insertHealthFacilityType", "data", "insertModules", "insertProfile", "insertSaveForm", "model", "insertShifts", "insertUser", "user", "insertdesignation", "loadAllUsers", "loadSyncByHF", "facilityId", "login", "Lcom/zest/android/ui/login/LoginRequest;", "updateSyncStatus", "updateVisit", "visit", "Companion", "app_debug"})
public final class UserRepository {
    @org.jetbrains.annotations.NotNull
    private com.hisdu.meas.data.source.remote.APIService apiService;
    @org.jetbrains.annotations.NotNull
    private com.hisdu.meas.data.source.local.AppDatabase appDatabase;
    @org.jetbrains.annotations.NotNull
    public static final com.hisdu.meas.data.repository.UserRepository.Companion Companion = null;
    private static final java.lang.String TAG = null;
    
    @javax.inject.Inject
    public UserRepository(@org.jetbrains.annotations.NotNull
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
    
    public final void insertUser(@org.jetbrains.annotations.NotNull
    com.zest.android.ui.login.UserModel user) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.zest.android.ui.login.UserModel> loadAllUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.zest.android.ui.login.UserModel getUserById(@org.jetbrains.annotations.NotNull
    java.lang.String userId) {
        return null;
    }
    
    public final void deleteFavorite(@org.jetbrains.annotations.NotNull
    com.zest.android.ui.login.UserModel recipe) {
    }
    
    public final void insertHealthFacility(@org.jetbrains.annotations.NotNull
    java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel> facility) {
    }
    
    public final void insertHealthFacilityType(@org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.HealthFacilityType> data) {
    }
    
    public final void insertShifts(@org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Shift> data) {
    }
    
    public final void insertModules(@org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Module> data) {
    }
    
    public final void insertProfile(@org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.PresanceStatus> data) {
    }
    
    public final void insertdesignation(@org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.designation> data) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.HealthFacilityType> getHealthFacilityTypes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Shift> getShifts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Module> getModules() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Module> getModulesById(int applicationTypeid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.designation> getDesignation(@org.jetbrains.annotations.NotNull
    java.lang.String hftype, @org.jetbrains.annotations.NotNull
    java.lang.String shiftId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Indicators.SubmitFormModel> getSynForm(int syncId) {
        return null;
    }
    
    public final void updateVisit(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Visits.Visits visit) {
    }
    
    public final void updateSyncStatus(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.SubmitFormModel user) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Visits.Visits> getAllVisits() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.PresanceStatus> getStatus() {
        return null;
    }
    
    public final void insertSaveForm(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.SubmitFormModel model) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable login(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    com.zest.android.ui.login.LoginRequest input, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.zest.android.ui.login.UserModel> onResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable getIndicators(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    java.util.List<com.zest.android.ui.login.IndicatorRequest> input, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<java.lang.Object> onResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable SavecForm(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.SubmitFormModel input, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.hisdu.meas.ui.Indicators.IndicatorModel> onResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable getHealthFacilities(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.zest.android.ui.login.HealthFacility> onResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable getZones(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.hisdu.meas.ui.Indicators.ZoneModel> onResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable getDropDownData(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.hisdu.meas.ui.Dashboard.AppDropdown> onResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.Visits.Visits getVisitById(int visitid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable getUserVisits(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.hisdu.meas.ui.Visits.VisitModel> onResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable getVisitedFacilities(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.hisdu.meas.ui.revamp.FacilitesResponseModel> onResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Indicators.SubmitFormModel> loadSyncByHF(int syncId, @org.jetbrains.annotations.NotNull
    java.lang.String facilityId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable getAppVersion(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.hisdu.meas.data.model.AppVersionModel> onResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable checkEligibility(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    java.lang.String tehsilCode, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.hisdu.meas.ui.revamp.EligibilityResponseModel> onResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable getMigrantsRecord(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.hisdu.meas.ui.migration.MigrantsListResponse> onResponse) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/hisdu/meas/data/repository/UserRepository$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}