package com.hisdu.meas.ui.Dashboard

import com.hisdu.meas.data.model.Recipe
import com.hisdu.meas.ui.Indicators.ModuleToSave

/**
 * To make an interaction between [RecipesFragment] and [RecipeViewModel]
 */
interface ModuleClickListener {

    fun onClick(recipe: ModuleToSave)

}
