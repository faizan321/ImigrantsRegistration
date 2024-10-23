package com.hisdu.meas.data.source.remote;

import java.lang.System;

/**
 * All Api services must specific in this interface
 *
 * @Author ZARA.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00ce\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH\'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\'J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003H\'J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0013\u001a\u00020\nH\'J.\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u0016\u001a\u00020\n2\b\b\u0001\u0010\u0017\u001a\u00020\nH\'J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH\'J\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\'J$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u0016\u001a\u00020\nH\'J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0003H\'J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0003H\'J\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\'J\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010&\u001a\u00020\nH\'J\u0018\u0010\'\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010(\u001a\u00020\nH\'J$\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010+\u001a\u00020\nH\'J\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\'J\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\'J\u000e\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0003H\'J,\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00032\b\b\u0001\u00104\u001a\u00020\n2\b\b\u0001\u00105\u001a\u00020\n2\b\b\u0001\u00106\u001a\u00020\nH\'J\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002080\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\'J$\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000e\u001a\u00020;H\'J$\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000e\u001a\u00020>H\'J$\u0010?\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000e\u001a\u00020@H\'J$\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000e\u001a\u00020CH\'J$\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000e\u001a\u00020FH\'J\u0018\u0010G\u001a\b\u0012\u0004\u0012\u00020%0H2\b\b\u0001\u0010I\u001a\u00020\nH\'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006J\u00c0\u0006\u0001"}, d2 = {"Lcom/hisdu/meas/data/source/remote/APIService;", "", "categories", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/hisdu/meas/data/model/CategoryResponse;", "getCategories", "()Lio/reactivex/rxjava3/core/Observable;", "checkEligibility", "Lcom/hisdu/meas/ui/revamp/EligibilityResponseModel;", "token", "", "hfmisCode", "getAllIndicators", "Lcom/hisdu/meas/ui/Indicators/IndicatorModel;", "params", "Lcom/zest/android/ui/login/IndicatorRequest;", "getAppVersion", "Lcom/hisdu/meas/data/model/NewAppversion;", "Lcom/hisdu/meas/data/model/AppVersionModel;", "url", "getBHU", "Lcom/hisdu/meas/data/model/BHUModel;", "tehsilCode", "facilityType", "getBHUImages", "Lcom/hisdu/meas/ui/revamp/ImagesResponseModel;", "getDistrict", "Lcom/hisdu/meas/data/model/DistrictModel;", "getFacilityDetail", "Lcom/hisdu/meas/data/model/AlreadyExisitHF;", "getGetAppDropdownData", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown;", "getHealthFacilities", "Lcom/zest/android/ui/login/HealthFacility;", "getMigrantsRecord", "Lcom/hisdu/meas/ui/migration/MigrantsListResponse;", "getRecipeDetailById", "Lcom/hisdu/meas/data/model/RecipeResponse;", "recipeId", "getRecipes", "randomChar", "getTehsils", "Lcom/hisdu/meas/data/model/TehsilModel;", "districtCode", "getUserVisits", "Lcom/hisdu/meas/ui/Visits/VisitModel;", "getVisitedFacilities", "Lcom/hisdu/meas/ui/revamp/FacilitesResponseModel;", "getZone", "Lcom/hisdu/meas/ui/Indicators/ZoneModel;", "login", "Lcom/zest/android/ui/login/UserModel;", "username", "password", "grant_type", "migrationRoute", "Lcom/hisdu/meas/ui/migration/MigrationRouteModel;", "saveBHU", "Lcom/hisdu/meas/data/model/ResponseModel;", "Lokhttp3/RequestBody;", "saveBed", "Lcom/hisdu/meas/data/model/BedResponseModel;", "Lcom/hisdu/meas/data/model/BedDetailsViewModel;", "saveForm", "Lcom/hisdu/meas/ui/Indicators/SubmitFormModel;", "saveMigration", "Lcom/hisdu/meas/ui/migration/MigrationSaveResponseModel;", "Lcom/hisdu/meas/ui/migration/SaveMigrantModel;", "saveWheelChair", "Lcom/hisdu/meas/data/model/WheelChairResponseModel;", "Lcom/hisdu/meas/data/model/WheelChairDetailsViewModel;", "search", "Lretrofit2/Call;", "query", "app_debug"})
public abstract interface APIService {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "search.php")
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.data.model.RecipeResponse> getRecipes(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "s")
    java.lang.String randomChar);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "category.php")
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.data.model.CategoryResponse> getCategories();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "lookup.php")
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.data.model.RecipeResponse> getRecipeDetailById(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "i")
    java.lang.String recipeId);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "search.php")
    public abstract retrofit2.Call<com.hisdu.meas.data.model.RecipeResponse> search(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "s")
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "token")
    @retrofit2.http.FormUrlEncoded
    public abstract io.reactivex.rxjava3.core.Observable<com.zest.android.ui.login.UserModel> login(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Field(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Field(value = "password")
    java.lang.String password, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Field(value = "grant_type")
    java.lang.String grant_type);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "Profile/GetHealthFacilities")
    public abstract io.reactivex.rxjava3.core.Observable<com.zest.android.ui.login.HealthFacility> getHealthFacilities();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "Profile/GetAppDropdownData")
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.ui.Dashboard.AppDropdown> getGetAppDropdownData();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "Indicator/GetAllIndicatorsModules")
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.ui.Indicators.IndicatorModel> getAllIndicators(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.zest.android.ui.login.IndicatorRequest params);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "Monitoring/SaveFormsIndicatorNEW")
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.ui.Indicators.IndicatorModel> saveForm(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.hisdu.meas.ui.Indicators.SubmitFormModel params);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "Profile/GetUsersVisits")
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.ui.Visits.VisitModel> getUserVisits(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/GetDistricts")
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.data.model.DistrictModel> getDistrict(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/GetTehsil")
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.data.model.TehsilModel> getTehsils(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "code")
    java.lang.String districtCode);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/GetBHUs")
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.data.model.BHUModel> getBHU(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "code")
    java.lang.String tehsilCode, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "TypeCode")
    java.lang.String facilityType);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/GETUSERWISELIST")
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.ui.revamp.FacilitesResponseModel> getVisitedFacilities(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/GetImagesListForHF")
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.ui.revamp.ImagesResponseModel> getBHUImages(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "HFCode")
    java.lang.String hfmisCode);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/CommonApi/AppVersion")
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.data.model.NewAppversion> getAppVersion();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "Profile/GetZones")
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.ui.Indicators.ZoneModel> getZone();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "/api/CommonApi/FindBHUDetailInMaster")
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.data.model.AlreadyExisitHF> getFacilityDetail(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "code")
    java.lang.String tehsilCode);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "api/BHUBEDSAVEApi/SaveBuildingInspection")
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.data.model.ResponseModel> saveBHU(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody params);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "/api/BHUBEDSAVEApi/SaveBedDetails")
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.data.model.BedResponseModel> saveBed(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.hisdu.meas.data.model.BedDetailsViewModel params);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "/api/BHUBEDSAVEApi/SaveWheelChairInfo")
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.data.model.WheelChairResponseModel> saveWheelChair(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.hisdu.meas.data.model.WheelChairDetailsViewModel params);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.data.model.AppVersionModel> getAppVersion(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Url
    java.lang.String url);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/IsEligibleForInspection")
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.ui.revamp.EligibilityResponseModel> checkEligibility(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "HFCode")
    java.lang.String hfmisCode);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/CommonApi/MigrantsFrom")
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.ui.migration.MigrationRouteModel> migrationRoute(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "/api/Migrants/SaveMigrantsData")
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.ui.migration.MigrationSaveResponseModel> saveMigration(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.hisdu.meas.ui.migration.SaveMigrantModel params);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "api/CommonApi/MigrantsList")
    public abstract io.reactivex.rxjava3.core.Observable<com.hisdu.meas.ui.migration.MigrantsListResponse> getMigrantsRecord(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token);
}