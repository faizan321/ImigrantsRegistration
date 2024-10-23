package com.hisdu.meas.data.repository;

import com.hisdu.meas.data.source.local.AppDatabase;
import com.hisdu.meas.data.source.remote.APIService;
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
public final class IndicatorRepository_Factory implements Factory<IndicatorRepository> {
  private final Provider<APIService> apiServiceProvider;

  private final Provider<AppDatabase> appDatabaseProvider;

  public IndicatorRepository_Factory(Provider<APIService> apiServiceProvider,
      Provider<AppDatabase> appDatabaseProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public IndicatorRepository get() {
    return newInstance(apiServiceProvider.get(), appDatabaseProvider.get());
  }

  public static IndicatorRepository_Factory create(Provider<APIService> apiServiceProvider,
      Provider<AppDatabase> appDatabaseProvider) {
    return new IndicatorRepository_Factory(apiServiceProvider, appDatabaseProvider);
  }

  public static IndicatorRepository newInstance(APIService apiService, AppDatabase appDatabase) {
    return new IndicatorRepository(apiService, appDatabase);
  }
}
