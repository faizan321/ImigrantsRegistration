package com.hisdu.meas.ui.migration

data class MigrantsListResponse(
    var err: String? = null, // N
    var res: MutableList<MigrantRecord>? = null
) {
    data class MigrantRecord(
        var Address: String? = null, // string
        var Adult: Int? = null, // 0
        var CreatedBy: String? = null, // 2dfc2445-2ffe-48d4-8c1c-cfacaf0af998
        var CreatedDate: String? = null, // 2024-10-23T14:58:47.883
        var FamilyHeadCNIC: String? = null, // string
        var FamilyHeadName: String? = null, // string
        var Id: Int? = null, // 1
        var Kids: Int? = null, // 0
        var Latitude: Double? = null, // 31.5487171
        var NoOfHouseHold: Int? = null, // 0
        var RouteOfMigrants: String? = null, // string
        var longitude: Double? = null // 74.3243546
    )
}