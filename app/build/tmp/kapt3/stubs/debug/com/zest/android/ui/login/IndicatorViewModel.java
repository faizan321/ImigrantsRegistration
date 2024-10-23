package com.zest.android.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020cJ\u0016\u0010d\u001a\u00020_2\u0006\u0010`\u001a\u00020e2\u0006\u0010b\u001a\u00020cJ\u0010\u0010\u000e\u001a\u00020_2\u0006\u0010f\u001a\u00020\u000fH\u0002J\u000e\u0010g\u001a\u00020_2\u0006\u0010h\u001a\u00020>J\u0006\u0010i\u001a\u00020_J\u001e\u0010j\u001a\u00020_2\u0006\u0010b\u001a\u00020c2\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020lJ\u0016\u0010n\u001a\u00020_2\u0006\u0010b\u001a\u00020c2\u0006\u0010k\u001a\u00020lJ\u0016\u0010o\u001a\u00020_2\u0006\u0010p\u001a\u00020l2\u0006\u0010q\u001a\u00020lJ\u000e\u0010r\u001a\u00020_2\u0006\u0010b\u001a\u00020cJ\u0016\u0010s\u001a\u00020_2\u0006\u0010b\u001a\u00020c2\u0006\u0010t\u001a\u00020lJ\u0006\u0010u\u001a\u00020_J.\u0010v\u001a\u00020_2\u0006\u0010w\u001a\u00020x2\u0006\u0010y\u001a\u00020x2\u0006\u0010m\u001a\u00020l2\u0006\u0010z\u001a\u00020l2\u0006\u0010{\u001a\u00020lJ\u000e\u0010L\u001a\u00020_2\u0006\u0010|\u001a\u00020lJ\u0006\u0010}\u001a\u00020_J\u000e\u0010~\u001a\u00020_2\u0006\u0010\u007f\u001a\u00020xJ\u0018\u0010\u0080\u0001\u001a\u00020_2\u0006\u0010b\u001a\u00020c2\u0007\u0010\u0081\u0001\u001a\u00020lJ\u0010\u0010\u0082\u0001\u001a\u00020_2\u0007\u0010\u0083\u0001\u001a\u00020lJ!\u0010\u0084\u0001\u001a\u00020_2\u0007\u0010\u0085\u0001\u001a\u00020l2\u0006\u0010q\u001a\u00020x2\u0007\u0010\u0086\u0001\u001a\u00020xJ\u0010\u0010\u0087\u0001\u001a\u00020_2\u0007\u0010\u0088\u0001\u001a\u00020xJ\u0007\u0010\u0089\u0001\u001a\u00020_J\u000f\u0010\u008a\u0001\u001a\u00020_2\u0006\u0010y\u001a\u00020xJ\u0011\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u008d\u0001\u001a\u00020>J\u0010\u0010\u008e\u0001\u001a\u00020_2\u0007\u0010\u008f\u0001\u001a\u00020lJ\u0019\u0010\u0090\u0001\u001a\u00020_2\u0007\u0010\u0091\u0001\u001a\u00020l2\u0007\u0010\u0092\u0001\u001a\u00020lJ\u0019\u0010\u0093\u0001\u001a\u00020_2\u0007\u0010\u0094\u0001\u001a\u00020x2\u0007\u0010\u0092\u0001\u001a\u00020lJ\u0010\u0010\u0095\u0001\u001a\u00020_2\u0007\u0010\u008f\u0001\u001a\u00020lJ\u0007\u0010\u0096\u0001\u001a\u00020_J\u0011\u0010\u0097\u0001\u001a\u00020_2\b\u0010\u0098\u0001\u001a\u00030\u0099\u0001J\u0012\u0010\u009a\u0001\u001a\u00020_2\u0007\u0010\u009b\u0001\u001a\u00020\u000fH\u0002J\u0018\u0010\u009c\u0001\u001a\u00020_2\u0007\u0010`\u001a\u00030\u009d\u00012\u0006\u0010b\u001a\u00020cJ\u0010\u0010\u009e\u0001\u001a\u00020_2\u0007\u0010\u008d\u0001\u001a\u00020>J\u0010\u0010\u009f\u0001\u001a\u00020_2\u0007\u0010\u00a0\u0001\u001a\u00020UR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00120\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\nR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\nR \u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\n\"\u0004\b\'\u0010\u001bR\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00120\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\nR\u001d\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\nR\u001d\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\nR\u0017\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\nR\u001d\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\nR\u001d\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\nR\u001d\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00120\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010\nR\u001d\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\u00120\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010\nR\u001d\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\u00120\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010\nR\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020>0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010\nR\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010\nR\u001d\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010\nR\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010\nR \u0010K\u001a\b\u0012\u0004\u0012\u00020>0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\n\"\u0004\bM\u0010\u001bR\u001d\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0\u00120\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010\nR\u001d\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010\nR\u0014\u0010S\u001a\b\u0012\u0004\u0012\u00020\"0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0\u00120\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010\nR \u0010W\u001a\b\u0012\u0004\u0012\u00020X0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\n\"\u0004\bZ\u0010\u001bR\u001d\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\\0\u00120\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010\n\u00a8\u0006\u00a1\u0001"}, d2 = {"Lcom/zest/android/ui/login/IndicatorViewModel;", "Landroidx/lifecycle/ViewModel;", "indicatorRepository", "Lcom/hisdu/meas/data/repository/IndicatorRepository;", "(Lcom/hisdu/meas/data/repository/IndicatorRepository;)V", "TehsilList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/zest/android/ui/login/HealthFacility$HealthFacilityModel;", "getTehsilList", "()Landroidx/lifecycle/MutableLiveData;", "allCategories", "Lcom/hisdu/meas/ui/Indicators/IndicatorCategory;", "getAllCategories", "allDataLoaded", "", "getAllDataLoaded", "allDivision", "", "getAllDivision", "allIndicators", "Lcom/hisdu/meas/ui/Indicators/Indicator;", "getAllIndicators", "bedSubmitted", "Lcom/hisdu/meas/data/model/BedResponseModel;", "getBedSubmitted", "setBedSubmitted", "(Landroidx/lifecycle/MutableLiveData;)V", "bhuList", "Lcom/hisdu/meas/data/model/Bhulists;", "getBhuList", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "currentUse", "Lcom/zest/android/ui/login/UserModel;", "getCurrentUse", "dataSubmited", "Lcom/hisdu/meas/data/model/ResponseModel;", "getDataSubmited", "setDataSubmited", "designationList", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$designation;", "getDesignationList", "districtList", "getDistrictList", "districtlist", "Lcom/hisdu/meas/data/model/Districtlists;", "getDistrictlist", "facilitydetail", "Lcom/hisdu/meas/data/model/AlreadyExist;", "getFacilitydetail", "getFacilityBylocationCode", "getGetFacilityBylocationCode", "healthFacilities", "getHealthFacilities", "healthFacilityTye", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$HealthFacilityType;", "getHealthFacilityTye", "imagesList", "Lcom/hisdu/meas/ui/revamp/ImagesResponseModel$BHUImageModel;", "getImagesList", "inprocessForm", "Lcom/hisdu/meas/ui/Indicators/SubmitFormModel;", "getInprocessForm", "inprocessFormByModule", "getInprocessFormByModule", "inprocessFormForId", "getInprocessFormForId", "isLoading", "migrationRouteList", "Lcom/hisdu/meas/ui/migration/MigrationRouteModel$MigrationRoute;", "getMigrationRouteList", "migrationSave", "Lcom/hisdu/meas/ui/migration/MigrationSaveResponseModel;", "getMigrationSave", "pendingRecord", "getPendingRecord", "setPendingRecord", "shiftsList", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$Shift;", "getShiftsList", "tehsillist", "getTehsillist", "userData", "visits", "Lcom/hisdu/meas/ui/Visits/Visits;", "getVisits", "wheelChairSubmitted", "Lcom/hisdu/meas/data/model/WheelChairResponseModel;", "getWheelChairSubmitted", "setWheelChairSubmitted", "zoneslist", "Lcom/hisdu/meas/ui/Indicators/ZoneModel$Zone;", "getZoneslist", "SubmitBed", "", "savemodel", "Lcom/hisdu/meas/data/model/BedDetailsViewModel;", "context", "Landroid/content/Context;", "SubmitWheelChair", "Lcom/hisdu/meas/data/model/WheelChairDetailsViewModel;", "isLoaded", "deleteRecord", "record", "dispose", "getBHU", "tehsilCode", "", "facilityType", "getBHUImages", "getDesignations", "hftype", "shiftId", "getDistrict", "getFacilityDetail", "facilityCode", "getHealthFacilityType", "getPendingForId", "moduleId", "", "applicationTypeid", "facilty", "visitType", "facilityId", "getShifts", "getShiftsById", "hfTypeId", "getTehsil", "districtCode", "getUser", "userid", "getVisit", "hfcode", "userId", "getVisitById", "visitid", "getinProcessForms", "getinProcessFormsByModule", "insertSaveForm", "", "model", "loadByDistrictId", "divisioncode", "loadHFLocation", "locationCode", "modename", "loadHealthFacility", "zoneid", "loadTehsils", "migrationRoute", "saveMigration", "saveModel", "Lcom/hisdu/meas/ui/migration/SaveMigrantModel;", "showLoading", "isVisible", "submitForm", "Lokhttp3/RequestBody;", "updateSaveForm", "updateVisit", "visit", "app_debug"})
public final class IndicatorViewModel extends androidx.lifecycle.ViewModel {
    private final com.hisdu.meas.data.repository.IndicatorRepository indicatorRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> allDataLoaded = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.ui.Indicators.IndicatorCategory>> allCategories = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.ui.Indicators.Indicator>> allIndicators = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel>> healthFacilities = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel>> getFacilityBylocationCode = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel>> districtList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel>> TehsilList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.designation>> designationList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel>> allDivision = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.ui.Indicators.ZoneModel.Zone>> zoneslist = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.ui.Indicators.SubmitFormModel>> inprocessForm = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.ui.Indicators.SubmitFormModel>> inprocessFormByModule = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.hisdu.meas.ui.Indicators.SubmitFormModel> inprocessFormForId = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.data.model.Districtlists>> districtlist = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.data.model.Districtlists>> tehsillist = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.data.model.Bhulists>> bhuList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.hisdu.meas.data.model.AlreadyExist> facilitydetail = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.ui.revamp.ImagesResponseModel.BHUImageModel>> imagesList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.ui.migration.MigrationRouteModel.MigrationRoute>> migrationRouteList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.hisdu.meas.ui.migration.MigrationSaveResponseModel> migrationSave = null;
    private final androidx.lifecycle.MutableLiveData<com.zest.android.ui.login.UserModel> userData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.zest.android.ui.login.UserModel> currentUse = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.hisdu.meas.ui.Indicators.SubmitFormModel> pendingRecord;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.HealthFacilityType>> healthFacilityTye = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.ui.Visits.Visits>> visits = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Shift>> shiftsList = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.hisdu.meas.data.model.ResponseModel> dataSubmited;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.hisdu.meas.data.model.BedResponseModel> bedSubmitted;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.hisdu.meas.data.model.WheelChairResponseModel> wheelChairSubmitted;
    
    @javax.inject.Inject
    public IndicatorViewModel(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.repository.IndicatorRepository indicatorRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAllDataLoaded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.ui.Indicators.IndicatorCategory>> getAllCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.ui.Indicators.Indicator>> getAllIndicators() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel>> getHealthFacilities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel>> getGetFacilityBylocationCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel>> getDistrictList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel>> getTehsilList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.designation>> getDesignationList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel>> getAllDivision() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.ui.Indicators.ZoneModel.Zone>> getZoneslist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.ui.Indicators.SubmitFormModel>> getInprocessForm() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.ui.Indicators.SubmitFormModel>> getInprocessFormByModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.hisdu.meas.ui.Indicators.SubmitFormModel> getInprocessFormForId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.data.model.Districtlists>> getDistrictlist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.data.model.Districtlists>> getTehsillist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.data.model.Bhulists>> getBhuList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.hisdu.meas.data.model.AlreadyExist> getFacilitydetail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.ui.revamp.ImagesResponseModel.BHUImageModel>> getImagesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.ui.migration.MigrationRouteModel.MigrationRoute>> getMigrationRouteList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.hisdu.meas.ui.migration.MigrationSaveResponseModel> getMigrationSave() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.zest.android.ui.login.UserModel> getCurrentUse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.hisdu.meas.ui.Indicators.SubmitFormModel> getPendingRecord() {
        return null;
    }
    
    public final void setPendingRecord(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.hisdu.meas.ui.Indicators.SubmitFormModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.HealthFacilityType>> getHealthFacilityTye() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.ui.Visits.Visits>> getVisits() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Shift>> getShiftsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.hisdu.meas.data.model.ResponseModel> getDataSubmited() {
        return null;
    }
    
    public final void setDataSubmited(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.hisdu.meas.data.model.ResponseModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.hisdu.meas.data.model.BedResponseModel> getBedSubmitted() {
        return null;
    }
    
    public final void setBedSubmitted(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.hisdu.meas.data.model.BedResponseModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.hisdu.meas.data.model.WheelChairResponseModel> getWheelChairSubmitted() {
        return null;
    }
    
    public final void setWheelChairSubmitted(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.hisdu.meas.data.model.WheelChairResponseModel> p0) {
    }
    
    private final void showLoading(boolean isVisible) {
    }
    
    private final void allDataLoaded(boolean isLoaded) {
    }
    
    public final void getUser(@org.jetbrains.annotations.NotNull
    java.lang.String userid) {
    }
    
    public final void dispose() {
    }
    
    public final void getHealthFacilityType() {
    }
    
    public final void getShifts() {
    }
    
    public final void getShiftsById(int hfTypeId) {
    }
    
    public final void getVisit(@org.jetbrains.annotations.NotNull
    java.lang.String hfcode, int shiftId, int userId) {
    }
    
    public final void getVisitById(int visitid) {
    }
    
    public final void loadHealthFacility(int zoneid, @org.jetbrains.annotations.NotNull
    java.lang.String modename) {
    }
    
    public final void loadHFLocation(@org.jetbrains.annotations.NotNull
    java.lang.String locationCode, @org.jetbrains.annotations.NotNull
    java.lang.String modename) {
    }
    
    public final void loadByDistrictId(@org.jetbrains.annotations.NotNull
    java.lang.String divisioncode) {
    }
    
    public final void loadTehsils(@org.jetbrains.annotations.NotNull
    java.lang.String divisioncode) {
    }
    
    public final long insertSaveForm(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.SubmitFormModel model) {
        return 0L;
    }
    
    public final void updateSaveForm(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.SubmitFormModel model) {
    }
    
    public final void updateVisit(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Visits.Visits visit) {
    }
    
    public final void getDesignations(@org.jetbrains.annotations.NotNull
    java.lang.String hftype, @org.jetbrains.annotations.NotNull
    java.lang.String shiftId) {
    }
    
    public final void getPendingRecord(@org.jetbrains.annotations.NotNull
    java.lang.String facilityId) {
    }
    
    public final void getinProcessForms() {
    }
    
    public final void getinProcessFormsByModule(int applicationTypeid) {
    }
    
    public final void getPendingForId(int moduleId, int applicationTypeid, @org.jetbrains.annotations.NotNull
    java.lang.String facilityType, @org.jetbrains.annotations.NotNull
    java.lang.String facilty, @org.jetbrains.annotations.NotNull
    java.lang.String visitType) {
    }
    
    public final void submitForm(@org.jetbrains.annotations.NotNull
    okhttp3.RequestBody savemodel, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final void SubmitBed(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.BedDetailsViewModel savemodel, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final void SubmitWheelChair(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.WheelChairDetailsViewModel savemodel, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final void deleteRecord(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.SubmitFormModel record) {
    }
    
    public final void getDistrict(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final void getTehsil(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String districtCode) {
    }
    
    public final void getBHU(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String tehsilCode, @org.jetbrains.annotations.NotNull
    java.lang.String facilityType) {
    }
    
    public final void getBHUImages(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String tehsilCode) {
    }
    
    public final void getFacilityDetail(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String facilityCode) {
    }
    
    public final void migrationRoute() {
    }
    
    public final void saveMigration(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.migration.SaveMigrantModel saveModel) {
    }
}