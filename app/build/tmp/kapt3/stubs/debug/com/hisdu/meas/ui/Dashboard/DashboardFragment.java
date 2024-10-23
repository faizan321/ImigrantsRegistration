package com.hisdu.meas.ui.Dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ?2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001?B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\u0006\u0010\u001f\u001a\u00020\u001cJ\b\u0010 \u001a\u00020\u001cH\u0016J\b\u0010!\u001a\u00020\u001cH\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\'H\u0016J\u0012\u0010(\u001a\u00020\u001c2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0018\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J&\u00100\u001a\u0004\u0018\u0001012\u0006\u0010.\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u0001032\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00104\u001a\u00020\u001cH\u0016J\b\u00105\u001a\u00020\u001cH\u0016J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010=\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\'H\u0002J\b\u0010>\u001a\u00020\u001cH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Lcom/hisdu/meas/ui/Dashboard/DashboardFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/hisdu/meas/util/NetworkStateReceiver$OnNetworkStateReceiverListener;", "Lcom/hisdu/meas/ui/Dashboard/VisitClickListener;", "()V", "binding", "Lcom/hisdu/meas/databinding/DashboardFragmentBinding;", "dialog", "Landroid/app/AlertDialog;", "facilityAdapter", "Lcom/hisdu/meas/ui/revamp/FacilitiesAdapter;", "mCallback", "Lcom/hisdu/meas/ui/main/OnMainCallback;", "mInflater", "Landroid/view/LayoutInflater;", "mNetworkReceiver", "Lcom/hisdu/meas/util/NetworkStateReceiver;", "viewModel", "Lcom/hisdu/meas/ui/Dashboard/DashboardViewModel;", "viewModelProvider", "Ljavax/inject/Provider;", "getViewModelProvider", "()Ljavax/inject/Provider;", "setViewModelProvider", "(Ljavax/inject/Provider;)V", "visitsAdapter", "Lcom/hisdu/meas/ui/Dashboard/VisitsAdapter;", "checkEmptyView", "", "exportDB", "gotoSearchPage", "logout", "networkAvailable", "networkUnavailable", "onAttach", "context", "Landroid/content/Context;", "onClick", "visit", "Lcom/hisdu/meas/ui/Visits/Visits;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDetach", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "shareFile", "file", "Ljava/io/File;", "showVisitDetail", "unregisterNetworkChanges", "Companion", "app_debug"})
public final class DashboardFragment extends androidx.fragment.app.Fragment implements com.hisdu.meas.util.NetworkStateReceiver.OnNetworkStateReceiverListener, com.hisdu.meas.ui.Dashboard.VisitClickListener {
    private com.hisdu.meas.ui.main.OnMainCallback mCallback;
    private com.hisdu.meas.util.NetworkStateReceiver mNetworkReceiver;
    private com.hisdu.meas.databinding.DashboardFragmentBinding binding;
    private com.hisdu.meas.ui.Dashboard.DashboardViewModel viewModel;
    private android.app.AlertDialog dialog;
    private com.hisdu.meas.ui.Dashboard.VisitsAdapter visitsAdapter;
    private android.view.LayoutInflater mInflater;
    private com.hisdu.meas.ui.revamp.FacilitiesAdapter facilityAdapter;
    @javax.inject.Inject
    public javax.inject.Provider<com.hisdu.meas.ui.Dashboard.DashboardViewModel> viewModelProvider;
    @org.jetbrains.annotations.NotNull
    public static final com.hisdu.meas.ui.Dashboard.DashboardFragment.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private java.util.HashMap _$_findViewCache;
    
    public DashboardFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final javax.inject.Provider<com.hisdu.meas.ui.Dashboard.DashboardViewModel> getViewModelProvider() {
        return null;
    }
    
    public final void setViewModelProvider(@org.jetbrains.annotations.NotNull
    javax.inject.Provider<com.hisdu.meas.ui.Dashboard.DashboardViewModel> p0) {
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void networkAvailable() {
    }
    
    @java.lang.Override
    public void networkUnavailable() {
    }
    
    private final void checkEmptyView() {
    }
    
    @java.lang.Override
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu, @org.jetbrains.annotations.NotNull
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    private final void gotoSearchPage() {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    private final void unregisterNetworkChanges() {
    }
    
    @java.lang.Override
    public void onDetach() {
    }
    
    public final void logout() {
    }
    
    private final void exportDB() {
    }
    
    private final void shareFile(java.io.File file) {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Visits.Visits visit) {
    }
    
    private final void showVisitDetail(com.hisdu.meas.ui.Visits.Visits visit) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/hisdu/meas/ui/Dashboard/DashboardFragment$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}