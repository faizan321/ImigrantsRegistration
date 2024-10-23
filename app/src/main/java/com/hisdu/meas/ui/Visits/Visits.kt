package com.hisdu.meas.ui.Visits

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
@Entity
data class Visits(
    @Json(name = "FullName")
    var fullName: String? = "",
    @Json(name = "HFMISCode")
    var hFMISCode: String? = "",
    @Json(name = "HealthFacilityName")
    var healthFacilityName: String? = "",
    @Json(name = "HfId")
    var hfId: Int? = 0,
    @Json(name = "IsRepeat")
    var isRepeat: Boolean? = false,
    @Json(name = "IsSpecial")
    var isSpecial: Boolean? = false,
    @Json(name = "IsVisited")
    var isVisited: Boolean? = false,
    @Json(name = "ShiftId")
    var shiftId: Int? = 0,
    @Json(name = "ShiftName")
    var shiftName: String? = "",
    @Json(name = "UserId")
    var userId: Int? = 0,
    @Json(name = "Username")
    var username: String? = "",
    @Json(name = "VisitedDate")
    var visitedDate: String?="",
    @Json(name = "ModeName")
    var ModeName: String?="",

    @PrimaryKey
    @Json(name = "VisitId")
    var VisitId: Int? = null
): Parcelable