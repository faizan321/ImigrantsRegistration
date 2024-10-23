package com.hisdu.meas.data.model

import androidx.room.Entity
import androidx.room.TypeConverters
import com.leopold.mvvm.data.db.converter.DateConverter
import com.squareup.moshi.JsonClass

//@JsonClass(generateAdapter = true)
//@Entity(tableName = "AppStatus")

data class GetAppStatus(
    val APPAPK: String,
    val AppVersion: String,
    val Detail: Any,
    val Image: String,
    val InsDT: String,
    val Name: String,
    val Status: String,
    val Type: String,
    val URL: Any,
    val id: Int,
    val localAPK: String,
    val localURL: Any
)