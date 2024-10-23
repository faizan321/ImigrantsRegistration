package com.hisdu.meas.ui.survey

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.hisdu.meas.R
import com.hisdu.meas.RecipesDirections
import com.hisdu.meas.ui.Indicators.ModuleToSave
import com.hisdu.meas.ui.Indicators.SubmitFormModel
import com.hisdu.meas.ui.Visits.Visits
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.String
import kotlin.Suppress

public class SurveyFragmentDirections private constructor() {
  private data class ActionSurveyFragmentToSectionFragment(
    public val module: ModuleToSave?,
    public val isNew: String?,
    public val masterform: SubmitFormModel,
    public val visit: Visits?
  ) : NavDirections {
    public override val actionId: Int = R.id.action_surveyFragment_to_sectionFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(ModuleToSave::class.java)) {
          result.putParcelable("module", this.module as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(ModuleToSave::class.java)) {
          result.putSerializable("module", this.module as Serializable?)
        } else {
          throw UnsupportedOperationException(ModuleToSave::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        result.putString("isNew", this.isNew)
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
        return result
      }
  }

  public companion object {
    public fun actionSurveyFragmentToSectionFragment(
      module: ModuleToSave?,
      isNew: String?,
      masterform: SubmitFormModel,
      visit: Visits?
    ): NavDirections = ActionSurveyFragmentToSectionFragment(module, isNew, masterform, visit)

    public fun actionRecipesFragmentToSearchFragment(): NavDirections =
        RecipesDirections.actionRecipesFragmentToSearchFragment()
  }
}
