package com.hisdu.meas.ui.main

import com.hisdu.meas.data.model.Category

/**
 * To make interaction between [MainActivity] and its child
 *
 * Created by ZARA
 */
interface OnMainCallback {

    fun gotoSubCategories(category: Category)

}
