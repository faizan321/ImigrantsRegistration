package com.hisdu.meas.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bH\u0007J\u0018\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000e0\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014H\u0007\u00a8\u0006\u001a"}, d2 = {"Lcom/hisdu/meas/di/module/NetworkModule;", "", "()V", "provideClient", "Lokhttp3/OkHttpClient;", "loggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "cache", "Lokhttp3/Cache;", "provideLoggingInterceptor", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "provideMoshiConverter", "Lretrofit2/converter/moshi/MoshiConverterFactory;", "moshi", "provideOkhttpCache", "app", "Landroid/app/Application;", "provideRetrofit", "Lretrofit2/Retrofit;", "moshiConverterFactory", "okHttpClient", "provideService", "Lcom/hisdu/meas/data/source/remote/APIService;", "retrofit", "app_debug"})
@dagger.Module
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull
    public static final com.hisdu.meas.di.module.NetworkModule INSTANCE = null;
    
    private NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmStatic
    @dagger.Provides
    public static final okhttp3.logging.HttpLoggingInterceptor provideLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmStatic
    @dagger.Provides
    public static final okhttp3.Cache provideOkhttpCache(@org.jetbrains.annotations.NotNull
    android.app.Application app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmStatic
    @javax.inject.Singleton
    @dagger.Provides
    public static final okhttp3.OkHttpClient provideClient(@org.jetbrains.annotations.NotNull
    okhttp3.logging.HttpLoggingInterceptor loggingInterceptor, @org.jetbrains.annotations.NotNull
    okhttp3.Cache cache) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic
    @javax.inject.Singleton
    @dagger.Provides
    public static final com.squareup.moshi.Moshi provideMoshi() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic
    @dagger.Provides
    public static final retrofit2.converter.moshi.MoshiConverterFactory provideMoshiConverter(@org.jetbrains.annotations.NotNull
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmStatic
    @javax.inject.Singleton
    @dagger.Provides
    public static final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull
    retrofit2.converter.moshi.MoshiConverterFactory moshiConverterFactory, @org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.hisdu.meas.data.source.remote.APIService provideService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
}