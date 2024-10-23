package com.hisdu.meas.data.source.local.dao

import androidx.room.*
import com.hisdu.meas.data.model.Recipe
import com.hisdu.meas.ui.Dashboard.AppDropdown
import com.zest.android.ui.login.HealthFacility


@Dao
interface PresenceStatusDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(facility: AppDropdown.DropdownData.PresanceStatus)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(facility: List<AppDropdown.DropdownData.PresanceStatus>)

    @Query("SELECT * FROM presancestatus")
    fun loadAll(): MutableList<AppDropdown.DropdownData.PresanceStatus>

    @Delete
    fun delete(facility: AppDropdown.DropdownData.PresanceStatus)

    @Update
    fun update(facility: AppDropdown.DropdownData.PresanceStatus)

    @Query("DELETE FROM presancestatus")
    fun deleteAllData()
}