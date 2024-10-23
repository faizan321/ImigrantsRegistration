package com.hisdu.meas.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0010\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t\u001a\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t\u001a\u0016\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t\u001a(\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a\u000e\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001\u001a0\u0010\u0019\u001a\u00020\f\"\b\b\u0000\u0010\u001a*\u00020\u001b*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u00020\f0\u001f\u001a\n\u0010 \u001a\u00020\f*\u00020\u0005\u001a\u0012\u0010 \u001a\u00020\f*\u00020\t2\u0006\u0010\u0011\u001a\u00020!\u001a\n\u0010 \u001a\u00020\f*\u00020\u001c\u001a3\u0010\"\u001a\u00020\f\"\b\b\u0000\u0010\u001a*\u00020\u001b*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010#\u001a\u0002H\u001a2\b\b\u0002\u0010$\u001a\u00020\u0007\u00a2\u0006\u0002\u0010%\u00a8\u0006&"}, d2 = {"getRealPathFromURI", "", "contentUri", "Landroid/net/Uri;", "activity", "Landroid/app/Activity;", "isLocationEnabled", "", "context", "Landroid/content/Context;", "isNetworkAvailable", "serverError", "", "msg", "serverErrorThrowable", "", "setColor", "view", "Landroid/widget/TextView;", "fulltext", "subtext", "color", "", "timeConvertor", "_24HourTime", "getBackStackData", "T", "", "Landroidx/fragment/app/Fragment;", "key", "result", "Lkotlin/Function1;", "hideKeyboard", "Landroid/view/View;", "setBackStackData", "data", "doBack", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/Object;Z)V", "app_debug"})
public final class LocalUtilKt {
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$hideKeyboard) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$hideKeyboard) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull
    android.content.Context $this$hideKeyboard, @org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String timeConvertor(@org.jetbrains.annotations.NotNull
    java.lang.String _24HourTime) {
        return null;
    }
    
    public static final boolean isLocationEnabled(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    public static final void serverError(@org.jetbrains.annotations.NotNull
    java.lang.String msg, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public static final void serverErrorThrowable(@org.jetbrains.annotations.NotNull
    java.lang.Throwable msg, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    private static final void setColor(android.widget.TextView view, java.lang.String fulltext, java.lang.String subtext, int color) {
    }
    
    public static final boolean isNetworkAvailable(@org.jetbrains.annotations.Nullable
    android.content.Context context) {
        return false;
    }
    
    public static final <T extends java.lang.Object>void setBackStackData(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$setBackStackData, @org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    T data, boolean doBack) {
    }
    
    public static final <T extends java.lang.Object>void getBackStackData(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$getBackStackData, @org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> result) {
    }
    
    @org.jetbrains.annotations.Nullable
    public static final java.lang.String getRealPathFromURI(@org.jetbrains.annotations.Nullable
    android.net.Uri contentUri, @org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
        return null;
    }
}