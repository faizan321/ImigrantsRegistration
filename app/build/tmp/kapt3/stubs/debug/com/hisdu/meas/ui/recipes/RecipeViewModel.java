package com.hisdu.meas.ui.recipes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eJ\u0006\u0010\u0014\u001a\u00020\u0011J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0006\u0010\u001a\u001a\u00020\u0011J\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000eJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u000eJ\u0006\u0010\u001d\u001a\u00020\u0011J\u001b\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001f2\u0006\u0010\u0012\u001a\u00020\u000e\u00a2\u0006\u0002\u0010 J\u000e\u0010!\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006%"}, d2 = {"Lcom/hisdu/meas/ui/recipes/RecipeViewModel;", "Landroidx/lifecycle/ViewModel;", "recipeRepository", "Lcom/hisdu/meas/data/repository/RecipeRepository;", "(Lcom/hisdu/meas/data/repository/RecipeRepository;)V", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "()Landroidx/lifecycle/MutableLiveData;", "recipesData", "", "Lcom/hisdu/meas/data/model/Recipe;", "getRecipesData", "addOrRemoveAsFavorite", "", "recipe", "deleteFavoriteFromDB", "dispose", "fetchRecipesData", "query", "", "generateRandomChar", "", "getMainRecipes", "isFavorited", "loadFavorite", "loadFavoriteItems", "loadTags", "", "(Lcom/hisdu/meas/data/model/Recipe;)[Ljava/lang/String;", "search", "setLoading", "isVisible", "Companion", "app_debug"})
public final class RecipeViewModel extends androidx.lifecycle.ViewModel {
    private final com.hisdu.meas.data.repository.RecipeRepository recipeRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.data.model.Recipe>> recipesData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading = null;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull
    public static final com.hisdu.meas.ui.recipes.RecipeViewModel.Companion Companion = null;
    private static final java.lang.String TAG = null;
    
    @javax.inject.Inject
    public RecipeViewModel(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.repository.RecipeRepository recipeRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.data.model.Recipe>> getRecipesData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void getMainRecipes() {
    }
    
    public final void search(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    private final char generateRandomChar() {
        return '\u0000';
    }
    
    private final void fetchRecipesData(java.lang.String query) {
    }
    
    public final void loadFavoriteItems() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.hisdu.meas.data.model.Recipe loadFavorite(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Recipe recipe) {
        return null;
    }
    
    public final boolean isFavorited(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Recipe recipe) {
        return false;
    }
    
    public final void deleteFavoriteFromDB(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Recipe recipe) {
    }
    
    public final void addOrRemoveAsFavorite(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Recipe recipe) {
    }
    
    public final void setLoading(boolean isVisible) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String[] loadTags(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Recipe recipe) {
        return null;
    }
    
    public final void dispose() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/hisdu/meas/ui/recipes/RecipeViewModel$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}