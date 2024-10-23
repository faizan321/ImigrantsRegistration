package com.hisdu.meas.ui.Indicators;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B;\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJD\u0010\"\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\nH\u00d6\u0001J\t\u0010\'\u001a\u00020\bH\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006)"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/ZoneModel;", "", "error", "", "list", "", "Lcom/hisdu/meas/ui/Indicators/ZoneModel$Zone;", "message", "", "statusCode", "", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "getError", "()Ljava/lang/Boolean;", "setError", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getStatusCode", "()Ljava/lang/Integer;", "setStatusCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)Lcom/hisdu/meas/ui/Indicators/ZoneModel;", "equals", "other", "hashCode", "toString", "Zone", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class ZoneModel {
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean error;
    @org.jetbrains.annotations.Nullable
    private java.util.List<com.hisdu.meas.ui.Indicators.ZoneModel.Zone> list;
    @org.jetbrains.annotations.Nullable
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer statusCode;
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.Indicators.ZoneModel copy(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Error")
    java.lang.Boolean error, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "List")
    java.util.List<com.hisdu.meas.ui.Indicators.ZoneModel.Zone> list, @org.jetbrains.annotations.Nullable
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
    
    public ZoneModel() {
        super();
    }
    
    public ZoneModel(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Error")
    java.lang.Boolean error, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "List")
    java.util.List<com.hisdu.meas.ui.Indicators.ZoneModel.Zone> list, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Message")
    java.lang.String message, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "StatusCode")
    java.lang.Integer statusCode) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component1() {
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
    public final java.util.List<com.hisdu.meas.ui.Indicators.ZoneModel.Zone> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.hisdu.meas.ui.Indicators.ZoneModel.Zone> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.Nullable
    java.util.List<com.hisdu.meas.ui.Indicators.ZoneModel.Zone> p0) {
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
    @androidx.room.Entity(tableName = "Zone")
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JJ\u0010\u001e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\u0007H\u00d6\u0001J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\r\u00a8\u0006%"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/ZoneModel$Zone;", "", "districtCode", "", "divisionCode", "tehsilCode", "zoneId", "", "zoneName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getDistrictCode", "()Ljava/lang/String;", "setDistrictCode", "(Ljava/lang/String;)V", "getDivisionCode", "setDivisionCode", "getTehsilCode", "setTehsilCode", "getZoneId", "()Ljava/lang/Integer;", "setZoneId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getZoneName", "setZoneName", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/hisdu/meas/ui/Indicators/ZoneModel$Zone;", "equals", "", "other", "hashCode", "toString", "app_debug"})
    @com.squareup.moshi.JsonClass(generateAdapter = true)
    public static final class Zone {
        @org.jetbrains.annotations.Nullable
        private java.lang.String districtCode;
        @org.jetbrains.annotations.Nullable
        private java.lang.String divisionCode;
        @org.jetbrains.annotations.Nullable
        private java.lang.String tehsilCode;
        @org.jetbrains.annotations.Nullable
        @androidx.room.PrimaryKey
        private java.lang.Integer zoneId;
        @org.jetbrains.annotations.Nullable
        private java.lang.String zoneName;
        
        @org.jetbrains.annotations.NotNull
        public final com.hisdu.meas.ui.Indicators.ZoneModel.Zone copy(@org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "DistrictCode")
        java.lang.String districtCode, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "DivisionCode")
        java.lang.String divisionCode, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "TehsilCode")
        java.lang.String tehsilCode, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "ZoneId")
        java.lang.Integer zoneId, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "ZoneName")
        java.lang.String zoneName) {
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
        
        public Zone() {
            super();
        }
        
        public Zone(@org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "DistrictCode")
        java.lang.String districtCode, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "DivisionCode")
        java.lang.String divisionCode, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "TehsilCode")
        java.lang.String tehsilCode, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "ZoneId")
        java.lang.Integer zoneId, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "ZoneName")
        java.lang.String zoneName) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
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
        public final java.lang.String component2() {
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
        public final java.lang.String component3() {
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
        public final java.lang.Integer component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getZoneId() {
            return null;
        }
        
        public final void setZoneId(@org.jetbrains.annotations.Nullable
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getZoneName() {
            return null;
        }
        
        public final void setZoneName(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
    }
}