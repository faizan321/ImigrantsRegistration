package com.hisdu.meas.ui.Indicators


import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.leopold.mvvm.data.db.converter.DateConverter
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ZoneModel(
    @Json(name = "Error")
    var error: Boolean? = false,
    @Json(name = "List")
    var list: List<Zone>? = listOf(),
    @Json(name = "Message")
    var message: String? = "",
    @Json(name = "StatusCode")
    var statusCode: Int? = 0
) {

    @JsonClass(generateAdapter = true)
    @Entity(tableName = "Zone")
    @TypeConverters(DateConverter::class)
    data class Zone(
        @Json(name = "DistrictCode")
        var districtCode: String? = "",
        @Json(name = "DivisionCode")
        var divisionCode: String? = "",
        @Json(name = "TehsilCode")
        var tehsilCode: String? = "",
        @PrimaryKey
        @Json(name = "ZoneId")
        var zoneId: Int? = 0,
        @Json(name = "ZoneName")
        var zoneName: String? = ""
    )
}