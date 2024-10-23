package com.hisdu.meas.ui.roles

import com.hisdu.meas.ui.Indicators.IndicatorCategory
import com.hisdu.meas.ui.Indicators.IndicatorCategoryResponse


interface SectionClickListener {

    fun onClick(recipe: IndicatorCategoryResponse)

}
