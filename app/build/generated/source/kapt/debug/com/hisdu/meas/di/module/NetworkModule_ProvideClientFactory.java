package com.hisdu.meas.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideClientFactory implements Factory<OkHttpClient> {
  private final Provider<HttpLoggingInterceptor> loggingInterceptorProvider;

  private final Provider<Cache> cacheProvider;

  public NetworkModule_ProvideClientFactory(
      Provider<HttpLoggingInterceptor> loggingInterceptorProvider, Provider<Cache> cacheProvider) {
    this.loggingInterceptorProvider = loggingInterceptorProvider;
    this.cacheProvider = cacheProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideClient(loggingInterceptorProvider.get(), cacheProvider.get());
  }

  public static NetworkModule_ProvideClientFactory create(
      Provider<HttpLoggingInterceptor> loggingInterceptorProvider, Provider<Cache> cacheProvider) {
    return new NetworkModule_ProvideClientFactory(loggingInterceptorProvider, cacheProvider);
  }

  public static OkHttpClient provideClient(HttpLoggingInterceptor loggingInterceptor, Cache cache) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.provideClient(loggingInterceptor, cache));
  }
}
