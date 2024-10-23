package com.hisdu.meas;

import java.lang.System;

/**
 * @Author ZARA.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/hisdu/meas/MainApplication;", "Landroid/app/Application;", "Lcom/hisdu/meas/di/component/AppComponentProvider;", "()V", "appComponent", "Lcom/hisdu/meas/di/component/AppComponent;", "attachBaseContext", "", "base", "Landroid/content/Context;", "onCreate", "provideAppComponent", "app_debug"})
public final class MainApplication extends android.app.Application implements com.hisdu.meas.di.component.AppComponentProvider {
    private com.hisdu.meas.di.component.AppComponent appComponent;
    
    public MainApplication() {
        super();
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @java.lang.Override
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull
    android.content.Context base) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.hisdu.meas.di.component.AppComponent provideAppComponent() {
        return null;
    }
}