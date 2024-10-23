package com.hisdu.meas.data.source.local.dao

import androidx.room.*
import com.hisdu.meas.data.model.Recipe
import com.hisdu.meas.ui.Dashboard.AppDropdown
import com.zest.android.ui.login.HealthFacility


@Dao
interface ShiftsDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(facility: AppDropdown.DropdownData.Shift)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(facility: List<AppDropdown.DropdownData.Shift>)

    @Query("SELECT * FROM shift")
    fun loadAll(): MutableList<AppDropdown.DropdownData.Shift>

    @Query("SELECT * FROM shift where HFTypeId LIKE '%' || :hftypeid || '%' ")
    fun loadByHfTypeID(hftypeid:Int): MutableList<AppDropdown.DropdownData.Shift>
    @Delete
    fun delete(facility: AppDropdown.DropdownData.Shift)

    @Update
    fun update(facility: AppDropdown.DropdownData.Shift)

    @Query("DELETE FROM Shift")
    fun deleteAllData()
}