package com.hisdu.meas.ui.Indicators;

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
public final class IndicatorsFragment_MembersInjector implements MembersInjector<IndicatorsFragment> {
  private final Provider<IndicatorViewModel> viewModelProvider;

  public IndicatorsFragment_MembersInjector(Provider<IndicatorViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<IndicatorsFragment> create(
      Provider<IndicatorViewModel> viewModelProvider) {
    return new IndicatorsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(IndicatorsFragment instance) {
    injectViewModelProvider(instance, viewModelProvider);
  }

  @InjectedFieldSignature("com.hisdu.meas.ui.Indicators.IndicatorsFragment.viewModelProvider")
  public static void injectViewModelProvider(IndicatorsFragment instance,
      Provider<IndicatorViewModel> viewModelProvider) {
    instance.viewModelProvider = viewModelProvider;
  }
}
