package com.hisdu.meas.ui.Indicators;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.leopold.mvvm.data.db.converter.DateConverter.class})
@kotlinx.android.parcel.Parcelize
@androidx.room.Entity
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bj\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00f1\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\u0013\b\u0002\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00190\u0018\u00a2\u0006\u0002\b\u001a\u0012\u0013\b\u0002\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u001c0\u0018\u00a2\u0006\u0002\b\u001a\u0012\u000f\b\u0002\u0010\u001d\u001a\t\u0018\u00010\u001e\u00a2\u0006\u0002\b\u001a\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\u000f\b\u0002\u0010!\u001a\t\u0018\u00010\"\u00a2\u0006\u0002\b\u001a\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\'J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010m\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\u000b\u0010n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010p\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00101J\u0010\u0010q\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00101J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010u\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\u0014\u0010v\u001a\r\u0012\u0004\u0012\u00020\u00190\u0018\u00a2\u0006\u0002\b\u001aH\u00c6\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0014\u0010x\u001a\r\u0012\u0004\u0012\u00020\u001c0\u0018\u00a2\u0006\u0002\b\u001aH\u00c6\u0003J\u0010\u0010y\u001a\t\u0018\u00010\u001e\u00a2\u0006\u0002\b\u001aH\u00c6\u0003J\u0010\u0010z\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00101J\u0010\u0010{\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00101J\u0010\u0010|\u001a\t\u0018\u00010\"\u00a2\u0006\u0002\b\u001aH\u00c6\u0003J\u0010\u0010}\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00101J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00101J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00fc\u0002\u0010\u0088\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0013\b\u0002\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00190\u0018\u00a2\u0006\u0002\b\u001a2\u0013\b\u0002\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u001c0\u0018\u00a2\u0006\u0002\b\u001a2\u000f\b\u0002\u0010\u001d\u001a\t\u0018\u00010\u001e\u00a2\u0006\u0002\b\u001a2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00072\u000f\b\u0002\u0010!\u001a\t\u0018\u00010\"\u00a2\u0006\u0002\b\u001a2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0003\u0010\u0089\u0001J\n\u0010\u008a\u0001\u001a\u00020\u0007H\u00d6\u0001J\u0016\u0010\u008b\u0001\u001a\u00020\u000b2\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u00d6\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0007H\u00d6\u0001J\n\u0010\u008f\u0001\u001a\u00020\u0003H\u00d6\u0001J\u001e\u0010\u0090\u0001\u001a\u00030\u0091\u00012\b\u0010\u0092\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u0094\u0001\u001a\u00020\u0007H\u00d6\u0001R\u001c\u0010&\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00104\u001a\u0004\b0\u00101\"\u0004\b2\u00103R%\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00190\u0018\u00a2\u0006\u0002\b\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010)\"\u0004\b:\u0010+R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010)\"\u0004\b<\u0010+R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010)\"\u0004\b>\u0010+R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010)\"\u0004\b@\u0010+R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010)\"\u0004\bB\u0010+R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010G\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010)\"\u0004\bI\u0010+R\u001c\u0010%\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010)\"\u0004\bK\u0010+R!\u0010\u001d\u001a\t\u0018\u00010\u001e\u00a2\u0006\u0002\b\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010#\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00104\u001a\u0004\bP\u00101\"\u0004\bQ\u00103R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010G\u001a\u0004\bR\u0010D\"\u0004\bS\u0010FR!\u0010!\u001a\t\u0018\u00010\"\u00a2\u0006\u0002\b\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010G\u001a\u0004\b\u0016\u0010D\"\u0004\bX\u0010FR\u001e\u0010 \u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00104\u001a\u0004\b \u00101\"\u0004\bY\u00103R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010)\"\u0004\b[\u0010+R%\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u001c0\u0018\u00a2\u0006\u0002\b\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u00106\"\u0004\b]\u00108R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010)\"\u0004\b_\u0010+R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00104\u001a\u0004\b`\u00101\"\u0004\ba\u00103R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00104\u001a\u0004\bb\u00101\"\u0004\bc\u00103R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00104\u001a\u0004\bd\u00101\"\u0004\be\u00103R\u001c\u0010$\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010)\"\u0004\bg\u0010+R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010)\"\u0004\bi\u0010+R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010)\"\u0004\bk\u0010+\u00a8\u0006\u0095\u0001"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/SubmitFormModel;", "Landroid/os/Parcelable;", "HFMISCode", "", "facilityType", "visityType", "visitId", "", "facility", "facilityName", "facilityStatus", "", "closeReason", "comment", "illegalOccupation", "wholeOrPart", "date", "moduleId", "applicationTypeid", "latitude", "longitude", "CreatedOn", "isFeedbackSubmited", "attendanceList", "", "Lcom/hisdu/meas/ui/Attendance/StaffModel;", "Lkotlinx/android/parcel/RawValue;", "listofModules", "Lcom/hisdu/meas/ui/Indicators/ModuleToSave;", "feedback", "Lcom/hisdu/meas/ui/Feedback/FeedbackSubmitModel;", "userid", "isSync", "incharge", "Lcom/hisdu/meas/ui/Indicators/InspactorModel;", "id", "visitTypeName", "faciltyTypeName", "AmbulanceNo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/hisdu/meas/ui/Feedback/FeedbackSubmitModel;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/hisdu/meas/ui/Indicators/InspactorModel;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmbulanceNo", "()Ljava/lang/String;", "setAmbulanceNo", "(Ljava/lang/String;)V", "getCreatedOn", "setCreatedOn", "getHFMISCode", "setHFMISCode", "getApplicationTypeid", "()Ljava/lang/Integer;", "setApplicationTypeid", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getAttendanceList", "()Ljava/util/List;", "setAttendanceList", "(Ljava/util/List;)V", "getCloseReason", "setCloseReason", "getComment", "setComment", "getDate", "setDate", "getFacility", "setFacility", "getFacilityName", "setFacilityName", "getFacilityStatus", "()Ljava/lang/Boolean;", "setFacilityStatus", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getFacilityType", "setFacilityType", "getFaciltyTypeName", "setFaciltyTypeName", "getFeedback", "()Lcom/hisdu/meas/ui/Feedback/FeedbackSubmitModel;", "setFeedback", "(Lcom/hisdu/meas/ui/Feedback/FeedbackSubmitModel;)V", "getId", "setId", "getIllegalOccupation", "setIllegalOccupation", "getIncharge", "()Lcom/hisdu/meas/ui/Indicators/InspactorModel;", "setIncharge", "(Lcom/hisdu/meas/ui/Indicators/InspactorModel;)V", "setFeedbackSubmited", "setSync", "getLatitude", "setLatitude", "getListofModules", "setListofModules", "getLongitude", "setLongitude", "getModuleId", "setModuleId", "getUserid", "setUserid", "getVisitId", "setVisitId", "getVisitTypeName", "setVisitTypeName", "getVisityType", "setVisityType", "getWholeOrPart", "setWholeOrPart", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/hisdu/meas/ui/Feedback/FeedbackSubmitModel;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/hisdu/meas/ui/Indicators/InspactorModel;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/hisdu/meas/ui/Indicators/SubmitFormModel;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class SubmitFormModel implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    private java.lang.String HFMISCode;
    @org.jetbrains.annotations.Nullable
    private java.lang.String facilityType;
    @org.jetbrains.annotations.Nullable
    private java.lang.String visityType;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer visitId;
    @org.jetbrains.annotations.Nullable
    private java.lang.String facility;
    @org.jetbrains.annotations.Nullable
    private java.lang.String facilityName;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean facilityStatus;
    @org.jetbrains.annotations.Nullable
    private java.lang.String closeReason;
    @org.jetbrains.annotations.Nullable
    private java.lang.String comment;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean illegalOccupation;
    @org.jetbrains.annotations.Nullable
    private java.lang.String wholeOrPart;
    @org.jetbrains.annotations.Nullable
    private java.lang.String date;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer moduleId;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer applicationTypeid;
    @org.jetbrains.annotations.Nullable
    private java.lang.String latitude;
    @org.jetbrains.annotations.Nullable
    private java.lang.String longitude;
    @org.jetbrains.annotations.Nullable
    private java.lang.String CreatedOn;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean isFeedbackSubmited;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.hisdu.meas.ui.Attendance.StaffModel> attendanceList;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.hisdu.meas.ui.Indicators.ModuleToSave> listofModules;
    @org.jetbrains.annotations.Nullable
    private com.hisdu.meas.ui.Feedback.FeedbackSubmitModel feedback;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer userid;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer isSync;
    @org.jetbrains.annotations.Nullable
    private com.hisdu.meas.ui.Indicators.InspactorModel incharge;
    @org.jetbrains.annotations.Nullable
    @androidx.room.PrimaryKey(autoGenerate = true)
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable
    private java.lang.String visitTypeName;
    @org.jetbrains.annotations.Nullable
    private java.lang.String faciltyTypeName;
    @org.jetbrains.annotations.Nullable
    private java.lang.String AmbulanceNo;
    public static final android.os.Parcelable.Creator<com.hisdu.meas.ui.Indicators.SubmitFormModel> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.Indicators.SubmitFormModel copy(@org.jetbrains.annotations.Nullable
    java.lang.String HFMISCode, @org.jetbrains.annotations.Nullable
    java.lang.String facilityType, @org.jetbrains.annotations.Nullable
    java.lang.String visityType, @org.jetbrains.annotations.Nullable
    java.lang.Integer visitId, @org.jetbrains.annotations.Nullable
    java.lang.String facility, @org.jetbrains.annotations.Nullable
    java.lang.String facilityName, @org.jetbrains.annotations.Nullable
    java.lang.Boolean facilityStatus, @org.jetbrains.annotations.Nullable
    java.lang.String closeReason, @org.jetbrains.annotations.Nullable
    java.lang.String comment, @org.jetbrains.annotations.Nullable
    java.lang.Boolean illegalOccupation, @org.jetbrains.annotations.Nullable
    java.lang.String wholeOrPart, @org.jetbrains.annotations.Nullable
    java.lang.String date, @org.jetbrains.annotations.Nullable
    java.lang.Integer moduleId, @org.jetbrains.annotations.Nullable
    java.lang.Integer applicationTypeid, @org.jetbrains.annotations.Nullable
    java.lang.String latitude, @org.jetbrains.annotations.Nullable
    java.lang.String longitude, @org.jetbrains.annotations.Nullable
    java.lang.String CreatedOn, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isFeedbackSubmited, @org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.ui.Attendance.StaffModel> attendanceList, @org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.ui.Indicators.ModuleToSave> listofModules, @org.jetbrains.annotations.Nullable
    com.hisdu.meas.ui.Feedback.FeedbackSubmitModel feedback, @org.jetbrains.annotations.Nullable
    java.lang.Integer userid, @org.jetbrains.annotations.Nullable
    java.lang.Integer isSync, @org.jetbrains.annotations.Nullable
    com.hisdu.meas.ui.Indicators.InspactorModel incharge, @org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.String visitTypeName, @org.jetbrains.annotations.Nullable
    java.lang.String faciltyTypeName, @org.jetbrains.annotations.Nullable
    java.lang.String AmbulanceNo) {
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
    
    public SubmitFormModel() {
        super();
    }
    
    public SubmitFormModel(@org.jetbrains.annotations.Nullable
    java.lang.String HFMISCode, @org.jetbrains.annotations.Nullable
    java.lang.String facilityType, @org.jetbrains.annotations.Nullable
    java.lang.String visityType, @org.jetbrains.annotations.Nullable
    java.lang.Integer visitId, @org.jetbrains.annotations.Nullable
    java.lang.String facility, @org.jetbrains.annotations.Nullable
    java.lang.String facilityName, @org.jetbrains.annotations.Nullable
    java.lang.Boolean facilityStatus, @org.jetbrains.annotations.Nullable
    java.lang.String closeReason, @org.jetbrains.annotations.Nullable
    java.lang.String comment, @org.jetbrains.annotations.Nullable
    java.lang.Boolean illegalOccupation, @org.jetbrains.annotations.Nullable
    java.lang.String wholeOrPart, @org.jetbrains.annotations.Nullable
    java.lang.String date, @org.jetbrains.annotations.Nullable
    java.lang.Integer moduleId, @org.jetbrains.annotations.Nullable
    java.lang.Integer applicationTypeid, @org.jetbrains.annotations.Nullable
    java.lang.String latitude, @org.jetbrains.annotations.Nullable
    java.lang.String longitude, @org.jetbrains.annotations.Nullable
    java.lang.String CreatedOn, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isFeedbackSubmited, @org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.ui.Attendance.StaffModel> attendanceList, @org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.ui.Indicators.ModuleToSave> listofModules, @org.jetbrains.annotations.Nullable
    com.hisdu.meas.ui.Feedback.FeedbackSubmitModel feedback, @org.jetbrains.annotations.Nullable
    java.lang.Integer userid, @org.jetbrains.annotations.Nullable
    java.lang.Integer isSync, @org.jetbrains.annotations.Nullable
    com.hisdu.meas.ui.Indicators.InspactorModel incharge, @org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.String visitTypeName, @org.jetbrains.annotations.Nullable
    java.lang.String faciltyTypeName, @org.jetbrains.annotations.Nullable
    java.lang.String AmbulanceNo) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
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
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFacilityType() {
        return null;
    }
    
    public final void setFacilityType(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVisityType() {
        return null;
    }
    
    public final void setVisityType(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getVisitId() {
        return null;
    }
    
    public final void setVisitId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFacility() {
        return null;
    }
    
    public final void setFacility(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFacilityName() {
        return null;
    }
    
    public final void setFacilityName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getFacilityStatus() {
        return null;
    }
    
    public final void setFacilityStatus(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCloseReason() {
        return null;
    }
    
    public final void setCloseReason(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getComment() {
        return null;
    }
    
    public final void setComment(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getIllegalOccupation() {
        return null;
    }
    
    public final void setIllegalOccupation(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getWholeOrPart() {
        return null;
    }
    
    public final void setWholeOrPart(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component13() {
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
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getApplicationTypeid() {
        return null;
    }
    
    public final void setApplicationTypeid(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component15() {
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
    public final java.lang.String component16() {
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
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCreatedOn() {
        return null;
    }
    
    public final void setCreatedOn(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean isFeedbackSubmited() {
        return null;
    }
    
    public final void setFeedbackSubmited(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Attendance.StaffModel> component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Attendance.StaffModel> getAttendanceList() {
        return null;
    }
    
    public final void setAttendanceList(@org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.ui.Attendance.StaffModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Indicators.ModuleToSave> component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Indicators.ModuleToSave> getListofModules() {
        return null;
    }
    
    public final void setListofModules(@org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.ui.Indicators.ModuleToSave> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.hisdu.meas.ui.Feedback.FeedbackSubmitModel component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.hisdu.meas.ui.Feedback.FeedbackSubmitModel getFeedback() {
        return null;
    }
    
    public final void setFeedback(@org.jetbrains.annotations.Nullable
    com.hisdu.meas.ui.Feedback.FeedbackSubmitModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getUserid() {
        return null;
    }
    
    public final void setUserid(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer isSync() {
        return null;
    }
    
    public final void setSync(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.hisdu.meas.ui.Indicators.InspactorModel component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.hisdu.meas.ui.Indicators.InspactorModel getIncharge() {
        return null;
    }
    
    public final void setIncharge(@org.jetbrains.annotations.Nullable
    com.hisdu.meas.ui.Indicators.InspactorModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component25() {
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
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVisitTypeName() {
        return null;
    }
    
    public final void setVisitTypeName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component27() {
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
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAmbulanceNo() {
        return null;
    }
    
    public final void setAmbulanceNo(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.hisdu.meas.ui.Indicators.SubmitFormModel> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.hisdu.meas.ui.Indicators.SubmitFormModel createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.hisdu.meas.ui.Indicators.SubmitFormModel[] newArray(int size) {
            return null;
        }
    }
}