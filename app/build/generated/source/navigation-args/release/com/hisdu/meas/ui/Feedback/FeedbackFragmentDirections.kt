package com.hisdu.meas.ui.Feedback

import androidx.navigation.NavDirections
import com.hisdu.meas.RecipesDirections

public class FeedbackFragmentDirections private constructor() {
  public companion object {
    public fun actionRecipesFragmentToSearchFragment(): NavDirections =
        RecipesDirections.actionRecipesFragmentToSearchFragment()
  }
}
