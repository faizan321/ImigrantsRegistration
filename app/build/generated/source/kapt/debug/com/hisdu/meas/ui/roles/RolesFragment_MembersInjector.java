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
public final class RolesFragment_MembersInjector implements MembersInjector<RolesFragment> {
  private final Provider<DashboardViewModel> viewModelProvider;

  public RolesFragment_MembersInjector(Provider<DashboardViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<RolesFragment> create(
      Provider<DashboardViewModel> viewModelProvider) {
    return new RolesFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(RolesFragment instance) {
    injectViewModelProvider(instance, viewModelProvider);
  }

  @InjectedFieldSignature("com.hisdu.meas.ui.roles.RolesFragment.viewModelProvider")
  public static void injectViewModelProvider(RolesFragment instance,
      Provider<DashboardViewModel> viewModelProvider) {
    instance.viewModelProvider = viewModelProvider;
  }
}