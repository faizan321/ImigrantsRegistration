package com.hisdu.meas.ui.revamp

data class EligibilityResponseModel(
    var Err: String? = null, // Y
    var Msg: String? = null, // Not Eligible For Inspection
    var isElgible: Boolean? = null // false
)