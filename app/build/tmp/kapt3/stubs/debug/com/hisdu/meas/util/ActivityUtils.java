package com.hisdu.meas.util;

import java.lang.System;

/**
 * This provides methods to help Activities load their UI.
 *
 * Created by ZARA on 8/10/2018.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0006\u0010\u000b\u001a\u00020\fJ(\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/hisdu/meas/util/ActivityUtils;", "", "()V", "addFragmentToActivity", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "fragment", "Landroidx/fragment/app/Fragment;", "frameId", "", "isLogin", "", "replaceFragmentInActivity", "tag", "", "app_debug"})
public final class ActivityUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.hisdu.meas.util.ActivityUtils INSTANCE = null;
    
    private ActivityUtils() {
        super();
    }
    
    /**
     * The `fragment` is added to the container view with id `frameId`. The operation is
     * performed by the `fragmentManager`.
     */
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    public final void addFragmentToActivity(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment, int frameId) {
    }
    
    /**
     * The `fragment` is replaced with the container view with id `frameId`. The operation
     * is performed by the `fragmentManager`.
     *
     * @param fragmentManager
     * @param fragment
     * @param tag
     * @param frameId
     */
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    public final void replaceFragmentInActivity(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull
    java.lang.String tag, int frameId) {
    }
    
    public final boolean isLogin() {
        return false;
    }
}