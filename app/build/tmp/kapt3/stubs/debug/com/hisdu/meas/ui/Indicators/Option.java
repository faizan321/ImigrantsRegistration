package com.hisdu.meas.ui.Indicators;

import java.lang.System;

@kotlinx.android.parcel.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010&\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\'\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010(\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003Jn\u0010*\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010+J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010-\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010/H\u00d6\u0003J\t\u00100\u001a\u00020\u0003H\u00d6\u0001J\t\u00101\u001a\u00020\u0005H\u00d6\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\t\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\n\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u000b\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0007\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011\u00a8\u00067"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/Option;", "Landroid/os/Parcelable;", "optionId", "", "label", "", "type", "isOptionTotal", "", "isOptionCalculation", "isOptionEditable", "isOptionTagged", "defaultValue", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getDefaultValue", "()Ljava/lang/String;", "setDefaultValue", "(Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "setOptionCalculation", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setOptionEditable", "setOptionTagged", "setOptionTotal", "getLabel", "setLabel", "getOptionId", "()Ljava/lang/Integer;", "setOptionId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/hisdu/meas/ui/Indicators/Option;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Option implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer optionId;
    @org.jetbrains.annotations.Nullable
    private java.lang.String label;
    @org.jetbrains.annotations.Nullable
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean isOptionTotal;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean isOptionCalculation;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean isOptionEditable;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean isOptionTagged;
    @org.jetbrains.annotations.Nullable
    private java.lang.String defaultValue;
    public static final android.os.Parcelable.Creator<com.hisdu.meas.ui.Indicators.Option> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.Indicators.Option copy(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "OptionId")
    java.lang.Integer optionId, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Label")
    java.lang.String label, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Type")
    java.lang.String type, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsOptionTotal")
    java.lang.Boolean isOptionTotal, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsOptionCalculation")
    java.lang.Boolean isOptionCalculation, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsOptionEditable")
    java.lang.Boolean isOptionEditable, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsOptionTagged")
    java.lang.Boolean isOptionTagged, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "DefaultValue")
    java.lang.String defaultValue) {
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
    
    public Option(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "OptionId")
    java.lang.Integer optionId, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Label")
    java.lang.String label, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Type")
    java.lang.String type, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsOptionTotal")
    java.lang.Boolean isOptionTotal, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsOptionCalculation")
    java.lang.Boolean isOptionCalculation, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsOptionEditable")
    java.lang.Boolean isOptionEditable, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsOptionTagged")
    java.lang.Boolean isOptionTagged, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "DefaultValue")
    java.lang.String defaultValue) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getOptionId() {
        return null;
    }
    
    public final void setOptionId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLabel() {
        return null;
    }
    
    public final void setLabel(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean isOptionTotal() {
        return null;
    }
    
    public final void setOptionTotal(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean isOptionCalculation() {
        return null;
    }
    
    public final void setOptionCalculation(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean isOptionEditable() {
        return null;
    }
    
    public final void setOptionEditable(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean isOptionTagged() {
        return null;
    }
    
    public final void setOptionTagged(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDefaultValue() {
        return null;
    }
    
    public final void setDefaultValue(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.hisdu.meas.ui.Indicators.Option> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.hisdu.meas.ui.Indicators.Option createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.hisdu.meas.ui.Indicators.Option[] newArray(int size) {
            return null;
        }
    }
}