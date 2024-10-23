package com.hisdu.meas.ui.category;

import java.lang.System;

/**
 * [android.support.v7.widget.RecyclerView.Adapter] to adapt
 * [Category] items into [RecyclerView] via [CategoryViewHolder]
 *
 * Created by ZARA
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R7\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/hisdu/meas/ui/category/CategoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listener", "Lcom/hisdu/meas/ui/category/OnCategoryFragmentInteractionListener;", "(Lcom/hisdu/meas/ui/category/OnCategoryFragmentInteractionListener;)V", "<set-?>", "", "Lcom/hisdu/meas/data/model/Category;", "categories", "getCategories", "()Ljava/util/List;", "setCategories", "(Ljava/util/List;)V", "categories$delegate", "Lkotlin/properties/ReadWriteProperty;", "getItem", "position", "", "getItemCount", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CategoryViewHolder", "app_debug"})
public final class CategoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final com.hisdu.meas.ui.category.OnCategoryFragmentInteractionListener listener = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.ReadWriteProperty categories$delegate = null;
    
    public CategoryAdapter(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.category.OnCategoryFragmentInteractionListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.data.model.Category> getCategories() {
        return null;
    }
    
    public final void setCategories(@org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.data.model.Category> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    private final com.hisdu.meas.data.model.Category getItem(int position) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/hisdu/meas/ui/category/CategoryAdapter$CategoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/hisdu/meas/databinding/HolderCategoryBinding;", "(Lcom/hisdu/meas/ui/category/CategoryAdapter;Lcom/hisdu/meas/databinding/HolderCategoryBinding;)V", "onBind", "", "category", "Lcom/hisdu/meas/data/model/Category;", "app_debug"})
    final class CategoryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.hisdu.meas.databinding.HolderCategoryBinding binding = null;
        
        public CategoryViewHolder(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.databinding.HolderCategoryBinding binding) {
            super(null);
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.data.model.Category category) {
        }
    }
}