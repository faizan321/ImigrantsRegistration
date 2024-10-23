package com.hisdu.meas.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b?\b\u0086\b\u0018\u00002\u00020\u0001B\u00c1\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u00a2\u0006\u0002\u0010\u0017J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010)J\u0010\u0010B\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010)J\u000b\u0010C\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u000b\u0010E\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010)J\u0010\u0010L\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010)J\u000b\u0010M\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u00ca\u0001\u0010O\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010PJ\u0013\u0010Q\u001a\u00020\u00132\b\u0010R\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010S\u001a\u00020\u000bH\u00d6\u0001J\t\u0010T\u001a\u00020\u0006H\u00d6\u0001R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b\'\u0010\u001bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010,\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010\u001bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010,\u001a\u0004\b3\u0010)\"\u0004\b4\u0010+R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010,\u001a\u0004\b5\u0010)\"\u0004\b6\u0010+R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0019\"\u0004\b8\u0010\u001bR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010=\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001d\"\u0004\b?\u0010\u001f\u00a8\u0006U"}, d2 = {"Lcom/hisdu/meas/data/model/BHUSurveyModel;", "", "BedDetailsViewModel", "", "Lcom/hisdu/meas/data/model/BedDetailsViewModel;", "Created", "", "CreatedDate", "Desigination", "HFMISCode", "Id", "", "InspectionId", "Latitude", "Longitude", "NoOfBed", "NoOfWheelChair", "Phase", "RecordStatus", "", "BHUImage", "WheelChairDetailsViewModel", "Lcom/hisdu/meas/data/model/WheelChairDetailsViewModel;", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;)V", "getBHUImage", "()Ljava/lang/String;", "setBHUImage", "(Ljava/lang/String;)V", "getBedDetailsViewModel", "()Ljava/util/List;", "setBedDetailsViewModel", "(Ljava/util/List;)V", "getCreated", "setCreated", "getCreatedDate", "setCreatedDate", "getDesigination", "setDesigination", "getHFMISCode", "setHFMISCode", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getInspectionId", "setInspectionId", "getLatitude", "setLatitude", "getLongitude", "setLongitude", "getNoOfBed", "setNoOfBed", "getNoOfWheelChair", "setNoOfWheelChair", "getPhase", "setPhase", "getRecordStatus", "()Ljava/lang/Boolean;", "setRecordStatus", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getWheelChairDetailsViewModel", "setWheelChairDetailsViewModel", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;)Lcom/hisdu/meas/data/model/BHUSurveyModel;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class BHUSurveyModel {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.hisdu.meas.data.model.BedDetailsViewModel> BedDetailsViewModel;
    @org.jetbrains.annotations.Nullable
    private java.lang.String Created;
    @org.jetbrains.annotations.Nullable
    private java.lang.String CreatedDate;
    @org.jetbrains.annotations.Nullable
    private java.lang.String Desigination;
    @org.jetbrains.annotations.Nullable
    private java.lang.String HFMISCode;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer Id;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer InspectionId;
    @org.jetbrains.annotations.Nullable
    private java.lang.String Latitude;
    @org.jetbrains.annotations.Nullable
    private java.lang.String Longitude;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer NoOfBed;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer NoOfWheelChair;
    @org.jetbrains.annotations.Nullable
    private java.lang.String Phase;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean RecordStatus;
    @org.jetbrains.annotations.Nullable
    private java.lang.String BHUImage;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.hisdu.meas.data.model.WheelChairDetailsViewModel> WheelChairDetailsViewModel;
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.data.model.BHUSurveyModel copy(@org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.data.model.BedDetailsViewModel> BedDetailsViewModel, @org.jetbrains.annotations.Nullable
    java.lang.String Created, @org.jetbrains.annotations.Nullable
    java.lang.String CreatedDate, @org.jetbrains.annotations.Nullable
    java.lang.String Desigination, @org.jetbrains.annotations.Nullable
    java.lang.String HFMISCode, @org.jetbrains.annotations.Nullable
    java.lang.Integer Id, @org.jetbrains.annotations.Nullable
    java.lang.Integer InspectionId, @org.jetbrains.annotations.Nullable
    java.lang.String Latitude, @org.jetbrains.annotations.Nullable
    java.lang.String Longitude, @org.jetbrains.annotations.Nullable
    java.lang.Integer NoOfBed, @org.jetbrains.annotations.Nullable
    java.lang.Integer NoOfWheelChair, @org.jetbrains.annotations.Nullable
    java.lang.String Phase, @org.jetbrains.annotations.Nullable
    java.lang.Boolean RecordStatus, @org.jetbrains.annotations.Nullable
    java.lang.String BHUImage, @org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.data.model.WheelChairDetailsViewModel> WheelChairDetailsViewModel) {
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
    
    public BHUSurveyModel() {
        super();
    }
    
    public BHUSurveyModel(@org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.data.model.BedDetailsViewModel> BedDetailsViewModel, @org.jetbrains.annotations.Nullable
    java.lang.String Created, @org.jetbrains.annotations.Nullable
    java.lang.String CreatedDate, @org.jetbrains.annotations.Nullable
    java.lang.String Desigination, @org.jetbrains.annotations.Nullable
    java.lang.String HFMISCode, @org.jetbrains.annotations.Nullable
    java.lang.Integer Id, @org.jetbrains.annotations.Nullable
    java.lang.Integer InspectionId, @org.jetbrains.annotations.Nullable
    java.lang.String Latitude, @org.jetbrains.annotations.Nullable
    java.lang.String Longitude, @org.jetbrains.annotations.Nullable
    java.lang.Integer NoOfBed, @org.jetbrains.annotations.Nullable
    java.lang.Integer NoOfWheelChair, @org.jetbrains.annotations.Nullable
    java.lang.String Phase, @org.jetbrains.annotations.Nullable
    java.lang.Boolean RecordStatus, @org.jetbrains.annotations.Nullable
    java.lang.String BHUImage, @org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.data.model.WheelChairDetailsViewModel> WheelChairDetailsViewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.data.model.BedDetailsViewModel> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.data.model.BedDetailsViewModel> getBedDetailsViewModel() {
        return null;
    }
    
    public final void setBedDetailsViewModel(@org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.data.model.BedDetailsViewModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCreated() {
        return null;
    }
    
    public final void setCreated(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
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
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDesigination() {
        return null;
    }
    
    public final void setDesigination(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
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
    public final java.lang.Integer component6() {
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
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getInspectionId() {
        return null;
    }
    
    public final void setInspectionId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLatitude() {
        return null;
    }
    
    public final void setLatitude(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLongitude() {
        return null;
    }
    
    public final void setLongitude(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getNoOfBed() {
        return null;
    }
    
    public final void setNoOfBed(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getNoOfWheelChair() {
        return null;
    }
    
    public final void setNoOfWheelChair(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPhase() {
        return null;
    }
    
    public final void setPhase(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getRecordStatus() {
        return null;
    }
    
    public final void setRecordStatus(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBHUImage() {
        return null;
    }
    
    public final void setBHUImage(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.data.model.WheelChairDetailsViewModel> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.data.model.WheelChairDetailsViewModel> getWheelChairDetailsViewModel() {
        return null;
    }
    
    public final void setWheelChairDetailsViewModel(@org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.data.model.WheelChairDetailsViewModel> p0) {
    }
}