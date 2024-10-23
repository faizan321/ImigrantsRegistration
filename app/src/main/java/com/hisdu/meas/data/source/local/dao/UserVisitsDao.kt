package com.hisdu.meas.data.source.local.dao

import androidx.room.*
import com.hisdu.meas.data.model.Recipe
import com.hisdu.meas.ui.Visits.VisitModel
import com.hisdu.meas.ui.Visits.Visits
import com.zest.android.ui.login.HealthFacility


@Dao
interface UserVisitsDao {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(facility: Visits)


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertAll(visit: List<Visits>)

    @Query("SELECT * FROM visits")
    fun loadAll(): MutableList<Visits>

    @Delete
    fun delete(visit: Visits)

    @Query("SELECT * FROM visits where hFMISCode = :hfcode and shiftId=:shiftId and userId=:userId")
    fun loadVisitByid(hfcode: String,shiftId:Int,userId:Int): MutableList<Visits>

    @Query("SELECT * FROM visits where  visitid=:visitid")
    fun loadByVisitId(visitid:Int): Visits

    @Update
    fun update(visit:  Visits)

    @Query("DELETE FROM visits")
    fun deleteAllData()
}