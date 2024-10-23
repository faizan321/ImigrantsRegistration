package com.hisdu.meas.data.source.local.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J8\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\'J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\fH\'J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\'J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\'J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\fH\'J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\fH\'J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u001a\u00c0\u0006\u0001"}, d2 = {"Lcom/hisdu/meas/data/source/local/dao/SubmitFormDao;", "", "delete", "", "recipe", "Lcom/hisdu/meas/ui/Indicators/SubmitFormModel;", "getPendingForId", "userid", "", "moduleId", "applicationTypeid", "facilityType", "", "facilty", "visitType", "getPendingRecord", "facilityId", "getPendingRecordByModule", "", "insert", "", "loadAll", "loadBySyncId", "isSync", "loadSyncByHF", "update", "app_debug"})
public abstract interface SubmitFormDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract long insert(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.SubmitFormModel recipe);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM submitformmodel")
    public abstract java.util.List<com.hisdu.meas.ui.Indicators.SubmitFormModel> loadAll();
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.SubmitFormModel recipe);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM submitformmodel where isSync = :isSync and userid=:userid")
    public abstract java.util.List<com.hisdu.meas.ui.Indicators.SubmitFormModel> loadBySyncId(int isSync, @org.jetbrains.annotations.NotNull
    java.lang.String userid);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM submitformmodel where isSync = :isSync and userid=:userid AND facility=:facilityId")
    public abstract java.util.List<com.hisdu.meas.ui.Indicators.SubmitFormModel> loadSyncByHF(int isSync, int userid, @org.jetbrains.annotations.NotNull
    java.lang.String facilityId);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM submitformmodel where isSync = 2 and userid=:userid AND facility=:facilityId")
    public abstract com.hisdu.meas.ui.Indicators.SubmitFormModel getPendingRecord(int userid, @org.jetbrains.annotations.NotNull
    java.lang.String facilityId);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM submitformmodel where isSync = 2 and userid=:userid AND  applicationTypeid=:applicationTypeid")
    public abstract java.util.List<com.hisdu.meas.ui.Indicators.SubmitFormModel> getPendingRecordByModule(int userid, int applicationTypeid);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM submitformmodel where isSync = 2 and userid=:userid AND moduleId=:moduleId AND applicationTypeid=:applicationTypeid AND facilityType=:facilityType AND facility=:facilty AND visityType=:visitType")
    public abstract com.hisdu.meas.ui.Indicators.SubmitFormModel getPendingForId(int userid, int moduleId, int applicationTypeid, @org.jetbrains.annotations.NotNull
    java.lang.String facilityType, @org.jetbrains.annotations.NotNull
    java.lang.String facilty, @org.jetbrains.annotations.NotNull
    java.lang.String visitType);
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.SubmitFormModel recipe);
}