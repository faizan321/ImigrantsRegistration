package com.hisdu.meas.ui.Indicators;

import java.lang.System;

@kotlinx.android.parcel.Parcelize
@androidx.room.Entity
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010(\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\rJV\u0010)\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010*J\t\u0010+\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010,\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010.H\u00d6\u0003J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001J\t\u00100\u001a\u00020\u0005H\u00d6\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017\u00a8\u00066"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/IndicatorCategory;", "Landroid/os/Parcelable;", "caegoryId", "", "categoryName", "", "applicationType", "moduleId", "SequenceNo", "IsRequired", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getIsRequired", "()Ljava/lang/Boolean;", "setIsRequired", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "IsSubmitted", "getIsSubmitted", "setIsSubmitted", "getSequenceNo", "()Ljava/lang/Integer;", "setSequenceNo", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getApplicationType", "setApplicationType", "getCaegoryId", "setCaegoryId", "getCategoryName", "()Ljava/lang/String;", "setCategoryName", "(Ljava/lang/String;)V", "getModuleId", "setModuleId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/hisdu/meas/ui/Indicators/IndicatorCategory;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class IndicatorCategory implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    @androidx.room.PrimaryKey
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
    private java.lang.Boolean IsRequired;
    @org.jetbrains.annotations.Nullable
    @androidx.room.Ignore
    private java.lang.Boolean IsSubmitted;
    public static final android.os.Parcelable.Creator<com.hisdu.meas.ui.Indicators.IndicatorCategory> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.Indicators.IndicatorCategory copy(@org.jetbrains.annotations.Nullable
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
    @com.squareup.moshi.Json(name = "IsRequired")
    java.lang.Boolean IsRequired) {
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
    
    public IndicatorCategory(@org.jetbrains.annotations.Nullable
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
    @com.squareup.moshi.Json(name = "IsRequired")
    java.lang.Boolean IsRequired) {
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
    public final java.lang.Boolean component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getIsRequired() {
        return null;
    }
    
    public final void setIsRequired(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getIsSubmitted() {
        return null;
    }
    
    public final void setIsSubmitted(@org.jetbrains.annotations.Nullable
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
    public static final class Creator implements android.os.Parcelable.Creator<com.hisdu.meas.ui.Indicators.IndicatorCategory> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.hisdu.meas.ui.Indicators.IndicatorCategory createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.hisdu.meas.ui.Indicators.IndicatorCategory[] newArray(int size) {
            return null;
        }
    }
}