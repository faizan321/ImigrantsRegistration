package com.hisdu.meas.ui.survey;

import com.zest.android.ui.login.IndicatorViewModel;
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
public final class SurveyFragment_MembersInjector implements MembersInjector<SurveyFragment> {
  private final Provider<IndicatorViewModel> viewModelProvider;

  public SurveyFragment_MembersInjector(Provider<IndicatorViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<SurveyFragment> create(
      Provider<IndicatorViewModel> viewModelProvider) {
    return new SurveyFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(SurveyFragment instance) {
    injectViewModelProvider(instance, viewModelProvider);
  }

  @InjectedFieldSignature("com.hisdu.meas.ui.survey.SurveyFragment.viewModelProvider")
  public static void injectViewModelProvider(SurveyFragment instance,
      Provider<IndicatorViewModel> viewModelProvider) {
    instance.viewModelProvider = viewModelProvider;
  }
}
