package com.hisdu.meas

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

public class CategoryDirections private constructor() {
  private data class ActionCategoryFragmentToSearchFragment(
    public val text: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_categoryFragment_to_searchFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("text", this.text)
        return result
      }
  }

  public companion object {
    public fun actionCategoryFragmentToSearchFragment(text: String): NavDirections =
        ActionCategoryFragmentToSearchFragment(text)
  }
}
