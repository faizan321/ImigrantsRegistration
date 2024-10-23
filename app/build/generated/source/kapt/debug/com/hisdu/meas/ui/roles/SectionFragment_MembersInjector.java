package com.hisdu.meas.ui.roles;

import com.hisdu.meas.ui.Dashboard.DashboardViewModel;
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
public final class SectionFragment_MembersInjector implements MembersInjector<SectionFragment> {
  private final Provider<DashboardViewModel> viewModelProvider;

  public SectionFragment_MembersInjector(Provider<DashboardViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<SectionFragment> create(
      Provider<DashboardViewModel> viewModelProvider) {
    return new SectionFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(SectionFragment instance) {
    injectViewModelProvider(instance, viewModelProvider);
  }

  @InjectedFieldSignature("com.hisdu.meas.ui.roles.SectionFragment.viewModelProvider")
  public static void injectViewModelProvider(SectionFragment instance,
      Provider<DashboardViewModel> viewModelProvider) {
    instance.viewModelProvider = viewModelProvider;
  }
}
