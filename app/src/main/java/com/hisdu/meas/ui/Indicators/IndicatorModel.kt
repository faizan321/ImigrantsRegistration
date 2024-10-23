package com.hisdu.meas.ui.Indicators


import android.graphics.Bitmap
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.google.android.gms.common.internal.safeparcel.SafeParcelable
import com.leopold.mvvm.data.db.converter.DateConverter
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.IgnoredOnParcel
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@JsonClass(generateAdapter = true)
data class IndicatorModel(
    @Json(name = "StatusCode")
    var statusCode: Int?,

    @Json(name = "Message")
    var message: String?,
    @Json(name = "Error")
    var error: Boolean?,
    @Json(name = "List")
    var list: List<IndicatorCategoryResponse>?
)


@JsonClass(generateAdapter = true)
@Parcelize
data class IndicatorCategoryResponse(

    @Json(name = "CaegoryId")
    var caegoryId: Int?=null,
    @Json(name = "CategoryName")
    var categoryName: String?=null,
    @Json(name = "ApplicationType")
    var applicationType: Int?=null,
    @Json(name = "ModuleId")
    var moduleId: Int?=null,
    @Json(name = "SequenceNo")
    var SequenceNo: Int?=null,
    @Json(name = "Indicators")
    var indicators: @RawValue MutableList<Indicator>?=arrayListOf(),
    @Ignore
    var IsSubmitted: Boolean?=null,
    @Json(name = "IsRequired")
    var isRequired:Boolean?=null
) : Parcelable

@Entity
@JsonClass(generateAdapter = true)
@Parcelize
data class IndicatorCategory(
    @PrimaryKey
    @Json(name = "CaegoryId")
    var caegoryId: Int?,
    @Json(name = "CategoryName")
    var categoryName: String?,
    @Json(name = "ApplicationType")
    var applicationType: Int?,
    @Json(name = "ModuleId")
    var moduleId: Int?,
    @Json(name = "SequenceNo")
    var SequenceNo: Int?,
    @Json(name = "IsRequired")
    var IsRequired:Boolean?=null
) : Parcelable{
    @Ignore
    var IsSubmitted: Boolean?=null
}


//@Parcelize
//@JsonClass(generateAdapter = true)
//data class SubCategory(
//    @Json(name = "SubCaegoryId")
//    var subCaegoryId: Int?,
//    @Json(name = "SubCategoryName")
//    var subCategoryName: String?,
//    @Json(name = "Indicators")
//    var indicators: List<Indicator?>?
//):Parcelable

@Entity
@Parcelize
@TypeConverters(DateConverter::class)
@JsonClass(generateAdapter = true)
@SafeParcelable.Constructor
data class Indicator (
    @PrimaryKey
    @Json(name = "IndicatorId")
    var indicatorId: Int?=null,
    @Json(name = "ParentIndicatorId")
    var ParentIndicatorId: Int?=null,
    @Json(name = "Question")
    var question: String?=null,
    @Json(name = "showInCase")
    var showInCase: Int?=null,
    @Json(name = "showRemarksInCase")
    var showRemarksInCase: Int?=null,
    @Json(name = "SequenceNo")
    var sequenceNo: Int?=null,
    @Json(name = "OptionsType")
    var optionsType: String?=null,
    @Json(name = "SelectedValue")
    var selectedValue: String = "",
    @Json(name = "RemarkValue")
    var remarkValue: String = "",
    @Json(name = "Options")
    var options: List<Option?>?=null,

    @Ignore
    @Json(name = "SubIndicators")
    var subIndicators: List<Indicator>?=null,

    @Json(name = "CategoryId")
    var CategoryId: Int?=null,
    @Json(name = "Shifts")
    var Shifts: List<Int?>?=null,
    @Json(name = "HFTypes")
    var HFTypes: List<Int?>?=null,
    @Json(name = "HFs")
    var HFs: List<Int?>?=null,
    @Json(name = "InputType")
    var InputType: String?=null,
    @Json(name = "DefaultValue")
    var DefaultValue: String?=null,
    @Json(name = "minvalue")
    var minvalue: Int? = 0,
    @Json(name = "maxvalue")
    var maxvalue: Int? = null,
    @Json(name = "IsOptionTotal")
    var IsOptionTotal: Boolean?=null,
    @Json(name = "IsOptionCalculation")
    var IsOptionCalculation: Boolean?=null,
    @Json(name = "IsOptionEditable")
    var IsOptionEditable: Boolean?=null,
    @Json(name = "IsOptionTagged")
    var IsOptionTagged: Boolean?=null,
    @Json(name = "IsPhysicalView")
    var IsPhysicalView: Boolean?=null,
    @Json(name = "IsCalculation")
    var IsCalculation: Boolean?=null,
    @Json(name = "IsRequired")
    var IsRequired: Boolean?=null
) : Parcelable{
    @Ignore
    var IsSubmitted: Boolean?=null
}

@Parcelize
@JsonClass(generateAdapter = true)
data class Option(
    @Json(name = "OptionId")
    var optionId: Int?,
    @Json(name = "Label")
    var label: String?,
    @Json(name = "Type")
    var type: String?,
    @Json(name = "IsOptionTotal")
    var isOptionTotal: Boolean?,
    @Json(name = "IsOptionCalculation")
    var isOptionCalculation: Boolean?,
    @Json(name = "IsOptionEditable")
    var isOptionEditable: Boolean?,
    @Json(name = "IsOptionTagged")
    var isOptionTagged: Boolean?,
    @Json(name = "DefaultValue")
    var defaultValue: String?
) : Parcelable


