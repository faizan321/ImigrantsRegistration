package com.hisdu.meas.ui.search;

import java.lang.System;

/**
 * @Author ZARA.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0018\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010#\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020,H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006."}, d2 = {"Lcom/hisdu/meas/ui/search/SearchFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/hisdu/meas/databinding/FragmentSearchBinding;", "getBinding", "()Lcom/hisdu/meas/databinding/FragmentSearchBinding;", "setBinding", "(Lcom/hisdu/meas/databinding/FragmentSearchBinding;)V", "mAdapter", "Lcom/hisdu/meas/ui/search/SearchAdapter;", "mMenuSearchItem", "Landroid/view/MenuItem;", "mQuery", "", "viewModel", "Lcom/hisdu/meas/ui/recipes/RecipeViewModel;", "getViewModel", "()Lcom/hisdu/meas/ui/recipes/RecipeViewModel;", "setViewModel", "(Lcom/hisdu/meas/ui/recipes/RecipeViewModel;)V", "viewModelProvider", "Ljavax/inject/Provider;", "getViewModelProvider", "()Ljavax/inject/Provider;", "setViewModelProvider", "(Ljavax/inject/Provider;)V", "checkEmptyView", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "showProgressBar", "visibility", "", "Companion", "app_debug"})
public final class SearchFragment extends androidx.fragment.app.Fragment {
    private java.lang.String mQuery;
    private com.hisdu.meas.ui.search.SearchAdapter mAdapter;
    private android.view.MenuItem mMenuSearchItem;
    public com.hisdu.meas.databinding.FragmentSearchBinding binding;
    public com.hisdu.meas.ui.recipes.RecipeViewModel viewModel;
    @javax.inject.Inject
    public javax.inject.Provider<com.hisdu.meas.ui.recipes.RecipeViewModel> viewModelProvider;
    @org.jetbrains.annotations.NotNull
    public static final com.hisdu.meas.ui.search.SearchFragment.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private java.util.HashMap _$_findViewCache;
    
    public SearchFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.databinding.FragmentSearchBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.databinding.FragmentSearchBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.recipes.RecipeViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.recipes.RecipeViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final javax.inject.Provider<com.hisdu.meas.ui.recipes.RecipeViewModel> getViewModelProvider() {
        return null;
    }
    
    public final void setViewModelProvider(@org.jetbrains.annotations.NotNull
    javax.inject.Provider<com.hisdu.meas.ui.recipes.RecipeViewModel> p0) {
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
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu, @org.jetbrains.annotations.NotNull
    android.view.MenuInflater inflater) {
    }
    
    private final void showProgressBar(boolean visibility) {
    }
    
    private final void checkEmptyView() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/hisdu/meas/ui/search/SearchFragment$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}