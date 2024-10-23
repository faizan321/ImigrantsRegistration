package com.hisdu.meas.ui.favorite;

import com.hisdu.meas.ui.recipes.RecipeViewModel;
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
public final class FavoriteFragment_MembersInjector implements MembersInjector<FavoriteFragment> {
  private final Provider<RecipeViewModel> viewModelProvider;

  public FavoriteFragment_MembersInjector(Provider<RecipeViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<FavoriteFragment> create(
      Provider<RecipeViewModel> viewModelProvider) {
    return new FavoriteFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(FavoriteFragment instance) {
    injectViewModelProvider(instance, viewModelProvider);
  }

  @InjectedFieldSignature("com.hisdu.meas.ui.favorite.FavoriteFragment.viewModelProvider")
  public static void injectViewModelProvider(FavoriteFragment instance,
      Provider<RecipeViewModel> viewModelProvider) {
    instance.viewModelProvider = viewModelProvider;
  }
}
