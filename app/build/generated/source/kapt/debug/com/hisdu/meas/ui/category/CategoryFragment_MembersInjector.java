package com.hisdu.meas.ui.category;

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
public final class CategoryFragment_MembersInjector implements MembersInjector<CategoryFragment> {
  private final Provider<CategoryViewModel> viewModelProvider;

  public CategoryFragment_MembersInjector(Provider<CategoryViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<CategoryFragment> create(
      Provider<CategoryViewModel> viewModelProvider) {
    return new CategoryFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(CategoryFragment instance) {
    injectViewModelProvider(instance, viewModelProvider);
  }

  @InjectedFieldSignature("com.hisdu.meas.ui.category.CategoryFragment.viewModelProvider")
  public static void injectViewModelProvider(CategoryFragment instance,
      Provider<CategoryViewModel> viewModelProvider) {
    instance.viewModelProvider = viewModelProvider;
  }
}
