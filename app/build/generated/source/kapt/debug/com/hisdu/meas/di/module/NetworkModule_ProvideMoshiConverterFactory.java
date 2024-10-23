package com.hisdu.meas.di.module;

import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
public final class NetworkModule_ProvideMoshiConverterFactory implements Factory<MoshiConverterFactory> {
  private final Provider<Moshi> moshiProvider;

  public NetworkModule_ProvideMoshiConverterFactory(Provider<Moshi> moshiProvider) {
    this.moshiProvider = moshiProvider;
  }

  @Override
  public MoshiConverterFactory get() {
    return provideMoshiConverter(moshiProvider.get());
  }

  public static NetworkModule_ProvideMoshiConverterFactory create(Provider<Moshi> moshiProvider) {
    return new NetworkModule_ProvideMoshiConverterFactory(moshiProvider);
  }

  public static MoshiConverterFactory provideMoshiConverter(Moshi moshi) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.provideMoshiConverter(moshi));
  }
}
