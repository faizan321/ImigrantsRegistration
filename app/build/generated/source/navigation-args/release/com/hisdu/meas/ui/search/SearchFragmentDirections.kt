package com.hisdu.meas.ui.search

import androidx.navigation.NavDirections
import com.hisdu.meas.FavoritesDirections

public class SearchFragmentDirections private constructor() {
  public companion object {
    public fun actionFavoritesFragmentToSearchFragment(): NavDirections =
        FavoritesDirections.actionFavoritesFragmentToSearchFragment()
  }
}
