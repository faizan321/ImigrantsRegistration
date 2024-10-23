package com.hisdu.meas.ui.migration

data class MigrationRouteModel(
    var err: String? = null, // N
    var res: MutableList<MigrationRoute>? = null
) {
    data class MigrationRoute(
        var Id: Int? = null, // 1
        var MigrantsFrom1: String? = null, // Afghanistan
        var RecordStatus: Boolean? = null // true
    )
}