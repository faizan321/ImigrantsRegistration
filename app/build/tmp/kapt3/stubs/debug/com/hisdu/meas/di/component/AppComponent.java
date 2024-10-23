package com.hisdu.meas.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\t\u00c0\u0006\u0001"}, d2 = {"Lcom/hisdu/meas/di/component/AppComponent;", "", "inject", "", "app", "Lcom/hisdu/meas/MainApplication;", "mainComponent", "Lcom/hisdu/meas/di/component/MainComponent$Factory;", "Factory", "app_debug"})
@dagger.Component(modules = {com.hisdu.meas.di.module.DatabaseModule.class, com.hisdu.meas.di.module.NetworkModule.class, com.hisdu.meas.di.module.BinderModule.class, com.hisdu.meas.di.component.SubComponentsModule.class})
@javax.inject.Singleton
@com.hisdu.meas.di.AppScope
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.MainApplication app);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.hisdu.meas.di.component.MainComponent.Factory mainComponent();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u0006\u00c0\u0006\u0001"}, d2 = {"Lcom/hisdu/meas/di/component/AppComponent$Factory;", "", "create", "Lcom/hisdu/meas/di/component/AppComponent;", "app", "Landroid/app/Application;", "app_debug"})
    @dagger.Component.Factory
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract com.hisdu.meas.di.component.AppComponent create(@org.jetbrains.annotations.NotNull
        @dagger.BindsInstance
        android.app.Application app);
    }
}