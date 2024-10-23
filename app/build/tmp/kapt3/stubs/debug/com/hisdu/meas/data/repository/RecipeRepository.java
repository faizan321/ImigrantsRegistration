package com.hisdu.meas.data.repository;

import java.lang.System;

/**
 * To handle data operations. It provides a clean API so that the rest of the app can retrieve this data easily.
 * It knows where to get the data from and what API calls to make when data is updated.
 * You can consider repositories to be mediators between different data sources, such as persistent models,
 * web services, and caches.
 * @Author ZARA.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0012J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bJ\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006!"}, d2 = {"Lcom/hisdu/meas/data/repository/RecipeRepository;", "", "apiService", "Lcom/hisdu/meas/data/source/remote/APIService;", "appDatabase", "Lcom/hisdu/meas/data/source/local/AppDatabase;", "(Lcom/hisdu/meas/data/source/remote/APIService;Lcom/hisdu/meas/data/source/local/AppDatabase;)V", "getApiService", "()Lcom/hisdu/meas/data/source/remote/APIService;", "setApiService", "(Lcom/hisdu/meas/data/source/remote/APIService;)V", "getAppDatabase", "()Lcom/hisdu/meas/data/source/local/AppDatabase;", "setAppDatabase", "(Lcom/hisdu/meas/data/source/local/AppDatabase;)V", "deleteFavorite", "", "recipe", "Lcom/hisdu/meas/data/model/Recipe;", "getFavoriteByRecipeId", "getRecipes", "Lio/reactivex/rxjava3/disposables/Disposable;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "input", "", "onResponse", "Lcom/hisdu/meas/data/source/remote/APIResponse;", "Lcom/hisdu/meas/data/model/RecipeResponse;", "insertFavorite", "loadAllFavorites", "", "Companion", "app_debug"})
public final class RecipeRepository {
    @org.jetbrains.annotations.NotNull
    private com.hisdu.meas.data.source.remote.APIService apiService;
    @org.jetbrains.annotations.NotNull
    private com.hisdu.meas.data.source.local.AppDatabase appDatabase;
    @org.jetbrains.annotations.NotNull
    public static final com.hisdu.meas.data.repository.RecipeRepository.Companion Companion = null;
    private static final java.lang.String TAG = null;
    
    @javax.inject.Inject
    public RecipeRepository(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIService apiService, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.local.AppDatabase appDatabase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.data.source.remote.APIService getApiService() {
        return null;
    }
    
    public final void setApiService(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIService p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.data.source.local.AppDatabase getAppDatabase() {
        return null;
    }
    
    public final void setAppDatabase(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.local.AppDatabase p0) {
    }
    
    public final void insertFavorite(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Recipe recipe) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.data.model.Recipe> loadAllFavorites() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.hisdu.meas.data.model.Recipe getFavoriteByRecipeId(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Recipe recipe) {
        return null;
    }
    
    public final void deleteFavorite(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Recipe recipe) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable getRecipes(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    java.lang.String input, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.hisdu.meas.data.model.RecipeResponse> onResponse) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/hisdu/meas/data/repository/RecipeRepository$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}