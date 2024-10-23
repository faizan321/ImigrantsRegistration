package com.hisdu.meas.ui.main;

import java.lang.System;

/**
 * To make interaction between [MainActivity] and its child
 *
 * Created by ZARA
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u0006\u00c0\u0006\u0001"}, d2 = {"Lcom/hisdu/meas/ui/main/OnMainCallback;", "", "gotoSubCategories", "", "category", "Lcom/hisdu/meas/data/model/Category;", "app_debug"})
public abstract interface OnMainCallback {
    
    public abstract void gotoSubCategories(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.data.model.Category category);
}