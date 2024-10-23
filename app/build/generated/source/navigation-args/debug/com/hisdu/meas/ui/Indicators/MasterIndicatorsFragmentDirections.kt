package com.hisdu.meas.ui.Indicators

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.hisdu.meas.R
import com.hisdu.meas.RecipesDirections
import com.hisdu.meas.ui.Visits.Visits
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.String
import kotlin.Suppress

public class MasterIndicatorsFragmentDirections private constructor() {
  private data class ActionMasterIndicatorsFragmentToModuleFragment(
    public val masterform: SubmitFormModel,
    public val visit: Visits?,
    public val isNew: String?
  ) : NavDirections {
    public override val actionId: Int = R.id.action_masterIndicatorsFragment_to_moduleFragment

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
        result.putString("isNew", this.isNew)
        return result
      }
  }

  private data class ActionMasterIndicatorsFragmentToBHUSurveyFragment(
    public val screenMode: String,
    public val inspectionid: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_masterIndicatorsFragment_to_BHUSurveyFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("screenMode", this.screenMode)
        result.putString("inspectionid", this.inspectionid)
        return result
      }
  }

  public companion object {
    public fun actionMasterIndicatorsFragmentToModuleFragment(
      masterform: SubmitFormModel,
      visit: Visits?,
      isNew: String?
    ): NavDirections = ActionMasterIndicatorsFragmentToModuleFragment(masterform, visit, isNew)

    public fun actionMasterIndicatorsFragmentToBHUSurveyFragment(screenMode: String,
        inspectionid: String): NavDirections =
        ActionMasterIndicatorsFragmentToBHUSurveyFragment(screenMode, inspectionid)

    public fun actionRecipesFragmentToSearchFragment(): NavDirections =
        RecipesDirections.actionRecipesFragmentToSearchFragment()
  }
}
