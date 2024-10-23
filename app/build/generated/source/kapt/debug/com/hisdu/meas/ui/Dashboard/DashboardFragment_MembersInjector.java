package com.hisdu.meas.ui.Dashboard;

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
public final class DashboardFragment_MembersInjector implements MembersInjector<DashboardFragment> {
  private final Provider<DashboardViewModel> viewModelProvider;

  public DashboardFragment_MembersInjector(Provider<DashboardViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<DashboardFragment> create(
      Provider<DashboardViewModel> viewModelProvider) {
    return new DashboardFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(DashboardFragment instance) {
    injectViewModelProvider(instance, viewModelProvider);
  }

  @InjectedFieldSignature("com.hisdu.meas.ui.Dashboard.DashboardFragment.viewModelProvider")
  public static void injectViewModelProvider(DashboardFragment instance,
      Provider<DashboardViewModel> viewModelProvider) {
    instance.viewModelProvider = viewModelProvider;
  }
}
