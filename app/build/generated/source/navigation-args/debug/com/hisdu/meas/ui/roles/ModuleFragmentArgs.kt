package com.hisdu.meas.ui.roles

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.hisdu.meas.ui.Indicators.SubmitFormModel
import com.hisdu.meas.ui.Visits.Visits
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ModuleFragmentArgs(
  public val masterform: SubmitFormModel,
  public val visit: Visits?,
  public val isNew: String?
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(SubmitFormModel::class.java)) {
      result.putParcelable("masterform", this.masterform as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(SubmitFormModel::class.java)) {
      result.putSerializable("masterform", this.masterform as Serializable)
    } else {
      throw UnsupportedOperationException(SubmitFormModel::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    if (Parcelable::class.java.isAssignableFrom(Visits::class.java)) {
      result.putParcelable("visit", this.visit as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Visits::class.java)) {
      result.putSerializable("visit", this.visit as Serializable?)
    } else {
      throw UnsupportedOperationException(Visits::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.putString("isNew", this.isNew)
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(SubmitFormModel::class.java)) {
      result.set("masterform", this.masterform as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(SubmitFormModel::class.java)) {
      result.set("masterform", this.masterform as Serializable)
    } else {
      throw UnsupportedOperationException(SubmitFormModel::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    if (Parcelable::class.java.isAssignableFrom(Visits::class.java)) {
      result.set("visit", this.visit as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Visits::class.java)) {
      result.set("visit", this.visit as Serializable?)
    } else {
      throw UnsupportedOperationException(Visits::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.set("isNew", this.isNew)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ModuleFragmentArgs {
      bundle.setClassLoader(ModuleFragmentArgs::class.java.classLoader)
      val __masterform : SubmitFormModel?
      if (bundle.containsKey("masterform")) {
        if (Parcelable::class.java.isAssignableFrom(SubmitFormModel::class.java) ||
            Serializable::class.java.isAssignableFrom(SubmitFormModel::class.java)) {
          __masterform = bundle.get("masterform") as SubmitFormModel?
        } else {
          throw UnsupportedOperationException(SubmitFormModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__masterform == null) {
          throw IllegalArgumentException("Argument \"masterform\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"masterform\" is missing and does not have an android:defaultValue")
      }
      val __visit : Visits?
      if (bundle.containsKey("visit")) {
        if (Parcelable::class.java.isAssignableFrom(Visits::class.java) ||
            Serializable::class.java.isAssignableFrom(Visits::class.java)) {
          __visit = bundle.get("visit") as Visits?
        } else {
          throw UnsupportedOperationException(Visits::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"visit\" is missing and does not have an android:defaultValue")
      }
      val __isNew : String?
      if (bundle.containsKey("isNew")) {
        __isNew = bundle.getString("isNew")
      } else {
        throw IllegalArgumentException("Required argument \"isNew\" is missing and does not have an android:defaultValue")
      }
      return ModuleFragmentArgs(__masterform, __visit, __isNew)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ModuleFragmentArgs {
      val __masterform : SubmitFormModel?
      if (savedStateHandle.contains("masterform")) {
        if (Parcelable::class.java.isAssignableFrom(SubmitFormModel::class.java) ||
            Serializable::class.java.isAssignableFrom(SubmitFormModel::class.java)) {
          __masterform = savedStateHandle.get<SubmitFormModel?>("masterform")
        } else {
          throw UnsupportedOperationException(SubmitFormModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__masterform == null) {
          throw IllegalArgumentException("Argument \"masterform\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"masterform\" is missing and does not have an android:defaultValue")
      }
      val __visit : Visits?
      if (savedStateHandle.contains("visit")) {
        if (Parcelable::class.java.isAssignableFrom(Visits::class.java) ||
            Serializable::class.java.isAssignableFrom(Visits::class.java)) {
          __visit = savedStateHandle.get<Visits?>("visit")
        } else {
          throw UnsupportedOperationException(Visits::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"visit\" is missing and does not have an android:defaultValue")
      }
      val __isNew : String?
      if (savedStateHandle.contains("isNew")) {
        __isNew = savedStateHandle["isNew"]
      } else {
        throw IllegalArgumentException("Required argument \"isNew\" is missing and does not have an android:defaultValue")
      }
      return ModuleFragmentArgs(__masterform, __visit, __isNew)
    }
  }
}
