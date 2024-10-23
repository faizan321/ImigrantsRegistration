package com.hisdu.meas.ui.Indicators;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00e0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u009b\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u009b\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u000208J\u0006\u0010{\u001a\u00020yJ\u0006\u0010|\u001a\u00020yJ\u0006\u0010}\u001a\u00020yJ\u0006\u0010~\u001a\u00020yJ&\u0010\u007f\u001a\u00020y2\u0007\u0010\u0080\u0001\u001a\u00020\b2\u0007\u0010\u0081\u0001\u001a\u00020\b2\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u0001H\u0016J\u001b\u0010\u0084\u0001\u001a\u00020y2\u0007\u0010\u0085\u0001\u001a\u00020\f2\u0007\u0010\u0086\u0001\u001a\u00020NH\u0016J\u0012\u0010\u0087\u0001\u001a\u00020y2\u0007\u0010\u0088\u0001\u001a\u000208H\u0016J\u0015\u0010\u0089\u0001\u001a\u00020y2\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u0001H\u0016J.\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u00012\b\u0010\u008e\u0001\u001a\u00030\u008f\u00012\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u00012\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u0001H\u0016J\u0007\u0010\u0092\u0001\u001a\u00020yJ\u0013\u0010\u0093\u0001\u001a\u00020y2\b\u0010\u0094\u0001\u001a\u00030\u008b\u0001H\u0016J\u0010\u0010\u0095\u0001\u001a\u00020y2\u0007\u0010\u0096\u0001\u001a\u00020\u0010J\t\u0010\u0097\u0001\u001a\u00020yH\u0003J\b\u0010\u0098\u0001\u001a\u00030\u0099\u0001J\b\u0010\u009a\u0001\u001a\u00030\u0099\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R\u001a\u0010 \u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u000e\u0010#\u001a\u00020$X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00101\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0014\u00107\u001a\b\u0012\u0004\u0012\u0002080\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0012\"\u0004\bA\u0010\u0014R\u001a\u0010B\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0012\"\u0004\bD\u0010\u0014R\u001a\u0010E\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0012\"\u0004\bG\u0010\u0014R\u001a\u0010H\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001c\u0010M\u001a\u0004\u0018\u00010NX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010S\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0012\"\u0004\bU\u0010\u0014R\u001a\u0010V\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0012\"\u0004\bX\u0010\u0014R\u001a\u0010Y\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0012\"\u0004\b[\u0010\u0014R\u001c\u0010\\\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u0012\"\u0004\b^\u0010\u0014R\u001a\u0010_\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u0012\"\u0004\ba\u0010\u0014R\u001a\u0010b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001a\u0010g\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010d\"\u0004\bi\u0010fR\u001a\u0010j\u001a\u00020kX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u000e\u0010p\u001a\u00020qX\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010r\u001a\b\u0012\u0004\u0012\u00020q0s8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u0010u\"\u0004\bv\u0010w\u00a8\u0006\u009c\u0001"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/MasterIndicatorsFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/hisdu/meas/ui/roles/InProcessClickListener;", "Lcom/hisdu/meas/ui/revamp/BHUImageClickListener;", "()V", "FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS", "", "REQUEST_CHECK_SETTINGS", "", "UPDATE_INTERVAL_IN_MILLISECONDS", "allImagesList", "", "Lcom/hisdu/meas/ui/revamp/ImagesResponseModel$BHUImageModel;", "binding", "Lcom/hisdu/meas/databinding/MasterFormBinding;", "buildingPicture", "", "getBuildingPicture", "()Ljava/lang/String;", "setBuildingPicture", "(Ljava/lang/String;)V", "dialog", "Landroid/app/AlertDialog;", "healthFacilityTypes", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$HealthFacilityType;", "getHealthFacilityTypes", "()Ljava/util/List;", "imagesAdapter", "Lcom/hisdu/meas/ui/revamp/ImagesAdapter;", "latitude", "getLatitude", "setLatitude", "longitude", "getLongitude", "setLongitude", "mAdapter", "Lcom/hisdu/specialized/ui/Indicators/InProcessSurveysAdapter;", "mCurrentLocation", "Landroid/location/Location;", "mFusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "mLocationCallback", "Lcom/google/android/gms/location/LocationCallback;", "mLocationRequest", "Lcom/google/android/gms/location/LocationRequest;", "mLocationSettingsRequest", "Lcom/google/android/gms/location/LocationSettingsRequest;", "mSettingsClient", "Lcom/google/android/gms/location/SettingsClient;", "masterModel", "Lcom/hisdu/meas/data/model/BHUSurveyModel;", "getMasterModel", "()Lcom/hisdu/meas/data/model/BHUSurveyModel;", "setMasterModel", "(Lcom/hisdu/meas/data/model/BHUSurveyModel;)V", "recordList", "Lcom/hisdu/meas/ui/Indicators/SubmitFormModel;", "saveModel", "Lcom/hisdu/meas/ui/migration/SaveMigrantModel;", "getSaveModel", "()Lcom/hisdu/meas/ui/migration/SaveMigrantModel;", "setSaveModel", "(Lcom/hisdu/meas/ui/migration/SaveMigrantModel;)V", "selectedBHUCode", "getSelectedBHUCode", "setSelectedBHUCode", "selectedDesignation", "getSelectedDesignation", "setSelectedDesignation", "selectedDistrict", "getSelectedDistrict", "setSelectedDistrict", "selectedImage", "getSelectedImage", "()Lcom/hisdu/meas/ui/revamp/ImagesResponseModel$BHUImageModel;", "setSelectedImage", "(Lcom/hisdu/meas/ui/revamp/ImagesResponseModel$BHUImageModel;)V", "selectedImageView", "Landroid/widget/ImageView;", "getSelectedImageView", "()Landroid/widget/ImageView;", "setSelectedImageView", "(Landroid/widget/ImageView;)V", "selectedLocationCode", "getSelectedLocationCode", "setSelectedLocationCode", "selectedNoOfBed", "getSelectedNoOfBed", "setSelectedNoOfBed", "selectedPhase", "getSelectedPhase", "setSelectedPhase", "selectedType", "getSelectedType", "setSelectedType", "selectedwheelChairs", "getSelectedwheelChairs", "setSelectedwheelChairs", "totalBedsSubmitted", "getTotalBedsSubmitted", "()I", "setTotalBedsSubmitted", "(I)V", "totalWheelChairSubmitted", "getTotalWheelChairSubmitted", "setTotalWheelChairSubmitted", "user", "Lcom/zest/android/ui/login/UserModel;", "getUser", "()Lcom/zest/android/ui/login/UserModel;", "setUser", "(Lcom/zest/android/ui/login/UserModel;)V", "viewModel", "Lcom/zest/android/ui/login/IndicatorViewModel;", "viewModelProvider", "Ljavax/inject/Provider;", "getViewModelProvider", "()Ljavax/inject/Provider;", "setViewModelProvider", "(Ljavax/inject/Provider;)V", "deleteDialog", "", "record", "formFields", "getMigrationRoute", "init", "locationPermission", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBHUImageClick", "model", "imageView", "onClick", "recipe", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onImagePicker", "onSaveInstanceState", "oldInstanceState", "showErrorMessage", "msg", "startLocationUpdates", "validate", "", "validatePrimaryMonitoring", "Companion", "app_debug"})
public final class MasterIndicatorsFragment extends androidx.fragment.app.Fragment implements com.hisdu.meas.ui.roles.InProcessClickListener, com.hisdu.meas.ui.revamp.BHUImageClickListener {
    private com.hisdu.meas.databinding.MasterFormBinding binding;
    private com.zest.android.ui.login.IndicatorViewModel viewModel;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.HealthFacilityType> healthFacilityTypes = null;
    private android.app.AlertDialog dialog;
    @org.jetbrains.annotations.NotNull
    private java.lang.String selectedLocationCode = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String selectedDistrict = "";
    @org.jetbrains.annotations.Nullable
    private java.lang.String selectedType = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String selectedDesignation = "";
    public com.zest.android.ui.login.UserModel user;
    @org.jetbrains.annotations.NotNull
    private com.hisdu.meas.data.model.BHUSurveyModel masterModel;
    @org.jetbrains.annotations.NotNull
    private com.hisdu.meas.ui.migration.SaveMigrantModel saveModel;
    @org.jetbrains.annotations.NotNull
    private java.lang.String selectedBHUCode = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String selectedNoOfBed = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String selectedPhase = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String selectedwheelChairs = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String buildingPicture = "";
    @org.jetbrains.annotations.Nullable
    private android.widget.ImageView selectedImageView;
    @org.jetbrains.annotations.NotNull
    private com.hisdu.meas.ui.revamp.ImagesResponseModel.BHUImageModel selectedImage;
    private final long FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS = 5000L;
    private com.google.android.gms.location.FusedLocationProviderClient mFusedLocationClient;
    @org.jetbrains.annotations.NotNull
    private java.lang.String latitude = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String longitude = "";
    private com.google.android.gms.location.LocationRequest mLocationRequest;
    private final long UPDATE_INTERVAL_IN_MILLISECONDS = 10000L;
    private java.util.List<com.hisdu.meas.ui.revamp.ImagesResponseModel.BHUImageModel> allImagesList;
    @javax.inject.Inject
    public javax.inject.Provider<com.zest.android.ui.login.IndicatorViewModel> viewModelProvider;
    private com.hisdu.specialized.ui.Indicators.InProcessSurveysAdapter mAdapter;
    private com.hisdu.meas.ui.revamp.ImagesAdapter imagesAdapter;
    private java.util.List<com.hisdu.meas.ui.Indicators.SubmitFormModel> recordList;
    private com.google.android.gms.location.SettingsClient mSettingsClient;
    private com.google.android.gms.location.LocationSettingsRequest mLocationSettingsRequest;
    private com.google.android.gms.location.LocationCallback mLocationCallback;
    private android.location.Location mCurrentLocation;
    private final int REQUEST_CHECK_SETTINGS = 100;
    private int totalBedsSubmitted = 0;
    private int totalWheelChairSubmitted = 0;
    @org.jetbrains.annotations.NotNull
    public static final com.hisdu.meas.ui.Indicators.MasterIndicatorsFragment.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private java.util.HashMap _$_findViewCache;
    
    public MasterIndicatorsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.HealthFacilityType> getHealthFacilityTypes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSelectedLocationCode() {
        return null;
    }
    
    public final void setSelectedLocationCode(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSelectedDistrict() {
        return null;
    }
    
    public final void setSelectedDistrict(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSelectedType() {
        return null;
    }
    
    public final void setSelectedType(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSelectedDesignation() {
        return null;
    }
    
    public final void setSelectedDesignation(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.zest.android.ui.login.UserModel getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull
    com.zest.android.ui.login.UserModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.data.model.BHUSurveyModel getMasterModel() {
        return null;
    }
    
    public final void setMasterModel(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.BHUSurveyModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.migration.SaveMigrantModel getSaveModel() {
        return null;
    }
    
    public final void setSaveModel(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.migration.SaveMigrantModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSelectedBHUCode() {
        return null;
    }
    
    public final void setSelectedBHUCode(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSelectedNoOfBed() {
        return null;
    }
    
    public final void setSelectedNoOfBed(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSelectedPhase() {
        return null;
    }
    
    public final void setSelectedPhase(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSelectedwheelChairs() {
        return null;
    }
    
    public final void setSelectedwheelChairs(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBuildingPicture() {
        return null;
    }
    
    public final void setBuildingPicture(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.widget.ImageView getSelectedImageView() {
        return null;
    }
    
    public final void setSelectedImageView(@org.jetbrains.annotations.Nullable
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.revamp.ImagesResponseModel.BHUImageModel getSelectedImage() {
        return null;
    }
    
    public final void setSelectedImage(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.revamp.ImagesResponseModel.BHUImageModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLatitude() {
        return null;
    }
    
    public final void setLatitude(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLongitude() {
        return null;
    }
    
    public final void setLongitude(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final javax.inject.Provider<com.zest.android.ui.login.IndicatorViewModel> getViewModelProvider() {
        return null;
    }
    
    public final void setViewModelProvider(@org.jetbrains.annotations.NotNull
    javax.inject.Provider<com.zest.android.ui.login.IndicatorViewModel> p0) {
    }
    
    public final int getTotalBedsSubmitted() {
        return 0;
    }
    
    public final void setTotalBedsSubmitted(int p0) {
    }
    
    public final int getTotalWheelChairSubmitted() {
        return 0;
    }
    
    public final void setTotalWheelChairSubmitted(int p0) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void formFields() {
    }
    
    public final boolean validate() {
        return false;
    }
    
    public final boolean validatePrimaryMonitoring() {
        return false;
    }
    
    public final void getMigrationRoute() {
    }
    
    public final void showErrorMessage(@org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    public final void deleteDialog(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.SubmitFormModel record) {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.SubmitFormModel recipe) {
    }
    
    public final void onImagePicker() {
    }
    
    @java.lang.Override
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    public final void locationPermission() {
    }
    
    /**
     * Starting location updates
     * Check whether location settings are satisfied and then
     * location updates will be requested
     */
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void startLocationUpdates() {
    }
    
    @java.lang.Override
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull
    android.os.Bundle oldInstanceState) {
    }
    
    public final void init() {
    }
    
    @java.lang.Override
    public void onBHUImageClick(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.revamp.ImagesResponseModel.BHUImageModel model, @org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/MasterIndicatorsFragment$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}