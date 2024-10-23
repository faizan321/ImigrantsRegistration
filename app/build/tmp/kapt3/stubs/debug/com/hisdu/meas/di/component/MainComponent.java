package com.hisdu.meas.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\'\u00c0\u0006\u0001"}, d2 = {"Lcom/hisdu/meas/di/component/MainComponent;", "", "inject", "", "attendanceFragment", "Lcom/hisdu/meas/ui/Attendance/AttendanceFragment;", "dashboardFragment", "Lcom/hisdu/meas/ui/Dashboard/DashboardFragment;", "imagesFragment", "Lcom/hisdu/meas/ui/Feedback/FeedbackFragment;", "indicatorsFragment", "Lcom/hisdu/meas/ui/Indicators/IndicatorsFragment;", "masterIndicators", "Lcom/hisdu/meas/ui/Indicators/MasterIndicatorsFragment;", "categoryFragment", "Lcom/hisdu/meas/ui/category/CategoryFragment;", "detailFragment", "Lcom/hisdu/meas/ui/detail/DetailFragment;", "favoriteFragment", "Lcom/hisdu/meas/ui/favorite/FavoriteFragment;", "mainActivity", "Lcom/hisdu/meas/ui/main/MainActivity;", "recipesFragment", "Lcom/hisdu/meas/ui/recipes/RecipesFragment;", "moduleFragment", "Lcom/hisdu/meas/ui/roles/ModuleFragment;", "rolesFragment", "Lcom/hisdu/meas/ui/roles/RolesFragment;", "sectionFragment", "Lcom/hisdu/meas/ui/roles/SectionFragment;", "searchFragment", "Lcom/hisdu/meas/ui/search/SearchFragment;", "bhuSurveyFragment", "Lcom/hisdu/meas/ui/survey/BHUSurveyFragment;", "surveyFragment", "Lcom/hisdu/meas/ui/survey/SurveyFragment;", "loginActivity", "Lcom/zest/android/ui/login/LoginActivity;", "Factory", "app_debug"})
@dagger.Subcomponent
@com.hisdu.meas.di.ActivityScope
public abstract interface MainComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.main.MainActivity mainActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.recipes.RecipesFragment recipesFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.favorite.FavoriteFragment favoriteFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.category.CategoryFragment categoryFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.search.SearchFragment searchFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.detail.DetailFragment detailFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.zest.android.ui.login.LoginActivity loginActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Dashboard.DashboardFragment dashboardFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.roles.RolesFragment rolesFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.MasterIndicatorsFragment masterIndicators);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Attendance.AttendanceFragment attendanceFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.survey.SurveyFragment surveyFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.IndicatorsFragment indicatorsFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Feedback.FeedbackFragment imagesFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.roles.SectionFragment sectionFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.roles.ModuleFragment moduleFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.survey.BHUSurveyFragment bhuSurveyFragment);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u0004\u00c0\u0006\u0001"}, d2 = {"Lcom/hisdu/meas/di/component/MainComponent$Factory;", "", "create", "Lcom/hisdu/meas/di/component/MainComponent;", "app_debug"})
    @dagger.Subcomponent.Factory
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract com.hisdu.meas.di.component.MainComponent create();
    }
}