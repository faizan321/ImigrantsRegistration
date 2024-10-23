package com.zest.android.ui.login;

import com.hisdu.meas.data.repository.IndicatorRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class IndicatorViewModel_Factory implements Factory<IndicatorViewModel> {
  private final Provider<IndicatorRepository> indicatorRepositoryProvider;

  public IndicatorViewModel_Factory(Provider<IndicatorRepository> indicatorRepositoryProvider) {
    this.indicatorRepositoryProvider = indicatorRepositoryProvider;
  }

  @Override
  public IndicatorViewModel get() {
    return newInstance(indicatorRepositoryProvider.get());
  }

  public static IndicatorViewModel_Factory create(
      Provider<IndicatorRepository> indicatorRepositoryProvider) {
    return new IndicatorViewModel_Factory(indicatorRepositoryProvider);
  }

  public static IndicatorViewModel newInstance(IndicatorRepository indicatorRepository) {
    return new IndicatorViewModel(indicatorRepository);
  }
}
