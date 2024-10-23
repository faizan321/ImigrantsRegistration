package com.hisdu.meas.ui.Dashboard

import com.hisdu.meas.data.model.Recipe
import com.hisdu.meas.ui.Visits.Visits

/**
 * To make an interaction between [RecipesFragment] and [RecipeViewModel]
 */
interface VisitClickListener {

    fun onClick(visit: Visits)

}
