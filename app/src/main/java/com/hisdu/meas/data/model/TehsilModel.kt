package com.hisdu.meas.data.model

import com.squareup.moshi.Json

data class TehsilModel(
    @Json(name = "Err")
    val Err: String,
    @Json(name = "Msg")
    val Msg: String,
    @Json(name = "TehsilList")
    val districtlists: MutableList<Districtlists>
)