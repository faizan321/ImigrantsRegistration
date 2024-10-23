package com.hisdu.meas.ui.migration

data class MigrationSaveResponseModel(
    var Msg: String? = null, // Data Save Successfully
    var Status: Boolean? = null, // true
    var err: String? = null, // N
    var res: Int? = null // 1
)