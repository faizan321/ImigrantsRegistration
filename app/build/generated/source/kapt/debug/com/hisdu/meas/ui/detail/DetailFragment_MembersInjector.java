package com.hisdu.meas.ui.detail;

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
public final class DetailFragment_MembersInjector implements MembersInjector<DetailFragment> {
  private final Provider<RecipeViewModel> viewModelProvider;

  public DetailFragment_MembersInjector(Provider<RecipeViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<DetailFragment> create(
      Provider<RecipeViewModel> viewModelProvider) {
    return new DetailFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(DetailFragment instance) {
    injectViewModelProvider(instance, viewModelProvider);
  }

  @InjectedFieldSignature("com.hisdu.meas.ui.detail.DetailFragment.viewModelProvider")
  public static void injectViewModelProvider(DetailFragment instance,
      Provider<RecipeViewModel> viewModelProvider) {
    instance.viewModelProvider = viewModelProvider;
  }
}
