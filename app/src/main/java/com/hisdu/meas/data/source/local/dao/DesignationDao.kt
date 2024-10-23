package com.hisdu.meas.data.source.local.dao

import androidx.room.*
import com.hisdu.meas.data.model.Recipe
import com.hisdu.meas.ui.Dashboard.AppDropdown
import com.zest.android.ui.login.HealthFacility


@Dao
interface DesignationDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(facility: AppDropdown.DropdownData.designation)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(facility: List<AppDropdown.DropdownData.designation>)

    @Query("SELECT * FROM designation where HFTypeId =:hftype and ShiftId =:shiftId ORDER BY SequenceNo")
    fun loadAll(hftype:String,shiftId:String): MutableList<AppDropdown.DropdownData.designation>

    @Delete
    fun delete(facility: AppDropdown.DropdownData.designation)

    @Update
    fun update(facility: AppDropdown.DropdownData.designation)


    @Query("DELETE FROM designation")
    fun deleteAllData()
}