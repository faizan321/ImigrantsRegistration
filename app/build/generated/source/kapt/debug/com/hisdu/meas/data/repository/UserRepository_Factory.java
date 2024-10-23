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
public final class UserRepository_Factory implements Factory<UserRepository> {
  private final Provider<APIService> apiServiceProvider;

  private final Provider<AppDatabase> appDatabaseProvider;

  public UserRepository_Factory(Provider<APIService> apiServiceProvider,
      Provider<AppDatabase> appDatabaseProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public UserRepository get() {
    return newInstance(apiServiceProvider.get(), appDatabaseProvider.get());
  }

  public static UserRepository_Factory create(Provider<APIService> apiServiceProvider,
      Provider<AppDatabase> appDatabaseProvider) {
    return new UserRepository_Factory(apiServiceProvider, appDatabaseProvider);
  }

  public static UserRepository newInstance(APIService apiService, AppDatabase appDatabase) {
    return new UserRepository(apiService, appDatabase);
  }
}
