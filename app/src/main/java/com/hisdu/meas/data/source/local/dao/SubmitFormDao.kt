package com.hisdu.meas.data.source.local.dao

import androidx.room.*
import com.hisdu.meas.data.model.Recipe
import com.hisdu.meas.ui.Indicators.SubmitFormModel


@Dao
interface SubmitFormDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(recipe: SubmitFormModel):Long


    @Query("SELECT * FROM submitformmodel")
    fun loadAll(): MutableList<SubmitFormModel>

    @Delete
    fun delete(recipe: SubmitFormModel)

    @Query("SELECT * FROM submitformmodel where isSync = :isSync and userid=:userid")
    fun loadBySyncId(isSync: Int,userid:String): MutableList<SubmitFormModel>
    @Query("SELECT * FROM submitformmodel where isSync = :isSync and userid=:userid AND facility=:facilityId")
    fun loadSyncByHF(isSync: Int,userid:Int, facilityId:String): MutableList<SubmitFormModel>
    @Query("SELECT * FROM submitformmodel where isSync = 2 and userid=:userid AND facility=:facilityId")
    fun getPendingRecord(userid:Int, facilityId:String): SubmitFormModel

    @Query("SELECT * FROM submitformmodel where isSync = 2 and userid=:userid AND  applicationTypeid=:applicationTypeid")
    fun getPendingRecordByModule(userid:Int,applicationTypeid:Int): MutableList<SubmitFormModel>


    @Query("SELECT * FROM submitformmodel where isSync = 2 and userid=:userid AND moduleId=:moduleId AND applicationTypeid=:applicationTypeid AND facilityType=:facilityType AND facility=:facilty AND visityType=:visitType")
    fun getPendingForId(userid:Int, moduleId:Int,applicationTypeid:Int,facilityType:String,facilty:String,visitType:String): SubmitFormModel


    @Update
    fun update(recipe: SubmitFormModel)

}