package com.hisdu.meas.ui.category

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.hisdu.meas.CategoryDirections
import com.hisdu.meas.R
import kotlin.String

public class CategoryFragmentDirections private constructor() {
  public companion object {
    public fun actionCategoryFragmentToNavigation2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_categoryFragment_to_navigation2)

    public fun actionCategoryFragmentToSearchFragment(text: String): NavDirections =
        CategoryDirections.actionCategoryFragmentToSearchFragment(text)
  }
}
