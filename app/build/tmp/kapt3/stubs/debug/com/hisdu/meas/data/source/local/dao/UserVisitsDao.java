package com.hisdu.meas.data.source.local.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H\'J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\'J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\'J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\'J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u0016\u00c0\u0006\u0001"}, d2 = {"Lcom/hisdu/meas/data/source/local/dao/UserVisitsDao;", "", "delete", "", "visit", "Lcom/hisdu/meas/ui/Visits/Visits;", "deleteAllData", "insert", "facility", "insertAll", "", "loadAll", "", "loadByVisitId", "visitid", "", "loadVisitByid", "hfcode", "", "shiftId", "userId", "update", "app_debug"})
public abstract interface UserVisitsDao {
    
    @androidx.room.Insert(onConflict = 5)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Visits.Visits facility);
    
    @androidx.room.Insert(onConflict = 5)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull
    java.util.List<com.hisdu.meas.ui.Visits.Visits> visit);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM visits")
    public abstract java.util.List<com.hisdu.meas.ui.Visits.Visits> loadAll();
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Visits.Visits visit);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM visits where hFMISCode = :hfcode and shiftId=:shiftId and userId=:userId")
    public abstract java.util.List<com.hisdu.meas.ui.Visits.Visits> loadVisitByid(@org.jetbrains.annotations.NotNull
    java.lang.String hfcode, int shiftId, int userId);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM visits where  visitid=:visitid")
    public abstract com.hisdu.meas.ui.Visits.Visits loadByVisitId(int visitid);
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Visits.Visits visit);
    
    @androidx.room.Query(value = "DELETE FROM visits")
    public abstract void deleteAllData();
}