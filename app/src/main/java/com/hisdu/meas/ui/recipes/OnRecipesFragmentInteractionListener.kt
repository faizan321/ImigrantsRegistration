package com.hisdu.meas.ui.recipes

import com.hisdu.meas.data.model.Recipe

/**
 * To make an interaction between [RecipesFragment] and [RecipeViewModel]
 */
interface OnRecipesFragmentInteractionListener {

    fun showMessage(message: Int)

    fun gotoDetailPage(recipe: Recipe)

    fun loadFavorite(recipe: Recipe): Recipe?

    fun removeFavorite(recipe: Recipe)

    fun addOrRemoveFavorites(recipe: Recipe)

    fun isFavorited(recipe: Recipe): Boolean

}
