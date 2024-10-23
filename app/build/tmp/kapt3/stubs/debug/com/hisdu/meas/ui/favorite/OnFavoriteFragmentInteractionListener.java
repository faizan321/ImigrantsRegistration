package com.hisdu.meas.ui.favorite;

import java.lang.System;

/**
 * To make an interaction between [FavoriteFragment]
 *
 * Created by ZARA
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\t\u00c0\u0006\u0001"}, d2 = {"Lcom/hisdu/meas/ui/favorite/OnFavoriteFragmentInteractionListener;", "", "gotoDetailPage", "", "recipe", "Lcom/hisdu/meas/data/model/Recipe;", "isFavorited", "", "showDeleteFavoriteDialog", "app_debug"})
public abstract interface OnFavoriteFragmentInteractionListener {
    
    public abstract void gotoDetailPage(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Recipe recipe);
    
    public abstract void showDeleteFavoriteDialog(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Recipe recipe);
    
    public abstract boolean isFavorited(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Recipe recipe);
}