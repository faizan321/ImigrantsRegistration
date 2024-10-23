package com.hisdu.meas.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a(\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0002\u001a\u0014\u0010\u0015\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000eH\u0002\u001a2\u0010\u0017\u001a\u00020\u0006*\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002\u001a\"\u0010\u001d\u001a\u00020\u0006*\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002\u001a6\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!*\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006#"}, d2 = {"currentNavigationFragment", "Landroidx/fragment/app/Fragment;", "Landroidx/fragment/app/FragmentManager;", "getCurrentNavigationFragment", "(Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/Fragment;", "attachNavHostFragment", "", "fragmentManager", "navHostFragment", "Landroidx/navigation/fragment/NavHostFragment;", "isPrimaryNavFragment", "", "detachNavHostFragment", "getFragmentTag", "", "index", "", "obtainNavHostFragment", "fragmentTag", "navGraphId", "containerId", "isOnBackStack", "backStackName", "setupDeepLinks", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "navGraphIds", "", "intent", "Landroid/content/Intent;", "setupItemReselected", "graphIdToTagMap", "Landroid/util/SparseArray;", "setupWithNavController", "Landroidx/lifecycle/LiveData;", "Landroidx/navigation/NavController;", "app_debug"})
public final class NavigationExtensionKt {
    
    /**
     * Manages the various graphs needed for a [BottomNavigationView].
     */
    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.LiveData<androidx.navigation.NavController> setupWithNavController(@org.jetbrains.annotations.NotNull
    com.google.android.material.bottomnavigation.BottomNavigationView $this$setupWithNavController, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Integer> navGraphIds, @org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager fragmentManager, int containerId, @org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
        return null;
    }
    
    private static final void setupDeepLinks(com.google.android.material.bottomnavigation.BottomNavigationView $this$setupDeepLinks, java.util.List<java.lang.Integer> navGraphIds, androidx.fragment.app.FragmentManager fragmentManager, int containerId, android.content.Intent intent) {
    }
    
    private static final void setupItemReselected(com.google.android.material.bottomnavigation.BottomNavigationView $this$setupItemReselected, android.util.SparseArray<java.lang.String> graphIdToTagMap, androidx.fragment.app.FragmentManager fragmentManager) {
    }
    
    private static final void detachNavHostFragment(androidx.fragment.app.FragmentManager fragmentManager, androidx.navigation.fragment.NavHostFragment navHostFragment) {
    }
    
    private static final void attachNavHostFragment(androidx.fragment.app.FragmentManager fragmentManager, androidx.navigation.fragment.NavHostFragment navHostFragment, boolean isPrimaryNavFragment) {
    }
    
    private static final androidx.navigation.fragment.NavHostFragment obtainNavHostFragment(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String fragmentTag, int navGraphId, int containerId) {
        return null;
    }
    
    private static final boolean isOnBackStack(androidx.fragment.app.FragmentManager $this$isOnBackStack, java.lang.String backStackName) {
        return false;
    }
    
    private static final java.lang.String getFragmentTag(int index) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final androidx.fragment.app.Fragment getCurrentNavigationFragment(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager $this$currentNavigationFragment) {
        return null;
    }
}