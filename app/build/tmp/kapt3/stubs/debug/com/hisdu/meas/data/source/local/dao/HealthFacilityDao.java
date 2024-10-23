package com.hisdu.meas.data.source.local.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\'J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0014\u001a\u00020\u000fH\'J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u000fH\'J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u0019\u00c0\u0006\u0001"}, d2 = {"Lcom/hisdu/meas/data/source/local/dao/HealthFacilityDao;", "", "delete", "", "facility", "Lcom/zest/android/ui/login/HealthFacility$HealthFacilityModel;", "deleteAllData", "insert", "insertAll", "", "loadAll", "", "loadAllDvision", "loadByDistrictBycode", "DivisionCode", "", "loadByLocation", "locationCode", "modename", "loadByTehsilId", "districtCode", "loadByZoneId", "zonedId", "", "update", "app_debug"})
public abstract interface HealthFacilityDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.zest.android.ui.login.HealthFacility.HealthFacilityModel facility);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull
    java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel> facility);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM healthfacility")
    public abstract java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel> loadAll();
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    com.zest.android.ui.login.HealthFacility.HealthFacilityModel facility);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM healthfacility where ZoneId = :zonedId and ModeName=:modename")
    public abstract java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel> loadByZoneId(int zonedId, @org.jetbrains.annotations.NotNull
    java.lang.String modename);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM healthfacility where  HFMISCode LIKE \'%\' || :locationCode || \'%\' and ModeName=:modename")
    public abstract java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel> loadByLocation(@org.jetbrains.annotations.NotNull
    java.lang.String locationCode, @org.jetbrains.annotations.NotNull
    java.lang.String modename);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM healthfacility where districtCode = :districtCode AND lvl= \'Tehsil\'")
    public abstract java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel> loadByTehsilId(@org.jetbrains.annotations.NotNull
    java.lang.String districtCode);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM healthfacility where divisionCode LIKE \'%\' || :DivisionCode || \'%\' AND lvl= \'District\'")
    public abstract java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel> loadByDistrictBycode(@org.jetbrains.annotations.NotNull
    java.lang.String DivisionCode);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM healthfacility where lvl= \'Division\'")
    public abstract java.util.List<com.zest.android.ui.login.HealthFacility.HealthFacilityModel> loadAllDvision();
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    com.zest.android.ui.login.HealthFacility.HealthFacilityModel facility);
    
    @androidx.room.Query(value = "DELETE FROM healthfacility")
    public abstract void deleteAllData();
}