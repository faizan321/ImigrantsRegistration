package com.hisdu.meas.ui.Feedback;

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
public final class FeedbackFragment_MembersInjector implements MembersInjector<FeedbackFragment> {
  private final Provider<DashboardViewModel> viewModelProvider;

  public FeedbackFragment_MembersInjector(Provider<DashboardViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<FeedbackFragment> create(
      Provider<DashboardViewModel> viewModelProvider) {
    return new FeedbackFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(FeedbackFragment instance) {
    injectViewModelProvider(instance, viewModelProvider);
  }

  @InjectedFieldSignature("com.hisdu.meas.ui.Feedback.FeedbackFragment.viewModelProvider")
  public static void injectViewModelProvider(FeedbackFragment instance,
      Provider<DashboardViewModel> viewModelProvider) {
    instance.viewModelProvider = viewModelProvider;
  }
}
