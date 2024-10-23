package com.hisdu.meas.ui.Feedback

import android.os.Parcelable
import com.hisdu.meas.ui.Attendance.StaffModel
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
data class FeedbackSubmitModel(

    var images: @RawValue MutableList<ImagesModel> = arrayListOf(),
    var meaComment:String="",
    var facility_incharge_comment:String=""
):Parcelable