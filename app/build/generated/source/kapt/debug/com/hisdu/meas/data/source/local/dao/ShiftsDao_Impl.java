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
public final class ShiftsDao_Impl implements ShiftsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AppDropdown.DropdownData.Shift> __insertionAdapterOfShift;

  private final DateConverter __dateConverter = new DateConverter();

  private final EntityDeletionOrUpdateAdapter<AppDropdown.DropdownData.Shift> __deletionAdapterOfShift;

  private final EntityDeletionOrUpdateAdapter<AppDropdown.DropdownData.Shift> __updateAdapterOfShift;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllData;

  public ShiftsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfShift = new EntityInsertionAdapter<AppDropdown.DropdownData.Shift>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Shift` (`shiftId`,`shiftName`,`HFTypeId`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AppDropdown.DropdownData.Shift value) {
        if (value.getShiftId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getShiftId());
        }
        if (value.getShiftName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getShiftName());
        }
        final String _tmp = __dateConverter.fromInt(value.getHFTypeId());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
      }
    };
    this.__deletionAdapterOfShift = new EntityDeletionOrUpdateAdapter<AppDropdown.DropdownData.Shift>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Shift` WHERE `shiftId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AppDropdown.DropdownData.Shift value) {
        if (value.getShiftId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getShiftId());
        }
      }
    };
    this.__updateAdapterOfShift = new EntityDeletionOrUpdateAdapter<AppDropdown.DropdownData.Shift>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Shift` SET `shiftId` = ?,`shiftName` = ?,`HFTypeId` = ? WHERE `shiftId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AppDropdown.DropdownData.Shift value) {
        if (value.getShiftId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getShiftId());
        }
        if (value.getShiftName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getShiftName());
        }
        final String _tmp = __dateConverter.fromInt(value.getHFTypeId());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        if (value.getShiftId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getShiftId());
        }
      }
    };
    this.__preparedStmtOfDeleteAllData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Shift";
        return _query;
      }
    };
  }

  @Override
  public void insert(final AppDropdown.DropdownData.Shift facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfShift.insert(facility);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(final List<AppDropdown.DropdownData.Shift> facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfShift.insert(facility);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final AppDropdown.DropdownData.Shift facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfShift.handle(facility);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final AppDropdown.DropdownData.Shift facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfShift.handle(facility);
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
  public List<AppDropdown.DropdownData.Shift> loadAll() {
    final String _sql = "SELECT * FROM shift";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfShiftId = CursorUtil.getColumnIndexOrThrow(_cursor, "shiftId");
      final int _cursorIndexOfShiftName = CursorUtil.getColumnIndexOrThrow(_cursor, "shiftName");
      final int _cursorIndexOfHFTypeId = CursorUtil.getColumnIndexOrThrow(_cursor, "HFTypeId");
      final List<AppDropdown.DropdownData.Shift> _result = new ArrayList<AppDropdown.DropdownData.Shift>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final AppDropdown.DropdownData.Shift _item;
        final Integer _tmpShiftId;
        if (_cursor.isNull(_cursorIndexOfShiftId)) {
          _tmpShiftId = null;
        } else {
          _tmpShiftId = _cursor.getInt(_cursorIndexOfShiftId);
        }
        final String _tmpShiftName;
        if (_cursor.isNull(_cursorIndexOfShiftName)) {
          _tmpShiftName = null;
        } else {
          _tmpShiftName = _cursor.getString(_cursorIndexOfShiftName);
        }
        final List<Integer> _tmpHFTypeId;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfHFTypeId)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfHFTypeId);
        }
        _tmpHFTypeId = __dateConverter.toIntList(_tmp);
        _item = new AppDropdown.DropdownData.Shift(_tmpShiftId,_tmpShiftName,_tmpHFTypeId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<AppDropdown.DropdownData.Shift> loadByHfTypeID(final int hftypeid) {
    final String _sql = "SELECT * FROM shift where HFTypeId LIKE '%' || ? || '%' ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, hftypeid);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfShiftId = CursorUtil.getColumnIndexOrThrow(_cursor, "shiftId");
      final int _cursorIndexOfShiftName = CursorUtil.getColumnIndexOrThrow(_cursor, "shiftName");
      final int _cursorIndexOfHFTypeId = CursorUtil.getColumnIndexOrThrow(_cursor, "HFTypeId");
      final List<AppDropdown.DropdownData.Shift> _result = new ArrayList<AppDropdown.DropdownData.Shift>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final AppDropdown.DropdownData.Shift _item;
        final Integer _tmpShiftId;
        if (_cursor.isNull(_cursorIndexOfShiftId)) {
          _tmpShiftId = null;
        } else {
          _tmpShiftId = _cursor.getInt(_cursorIndexOfShiftId);
        }
        final String _tmpShiftName;
        if (_cursor.isNull(_cursorIndexOfShiftName)) {
          _tmpShiftName = null;
        } else {
          _tmpShiftName = _cursor.getString(_cursorIndexOfShiftName);
        }
        final List<Integer> _tmpHFTypeId;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfHFTypeId)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfHFTypeId);
        }
        _tmpHFTypeId = __dateConverter.toIntList(_tmp);
        _item = new AppDropdown.DropdownData.Shift(_tmpShiftId,_tmpShiftName,_tmpHFTypeId);
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
