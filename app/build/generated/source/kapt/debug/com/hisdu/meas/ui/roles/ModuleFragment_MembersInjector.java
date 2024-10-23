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
public final class ModuleFragment_MembersInjector implements MembersInjector<ModuleFragment> {
  private final Provider<DashboardViewModel> viewModelProvider;

  public ModuleFragment_MembersInjector(Provider<DashboardViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<ModuleFragment> create(
      Provider<DashboardViewModel> viewModelProvider) {
    return new ModuleFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(ModuleFragment instance) {
    injectViewModelProvider(instance, viewModelProvider);
  }

  @InjectedFieldSignature("com.hisdu.meas.ui.roles.ModuleFragment.viewModelProvider")
  public static void injectViewModelProvider(ModuleFragment instance,
      Provider<DashboardViewModel> viewModelProvider) {
    instance.viewModelProvider = viewModelProvider;
  }
}
