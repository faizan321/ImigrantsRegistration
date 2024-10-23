package com.hisdu.meas.ui.favorite

import com.hisdu.meas.data.model.Recipe

/**
 * To make an interaction between [FavoriteFragment]
 *
 * Created by ZARA
 */
interface OnFavoriteFragmentInteractionListener {

    fun gotoDetailPage(recipe: Recipe)

    fun showDeleteFavoriteDialog(recipe: Recipe)

    fun isFavorited(recipe: Recipe): Boolean

}
