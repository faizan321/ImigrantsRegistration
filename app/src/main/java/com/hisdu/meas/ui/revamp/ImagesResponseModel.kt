package com.hisdu.meas.ui.revamp

data class ImagesResponseModel(
    var Err: String? = null, // N
    var Msg: String? = null, // Success
    var imageList: MutableList<BHUImageModel>? = null
) {
    data class BHUImageModel(
        var Id: Int? = null, // 1
        var ImageFor: String? = null, // 013,014
        var ImageName: String? = null, // ENTRANCE SIGN BOARD
        var RecordStatus: Boolean? = null, // true,
        var imagePath:String?=null,
        var Isrequired:Boolean?=null,
        var ShowInHIS:Boolean?=null
    )
}