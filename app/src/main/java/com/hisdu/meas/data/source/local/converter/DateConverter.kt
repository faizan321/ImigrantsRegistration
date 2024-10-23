package com.leopold.mvvm.data.db.converter

import android.text.TextUtils
import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.hisdu.meas.ui.Attendance.StaffModel
import com.hisdu.meas.ui.Dashboard.AppDropdown
import com.hisdu.meas.ui.Feedback.FeedbackSubmitModel
import com.hisdu.meas.ui.Indicators.*
import java.lang.reflect.Type
import java.util.*

/**
 * @author Leopold
 */
class DateConverter {
    @TypeConverter
    fun toDate(value: Long): Date = Date(value)

    @TypeConverter
    fun toLong(date: Date): Long = date.time


    @TypeConverter
    fun fromlistofModules(countryLang: ModuleToSave?): String? {
        if (countryLang == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<ModuleToSave?>() {}.type
        return gson.toJson(countryLang, type)
    }

    @TypeConverter
    fun tolistofModules(countryLangString: String?): ModuleToSave? {
        if (countryLangString == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<ModuleToSave?>() {}.type
        return gson.fromJson<ModuleToSave>(countryLangString, type)
    }



    @TypeConverter
    fun fromModule(value: List<ModuleToSave>): String {
        val gson = Gson()
        val type = object : TypeToken<List<ModuleToSave>>() {}.type
        return gson.toJson(value, type)
    }

    @TypeConverter
    fun toModule(value: String): List<ModuleToSave> {
        val gson = Gson()
        val type = object : TypeToken<List<ModuleToSave>>() {}.type
        return gson.fromJson(value, type)
    }





    @TypeConverter
    fun fromString(value: String?): ArrayList<String?>? {
        val listType = object : TypeToken<ArrayList<String?>?>() {}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun fromArrayList(list: ArrayList<String?>?): String? {
        val gson = Gson()
        return gson.toJson(list)
    }


//    @TypeConverter
//    fun fromInt(value: String?): ArrayList<Int?>? {
//        val listType = object : TypeToken<ArrayList<Int?>?>() {}.type
//        return Gson().fromJson(value, listType)
//    }
//
//    @TypeConverter
//    fun toIntList(list: ArrayList<Int?>?): String? {
//        val gson = Gson()
//        return gson.toJson(list)
//    }

    @TypeConverter
    fun fromInt(countryLang: List<Int?>?): String? {
        if (countryLang == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<List<Int?>?>() {}.type
        return gson.toJson(countryLang, type)
    }

    @TypeConverter
    fun toIntList(countryLangString: String?): List<Int>? {
        if (countryLangString == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<List<Int?>?>() {}.type
        return gson.fromJson<List<Int>>(countryLangString, type)
    }

    @TypeConverter
    fun fromApplicationTypeList(countryLang: List<AppDropdown.DropdownData.ApplicationType?>?): String? {
        if (countryLang == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<List<AppDropdown.DropdownData.ApplicationType?>?>() {}.type
        return gson.toJson(countryLang, type)
    }

    @TypeConverter
    fun toApplicationTypeList(countryLangString: String?): List<AppDropdown.DropdownData.ApplicationType>? {
        if (countryLangString == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<List<AppDropdown.DropdownData.ApplicationType?>?>() {}.type
        return gson.fromJson<List<AppDropdown.DropdownData.ApplicationType>>(countryLangString, type)
    }

    @TypeConverter
    fun fromHealthFacilityTypeList(countryLang: List<AppDropdown.DropdownData.HealthFacilityType?>?): String? {
        if (countryLang == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<List<AppDropdown.DropdownData.HealthFacilityType?>?>() {}.type
        return gson.toJson(countryLang, type)
    }

    @TypeConverter
    fun toHealthFacilityTypeList(countryLangString: String?): List<AppDropdown.DropdownData.HealthFacilityType>? {
        if (countryLangString == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<List<AppDropdown.DropdownData.HealthFacilityType?>?>() {}.type
        return gson.fromJson<List<AppDropdown.DropdownData.HealthFacilityType>>(countryLangString, type)
    }


    @TypeConverter
    fun fromModuleList(countryLang: List<AppDropdown.DropdownData.Module?>?): String? {
        if (countryLang == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<List<AppDropdown.DropdownData.Module?>?>() {}.type
        return gson.toJson(countryLang, type)
    }

    @TypeConverter
    fun toModuleList(countryLangString: String?): List<AppDropdown.DropdownData.Module>? {
        if (countryLangString == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<List<AppDropdown.DropdownData.Module?>?>() {}.type
        return gson.fromJson<List<AppDropdown.DropdownData.Module>>(countryLangString, type)
    }


    @TypeConverter
    fun fromShiftList(countryLang: List<AppDropdown.DropdownData.Shift?>?): String? {
        if (countryLang == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<List<AppDropdown.DropdownData.Shift?>?>() {}.type
        return gson.toJson(countryLang, type)
    }

    @TypeConverter
    fun toShiftList(countryLangString: String?): List<AppDropdown.DropdownData.Shift>? {
        if (countryLangString == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<List<AppDropdown.DropdownData.Shift?>?>() {}.type
        return gson.fromJson<List<AppDropdown.DropdownData.Shift>>(countryLangString, type)
    }



    @TypeConverter
    fun frompdesignationList(countryLang: List<AppDropdown.DropdownData.designation?>?): String? {
        if (countryLang == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<List<AppDropdown.DropdownData.designation?>?>() {}.type
        return gson.toJson(countryLang, type)
    }

    @TypeConverter
    fun todesignationList(countryLangString: String?): List<AppDropdown.DropdownData.designation>? {
        if (countryLangString == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<List<AppDropdown.DropdownData.designation?>?>() {}.type
        return gson.fromJson<List<AppDropdown.DropdownData.designation>>(countryLangString, type)
    }



//    @TypeConverter
//    fun fromSubCategoryList(countryLang: List<SubCategory?>?): String? {
//        if (countryLang == null) {
//            return null
//        }
//        val gson = Gson()
//        val type: Type = object : TypeToken<List<SubCategory?>?>() {}.type
//        return gson.toJson(countryLang, type)
//    }
//
//    @TypeConverter
//    fun todSubCategoryList(countryLangString: String?): List<SubCategory>? {
//        if (countryLangString == null) {
//            return null
//        }
//        val gson = Gson()
//        val type: Type = object : TypeToken<List<SubCategory?>?>() {}.type
//        return gson.fromJson<List<SubCategory>>(countryLangString, type)
//    }



    @TypeConverter
    fun fromIndicatorList(countryLang: List<Indicator?>?): String? {
        if (countryLang == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<List<Indicator?>?>() {}.type
        return gson.toJson(countryLang, type)
    }

    @TypeConverter
    fun todIndicatorList(countryLangString: String?): List<Indicator>? {
        if (countryLangString == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<List<Indicator?>?>() {}.type
        return gson.fromJson<List<Indicator>>(countryLangString, type)
    }



    @TypeConverter
    fun fromOptionList(countryLang: List<Option?>?): String? {
        if (countryLang == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<List<Option?>?>() {}.type
        return gson.toJson(countryLang, type)
    }

    @TypeConverter
    fun todOptionList(countryLangString: String?): List<Option>? {
        if (countryLangString == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<List<Option?>?>() {}.type
        return gson.fromJson<List<Option>>(countryLangString, type)
    }



    @TypeConverter
    fun fromattendanceList(countryLang: List<StaffModel?>?): String? {
        if (countryLang == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<List<StaffModel?>?>() {}.type
        return gson.toJson(countryLang, type)
    }

    @TypeConverter
    fun todattendanceList(countryLangString: String?): List<StaffModel>? {
        if (countryLangString == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<List<StaffModel?>?>() {}.type
        return gson.fromJson<List<StaffModel>>(countryLangString, type)
    }



    @TypeConverter
    fun fromindicatorslist(countryLang: List<IndicatorCategoryResponse?>?): String? {
        if (countryLang == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<List<IndicatorCategoryResponse?>?>() {}.type
        return gson.toJson(countryLang, type)
    }

    @TypeConverter
    fun toindicatorslist(countryLangString: String?): List<IndicatorCategoryResponse>? {
        if (countryLangString == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<List<IndicatorCategoryResponse?>?>() {}.type
        return gson.fromJson<List<IndicatorCategoryResponse>>(countryLangString, type)
    }



    @TypeConverter
    fun fromfeedback(countryLang: FeedbackSubmitModel?): String? {
        if (countryLang == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<FeedbackSubmitModel?>() {}.type
        return gson.toJson(countryLang, type)
    }

    @TypeConverter
    fun tofeedback(countryLangString: String?): FeedbackSubmitModel? {
        if (countryLangString == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<FeedbackSubmitModel?>() {}.type
        return gson.fromJson<FeedbackSubmitModel>(countryLangString, type)
    }



    @TypeConverter
    fun frominspector(countryLang: InspactorModel?): String? {
        if (countryLang == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<InspactorModel?>() {}.type
        return gson.toJson(countryLang, type)
    }

    @TypeConverter
    fun toinspector(countryLangString: String?): InspactorModel? {
        if (countryLangString == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<InspactorModel?>() {}.type
        return gson.fromJson<InspactorModel>(countryLangString, type)
    }



}