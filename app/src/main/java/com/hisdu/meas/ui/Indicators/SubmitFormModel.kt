package com.hisdu.meas.ui.Indicators

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.hisdu.meas.ui.Attendance.StaffModel
import com.hisdu.meas.ui.Feedback.FeedbackSubmitModel
import com.leopold.mvvm.data.db.converter.DateConverter
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Entity
@Parcelize
@TypeConverters(DateConverter::class)
@JsonClass(generateAdapter = true)
data class SubmitFormModel(

    var HFMISCode: String?=null,
    var facilityType: String?=null,
    var visityType: String?=null,
    var visitId:Int?=null,
    var facility: String?=null,
    var facilityName: String?=null,
    var facilityStatus:Boolean?=null,
    var closeReason: String?=null,
    var comment:String?=null,
    var illegalOccupation:Boolean?=null,
    var wholeOrPart:String?=null,
    var date:String?=null,
    var moduleId:Int?=null,
    var applicationTypeid:Int?=null,
    var latitude:String?=null,
    var longitude:String?=null,
    var CreatedOn:String?=null,
    var isFeedbackSubmited:Boolean?=null,
    var attendanceList:  @RawValue MutableList<StaffModel> = arrayListOf(),
    var listofModules: @RawValue MutableList<ModuleToSave> = arrayListOf(),
    var feedback :  @RawValue FeedbackSubmitModel? = null,
    var userid:Int?=null,
    var isSync:Int?=null,
    var incharge: @RawValue InspactorModel?=null,
    @PrimaryKey(autoGenerate = true)
    var id:Int?=null,
    var visitTypeName:String?=null,
    var faciltyTypeName:String?=null,
    var AmbulanceNo:String?=null
):Parcelable

@Parcelize
@TypeConverters(DateConverter::class)
data class ModuleToSave(

    var applicationTypeId: Int?=null ,
    var moduleId: Int?=null ,
    var moduleName: String? =null,
    var isSubmited:Boolean?=null,
    var isRequired:Boolean?=null,
    var indicatorslist :  @RawValue MutableList<IndicatorCategoryResponse> = arrayListOf(),
):Parcelable


