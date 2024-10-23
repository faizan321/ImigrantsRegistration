package com.zest.android.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001c"}, d2 = {"Lcom/zest/android/ui/login/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/hisdu/meas/databinding/ActivityLoginBinding;", "dialog", "Landroid/app/AlertDialog;", "mainComponent", "Lcom/hisdu/meas/di/component/MainComponent;", "getMainComponent", "()Lcom/hisdu/meas/di/component/MainComponent;", "setMainComponent", "(Lcom/hisdu/meas/di/component/MainComponent;)V", "viewModel", "Lcom/zest/android/ui/login/LoginViewModel;", "viewModelProvider", "Ljavax/inject/Provider;", "getViewModelProvider", "()Ljavax/inject/Provider;", "setViewModelProvider", "(Ljavax/inject/Provider;)V", "login", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "validate", "", "app_debug"})
public final class LoginActivity extends androidx.appcompat.app.AppCompatActivity {
    public com.hisdu.meas.di.component.MainComponent mainComponent;
    private com.hisdu.meas.databinding.ActivityLoginBinding binding;
    private com.zest.android.ui.login.LoginViewModel viewModel;
    @javax.inject.Inject
    public javax.inject.Provider<com.zest.android.ui.login.LoginViewModel> viewModelProvider;
    private android.app.AlertDialog dialog;
    private java.util.HashMap _$_findViewCache;
    
    public LoginActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.di.component.MainComponent getMainComponent() {
        return null;
    }
    
    public final void setMainComponent(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.di.component.MainComponent p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final javax.inject.Provider<com.zest.android.ui.login.LoginViewModel> getViewModelProvider() {
        return null;
    }
    
    public final void setViewModelProvider(@org.jetbrains.annotations.NotNull
    javax.inject.Provider<com.zest.android.ui.login.LoginViewModel> p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void login() {
    }
    
    public final boolean validate() {
        return false;
    }
}