package com.hisdu.meas.data.source.local.dao

import androidx.room.*
import com.hisdu.meas.data.model.Recipe
import com.hisdu.meas.ui.Dashboard.AppDropdown
import com.zest.android.ui.login.HealthFacility


@Dao
interface ModulesDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(facility: AppDropdown.DropdownData.Module)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(facility: List<AppDropdown.DropdownData.Module>)

    @Query("SELECT * FROM module ")
    fun loadAll(): MutableList<AppDropdown.DropdownData.Module>

    @Query("SELECT * FROM module where applicationTypeId=:applicationTypeId")
    fun loadById(applicationTypeId:Int): MutableList<AppDropdown.DropdownData.Module>

    @Delete
    fun delete(facility: AppDropdown.DropdownData.Module)

    @Update
    fun update(facility: AppDropdown.DropdownData.Module)

    @Query("DELETE FROM module")
    fun deleteAllData()
}