package com.hisdu.meas.ui.recipes;

import java.lang.System;

/**
 * To make an interaction between [RecipesFragment] and [RecipeViewModel]
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u000e\u00c0\u0006\u0001"}, d2 = {"Lcom/hisdu/meas/ui/recipes/OnRecipesFragmentInteractionListener;", "", "addOrRemoveFavorites", "", "recipe", "Lcom/hisdu/meas/data/model/Recipe;", "gotoDetailPage", "isFavorited", "", "loadFavorite", "removeFavorite", "showMessage", "message", "", "app_debug"})
public abstract interface OnRecipesFragmentInteractionListener {
    
    public abstract void showMessage(int message);
    
    public abstract void gotoDetailPage(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Recipe recipe);
    
    @org.jetbrains.annotations.Nullable
    public abstract com.hisdu.meas.data.model.Recipe loadFavorite(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Recipe recipe);
    
    public abstract void removeFavorite(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Recipe recipe);
    
    public abstract void addOrRemoveFavorites(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Recipe recipe);
    
    public abstract boolean isFavorited(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Recipe recipe);
}