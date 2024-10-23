package com.hisdu.meas.data.model

import androidx.room.Entity
import com.squareup.moshi.JsonClass

//@JsonClass(generateAdapter = true)
//@Entity(tableName = "AppDetail")
data class GetAppDetail(
    val AppID: Int,
    val CreateBy: String,
    val CreatedDT: String,
    val HisduAPP: Any,
    val Id: Int,
    val Name: String,
    val Value: String
)