package com.hisdu.meas.ui.search;

import java.lang.System;

/**
 * [android.support.v7.widget.RecyclerView.Adapter] to adapt
 * [Recipe] items into [RecyclerView] via [SearchViewHolder]
 *
 * Created by ZARA
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lcom/hisdu/meas/ui/search/SearchAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "<set-?>", "", "Lcom/hisdu/meas/data/model/Recipe;", "recipes", "getRecipes", "()Ljava/util/List;", "setRecipes", "(Ljava/util/List;)V", "recipes$delegate", "Lkotlin/properties/ReadWriteProperty;", "getItem", "position", "", "getItemCount", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "SearchViewHolder", "app_debug"})
public final class SearchAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.ReadWriteProperty recipes$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.hisdu.meas.ui.search.SearchAdapter.Companion Companion = null;
    private static final java.lang.String TAG = null;
    
    public SearchAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.data.model.Recipe> getRecipes() {
        return null;
    }
    
    public final void setRecipes(@org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.data.model.Recipe> p0) {
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
    
    private final com.hisdu.meas.data.model.Recipe getItem(int position) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/hisdu/meas/ui/search/SearchAdapter$SearchViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/hisdu/meas/databinding/HolderSearchBinding;", "(Lcom/hisdu/meas/ui/search/SearchAdapter;Lcom/hisdu/meas/databinding/HolderSearchBinding;)V", "getBinding", "()Lcom/hisdu/meas/databinding/HolderSearchBinding;", "onBind", "", "recipe", "Lcom/hisdu/meas/data/model/Recipe;", "app_debug"})
    public final class SearchViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.hisdu.meas.databinding.HolderSearchBinding binding = null;
        
        public SearchViewHolder(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.databinding.HolderSearchBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.hisdu.meas.databinding.HolderSearchBinding getBinding() {
            return null;
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.data.model.Recipe recipe) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/hisdu/meas/ui/search/SearchAdapter$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}