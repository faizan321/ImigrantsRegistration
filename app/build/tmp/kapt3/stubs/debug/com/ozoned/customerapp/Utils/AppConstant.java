package com.ozoned.customerapp.Utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/ozoned/customerapp/Utils/AppConstant;", "", "()V", "Companion", "app_debug"})
public final class AppConstant {
    @org.jetbrains.annotations.NotNull
    public static final com.ozoned.customerapp.Utils.AppConstant.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static java.lang.String BASEURL = "http://116.58.20.67:1148";
    @org.jetbrains.annotations.NotNull
    private static java.lang.String AppversionURL = "https://hisduapps.pshealthpunjab.gov.pk/api/AppStatus/GetAppSettings?Name=MEAS";
    @org.jetbrains.annotations.NotNull
    private static java.lang.String TOKEN = "TOKEN";
    @org.jetbrains.annotations.NotNull
    private static java.lang.String USERID = "USERID";
    @org.jetbrains.annotations.NotNull
    private static java.lang.String SELECTEDROLE = "SELECTEDROLE";
    @org.jetbrains.annotations.NotNull
    private static java.lang.String SELECTEDMODULE = "SELECTEDMODULE";
    @org.jetbrains.annotations.NotNull
    private static java.lang.String HFCode = "HFCode";
    @org.jetbrains.annotations.NotNull
    private static java.lang.String AppVersion = "AppVersion";
    @org.jetbrains.annotations.NotNull
    private static java.lang.String ChecklistPrimary = "ChecklistPrimary";
    @org.jetbrains.annotations.NotNull
    private static java.lang.String ChecklistSceondary = "ChecklistSceondary";
    @org.jetbrains.annotations.NotNull
    private static java.lang.String ChecklistMACS = "ChecklistMACS";
    @org.jetbrains.annotations.NotNull
    private static java.lang.String DefaultDatePattern = "yyyy-MM-dd HH:mm:ss.SSS";
    
    public AppConstant() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b&\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010\'\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\b\u00a8\u0006*"}, d2 = {"Lcom/ozoned/customerapp/Utils/AppConstant$Companion;", "", "()V", "AppVersion", "", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "(Ljava/lang/String;)V", "AppversionURL", "getAppversionURL", "setAppversionURL", "BASEURL", "getBASEURL", "setBASEURL", "ChecklistMACS", "getChecklistMACS", "setChecklistMACS", "ChecklistPrimary", "getChecklistPrimary", "setChecklistPrimary", "ChecklistSceondary", "getChecklistSceondary", "setChecklistSceondary", "DefaultDatePattern", "getDefaultDatePattern", "setDefaultDatePattern", "HFCode", "getHFCode", "setHFCode", "SELECTEDMODULE", "getSELECTEDMODULE", "setSELECTEDMODULE", "SELECTEDROLE", "getSELECTEDROLE", "setSELECTEDROLE", "TOKEN", "getTOKEN", "setTOKEN", "USERID", "getUSERID", "setUSERID", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getBASEURL() {
            return null;
        }
        
        public final void setBASEURL(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getAppversionURL() {
            return null;
        }
        
        public final void setAppversionURL(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTOKEN() {
            return null;
        }
        
        public final void setTOKEN(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getUSERID() {
            return null;
        }
        
        public final void setUSERID(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getSELECTEDROLE() {
            return null;
        }
        
        public final void setSELECTEDROLE(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getSELECTEDMODULE() {
            return null;
        }
        
        public final void setSELECTEDMODULE(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getHFCode() {
            return null;
        }
        
        public final void setHFCode(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getAppVersion() {
            return null;
        }
        
        public final void setAppVersion(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getChecklistPrimary() {
            return null;
        }
        
        public final void setChecklistPrimary(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getChecklistSceondary() {
            return null;
        }
        
        public final void setChecklistSceondary(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getChecklistMACS() {
            return null;
        }
        
        public final void setChecklistMACS(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDefaultDatePattern() {
            return null;
        }
        
        public final void setDefaultDatePattern(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
    }
}