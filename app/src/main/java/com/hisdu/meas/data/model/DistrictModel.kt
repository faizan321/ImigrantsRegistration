package com.hisdu.meas.data.model

import com.squareup.moshi.Json

data class DistrictModel(
    @Json(name = "Err")
    val Err: String,
    @Json(name = "Msg")
    val Msg: String,
    @Json(name = "districtlists")
    val districtlists: MutableList<Districtlists>
)