package com.hisdu.meas.data.source.local.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\'J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u000e\u00c0\u0006\u0001"}, d2 = {"Lcom/hisdu/meas/data/source/local/dao/UserDao;", "", "delete", "", "recipe", "Lcom/zest/android/ui/login/UserModel;", "deleteAllData", "insert", "loadAll", "", "loadOneByUserId", "userid", "", "update", "app_debug"})
public abstract interface UserDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.zest.android.ui.login.UserModel recipe);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM userModel")
    public abstract java.util.List<com.zest.android.ui.login.UserModel> loadAll();
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    com.zest.android.ui.login.UserModel recipe);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM userModel where Id = :userid")
    public abstract com.zest.android.ui.login.UserModel loadOneByUserId(@org.jetbrains.annotations.NotNull
    java.lang.String userid);
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    com.zest.android.ui.login.UserModel recipe);
    
    @androidx.room.Query(value = "DELETE FROM userModel")
    public abstract void deleteAllData();
}