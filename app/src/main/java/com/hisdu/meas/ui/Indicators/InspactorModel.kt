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
@Entity
@JsonClass(generateAdapter = true)
@Parcelize
@SafeParcelable.Constructor

data class InspactorModel(
    @PrimaryKey(autoGenerate = true)
    @Json(name = "id")
    var id: Int?=null,
    @Json(name = "name")
    var name: String?=null,
    @Json(name = "mobile_no")
    var mobile_no: String?=null,
    @Json(name = "designation")
    var designation: String?=null,
    @Json(name = "cnic")
    var cnic: String?=null
):Parcelable


