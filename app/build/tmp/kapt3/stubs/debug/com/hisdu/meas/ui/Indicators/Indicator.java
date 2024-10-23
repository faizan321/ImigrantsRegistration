package com.hisdu.meas.ui.Indicators;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.leopold.mvvm.data.db.converter.DateConverter.class})
@kotlinx.android.parcel.Parcelize
@androidx.room.Entity
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\bg\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00df\u0002\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0003\u0010\f\u001a\u00020\u0006\u0012\u0012\b\u0003\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e\u0012\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0003\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000e\u0012\u0012\b\u0003\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000e\u0012\u0012\b\u0003\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0002\u0010!J\u0010\u0010c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u0013\u0010d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eH\u00c6\u0003J\u0011\u0010e\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000eH\u00c6\u0003J\u0010\u0010f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u0013\u0010g\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000eH\u00c6\u0003J\u0013\u0010h\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000eH\u00c6\u0003J\u0013\u0010i\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010l\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u0010\u0010m\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u0010\u0010n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u0010\u0010o\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u00104J\u0010\u0010p\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u00104J\u0010\u0010q\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u00104J\u0010\u0010r\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u00104J\u0010\u0010s\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u00104J\u0010\u0010t\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u00104J\u0010\u0010u\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u00104J\u000b\u0010v\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010w\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u0010\u0010x\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u0010\u0010y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u000b\u0010z\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010{\u001a\u00020\u0006H\u00c6\u0003J\t\u0010|\u001a\u00020\u0006H\u00c6\u0003J\u00e8\u0002\u0010}\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u000b\u001a\u00020\u00062\b\b\u0003\u0010\f\u001a\u00020\u00062\u0012\b\u0003\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e2\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000e2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0012\b\u0003\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000e2\u0012\b\u0003\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000e2\u0012\b\u0003\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000e2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u001aH\u00c6\u0001\u00a2\u0006\u0002\u0010~J\t\u0010\u007f\u001a\u00020\u0003H\u00d6\u0001J\u0016\u0010\u0080\u0001\u001a\u00020\u001a2\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001H\u00d6\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u0084\u0001\u001a\u00020\u0006H\u00d6\u0001J\u001e\u0010\u0085\u0001\u001a\u00030\u0086\u00012\b\u0010\u0087\u0001\u001a\u00030\u0088\u00012\u0007\u0010\u0089\u0001\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R$\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\b:\u00104\"\u0004\b;\u00106R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\b<\u00104\"\u0004\b=\u00106R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\b>\u00104\"\u0004\b?\u00106R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\b@\u00104\"\u0004\bA\u00106R\u001e\u0010 \u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\bB\u00104\"\u0004\bC\u00106R\"\u0010D\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\bE\u00104\"\u0004\bF\u00106R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\bG\u0010#\"\u0004\bH\u0010%R$\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010,\"\u0004\bJ\u0010.R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\bK\u0010#\"\u0004\bL\u0010%R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\bM\u0010#\"\u0004\bN\u0010%R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\bO\u0010#\"\u0004\bP\u0010%R$\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010,\"\u0004\bR\u0010.R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010(\"\u0004\bT\u0010*R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010(\"\u0004\bV\u0010*R\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010(\"\u0004\bX\u0010*R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010(\"\u0004\bZ\u0010*R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b[\u0010#\"\u0004\b\\\u0010%R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b]\u0010#\"\u0004\b^\u0010%R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b_\u0010#\"\u0004\b`\u0010%R&\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010,\"\u0004\bb\u0010.\u00a8\u0006\u008a\u0001"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/Indicator;", "Landroid/os/Parcelable;", "indicatorId", "", "ParentIndicatorId", "question", "", "showInCase", "showRemarksInCase", "sequenceNo", "optionsType", "selectedValue", "remarkValue", "options", "", "Lcom/hisdu/meas/ui/Indicators/Option;", "subIndicators", "CategoryId", "Shifts", "HFTypes", "HFs", "InputType", "DefaultValue", "minvalue", "maxvalue", "IsOptionTotal", "", "IsOptionCalculation", "IsOptionEditable", "IsOptionTagged", "IsPhysicalView", "IsCalculation", "IsRequired", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getCategoryId", "()Ljava/lang/Integer;", "setCategoryId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDefaultValue", "()Ljava/lang/String;", "setDefaultValue", "(Ljava/lang/String;)V", "getHFTypes", "()Ljava/util/List;", "setHFTypes", "(Ljava/util/List;)V", "getHFs", "setHFs", "getInputType", "setInputType", "getIsCalculation", "()Ljava/lang/Boolean;", "setIsCalculation", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getIsOptionCalculation", "setIsOptionCalculation", "getIsOptionEditable", "setIsOptionEditable", "getIsOptionTagged", "setIsOptionTagged", "getIsOptionTotal", "setIsOptionTotal", "getIsPhysicalView", "setIsPhysicalView", "getIsRequired", "setIsRequired", "IsSubmitted", "getIsSubmitted", "setIsSubmitted", "getParentIndicatorId", "setParentIndicatorId", "getShifts", "setShifts", "getIndicatorId", "setIndicatorId", "getMaxvalue", "setMaxvalue", "getMinvalue", "setMinvalue", "getOptions", "setOptions", "getOptionsType", "setOptionsType", "getQuestion", "setQuestion", "getRemarkValue", "setRemarkValue", "getSelectedValue", "setSelectedValue", "getSequenceNo", "setSequenceNo", "getShowInCase", "setShowInCase", "getShowRemarksInCase", "setShowRemarksInCase", "getSubIndicators", "setSubIndicators", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/hisdu/meas/ui/Indicators/Indicator;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Indicator implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    @androidx.room.PrimaryKey
    private java.lang.Integer indicatorId;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer ParentIndicatorId;
    @org.jetbrains.annotations.Nullable
    private java.lang.String question;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer showInCase;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer showRemarksInCase;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer sequenceNo;
    @org.jetbrains.annotations.Nullable
    private java.lang.String optionsType;
    @org.jetbrains.annotations.NotNull
    private java.lang.String selectedValue;
    @org.jetbrains.annotations.NotNull
    private java.lang.String remarkValue;
    @org.jetbrains.annotations.Nullable
    private java.util.List<com.hisdu.meas.ui.Indicators.Option> options;
    @org.jetbrains.annotations.Nullable
    @androidx.room.Ignore
    private java.util.List<com.hisdu.meas.ui.Indicators.Indicator> subIndicators;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer CategoryId;
    @org.jetbrains.annotations.Nullable
    private java.util.List<java.lang.Integer> Shifts;
    @org.jetbrains.annotations.Nullable
    private java.util.List<java.lang.Integer> HFTypes;
    @org.jetbrains.annotations.Nullable
    private java.util.List<java.lang.Integer> HFs;
    @org.jetbrains.annotations.Nullable
    private java.lang.String InputType;
    @org.jetbrains.annotations.Nullable
    private java.lang.String DefaultValue;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer minvalue;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer maxvalue;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean IsOptionTotal;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean IsOptionCalculation;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean IsOptionEditable;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean IsOptionTagged;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean IsPhysicalView;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean IsCalculation;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean IsRequired;
    @org.jetbrains.annotations.Nullable
    @androidx.room.Ignore
    private java.lang.Boolean IsSubmitted;
    public static final android.os.Parcelable.Creator<com.hisdu.meas.ui.Indicators.Indicator> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.Indicators.Indicator copy(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IndicatorId")
    java.lang.Integer indicatorId, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "ParentIndicatorId")
    java.lang.Integer ParentIndicatorId, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Question")
    java.lang.String question, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "showInCase")
    java.lang.Integer showInCase, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "showRemarksInCase")
    java.lang.Integer showRemarksInCase, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "SequenceNo")
    java.lang.Integer sequenceNo, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "OptionsType")
    java.lang.String optionsType, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "SelectedValue")
    java.lang.String selectedValue, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "RemarkValue")
    java.lang.String remarkValue, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Options")
    java.util.List<com.hisdu.meas.ui.Indicators.Option> options, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "SubIndicators")
    java.util.List<com.hisdu.meas.ui.Indicators.Indicator> subIndicators, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "CategoryId")
    java.lang.Integer CategoryId, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Shifts")
    java.util.List<java.lang.Integer> Shifts, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "HFTypes")
    java.util.List<java.lang.Integer> HFTypes, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "HFs")
    java.util.List<java.lang.Integer> HFs, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "InputType")
    java.lang.String InputType, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "DefaultValue")
    java.lang.String DefaultValue, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "minvalue")
    java.lang.Integer minvalue, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "maxvalue")
    java.lang.Integer maxvalue, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsOptionTotal")
    java.lang.Boolean IsOptionTotal, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsOptionCalculation")
    java.lang.Boolean IsOptionCalculation, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsOptionEditable")
    java.lang.Boolean IsOptionEditable, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsOptionTagged")
    java.lang.Boolean IsOptionTagged, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsPhysicalView")
    java.lang.Boolean IsPhysicalView, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsCalculation")
    java.lang.Boolean IsCalculation, @org.jetbrains.annotations.Nullable
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
    
    public Indicator() {
        super();
    }
    
    public Indicator(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IndicatorId")
    java.lang.Integer indicatorId, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "ParentIndicatorId")
    java.lang.Integer ParentIndicatorId, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Question")
    java.lang.String question, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "showInCase")
    java.lang.Integer showInCase, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "showRemarksInCase")
    java.lang.Integer showRemarksInCase, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "SequenceNo")
    java.lang.Integer sequenceNo, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "OptionsType")
    java.lang.String optionsType, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "SelectedValue")
    java.lang.String selectedValue, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "RemarkValue")
    java.lang.String remarkValue, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Options")
    java.util.List<com.hisdu.meas.ui.Indicators.Option> options, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "SubIndicators")
    java.util.List<com.hisdu.meas.ui.Indicators.Indicator> subIndicators, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "CategoryId")
    java.lang.Integer CategoryId, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Shifts")
    java.util.List<java.lang.Integer> Shifts, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "HFTypes")
    java.util.List<java.lang.Integer> HFTypes, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "HFs")
    java.util.List<java.lang.Integer> HFs, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "InputType")
    java.lang.String InputType, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "DefaultValue")
    java.lang.String DefaultValue, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "minvalue")
    java.lang.Integer minvalue, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "maxvalue")
    java.lang.Integer maxvalue, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsOptionTotal")
    java.lang.Boolean IsOptionTotal, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsOptionCalculation")
    java.lang.Boolean IsOptionCalculation, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsOptionEditable")
    java.lang.Boolean IsOptionEditable, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsOptionTagged")
    java.lang.Boolean IsOptionTagged, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsPhysicalView")
    java.lang.Boolean IsPhysicalView, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsCalculation")
    java.lang.Boolean IsCalculation, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "IsRequired")
    java.lang.Boolean IsRequired) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getIndicatorId() {
        return null;
    }
    
    public final void setIndicatorId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getParentIndicatorId() {
        return null;
    }
    
    public final void setParentIndicatorId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getQuestion() {
        return null;
    }
    
    public final void setQuestion(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getShowInCase() {
        return null;
    }
    
    public final void setShowInCase(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getShowRemarksInCase() {
        return null;
    }
    
    public final void setShowRemarksInCase(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
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
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOptionsType() {
        return null;
    }
    
    public final void setOptionsType(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSelectedValue() {
        return null;
    }
    
    public final void setSelectedValue(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRemarkValue() {
        return null;
    }
    
    public final void setRemarkValue(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.hisdu.meas.ui.Indicators.Option> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.hisdu.meas.ui.Indicators.Option> getOptions() {
        return null;
    }
    
    public final void setOptions(@org.jetbrains.annotations.Nullable
    java.util.List<com.hisdu.meas.ui.Indicators.Option> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.hisdu.meas.ui.Indicators.Indicator> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.hisdu.meas.ui.Indicators.Indicator> getSubIndicators() {
        return null;
    }
    
    public final void setSubIndicators(@org.jetbrains.annotations.Nullable
    java.util.List<com.hisdu.meas.ui.Indicators.Indicator> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component12() {
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
    public final java.util.List<java.lang.Integer> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.Integer> getShifts() {
        return null;
    }
    
    public final void setShifts(@org.jetbrains.annotations.Nullable
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.Integer> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.Integer> getHFTypes() {
        return null;
    }
    
    public final void setHFTypes(@org.jetbrains.annotations.Nullable
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.Integer> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.Integer> getHFs() {
        return null;
    }
    
    public final void setHFs(@org.jetbrains.annotations.Nullable
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getInputType() {
        return null;
    }
    
    public final void setInputType(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDefaultValue() {
        return null;
    }
    
    public final void setDefaultValue(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getMinvalue() {
        return null;
    }
    
    public final void setMinvalue(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getMaxvalue() {
        return null;
    }
    
    public final void setMaxvalue(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getIsOptionTotal() {
        return null;
    }
    
    public final void setIsOptionTotal(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getIsOptionCalculation() {
        return null;
    }
    
    public final void setIsOptionCalculation(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getIsOptionEditable() {
        return null;
    }
    
    public final void setIsOptionEditable(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getIsOptionTagged() {
        return null;
    }
    
    public final void setIsOptionTagged(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getIsPhysicalView() {
        return null;
    }
    
    public final void setIsPhysicalView(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getIsCalculation() {
        return null;
    }
    
    public final void setIsCalculation(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getIsRequired() {
        return null;
    }
    
    public final void setIsRequired(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getIsSubmitted() {
        return null;
    }
    
    public final void setIsSubmitted(@org.jetbrains.annotations.Nullable
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
    public static final class Creator implements android.os.Parcelable.Creator<com.hisdu.meas.ui.Indicators.Indicator> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.hisdu.meas.ui.Indicators.Indicator createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.hisdu.meas.ui.Indicators.Indicator[] newArray(int size) {
            return null;
        }
    }
}