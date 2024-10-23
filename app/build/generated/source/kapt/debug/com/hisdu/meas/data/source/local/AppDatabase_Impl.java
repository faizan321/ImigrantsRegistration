package com.hisdu.meas.data.source.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.hisdu.meas.data.source.local.dao.DesignationDao;
import com.hisdu.meas.data.source.local.dao.DesignationDao_Impl;
import com.hisdu.meas.data.source.local.dao.HealthFacilityDao;
import com.hisdu.meas.data.source.local.dao.HealthFacilityDao_Impl;
import com.hisdu.meas.data.source.local.dao.HealthFacilityTypeDao;
import com.hisdu.meas.data.source.local.dao.HealthFacilityTypeDao_Impl;
import com.hisdu.meas.data.source.local.dao.ModulesDao;
import com.hisdu.meas.data.source.local.dao.ModulesDao_Impl;
import com.hisdu.meas.data.source.local.dao.PresenceStatusDao;
import com.hisdu.meas.data.source.local.dao.PresenceStatusDao_Impl;
import com.hisdu.meas.data.source.local.dao.RecipeDao;
import com.hisdu.meas.data.source.local.dao.RecipeDao_Impl;
import com.hisdu.meas.data.source.local.dao.ShiftsDao;
import com.hisdu.meas.data.source.local.dao.ShiftsDao_Impl;
import com.hisdu.meas.data.source.local.dao.SubmitFormDao;
import com.hisdu.meas.data.source.local.dao.SubmitFormDao_Impl;
import com.hisdu.meas.data.source.local.dao.UserDao;
import com.hisdu.meas.data.source.local.dao.UserDao_Impl;
import com.hisdu.meas.data.source.local.dao.UserVisitsDao;
import com.hisdu.meas.data.source.local.dao.UserVisitsDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile RecipeDao _recipeDao;

  private volatile UserDao _userDao;

  private volatile HealthFacilityDao _healthFacilityDao;

  private volatile HealthFacilityTypeDao _healthFacilityTypeDao;

  private volatile ShiftsDao _shiftsDao;

  private volatile ModulesDao _modulesDao;

  private volatile PresenceStatusDao _presenceStatusDao;

  private volatile DesignationDao _designationDao;

  private volatile SubmitFormDao _submitFormDao;

  private volatile UserVisitsDao _userVisitsDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Recipe` (`recipeId` TEXT NOT NULL, `title` TEXT, `image` TEXT, `instructions` TEXT, `tag` TEXT, PRIMARY KEY(`recipeId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `userModel` (`access_token` TEXT, `token_type` TEXT, `UserName` TEXT, `Id` TEXT NOT NULL, `HealthFacility` TEXT, `HFCode` TEXT, `role` TEXT, PRIMARY KEY(`Id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `HealthFacility` (`DivisionCode` TEXT, `DivisionName` TEXT, `DistrictCode` TEXT, `DistrictName` TEXT, `TehsilCode` TEXT, `TehsilName` TEXT, `HFMISCode` TEXT, `HealthFacilityName` TEXT, `ModeName` TEXT, `lvl` TEXT, `ZoneId` TEXT, `AmbulanceNo` TEXT, `id` INTEGER PRIMARY KEY AUTOINCREMENT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ApplicationType` (`applicationTypeId` INTEGER, `applicationTypeName` TEXT, PRIMARY KEY(`applicationTypeId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `HealthFacilityType` (`facilityTypeId` INTEGER, `faciltyTypeName` TEXT, `CategoryId` INTEGER, `ApplicationTypeIds` TEXT, PRIMARY KEY(`facilityTypeId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Module` (`applicationTypeId` INTEGER, `moduleId` INTEGER, `moduleName` TEXT, `IsRequired` INTEGER, PRIMARY KEY(`moduleId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Shift` (`shiftId` INTEGER, `shiftName` TEXT, `HFTypeId` TEXT, PRIMARY KEY(`shiftId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `PresanceStatus` (`ProfileId` INTEGER, `ProfileName` TEXT, PRIMARY KEY(`ProfileId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `designation` (`DesignationHFId` INTEGER, `DesignationId` INTEGER, `DesignationName` TEXT, `HFTypeId` TEXT, `ShiftId` TEXT, `SequenceNo` INTEGER, PRIMARY KEY(`DesignationHFId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Indicator` (`indicatorId` INTEGER, `ParentIndicatorId` INTEGER, `question` TEXT, `showInCase` INTEGER, `showRemarksInCase` INTEGER, `sequenceNo` INTEGER, `optionsType` TEXT, `selectedValue` TEXT NOT NULL, `remarkValue` TEXT NOT NULL, `options` TEXT, `CategoryId` INTEGER, `Shifts` TEXT, `HFTypes` TEXT, `HFs` TEXT, `InputType` TEXT, `DefaultValue` TEXT, `minvalue` INTEGER, `maxvalue` INTEGER, `IsOptionTotal` INTEGER, `IsOptionCalculation` INTEGER, `IsOptionEditable` INTEGER, `IsOptionTagged` INTEGER, `IsPhysicalView` INTEGER, `IsCalculation` INTEGER, `IsRequired` INTEGER, PRIMARY KEY(`indicatorId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `SubmitFormModel` (`HFMISCode` TEXT, `facilityType` TEXT, `visityType` TEXT, `visitId` INTEGER, `facility` TEXT, `facilityName` TEXT, `facilityStatus` INTEGER, `closeReason` TEXT, `comment` TEXT, `illegalOccupation` INTEGER, `wholeOrPart` TEXT, `date` TEXT, `moduleId` INTEGER, `applicationTypeid` INTEGER, `latitude` TEXT, `longitude` TEXT, `CreatedOn` TEXT, `isFeedbackSubmited` INTEGER, `attendanceList` TEXT NOT NULL, `listofModules` TEXT NOT NULL, `feedback` TEXT, `userid` INTEGER, `isSync` INTEGER, `incharge` TEXT, `id` INTEGER PRIMARY KEY AUTOINCREMENT, `visitTypeName` TEXT, `faciltyTypeName` TEXT, `AmbulanceNo` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `IndicatorCategory` (`caegoryId` INTEGER, `categoryName` TEXT, `applicationType` INTEGER, `moduleId` INTEGER, `SequenceNo` INTEGER, `IsRequired` INTEGER, PRIMARY KEY(`caegoryId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Zone` (`districtCode` TEXT, `divisionCode` TEXT, `tehsilCode` TEXT, `zoneId` INTEGER, `zoneName` TEXT, PRIMARY KEY(`zoneId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Visits` (`fullName` TEXT, `hFMISCode` TEXT, `healthFacilityName` TEXT, `hfId` INTEGER, `isRepeat` INTEGER, `isSpecial` INTEGER, `isVisited` INTEGER, `shiftId` INTEGER, `shiftName` TEXT, `userId` INTEGER, `username` TEXT, `visitedDate` TEXT, `ModeName` TEXT, `VisitId` INTEGER, PRIMARY KEY(`VisitId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9f756bf58171f14460b5939f00726f31')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Recipe`");
        _db.execSQL("DROP TABLE IF EXISTS `userModel`");
        _db.execSQL("DROP TABLE IF EXISTS `HealthFacility`");
        _db.execSQL("DROP TABLE IF EXISTS `ApplicationType`");
        _db.execSQL("DROP TABLE IF EXISTS `HealthFacilityType`");
        _db.execSQL("DROP TABLE IF EXISTS `Module`");
        _db.execSQL("DROP TABLE IF EXISTS `Shift`");
        _db.execSQL("DROP TABLE IF EXISTS `PresanceStatus`");
        _db.execSQL("DROP TABLE IF EXISTS `designation`");
        _db.execSQL("DROP TABLE IF EXISTS `Indicator`");
        _db.execSQL("DROP TABLE IF EXISTS `SubmitFormModel`");
        _db.execSQL("DROP TABLE IF EXISTS `IndicatorCategory`");
        _db.execSQL("DROP TABLE IF EXISTS `Zone`");
        _db.execSQL("DROP TABLE IF EXISTS `Visits`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsRecipe = new HashMap<String, TableInfo.Column>(5);
        _columnsRecipe.put("recipeId", new TableInfo.Column("recipeId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipe.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipe.put("image", new TableInfo.Column("image", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipe.put("instructions", new TableInfo.Column("instructions", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipe.put("tag", new TableInfo.Column("tag", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRecipe = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRecipe = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRecipe = new TableInfo("Recipe", _columnsRecipe, _foreignKeysRecipe, _indicesRecipe);
        final TableInfo _existingRecipe = TableInfo.read(_db, "Recipe");
        if (! _infoRecipe.equals(_existingRecipe)) {
          return new RoomOpenHelper.ValidationResult(false, "Recipe(com.hisdu.meas.data.model.Recipe).\n"
                  + " Expected:\n" + _infoRecipe + "\n"
                  + " Found:\n" + _existingRecipe);
        }
        final HashMap<String, TableInfo.Column> _columnsUserModel = new HashMap<String, TableInfo.Column>(7);
        _columnsUserModel.put("access_token", new TableInfo.Column("access_token", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserModel.put("token_type", new TableInfo.Column("token_type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserModel.put("UserName", new TableInfo.Column("UserName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserModel.put("Id", new TableInfo.Column("Id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserModel.put("HealthFacility", new TableInfo.Column("HealthFacility", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserModel.put("HFCode", new TableInfo.Column("HFCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserModel.put("role", new TableInfo.Column("role", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserModel = new TableInfo("userModel", _columnsUserModel, _foreignKeysUserModel, _indicesUserModel);
        final TableInfo _existingUserModel = TableInfo.read(_db, "userModel");
        if (! _infoUserModel.equals(_existingUserModel)) {
          return new RoomOpenHelper.ValidationResult(false, "userModel(com.zest.android.ui.login.UserModel).\n"
                  + " Expected:\n" + _infoUserModel + "\n"
                  + " Found:\n" + _existingUserModel);
        }
        final HashMap<String, TableInfo.Column> _columnsHealthFacility = new HashMap<String, TableInfo.Column>(13);
        _columnsHealthFacility.put("DivisionCode", new TableInfo.Column("DivisionCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthFacility.put("DivisionName", new TableInfo.Column("DivisionName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthFacility.put("DistrictCode", new TableInfo.Column("DistrictCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthFacility.put("DistrictName", new TableInfo.Column("DistrictName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthFacility.put("TehsilCode", new TableInfo.Column("TehsilCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthFacility.put("TehsilName", new TableInfo.Column("TehsilName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthFacility.put("HFMISCode", new TableInfo.Column("HFMISCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthFacility.put("HealthFacilityName", new TableInfo.Column("HealthFacilityName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthFacility.put("ModeName", new TableInfo.Column("ModeName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthFacility.put("lvl", new TableInfo.Column("lvl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthFacility.put("ZoneId", new TableInfo.Column("ZoneId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthFacility.put("AmbulanceNo", new TableInfo.Column("AmbulanceNo", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthFacility.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHealthFacility = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHealthFacility = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHealthFacility = new TableInfo("HealthFacility", _columnsHealthFacility, _foreignKeysHealthFacility, _indicesHealthFacility);
        final TableInfo _existingHealthFacility = TableInfo.read(_db, "HealthFacility");
        if (! _infoHealthFacility.equals(_existingHealthFacility)) {
          return new RoomOpenHelper.ValidationResult(false, "HealthFacility(com.zest.android.ui.login.HealthFacility.HealthFacilityModel).\n"
                  + " Expected:\n" + _infoHealthFacility + "\n"
                  + " Found:\n" + _existingHealthFacility);
        }
        final HashMap<String, TableInfo.Column> _columnsApplicationType = new HashMap<String, TableInfo.Column>(2);
        _columnsApplicationType.put("applicationTypeId", new TableInfo.Column("applicationTypeId", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsApplicationType.put("applicationTypeName", new TableInfo.Column("applicationTypeName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysApplicationType = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesApplicationType = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoApplicationType = new TableInfo("ApplicationType", _columnsApplicationType, _foreignKeysApplicationType, _indicesApplicationType);
        final TableInfo _existingApplicationType = TableInfo.read(_db, "ApplicationType");
        if (! _infoApplicationType.equals(_existingApplicationType)) {
          return new RoomOpenHelper.ValidationResult(false, "ApplicationType(com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.ApplicationType).\n"
                  + " Expected:\n" + _infoApplicationType + "\n"
                  + " Found:\n" + _existingApplicationType);
        }
        final HashMap<String, TableInfo.Column> _columnsHealthFacilityType = new HashMap<String, TableInfo.Column>(4);
        _columnsHealthFacilityType.put("facilityTypeId", new TableInfo.Column("facilityTypeId", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthFacilityType.put("faciltyTypeName", new TableInfo.Column("faciltyTypeName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthFacilityType.put("CategoryId", new TableInfo.Column("CategoryId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthFacilityType.put("ApplicationTypeIds", new TableInfo.Column("ApplicationTypeIds", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHealthFacilityType = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHealthFacilityType = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHealthFacilityType = new TableInfo("HealthFacilityType", _columnsHealthFacilityType, _foreignKeysHealthFacilityType, _indicesHealthFacilityType);
        final TableInfo _existingHealthFacilityType = TableInfo.read(_db, "HealthFacilityType");
        if (! _infoHealthFacilityType.equals(_existingHealthFacilityType)) {
          return new RoomOpenHelper.ValidationResult(false, "HealthFacilityType(com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.HealthFacilityType).\n"
                  + " Expected:\n" + _infoHealthFacilityType + "\n"
                  + " Found:\n" + _existingHealthFacilityType);
        }
        final HashMap<String, TableInfo.Column> _columnsModule = new HashMap<String, TableInfo.Column>(4);
        _columnsModule.put("applicationTypeId", new TableInfo.Column("applicationTypeId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsModule.put("moduleId", new TableInfo.Column("moduleId", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsModule.put("moduleName", new TableInfo.Column("moduleName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsModule.put("IsRequired", new TableInfo.Column("IsRequired", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysModule = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesModule = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoModule = new TableInfo("Module", _columnsModule, _foreignKeysModule, _indicesModule);
        final TableInfo _existingModule = TableInfo.read(_db, "Module");
        if (! _infoModule.equals(_existingModule)) {
          return new RoomOpenHelper.ValidationResult(false, "Module(com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Module).\n"
                  + " Expected:\n" + _infoModule + "\n"
                  + " Found:\n" + _existingModule);
        }
        final HashMap<String, TableInfo.Column> _columnsShift = new HashMap<String, TableInfo.Column>(3);
        _columnsShift.put("shiftId", new TableInfo.Column("shiftId", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsShift.put("shiftName", new TableInfo.Column("shiftName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsShift.put("HFTypeId", new TableInfo.Column("HFTypeId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysShift = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesShift = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoShift = new TableInfo("Shift", _columnsShift, _foreignKeysShift, _indicesShift);
        final TableInfo _existingShift = TableInfo.read(_db, "Shift");
        if (! _infoShift.equals(_existingShift)) {
          return new RoomOpenHelper.ValidationResult(false, "Shift(com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.Shift).\n"
                  + " Expected:\n" + _infoShift + "\n"
                  + " Found:\n" + _existingShift);
        }
        final HashMap<String, TableInfo.Column> _columnsPresanceStatus = new HashMap<String, TableInfo.Column>(2);
        _columnsPresanceStatus.put("ProfileId", new TableInfo.Column("ProfileId", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPresanceStatus.put("ProfileName", new TableInfo.Column("ProfileName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPresanceStatus = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPresanceStatus = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPresanceStatus = new TableInfo("PresanceStatus", _columnsPresanceStatus, _foreignKeysPresanceStatus, _indicesPresanceStatus);
        final TableInfo _existingPresanceStatus = TableInfo.read(_db, "PresanceStatus");
        if (! _infoPresanceStatus.equals(_existingPresanceStatus)) {
          return new RoomOpenHelper.ValidationResult(false, "PresanceStatus(com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.PresanceStatus).\n"
                  + " Expected:\n" + _infoPresanceStatus + "\n"
                  + " Found:\n" + _existingPresanceStatus);
        }
        final HashMap<String, TableInfo.Column> _columnsDesignation = new HashMap<String, TableInfo.Column>(6);
        _columnsDesignation.put("DesignationHFId", new TableInfo.Column("DesignationHFId", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDesignation.put("DesignationId", new TableInfo.Column("DesignationId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDesignation.put("DesignationName", new TableInfo.Column("DesignationName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDesignation.put("HFTypeId", new TableInfo.Column("HFTypeId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDesignation.put("ShiftId", new TableInfo.Column("ShiftId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDesignation.put("SequenceNo", new TableInfo.Column("SequenceNo", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDesignation = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDesignation = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDesignation = new TableInfo("designation", _columnsDesignation, _foreignKeysDesignation, _indicesDesignation);
        final TableInfo _existingDesignation = TableInfo.read(_db, "designation");
        if (! _infoDesignation.equals(_existingDesignation)) {
          return new RoomOpenHelper.ValidationResult(false, "designation(com.hisdu.meas.ui.Dashboard.AppDropdown.DropdownData.designation).\n"
                  + " Expected:\n" + _infoDesignation + "\n"
                  + " Found:\n" + _existingDesignation);
        }
        final HashMap<String, TableInfo.Column> _columnsIndicator = new HashMap<String, TableInfo.Column>(25);
        _columnsIndicator.put("indicatorId", new TableInfo.Column("indicatorId", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("ParentIndicatorId", new TableInfo.Column("ParentIndicatorId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("question", new TableInfo.Column("question", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("showInCase", new TableInfo.Column("showInCase", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("showRemarksInCase", new TableInfo.Column("showRemarksInCase", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("sequenceNo", new TableInfo.Column("sequenceNo", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("optionsType", new TableInfo.Column("optionsType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("selectedValue", new TableInfo.Column("selectedValue", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("remarkValue", new TableInfo.Column("remarkValue", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("options", new TableInfo.Column("options", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("CategoryId", new TableInfo.Column("CategoryId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("Shifts", new TableInfo.Column("Shifts", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("HFTypes", new TableInfo.Column("HFTypes", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("HFs", new TableInfo.Column("HFs", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("InputType", new TableInfo.Column("InputType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("DefaultValue", new TableInfo.Column("DefaultValue", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("minvalue", new TableInfo.Column("minvalue", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("maxvalue", new TableInfo.Column("maxvalue", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("IsOptionTotal", new TableInfo.Column("IsOptionTotal", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("IsOptionCalculation", new TableInfo.Column("IsOptionCalculation", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("IsOptionEditable", new TableInfo.Column("IsOptionEditable", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("IsOptionTagged", new TableInfo.Column("IsOptionTagged", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("IsPhysicalView", new TableInfo.Column("IsPhysicalView", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("IsCalculation", new TableInfo.Column("IsCalculation", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicator.put("IsRequired", new TableInfo.Column("IsRequired", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysIndicator = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesIndicator = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoIndicator = new TableInfo("Indicator", _columnsIndicator, _foreignKeysIndicator, _indicesIndicator);
        final TableInfo _existingIndicator = TableInfo.read(_db, "Indicator");
        if (! _infoIndicator.equals(_existingIndicator)) {
          return new RoomOpenHelper.ValidationResult(false, "Indicator(com.hisdu.meas.ui.Indicators.Indicator).\n"
                  + " Expected:\n" + _infoIndicator + "\n"
                  + " Found:\n" + _existingIndicator);
        }
        final HashMap<String, TableInfo.Column> _columnsSubmitFormModel = new HashMap<String, TableInfo.Column>(28);
        _columnsSubmitFormModel.put("HFMISCode", new TableInfo.Column("HFMISCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("facilityType", new TableInfo.Column("facilityType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("visityType", new TableInfo.Column("visityType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("visitId", new TableInfo.Column("visitId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("facility", new TableInfo.Column("facility", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("facilityName", new TableInfo.Column("facilityName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("facilityStatus", new TableInfo.Column("facilityStatus", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("closeReason", new TableInfo.Column("closeReason", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("comment", new TableInfo.Column("comment", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("illegalOccupation", new TableInfo.Column("illegalOccupation", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("wholeOrPart", new TableInfo.Column("wholeOrPart", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("date", new TableInfo.Column("date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("moduleId", new TableInfo.Column("moduleId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("applicationTypeid", new TableInfo.Column("applicationTypeid", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("latitude", new TableInfo.Column("latitude", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("longitude", new TableInfo.Column("longitude", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("CreatedOn", new TableInfo.Column("CreatedOn", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("isFeedbackSubmited", new TableInfo.Column("isFeedbackSubmited", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("attendanceList", new TableInfo.Column("attendanceList", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("listofModules", new TableInfo.Column("listofModules", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("feedback", new TableInfo.Column("feedback", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("userid", new TableInfo.Column("userid", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("isSync", new TableInfo.Column("isSync", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("incharge", new TableInfo.Column("incharge", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("visitTypeName", new TableInfo.Column("visitTypeName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("faciltyTypeName", new TableInfo.Column("faciltyTypeName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubmitFormModel.put("AmbulanceNo", new TableInfo.Column("AmbulanceNo", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSubmitFormModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSubmitFormModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSubmitFormModel = new TableInfo("SubmitFormModel", _columnsSubmitFormModel, _foreignKeysSubmitFormModel, _indicesSubmitFormModel);
        final TableInfo _existingSubmitFormModel = TableInfo.read(_db, "SubmitFormModel");
        if (! _infoSubmitFormModel.equals(_existingSubmitFormModel)) {
          return new RoomOpenHelper.ValidationResult(false, "SubmitFormModel(com.hisdu.meas.ui.Indicators.SubmitFormModel).\n"
                  + " Expected:\n" + _infoSubmitFormModel + "\n"
                  + " Found:\n" + _existingSubmitFormModel);
        }
        final HashMap<String, TableInfo.Column> _columnsIndicatorCategory = new HashMap<String, TableInfo.Column>(6);
        _columnsIndicatorCategory.put("caegoryId", new TableInfo.Column("caegoryId", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicatorCategory.put("categoryName", new TableInfo.Column("categoryName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicatorCategory.put("applicationType", new TableInfo.Column("applicationType", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicatorCategory.put("moduleId", new TableInfo.Column("moduleId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicatorCategory.put("SequenceNo", new TableInfo.Column("SequenceNo", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIndicatorCategory.put("IsRequired", new TableInfo.Column("IsRequired", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysIndicatorCategory = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesIndicatorCategory = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoIndicatorCategory = new TableInfo("IndicatorCategory", _columnsIndicatorCategory, _foreignKeysIndicatorCategory, _indicesIndicatorCategory);
        final TableInfo _existingIndicatorCategory = TableInfo.read(_db, "IndicatorCategory");
        if (! _infoIndicatorCategory.equals(_existingIndicatorCategory)) {
          return new RoomOpenHelper.ValidationResult(false, "IndicatorCategory(com.hisdu.meas.ui.Indicators.IndicatorCategory).\n"
                  + " Expected:\n" + _infoIndicatorCategory + "\n"
                  + " Found:\n" + _existingIndicatorCategory);
        }
        final HashMap<String, TableInfo.Column> _columnsZone = new HashMap<String, TableInfo.Column>(5);
        _columnsZone.put("districtCode", new TableInfo.Column("districtCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsZone.put("divisionCode", new TableInfo.Column("divisionCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsZone.put("tehsilCode", new TableInfo.Column("tehsilCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsZone.put("zoneId", new TableInfo.Column("zoneId", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsZone.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysZone = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesZone = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoZone = new TableInfo("Zone", _columnsZone, _foreignKeysZone, _indicesZone);
        final TableInfo _existingZone = TableInfo.read(_db, "Zone");
        if (! _infoZone.equals(_existingZone)) {
          return new RoomOpenHelper.ValidationResult(false, "Zone(com.hisdu.meas.ui.Indicators.ZoneModel.Zone).\n"
                  + " Expected:\n" + _infoZone + "\n"
                  + " Found:\n" + _existingZone);
        }
        final HashMap<String, TableInfo.Column> _columnsVisits = new HashMap<String, TableInfo.Column>(14);
        _columnsVisits.put("fullName", new TableInfo.Column("fullName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVisits.put("hFMISCode", new TableInfo.Column("hFMISCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVisits.put("healthFacilityName", new TableInfo.Column("healthFacilityName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVisits.put("hfId", new TableInfo.Column("hfId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVisits.put("isRepeat", new TableInfo.Column("isRepeat", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVisits.put("isSpecial", new TableInfo.Column("isSpecial", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVisits.put("isVisited", new TableInfo.Column("isVisited", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVisits.put("shiftId", new TableInfo.Column("shiftId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVisits.put("shiftName", new TableInfo.Column("shiftName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVisits.put("userId", new TableInfo.Column("userId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVisits.put("username", new TableInfo.Column("username", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVisits.put("visitedDate", new TableInfo.Column("visitedDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVisits.put("ModeName", new TableInfo.Column("ModeName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVisits.put("VisitId", new TableInfo.Column("VisitId", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysVisits = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesVisits = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoVisits = new TableInfo("Visits", _columnsVisits, _foreignKeysVisits, _indicesVisits);
        final TableInfo _existingVisits = TableInfo.read(_db, "Visits");
        if (! _infoVisits.equals(_existingVisits)) {
          return new RoomOpenHelper.ValidationResult(false, "Visits(com.hisdu.meas.ui.Visits.Visits).\n"
                  + " Expected:\n" + _infoVisits + "\n"
                  + " Found:\n" + _existingVisits);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "9f756bf58171f14460b5939f00726f31", "50e347ddf4586c4ec872bb284ad16d3a");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Recipe","userModel","HealthFacility","ApplicationType","HealthFacilityType","Module","Shift","PresanceStatus","designation","Indicator","SubmitFormModel","IndicatorCategory","Zone","Visits");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Recipe`");
      _db.execSQL("DELETE FROM `userModel`");
      _db.execSQL("DELETE FROM `HealthFacility`");
      _db.execSQL("DELETE FROM `ApplicationType`");
      _db.execSQL("DELETE FROM `HealthFacilityType`");
      _db.execSQL("DELETE FROM `Module`");
      _db.execSQL("DELETE FROM `Shift`");
      _db.execSQL("DELETE FROM `PresanceStatus`");
      _db.execSQL("DELETE FROM `designation`");
      _db.execSQL("DELETE FROM `Indicator`");
      _db.execSQL("DELETE FROM `SubmitFormModel`");
      _db.execSQL("DELETE FROM `IndicatorCategory`");
      _db.execSQL("DELETE FROM `Zone`");
      _db.execSQL("DELETE FROM `Visits`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(RecipeDao.class, RecipeDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(UserDao.class, UserDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(HealthFacilityDao.class, HealthFacilityDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(HealthFacilityTypeDao.class, HealthFacilityTypeDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ShiftsDao.class, ShiftsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ModulesDao.class, ModulesDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(PresenceStatusDao.class, PresenceStatusDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(DesignationDao.class, DesignationDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(SubmitFormDao.class, SubmitFormDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(UserVisitsDao.class, UserVisitsDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public RecipeDao getRecipeDao() {
    if (_recipeDao != null) {
      return _recipeDao;
    } else {
      synchronized(this) {
        if(_recipeDao == null) {
          _recipeDao = new RecipeDao_Impl(this);
        }
        return _recipeDao;
      }
    }
  }

  @Override
  public UserDao getUserDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }

  @Override
  public HealthFacilityDao getHealthFacilityDao() {
    if (_healthFacilityDao != null) {
      return _healthFacilityDao;
    } else {
      synchronized(this) {
        if(_healthFacilityDao == null) {
          _healthFacilityDao = new HealthFacilityDao_Impl(this);
        }
        return _healthFacilityDao;
      }
    }
  }

  @Override
  public HealthFacilityTypeDao getHealthFacilityTypeDao() {
    if (_healthFacilityTypeDao != null) {
      return _healthFacilityTypeDao;
    } else {
      synchronized(this) {
        if(_healthFacilityTypeDao == null) {
          _healthFacilityTypeDao = new HealthFacilityTypeDao_Impl(this);
        }
        return _healthFacilityTypeDao;
      }
    }
  }

  @Override
  public ShiftsDao getShiftsDao() {
    if (_shiftsDao != null) {
      return _shiftsDao;
    } else {
      synchronized(this) {
        if(_shiftsDao == null) {
          _shiftsDao = new ShiftsDao_Impl(this);
        }
        return _shiftsDao;
      }
    }
  }

  @Override
  public ModulesDao getModulesDao() {
    if (_modulesDao != null) {
      return _modulesDao;
    } else {
      synchronized(this) {
        if(_modulesDao == null) {
          _modulesDao = new ModulesDao_Impl(this);
        }
        return _modulesDao;
      }
    }
  }

  @Override
  public PresenceStatusDao getPresenceStatusDao() {
    if (_presenceStatusDao != null) {
      return _presenceStatusDao;
    } else {
      synchronized(this) {
        if(_presenceStatusDao == null) {
          _presenceStatusDao = new PresenceStatusDao_Impl(this);
        }
        return _presenceStatusDao;
      }
    }
  }

  @Override
  public DesignationDao getDesignationDao() {
    if (_designationDao != null) {
      return _designationDao;
    } else {
      synchronized(this) {
        if(_designationDao == null) {
          _designationDao = new DesignationDao_Impl(this);
        }
        return _designationDao;
      }
    }
  }

  @Override
  public SubmitFormDao getSubmitFormDao() {
    if (_submitFormDao != null) {
      return _submitFormDao;
    } else {
      synchronized(this) {
        if(_submitFormDao == null) {
          _submitFormDao = new SubmitFormDao_Impl(this);
        }
        return _submitFormDao;
      }
    }
  }

  @Override
  public UserVisitsDao getUserVisitsDao() {
    if (_userVisitsDao != null) {
      return _userVisitsDao;
    } else {
      synchronized(this) {
        if(_userVisitsDao == null) {
          _userVisitsDao = new UserVisitsDao_Impl(this);
        }
        return _userVisitsDao;
      }
    }
  }
}
