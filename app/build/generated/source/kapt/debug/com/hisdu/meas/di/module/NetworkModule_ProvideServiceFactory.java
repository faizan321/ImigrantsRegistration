package com.hisdu.meas.di.module;

import com.hisdu.meas.data.source.remote.APIService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideServiceFactory implements Factory<APIService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public APIService get() {
    return provideService(retrofitProvider.get());
  }

  public static NetworkModule_ProvideServiceFactory create(Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideServiceFactory(retrofitProvider);
  }

  public static APIService provideService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideService(retrofit));
  }
}
