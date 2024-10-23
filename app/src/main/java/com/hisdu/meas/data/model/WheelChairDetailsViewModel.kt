package com.hisdu.meas.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class WheelChairDetailsViewModel(
    var Id: Int?=0,
    var InspectionId: Int?=0,
    var RecordStatus: Boolean?=null,
    var WheelChairRemarks: String?="",
    var WheelChairStatus: String?="",
    var WheelchairImage: String?=""
): Parcelable