package com.hisdu.meas.data.model;

import java.lang.System;

@kotlinx.android.parcel.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\fH\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u00d6\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\u0019"}, d2 = {"Lcom/hisdu/meas/data/model/CategoryResponse;", "Landroid/os/Parcelable;", "categories", "", "Lcom/hisdu/meas/data/model/Category;", "(Ljava/util/List;)V", "getCategories", "()Ljava/util/List;", "setCategories", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class CategoryResponse implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.hisdu.meas.data.model.Category> categories;
    public static final android.os.Parcelable.Creator<com.hisdu.meas.data.model.CategoryResponse> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.data.model.CategoryResponse copy(@org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "category")
    java.util.List<com.hisdu.meas.data.model.Category> categories) {
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
    
    public CategoryResponse() {
        super();
    }
    
    public CategoryResponse(@org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "category")
    java.util.List<com.hisdu.meas.data.model.Category> categories) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.data.model.Category> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.data.model.Category> getCategories() {
        return null;
    }
    
    public final void setCategories(@org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.data.model.Category> p0) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.hisdu.meas.data.model.CategoryResponse> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.hisdu.meas.data.model.CategoryResponse createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.hisdu.meas.data.model.CategoryResponse[] newArray(int size) {
            return null;
        }
    }
}