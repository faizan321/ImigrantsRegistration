package com.hisdu.meas.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\'J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\'J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\'\u00a8\u0006\u0015"}, d2 = {"Lcom/hisdu/meas/di/module/BinderModule;", "", "()V", "bindCategoryViewModel", "Landroidx/lifecycle/ViewModel;", "categoryViewModel", "Lcom/hisdu/meas/ui/category/CategoryViewModel;", "bindContext", "Landroid/content/Context;", "app", "Landroid/app/Application;", "bindLoginViewModel", "loginViewModel", "Lcom/zest/android/ui/login/LoginViewModel;", "bindRecipeViewModel", "recipeViewModel", "Lcom/hisdu/meas/ui/recipes/RecipeViewModel;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/hisdu/meas/ViewModelFactory;", "app_debug"})
@dagger.Module
public abstract class BinderModule {
    
    public BinderModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract android.content.Context bindContext(@org.jetbrains.annotations.NotNull
    android.app.Application app);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ViewModelFactory factory);
    
    @org.jetbrains.annotations.NotNull
    @com.hisdu.meas.di.ViewModelKey(value = com.hisdu.meas.ui.recipes.RecipeViewModel.class)
    @dagger.multibindings.IntoMap
    @dagger.Binds
    public abstract androidx.lifecycle.ViewModel bindRecipeViewModel(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.recipes.RecipeViewModel recipeViewModel);
    
    @org.jetbrains.annotations.NotNull
    @com.hisdu.meas.di.ViewModelKey(value = com.hisdu.meas.ui.category.CategoryViewModel.class)
    @dagger.multibindings.IntoMap
    @dagger.Binds
    public abstract androidx.lifecycle.ViewModel bindCategoryViewModel(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.category.CategoryViewModel categoryViewModel);
    
    @org.jetbrains.annotations.NotNull
    @com.hisdu.meas.di.ViewModelKey(value = com.zest.android.ui.login.LoginViewModel.class)
    @dagger.multibindings.IntoMap
    @dagger.Binds
    public abstract androidx.lifecycle.ViewModel bindLoginViewModel(@org.jetbrains.annotations.NotNull
    com.zest.android.ui.login.LoginViewModel loginViewModel);
}