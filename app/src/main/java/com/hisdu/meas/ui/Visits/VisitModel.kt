package com.hisdu.meas.ui.Visits



import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VisitModel(
    @Json(name = "Error")
    var error: Boolean? = false,
    @Json(name = "List")
    var list: List<Visits>? = listOf(),
    @Json(name = "Message")
    var message: String? = "",
    @Json(name = "StatusCode")
    var statusCode: Int? = 0
)