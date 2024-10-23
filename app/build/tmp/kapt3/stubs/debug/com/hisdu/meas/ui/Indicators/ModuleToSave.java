package com.hisdu.meas.ui.Indicators;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.leopold.mvvm.data.db.converter.DateConverter.class})
@kotlinx.android.parcel.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BV\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0013\b\u0002\u0010\n\u001a\r\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\b\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010\'\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0014\u0010(\u001a\r\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\b\rH\u00c6\u0003J_\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0013\b\u0002\u0010\n\u001a\r\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\b\rH\u00c6\u0001\u00a2\u0006\u0002\u0010*J\t\u0010+\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010,\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010.H\u00d6\u0003J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001J\t\u00100\u001a\u00020\u0006H\u00d6\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R%\u0010\n\u001a\r\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\b\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\t\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0007\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u00066"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/ModuleToSave;", "Landroid/os/Parcelable;", "applicationTypeId", "", "moduleId", "moduleName", "", "isSubmited", "", "isRequired", "indicatorslist", "", "Lcom/hisdu/meas/ui/Indicators/IndicatorCategoryResponse;", "Lkotlinx/android/parcel/RawValue;", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V", "getApplicationTypeId", "()Ljava/lang/Integer;", "setApplicationTypeId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getIndicatorslist", "()Ljava/util/List;", "setIndicatorslist", "(Ljava/util/List;)V", "()Ljava/lang/Boolean;", "setRequired", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setSubmited", "getModuleId", "setModuleId", "getModuleName", "()Ljava/lang/String;", "setModuleName", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)Lcom/hisdu/meas/ui/Indicators/ModuleToSave;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class ModuleToSave implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer applicationTypeId;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer moduleId;
    @org.jetbrains.annotations.Nullable
    private java.lang.String moduleName;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean isSubmited;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean isRequired;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.hisdu.meas.ui.Indicators.IndicatorCategoryResponse> indicatorslist;
    public static final android.os.Parcelable.Creator<com.hisdu.meas.ui.Indicators.ModuleToSave> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.Indicators.ModuleToSave copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer applicationTypeId, @org.jetbrains.annotations.Nullable
    java.lang.Integer moduleId, @org.jetbrains.annotations.Nullable
    java.lang.String moduleName, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isSubmited, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isRequired, @org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.ui.Indicators.IndicatorCategoryResponse> indicatorslist) {
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
    
    public ModuleToSave() {
        super();
    }
    
    public ModuleToSave(@org.jetbrains.annotations.Nullable
    java.lang.Integer applicationTypeId, @org.jetbrains.annotations.Nullable
    java.lang.Integer moduleId, @org.jetbrains.annotations.Nullable
    java.lang.String moduleName, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isSubmited, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isRequired, @org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.ui.Indicators.IndicatorCategoryResponse> indicatorslist) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getApplicationTypeId() {
        return null;
    }
    
    public final void setApplicationTypeId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component2() {
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
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getModuleName() {
        return null;
    }
    
    public final void setModuleName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean isSubmited() {
        return null;
    }
    
    public final void setSubmited(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean isRequired() {
        return null;
    }
    
    public final void setRequired(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Indicators.IndicatorCategoryResponse> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Indicators.IndicatorCategoryResponse> getIndicatorslist() {
        return null;
    }
    
    public final void setIndicatorslist(@org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.ui.Indicators.IndicatorCategoryResponse> p0) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.hisdu.meas.ui.Indicators.ModuleToSave> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.hisdu.meas.ui.Indicators.ModuleToSave createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.hisdu.meas.ui.Indicators.ModuleToSave[] newArray(int size) {
            return null;
        }
    }
}