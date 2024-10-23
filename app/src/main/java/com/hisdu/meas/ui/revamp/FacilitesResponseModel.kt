package com.hisdu.meas.ui.revamp

data class FacilitesResponseModel(
    var Err: String? = null, // N
    var Msg: String? = null, // Success
    var UserDoneList: List<Facility>? = null
) {
    data class Facility(
        var BHUImage: String? = null, // null
        var Category: String? = null, // Basic Health Unit
        var CategoryCode: String? = null, // 014
        var Created: String? = null, // 16aab820-e25c-4e54-8f39-0780b912a178
        var Desigination: String? = null, // null
        var HFMIS: String? = null, // 0370010010040140001
        var Id: Int? = null, // 2274
        var InspectionDate: String? = null, // 2024-06-27T00:00:00
        var InspectionStatus: String? = null, // Done
        var NoOfBed: String? = null, // null
        var NoOfWheelChair: String? = null, // null
        var Phase: String? = null, // null
        var UserName: String? = null, // patkan@gmail.com
        var bedis: Int? = null, // 3533
        var healthfacility: String? = null // Basic Health Unit, Jatial, Hazro, Attock
    )
}