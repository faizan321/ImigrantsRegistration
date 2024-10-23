package com.zest.android.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\u0006\u0010\u0015\u001a\u00020\u0013J\u0016\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0007H\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/zest/android/ui/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/hisdu/meas/data/repository/UserRepository;", "(Lcom/hisdu/meas/data/repository/UserRepository;)V", "allDataLoaded", "Landroidx/lifecycle/MutableLiveData;", "", "getAllDataLoaded", "()Landroidx/lifecycle/MutableLiveData;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "currentUser", "Landroidx/lifecycle/LiveData;", "Lcom/zest/android/ui/login/UserModel;", "getCurrentUser", "()Landroidx/lifecycle/LiveData;", "isLoading", "userData", "", "isLoaded", "dispose", "login", "input", "Lcom/zest/android/ui/login/LoginRequest;", "context", "Landroid/content/Context;", "showLoading", "isVisible", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final com.hisdu.meas.data.repository.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> allDataLoaded = null;
    private final androidx.lifecycle.MutableLiveData<com.zest.android.ui.login.UserModel> userData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.zest.android.ui.login.UserModel> currentUser = null;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable = null;
    
    @javax.inject.Inject
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.repository.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAllDataLoaded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.zest.android.ui.login.UserModel> getCurrentUser() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull
    com.zest.android.ui.login.LoginRequest input, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    private final void showLoading(boolean isVisible) {
    }
    
    private final void allDataLoaded(boolean isLoaded) {
    }
    
    public final void dispose() {
    }
}