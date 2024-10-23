package com.hisdu.meas.ui.Dashboard


import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.leopold.mvvm.data.db.converter.DateConverter
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AppDropdown(
    @Json(name = "Error")
    var error: Boolean? = false,
    @Json(name = "List")
    var `list`: DropdownData,

    @Json(name = "Message")
    var message: String? = "",
    @Json(name = "StatusCode")
    var statusCode: Int? = 0

) {
    @JsonClass(generateAdapter = true)

    data class DropdownData(

//        @Json(name = "id")
//        @NonNull
//        @PrimaryKey(autoGenerate = true)
//        var id: Int?=0,
        @Json(name = "ApplicationType")
        var applicationType: List<ApplicationType?> = listOf(),
        @Json(name = "HealthFacilityType")
        var healthFacilityType: List<HealthFacilityType>? = listOf(),
        @Json(name = "Modules")
        var modules: List<Module>? = listOf(),
        @Json(name = "Shifts")
        var shifts: List<Shift>? = listOf(),
        @Json(name = "PresentStatus")
        var PresentStatusList: List<PresanceStatus>? = listOf(),
        @Json(name = "designations")
        var designations: List<designation>? = listOf()
    ) {
        @Entity
        @JsonClass(generateAdapter = true)
        data class ApplicationType(

            @PrimaryKey
            @Json(name = "ApplicationTypeId")
            var applicationTypeId: Int? ,

            @Json(name = "ApplicationTypeName")
            var applicationTypeName: String? = ""
        )

        @Entity
        @TypeConverters(DateConverter::class)
        @JsonClass(generateAdapter = true)
        data class HealthFacilityType(
            @PrimaryKey
            @Json(name = "FacilityTypeId")
            var facilityTypeId: Int? ,
            @Json(name = "FaciltyTypeName")
            var faciltyTypeName: String? = "",
            @Json(name = "CategoryId")
            var CategoryId: Int? ,
            @Json(name = "ApplicationTypeIds")
            var ApplicationTypeIds: List<Int>? = listOf()
        )


        @Entity
        @JsonClass(generateAdapter = true)
        data class Module(

            @Json(name = "ApplicationTypeId")
            var applicationTypeId: Int? ,
            @Json(name = "ModuleId")
            @PrimaryKey
            var moduleId: Int? ,
            @Json(name = "ModuleName")
            var moduleName: String? = "",
            @Json(name="IsRequired")
            var IsRequired:Boolean?=null
        )

        @Entity
        @TypeConverters(DateConverter::class)
        @JsonClass(generateAdapter = true)
        data class Shift(
            @PrimaryKey
            @Json(name = "ShiftId")
            var shiftId: Int?,
            @Json(name = "ShiftName")
            var shiftName: String? = "",
            @Json(name = "HFTypeId")
            var HFTypeId: List<Int>? = listOf()
        )

//        @Entity
//        @TypeConverters(DateConverter::class)
//        @JsonClass(generateAdapter = true)
//        data class PresentStatus(
//            @PrimaryKey
//            @Json(name = "ProfileTypeId")
//            var ProfileTypeId: Int? ,
//            @Json(name = "ProfileTypeName")
//            var ProfileTypeName: String? = "",
//            @Json(name = "ProfileList")
//            var ProfileList:List<Presence>? = listOf()
//        )

        @Entity
        @JsonClass(generateAdapter = true)
        data class PresanceStatus(
            @PrimaryKey
            @Json(name = "ProfileId")
            var ProfileId: Int? ,
            @Json(name = "ProfileName")
            var ProfileName: String? = ""
        )

        @Entity
        @JsonClass(generateAdapter = true)
        @TypeConverters(DateConverter::class)
        data class designation(
            @PrimaryKey
            @Json(name = "DesignationHFId")
            var DesignationHFId: Int? ,
            @Json(name = "DesignationId")
            var DesignationId: Int? ,
            @Json(name = "DesignationName")
            var DesignationName: String? = "",
//            @Json(name = "HfTypes")
//            var HfTypes:List<Int> = listOf()
            @Json(name = "HFTypeId")
            var HFTypeId:String? = "",
            @Json(name = "ShiftId")
            var ShiftId:String? = "",
            @Json(name = "SequenceNo")
            var SequenceNo: Int?
        )
    }
}