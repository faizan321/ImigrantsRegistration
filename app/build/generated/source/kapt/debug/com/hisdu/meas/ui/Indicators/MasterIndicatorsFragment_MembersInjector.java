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
public final class MasterIndicatorsFragment_MembersInjector implements MembersInjector<MasterIndicatorsFragment> {
  private final Provider<IndicatorViewModel> viewModelProvider;

  public MasterIndicatorsFragment_MembersInjector(Provider<IndicatorViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<MasterIndicatorsFragment> create(
      Provider<IndicatorViewModel> viewModelProvider) {
    return new MasterIndicatorsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(MasterIndicatorsFragment instance) {
    injectViewModelProvider(instance, viewModelProvider);
  }

  @InjectedFieldSignature("com.hisdu.meas.ui.Indicators.MasterIndicatorsFragment.viewModelProvider")
  public static void injectViewModelProvider(MasterIndicatorsFragment instance,
      Provider<IndicatorViewModel> viewModelProvider) {
    instance.viewModelProvider = viewModelProvider;
  }
}
