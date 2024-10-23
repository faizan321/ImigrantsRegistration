package com.hisdu.meas

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class RecipesDirections private constructor() {
  public companion object {
    public fun actionRecipesFragmentToSearchFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_recipesFragment_to_searchFragment)
  }
}
