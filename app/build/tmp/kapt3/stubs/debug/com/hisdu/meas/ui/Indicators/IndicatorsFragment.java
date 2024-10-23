package com.hisdu.meas.ui.Indicators;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\"\u001a\u00020\u000fJ\"\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0012\u0010*\u001a\u00020$2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J&\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u00103\u001a\u00020$2\u0006\u00104\u001a\u00020\u000fH\u0016J\u0018\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u0007H\u0016J\u0010\u00108\u001a\u00020$2\u0006\u00106\u001a\u00020\u000fH\u0016J\u0010\u00109\u001a\u00020$2\u0006\u0010:\u001a\u00020,H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006<"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/IndicatorsFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/hisdu/meas/ui/Indicators/IndicatorListener;", "()V", "binding", "Lcom/hisdu/meas/databinding/IndicatorFragmentBinding;", "currenImageview", "Landroid/widget/ImageView;", "indicaorsmodel", "Lcom/hisdu/meas/ui/Indicators/IndicatorCategoryResponse;", "getIndicaorsmodel", "()Lcom/hisdu/meas/ui/Indicators/IndicatorCategoryResponse;", "setIndicaorsmodel", "(Lcom/hisdu/meas/ui/Indicators/IndicatorCategoryResponse;)V", "indicatorForImagePicker", "Lcom/hisdu/meas/ui/Indicators/Indicator;", "mAdapter", "Lcom/hisdu/meas/ui/Indicators/IndicatorsAdapter;", "mRecipe", "Lcom/hisdu/meas/data/model/Recipe;", "test", "", "getTest", "()Ljava/lang/String;", "setTest", "(Ljava/lang/String;)V", "viewModel", "Lcom/zest/android/ui/login/IndicatorViewModel;", "viewModelProvider", "Ljavax/inject/Provider;", "getViewModelProvider", "()Ljavax/inject/Provider;", "setViewModelProvider", "(Ljavax/inject/Provider;)V", "dummyIndicator", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDataChange", "recipe", "onImagePicker", "indicator", "imageview", "onLoadDatePicker", "onSaveInstanceState", "oldInstanceState", "Companion", "app_debug"})
public final class IndicatorsFragment extends androidx.fragment.app.Fragment implements com.hisdu.meas.ui.Indicators.IndicatorListener {
    private com.hisdu.meas.data.model.Recipe mRecipe;
    private com.hisdu.meas.databinding.IndicatorFragmentBinding binding;
    private com.zest.android.ui.login.IndicatorViewModel viewModel;
    private com.hisdu.meas.ui.Indicators.IndicatorsAdapter mAdapter;
    private com.hisdu.meas.ui.Indicators.Indicator indicatorForImagePicker;
    @javax.inject.Inject
    public javax.inject.Provider<com.zest.android.ui.login.IndicatorViewModel> viewModelProvider;
    private android.widget.ImageView currenImageview;
    public com.hisdu.meas.ui.Indicators.IndicatorCategoryResponse indicaorsmodel;
    @org.jetbrains.annotations.NotNull
    private java.lang.String test = "";
    @org.jetbrains.annotations.NotNull
    public static final com.hisdu.meas.ui.Indicators.IndicatorsFragment.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private java.util.HashMap _$_findViewCache;
    
    public IndicatorsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final javax.inject.Provider<com.zest.android.ui.login.IndicatorViewModel> getViewModelProvider() {
        return null;
    }
    
    public final void setViewModelProvider(@org.jetbrains.annotations.NotNull
    javax.inject.Provider<com.zest.android.ui.login.IndicatorViewModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.Indicators.IndicatorCategoryResponse getIndicaorsmodel() {
        return null;
    }
    
    public final void setIndicaorsmodel(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.IndicatorCategoryResponse p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTest() {
        return null;
    }
    
    public final void setTest(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.Indicators.Indicator dummyIndicator() {
        return null;
    }
    
    @java.lang.Override
    public void onDataChange(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.Indicator recipe) {
    }
    
    @java.lang.Override
    public void onLoadDatePicker(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.Indicator indicator) {
    }
    
    @java.lang.Override
    public void onImagePicker(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.Indicator indicator, @org.jetbrains.annotations.NotNull
    android.widget.ImageView imageview) {
    }
    
    @java.lang.Override
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    @java.lang.Override
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull
    android.os.Bundle oldInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/IndicatorsFragment$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}