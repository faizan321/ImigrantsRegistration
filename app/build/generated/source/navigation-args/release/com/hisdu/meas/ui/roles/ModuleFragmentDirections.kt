package com.hisdu.meas.ui.roles

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
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

public class ModuleFragmentDirections private constructor() {
  private data class ActionModuleFragmentToSectionFragment(
    public val masterform: SubmitFormModel,
    public val visit: Visits?,
    public val module: ModuleToSave?,
    public val isNew: String?
  ) : NavDirections {
    public override val actionId: Int = R.id.action_moduleFragment_to_sectionFragment

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
        if (Parcelable::class.java.isAssignableFrom(ModuleToSave::class.java)) {
          result.putParcelable("module", this.module as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(ModuleToSave::class.java)) {
          result.putSerializable("module", this.module as Serializable?)
        } else {
          throw UnsupportedOperationException(ModuleToSave::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        result.putString("isNew", this.isNew)
        return result
      }
  }

  private data class ActionModuleFragmentToFeedbackFragment(
    public val masterform: SubmitFormModel?,
    public val categoryname: String?,
    public val visit: Visits?
  ) : NavDirections {
    public override val actionId: Int = R.id.action_moduleFragment_to_feedbackFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(SubmitFormModel::class.java)) {
          result.putParcelable("masterform", this.masterform as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(SubmitFormModel::class.java)) {
          result.putSerializable("masterform", this.masterform as Serializable?)
        } else {
          throw UnsupportedOperationException(SubmitFormModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        result.putString("categoryname", this.categoryname)
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

  private data class ActionModuleFragmentToAttendanceFragment(
    public val masterform: SubmitFormModel,
    public val categoryname: String?
  ) : NavDirections {
    public override val actionId: Int = R.id.action_moduleFragment_to_attendanceFragment

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
        result.putString("categoryname", this.categoryname)
        return result
      }
  }

  public companion object {
    public fun actionModuleFragmentToSectionFragment(
      masterform: SubmitFormModel,
      visit: Visits?,
      module: ModuleToSave?,
      isNew: String?
    ): NavDirections = ActionModuleFragmentToSectionFragment(masterform, visit, module, isNew)

    public fun actionModuleFragmentToFeedbackFragment(
      masterform: SubmitFormModel?,
      categoryname: String?,
      visit: Visits?
    ): NavDirections = ActionModuleFragmentToFeedbackFragment(masterform, categoryname, visit)

    public fun actionModuleFragmentToAttendanceFragment(masterform: SubmitFormModel,
        categoryname: String?): NavDirections = ActionModuleFragmentToAttendanceFragment(masterform,
        categoryname)

    public fun actionModuleFragmentToDashboardFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_moduleFragment_to_dashboardFragment)

    public fun actionRecipesFragmentToSearchFragment(): NavDirections =
        RecipesDirections.actionRecipesFragmentToSearchFragment()
  }
}
