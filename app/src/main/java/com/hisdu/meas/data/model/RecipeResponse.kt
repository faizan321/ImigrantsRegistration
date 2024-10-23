package com.hisdu.meas.data.model

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class RecipeResponse(@Json(name = "meals") var recipes: List<Recipe>?) : Parcelable