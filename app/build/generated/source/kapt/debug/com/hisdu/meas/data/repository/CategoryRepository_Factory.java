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
public final class CategoryRepository_Factory implements Factory<CategoryRepository> {
  private final Provider<APIService> apiServiceProvider;

  private final Provider<AppDatabase> appDatabaseProvider;

  public CategoryRepository_Factory(Provider<APIService> apiServiceProvider,
      Provider<AppDatabase> appDatabaseProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public CategoryRepository get() {
    return newInstance(apiServiceProvider.get(), appDatabaseProvider.get());
  }

  public static CategoryRepository_Factory create(Provider<APIService> apiServiceProvider,
      Provider<AppDatabase> appDatabaseProvider) {
    return new CategoryRepository_Factory(apiServiceProvider, appDatabaseProvider);
  }

  public static CategoryRepository newInstance(APIService apiService, AppDatabase appDatabase) {
    return new CategoryRepository(apiService, appDatabase);
  }
}
