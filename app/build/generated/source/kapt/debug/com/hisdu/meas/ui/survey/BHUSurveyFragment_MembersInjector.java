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
public final class BHUSurveyFragment_MembersInjector implements MembersInjector<BHUSurveyFragment> {
  private final Provider<IndicatorViewModel> viewModelProvider;

  public BHUSurveyFragment_MembersInjector(Provider<IndicatorViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<BHUSurveyFragment> create(
      Provider<IndicatorViewModel> viewModelProvider) {
    return new BHUSurveyFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(BHUSurveyFragment instance) {
    injectViewModelProvider(instance, viewModelProvider);
  }

  @InjectedFieldSignature("com.hisdu.meas.ui.survey.BHUSurveyFragment.viewModelProvider")
  public static void injectViewModelProvider(BHUSurveyFragment instance,
      Provider<IndicatorViewModel> viewModelProvider) {
    instance.viewModelProvider = viewModelProvider;
  }
}
