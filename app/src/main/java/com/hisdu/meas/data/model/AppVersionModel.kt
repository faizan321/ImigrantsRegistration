package com.hisdu.meas.data.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class AppVersionModel(
    var Err: String? = null, // N
//    var getAppDetail: List<Any?>? = null,
    var getAppStatus: GetAppStatus? = null
) {
    data class GetAppStatus(
        var APPAPK: String? = null, // Integrated Drug Inspection(1.1.6).apk
        var AppVersion: String? = null, // 1.1.6
        var Detail: String? = null, // Integrated Drug Inspection
        var Image: String? = null, // q4yokxco.5mq9661806.svg
        var InsDT: String? = null, // 2024-07-30T17:16:00
        var Name: String? = null, // Integrated Drug Inspection
        var Status: String? = null, // true
        var Type: String? = null, // Others
        var URL: String? = null, // null
        var id: Int? = null, // 91
        var localAPK: String? = null, // Integrated Drug Inspection(1.1.5).apk
        var localURL: String? = null // null
    )
}