package com.hisdu.meas.data.source.remote


import com.hisdu.meas.data.model.*
import com.hisdu.meas.ui.Dashboard.AppDropdown
import com.hisdu.meas.ui.Indicators.IndicatorModel
import com.hisdu.meas.ui.Indicators.SubmitFormModel
import com.hisdu.meas.ui.Indicators.ZoneModel
import com.hisdu.meas.ui.Visits.VisitModel
import com.hisdu.meas.ui.migration.MigrantsListResponse
import com.hisdu.meas.ui.migration.MigrationRouteModel
import com.hisdu.meas.ui.migration.MigrationSaveResponseModel
import com.hisdu.meas.ui.migration.SaveMigrantModel
import com.hisdu.meas.ui.revamp.EligibilityResponseModel
import com.hisdu.meas.ui.revamp.FacilitesResponseModel
import com.hisdu.meas.ui.revamp.ImagesResponseModel
import com.zest.android.ui.login.*
import io.reactivex.rxjava3.core.Observable
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

/**
 * All Api services must specific in this interface
 *
 * @Author ZARA.
 */
interface APIService {


    @GET("search.php")
    fun getRecipes(@Query("s") randomChar: String): Observable<RecipeResponse>


    @get:GET("category.php")
    val categories: Observable<CategoryResponse>


    @GET("lookup.php")
    fun getRecipeDetailById(@Query("i") recipeId: String): Observable<RecipeResponse>


    @GET("search.php")
    fun search(@Query("s") query: String): Call<RecipeResponse>


//    @POST("token")
//    fun login(@Body params: LoginRequest): Observable<UserModel>

    @FormUrlEncoded
    @POST("token")
    fun login(
        @Field("username") username: String,
        @Field("password") password: String,
        @Field("grant_type") grant_type: String
    ): Observable<UserModel>



    @GET("Profile/GetHealthFacilities")
    fun getHealthFacilities(): Observable<HealthFacility>

    @GET("Profile/GetAppDropdownData")
    fun getGetAppDropdownData(): Observable<AppDropdown>

//    @POST("Indicator/GetAllIndicatorsModules")
//    fun getAllIndicators(@Body params: IndicatorRequest): Observable<IndicatorModel>

    @POST("Indicator/GetAllIndicatorsModules")
    fun getAllIndicators(@Body params: IndicatorRequest): Observable<IndicatorModel>


    @POST("Monitoring/SaveFormsIndicatorNEW")
    fun saveForm(@Header("Authorization") token: String?,
                 @Body params: SubmitFormModel
    ): Observable<IndicatorModel>


    @GET("Profile/GetUsersVisits")
    fun getUserVisits(@Header("Authorization") token: String?): Observable<VisitModel>


    @GET("/GetDistricts")
    fun getDistrict(@Header("Authorization") token: String?): Observable<DistrictModel>

    @GET("/GetTehsil")
    fun getTehsils(@Header("Authorization") token: String?,@Query("code")districtCode:String): Observable<TehsilModel>

    @GET("/GetBHUs")
    fun getBHU(@Header("Authorization") token: String?,@Query("code")tehsilCode:String, @Query("TypeCode")facilityType:String): Observable<BHUModel>



    @GET("/GETUSERWISELIST")
    fun getVisitedFacilities(@Header("Authorization") token: String?): Observable<FacilitesResponseModel>



    @GET("/GetImagesListForHF")
    fun getBHUImages(@Header("Authorization") token: String?,@Query("HFCode")hfmisCode:String): Observable<ImagesResponseModel>


//    @GET("Profile/GetAppVersion")
//    fun getAppVersion(): Observable<AppVersionModel>

    @GET("/api/CommonApi/AppVersion")
    fun getAppVersion(): Observable<NewAppversion>

    @GET("Profile/GetZones")
    fun getZone(): Observable<ZoneModel>


    @POST("/api/CommonApi/FindBHUDetailInMaster")
    fun getFacilityDetail(@Header("Authorization") token: String?,@Query("code")tehsilCode:String ): Observable<AlreadyExisitHF>

    @POST("api/BHUBEDSAVEApi/SaveBuildingInspection")
    fun saveBHU(@Header("Authorization") token: String?,
                 @Body params: RequestBody
    ): Observable<ResponseModel>

    @POST("/api/BHUBEDSAVEApi/SaveBedDetails")
    fun saveBed(@Header("Authorization") token: String?,
                @Body params: BedDetailsViewModel
    ): Observable<BedResponseModel>

    @POST("/api/BHUBEDSAVEApi/SaveWheelChairInfo")
    fun saveWheelChair(@Header("Authorization") token: String?,
                @Body params: WheelChairDetailsViewModel
    ): Observable<WheelChairResponseModel>


    @GET
    fun getAppVersion(@Url url:String): Observable<AppVersionModel>

    @GET("/IsEligibleForInspection")
    fun checkEligibility(@Header("Authorization") token: String?,@Query("HFCode")hfmisCode:String): Observable<EligibilityResponseModel>

    @GET("/api/CommonApi/MigrantsFrom")
    fun migrationRoute(@Header("Authorization") token: String?): Observable<MigrationRouteModel>

    @POST("/api/Migrants/SaveMigrantsData")
    fun saveMigration(@Header("Authorization") token: String?,   @Body params: SaveMigrantModel): Observable<MigrationSaveResponseModel>

    @GET("api/CommonApi/MigrantsList")
    fun getMigrantsRecord(@Header("Authorization") token: String?): Observable<MigrantsListResponse>


}

