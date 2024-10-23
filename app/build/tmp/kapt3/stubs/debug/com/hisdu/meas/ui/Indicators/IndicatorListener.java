package com.hisdu.meas.ui.Indicators;

import java.lang.System;

/**
 * To make an interaction between [RecipesFragment] and [RecipeViewModel]
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u000b\u00c0\u0006\u0001"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/IndicatorListener;", "", "onDataChange", "", "recipe", "Lcom/hisdu/meas/ui/Indicators/Indicator;", "onImagePicker", "indicator", "imageview", "Landroid/widget/ImageView;", "onLoadDatePicker", "app_debug"})
public abstract interface IndicatorListener {
    
    public abstract void onDataChange(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.Indicator recipe);
    
    public abstract void onLoadDatePicker(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.Indicator indicator);
    
    public abstract void onImagePicker(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.Indicator indicator, @org.jetbrains.annotations.NotNull
    android.widget.ImageView imageview);
}