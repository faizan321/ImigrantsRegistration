package com.hisdu.meas.ui.revamp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R;\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u001a"}, d2 = {"Lcom/hisdu/meas/ui/revamp/FacilitiesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "<set-?>", "", "Lcom/hisdu/meas/ui/migration/MigrantsListResponse$MigrantRecord;", "recipes", "getRecipes", "()Ljava/util/List;", "setRecipes", "(Ljava/util/List;)V", "recipes$delegate", "Lkotlin/properties/ReadWriteProperty;", "getItem", "position", "", "getItemCount", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "RecipeViewHolder", "app_debug"})
public final class FacilitiesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.Nullable
    private final kotlin.properties.ReadWriteProperty recipes$delegate = null;
    
    public FacilitiesAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.hisdu.meas.ui.migration.MigrantsListResponse.MigrantRecord> getRecipes() {
        return null;
    }
    
    public final void setRecipes(@org.jetbrains.annotations.Nullable
    java.util.List<com.hisdu.meas.ui.migration.MigrantsListResponse.MigrantRecord> p0) {
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
    
    private final com.hisdu.meas.ui.migration.MigrantsListResponse.MigrantRecord getItem(int position) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/hisdu/meas/ui/revamp/FacilitiesAdapter$RecipeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/hisdu/meas/databinding/FacilityItemBinding;", "(Lcom/hisdu/meas/ui/revamp/FacilitiesAdapter;Lcom/hisdu/meas/databinding/FacilityItemBinding;)V", "onBind", "", "item", "Lcom/hisdu/meas/ui/migration/MigrantsListResponse$MigrantRecord;", "app_debug"})
    public final class RecipeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.hisdu.meas.databinding.FacilityItemBinding binding = null;
        
        public RecipeViewHolder(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.databinding.FacilityItemBinding binding) {
            super(null);
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.ui.migration.MigrantsListResponse.MigrantRecord item) {
        }
    }
}