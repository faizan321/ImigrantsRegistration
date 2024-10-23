package com.hisdu.meas.ui.recipes;

import com.hisdu.meas.data.repository.RecipeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RecipeViewModel_Factory implements Factory<RecipeViewModel> {
  private final Provider<RecipeRepository> recipeRepositoryProvider;

  public RecipeViewModel_Factory(Provider<RecipeRepository> recipeRepositoryProvider) {
    this.recipeRepositoryProvider = recipeRepositoryProvider;
  }

  @Override
  public RecipeViewModel get() {
    return newInstance(recipeRepositoryProvider.get());
  }

  public static RecipeViewModel_Factory create(
      Provider<RecipeRepository> recipeRepositoryProvider) {
    return new RecipeViewModel_Factory(recipeRepositoryProvider);
  }

  public static RecipeViewModel newInstance(RecipeRepository recipeRepository) {
    return new RecipeViewModel(recipeRepository);
  }
}
