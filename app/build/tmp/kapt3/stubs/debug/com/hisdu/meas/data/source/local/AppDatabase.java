package com.hisdu.meas.data.source.local;

import java.lang.System;

@androidx.room.Database(entities = {com.hisdu.meas.data.model.Recipe.class, com.zest.android.ui.login.UserModel.class, com.zest.android.ui.login.HealthFacility.HealthFacilityModel.class, com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.ApplicationType.class, com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.HealthFacilityType.class, com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Module.class, com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Shift.class, com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.PresanceStatus.class, com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.designation.class, com.hisdu.meas.ui.Indicators.Indicator.class, com.hisdu.meas.ui.Indicators.SubmitFormModel.class, com.hisdu.meas.ui.Indicators.IndicatorCategory.class, com.hisdu.meas.ui.Indicators.ZoneModel.Zone.class, com.hisdu.meas.ui.Visits.Visits.class}, version = 2, exportSchema = true)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0018X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u001cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020 X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u0012\u0010#\u001a\u00020$X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010&R\u0012\u0010\'\u001a\u00020(X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010*\u00a8\u0006,"}, d2 = {"Lcom/hisdu/meas/data/source/local/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "designationDao", "Lcom/hisdu/meas/data/source/local/dao/DesignationDao;", "getDesignationDao", "()Lcom/hisdu/meas/data/source/local/dao/DesignationDao;", "healthFacilityDao", "Lcom/hisdu/meas/data/source/local/dao/HealthFacilityDao;", "getHealthFacilityDao", "()Lcom/hisdu/meas/data/source/local/dao/HealthFacilityDao;", "healthFacilityTypeDao", "Lcom/hisdu/meas/data/source/local/dao/HealthFacilityTypeDao;", "getHealthFacilityTypeDao", "()Lcom/hisdu/meas/data/source/local/dao/HealthFacilityTypeDao;", "modulesDao", "Lcom/hisdu/meas/data/source/local/dao/ModulesDao;", "getModulesDao", "()Lcom/hisdu/meas/data/source/local/dao/ModulesDao;", "presenceStatusDao", "Lcom/hisdu/meas/data/source/local/dao/PresenceStatusDao;", "getPresenceStatusDao", "()Lcom/hisdu/meas/data/source/local/dao/PresenceStatusDao;", "recipeDao", "Lcom/hisdu/meas/data/source/local/dao/RecipeDao;", "getRecipeDao", "()Lcom/hisdu/meas/data/source/local/dao/RecipeDao;", "shiftsDao", "Lcom/hisdu/meas/data/source/local/dao/ShiftsDao;", "getShiftsDao", "()Lcom/hisdu/meas/data/source/local/dao/ShiftsDao;", "submitFormDao", "Lcom/hisdu/meas/data/source/local/dao/SubmitFormDao;", "getSubmitFormDao", "()Lcom/hisdu/meas/data/source/local/dao/SubmitFormDao;", "userDao", "Lcom/hisdu/meas/data/source/local/dao/UserDao;", "getUserDao", "()Lcom/hisdu/meas/data/source/local/dao/UserDao;", "userVisitsDao", "Lcom/hisdu/meas/data/source/local/dao/UserVisitsDao;", "getUserVisitsDao", "()Lcom/hisdu/meas/data/source/local/dao/UserVisitsDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.hisdu.meas.data.source.local.AppDatabase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String DB_NAME = "MEAS.db";
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.hisdu.meas.data.source.local.dao.RecipeDao getRecipeDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.hisdu.meas.data.source.local.dao.UserDao getUserDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.hisdu.meas.data.source.local.dao.HealthFacilityDao getHealthFacilityDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.hisdu.meas.data.source.local.dao.HealthFacilityTypeDao getHealthFacilityTypeDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.hisdu.meas.data.source.local.dao.ShiftsDao getShiftsDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.hisdu.meas.data.source.local.dao.ModulesDao getModulesDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.hisdu.meas.data.source.local.dao.PresenceStatusDao getPresenceStatusDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.hisdu.meas.data.source.local.dao.DesignationDao getDesignationDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.hisdu.meas.data.source.local.dao.SubmitFormDao getSubmitFormDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.hisdu.meas.data.source.local.dao.UserVisitsDao getUserVisitsDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/hisdu/meas/data/source/local/AppDatabase$Companion;", "", "()V", "DB_NAME", "", "getDB_NAME", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDB_NAME() {
            return null;
        }
    }
}