package com.hisdu.meas.ui.Attendance

import androidx.navigation.NavDirections
import com.hisdu.meas.RecipesDirections

public class AttendanceFragmentDirections private constructor() {
  public companion object {
    public fun actionRecipesFragmentToSearchFragment(): NavDirections =
        RecipesDirections.actionRecipesFragmentToSearchFragment()
  }
}
