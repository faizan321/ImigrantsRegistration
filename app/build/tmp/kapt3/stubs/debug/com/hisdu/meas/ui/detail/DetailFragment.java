package com.hisdu.meas.ui.detail;

import java.lang.System;

/**
 * @Author ZARA.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006!"}, d2 = {"Lcom/hisdu/meas/ui/detail/DetailFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/hisdu/meas/databinding/FragmentDetailBinding;", "mRecipe", "Lcom/hisdu/meas/data/model/Recipe;", "viewModel", "Lcom/hisdu/meas/ui/recipes/RecipeViewModel;", "viewModelProvider", "Ljavax/inject/Provider;", "getViewModelProvider", "()Ljavax/inject/Provider;", "setViewModelProvider", "(Ljavax/inject/Provider;)V", "checkIsFavorite", "", "nonNullRecipe", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "OnChipListener", "app_debug"})
public final class DetailFragment extends androidx.fragment.app.Fragment {
    private com.hisdu.meas.data.model.Recipe mRecipe;
    private com.hisdu.meas.databinding.FragmentDetailBinding binding;
    private com.hisdu.meas.ui.recipes.RecipeViewModel viewModel;
    @javax.inject.Inject
    public javax.inject.Provider<com.hisdu.meas.ui.recipes.RecipeViewModel> viewModelProvider;
    @org.jetbrains.annotations.NotNull
    public static final com.hisdu.meas.ui.detail.DetailFragment.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private java.util.HashMap _$_findViewCache;
    
    public DetailFragment() {
        super();
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
    
    private final void checkIsFavorite(com.hisdu.meas.data.model.Recipe nonNullRecipe) {
    }
    
    @java.lang.Override
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu, @org.jetbrains.annotations.NotNull
    android.view.MenuInflater inflater) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/hisdu/meas/ui/detail/DetailFragment$OnChipListener;", "Lcom/adroitandroid/chipcloud/ChipListener;", "tags", "", "", "(Lcom/hisdu/meas/ui/detail/DetailFragment;[Ljava/lang/String;)V", "[Ljava/lang/String;", "chipDeselected", "", "i", "", "chipSelected", "app_debug"})
    final class OnChipListener implements com.adroitandroid.chipcloud.ChipListener {
        private final java.lang.String[] tags = null;
        
        public OnChipListener(@org.jetbrains.annotations.NotNull
        java.lang.String[] tags) {
            super();
        }
        
        @java.lang.Override
        public void chipSelected(int i) {
        }
        
        @java.lang.Override
        public void chipDeselected(int i) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/hisdu/meas/ui/detail/DetailFragment$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}