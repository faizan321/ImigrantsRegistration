package com.hisdu.meas.data.source.local.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u0010\u00c0\u0006\u0001"}, d2 = {"Lcom/hisdu/meas/data/source/local/dao/ModulesDao;", "", "delete", "", "facility", "Lcom/hisdu/meas/ui/Dashboard/AppDropdown$DropdownData$Module;", "deleteAllData", "insert", "insertAll", "", "loadAll", "", "loadById", "applicationTypeId", "", "update", "app_debug"})
public abstract interface ModulesDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Module facility);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Module> facility);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM module ")
    public abstract java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Module> loadAll();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM module where applicationTypeId=:applicationTypeId")
    public abstract java.util.List<com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Module> loadById(int applicationTypeId);
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Module facility);
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Module facility);
    
    @androidx.room.Query(value = "DELETE FROM module")
    public abstract void deleteAllData();
}