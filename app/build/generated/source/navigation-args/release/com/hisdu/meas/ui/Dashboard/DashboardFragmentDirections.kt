package com.hisdu.meas.ui.Dashboard

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.hisdu.meas.R
import com.hisdu.meas.RecipesDirections

public class DashboardFragmentDirections private constructor() {
  public companion object {
    public fun actionDashboardFragmentToMasterIndicatorsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_dashboardFragment_to_masterIndicatorsFragment)

    public fun actionRecipesFragmentToSearchFragment(): NavDirections =
        RecipesDirections.actionRecipesFragmentToSearchFragment()
  }
}
