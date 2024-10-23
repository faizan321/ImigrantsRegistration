package com.hisdu.meas.ui.detail

import androidx.navigation.NavDirections
import com.hisdu.meas.FavoritesDirections

public class DetailFragmentDirections private constructor() {
  public companion object {
    public fun actionFavoritesFragmentToSearchFragment(): NavDirections =
        FavoritesDirections.actionFavoritesFragmentToSearchFragment()
  }
}
