package com.zest.android.ui.login

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.leopold.mvvm.data.db.converter.DateConverter
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@TypeConverters(DateConverter::class)
@JsonClass(generateAdapter = true)
@Entity(tableName = "userModel")
data class UserModel(

    @Json(name = "access_token")
    var access_token: String? = "",

    @Json(name = "token_type")
    var token_type: String? = "",


    @Json(name = "UserName")
    var UserName: String? = "",

    @PrimaryKey
    @Json(name = "Id")
    var Id: String,

    @Json(name = "Health Facility")
    var HealthFacility: String? = "",

    @Json(name = "HFCode")
    var HFCode: String? = "",

    @Json(name = "role")
    var role: String? = ""
)
