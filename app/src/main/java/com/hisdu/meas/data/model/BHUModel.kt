package com.hisdu.meas.data.model

data class BHUModel(
    val Err: String,
    val Msg: String,
    val bhulists: MutableList<Bhulists>
)