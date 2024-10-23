package com.zest.android.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001(B;\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJD\u0010\"\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\nH\u00d6\u0001J\t\u0010\'\u001a\u00020\bH\u00d6\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006)"}, d2 = {"Lcom/zest/android/ui/login/HealthFacility;", "", "List", "", "Lcom/zest/android/ui/login/HealthFacility$HealthFacilityModel;", "error", "", "message", "", "statusCode", "", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;)V", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "getError", "()Ljava/lang/Boolean;", "setError", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getStatusCode", "()Ljava/lang/Integer;", "setStatusCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;)Lcom/zest/android/ui/login/HealthFacility;", "equals", "other", "hashCode", "toString", "HealthFacilityModel", "app_debug"})
public final class HealthFacility {
    @org.jetbrains.annotations.Nullable
    private java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel> List;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean error;
    @org.jetbrains.annotations.Nullable
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer statusCode;
    
    @org.jetbrains.annotations.NotNull
    public final com.zest.android.ui.login.HealthFacility copy(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "List")
    java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel> List, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Error")
    java.lang.Boolean error, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Message")
    java.lang.String message, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "StatusCode")
    java.lang.Integer statusCode) {
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
    
    public HealthFacility() {
        super();
    }
    
    public HealthFacility(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "List")
    java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel> List, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Error")
    java.lang.Boolean error, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Message")
    java.lang.String message, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "StatusCode")
    java.lang.Integer statusCode) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.Nullable
    java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getError() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getStatusCode() {
        return null;
    }
    
    public final void setStatusCode(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @androidx.room.TypeConverters(value = {com.leopold.mvvm.data.db.converter.DateConverter.class})
    @androidx.room.Entity(tableName = "HealthFacility")
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00a1\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00aa\u0001\u0010>\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010C\u001a\u00020\u0010H\u00d6\u0001J\t\u0010D\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b\'\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010\u0015\u00a8\u0006E"}, d2 = {"Lcom/zest/android/ui/login/HealthFacility$HealthFacilityModel;", "", "DivisionCode", "", "DivisionName", "DistrictCode", "DistrictName", "TehsilCode", "TehsilName", "HFMISCode", "HealthFacilityName", "ModeName", "lvl", "ZoneId", "AmbulanceNo", "id", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAmbulanceNo", "()Ljava/lang/String;", "setAmbulanceNo", "(Ljava/lang/String;)V", "getDistrictCode", "setDistrictCode", "getDistrictName", "setDistrictName", "getDivisionCode", "setDivisionCode", "getDivisionName", "setDivisionName", "getHFMISCode", "setHFMISCode", "getHealthFacilityName", "setHealthFacilityName", "getModeName", "setModeName", "getTehsilCode", "setTehsilCode", "getTehsilName", "setTehsilName", "getZoneId", "setZoneId", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLvl", "setLvl", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/zest/android/ui/login/HealthFacility$HealthFacilityModel;", "equals", "", "other", "hashCode", "toString", "app_debug"})
    @com.squareup.moshi.JsonClass(generateAdapter = true)
    public static final class HealthFacilityModel {
        @org.jetbrains.annotations.Nullable
        private java.lang.String DivisionCode;
        @org.jetbrains.annotations.Nullable
        private java.lang.String DivisionName;
        @org.jetbrains.annotations.Nullable
        private java.lang.String DistrictCode;
        @org.jetbrains.annotations.Nullable
        private java.lang.String DistrictName;
        @org.jetbrains.annotations.Nullable
        private java.lang.String TehsilCode;
        @org.jetbrains.annotations.Nullable
        private java.lang.String TehsilName;
        @org.jetbrains.annotations.Nullable
        private java.lang.String HFMISCode;
        @org.jetbrains.annotations.Nullable
        private java.lang.String HealthFacilityName;
        @org.jetbrains.annotations.Nullable
        private java.lang.String ModeName;
        @org.jetbrains.annotations.Nullable
        private java.lang.String lvl;
        @org.jetbrains.annotations.Nullable
        private java.lang.String ZoneId;
        @org.jetbrains.annotations.Nullable
        private java.lang.String AmbulanceNo;
        @org.jetbrains.annotations.Nullable
        @androidx.room.PrimaryKey(autoGenerate = true)
        private java.lang.Integer id;
        
        @org.jetbrains.annotations.NotNull
        public final com.zest.android.ui.login.HealthFacility.HealthFacilityModel copy(@org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "DivisionCode")
        java.lang.String DivisionCode, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "DivisionName")
        java.lang.String DivisionName, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "DistrictCode")
        java.lang.String DistrictCode, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "DistrictName")
        java.lang.String DistrictName, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "TehsilCode")
        java.lang.String TehsilCode, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "TehsilName")
        java.lang.String TehsilName, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "HFMISCode")
        java.lang.String HFMISCode, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "HealthFacilityName")
        java.lang.String HealthFacilityName, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "ModeName")
        java.lang.String ModeName, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "lvl")
        java.lang.String lvl, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "ZoneId")
        java.lang.String ZoneId, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "AmbulanceNo")
        java.lang.String AmbulanceNo, @org.jetbrains.annotations.Nullable
        @androidx.annotation.NonNull
        @com.squareup.moshi.Json(name = "id")
        java.lang.Integer id) {
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
        
        public HealthFacilityModel(@org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "DivisionCode")
        java.lang.String DivisionCode, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "DivisionName")
        java.lang.String DivisionName, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "DistrictCode")
        java.lang.String DistrictCode, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "DistrictName")
        java.lang.String DistrictName, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "TehsilCode")
        java.lang.String TehsilCode, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "TehsilName")
        java.lang.String TehsilName, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "HFMISCode")
        java.lang.String HFMISCode, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "HealthFacilityName")
        java.lang.String HealthFacilityName, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "ModeName")
        java.lang.String ModeName, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "lvl")
        java.lang.String lvl, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "ZoneId")
        java.lang.String ZoneId, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "AmbulanceNo")
        java.lang.String AmbulanceNo, @org.jetbrains.annotations.Nullable
        @androidx.annotation.NonNull
        @com.squareup.moshi.Json(name = "id")
        java.lang.Integer id) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getDivisionCode() {
            return null;
        }
        
        public final void setDivisionCode(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getDivisionName() {
            return null;
        }
        
        public final void setDivisionName(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getDistrictCode() {
            return null;
        }
        
        public final void setDistrictCode(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getDistrictName() {
            return null;
        }
        
        public final void setDistrictName(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getTehsilCode() {
            return null;
        }
        
        public final void setTehsilCode(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getTehsilName() {
            return null;
        }
        
        public final void setTehsilName(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component7() {
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
        public final java.lang.String component8() {
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
        public final java.lang.String component9() {
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
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getLvl() {
            return null;
        }
        
        public final void setLvl(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getZoneId() {
            return null;
        }
        
        public final void setZoneId(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getAmbulanceNo() {
            return null;
        }
        
        public final void setAmbulanceNo(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable
        java.lang.Integer p0) {
        }
    }
}