package com.hisdu.meas.ui.Indicators

import android.widget.ImageView

/**
 * To make an interaction between [RecipesFragment] and [RecipeViewModel]
 */
interface IndicatorListener {

    fun onDataChange(recipe: Indicator)
    fun onLoadDatePicker(indicator:Indicator)
    fun onImagePicker(indicator:Indicator,imageview: ImageView)

}
