package com.hisdu.meas.data.source.local.dao

import androidx.room.*
import com.zest.android.ui.login.UserModel


@Dao
interface UserDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(recipe: UserModel)

    @Query("SELECT * FROM userModel")
    fun loadAll(): MutableList<UserModel>

    @Delete
    fun delete(recipe: UserModel)

    @Query("SELECT * FROM userModel where Id = :userid")
    fun loadOneByUserId(userid: String): UserModel?

//    @Query("SELECT * FROM userModel where userId = :userid and testlist LIKE '%' || :testid || '%' ")
//    fun loadTest(userid: Int,testid:Int): User.UserModel?

//    @Query("SELECT * FROM userModel WHERE userId = :userid and  testlist IN(:testid)")
//     fun findByIds(userid: Int,testid: List<Int>): User.UserModel?


    @Update
    fun update(recipe: UserModel)

    @Query("DELETE FROM userModel")
    fun deleteAllData()
}