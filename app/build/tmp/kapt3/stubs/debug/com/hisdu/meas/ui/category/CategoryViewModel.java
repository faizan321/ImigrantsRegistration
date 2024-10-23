package com.hisdu.meas.ui.category;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0013H\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0014\u00a8\u0006\u001a"}, d2 = {"Lcom/hisdu/meas/ui/category/CategoryViewModel;", "Landroidx/lifecycle/ViewModel;", "categoryRepository", "Lcom/hisdu/meas/data/repository/CategoryRepository;", "(Lcom/hisdu/meas/data/repository/CategoryRepository;)V", "category", "Landroidx/lifecycle/LiveData;", "Lcom/hisdu/meas/data/model/Category;", "getCategory", "()Landroidx/lifecycle/LiveData;", "categoryData", "Landroidx/lifecycle/MutableLiveData;", "categoryList", "", "getCategoryList", "categoryListData", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "isLoading", "", "()Landroidx/lifecycle/MutableLiveData;", "dispose", "", "loadCategories", "showLoading", "isVisible", "app_debug"})
public final class CategoryViewModel extends androidx.lifecycle.ViewModel {
    private final com.hisdu.meas.data.repository.CategoryRepository categoryRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.hisdu.meas.data.model.Category> categoryData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.hisdu.meas.data.model.Category> category = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.hisdu.meas.data.model.Category>> categoryListData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.hisdu.meas.data.model.Category>> categoryList = null;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable = null;
    
    @javax.inject.Inject
    public CategoryViewModel(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.repository.CategoryRepository categoryRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.hisdu.meas.data.model.Category> getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.hisdu.meas.data.model.Category>> getCategoryList() {
        return null;
    }
    
    public final void loadCategories() {
    }
    
    private final void showLoading(boolean isVisible) {
    }
    
    public final void dispose() {
    }
}