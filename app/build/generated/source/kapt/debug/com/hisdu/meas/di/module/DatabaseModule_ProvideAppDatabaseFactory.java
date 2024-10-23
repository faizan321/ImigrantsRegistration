package com.hisdu.meas.di.module;

import android.app.Application;
import com.hisdu.meas.data.source.local.AppDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DatabaseModule_ProvideAppDatabaseFactory implements Factory<AppDatabase> {
  private final Provider<Application> applicationProvider;

  public DatabaseModule_ProvideAppDatabaseFactory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public AppDatabase get() {
    return provideAppDatabase(applicationProvider.get());
  }

  public static DatabaseModule_ProvideAppDatabaseFactory create(
      Provider<Application> applicationProvider) {
    return new DatabaseModule_ProvideAppDatabaseFactory(applicationProvider);
  }

  public static AppDatabase provideAppDatabase(Application application) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.provideAppDatabase(application));
  }
}
