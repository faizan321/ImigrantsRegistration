package com.hisdu.meas.data.model

import android.net.Uri
import com.squareup.moshi.Json

data class ImageModel(

    var imageName:String?=null,
    var imagePath: Uri? = null,
    var isFirstImage: Boolean = false
)