package com.hisdu.meas.di.module;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.Cache;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideOkhttpCacheFactory implements Factory<Cache> {
  private final Provider<Application> appProvider;

  public NetworkModule_ProvideOkhttpCacheFactory(Provider<Application> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public Cache get() {
    return provideOkhttpCache(appProvider.get());
  }

  public static NetworkModule_ProvideOkhttpCacheFactory create(Provider<Application> appProvider) {
    return new NetworkModule_ProvideOkhttpCacheFactory(appProvider);
  }

  public static Cache provideOkhttpCache(Application app) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.provideOkhttpCache(app));
  }
}
