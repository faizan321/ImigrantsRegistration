package com.leopold.mvvm.data.db.converter;

import java.lang.System;

/**
 * @author Leopold
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H\u0007J\u001c\u0010\b\u001a\u0004\u0018\u00010\u00042\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\nH\u0007J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0006H\u0007J\u001c\u0010\r\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0006H\u0007J\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u0006H\u0007J\u0016\u0010\u0011\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006H\u0007J\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0006H\u0007J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0006H\u0007J\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0006H\u0007J\u001c\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007J\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u0006H\u0007J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u001eH\u0007J\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u0006H\u0007J\u0014\u0010!\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\"H\u0007J\u0014\u0010#\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0013H\u0007J\u001c\u0010$\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010\u0006H\u0007J\u001a\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\'\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010(\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020*H\u0007J\u001a\u0010+\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00062\b\u0010\'\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00062\b\u0010\'\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020)H\u0007J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u001a\u00100\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00062\b\u0010\'\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u00101\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00062\b\u0010\'\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u00102\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00062\b\u0010\'\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u00103\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00062\b\u0010\'\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u00104\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00062\b\u0010\'\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u00105\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u00062\b\u0010\'\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u00106\u001a\u0004\u0018\u00010\u001e2\b\u0010\'\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u00107\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00062\b\u0010\'\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u00108\u001a\u0004\u0018\u00010\"2\b\u0010\'\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u00109\u001a\u0004\u0018\u00010\u00132\b\u0010\'\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006:"}, d2 = {"Lcom/leopold/mvvm/data/db/converter/DateConverter;", "", "()V", "fromApplicationTypeList", "", "countryLang", "", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$ApplicationType;", "fromArrayList", "list", "Ljava/util/ArrayList;", "fromHealthFacilityTypeList", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$HealthFacilityType;", "fromIndicatorList", "Lcom/hisdu/meas/ui/Indicators/Indicator;", "fromInt", "", "fromModule", "value", "Lcom/hisdu/meas/ui/Indicators/ModuleToSave;", "fromModuleList", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$Module;", "fromOptionList", "Lcom/hisdu/meas/ui/Indicators/Option;", "fromShiftList", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$Shift;", "fromString", "fromattendanceList", "Lcom/hisdu/meas/ui/Attendance/StaffModel;", "fromfeedback", "Lcom/hisdu/meas/ui/Feedback/FeedbackSubmitModel;", "fromindicatorslist", "Lcom/hisdu/meas/ui/Indicators/IndicatorCategoryResponse;", "frominspector", "Lcom/hisdu/meas/ui/Indicators/InspactorModel;", "fromlistofModules", "frompdesignationList", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$designation;", "toApplicationTypeList", "countryLangString", "toDate", "Ljava/util/Date;", "", "toHealthFacilityTypeList", "toIntList", "toLong", "date", "toModule", "toModuleList", "toShiftList", "todIndicatorList", "todOptionList", "todattendanceList", "todesignationList", "tofeedback", "toindicatorslist", "toinspector", "tolistofModules", "app_debug"})
public final class DateConverter {
    
    public DateConverter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final java.util.Date toDate(long value) {
        return null;
    }
    
    @androidx.room.TypeConverter
    public final long toLong(@org.jetbrains.annotations.NotNull
    java.util.Date date) {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.lang.String fromlistofModules(@org.jetbrains.annotations.Nullable
    com.hisdu.meas.ui.Indicators.ModuleToSave countryLang) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final com.hisdu.meas.ui.Indicators.ModuleToSave tolistofModules(@org.jetbrains.annotations.Nullable
    java.lang.String countryLangString) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final java.lang.String fromModule(@org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.ui.Indicators.ModuleToSave> value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final java.util.List<com.hisdu.meas.ui.Indicators.ModuleToSave> toModule(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.util.ArrayList<java.lang.String> fromString(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.lang.String fromArrayList(@org.jetbrains.annotations.Nullable
    java.util.ArrayList<java.lang.String> list) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.lang.String fromInt(@org.jetbrains.annotations.Nullable
    java.util.List<java.lang.Integer> countryLang) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.util.List<java.lang.Integer> toIntList(@org.jetbrains.annotations.Nullable
    java.lang.String countryLangString) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.lang.String fromApplicationTypeList(@org.jetbrains.annotations.Nullable
    java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.ApplicationType> countryLang) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.ApplicationType> toApplicationTypeList(@org.jetbrains.annotations.Nullable
    java.lang.String countryLangString) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.lang.String fromHealthFacilityTypeList(@org.jetbrains.annotations.Nullable
    java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.HealthFacilityType> countryLang) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.HealthFacilityType> toHealthFacilityTypeList(@org.jetbrains.annotations.Nullable
    java.lang.String countryLangString) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.lang.String fromModuleList(@org.jetbrains.annotations.Nullable
    java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Module> countryLang) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Module> toModuleList(@org.jetbrains.annotations.Nullable
    java.lang.String countryLangString) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.lang.String fromShiftList(@org.jetbrains.annotations.Nullable
    java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Shift> countryLang) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Shift> toShiftList(@org.jetbrains.annotations.Nullable
    java.lang.String countryLangString) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.lang.String frompdesignationList(@org.jetbrains.annotations.Nullable
    java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.designation> countryLang) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.designation> todesignationList(@org.jetbrains.annotations.Nullable
    java.lang.String countryLangString) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.lang.String fromIndicatorList(@org.jetbrains.annotations.Nullable
    java.util.List<com.hisdu.meas.ui.Indicators.Indicator> countryLang) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.util.List<com.hisdu.meas.ui.Indicators.Indicator> todIndicatorList(@org.jetbrains.annotations.Nullable
    java.lang.String countryLangString) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.lang.String fromOptionList(@org.jetbrains.annotations.Nullable
    java.util.List<com.hisdu.meas.ui.Indicators.Option> countryLang) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.util.List<com.hisdu.meas.ui.Indicators.Option> todOptionList(@org.jetbrains.annotations.Nullable
    java.lang.String countryLangString) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.lang.String fromattendanceList(@org.jetbrains.annotations.Nullable
    java.util.List<com.hisdu.meas.ui.Attendance.StaffModel> countryLang) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.util.List<com.hisdu.meas.ui.Attendance.StaffModel> todattendanceList(@org.jetbrains.annotations.Nullable
    java.lang.String countryLangString) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.lang.String fromindicatorslist(@org.jetbrains.annotations.Nullable
    java.util.List<com.hisdu.meas.ui.Indicators.IndicatorCategoryResponse> countryLang) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.util.List<com.hisdu.meas.ui.Indicators.IndicatorCategoryResponse> toindicatorslist(@org.jetbrains.annotations.Nullable
    java.lang.String countryLangString) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.lang.String fromfeedback(@org.jetbrains.annotations.Nullable
    com.hisdu.meas.ui.Feedback.FeedbackSubmitModel countryLang) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final com.hisdu.meas.ui.Feedback.FeedbackSubmitModel tofeedback(@org.jetbrains.annotations.Nullable
    java.lang.String countryLangString) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.lang.String frominspector(@org.jetbrains.annotations.Nullable
    com.hisdu.meas.ui.Indicators.InspactorModel countryLang) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final com.hisdu.meas.ui.Indicators.InspactorModel toinspector(@org.jetbrains.annotations.Nullable
    java.lang.String countryLangString) {
        return null;
    }
}