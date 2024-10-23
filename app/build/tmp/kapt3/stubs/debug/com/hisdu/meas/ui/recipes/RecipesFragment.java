package com.hisdu.meas.ui.recipes;

import java.lang.System;

/**
 * Display a grid of [Recipe]s. User can choose to view each recipe.
 *
 * Created by ZARA
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 ;2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001;B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0016J\b\u0010 \u001a\u00020\u0016H\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0018\u0010\'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J&\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010*\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u00101\u001a\u00020\u0016H\u0016J\b\u00102\u001a\u00020\u0016H\u0016J\u0010\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020\u0016H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006<"}, d2 = {"Lcom/hisdu/meas/ui/recipes/RecipesFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/hisdu/meas/util/NetworkStateReceiver$OnNetworkStateReceiverListener;", "Lcom/hisdu/meas/ui/recipes/OnRecipesFragmentInteractionListener;", "()V", "binding", "Lcom/hisdu/meas/databinding/FragmentRecipesBinding;", "mAdapter", "Lcom/hisdu/meas/ui/recipes/RecipesAdapter;", "mCallback", "Lcom/hisdu/meas/ui/main/OnMainCallback;", "mNetworkReceiver", "Lcom/hisdu/meas/util/NetworkStateReceiver;", "viewModel", "Lcom/hisdu/meas/ui/recipes/RecipeViewModel;", "viewModelProvider", "Ljavax/inject/Provider;", "getViewModelProvider", "()Ljavax/inject/Provider;", "setViewModelProvider", "(Ljavax/inject/Provider;)V", "addOrRemoveFavorites", "", "recipe", "Lcom/hisdu/meas/data/model/Recipe;", "checkEmptyView", "gotoDetailPage", "gotoSearchPage", "isFavorited", "", "loadFavorite", "networkAvailable", "networkUnavailable", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDetach", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "removeFavorite", "showMessage", "message", "", "unregisterNetworkChanges", "Companion", "app_debug"})
public final class RecipesFragment extends androidx.fragment.app.Fragment implements com.hisdu.meas.util.NetworkStateReceiver.OnNetworkStateReceiverListener, com.hisdu.meas.ui.recipes.OnRecipesFragmentInteractionListener {
    private com.hisdu.meas.ui.recipes.RecipesAdapter mAdapter;
    private com.hisdu.meas.ui.main.OnMainCallback mCallback;
    private com.hisdu.meas.util.NetworkStateReceiver mNetworkReceiver;
    private com.hisdu.meas.databinding.FragmentRecipesBinding binding;
    private com.hisdu.meas.ui.recipes.RecipeViewModel viewModel;
    @javax.inject.Inject
    public javax.inject.Provider<com.hisdu.meas.ui.recipes.RecipeViewModel> viewModelProvider;
    @org.jetbrains.annotations.NotNull
    public static final com.hisdu.meas.ui.recipes.RecipesFragment.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private java.util.HashMap _$_findViewCache;
    
    public RecipesFragment() {
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
    public void showMessage(int message) {
    }
    
    @java.lang.Override
    public void gotoDetailPage(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Recipe recipe) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public com.hisdu.meas.data.model.Recipe loadFavorite(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Recipe recipe) {
        return null;
    }
    
    @java.lang.Override
    public void removeFavorite(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Recipe recipe) {
    }
    
    @java.lang.Override
    public void addOrRemoveFavorites(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Recipe recipe) {
    }
    
    @java.lang.Override
    public boolean isFavorited(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Recipe recipe) {
        return false;
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/hisdu/meas/ui/recipes/RecipesFragment$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}