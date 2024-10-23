package com.hisdu.meas.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001cJ\u0006\u0010 \u001a\u00020\u001cJ\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0010\u0010\'\u001a\u00020\f2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020&H\u0014J\b\u0010/\u001a\u00020\fH\u0016J\b\u00100\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u00062"}, d2 = {"Lcom/hisdu/meas/ui/main/MainActivity;", "Lcom/hisdu/meas/LifecycleLoggingActivity;", "Lcom/hisdu/meas/ui/main/OnMainCallback;", "()V", "binding", "Lcom/hisdu/meas/databinding/ActivityMainBinding;", "currentNavController", "Landroidx/lifecycle/LiveData;", "Landroidx/navigation/NavController;", "dialog", "Landroid/app/AlertDialog;", "doubleBackToExitPressedOnce", "", "mainComponent", "Lcom/hisdu/meas/di/component/MainComponent;", "getMainComponent", "()Lcom/hisdu/meas/di/component/MainComponent;", "setMainComponent", "(Lcom/hisdu/meas/di/component/MainComponent;)V", "viewModel", "Lcom/hisdu/meas/ui/Dashboard/DashboardViewModel;", "viewModelProvider", "Ljavax/inject/Provider;", "getViewModelProvider", "()Ljavax/inject/Provider;", "setViewModelProvider", "(Ljavax/inject/Provider;)V", "adjustFontScale", "", "configuration", "Landroid/content/res/Configuration;", "cameraPermission", "checkAppVersion", "gotoSubCategories", "category", "Lcom/hisdu/meas/data/model/Category;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onSaveInstanceState", "oldInstanceState", "onSupportNavigateUp", "setupBottomNavigationBar", "Companion", "app_debug"})
public final class MainActivity extends com.hisdu.meas.LifecycleLoggingActivity implements com.hisdu.meas.ui.main.OnMainCallback {
    public com.hisdu.meas.di.component.MainComponent mainComponent;
    private com.hisdu.meas.databinding.ActivityMainBinding binding;
    private androidx.lifecycle.LiveData<androidx.navigation.NavController> currentNavController;
    private com.hisdu.meas.ui.Dashboard.DashboardViewModel viewModel;
    private boolean doubleBackToExitPressedOnce = false;
    private android.app.AlertDialog dialog;
    @javax.inject.Inject
    public javax.inject.Provider<com.hisdu.meas.ui.Dashboard.DashboardViewModel> viewModelProvider;
    @org.jetbrains.annotations.NotNull
    public static final com.hisdu.meas.ui.main.MainActivity.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
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
    public final javax.inject.Provider<com.hisdu.meas.ui.Dashboard.DashboardViewModel> getViewModelProvider() {
        return null;
    }
    
    public final void setViewModelProvider(@org.jetbrains.annotations.NotNull
    javax.inject.Provider<com.hisdu.meas.ui.Dashboard.DashboardViewModel> p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void checkAppVersion() {
    }
    
    /**
     * Called on first creation and when restoring state.
     */
    private final void setupBottomNavigationBar() {
    }
    
    @java.lang.Override
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @java.lang.Override
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    public void gotoSubCategories(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Category category) {
    }
    
    @java.lang.Override
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull
    android.os.Bundle oldInstanceState) {
    }
    
    public final void cameraPermission() {
    }
    
    public final void adjustFontScale(@org.jetbrains.annotations.NotNull
    android.content.res.Configuration configuration) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/hisdu/meas/ui/main/MainActivity$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "start", "", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void start(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
    }
}