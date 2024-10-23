package com.hisdu.meas.data.repository;

import java.lang.System;

/**
 * To handle data operations. It provides a clean API so that the rest of the app can retrieve this data easily.
 * It knows where to get the data from and what API calls to make when data is updated.
 * You can consider repositories to be mediators between different data sources, such as persistent models,
 * web services, and caches.
 *
 * @Author ZARA.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/hisdu/meas/data/repository/CategoryRepository;", "", "apiService", "Lcom/hisdu/meas/data/source/remote/APIService;", "appDatabase", "Lcom/hisdu/meas/data/source/local/AppDatabase;", "(Lcom/hisdu/meas/data/source/remote/APIService;Lcom/hisdu/meas/data/source/local/AppDatabase;)V", "getAppDatabase", "()Lcom/hisdu/meas/data/source/local/AppDatabase;", "setAppDatabase", "(Lcom/hisdu/meas/data/source/local/AppDatabase;)V", "loadRootCategories", "Lio/reactivex/rxjava3/disposables/Disposable;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "onResponse", "Lcom/hisdu/meas/data/source/remote/APIResponse;", "Lcom/hisdu/meas/data/model/CategoryResponse;", "Companion", "app_debug"})
public final class CategoryRepository {
    private com.hisdu.meas.data.source.remote.APIService apiService;
    @org.jetbrains.annotations.NotNull
    private com.hisdu.meas.data.source.local.AppDatabase appDatabase;
    @org.jetbrains.annotations.NotNull
    public static final com.hisdu.meas.data.repository.CategoryRepository.Companion Companion = null;
    private static final java.lang.String TAG = null;
    
    @javax.inject.Inject
    public CategoryRepository(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIService apiService, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.local.AppDatabase appDatabase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.data.source.local.AppDatabase getAppDatabase() {
        return null;
    }
    
    public final void setAppDatabase(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.local.AppDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.disposables.Disposable loadRootCategories(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.source.remote.APIResponse<com.hisdu.meas.data.model.CategoryResponse> onResponse) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/hisdu/meas/data/repository/CategoryRepository$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}