package com.hisdu.meas.data.model;

import java.lang.System;

@kotlinx.android.parcel.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\bS\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0002\u0010\u001cJ\u000b\u0010S\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003\u00a2\u0006\u0002\u0010OJ\u000b\u0010c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00a2\u0002\u0010j\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00c6\u0001\u00a2\u0006\u0002\u0010kJ\t\u0010l\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010m\u001a\u00020\u001b2\b\u0010n\u001a\u0004\u0018\u00010oH\u00d6\u0003J\t\u0010p\u001a\u00020\u0011H\u00d6\u0001J\t\u0010q\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020\u0011H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001e\"\u0004\b(\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u0010 R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010=\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010=\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001e\"\u0004\bA\u0010 R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001e\"\u0004\bC\u0010 R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001e\"\u0004\bE\u0010 R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u001e\"\u0004\bG\u0010 R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u001e\"\u0004\bI\u0010 R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u001e\"\u0004\bK\u0010 R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u001e\"\u0004\bM\u0010 R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010R\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q\u00a8\u0006w"}, d2 = {"Lcom/hisdu/meas/data/model/BedDetailsViewModel;", "Landroid/os/Parcelable;", "BedImageDown", "", "BedImageLeft", "BedImageRight", "BedImageUp", "BedPlacement", "BedRemarks", "BedStatus", "BedType", "CreatedBy", "CreatedDate", "FootStepRemarks", "FootStepStatus", "FootstepImage", "Id", "", "InspectionId", "IsFootStepAvailable", "MattressAvailable", "MattressCover", "MattressImageBack", "MattressImageFront", "MattressRemarks", "MattressStatus", "RecordStatus", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getBedImageDown", "()Ljava/lang/String;", "setBedImageDown", "(Ljava/lang/String;)V", "getBedImageLeft", "setBedImageLeft", "getBedImageRight", "setBedImageRight", "getBedImageUp", "setBedImageUp", "getBedPlacement", "setBedPlacement", "getBedRemarks", "setBedRemarks", "getBedStatus", "setBedStatus", "getBedType", "setBedType", "getCreatedBy", "setCreatedBy", "getCreatedDate", "setCreatedDate", "getFootStepRemarks", "setFootStepRemarks", "getFootStepStatus", "setFootStepStatus", "getFootstepImage", "setFootstepImage", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getInspectionId", "setInspectionId", "getIsFootStepAvailable", "setIsFootStepAvailable", "getMattressAvailable", "setMattressAvailable", "getMattressCover", "setMattressCover", "getMattressImageBack", "setMattressImageBack", "getMattressImageFront", "setMattressImageFront", "getMattressRemarks", "setMattressRemarks", "getMattressStatus", "setMattressStatus", "getRecordStatus", "()Ljava/lang/Boolean;", "setRecordStatus", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/hisdu/meas/data/model/BedDetailsViewModel;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class BedDetailsViewModel implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    private java.lang.String BedImageDown;
    @org.jetbrains.annotations.Nullable
    private java.lang.String BedImageLeft;
    @org.jetbrains.annotations.Nullable
    private java.lang.String BedImageRight;
    @org.jetbrains.annotations.Nullable
    private java.lang.String BedImageUp;
    @org.jetbrains.annotations.Nullable
    private java.lang.String BedPlacement;
    @org.jetbrains.annotations.Nullable
    private java.lang.String BedRemarks;
    @org.jetbrains.annotations.Nullable
    private java.lang.String BedStatus;
    @org.jetbrains.annotations.Nullable
    private java.lang.String BedType;
    @org.jetbrains.annotations.Nullable
    private java.lang.String CreatedBy;
    @org.jetbrains.annotations.Nullable
    private java.lang.String CreatedDate;
    @org.jetbrains.annotations.Nullable
    private java.lang.String FootStepRemarks;
    @org.jetbrains.annotations.Nullable
    private java.lang.String FootStepStatus;
    @org.jetbrains.annotations.Nullable
    private java.lang.String FootstepImage;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer Id;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer InspectionId;
    @org.jetbrains.annotations.Nullable
    private java.lang.String IsFootStepAvailable;
    @org.jetbrains.annotations.Nullable
    private java.lang.String MattressAvailable;
    @org.jetbrains.annotations.Nullable
    private java.lang.String MattressCover;
    @org.jetbrains.annotations.Nullable
    private java.lang.String MattressImageBack;
    @org.jetbrains.annotations.Nullable
    private java.lang.String MattressImageFront;
    @org.jetbrains.annotations.Nullable
    private java.lang.String MattressRemarks;
    @org.jetbrains.annotations.Nullable
    private java.lang.String MattressStatus;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean RecordStatus;
    public static final android.os.Parcelable.Creator<com.hisdu.meas.data.model.BedDetailsViewModel> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.data.model.BedDetailsViewModel copy(@org.jetbrains.annotations.Nullable
    java.lang.String BedImageDown, @org.jetbrains.annotations.Nullable
    java.lang.String BedImageLeft, @org.jetbrains.annotations.Nullable
    java.lang.String BedImageRight, @org.jetbrains.annotations.Nullable
    java.lang.String BedImageUp, @org.jetbrains.annotations.Nullable
    java.lang.String BedPlacement, @org.jetbrains.annotations.Nullable
    java.lang.String BedRemarks, @org.jetbrains.annotations.Nullable
    java.lang.String BedStatus, @org.jetbrains.annotations.Nullable
    java.lang.String BedType, @org.jetbrains.annotations.Nullable
    java.lang.String CreatedBy, @org.jetbrains.annotations.Nullable
    java.lang.String CreatedDate, @org.jetbrains.annotations.Nullable
    java.lang.String FootStepRemarks, @org.jetbrains.annotations.Nullable
    java.lang.String FootStepStatus, @org.jetbrains.annotations.Nullable
    java.lang.String FootstepImage, @org.jetbrains.annotations.Nullable
    java.lang.Integer Id, @org.jetbrains.annotations.Nullable
    java.lang.Integer InspectionId, @org.jetbrains.annotations.Nullable
    java.lang.String IsFootStepAvailable, @org.jetbrains.annotations.Nullable
    java.lang.String MattressAvailable, @org.jetbrains.annotations.Nullable
    java.lang.String MattressCover, @org.jetbrains.annotations.Nullable
    java.lang.String MattressImageBack, @org.jetbrains.annotations.Nullable
    java.lang.String MattressImageFront, @org.jetbrains.annotations.Nullable
    java.lang.String MattressRemarks, @org.jetbrains.annotations.Nullable
    java.lang.String MattressStatus, @org.jetbrains.annotations.Nullable
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
    
    public BedDetailsViewModel() {
        super();
    }
    
    public BedDetailsViewModel(@org.jetbrains.annotations.Nullable
    java.lang.String BedImageDown, @org.jetbrains.annotations.Nullable
    java.lang.String BedImageLeft, @org.jetbrains.annotations.Nullable
    java.lang.String BedImageRight, @org.jetbrains.annotations.Nullable
    java.lang.String BedImageUp, @org.jetbrains.annotations.Nullable
    java.lang.String BedPlacement, @org.jetbrains.annotations.Nullable
    java.lang.String BedRemarks, @org.jetbrains.annotations.Nullable
    java.lang.String BedStatus, @org.jetbrains.annotations.Nullable
    java.lang.String BedType, @org.jetbrains.annotations.Nullable
    java.lang.String CreatedBy, @org.jetbrains.annotations.Nullable
    java.lang.String CreatedDate, @org.jetbrains.annotations.Nullable
    java.lang.String FootStepRemarks, @org.jetbrains.annotations.Nullable
    java.lang.String FootStepStatus, @org.jetbrains.annotations.Nullable
    java.lang.String FootstepImage, @org.jetbrains.annotations.Nullable
    java.lang.Integer Id, @org.jetbrains.annotations.Nullable
    java.lang.Integer InspectionId, @org.jetbrains.annotations.Nullable
    java.lang.String IsFootStepAvailable, @org.jetbrains.annotations.Nullable
    java.lang.String MattressAvailable, @org.jetbrains.annotations.Nullable
    java.lang.String MattressCover, @org.jetbrains.annotations.Nullable
    java.lang.String MattressImageBack, @org.jetbrains.annotations.Nullable
    java.lang.String MattressImageFront, @org.jetbrains.annotations.Nullable
    java.lang.String MattressRemarks, @org.jetbrains.annotations.Nullable
    java.lang.String MattressStatus, @org.jetbrains.annotations.Nullable
    java.lang.Boolean RecordStatus) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBedImageDown() {
        return null;
    }
    
    public final void setBedImageDown(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBedImageLeft() {
        return null;
    }
    
    public final void setBedImageLeft(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBedImageRight() {
        return null;
    }
    
    public final void setBedImageRight(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBedImageUp() {
        return null;
    }
    
    public final void setBedImageUp(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBedPlacement() {
        return null;
    }
    
    public final void setBedPlacement(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBedRemarks() {
        return null;
    }
    
    public final void setBedRemarks(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBedStatus() {
        return null;
    }
    
    public final void setBedStatus(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBedType() {
        return null;
    }
    
    public final void setBedType(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
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
    public final java.lang.String component10() {
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
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFootStepRemarks() {
        return null;
    }
    
    public final void setFootStepRemarks(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFootStepStatus() {
        return null;
    }
    
    public final void setFootStepStatus(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFootstepImage() {
        return null;
    }
    
    public final void setFootstepImage(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component14() {
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
    public final java.lang.Integer component15() {
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
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getIsFootStepAvailable() {
        return null;
    }
    
    public final void setIsFootStepAvailable(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMattressAvailable() {
        return null;
    }
    
    public final void setMattressAvailable(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMattressCover() {
        return null;
    }
    
    public final void setMattressCover(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMattressImageBack() {
        return null;
    }
    
    public final void setMattressImageBack(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMattressImageFront() {
        return null;
    }
    
    public final void setMattressImageFront(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMattressRemarks() {
        return null;
    }
    
    public final void setMattressRemarks(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMattressStatus() {
        return null;
    }
    
    public final void setMattressStatus(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getRecordStatus() {
        return null;
    }
    
    public final void setRecordStatus(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.hisdu.meas.data.model.BedDetailsViewModel> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.hisdu.meas.data.model.BedDetailsViewModel createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.hisdu.meas.data.model.BedDetailsViewModel[] newArray(int size) {
            return null;
        }
    }
}