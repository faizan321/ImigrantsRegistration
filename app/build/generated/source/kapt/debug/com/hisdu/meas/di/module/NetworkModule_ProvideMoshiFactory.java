package com.hisdu.meas.di.module;

import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideMoshiFactory implements Factory<Moshi> {
  @Override
  public Moshi get() {
    return provideMoshi();
  }

  public static NetworkModule_ProvideMoshiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Moshi provideMoshi() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.provideMoshi());
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvideMoshiFactory INSTANCE = new NetworkModule_ProvideMoshiFactory();
  }
}
