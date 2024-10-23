package com.hisdu.meas.ui.Feedback;

import java.lang.System;

@kotlinx.android.parcel.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B.\u0012\u0013\b\u0002\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\b\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\b\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J2\u0010\u0017\u001a\u00020\u00002\u0013\b\u0002\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019H\u00d6\u0001R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR%\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\b\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r\u00a8\u0006%"}, d2 = {"Lcom/hisdu/meas/ui/Feedback/FeedbackSubmitModel;", "Landroid/os/Parcelable;", "images", "", "Lcom/hisdu/meas/ui/Feedback/ImagesModel;", "Lkotlinx/android/parcel/RawValue;", "meaComment", "", "facility_incharge_comment", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getFacility_incharge_comment", "()Ljava/lang/String;", "setFacility_incharge_comment", "(Ljava/lang/String;)V", "getImages", "()Ljava/util/List;", "setImages", "(Ljava/util/List;)V", "getMeaComment", "setMeaComment", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class FeedbackSubmitModel implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.hisdu.meas.ui.Feedback.ImagesModel> images;
    @org.jetbrains.annotations.NotNull
    private java.lang.String meaComment;
    @org.jetbrains.annotations.NotNull
    private java.lang.String facility_incharge_comment;
    public static final android.os.Parcelable.Creator<com.hisdu.meas.ui.Feedback.FeedbackSubmitModel> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.Feedback.FeedbackSubmitModel copy(@org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.ui.Feedback.ImagesModel> images, @org.jetbrains.annotations.NotNull
    java.lang.String meaComment, @org.jetbrains.annotations.NotNull
    java.lang.String facility_incharge_comment) {
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
    
    public FeedbackSubmitModel() {
        super();
    }
    
    public FeedbackSubmitModel(@org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.ui.Feedback.ImagesModel> images, @org.jetbrains.annotations.NotNull
    java.lang.String meaComment, @org.jetbrains.annotations.NotNull
    java.lang.String facility_incharge_comment) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Feedback.ImagesModel> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Feedback.ImagesModel> getImages() {
        return null;
    }
    
    public final void setImages(@org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.ui.Feedback.ImagesModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMeaComment() {
        return null;
    }
    
    public final void setMeaComment(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFacility_incharge_comment() {
        return null;
    }
    
    public final void setFacility_incharge_comment(@org.jetbrains.annotations.NotNull
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
    public static final class Creator implements android.os.Parcelable.Creator<com.hisdu.meas.ui.Feedback.FeedbackSubmitModel> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.hisdu.meas.ui.Feedback.FeedbackSubmitModel createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.hisdu.meas.ui.Feedback.FeedbackSubmitModel[] newArray(int size) {
            return null;
        }
    }
}