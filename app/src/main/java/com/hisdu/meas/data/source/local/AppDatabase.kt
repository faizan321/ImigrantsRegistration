package com.hisdu.meas.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.hisdu.meas.data.model.Recipe
import com.hisdu.meas.data.source.local.dao.*
import com.hisdu.meas.ui.Dashboard.AppDropdown
import com.hisdu.meas.ui.Indicators.Indicator
import com.hisdu.meas.ui.Indicators.IndicatorCategory
import com.hisdu.meas.ui.Indicators.SubmitFormModel
import com.hisdu.meas.ui.Indicators.ZoneModel
import com.hisdu.meas.ui.Visits.VisitModel
import com.hisdu.meas.ui.Visits.Visits
import com.zest.android.ui.login.HealthFacility
import com.zest.android.ui.login.UserModel

@Database(

    entities = [
        Recipe::class,
        UserModel::class,
        HealthFacility.HealthFacilityModel::class,
        AppDropdown.DropdownData.ApplicationType::class,
        AppDropdown.DropdownData.HealthFacilityType::class,
        AppDropdown.DropdownData.Module::class,
        AppDropdown.DropdownData.Shift::class,
        AppDropdown.DropdownData.PresanceStatus::class,
        AppDropdown.DropdownData.designation::class,
        Indicator::class,
        SubmitFormModel::class,
        IndicatorCategory::class,
        ZoneModel.Zone::class,
        Visits::class],
    version = 2,
    exportSchema = true

    )



abstract class AppDatabase : RoomDatabase() {

    abstract val recipeDao: RecipeDao
    abstract val userDao: UserDao
    abstract val healthFacilityDao: HealthFacilityDao
//    abstract val dropdownDao:DropDownDataDao

    abstract val healthFacilityTypeDao: HealthFacilityTypeDao
    abstract val shiftsDao: ShiftsDao
    abstract val modulesDao: ModulesDao
    abstract val presenceStatusDao: PresenceStatusDao
    abstract val designationDao: DesignationDao
    abstract val submitFormDao: SubmitFormDao
    abstract val userVisitsDao: UserVisitsDao

    companion object {

        val DB_NAME = "MEAS.db"

    }
}

