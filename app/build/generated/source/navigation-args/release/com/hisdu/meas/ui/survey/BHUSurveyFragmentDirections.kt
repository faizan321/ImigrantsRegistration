package com.hisdu.meas.ui.survey

import androidx.navigation.NavDirections
import com.hisdu.meas.RecipesDirections

public class BHUSurveyFragmentDirections private constructor() {
  public companion object {
    public fun actionRecipesFragmentToSearchFragment(): NavDirections =
        RecipesDirections.actionRecipesFragmentToSearchFragment()
  }
}
