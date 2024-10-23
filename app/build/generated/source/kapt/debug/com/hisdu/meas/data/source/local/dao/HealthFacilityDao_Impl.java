package com.hisdu.meas.data.source.local.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.zest.android.ui.login.HealthFacility;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class HealthFacilityDao_Impl implements HealthFacilityDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<HealthFacility.HealthFacilityModel> __insertionAdapterOfHealthFacilityModel;

  private final EntityDeletionOrUpdateAdapter<HealthFacility.HealthFacilityModel> __deletionAdapterOfHealthFacilityModel;

  private final EntityDeletionOrUpdateAdapter<HealthFacility.HealthFacilityModel> __updateAdapterOfHealthFacilityModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllData;

  public HealthFacilityDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHealthFacilityModel = new EntityInsertionAdapter<HealthFacility.HealthFacilityModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `HealthFacility` (`DivisionCode`,`DivisionName`,`DistrictCode`,`DistrictName`,`TehsilCode`,`TehsilName`,`HFMISCode`,`HealthFacilityName`,`ModeName`,`lvl`,`ZoneId`,`AmbulanceNo`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HealthFacility.HealthFacilityModel value) {
        if (value.getDivisionCode() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getDivisionCode());
        }
        if (value.getDivisionName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDivisionName());
        }
        if (value.getDistrictCode() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDistrictCode());
        }
        if (value.getDistrictName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDistrictName());
        }
        if (value.getTehsilCode() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTehsilCode());
        }
        if (value.getTehsilName() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTehsilName());
        }
        if (value.getHFMISCode() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getHFMISCode());
        }
        if (value.getHealthFacilityName() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getHealthFacilityName());
        }
        if (value.getModeName() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getModeName());
        }
        if (value.getLvl() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getLvl());
        }
        if (value.getZoneId() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getZoneId());
        }
        if (value.getAmbulanceNo() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getAmbulanceNo());
        }
        if (value.getId() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindLong(13, value.getId());
        }
      }
    };
    this.__deletionAdapterOfHealthFacilityModel = new EntityDeletionOrUpdateAdapter<HealthFacility.HealthFacilityModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `HealthFacility` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HealthFacility.HealthFacilityModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfHealthFacilityModel = new EntityDeletionOrUpdateAdapter<HealthFacility.HealthFacilityModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `HealthFacility` SET `DivisionCode` = ?,`DivisionName` = ?,`DistrictCode` = ?,`DistrictName` = ?,`TehsilCode` = ?,`TehsilName` = ?,`HFMISCode` = ?,`HealthFacilityName` = ?,`ModeName` = ?,`lvl` = ?,`ZoneId` = ?,`AmbulanceNo` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HealthFacility.HealthFacilityModel value) {
        if (value.getDivisionCode() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getDivisionCode());
        }
        if (value.getDivisionName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDivisionName());
        }
        if (value.getDistrictCode() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDistrictCode());
        }
        if (value.getDistrictName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDistrictName());
        }
        if (value.getTehsilCode() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTehsilCode());
        }
        if (value.getTehsilName() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTehsilName());
        }
        if (value.getHFMISCode() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getHFMISCode());
        }
        if (value.getHealthFacilityName() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getHealthFacilityName());
        }
        if (value.getModeName() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getModeName());
        }
        if (value.getLvl() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getLvl());
        }
        if (value.getZoneId() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getZoneId());
        }
        if (value.getAmbulanceNo() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getAmbulanceNo());
        }
        if (value.getId() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindLong(13, value.getId());
        }
        if (value.getId() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAllData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM healthfacility";
        return _query;
      }
    };
  }

  @Override
  public void insert(final HealthFacility.HealthFacilityModel facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHealthFacilityModel.insert(facility);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(final List<HealthFacility.HealthFacilityModel> facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHealthFacilityModel.insert(facility);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final HealthFacility.HealthFacilityModel facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfHealthFacilityModel.handle(facility);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final HealthFacility.HealthFacilityModel facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfHealthFacilityModel.handle(facility);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllData() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllData.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllData.release(_stmt);
    }
  }

  @Override
  public List<HealthFacility.HealthFacilityModel> loadAll() {
    final String _sql = "SELECT * FROM healthfacility";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfDivisionCode = CursorUtil.getColumnIndexOrThrow(_cursor, "DivisionCode");
      final int _cursorIndexOfDivisionName = CursorUtil.getColumnIndexOrThrow(_cursor, "DivisionName");
      final int _cursorIndexOfDistrictCode = CursorUtil.getColumnIndexOrThrow(_cursor, "DistrictCode");
      final int _cursorIndexOfDistrictName = CursorUtil.getColumnIndexOrThrow(_cursor, "DistrictName");
      final int _cursorIndexOfTehsilCode = CursorUtil.getColumnIndexOrThrow(_cursor, "TehsilCode");
      final int _cursorIndexOfTehsilName = CursorUtil.getColumnIndexOrThrow(_cursor, "TehsilName");
      final int _cursorIndexOfHFMISCode = CursorUtil.getColumnIndexOrThrow(_cursor, "HFMISCode");
      final int _cursorIndexOfHealthFacilityName = CursorUtil.getColumnIndexOrThrow(_cursor, "HealthFacilityName");
      final int _cursorIndexOfModeName = CursorUtil.getColumnIndexOrThrow(_cursor, "ModeName");
      final int _cursorIndexOfLvl = CursorUtil.getColumnIndexOrThrow(_cursor, "lvl");
      final int _cursorIndexOfZoneId = CursorUtil.getColumnIndexOrThrow(_cursor, "ZoneId");
      final int _cursorIndexOfAmbulanceNo = CursorUtil.getColumnIndexOrThrow(_cursor, "AmbulanceNo");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final List<HealthFacility.HealthFacilityModel> _result = new ArrayList<HealthFacility.HealthFacilityModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final HealthFacility.HealthFacilityModel _item;
        final String _tmpDivisionCode;
        if (_cursor.isNull(_cursorIndexOfDivisionCode)) {
          _tmpDivisionCode = null;
        } else {
          _tmpDivisionCode = _cursor.getString(_cursorIndexOfDivisionCode);
        }
        final String _tmpDivisionName;
        if (_cursor.isNull(_cursorIndexOfDivisionName)) {
          _tmpDivisionName = null;
        } else {
          _tmpDivisionName = _cursor.getString(_cursorIndexOfDivisionName);
        }
        final String _tmpDistrictCode;
        if (_cursor.isNull(_cursorIndexOfDistrictCode)) {
          _tmpDistrictCode = null;
        } else {
          _tmpDistrictCode = _cursor.getString(_cursorIndexOfDistrictCode);
        }
        final String _tmpDistrictName;
        if (_cursor.isNull(_cursorIndexOfDistrictName)) {
          _tmpDistrictName = null;
        } else {
          _tmpDistrictName = _cursor.getString(_cursorIndexOfDistrictName);
        }
        final String _tmpTehsilCode;
        if (_cursor.isNull(_cursorIndexOfTehsilCode)) {
          _tmpTehsilCode = null;
        } else {
          _tmpTehsilCode = _cursor.getString(_cursorIndexOfTehsilCode);
        }
        final String _tmpTehsilName;
        if (_cursor.isNull(_cursorIndexOfTehsilName)) {
          _tmpTehsilName = null;
        } else {
          _tmpTehsilName = _cursor.getString(_cursorIndexOfTehsilName);
        }
        final String _tmpHFMISCode;
        if (_cursor.isNull(_cursorIndexOfHFMISCode)) {
          _tmpHFMISCode = null;
        } else {
          _tmpHFMISCode = _cursor.getString(_cursorIndexOfHFMISCode);
        }
        final String _tmpHealthFacilityName;
        if (_cursor.isNull(_cursorIndexOfHealthFacilityName)) {
          _tmpHealthFacilityName = null;
        } else {
          _tmpHealthFacilityName = _cursor.getString(_cursorIndexOfHealthFacilityName);
        }
        final String _tmpModeName;
        if (_cursor.isNull(_cursorIndexOfModeName)) {
          _tmpModeName = null;
        } else {
          _tmpModeName = _cursor.getString(_cursorIndexOfModeName);
        }
        final String _tmpLvl;
        if (_cursor.isNull(_cursorIndexOfLvl)) {
          _tmpLvl = null;
        } else {
          _tmpLvl = _cursor.getString(_cursorIndexOfLvl);
        }
        final String _tmpZoneId;
        if (_cursor.isNull(_cursorIndexOfZoneId)) {
          _tmpZoneId = null;
        } else {
          _tmpZoneId = _cursor.getString(_cursorIndexOfZoneId);
        }
        final String _tmpAmbulanceNo;
        if (_cursor.isNull(_cursorIndexOfAmbulanceNo)) {
          _tmpAmbulanceNo = null;
        } else {
          _tmpAmbulanceNo = _cursor.getString(_cursorIndexOfAmbulanceNo);
        }
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _item = new HealthFacility.HealthFacilityModel(_tmpDivisionCode,_tmpDivisionName,_tmpDistrictCode,_tmpDistrictName,_tmpTehsilCode,_tmpTehsilName,_tmpHFMISCode,_tmpHealthFacilityName,_tmpModeName,_tmpLvl,_tmpZoneId,_tmpAmbulanceNo,_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<HealthFacility.HealthFacilityModel> loadByZoneId(final int zonedId,
      final String modename) {
    final String _sql = "SELECT * FROM healthfacility where ZoneId = ? and ModeName=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, zonedId);
    _argIndex = 2;
    if (modename == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, modename);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfDivisionCode = CursorUtil.getColumnIndexOrThrow(_cursor, "DivisionCode");
      final int _cursorIndexOfDivisionName = CursorUtil.getColumnIndexOrThrow(_cursor, "DivisionName");
      final int _cursorIndexOfDistrictCode = CursorUtil.getColumnIndexOrThrow(_cursor, "DistrictCode");
      final int _cursorIndexOfDistrictName = CursorUtil.getColumnIndexOrThrow(_cursor, "DistrictName");
      final int _cursorIndexOfTehsilCode = CursorUtil.getColumnIndexOrThrow(_cursor, "TehsilCode");
      final int _cursorIndexOfTehsilName = CursorUtil.getColumnIndexOrThrow(_cursor, "TehsilName");
      final int _cursorIndexOfHFMISCode = CursorUtil.getColumnIndexOrThrow(_cursor, "HFMISCode");
      final int _cursorIndexOfHealthFacilityName = CursorUtil.getColumnIndexOrThrow(_cursor, "HealthFacilityName");
      final int _cursorIndexOfModeName = CursorUtil.getColumnIndexOrThrow(_cursor, "ModeName");
      final int _cursorIndexOfLvl = CursorUtil.getColumnIndexOrThrow(_cursor, "lvl");
      final int _cursorIndexOfZoneId = CursorUtil.getColumnIndexOrThrow(_cursor, "ZoneId");
      final int _cursorIndexOfAmbulanceNo = CursorUtil.getColumnIndexOrThrow(_cursor, "AmbulanceNo");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final List<HealthFacility.HealthFacilityModel> _result = new ArrayList<HealthFacility.HealthFacilityModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final HealthFacility.HealthFacilityModel _item;
        final String _tmpDivisionCode;
        if (_cursor.isNull(_cursorIndexOfDivisionCode)) {
          _tmpDivisionCode = null;
        } else {
          _tmpDivisionCode = _cursor.getString(_cursorIndexOfDivisionCode);
        }
        final String _tmpDivisionName;
        if (_cursor.isNull(_cursorIndexOfDivisionName)) {
          _tmpDivisionName = null;
        } else {
          _tmpDivisionName = _cursor.getString(_cursorIndexOfDivisionName);
        }
        final String _tmpDistrictCode;
        if (_cursor.isNull(_cursorIndexOfDistrictCode)) {
          _tmpDistrictCode = null;
        } else {
          _tmpDistrictCode = _cursor.getString(_cursorIndexOfDistrictCode);
        }
        final String _tmpDistrictName;
        if (_cursor.isNull(_cursorIndexOfDistrictName)) {
          _tmpDistrictName = null;
        } else {
          _tmpDistrictName = _cursor.getString(_cursorIndexOfDistrictName);
        }
        final String _tmpTehsilCode;
        if (_cursor.isNull(_cursorIndexOfTehsilCode)) {
          _tmpTehsilCode = null;
        } else {
          _tmpTehsilCode = _cursor.getString(_cursorIndexOfTehsilCode);
        }
        final String _tmpTehsilName;
        if (_cursor.isNull(_cursorIndexOfTehsilName)) {
          _tmpTehsilName = null;
        } else {
          _tmpTehsilName = _cursor.getString(_cursorIndexOfTehsilName);
        }
        final String _tmpHFMISCode;
        if (_cursor.isNull(_cursorIndexOfHFMISCode)) {
          _tmpHFMISCode = null;
        } else {
          _tmpHFMISCode = _cursor.getString(_cursorIndexOfHFMISCode);
        }
        final String _tmpHealthFacilityName;
        if (_cursor.isNull(_cursorIndexOfHealthFacilityName)) {
          _tmpHealthFacilityName = null;
        } else {
          _tmpHealthFacilityName = _cursor.getString(_cursorIndexOfHealthFacilityName);
        }
        final String _tmpModeName;
        if (_cursor.isNull(_cursorIndexOfModeName)) {
          _tmpModeName = null;
        } else {
          _tmpModeName = _cursor.getString(_cursorIndexOfModeName);
        }
        final String _tmpLvl;
        if (_cursor.isNull(_cursorIndexOfLvl)) {
          _tmpLvl = null;
        } else {
          _tmpLvl = _cursor.getString(_cursorIndexOfLvl);
        }
        final String _tmpZoneId;
        if (_cursor.isNull(_cursorIndexOfZoneId)) {
          _tmpZoneId = null;
        } else {
          _tmpZoneId = _cursor.getString(_cursorIndexOfZoneId);
        }
        final String _tmpAmbulanceNo;
        if (_cursor.isNull(_cursorIndexOfAmbulanceNo)) {
          _tmpAmbulanceNo = null;
        } else {
          _tmpAmbulanceNo = _cursor.getString(_cursorIndexOfAmbulanceNo);
        }
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _item = new HealthFacility.HealthFacilityModel(_tmpDivisionCode,_tmpDivisionName,_tmpDistrictCode,_tmpDistrictName,_tmpTehsilCode,_tmpTehsilName,_tmpHFMISCode,_tmpHealthFacilityName,_tmpModeName,_tmpLvl,_tmpZoneId,_tmpAmbulanceNo,_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<HealthFacility.HealthFacilityModel> loadByLocation(final String locationCode,
      final String modename) {
    final String _sql = "SELECT * FROM healthfacility where  HFMISCode LIKE '%' || ? || '%' and ModeName=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (locationCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, locationCode);
    }
    _argIndex = 2;
    if (modename == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, modename);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfDivisionCode = CursorUtil.getColumnIndexOrThrow(_cursor, "DivisionCode");
      final int _cursorIndexOfDivisionName = CursorUtil.getColumnIndexOrThrow(_cursor, "DivisionName");
      final int _cursorIndexOfDistrictCode = CursorUtil.getColumnIndexOrThrow(_cursor, "DistrictCode");
      final int _cursorIndexOfDistrictName = CursorUtil.getColumnIndexOrThrow(_cursor, "DistrictName");
      final int _cursorIndexOfTehsilCode = CursorUtil.getColumnIndexOrThrow(_cursor, "TehsilCode");
      final int _cursorIndexOfTehsilName = CursorUtil.getColumnIndexOrThrow(_cursor, "TehsilName");
      final int _cursorIndexOfHFMISCode = CursorUtil.getColumnIndexOrThrow(_cursor, "HFMISCode");
      final int _cursorIndexOfHealthFacilityName = CursorUtil.getColumnIndexOrThrow(_cursor, "HealthFacilityName");
      final int _cursorIndexOfModeName = CursorUtil.getColumnIndexOrThrow(_cursor, "ModeName");
      final int _cursorIndexOfLvl = CursorUtil.getColumnIndexOrThrow(_cursor, "lvl");
      final int _cursorIndexOfZoneId = CursorUtil.getColumnIndexOrThrow(_cursor, "ZoneId");
      final int _cursorIndexOfAmbulanceNo = CursorUtil.getColumnIndexOrThrow(_cursor, "AmbulanceNo");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final List<HealthFacility.HealthFacilityModel> _result = new ArrayList<HealthFacility.HealthFacilityModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final HealthFacility.HealthFacilityModel _item;
        final String _tmpDivisionCode;
        if (_cursor.isNull(_cursorIndexOfDivisionCode)) {
          _tmpDivisionCode = null;
        } else {
          _tmpDivisionCode = _cursor.getString(_cursorIndexOfDivisionCode);
        }
        final String _tmpDivisionName;
        if (_cursor.isNull(_cursorIndexOfDivisionName)) {
          _tmpDivisionName = null;
        } else {
          _tmpDivisionName = _cursor.getString(_cursorIndexOfDivisionName);
        }
        final String _tmpDistrictCode;
        if (_cursor.isNull(_cursorIndexOfDistrictCode)) {
          _tmpDistrictCode = null;
        } else {
          _tmpDistrictCode = _cursor.getString(_cursorIndexOfDistrictCode);
        }
        final String _tmpDistrictName;
        if (_cursor.isNull(_cursorIndexOfDistrictName)) {
          _tmpDistrictName = null;
        } else {
          _tmpDistrictName = _cursor.getString(_cursorIndexOfDistrictName);
        }
        final String _tmpTehsilCode;
        if (_cursor.isNull(_cursorIndexOfTehsilCode)) {
          _tmpTehsilCode = null;
        } else {
          _tmpTehsilCode = _cursor.getString(_cursorIndexOfTehsilCode);
        }
        final String _tmpTehsilName;
        if (_cursor.isNull(_cursorIndexOfTehsilName)) {
          _tmpTehsilName = null;
        } else {
          _tmpTehsilName = _cursor.getString(_cursorIndexOfTehsilName);
        }
        final String _tmpHFMISCode;
        if (_cursor.isNull(_cursorIndexOfHFMISCode)) {
          _tmpHFMISCode = null;
        } else {
          _tmpHFMISCode = _cursor.getString(_cursorIndexOfHFMISCode);
        }
        final String _tmpHealthFacilityName;
        if (_cursor.isNull(_cursorIndexOfHealthFacilityName)) {
          _tmpHealthFacilityName = null;
        } else {
          _tmpHealthFacilityName = _cursor.getString(_cursorIndexOfHealthFacilityName);
        }
        final String _tmpModeName;
        if (_cursor.isNull(_cursorIndexOfModeName)) {
          _tmpModeName = null;
        } else {
          _tmpModeName = _cursor.getString(_cursorIndexOfModeName);
        }
        final String _tmpLvl;
        if (_cursor.isNull(_cursorIndexOfLvl)) {
          _tmpLvl = null;
        } else {
          _tmpLvl = _cursor.getString(_cursorIndexOfLvl);
        }
        final String _tmpZoneId;
        if (_cursor.isNull(_cursorIndexOfZoneId)) {
          _tmpZoneId = null;
        } else {
          _tmpZoneId = _cursor.getString(_cursorIndexOfZoneId);
        }
        final String _tmpAmbulanceNo;
        if (_cursor.isNull(_cursorIndexOfAmbulanceNo)) {
          _tmpAmbulanceNo = null;
        } else {
          _tmpAmbulanceNo = _cursor.getString(_cursorIndexOfAmbulanceNo);
        }
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _item = new HealthFacility.HealthFacilityModel(_tmpDivisionCode,_tmpDivisionName,_tmpDistrictCode,_tmpDistrictName,_tmpTehsilCode,_tmpTehsilName,_tmpHFMISCode,_tmpHealthFacilityName,_tmpModeName,_tmpLvl,_tmpZoneId,_tmpAmbulanceNo,_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<HealthFacility.HealthFacilityModel> loadByTehsilId(final String districtCode) {
    final String _sql = "SELECT * FROM healthfacility where districtCode = ? AND lvl= 'Tehsil'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (districtCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, districtCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfDivisionCode = CursorUtil.getColumnIndexOrThrow(_cursor, "DivisionCode");
      final int _cursorIndexOfDivisionName = CursorUtil.getColumnIndexOrThrow(_cursor, "DivisionName");
      final int _cursorIndexOfDistrictCode = CursorUtil.getColumnIndexOrThrow(_cursor, "DistrictCode");
      final int _cursorIndexOfDistrictName = CursorUtil.getColumnIndexOrThrow(_cursor, "DistrictName");
      final int _cursorIndexOfTehsilCode = CursorUtil.getColumnIndexOrThrow(_cursor, "TehsilCode");
      final int _cursorIndexOfTehsilName = CursorUtil.getColumnIndexOrThrow(_cursor, "TehsilName");
      final int _cursorIndexOfHFMISCode = CursorUtil.getColumnIndexOrThrow(_cursor, "HFMISCode");
      final int _cursorIndexOfHealthFacilityName = CursorUtil.getColumnIndexOrThrow(_cursor, "HealthFacilityName");
      final int _cursorIndexOfModeName = CursorUtil.getColumnIndexOrThrow(_cursor, "ModeName");
      final int _cursorIndexOfLvl = CursorUtil.getColumnIndexOrThrow(_cursor, "lvl");
      final int _cursorIndexOfZoneId = CursorUtil.getColumnIndexOrThrow(_cursor, "ZoneId");
      final int _cursorIndexOfAmbulanceNo = CursorUtil.getColumnIndexOrThrow(_cursor, "AmbulanceNo");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final List<HealthFacility.HealthFacilityModel> _result = new ArrayList<HealthFacility.HealthFacilityModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final HealthFacility.HealthFacilityModel _item;
        final String _tmpDivisionCode;
        if (_cursor.isNull(_cursorIndexOfDivisionCode)) {
          _tmpDivisionCode = null;
        } else {
          _tmpDivisionCode = _cursor.getString(_cursorIndexOfDivisionCode);
        }
        final String _tmpDivisionName;
        if (_cursor.isNull(_cursorIndexOfDivisionName)) {
          _tmpDivisionName = null;
        } else {
          _tmpDivisionName = _cursor.getString(_cursorIndexOfDivisionName);
        }
        final String _tmpDistrictCode;
        if (_cursor.isNull(_cursorIndexOfDistrictCode)) {
          _tmpDistrictCode = null;
        } else {
          _tmpDistrictCode = _cursor.getString(_cursorIndexOfDistrictCode);
        }
        final String _tmpDistrictName;
        if (_cursor.isNull(_cursorIndexOfDistrictName)) {
          _tmpDistrictName = null;
        } else {
          _tmpDistrictName = _cursor.getString(_cursorIndexOfDistrictName);
        }
        final String _tmpTehsilCode;
        if (_cursor.isNull(_cursorIndexOfTehsilCode)) {
          _tmpTehsilCode = null;
        } else {
          _tmpTehsilCode = _cursor.getString(_cursorIndexOfTehsilCode);
        }
        final String _tmpTehsilName;
        if (_cursor.isNull(_cursorIndexOfTehsilName)) {
          _tmpTehsilName = null;
        } else {
          _tmpTehsilName = _cursor.getString(_cursorIndexOfTehsilName);
        }
        final String _tmpHFMISCode;
        if (_cursor.isNull(_cursorIndexOfHFMISCode)) {
          _tmpHFMISCode = null;
        } else {
          _tmpHFMISCode = _cursor.getString(_cursorIndexOfHFMISCode);
        }
        final String _tmpHealthFacilityName;
        if (_cursor.isNull(_cursorIndexOfHealthFacilityName)) {
          _tmpHealthFacilityName = null;
        } else {
          _tmpHealthFacilityName = _cursor.getString(_cursorIndexOfHealthFacilityName);
        }
        final String _tmpModeName;
        if (_cursor.isNull(_cursorIndexOfModeName)) {
          _tmpModeName = null;
        } else {
          _tmpModeName = _cursor.getString(_cursorIndexOfModeName);
        }
        final String _tmpLvl;
        if (_cursor.isNull(_cursorIndexOfLvl)) {
          _tmpLvl = null;
        } else {
          _tmpLvl = _cursor.getString(_cursorIndexOfLvl);
        }
        final String _tmpZoneId;
        if (_cursor.isNull(_cursorIndexOfZoneId)) {
          _tmpZoneId = null;
        } else {
          _tmpZoneId = _cursor.getString(_cursorIndexOfZoneId);
        }
        final String _tmpAmbulanceNo;
        if (_cursor.isNull(_cursorIndexOfAmbulanceNo)) {
          _tmpAmbulanceNo = null;
        } else {
          _tmpAmbulanceNo = _cursor.getString(_cursorIndexOfAmbulanceNo);
        }
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _item = new HealthFacility.HealthFacilityModel(_tmpDivisionCode,_tmpDivisionName,_tmpDistrictCode,_tmpDistrictName,_tmpTehsilCode,_tmpTehsilName,_tmpHFMISCode,_tmpHealthFacilityName,_tmpModeName,_tmpLvl,_tmpZoneId,_tmpAmbulanceNo,_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<HealthFacility.HealthFacilityModel> loadByDistrictBycode(final String DivisionCode) {
    final String _sql = "SELECT * FROM healthfacility where divisionCode LIKE '%' || ? || '%' AND lvl= 'District'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (DivisionCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, DivisionCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfDivisionCode = CursorUtil.getColumnIndexOrThrow(_cursor, "DivisionCode");
      final int _cursorIndexOfDivisionName = CursorUtil.getColumnIndexOrThrow(_cursor, "DivisionName");
      final int _cursorIndexOfDistrictCode = CursorUtil.getColumnIndexOrThrow(_cursor, "DistrictCode");
      final int _cursorIndexOfDistrictName = CursorUtil.getColumnIndexOrThrow(_cursor, "DistrictName");
      final int _cursorIndexOfTehsilCode = CursorUtil.getColumnIndexOrThrow(_cursor, "TehsilCode");
      final int _cursorIndexOfTehsilName = CursorUtil.getColumnIndexOrThrow(_cursor, "TehsilName");
      final int _cursorIndexOfHFMISCode = CursorUtil.getColumnIndexOrThrow(_cursor, "HFMISCode");
      final int _cursorIndexOfHealthFacilityName = CursorUtil.getColumnIndexOrThrow(_cursor, "HealthFacilityName");
      final int _cursorIndexOfModeName = CursorUtil.getColumnIndexOrThrow(_cursor, "ModeName");
      final int _cursorIndexOfLvl = CursorUtil.getColumnIndexOrThrow(_cursor, "lvl");
      final int _cursorIndexOfZoneId = CursorUtil.getColumnIndexOrThrow(_cursor, "ZoneId");
      final int _cursorIndexOfAmbulanceNo = CursorUtil.getColumnIndexOrThrow(_cursor, "AmbulanceNo");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final List<HealthFacility.HealthFacilityModel> _result = new ArrayList<HealthFacility.HealthFacilityModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final HealthFacility.HealthFacilityModel _item;
        final String _tmpDivisionCode;
        if (_cursor.isNull(_cursorIndexOfDivisionCode)) {
          _tmpDivisionCode = null;
        } else {
          _tmpDivisionCode = _cursor.getString(_cursorIndexOfDivisionCode);
        }
        final String _tmpDivisionName;
        if (_cursor.isNull(_cursorIndexOfDivisionName)) {
          _tmpDivisionName = null;
        } else {
          _tmpDivisionName = _cursor.getString(_cursorIndexOfDivisionName);
        }
        final String _tmpDistrictCode;
        if (_cursor.isNull(_cursorIndexOfDistrictCode)) {
          _tmpDistrictCode = null;
        } else {
          _tmpDistrictCode = _cursor.getString(_cursorIndexOfDistrictCode);
        }
        final String _tmpDistrictName;
        if (_cursor.isNull(_cursorIndexOfDistrictName)) {
          _tmpDistrictName = null;
        } else {
          _tmpDistrictName = _cursor.getString(_cursorIndexOfDistrictName);
        }
        final String _tmpTehsilCode;
        if (_cursor.isNull(_cursorIndexOfTehsilCode)) {
          _tmpTehsilCode = null;
        } else {
          _tmpTehsilCode = _cursor.getString(_cursorIndexOfTehsilCode);
        }
        final String _tmpTehsilName;
        if (_cursor.isNull(_cursorIndexOfTehsilName)) {
          _tmpTehsilName = null;
        } else {
          _tmpTehsilName = _cursor.getString(_cursorIndexOfTehsilName);
        }
        final String _tmpHFMISCode;
        if (_cursor.isNull(_cursorIndexOfHFMISCode)) {
          _tmpHFMISCode = null;
        } else {
          _tmpHFMISCode = _cursor.getString(_cursorIndexOfHFMISCode);
        }
        final String _tmpHealthFacilityName;
        if (_cursor.isNull(_cursorIndexOfHealthFacilityName)) {
          _tmpHealthFacilityName = null;
        } else {
          _tmpHealthFacilityName = _cursor.getString(_cursorIndexOfHealthFacilityName);
        }
        final String _tmpModeName;
        if (_cursor.isNull(_cursorIndexOfModeName)) {
          _tmpModeName = null;
        } else {
          _tmpModeName = _cursor.getString(_cursorIndexOfModeName);
        }
        final String _tmpLvl;
        if (_cursor.isNull(_cursorIndexOfLvl)) {
          _tmpLvl = null;
        } else {
          _tmpLvl = _cursor.getString(_cursorIndexOfLvl);
        }
        final String _tmpZoneId;
        if (_cursor.isNull(_cursorIndexOfZoneId)) {
          _tmpZoneId = null;
        } else {
          _tmpZoneId = _cursor.getString(_cursorIndexOfZoneId);
        }
        final String _tmpAmbulanceNo;
        if (_cursor.isNull(_cursorIndexOfAmbulanceNo)) {
          _tmpAmbulanceNo = null;
        } else {
          _tmpAmbulanceNo = _cursor.getString(_cursorIndexOfAmbulanceNo);
        }
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _item = new HealthFacility.HealthFacilityModel(_tmpDivisionCode,_tmpDivisionName,_tmpDistrictCode,_tmpDistrictName,_tmpTehsilCode,_tmpTehsilName,_tmpHFMISCode,_tmpHealthFacilityName,_tmpModeName,_tmpLvl,_tmpZoneId,_tmpAmbulanceNo,_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<HealthFacility.HealthFacilityModel> loadAllDvision() {
    final String _sql = "SELECT * FROM healthfacility where lvl= 'Division'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfDivisionCode = CursorUtil.getColumnIndexOrThrow(_cursor, "DivisionCode");
      final int _cursorIndexOfDivisionName = CursorUtil.getColumnIndexOrThrow(_cursor, "DivisionName");
      final int _cursorIndexOfDistrictCode = CursorUtil.getColumnIndexOrThrow(_cursor, "DistrictCode");
      final int _cursorIndexOfDistrictName = CursorUtil.getColumnIndexOrThrow(_cursor, "DistrictName");
      final int _cursorIndexOfTehsilCode = CursorUtil.getColumnIndexOrThrow(_cursor, "TehsilCode");
      final int _cursorIndexOfTehsilName = CursorUtil.getColumnIndexOrThrow(_cursor, "TehsilName");
      final int _cursorIndexOfHFMISCode = CursorUtil.getColumnIndexOrThrow(_cursor, "HFMISCode");
      final int _cursorIndexOfHealthFacilityName = CursorUtil.getColumnIndexOrThrow(_cursor, "HealthFacilityName");
      final int _cursorIndexOfModeName = CursorUtil.getColumnIndexOrThrow(_cursor, "ModeName");
      final int _cursorIndexOfLvl = CursorUtil.getColumnIndexOrThrow(_cursor, "lvl");
      final int _cursorIndexOfZoneId = CursorUtil.getColumnIndexOrThrow(_cursor, "ZoneId");
      final int _cursorIndexOfAmbulanceNo = CursorUtil.getColumnIndexOrThrow(_cursor, "AmbulanceNo");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final List<HealthFacility.HealthFacilityModel> _result = new ArrayList<HealthFacility.HealthFacilityModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final HealthFacility.HealthFacilityModel _item;
        final String _tmpDivisionCode;
        if (_cursor.isNull(_cursorIndexOfDivisionCode)) {
          _tmpDivisionCode = null;
        } else {
          _tmpDivisionCode = _cursor.getString(_cursorIndexOfDivisionCode);
        }
        final String _tmpDivisionName;
        if (_cursor.isNull(_cursorIndexOfDivisionName)) {
          _tmpDivisionName = null;
        } else {
          _tmpDivisionName = _cursor.getString(_cursorIndexOfDivisionName);
        }
        final String _tmpDistrictCode;
        if (_cursor.isNull(_cursorIndexOfDistrictCode)) {
          _tmpDistrictCode = null;
        } else {
          _tmpDistrictCode = _cursor.getString(_cursorIndexOfDistrictCode);
        }
        final String _tmpDistrictName;
        if (_cursor.isNull(_cursorIndexOfDistrictName)) {
          _tmpDistrictName = null;
        } else {
          _tmpDistrictName = _cursor.getString(_cursorIndexOfDistrictName);
        }
        final String _tmpTehsilCode;
        if (_cursor.isNull(_cursorIndexOfTehsilCode)) {
          _tmpTehsilCode = null;
        } else {
          _tmpTehsilCode = _cursor.getString(_cursorIndexOfTehsilCode);
        }
        final String _tmpTehsilName;
        if (_cursor.isNull(_cursorIndexOfTehsilName)) {
          _tmpTehsilName = null;
        } else {
          _tmpTehsilName = _cursor.getString(_cursorIndexOfTehsilName);
        }
        final String _tmpHFMISCode;
        if (_cursor.isNull(_cursorIndexOfHFMISCode)) {
          _tmpHFMISCode = null;
        } else {
          _tmpHFMISCode = _cursor.getString(_cursorIndexOfHFMISCode);
        }
        final String _tmpHealthFacilityName;
        if (_cursor.isNull(_cursorIndexOfHealthFacilityName)) {
          _tmpHealthFacilityName = null;
        } else {
          _tmpHealthFacilityName = _cursor.getString(_cursorIndexOfHealthFacilityName);
        }
        final String _tmpModeName;
        if (_cursor.isNull(_cursorIndexOfModeName)) {
          _tmpModeName = null;
        } else {
          _tmpModeName = _cursor.getString(_cursorIndexOfModeName);
        }
        final String _tmpLvl;
        if (_cursor.isNull(_cursorIndexOfLvl)) {
          _tmpLvl = null;
        } else {
          _tmpLvl = _cursor.getString(_cursorIndexOfLvl);
        }
        final String _tmpZoneId;
        if (_cursor.isNull(_cursorIndexOfZoneId)) {
          _tmpZoneId = null;
        } else {
          _tmpZoneId = _cursor.getString(_cursorIndexOfZoneId);
        }
        final String _tmpAmbulanceNo;
        if (_cursor.isNull(_cursorIndexOfAmbulanceNo)) {
          _tmpAmbulanceNo = null;
        } else {
          _tmpAmbulanceNo = _cursor.getString(_cursorIndexOfAmbulanceNo);
        }
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _item = new HealthFacility.HealthFacilityModel(_tmpDivisionCode,_tmpDivisionName,_tmpDistrictCode,_tmpDistrictName,_tmpTehsilCode,_tmpTehsilName,_tmpHFMISCode,_tmpHealthFacilityName,_tmpModeName,_tmpLvl,_tmpZoneId,_tmpAmbulanceNo,_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
