package com.hisdu.meas.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J+\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001d"}, d2 = {"Lcom/hisdu/meas/data/model/ImageModel;", "", "imageName", "", "imagePath", "Landroid/net/Uri;", "isFirstImage", "", "(Ljava/lang/String;Landroid/net/Uri;Z)V", "getImageName", "()Ljava/lang/String;", "setImageName", "(Ljava/lang/String;)V", "getImagePath", "()Landroid/net/Uri;", "setImagePath", "(Landroid/net/Uri;)V", "()Z", "setFirstImage", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class ImageModel {
    @org.jetbrains.annotations.Nullable
    private java.lang.String imageName;
    @org.jetbrains.annotations.Nullable
    private android.net.Uri imagePath;
    private boolean isFirstImage;
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.data.model.ImageModel copy(@org.jetbrains.annotations.Nullable
    java.lang.String imageName, @org.jetbrains.annotations.Nullable
    android.net.Uri imagePath, boolean isFirstImage) {
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
    
    public ImageModel() {
        super();
    }
    
    public ImageModel(@org.jetbrains.annotations.Nullable
    java.lang.String imageName, @org.jetbrains.annotations.Nullable
    android.net.Uri imagePath, boolean isFirstImage) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getImageName() {
        return null;
    }
    
    public final void setImageName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.net.Uri component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.net.Uri getImagePath() {
        return null;
    }
    
    public final void setImagePath(@org.jetbrains.annotations.Nullable
    android.net.Uri p0) {
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean isFirstImage() {
        return false;
    }
    
    public final void setFirstImage(boolean p0) {
    }
}