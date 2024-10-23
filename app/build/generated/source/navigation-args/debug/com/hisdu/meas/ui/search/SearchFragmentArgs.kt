package com.hisdu.meas.ui.search

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class SearchFragmentArgs(
  public val text: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("text", this.text)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("text", this.text)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SearchFragmentArgs {
      bundle.setClassLoader(SearchFragmentArgs::class.java.classLoader)
      val __text : String?
      if (bundle.containsKey("text")) {
        __text = bundle.getString("text")
        if (__text == null) {
          throw IllegalArgumentException("Argument \"text\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"text\" is missing and does not have an android:defaultValue")
      }
      return SearchFragmentArgs(__text)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): SearchFragmentArgs {
      val __text : String?
      if (savedStateHandle.contains("text")) {
        __text = savedStateHandle["text"]
        if (__text == null) {
          throw IllegalArgumentException("Argument \"text\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"text\" is missing and does not have an android:defaultValue")
      }
      return SearchFragmentArgs(__text)
    }
  }
}
