package com.hisdu.meas.data.source.local.dao

import androidx.room.*
import com.hisdu.meas.data.model.Recipe
import com.hisdu.meas.ui.Dashboard.AppDropdown
import com.zest.android.ui.login.HealthFacility


@Dao
interface HealthFacilityTypeDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(facility: AppDropdown.DropdownData.HealthFacilityType)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(facility: List<AppDropdown.DropdownData.HealthFacilityType>)

    @Query("SELECT * FROM healthFacilityType")
    fun loadAll(): MutableList<AppDropdown.DropdownData.HealthFacilityType>
    @Query("SELECT * FROM healthFacilityType where ApplicationTypeIds LIKE '%' || :applicationtypeId || '%' ")
    fun loadByid(applicationtypeId:Int): MutableList<AppDropdown.DropdownData.HealthFacilityType>
    @Delete
    fun delete(facility: AppDropdown.DropdownData.HealthFacilityType)

//    @Query("SELECT * FROM healthfacilitytype where facilityTypeId = :facilityId")
//    fun loadModuleById(facilityId: Int): AppDropdown.DropdownData?

    @Update
    fun update(facility: AppDropdown.DropdownData.HealthFacilityType)

    @Query("DELETE FROM healthFacilityType")
    fun deleteAllData()
}