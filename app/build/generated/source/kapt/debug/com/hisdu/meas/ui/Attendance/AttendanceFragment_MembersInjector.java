package com.hisdu.meas.ui.Attendance;

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
public final class AttendanceFragment_MembersInjector implements MembersInjector<AttendanceFragment> {
  private final Provider<DashboardViewModel> viewModelProvider;

  public AttendanceFragment_MembersInjector(Provider<DashboardViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<AttendanceFragment> create(
      Provider<DashboardViewModel> viewModelProvider) {
    return new AttendanceFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(AttendanceFragment instance) {
    injectViewModelProvider(instance, viewModelProvider);
  }

  @InjectedFieldSignature("com.hisdu.meas.ui.Attendance.AttendanceFragment.viewModelProvider")
  public static void injectViewModelProvider(AttendanceFragment instance,
      Provider<DashboardViewModel> viewModelProvider) {
    instance.viewModelProvider = viewModelProvider;
  }
}
