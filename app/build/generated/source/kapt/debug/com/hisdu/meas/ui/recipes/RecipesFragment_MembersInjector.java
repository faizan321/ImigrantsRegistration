package com.hisdu.meas.ui.recipes;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
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
public final class RecipesFragment_MembersInjector implements MembersInjector<RecipesFragment> {
  private final Provider<RecipeViewModel> viewModelProvider;

  public RecipesFragment_MembersInjector(Provider<RecipeViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<RecipesFragment> create(
      Provider<RecipeViewModel> viewModelProvider) {
    return new RecipesFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(RecipesFragment instance) {
    injectViewModelProvider(instance, viewModelProvider);
  }

  @InjectedFieldSignature("com.hisdu.meas.ui.recipes.RecipesFragment.viewModelProvider")
  public static void injectViewModelProvider(RecipesFragment instance,
      Provider<RecipeViewModel> viewModelProvider) {
    instance.viewModelProvider = viewModelProvider;
  }
}
