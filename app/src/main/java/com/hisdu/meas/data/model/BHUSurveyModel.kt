package com.hisdu.meas.data.model

import com.hisdu.meas.ui.Indicators.SubmitFormModel

data class BHUSurveyModel(
//    var recordList: MutableList<SubmitFormModel> = mutableListOf<SubmitFormModel>(),
    var BedDetailsViewModel:MutableList<BedDetailsViewModel> = mutableListOf<BedDetailsViewModel>(),
    var Created: String?=null,
    var CreatedDate: String?=null,
    var Desigination: String?=null,
    var HFMISCode: String?=null,
    var Id: Int?=0,
    var InspectionId: Int?=null,
    var Latitude: String?=null,
    var Longitude: String?=null,
    var NoOfBed: Int?=null,
    var NoOfWheelChair: Int?=null,
    var Phase: String?=null,
    var RecordStatus: Boolean?=null,
    var BHUImage:String?=null,
    var WheelChairDetailsViewModel: MutableList<WheelChairDetailsViewModel> = mutableListOf<WheelChairDetailsViewModel>()
)