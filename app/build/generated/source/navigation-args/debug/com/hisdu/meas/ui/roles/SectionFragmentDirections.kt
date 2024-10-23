package com.hisdu.meas.ui.roles

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.hisdu.meas.R
import com.hisdu.meas.RecipesDirections
import com.hisdu.meas.ui.Indicators.IndicatorCategoryResponse
import com.hisdu.meas.ui.Indicators.SubmitFormModel
import com.hisdu.meas.ui.Visits.Visits
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class SectionFragmentDirections private constructor() {
  private data class ActionSectionFragmentToSurveyFragment(
    public val masterform: SubmitFormModel,
    public val visit: Visits?,
    public val indicators: IndicatorCategoryResponse?
  ) : NavDirections {
    public override val actionId: Int = R.id.action_sectionFragment_to_surveyFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(SubmitFormModel::class.java)) {
          result.putParcelable("masterform", this.masterform as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(SubmitFormModel::class.java)) {
          result.putSerializable("masterform", this.masterform as Serializable)
        } else {
          throw UnsupportedOperationException(SubmitFormModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (Parcelable::class.java.isAssignableFrom(Visits::class.java)) {
          result.putParcelable("visit", this.visit as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(Visits::class.java)) {
          result.putSerializable("visit", this.visit as Serializable?)
        } else {
          throw UnsupportedOperationException(Visits::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (Parcelable::class.java.isAssignableFrom(IndicatorCategoryResponse::class.java)) {
          result.putParcelable("indicators", this.indicators as Parcelable?)
        } else if
            (Serializable::class.java.isAssignableFrom(IndicatorCategoryResponse::class.java)) {
          result.putSerializable("indicators", this.indicators as Serializable?)
        } else {
          throw UnsupportedOperationException(IndicatorCategoryResponse::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionSectionFragmentToSurveyFragment(
      masterform: SubmitFormModel,
      visit: Visits?,
      indicators: IndicatorCategoryResponse?
    ): NavDirections = ActionSectionFragmentToSurveyFragment(masterform, visit, indicators)

    public fun actionSectionFragmentToDashboardFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_sectionFragment_to_dashboardFragment)

    public fun actionRecipesFragmentToSearchFragment(): NavDirections =
        RecipesDirections.actionRecipesFragmentToSearchFragment()
  }
}
