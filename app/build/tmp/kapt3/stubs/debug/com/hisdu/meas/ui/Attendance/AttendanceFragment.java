package com.hisdu.meas.ui.Attendance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 F2\u00020\u0001:\u0001FB\u0005\u00a2\u0006\u0002\u0010\u0002J*\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u00052\u0006\u00106\u001a\u000207H\u0002J\u000e\u00108\u001a\u0002002\u0006\u00106\u001a\u000207J\u0012\u00109\u001a\u0002002\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J&\u0010<\u001a\u0004\u0018\u00010=2\u0006\u00101\u001a\u0002022\b\u0010>\u001a\u0004\u0018\u00010?2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u000e\u0010@\u001a\u0002002\u0006\u0010A\u001a\u00020\u0018J\u001e\u0010B\u001a\u0002042\u0006\u0010C\u001a\u00020\u00182\u0006\u0010D\u001a\u00020\u00182\u0006\u0010E\u001a\u00020\u0018R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR \u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010&R\u000e\u0010\'\u001a\u00020(X\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010)\u001a\b\u0012\u0004\u0012\u00020(0*8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\u00a8\u0006G"}, d2 = {"Lcom/hisdu/meas/ui/Attendance/AttendanceFragment;", "Landroidx/fragment/app/Fragment;", "()V", "attendanceList", "", "Lcom/hisdu/meas/ui/Attendance/StaffModel;", "getAttendanceList", "()Ljava/util/List;", "binding", "Lcom/hisdu/meas/databinding/AttendanceFragmentBinding;", "designationList", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$designation;", "getDesignationList", "mAdapter", "Lcom/hisdu/meas/ui/Attendance/AttendanceAdapter;", "mRecipe", "Lcom/hisdu/meas/data/model/Recipe;", "masterModel", "Lcom/hisdu/meas/ui/Indicators/SubmitFormModel;", "getMasterModel", "()Lcom/hisdu/meas/ui/Indicators/SubmitFormModel;", "setMasterModel", "(Lcom/hisdu/meas/ui/Indicators/SubmitFormModel;)V", "selectedDesignation", "", "selectedHfTYpe", "getSelectedHfTYpe", "()Ljava/lang/String;", "setSelectedHfTYpe", "(Ljava/lang/String;)V", "selectedStatus", "shiftid", "getShiftid", "setShiftid", "statusModellist", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$PresanceStatus;", "getStatusModellist", "setStatusModellist", "(Ljava/util/List;)V", "viewModel", "Lcom/hisdu/meas/ui/Dashboard/DashboardViewModel;", "viewModelProvider", "Ljavax/inject/Provider;", "getViewModelProvider", "()Ljavax/inject/Provider;", "setViewModelProvider", "(Ljavax/inject/Provider;)V", "addNewMember", "", "inflater", "Landroid/view/LayoutInflater;", "isEdit", "", "member", "position", "", "deleteDialog", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "container", "Landroid/view/ViewGroup;", "showErrorMessage", "msg", "validateStaff", "name", "cnic", "mobile", "Companion", "app_debug"})
public final class AttendanceFragment extends androidx.fragment.app.Fragment {
    private com.hisdu.meas.data.model.Recipe mRecipe;
    private com.hisdu.meas.databinding.AttendanceFragmentBinding binding;
    private com.hisdu.meas.ui.Dashboard.DashboardViewModel viewModel;
    private com.hisdu.meas.ui.Attendance.AttendanceAdapter mAdapter;
    private java.lang.String selectedStatus = "";
    private java.lang.String selectedDesignation = "";
    @org.jetbrains.annotations.Nullable
    private java.lang.String selectedHfTYpe;
    @org.jetbrains.annotations.Nullable
    private java.lang.String shiftid;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.PresanceStatus> statusModellist;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.designation> designationList = null;
    public com.hisdu.meas.ui.Indicators.SubmitFormModel masterModel;
    @javax.inject.Inject
    public javax.inject.Provider<com.hisdu.meas.ui.Dashboard.DashboardViewModel> viewModelProvider;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.hisdu.meas.ui.Attendance.StaffModel> attendanceList = null;
    @org.jetbrains.annotations.NotNull
    public static final com.hisdu.meas.ui.Attendance.AttendanceFragment.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private java.util.HashMap _$_findViewCache;
    
    public AttendanceFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSelectedHfTYpe() {
        return null;
    }
    
    public final void setSelectedHfTYpe(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getShiftid() {
        return null;
    }
    
    public final void setShiftid(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.PresanceStatus> getStatusModellist() {
        return null;
    }
    
    public final void setStatusModellist(@org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.PresanceStatus> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.designation> getDesignationList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.Indicators.SubmitFormModel getMasterModel() {
        return null;
    }
    
    public final void setMasterModel(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.SubmitFormModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final javax.inject.Provider<com.hisdu.meas.ui.Dashboard.DashboardViewModel> getViewModelProvider() {
        return null;
    }
    
    public final void setViewModelProvider(@org.jetbrains.annotations.NotNull
    javax.inject.Provider<com.hisdu.meas.ui.Dashboard.DashboardViewModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.hisdu.meas.ui.Attendance.StaffModel> getAttendanceList() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void deleteDialog(int position) {
    }
    
    public final boolean validateStaff(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String cnic, @org.jetbrains.annotations.NotNull
    java.lang.String mobile) {
        return false;
    }
    
    public final void showErrorMessage(@org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    private final void addNewMember(android.view.LayoutInflater inflater, boolean isEdit, com.hisdu.meas.ui.Attendance.StaffModel member, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/hisdu/meas/ui/Attendance/AttendanceFragment$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}