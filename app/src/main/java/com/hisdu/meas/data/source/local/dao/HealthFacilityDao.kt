package com.hisdu.meas.data.source.local.dao

import androidx.room.*
import com.hisdu.meas.data.model.Recipe
import com.zest.android.ui.login.HealthFacility


@Dao
interface HealthFacilityDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(facility: HealthFacility.HealthFacilityModel)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(facility: List<HealthFacility.HealthFacilityModel>)

    @Query("SELECT * FROM healthfacility")
    fun loadAll(): MutableList<HealthFacility.HealthFacilityModel>

    @Delete
    fun delete(facility: HealthFacility.HealthFacilityModel)

    @Query("SELECT * FROM healthfacility where ZoneId = :zonedId and ModeName=:modename")
    fun loadByZoneId(zonedId: Int,modename:String): MutableList<HealthFacility.HealthFacilityModel>



    @Query("SELECT * FROM healthfacility where  HFMISCode LIKE '%' || :locationCode || '%' and ModeName=:modename")
    fun loadByLocation(locationCode:String,modename:String): MutableList<HealthFacility.HealthFacilityModel>

    @Query("SELECT * FROM healthfacility where districtCode = :districtCode AND lvl= 'Tehsil'")
    fun loadByTehsilId(districtCode:String): MutableList<HealthFacility.HealthFacilityModel>

    @Query("SELECT * FROM healthfacility where divisionCode LIKE '%' || :DivisionCode || '%' AND lvl= 'District'")
    fun loadByDistrictBycode(DivisionCode:String): MutableList<HealthFacility.HealthFacilityModel>


    @Query("SELECT * FROM healthfacility where lvl= 'Division'")
    fun loadAllDvision(): MutableList<HealthFacility.HealthFacilityModel>

    @Update
    fun update(facility: HealthFacility.HealthFacilityModel)


    @Query("DELETE FROM healthfacility")
    fun deleteAllData()
}