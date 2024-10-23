package com.zest.android.ui.login;

import java.lang.System;

@androidx.room.Entity(tableName = "userModel")
@androidx.room.TypeConverters(value = {com.leopold.mvvm.data.db.converter.DateConverter.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J[\u0010\"\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e\u00a8\u0006)"}, d2 = {"Lcom/zest/android/ui/login/UserModel;", "", "access_token", "", "token_type", "UserName", "Id", "HealthFacility", "HFCode", "role", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHFCode", "()Ljava/lang/String;", "setHFCode", "(Ljava/lang/String;)V", "getHealthFacility", "setHealthFacility", "getId", "setId", "getUserName", "setUserName", "getAccess_token", "setAccess_token", "getRole", "setRole", "getToken_type", "setToken_type", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class UserModel {
    @org.jetbrains.annotations.Nullable
    private java.lang.String access_token;
    @org.jetbrains.annotations.Nullable
    private java.lang.String token_type;
    @org.jetbrains.annotations.Nullable
    private java.lang.String UserName;
    @org.jetbrains.annotations.NotNull
    @androidx.room.PrimaryKey
    private java.lang.String Id;
    @org.jetbrains.annotations.Nullable
    private java.lang.String HealthFacility;
    @org.jetbrains.annotations.Nullable
    private java.lang.String HFCode;
    @org.jetbrains.annotations.Nullable
    private java.lang.String role;
    
    @org.jetbrains.annotations.NotNull
    public final com.zest.android.ui.login.UserModel copy(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "access_token")
    java.lang.String access_token, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "token_type")
    java.lang.String token_type, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "UserName")
    java.lang.String UserName, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "Id")
    java.lang.String Id, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Health Facility")
    java.lang.String HealthFacility, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "HFCode")
    java.lang.String HFCode, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "role")
    java.lang.String role) {
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
    
    public UserModel(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "access_token")
    java.lang.String access_token, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "token_type")
    java.lang.String token_type, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "UserName")
    java.lang.String UserName, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "Id")
    java.lang.String Id, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Health Facility")
    java.lang.String HealthFacility, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "HFCode")
    java.lang.String HFCode, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "role")
    java.lang.String role) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAccess_token() {
        return null;
    }
    
    public final void setAccess_token(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getToken_type() {
        return null;
    }
    
    public final void setToken_type(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHealthFacility() {
        return null;
    }
    
    public final void setHealthFacility(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHFCode() {
        return null;
    }
    
    public final void setHFCode(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRole() {
        return null;
    }
    
    public final void setRole(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
}