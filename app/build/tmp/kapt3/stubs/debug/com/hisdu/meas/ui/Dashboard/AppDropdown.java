package com.hisdu.meas.ui.Dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\'B3\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J<\u0010!\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\tH\u00d6\u0001J\t\u0010&\u001a\u00020\u0007H\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006("}, d2 = {"Lcom/hisdu/meas/ui/Dashboard/AppDropdown;", "", "error", "", "list", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData;", "message", "", "statusCode", "", "(Ljava/lang/Boolean;Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData;Ljava/lang/String;Ljava/lang/Integer;)V", "getError", "()Ljava/lang/Boolean;", "setError", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getList", "()Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData;", "setList", "(Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getStatusCode", "()Ljava/lang/Integer;", "setStatusCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData;Ljava/lang/String;Ljava/lang/Integer;)Lcom/hisdu/meas/ui/Dashboard/AppDropdown;", "equals", "other", "hashCode", "toString", "DropdownData", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class AppDropdown {
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean error;
    @org.jetbrains.annotations.NotNull
    private com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData list;
    @org.jetbrains.annotations.Nullable
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer statusCode;
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.Dashboard.AppDropdown copy(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Error")
    java.lang.Boolean error, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "List")
    com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData list, @org.jetbrains.annotations.Nullable
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
    
    public AppDropdown(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Error")
    java.lang.Boolean error, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "List")
    com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData list, @org.jetbrains.annotations.Nullable
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
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData p0) {
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0006,-./01Bq\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u00c6\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003H\u00c6\u0003Ju\u0010$\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00032\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020)H\u00d6\u0001J\t\u0010*\u001a\u00020+H\u00d6\u0001R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013\u00a8\u00062"}, d2 = {"Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData;", "", "applicationType", "", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$ApplicationType;", "healthFacilityType", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$HealthFacilityType;", "modules", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$Module;", "shifts", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$Shift;", "PresentStatusList", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$PresanceStatus;", "designations", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$designation;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getPresentStatusList", "()Ljava/util/List;", "setPresentStatusList", "(Ljava/util/List;)V", "getApplicationType", "setApplicationType", "getDesignations", "setDesignations", "getHealthFacilityType", "setHealthFacilityType", "getModules", "setModules", "getShifts", "setShifts", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ApplicationType", "HealthFacilityType", "Module", "PresanceStatus", "Shift", "designation", "app_debug"})
    @com.squareup.moshi.JsonClass(generateAdapter = true)
    public static final class DropdownData {
        @org.jetbrains.annotations.NotNull
        private java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.ApplicationType> applicationType;
        @org.jetbrains.annotations.Nullable
        private java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.HealthFacilityType> healthFacilityType;
        @org.jetbrains.annotations.Nullable
        private java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Module> modules;
        @org.jetbrains.annotations.Nullable
        private java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Shift> shifts;
        @org.jetbrains.annotations.Nullable
        private java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.PresanceStatus> PresentStatusList;
        @org.jetbrains.annotations.Nullable
        private java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.designation> designations;
        
        @org.jetbrains.annotations.NotNull
        public final com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData copy(@org.jetbrains.annotations.NotNull
        @com.squareup.moshi.Json(name = "ApplicationType")
        java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.ApplicationType> applicationType, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "HealthFacilityType")
        java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.HealthFacilityType> healthFacilityType, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "Modules")
        java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Module> modules, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "Shifts")
        java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Shift> shifts, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "PresentStatus")
        java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.PresanceStatus> PresentStatusList, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "designations")
        java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.designation> designations) {
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
        
        public DropdownData() {
            super();
        }
        
        public DropdownData(@org.jetbrains.annotations.NotNull
        @com.squareup.moshi.Json(name = "ApplicationType")
        java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.ApplicationType> applicationType, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "HealthFacilityType")
        java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.HealthFacilityType> healthFacilityType, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "Modules")
        java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Module> modules, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "Shifts")
        java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Shift> shifts, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "PresentStatus")
        java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.PresanceStatus> PresentStatusList, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "designations")
        java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.designation> designations) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.ApplicationType> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.ApplicationType> getApplicationType() {
            return null;
        }
        
        public final void setApplicationType(@org.jetbrains.annotations.NotNull
        java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.ApplicationType> p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.HealthFacilityType> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.HealthFacilityType> getHealthFacilityType() {
            return null;
        }
        
        public final void setHealthFacilityType(@org.jetbrains.annotations.Nullable
        java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.HealthFacilityType> p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Module> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Module> getModules() {
            return null;
        }
        
        public final void setModules(@org.jetbrains.annotations.Nullable
        java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Module> p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Shift> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Shift> getShifts() {
            return null;
        }
        
        public final void setShifts(@org.jetbrains.annotations.Nullable
        java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Shift> p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.PresanceStatus> component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.PresanceStatus> getPresentStatusList() {
            return null;
        }
        
        public final void setPresentStatusList(@org.jetbrains.annotations.Nullable
        java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.PresanceStatus> p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.designation> component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.designation> getDesignations() {
            return null;
        }
        
        public final void setDesignations(@org.jetbrains.annotations.Nullable
        java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.designation> p0) {
        }
        
        @androidx.room.Entity
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J&\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$ApplicationType;", "", "applicationTypeId", "", "applicationTypeName", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getApplicationTypeId", "()Ljava/lang/Integer;", "setApplicationTypeId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getApplicationTypeName", "()Ljava/lang/String;", "setApplicationTypeName", "(Ljava/lang/String;)V", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$ApplicationType;", "equals", "", "other", "hashCode", "toString", "app_debug"})
        @com.squareup.moshi.JsonClass(generateAdapter = true)
        public static final class ApplicationType {
            @org.jetbrains.annotations.Nullable
            @androidx.room.PrimaryKey
            private java.lang.Integer applicationTypeId;
            @org.jetbrains.annotations.Nullable
            private java.lang.String applicationTypeName;
            
            @org.jetbrains.annotations.NotNull
            public final com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.ApplicationType copy(@org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "ApplicationTypeId")
            java.lang.Integer applicationTypeId, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "ApplicationTypeName")
            java.lang.String applicationTypeName) {
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
            
            public ApplicationType(@org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "ApplicationTypeId")
            java.lang.Integer applicationTypeId, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "ApplicationTypeName")
            java.lang.String applicationTypeName) {
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
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getApplicationTypeName() {
                return null;
            }
            
            public final void setApplicationTypeName(@org.jetbrains.annotations.Nullable
            java.lang.String p0) {
            }
        }
        
        @androidx.room.TypeConverters(value = {com.leopold.mvvm.data.db.converter.DateConverter.class})
        @androidx.room.Entity
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH\u00c6\u0003JD\u0010\u001d\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001J\t\u0010#\u001a\u00020\u0005H\u00d6\u0001R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006$"}, d2 = {"Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$HealthFacilityType;", "", "facilityTypeId", "", "faciltyTypeName", "", "CategoryId", "ApplicationTypeIds", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "getApplicationTypeIds", "()Ljava/util/List;", "setApplicationTypeIds", "(Ljava/util/List;)V", "getCategoryId", "()Ljava/lang/Integer;", "setCategoryId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getFacilityTypeId", "setFacilityTypeId", "getFaciltyTypeName", "()Ljava/lang/String;", "setFaciltyTypeName", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$HealthFacilityType;", "equals", "", "other", "hashCode", "toString", "app_debug"})
        @com.squareup.moshi.JsonClass(generateAdapter = true)
        public static final class HealthFacilityType {
            @org.jetbrains.annotations.Nullable
            @androidx.room.PrimaryKey
            private java.lang.Integer facilityTypeId;
            @org.jetbrains.annotations.Nullable
            private java.lang.String faciltyTypeName;
            @org.jetbrains.annotations.Nullable
            private java.lang.Integer CategoryId;
            @org.jetbrains.annotations.Nullable
            private java.util.List<java.lang.Integer> ApplicationTypeIds;
            
            @org.jetbrains.annotations.NotNull
            public final com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.HealthFacilityType copy(@org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "FacilityTypeId")
            java.lang.Integer facilityTypeId, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "FaciltyTypeName")
            java.lang.String faciltyTypeName, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "CategoryId")
            java.lang.Integer CategoryId, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "ApplicationTypeIds")
            java.util.List<java.lang.Integer> ApplicationTypeIds) {
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
            
            public HealthFacilityType(@org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "FacilityTypeId")
            java.lang.Integer facilityTypeId, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "FaciltyTypeName")
            java.lang.String faciltyTypeName, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "CategoryId")
            java.lang.Integer CategoryId, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "ApplicationTypeIds")
            java.util.List<java.lang.Integer> ApplicationTypeIds) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Integer component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Integer getFacilityTypeId() {
                return null;
            }
            
            public final void setFacilityTypeId(@org.jetbrains.annotations.Nullable
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getFaciltyTypeName() {
                return null;
            }
            
            public final void setFaciltyTypeName(@org.jetbrains.annotations.Nullable
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Integer component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Integer getCategoryId() {
                return null;
            }
            
            public final void setCategoryId(@org.jetbrains.annotations.Nullable
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.util.List<java.lang.Integer> component4() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.util.List<java.lang.Integer> getApplicationTypeIds() {
                return null;
            }
            
            public final void setApplicationTypeIds(@org.jetbrains.annotations.Nullable
            java.util.List<java.lang.Integer> p0) {
            }
        }
        
        @androidx.room.Entity
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ>\u0010\u001e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001J\t\u0010#\u001a\u00020\u0006H\u00d6\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006$"}, d2 = {"Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$Module;", "", "applicationTypeId", "", "moduleId", "moduleName", "", "IsRequired", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "getIsRequired", "()Ljava/lang/Boolean;", "setIsRequired", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getApplicationTypeId", "()Ljava/lang/Integer;", "setApplicationTypeId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getModuleId", "setModuleId", "getModuleName", "()Ljava/lang/String;", "setModuleName", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$Module;", "equals", "other", "hashCode", "toString", "app_debug"})
        @com.squareup.moshi.JsonClass(generateAdapter = true)
        public static final class Module {
            @org.jetbrains.annotations.Nullable
            private java.lang.Integer applicationTypeId;
            @org.jetbrains.annotations.Nullable
            @androidx.room.PrimaryKey
            private java.lang.Integer moduleId;
            @org.jetbrains.annotations.Nullable
            private java.lang.String moduleName;
            @org.jetbrains.annotations.Nullable
            private java.lang.Boolean IsRequired;
            
            @org.jetbrains.annotations.NotNull
            public final com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Module copy(@org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "ApplicationTypeId")
            java.lang.Integer applicationTypeId, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "ModuleId")
            java.lang.Integer moduleId, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "ModuleName")
            java.lang.String moduleName, @org.jetbrains.annotations.Nullable
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
            
            public Module(@org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "ApplicationTypeId")
            java.lang.Integer applicationTypeId, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "ModuleId")
            java.lang.Integer moduleId, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "ModuleName")
            java.lang.String moduleName, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "IsRequired")
            java.lang.Boolean IsRequired) {
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
            public final java.lang.Boolean getIsRequired() {
                return null;
            }
            
            public final void setIsRequired(@org.jetbrains.annotations.Nullable
            java.lang.Boolean p0) {
            }
        }
        
        @androidx.room.TypeConverters(value = {com.leopold.mvvm.data.db.converter.DateConverter.class})
        @androidx.room.Entity
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H\u00c6\u0003J8\u0010\u0019\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006 "}, d2 = {"Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$Shift;", "", "shiftId", "", "shiftName", "", "HFTypeId", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "getHFTypeId", "()Ljava/util/List;", "setHFTypeId", "(Ljava/util/List;)V", "getShiftId", "()Ljava/lang/Integer;", "setShiftId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getShiftName", "()Ljava/lang/String;", "setShiftName", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$Shift;", "equals", "", "other", "hashCode", "toString", "app_debug"})
        @com.squareup.moshi.JsonClass(generateAdapter = true)
        public static final class Shift {
            @org.jetbrains.annotations.Nullable
            @androidx.room.PrimaryKey
            private java.lang.Integer shiftId;
            @org.jetbrains.annotations.Nullable
            private java.lang.String shiftName;
            @org.jetbrains.annotations.Nullable
            private java.util.List<java.lang.Integer> HFTypeId;
            
            @org.jetbrains.annotations.NotNull
            public final com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Shift copy(@org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "ShiftId")
            java.lang.Integer shiftId, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "ShiftName")
            java.lang.String shiftName, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "HFTypeId")
            java.util.List<java.lang.Integer> HFTypeId) {
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
            
            public Shift(@org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "ShiftId")
            java.lang.Integer shiftId, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "ShiftName")
            java.lang.String shiftName, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "HFTypeId")
            java.util.List<java.lang.Integer> HFTypeId) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Integer component1() {
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
            public final java.lang.String component2() {
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
            public final java.util.List<java.lang.Integer> component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.util.List<java.lang.Integer> getHFTypeId() {
                return null;
            }
            
            public final void setHFTypeId(@org.jetbrains.annotations.Nullable
            java.util.List<java.lang.Integer> p0) {
            }
        }
        
        @androidx.room.Entity
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J&\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$PresanceStatus;", "", "ProfileId", "", "ProfileName", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getProfileId", "()Ljava/lang/Integer;", "setProfileId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getProfileName", "()Ljava/lang/String;", "setProfileName", "(Ljava/lang/String;)V", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$PresanceStatus;", "equals", "", "other", "hashCode", "toString", "app_debug"})
        @com.squareup.moshi.JsonClass(generateAdapter = true)
        public static final class PresanceStatus {
            @org.jetbrains.annotations.Nullable
            @androidx.room.PrimaryKey
            private java.lang.Integer ProfileId;
            @org.jetbrains.annotations.Nullable
            private java.lang.String ProfileName;
            
            @org.jetbrains.annotations.NotNull
            public final com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.PresanceStatus copy(@org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "ProfileId")
            java.lang.Integer ProfileId, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "ProfileName")
            java.lang.String ProfileName) {
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
            
            public PresanceStatus(@org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "ProfileId")
            java.lang.Integer ProfileId, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "ProfileName")
            java.lang.String ProfileName) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Integer component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Integer getProfileId() {
                return null;
            }
            
            public final void setProfileId(@org.jetbrains.annotations.Nullable
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getProfileName() {
                return null;
            }
            
            public final void setProfileName(@org.jetbrains.annotations.Nullable
            java.lang.String p0) {
            }
        }
        
        @androidx.room.TypeConverters(value = {com.leopold.mvvm.data.db.converter.DateConverter.class})
        @androidx.room.Entity
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJV\u0010\"\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001J\t\u0010(\u001a\u00020\u0006H\u00d6\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015\u00a8\u0006)"}, d2 = {"Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$designation;", "", "DesignationHFId", "", "DesignationId", "DesignationName", "", "HFTypeId", "ShiftId", "SequenceNo", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getDesignationHFId", "()Ljava/lang/Integer;", "setDesignationHFId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDesignationId", "setDesignationId", "getDesignationName", "()Ljava/lang/String;", "setDesignationName", "(Ljava/lang/String;)V", "getHFTypeId", "setHFTypeId", "getSequenceNo", "setSequenceNo", "getShiftId", "setShiftId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$designation;", "equals", "", "other", "hashCode", "toString", "app_debug"})
        @com.squareup.moshi.JsonClass(generateAdapter = true)
        public static final class designation {
            @org.jetbrains.annotations.Nullable
            @androidx.room.PrimaryKey
            private java.lang.Integer DesignationHFId;
            @org.jetbrains.annotations.Nullable
            private java.lang.Integer DesignationId;
            @org.jetbrains.annotations.Nullable
            private java.lang.String DesignationName;
            @org.jetbrains.annotations.Nullable
            private java.lang.String HFTypeId;
            @org.jetbrains.annotations.Nullable
            private java.lang.String ShiftId;
            @org.jetbrains.annotations.Nullable
            private java.lang.Integer SequenceNo;
            
            @org.jetbrains.annotations.NotNull
            public final com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.designation copy(@org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "DesignationHFId")
            java.lang.Integer DesignationHFId, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "DesignationId")
            java.lang.Integer DesignationId, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "DesignationName")
            java.lang.String DesignationName, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "HFTypeId")
            java.lang.String HFTypeId, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "ShiftId")
            java.lang.String ShiftId, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "SequenceNo")
            java.lang.Integer SequenceNo) {
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
            
            public designation(@org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "DesignationHFId")
            java.lang.Integer DesignationHFId, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "DesignationId")
            java.lang.Integer DesignationId, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "DesignationName")
            java.lang.String DesignationName, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "HFTypeId")
            java.lang.String HFTypeId, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "ShiftId")
            java.lang.String ShiftId, @org.jetbrains.annotations.Nullable
            @com.squareup.moshi.Json(name = "SequenceNo")
            java.lang.Integer SequenceNo) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Integer component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Integer getDesignationHFId() {
                return null;
            }
            
            public final void setDesignationHFId(@org.jetbrains.annotations.Nullable
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Integer component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Integer getDesignationId() {
                return null;
            }
            
            public final void setDesignationId(@org.jetbrains.annotations.Nullable
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getDesignationName() {
                return null;
            }
            
            public final void setDesignationName(@org.jetbrains.annotations.Nullable
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getHFTypeId() {
                return null;
            }
            
            public final void setHFTypeId(@org.jetbrains.annotations.Nullable
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String component5() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getShiftId() {
                return null;
            }
            
            public final void setShiftId(@org.jetbrains.annotations.Nullable
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Integer component6() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Integer getSequenceNo() {
                return null;
            }
            
            public final void setSequenceNo(@org.jetbrains.annotations.Nullable
            java.lang.Integer p0) {
            }
        }
    }
}