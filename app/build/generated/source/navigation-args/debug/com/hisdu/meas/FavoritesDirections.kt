package com.hisdu.meas

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class FavoritesDirections private constructor() {
  public companion object {
    public fun actionFavoritesFragmentToSearchFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_favoritesFragment_to_searchFragment)
  }
}
