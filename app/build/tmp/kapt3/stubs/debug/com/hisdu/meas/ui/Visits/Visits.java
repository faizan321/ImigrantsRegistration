package com.hisdu.meas.ui.Visits;

import java.lang.System;

@androidx.room.Entity
@kotlinx.android.parcel.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b>\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0013J\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010>\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010%J\u0010\u0010?\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010%J\u0010\u0010@\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010%J\u0010\u0010A\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00b6\u0001\u0010C\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010DJ\t\u0010E\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010F\u001a\u00020\t2\b\u0010G\u001a\u0004\u0018\u00010HH\u00d6\u0003J\t\u0010I\u001a\u00020\u0007H\u00d6\u0001J\t\u0010J\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0007H\u00d6\u0001R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010(\u001a\u0004\b\b\u0010%\"\u0004\b&\u0010\'R\u001e\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010(\u001a\u0004\b\n\u0010%\"\u0004\b)\u0010\'R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010(\u001a\u0004\b\u000b\u0010%\"\u0004\b*\u0010\'R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0015\"\u0004\b.\u0010\u0017R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u0010\u001bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0015\"\u0004\b2\u0010\u0017R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0015\"\u0004\b4\u0010\u0017\u00a8\u0006P"}, d2 = {"Lcom/hisdu/meas/ui/Visits/Visits;", "Landroid/os/Parcelable;", "fullName", "", "hFMISCode", "healthFacilityName", "hfId", "", "isRepeat", "", "isSpecial", "isVisited", "shiftId", "shiftName", "userId", "username", "visitedDate", "ModeName", "VisitId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getModeName", "()Ljava/lang/String;", "setModeName", "(Ljava/lang/String;)V", "getVisitId", "()Ljava/lang/Integer;", "setVisitId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getFullName", "setFullName", "getHFMISCode", "setHFMISCode", "getHealthFacilityName", "setHealthFacilityName", "getHfId", "setHfId", "()Ljava/lang/Boolean;", "setRepeat", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setSpecial", "setVisited", "getShiftId", "setShiftId", "getShiftName", "setShiftName", "getUserId", "setUserId", "getUsername", "setUsername", "getVisitedDate", "setVisitedDate", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/hisdu/meas/ui/Visits/Visits;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Visits implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    private java.lang.String fullName;
    @org.jetbrains.annotations.Nullable
    private java.lang.String hFMISCode;
    @org.jetbrains.annotations.Nullable
    private java.lang.String healthFacilityName;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer hfId;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean isRepeat;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean isSpecial;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean isVisited;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer shiftId;
    @org.jetbrains.annotations.Nullable
    private java.lang.String shiftName;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer userId;
    @org.jetbrains.annotations.Nullable
    private java.lang.String username;
    @org.jetbrains.annotations.Nullable
    private java.lang.String visitedDate;
    @org.jetbrains.annotations.Nullable
    private java.lang.String ModeName;
    @org.jetbrains.annotations.Nullable
    @androidx.room.PrimaryKey
    private java.lang.Integer VisitId;
    public static final android.os.Parcelable.Creator<com.hisdu.meas.ui.Visits.Visits> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.Visits.Visits copy(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "FullName")
    java.lang.String fullName, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "HFMISCode")
    java.lang.String hFMISCode, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "HealthFacilityName")
    java.lang.String healthFacilityName, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "HfId")
    java.lang.Integer hfId, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsRepeat")
    java.lang.Boolean isRepeat, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsSpecial")
    java.lang.Boolean isSpecial, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsVisited")
    java.lang.Boolean isVisited, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "ShiftId")
    java.lang.Integer shiftId, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "ShiftName")
    java.lang.String shiftName, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "UserId")
    java.lang.Integer userId, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Username")
    java.lang.String username, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "VisitedDate")
    java.lang.String visitedDate, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "ModeName")
    java.lang.String ModeName, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "VisitId")
    java.lang.Integer VisitId) {
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
    
    public Visits() {
        super();
    }
    
    public Visits(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "FullName")
    java.lang.String fullName, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "HFMISCode")
    java.lang.String hFMISCode, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "HealthFacilityName")
    java.lang.String healthFacilityName, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "HfId")
    java.lang.Integer hfId, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsRepeat")
    java.lang.Boolean isRepeat, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsSpecial")
    java.lang.Boolean isSpecial, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsVisited")
    java.lang.Boolean isVisited, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "ShiftId")
    java.lang.Integer shiftId, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "ShiftName")
    java.lang.String shiftName, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "UserId")
    java.lang.Integer userId, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Username")
    java.lang.String username, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "VisitedDate")
    java.lang.String visitedDate, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "ModeName")
    java.lang.String ModeName, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "VisitId")
    java.lang.Integer VisitId) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFullName() {
        return null;
    }
    
    public final void setFullName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHFMISCode() {
        return null;
    }
    
    public final void setHFMISCode(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHealthFacilityName() {
        return null;
    }
    
    public final void setHealthFacilityName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getHfId() {
        return null;
    }
    
    public final void setHfId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean isRepeat() {
        return null;
    }
    
    public final void setRepeat(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean isSpecial() {
        return null;
    }
    
    public final void setSpecial(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean isVisited() {
        return null;
    }
    
    public final void setVisited(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getShiftId() {
        return null;
    }
    
    public final void setShiftId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getShiftName() {
        return null;
    }
    
    public final void setShiftName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getUserId() {
        return null;
    }
    
    public final void setUserId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUsername() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVisitedDate() {
        return null;
    }
    
    public final void setVisitedDate(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getModeName() {
        return null;
    }
    
    public final void setModeName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getVisitId() {
        return null;
    }
    
    public final void setVisitId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.hisdu.meas.ui.Visits.Visits> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.hisdu.meas.ui.Visits.Visits createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.hisdu.meas.ui.Visits.Visits[] newArray(int size) {
            return null;
        }
    }
}