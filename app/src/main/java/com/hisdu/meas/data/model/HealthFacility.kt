package com.zest.android.ui.login

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.leopold.mvvm.data.db.converter.DateConverter
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class HealthFacility(
    @Json(name = "List")
    var List:List<HealthFacilityModel>? = listOf(),
    @Json(name = "Error")
    var error: Boolean? = false,
    @Json(name = "Message")
    var message: String? = "",
    @Json(name = "StatusCode")
    var statusCode: Int? = 0
) {
    @JsonClass(generateAdapter = true)
//    @Entity(tableName = "HealthFacility",indices = [Index(value = ["HFMISCode"], unique = true)])
    @Entity(tableName = "HealthFacility")
    @TypeConverters(DateConverter::class)
    data class HealthFacilityModel(

        @Json(name = "DivisionCode")
        var DivisionCode: String? = "",

        @Json(name = "DivisionName")
        var DivisionName: String? = "",

        @Json(name = "DistrictCode")
        var DistrictCode: String? = "",

        @Json(name = "DistrictName")
        var DistrictName: String? = "",

        @Json(name = "TehsilCode")
        var TehsilCode: String? = "",

        @Json(name = "TehsilName")
        var TehsilName: String? = "",


        @Json(name = "HFMISCode")
        var HFMISCode: String?=null ,

        @Json(name = "HealthFacilityName")
        var HealthFacilityName: String? = "",

        @Json(name = "ModeName")
        var ModeName: String? = "",


        @Json(name = "lvl")
        var lvl: String? = "",

        @Json(name = "ZoneId")
        var ZoneId: String? = "",

        @Json(name = "AmbulanceNo")
        var AmbulanceNo:String?="",
        @Json(name = "id")
        @NonNull
        @PrimaryKey(autoGenerate = true)
        var id: Int?
    )
}