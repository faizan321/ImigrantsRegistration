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
public final class DesignationDao_Impl implements DesignationDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AppDropdown.DropdownData.designation> __insertionAdapterOfdesignation;

  private final EntityDeletionOrUpdateAdapter<AppDropdown.DropdownData.designation> __deletionAdapterOfdesignation;

  private final EntityDeletionOrUpdateAdapter<AppDropdown.DropdownData.designation> __updateAdapterOfdesignation;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllData;

  public DesignationDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfdesignation = new EntityInsertionAdapter<AppDropdown.DropdownData.designation>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `designation` (`DesignationHFId`,`DesignationId`,`DesignationName`,`HFTypeId`,`ShiftId`,`SequenceNo`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AppDropdown.DropdownData.designation value) {
        if (value.getDesignationHFId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getDesignationHFId());
        }
        if (value.getDesignationId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getDesignationId());
        }
        if (value.getDesignationName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDesignationName());
        }
        if (value.getHFTypeId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getHFTypeId());
        }
        if (value.getShiftId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getShiftId());
        }
        if (value.getSequenceNo() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getSequenceNo());
        }
      }
    };
    this.__deletionAdapterOfdesignation = new EntityDeletionOrUpdateAdapter<AppDropdown.DropdownData.designation>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `designation` WHERE `DesignationHFId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AppDropdown.DropdownData.designation value) {
        if (value.getDesignationHFId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getDesignationHFId());
        }
      }
    };
    this.__updateAdapterOfdesignation = new EntityDeletionOrUpdateAdapter<AppDropdown.DropdownData.designation>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `designation` SET `DesignationHFId` = ?,`DesignationId` = ?,`DesignationName` = ?,`HFTypeId` = ?,`ShiftId` = ?,`SequenceNo` = ? WHERE `DesignationHFId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AppDropdown.DropdownData.designation value) {
        if (value.getDesignationHFId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getDesignationHFId());
        }
        if (value.getDesignationId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getDesignationId());
        }
        if (value.getDesignationName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDesignationName());
        }
        if (value.getHFTypeId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getHFTypeId());
        }
        if (value.getShiftId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getShiftId());
        }
        if (value.getSequenceNo() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getSequenceNo());
        }
        if (value.getDesignationHFId() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getDesignationHFId());
        }
      }
    };
    this.__preparedStmtOfDeleteAllData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM designation";
        return _query;
      }
    };
  }

  @Override
  public void insert(final AppDropdown.DropdownData.designation facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfdesignation.insert(facility);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(final List<AppDropdown.DropdownData.designation> facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfdesignation.insert(facility);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final AppDropdown.DropdownData.designation facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfdesignation.handle(facility);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final AppDropdown.DropdownData.designation facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfdesignation.handle(facility);
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
  public List<AppDropdown.DropdownData.designation> loadAll(final String hftype,
      final String shiftId) {
    final String _sql = "SELECT * FROM designation where HFTypeId =? and ShiftId =? ORDER BY SequenceNo";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (hftype == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, hftype);
    }
    _argIndex = 2;
    if (shiftId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, shiftId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfDesignationHFId = CursorUtil.getColumnIndexOrThrow(_cursor, "DesignationHFId");
      final int _cursorIndexOfDesignationId = CursorUtil.getColumnIndexOrThrow(_cursor, "DesignationId");
      final int _cursorIndexOfDesignationName = CursorUtil.getColumnIndexOrThrow(_cursor, "DesignationName");
      final int _cursorIndexOfHFTypeId = CursorUtil.getColumnIndexOrThrow(_cursor, "HFTypeId");
      final int _cursorIndexOfShiftId = CursorUtil.getColumnIndexOrThrow(_cursor, "ShiftId");
      final int _cursorIndexOfSequenceNo = CursorUtil.getColumnIndexOrThrow(_cursor, "SequenceNo");
      final List<AppDropdown.DropdownData.designation> _result = new ArrayList<AppDropdown.DropdownData.designation>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final AppDropdown.DropdownData.designation _item;
        final Integer _tmpDesignationHFId;
        if (_cursor.isNull(_cursorIndexOfDesignationHFId)) {
          _tmpDesignationHFId = null;
        } else {
          _tmpDesignationHFId = _cursor.getInt(_cursorIndexOfDesignationHFId);
        }
        final Integer _tmpDesignationId;
        if (_cursor.isNull(_cursorIndexOfDesignationId)) {
          _tmpDesignationId = null;
        } else {
          _tmpDesignationId = _cursor.getInt(_cursorIndexOfDesignationId);
        }
        final String _tmpDesignationName;
        if (_cursor.isNull(_cursorIndexOfDesignationName)) {
          _tmpDesignationName = null;
        } else {
          _tmpDesignationName = _cursor.getString(_cursorIndexOfDesignationName);
        }
        final String _tmpHFTypeId;
        if (_cursor.isNull(_cursorIndexOfHFTypeId)) {
          _tmpHFTypeId = null;
        } else {
          _tmpHFTypeId = _cursor.getString(_cursorIndexOfHFTypeId);
        }
        final String _tmpShiftId;
        if (_cursor.isNull(_cursorIndexOfShiftId)) {
          _tmpShiftId = null;
        } else {
          _tmpShiftId = _cursor.getString(_cursorIndexOfShiftId);
        }
        final Integer _tmpSequenceNo;
        if (_cursor.isNull(_cursorIndexOfSequenceNo)) {
          _tmpSequenceNo = null;
        } else {
          _tmpSequenceNo = _cursor.getInt(_cursorIndexOfSequenceNo);
        }
        _item = new AppDropdown.DropdownData.designation(_tmpDesignationHFId,_tmpDesignationId,_tmpDesignationName,_tmpHFTypeId,_tmpShiftId,_tmpSequenceNo);
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
