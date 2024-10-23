package com.hisdu.meas.ui.detail

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.hisdu.meas.`data`.model.Recipe
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class DetailFragmentArgs(
  public val recipe: Recipe
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Recipe::class.java)) {
      result.putParcelable("recipe", this.recipe as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Recipe::class.java)) {
      result.putSerializable("recipe", this.recipe as Serializable)
    } else {
      throw UnsupportedOperationException(Recipe::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Recipe::class.java)) {
      result.set("recipe", this.recipe as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Recipe::class.java)) {
      result.set("recipe", this.recipe as Serializable)
    } else {
      throw UnsupportedOperationException(Recipe::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): DetailFragmentArgs {
      bundle.setClassLoader(DetailFragmentArgs::class.java.classLoader)
      val __recipe : Recipe?
      if (bundle.containsKey("recipe")) {
        if (Parcelable::class.java.isAssignableFrom(Recipe::class.java) ||
            Serializable::class.java.isAssignableFrom(Recipe::class.java)) {
          __recipe = bundle.get("recipe") as Recipe?
        } else {
          throw UnsupportedOperationException(Recipe::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__recipe == null) {
          throw IllegalArgumentException("Argument \"recipe\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"recipe\" is missing and does not have an android:defaultValue")
      }
      return DetailFragmentArgs(__recipe)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): DetailFragmentArgs {
      val __recipe : Recipe?
      if (savedStateHandle.contains("recipe")) {
        if (Parcelable::class.java.isAssignableFrom(Recipe::class.java) ||
            Serializable::class.java.isAssignableFrom(Recipe::class.java)) {
          __recipe = savedStateHandle.get<Recipe?>("recipe")
        } else {
          throw UnsupportedOperationException(Recipe::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__recipe == null) {
          throw IllegalArgumentException("Argument \"recipe\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"recipe\" is missing and does not have an android:defaultValue")
      }
      return DetailFragmentArgs(__recipe)
    }
  }
}
