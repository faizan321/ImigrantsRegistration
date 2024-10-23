package com.hisdu.meas

import androidx.navigation.NavDirections
import kotlin.String

public class Navigation3Directions private constructor() {
  public companion object {
    public fun actionCategoryFragmentToSearchFragment(text: String): NavDirections =
        CategoryDirections.actionCategoryFragmentToSearchFragment(text)
  }
}
