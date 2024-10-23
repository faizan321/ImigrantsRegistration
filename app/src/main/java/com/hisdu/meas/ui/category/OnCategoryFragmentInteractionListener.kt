package com.hisdu.meas.ui.category

import com.hisdu.meas.data.model.Category

/**
 * To make an interaction between [CategoryFragment] and [CategoryViewModel]
 *
 * Created by ZARA
 */
interface OnCategoryFragmentInteractionListener {

    fun showSubCategories(category: Category)

}