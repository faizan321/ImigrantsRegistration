package com.hisdu.meas.ui.Indicators;

import java.lang.System;

@kotlinx.android.parcel.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bp\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0015\b\u0003\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\u0002\b\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0016\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\u0002\b\fH\u00c6\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u00101\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012Jy\u00102\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\u0015\b\u0003\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\u0002\b\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0002\u00103J\t\u00104\u001a\u00020\u0003H\u00d6\u0001J\u0013\u00105\u001a\u00020\u000e2\b\u00106\u001a\u0004\u0018\u000107H\u00d6\u0003J\t\u00108\u001a\u00020\u0003H\u00d6\u0001J\t\u00109\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0003H\u00d6\u0001R\"\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\'\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\u0002\b\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u000f\u0010\u0012\"\u0004\b\'\u0010\u0014R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019\u00a8\u0006?"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/IndicatorCategoryResponse;", "Landroid/os/Parcelable;", "caegoryId", "", "categoryName", "", "applicationType", "moduleId", "SequenceNo", "indicators", "", "Lcom/hisdu/meas/ui/Indicators/Indicator;", "Lkotlinx/android/parcel/RawValue;", "IsSubmitted", "", "isRequired", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getIsSubmitted", "()Ljava/lang/Boolean;", "setIsSubmitted", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSequenceNo", "()Ljava/lang/Integer;", "setSequenceNo", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getApplicationType", "setApplicationType", "getCaegoryId", "setCaegoryId", "getCategoryName", "()Ljava/lang/String;", "setCategoryName", "(Ljava/lang/String;)V", "getIndicators", "()Ljava/util/List;", "setIndicators", "(Ljava/util/List;)V", "setRequired", "getModuleId", "setModuleId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/hisdu/meas/ui/Indicators/IndicatorCategoryResponse;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class IndicatorCategoryResponse implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer caegoryId;
    @org.jetbrains.annotations.Nullable
    private java.lang.String categoryName;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer applicationType;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer moduleId;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer SequenceNo;
    @org.jetbrains.annotations.Nullable
    private java.util.List<com.hisdu.meas.ui.Indicators.Indicator> indicators;
    @org.jetbrains.annotations.Nullable
    @androidx.room.Ignore
    private java.lang.Boolean IsSubmitted;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean isRequired;
    public static final android.os.Parcelable.Creator<com.hisdu.meas.ui.Indicators.IndicatorCategoryResponse> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.Indicators.IndicatorCategoryResponse copy(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "CaegoryId")
    java.lang.Integer caegoryId, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "CategoryName")
    java.lang.String categoryName, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "ApplicationType")
    java.lang.Integer applicationType, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "ModuleId")
    java.lang.Integer moduleId, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "SequenceNo")
    java.lang.Integer SequenceNo, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Indicators")
    java.util.List<com.hisdu.meas.ui.Indicators.Indicator> indicators, @org.jetbrains.annotations.Nullable
    java.lang.Boolean IsSubmitted, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsRequired")
    java.lang.Boolean isRequired) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public IndicatorCategoryResponse() {
        super();
    }
    
    public IndicatorCategoryResponse(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "CaegoryId")
    java.lang.Integer caegoryId, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "CategoryName")
    java.lang.String categoryName, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "ApplicationType")
    java.lang.Integer applicationType, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "ModuleId")
    java.lang.Integer moduleId, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "SequenceNo")
    java.lang.Integer SequenceNo, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Indicators")
    java.util.List<com.hisdu.meas.ui.Indicators.Indicator> indicators, @org.jetbrains.annotations.Nullable
    java.lang.Boolean IsSubmitted, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsRequired")
    java.lang.Boolean isRequired) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCaegoryId() {
        return null;
    }
    
    public final void setCaegoryId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCategoryName() {
        return null;
    }
    
    public final void setCategoryName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getApplicationType() {
        return null;
    }
    
    public final void setApplicationType(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getModuleId() {
        return null;
    }
    
    public final void setModuleId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getSequenceNo() {
        return null;
    }
    
    public final void setSequenceNo(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.hisdu.meas.ui.Indicators.Indicator> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.hisdu.meas.ui.Indicators.Indicator> getIndicators() {
        return null;
    }
    
    public final void setIndicators(@org.jetbrains.annotations.Nullable
    java.util.List<com.hisdu.meas.ui.Indicators.Indicator> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getIsSubmitted() {
        return null;
    }
    
    public final void setIsSubmitted(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean isRequired() {
        return null;
    }
    
    public final void setRequired(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.hisdu.meas.ui.Indicators.IndicatorCategoryResponse> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.hisdu.meas.ui.Indicators.IndicatorCategoryResponse createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.hisdu.meas.ui.Indicators.IndicatorCategoryResponse[] newArray(int size) {
            return null;
        }
    }
}