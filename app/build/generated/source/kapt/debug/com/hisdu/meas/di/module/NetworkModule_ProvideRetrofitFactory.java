package com.hisdu.meas.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final Provider<MoshiConverterFactory> moshiConverterFactoryProvider;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public NetworkModule_ProvideRetrofitFactory(
      Provider<MoshiConverterFactory> moshiConverterFactoryProvider,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.moshiConverterFactoryProvider = moshiConverterFactoryProvider;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(moshiConverterFactoryProvider.get(), okHttpClientProvider.get());
  }

  public static NetworkModule_ProvideRetrofitFactory create(
      Provider<MoshiConverterFactory> moshiConverterFactoryProvider,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new NetworkModule_ProvideRetrofitFactory(moshiConverterFactoryProvider, okHttpClientProvider);
  }

  public static Retrofit provideRetrofit(MoshiConverterFactory moshiConverterFactory,
      OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.provideRetrofit(moshiConverterFactory, okHttpClient));
  }
}
