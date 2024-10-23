package com.hisdu.meas.ui.survey

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class BHUSurveyFragmentArgs(
  public val screenMode: String,
  public val inspectionid: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("screenMode", this.screenMode)
    result.putString("inspectionid", this.inspectionid)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("screenMode", this.screenMode)
    result.set("inspectionid", this.inspectionid)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): BHUSurveyFragmentArgs {
      bundle.setClassLoader(BHUSurveyFragmentArgs::class.java.classLoader)
      val __screenMode : String?
      if (bundle.containsKey("screenMode")) {
        __screenMode = bundle.getString("screenMode")
        if (__screenMode == null) {
          throw IllegalArgumentException("Argument \"screenMode\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"screenMode\" is missing and does not have an android:defaultValue")
      }
      val __inspectionid : String?
      if (bundle.containsKey("inspectionid")) {
        __inspectionid = bundle.getString("inspectionid")
        if (__inspectionid == null) {
          throw IllegalArgumentException("Argument \"inspectionid\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"inspectionid\" is missing and does not have an android:defaultValue")
      }
      return BHUSurveyFragmentArgs(__screenMode, __inspectionid)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): BHUSurveyFragmentArgs {
      val __screenMode : String?
      if (savedStateHandle.contains("screenMode")) {
        __screenMode = savedStateHandle["screenMode"]
        if (__screenMode == null) {
          throw IllegalArgumentException("Argument \"screenMode\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"screenMode\" is missing and does not have an android:defaultValue")
      }
      val __inspectionid : String?
      if (savedStateHandle.contains("inspectionid")) {
        __inspectionid = savedStateHandle["inspectionid"]
        if (__inspectionid == null) {
          throw IllegalArgumentException("Argument \"inspectionid\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"inspectionid\" is missing and does not have an android:defaultValue")
      }
      return BHUSurveyFragmentArgs(__screenMode, __inspectionid)
    }
  }
}
