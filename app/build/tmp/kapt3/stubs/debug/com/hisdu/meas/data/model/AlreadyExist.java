package com.hisdu.meas.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u0010\u0010,\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u0010\u0010-\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u0010\u00105\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u00106\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u00107\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u00b6\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001\u00a2\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020\u00132\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010<\u001a\u00020\tH\u00d6\u0001J\t\u0010=\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b!\u0010\u001fR\u0015\u0010\r\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\"\u0010\u001cR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b#\u0010\u001cR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b%\u0010&R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b(\u0010\u001cR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b)\u0010\u001c\u00a8\u0006>"}, d2 = {"Lcom/hisdu/meas/data/model/AlreadyExist;", "", "BHUImage", "", "Created", "CreatedDate", "Desigination", "HFMIS", "Id", "", "Latitude", "", "Longitude", "NoOfBed", "NoOfWheelChair", "TotalBeds", "TotalWheelChair", "Phase", "RecordStatus", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "getBHUImage", "()Ljava/lang/String;", "getCreated", "getCreatedDate", "getDesigination", "getHFMIS", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude", "getNoOfBed", "getNoOfWheelChair", "getPhase", "getRecordStatus", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTotalBeds", "getTotalWheelChair", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/hisdu/meas/data/model/AlreadyExist;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class AlreadyExist {
    @org.jetbrains.annotations.Nullable
    private final java.lang.String BHUImage = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String Created = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String CreatedDate = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String Desigination = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String HFMIS = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer Id = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double Latitude = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double Longitude = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer NoOfBed = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer NoOfWheelChair = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer TotalBeds = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer TotalWheelChair = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String Phase = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean RecordStatus = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.data.model.AlreadyExist copy(@org.jetbrains.annotations.Nullable
    java.lang.String BHUImage, @org.jetbrains.annotations.Nullable
    java.lang.String Created, @org.jetbrains.annotations.Nullable
    java.lang.String CreatedDate, @org.jetbrains.annotations.Nullable
    java.lang.String Desigination, @org.jetbrains.annotations.Nullable
    java.lang.String HFMIS, @org.jetbrains.annotations.Nullable
    java.lang.Integer Id, @org.jetbrains.annotations.Nullable
    java.lang.Double Latitude, @org.jetbrains.annotations.Nullable
    java.lang.Double Longitude, @org.jetbrains.annotations.Nullable
    java.lang.Integer NoOfBed, @org.jetbrains.annotations.Nullable
    java.lang.Integer NoOfWheelChair, @org.jetbrains.annotations.Nullable
    java.lang.Integer TotalBeds, @org.jetbrains.annotations.Nullable
    java.lang.Integer TotalWheelChair, @org.jetbrains.annotations.Nullable
    java.lang.String Phase, @org.jetbrains.annotations.Nullable
    java.lang.Boolean RecordStatus) {
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
    
    public AlreadyExist() {
        super();
    }
    
    public AlreadyExist(@org.jetbrains.annotations.Nullable
    java.lang.String BHUImage, @org.jetbrains.annotations.Nullable
    java.lang.String Created, @org.jetbrains.annotations.Nullable
    java.lang.String CreatedDate, @org.jetbrains.annotations.Nullable
    java.lang.String Desigination, @org.jetbrains.annotations.Nullable
    java.lang.String HFMIS, @org.jetbrains.annotations.Nullable
    java.lang.Integer Id, @org.jetbrains.annotations.Nullable
    java.lang.Double Latitude, @org.jetbrains.annotations.Nullable
    java.lang.Double Longitude, @org.jetbrains.annotations.Nullable
    java.lang.Integer NoOfBed, @org.jetbrains.annotations.Nullable
    java.lang.Integer NoOfWheelChair, @org.jetbrains.annotations.Nullable
    java.lang.Integer TotalBeds, @org.jetbrains.annotations.Nullable
    java.lang.Integer TotalWheelChair, @org.jetbrains.annotations.Nullable
    java.lang.String Phase, @org.jetbrains.annotations.Nullable
    java.lang.Boolean RecordStatus) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBHUImage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCreated() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCreatedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDesigination() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHFMIS() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getLatitude() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getLongitude() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getNoOfBed() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getNoOfWheelChair() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotalBeds() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotalWheelChair() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPhase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getRecordStatus() {
        return null;
    }
}