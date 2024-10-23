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
import com.hisdu.meas.ui.Dashboard.AppDropdown;
import com.leopold.mvvm.data.db.converter.DateConverter;
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
public final class HealthFacilityTypeDao_Impl implements HealthFacilityTypeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AppDropdown.DropdownData.HealthFacilityType> __insertionAdapterOfHealthFacilityType;

  private final DateConverter __dateConverter = new DateConverter();

  private final EntityDeletionOrUpdateAdapter<AppDropdown.DropdownData.HealthFacilityType> __deletionAdapterOfHealthFacilityType;

  private final EntityDeletionOrUpdateAdapter<AppDropdown.DropdownData.HealthFacilityType> __updateAdapterOfHealthFacilityType;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllData;

  public HealthFacilityTypeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHealthFacilityType = new EntityInsertionAdapter<AppDropdown.DropdownData.HealthFacilityType>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `HealthFacilityType` (`facilityTypeId`,`faciltyTypeName`,`CategoryId`,`ApplicationTypeIds`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt,
          AppDropdown.DropdownData.HealthFacilityType value) {
        if (value.getFacilityTypeId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getFacilityTypeId());
        }
        if (value.getFaciltyTypeName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFaciltyTypeName());
        }
        if (value.getCategoryId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getCategoryId());
        }
        final String _tmp = __dateConverter.fromInt(value.getApplicationTypeIds());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
      }
    };
    this.__deletionAdapterOfHealthFacilityType = new EntityDeletionOrUpdateAdapter<AppDropdown.DropdownData.HealthFacilityType>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `HealthFacilityType` WHERE `facilityTypeId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt,
          AppDropdown.DropdownData.HealthFacilityType value) {
        if (value.getFacilityTypeId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getFacilityTypeId());
        }
      }
    };
    this.__updateAdapterOfHealthFacilityType = new EntityDeletionOrUpdateAdapter<AppDropdown.DropdownData.HealthFacilityType>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `HealthFacilityType` SET `facilityTypeId` = ?,`faciltyTypeName` = ?,`CategoryId` = ?,`ApplicationTypeIds` = ? WHERE `facilityTypeId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt,
          AppDropdown.DropdownData.HealthFacilityType value) {
        if (value.getFacilityTypeId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getFacilityTypeId());
        }
        if (value.getFaciltyTypeName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFaciltyTypeName());
        }
        if (value.getCategoryId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getCategoryId());
        }
        final String _tmp = __dateConverter.fromInt(value.getApplicationTypeIds());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
        if (value.getFacilityTypeId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getFacilityTypeId());
        }
      }
    };
    this.__preparedStmtOfDeleteAllData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM healthFacilityType";
        return _query;
      }
    };
  }

  @Override
  public void insert(final AppDropdown.DropdownData.HealthFacilityType facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHealthFacilityType.insert(facility);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(final List<AppDropdown.DropdownData.HealthFacilityType> facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHealthFacilityType.insert(facility);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final AppDropdown.DropdownData.HealthFacilityType facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfHealthFacilityType.handle(facility);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final AppDropdown.DropdownData.HealthFacilityType facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfHealthFacilityType.handle(facility);
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
  public List<AppDropdown.DropdownData.HealthFacilityType> loadAll() {
    final String _sql = "SELECT * FROM healthFacilityType";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfFacilityTypeId = CursorUtil.getColumnIndexOrThrow(_cursor, "facilityTypeId");
      final int _cursorIndexOfFaciltyTypeName = CursorUtil.getColumnIndexOrThrow(_cursor, "faciltyTypeName");
      final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "CategoryId");
      final int _cursorIndexOfApplicationTypeIds = CursorUtil.getColumnIndexOrThrow(_cursor, "ApplicationTypeIds");
      final List<AppDropdown.DropdownData.HealthFacilityType> _result = new ArrayList<AppDropdown.DropdownData.HealthFacilityType>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final AppDropdown.DropdownData.HealthFacilityType _item;
        final Integer _tmpFacilityTypeId;
        if (_cursor.isNull(_cursorIndexOfFacilityTypeId)) {
          _tmpFacilityTypeId = null;
        } else {
          _tmpFacilityTypeId = _cursor.getInt(_cursorIndexOfFacilityTypeId);
        }
        final String _tmpFaciltyTypeName;
        if (_cursor.isNull(_cursorIndexOfFaciltyTypeName)) {
          _tmpFaciltyTypeName = null;
        } else {
          _tmpFaciltyTypeName = _cursor.getString(_cursorIndexOfFaciltyTypeName);
        }
        final Integer _tmpCategoryId;
        if (_cursor.isNull(_cursorIndexOfCategoryId)) {
          _tmpCategoryId = null;
        } else {
          _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
        }
        final List<Integer> _tmpApplicationTypeIds;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfApplicationTypeIds)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfApplicationTypeIds);
        }
        _tmpApplicationTypeIds = __dateConverter.toIntList(_tmp);
        _item = new AppDropdown.DropdownData.HealthFacilityType(_tmpFacilityTypeId,_tmpFaciltyTypeName,_tmpCategoryId,_tmpApplicationTypeIds);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<AppDropdown.DropdownData.HealthFacilityType> loadByid(final int applicationtypeId) {
    final String _sql = "SELECT * FROM healthFacilityType where ApplicationTypeIds LIKE '%' || ? || '%' ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, applicationtypeId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfFacilityTypeId = CursorUtil.getColumnIndexOrThrow(_cursor, "facilityTypeId");
      final int _cursorIndexOfFaciltyTypeName = CursorUtil.getColumnIndexOrThrow(_cursor, "faciltyTypeName");
      final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "CategoryId");
      final int _cursorIndexOfApplicationTypeIds = CursorUtil.getColumnIndexOrThrow(_cursor, "ApplicationTypeIds");
      final List<AppDropdown.DropdownData.HealthFacilityType> _result = new ArrayList<AppDropdown.DropdownData.HealthFacilityType>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final AppDropdown.DropdownData.HealthFacilityType _item;
        final Integer _tmpFacilityTypeId;
        if (_cursor.isNull(_cursorIndexOfFacilityTypeId)) {
          _tmpFacilityTypeId = null;
        } else {
          _tmpFacilityTypeId = _cursor.getInt(_cursorIndexOfFacilityTypeId);
        }
        final String _tmpFaciltyTypeName;
        if (_cursor.isNull(_cursorIndexOfFaciltyTypeName)) {
          _tmpFaciltyTypeName = null;
        } else {
          _tmpFaciltyTypeName = _cursor.getString(_cursorIndexOfFaciltyTypeName);
        }
        final Integer _tmpCategoryId;
        if (_cursor.isNull(_cursorIndexOfCategoryId)) {
          _tmpCategoryId = null;
        } else {
          _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
        }
        final List<Integer> _tmpApplicationTypeIds;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfApplicationTypeIds)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfApplicationTypeIds);
        }
        _tmpApplicationTypeIds = __dateConverter.toIntList(_tmp);
        _item = new AppDropdown.DropdownData.HealthFacilityType(_tmpFacilityTypeId,_tmpFaciltyTypeName,_tmpCategoryId,_tmpApplicationTypeIds);
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
