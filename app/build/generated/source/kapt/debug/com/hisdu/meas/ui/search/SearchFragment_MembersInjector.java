package com.hisdu.meas.ui.search;

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
public final class SearchFragment_MembersInjector implements MembersInjector<SearchFragment> {
  private final Provider<RecipeViewModel> viewModelProvider;

  public SearchFragment_MembersInjector(Provider<RecipeViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<SearchFragment> create(
      Provider<RecipeViewModel> viewModelProvider) {
    return new SearchFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(SearchFragment instance) {
    injectViewModelProvider(instance, viewModelProvider);
  }

  @InjectedFieldSignature("com.hisdu.meas.ui.search.SearchFragment.viewModelProvider")
  public static void injectViewModelProvider(SearchFragment instance,
      Provider<RecipeViewModel> viewModelProvider) {
    instance.viewModelProvider = viewModelProvider;
  }
}
