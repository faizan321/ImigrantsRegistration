package com.hisdu.meas.ui.recipes

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.hisdu.meas.R
import com.hisdu.meas.RecipesDirections
import com.hisdu.meas.`data`.model.Recipe
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class RecipesFragmentDirections private constructor() {
  private data class ActionRecipesFragmentToDetailFragment(
    public val recipe: Recipe
  ) : NavDirections {
    public override val actionId: Int = R.id.action_recipesFragment_to_detailFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Recipe::class.java)) {
          result.putParcelable("recipe", this.recipe as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Recipe::class.java)) {
          result.putSerializable("recipe", this.recipe as Serializable)
        } else {
          throw UnsupportedOperationException(Recipe::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionRecipesFragmentToDetailFragment(recipe: Recipe): NavDirections =
        ActionRecipesFragmentToDetailFragment(recipe)

    public fun actionRecipesFragmentToSearchFragment(): NavDirections =
        RecipesDirections.actionRecipesFragmentToSearchFragment()
  }
}
