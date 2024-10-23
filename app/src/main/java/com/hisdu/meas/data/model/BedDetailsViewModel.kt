package com.hisdu.meas.data.model

import android.os.Parcelable
import com.hisdu.meas.ui.Feedback.ImagesModel
import kotlinx.android.parcel.Parcelize

@Parcelize
data class BedDetailsViewModel(
    var BedImageDown: String?="",
    var BedImageLeft: String?="",
    var BedImageRight: String?="",
    var BedImageUp: String?="",
    var BedPlacement: String?="",
    var BedRemarks: String?="",
    var BedStatus: String?="",
    var BedType: String?="",
    var CreatedBy: String?="",
    var CreatedDate: String?="",
    var FootStepRemarks: String?="",
    var FootStepStatus: String?="",
    var FootstepImage: String?="",
    var Id: Int?=0,
    var InspectionId:Int?=0,
    var IsFootStepAvailable: String?="",
    var MattressAvailable: String?="",
    var MattressCover: String?="",
    var MattressImageBack: String?="",
    var MattressImageFront: String?="",
    var MattressRemarks: String?="",
    var MattressStatus: String?="",
    var RecordStatus: Boolean?=null
): Parcelable