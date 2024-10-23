package com.hisdu.meas.ui.roles

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.hisdu.meas.R
import com.hisdu.meas.RecipesDirections

public class RolesFragmentDirections private constructor() {
  public companion object {
    public fun actionRolesFragmentToDashboardFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_rolesFragment_to_dashboardFragment)

    public fun actionRecipesFragmentToSearchFragment(): NavDirections =
        RecipesDirections.actionRecipesFragmentToSearchFragment()
  }
}
