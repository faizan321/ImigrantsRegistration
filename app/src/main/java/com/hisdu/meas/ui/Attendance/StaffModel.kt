package com.hisdu.meas.ui.Attendance

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize
@Parcelize
data class StaffModel(
    var id: Int,
    var name: String,
    var designationTitle: String? = null,
    var mobile: String? = null,
    var cnic: String? = null,
    var presenceStatusTitle: String? = null,
    var designationId: String? = null,
    var presenceStatusId: String? = null
):Parcelable