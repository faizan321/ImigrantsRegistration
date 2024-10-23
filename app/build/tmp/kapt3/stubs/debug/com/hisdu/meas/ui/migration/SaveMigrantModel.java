package com.hisdu.meas.ui.migration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u0011J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u0010\u00106\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010<\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010=\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u009e\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010C\u001a\u00020\u0005H\u00d6\u0001J\t\u0010D\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b#\u0010\u0017\"\u0004\b$\u0010\u0019R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010\u0019R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010+\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u0019R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0013\"\u0004\b/\u0010\u0015R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010+\u001a\u0004\b0\u0010(\"\u0004\b1\u0010*\u00a8\u0006E"}, d2 = {"Lcom/hisdu/meas/ui/migration/SaveMigrantModel;", "", "Address", "", "Adult", "", "CreatedBy", "CreatedDate", "FamilyHeadCNIC", "FamilyHeadName", "Id", "Kids", "Latitude", "", "NoOfHouseHold", "RouteOfMigrants", "longitude", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getAdult", "()Ljava/lang/Integer;", "setAdult", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCreatedBy", "setCreatedBy", "getCreatedDate", "setCreatedDate", "getFamilyHeadCNIC", "setFamilyHeadCNIC", "getFamilyHeadName", "setFamilyHeadName", "getId", "setId", "getKids", "setKids", "getLatitude", "()Ljava/lang/Double;", "setLatitude", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getNoOfHouseHold", "setNoOfHouseHold", "getRouteOfMigrants", "setRouteOfMigrants", "getLongitude", "setLongitude", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;)Lcom/hisdu/meas/ui/migration/SaveMigrantModel;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class SaveMigrantModel {
    @org.jetbrains.annotations.Nullable
    private java.lang.String Address;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer Adult;
    @org.jetbrains.annotations.Nullable
    private java.lang.String CreatedBy;
    @org.jetbrains.annotations.Nullable
    private java.lang.String CreatedDate;
    @org.jetbrains.annotations.Nullable
    private java.lang.String FamilyHeadCNIC;
    @org.jetbrains.annotations.Nullable
    private java.lang.String FamilyHeadName;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer Id;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer Kids;
    @org.jetbrains.annotations.Nullable
    private java.lang.Double Latitude;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer NoOfHouseHold;
    @org.jetbrains.annotations.Nullable
    private java.lang.String RouteOfMigrants;
    @org.jetbrains.annotations.Nullable
    private java.lang.Double longitude;
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.migration.SaveMigrantModel copy(@org.jetbrains.annotations.Nullable
    java.lang.String Address, @org.jetbrains.annotations.Nullable
    java.lang.Integer Adult, @org.jetbrains.annotations.Nullable
    java.lang.String CreatedBy, @org.jetbrains.annotations.Nullable
    java.lang.String CreatedDate, @org.jetbrains.annotations.Nullable
    java.lang.String FamilyHeadCNIC, @org.jetbrains.annotations.Nullable
    java.lang.String FamilyHeadName, @org.jetbrains.annotations.Nullable
    java.lang.Integer Id, @org.jetbrains.annotations.Nullable
    java.lang.Integer Kids, @org.jetbrains.annotations.Nullable
    java.lang.Double Latitude, @org.jetbrains.annotations.Nullable
    java.lang.Integer NoOfHouseHold, @org.jetbrains.annotations.Nullable
    java.lang.String RouteOfMigrants, @org.jetbrains.annotations.Nullable
    java.lang.Double longitude) {
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
    
    public SaveMigrantModel() {
        super();
    }
    
    public SaveMigrantModel(@org.jetbrains.annotations.Nullable
    java.lang.String Address, @org.jetbrains.annotations.Nullable
    java.lang.Integer Adult, @org.jetbrains.annotations.Nullable
    java.lang.String CreatedBy, @org.jetbrains.annotations.Nullable
    java.lang.String CreatedDate, @org.jetbrains.annotations.Nullable
    java.lang.String FamilyHeadCNIC, @org.jetbrains.annotations.Nullable
    java.lang.String FamilyHeadName, @org.jetbrains.annotations.Nullable
    java.lang.Integer Id, @org.jetbrains.annotations.Nullable
    java.lang.Integer Kids, @org.jetbrains.annotations.Nullable
    java.lang.Double Latitude, @org.jetbrains.annotations.Nullable
    java.lang.Integer NoOfHouseHold, @org.jetbrains.annotations.Nullable
    java.lang.String RouteOfMigrants, @org.jetbrains.annotations.Nullable
    java.lang.Double longitude) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getAdult() {
        return null;
    }
    
    public final void setAdult(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCreatedBy() {
        return null;
    }
    
    public final void setCreatedBy(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCreatedDate() {
        return null;
    }
    
    public final void setCreatedDate(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFamilyHeadCNIC() {
        return null;
    }
    
    public final void setFamilyHeadCNIC(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFamilyHeadName() {
        return null;
    }
    
    public final void setFamilyHeadName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getKids() {
        return null;
    }
    
    public final void setKids(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getLatitude() {
        return null;
    }
    
    public final void setLatitude(@org.jetbrains.annotations.Nullable
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getNoOfHouseHold() {
        return null;
    }
    
    public final void setNoOfHouseHold(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRouteOfMigrants() {
        return null;
    }
    
    public final void setRouteOfMigrants(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getLongitude() {
        return null;
    }
    
    public final void setLongitude(@org.jetbrains.annotations.Nullable
    java.lang.Double p0) {
    }
}