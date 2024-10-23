package com.hisdu.meas.data.source.local.dao

import androidx.room.*
import com.hisdu.meas.data.model.Recipe


@Dao
interface RecipeDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(recipe: Recipe)

    @Query("SELECT * FROM Recipe")
    fun loadAll(): MutableList<Recipe>

    @Delete
    fun delete(recipe: Recipe)

    @Query("SELECT * FROM Recipe where recipeId = :recipeId")
    fun loadOneByRecipeId(recipeId: String): Recipe?

    @Update
    fun update(recipe: Recipe)

    @Query("DELETE FROM Recipe")
    fun deleteAllData()
}