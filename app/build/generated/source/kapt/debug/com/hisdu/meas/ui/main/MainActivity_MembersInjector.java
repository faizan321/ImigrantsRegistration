package com.hisdu.meas.ui.main;

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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<DashboardViewModel> viewModelProvider;

  public MainActivity_MembersInjector(Provider<DashboardViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<DashboardViewModel> viewModelProvider) {
    return new MainActivity_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectViewModelProvider(instance, viewModelProvider);
  }

  @InjectedFieldSignature("com.hisdu.meas.ui.main.MainActivity.viewModelProvider")
  public static void injectViewModelProvider(MainActivity instance,
      Provider<DashboardViewModel> viewModelProvider) {
    instance.viewModelProvider = viewModelProvider;
  }
}
