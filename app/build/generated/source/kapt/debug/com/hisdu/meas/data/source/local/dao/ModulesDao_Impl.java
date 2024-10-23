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
import java.lang.Boolean;
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
public final class ModulesDao_Impl implements ModulesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AppDropdown.DropdownData.Module> __insertionAdapterOfModule;

  private final EntityDeletionOrUpdateAdapter<AppDropdown.DropdownData.Module> __deletionAdapterOfModule;

  private final EntityDeletionOrUpdateAdapter<AppDropdown.DropdownData.Module> __updateAdapterOfModule;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllData;

  public ModulesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfModule = new EntityInsertionAdapter<AppDropdown.DropdownData.Module>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Module` (`applicationTypeId`,`moduleId`,`moduleName`,`IsRequired`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AppDropdown.DropdownData.Module value) {
        if (value.getApplicationTypeId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getApplicationTypeId());
        }
        if (value.getModuleId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getModuleId());
        }
        if (value.getModuleName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getModuleName());
        }
        final Integer _tmp = value.getIsRequired() == null ? null : (value.getIsRequired() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp);
        }
      }
    };
    this.__deletionAdapterOfModule = new EntityDeletionOrUpdateAdapter<AppDropdown.DropdownData.Module>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Module` WHERE `moduleId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AppDropdown.DropdownData.Module value) {
        if (value.getModuleId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getModuleId());
        }
      }
    };
    this.__updateAdapterOfModule = new EntityDeletionOrUpdateAdapter<AppDropdown.DropdownData.Module>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Module` SET `applicationTypeId` = ?,`moduleId` = ?,`moduleName` = ?,`IsRequired` = ? WHERE `moduleId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AppDropdown.DropdownData.Module value) {
        if (value.getApplicationTypeId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getApplicationTypeId());
        }
        if (value.getModuleId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getModuleId());
        }
        if (value.getModuleName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getModuleName());
        }
        final Integer _tmp = value.getIsRequired() == null ? null : (value.getIsRequired() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp);
        }
        if (value.getModuleId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getModuleId());
        }
      }
    };
    this.__preparedStmtOfDeleteAllData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM module";
        return _query;
      }
    };
  }

  @Override
  public void insert(final AppDropdown.DropdownData.Module facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfModule.insert(facility);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(final List<AppDropdown.DropdownData.Module> facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfModule.insert(facility);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final AppDropdown.DropdownData.Module facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfModule.handle(facility);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final AppDropdown.DropdownData.Module facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfModule.handle(facility);
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
  public List<AppDropdown.DropdownData.Module> loadAll() {
    final String _sql = "SELECT * FROM module ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfApplicationTypeId = CursorUtil.getColumnIndexOrThrow(_cursor, "applicationTypeId");
      final int _cursorIndexOfModuleId = CursorUtil.getColumnIndexOrThrow(_cursor, "moduleId");
      final int _cursorIndexOfModuleName = CursorUtil.getColumnIndexOrThrow(_cursor, "moduleName");
      final int _cursorIndexOfIsRequired = CursorUtil.getColumnIndexOrThrow(_cursor, "IsRequired");
      final List<AppDropdown.DropdownData.Module> _result = new ArrayList<AppDropdown.DropdownData.Module>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final AppDropdown.DropdownData.Module _item;
        final Integer _tmpApplicationTypeId;
        if (_cursor.isNull(_cursorIndexOfApplicationTypeId)) {
          _tmpApplicationTypeId = null;
        } else {
          _tmpApplicationTypeId = _cursor.getInt(_cursorIndexOfApplicationTypeId);
        }
        final Integer _tmpModuleId;
        if (_cursor.isNull(_cursorIndexOfModuleId)) {
          _tmpModuleId = null;
        } else {
          _tmpModuleId = _cursor.getInt(_cursorIndexOfModuleId);
        }
        final String _tmpModuleName;
        if (_cursor.isNull(_cursorIndexOfModuleName)) {
          _tmpModuleName = null;
        } else {
          _tmpModuleName = _cursor.getString(_cursorIndexOfModuleName);
        }
        final Boolean _tmpIsRequired;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfIsRequired)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfIsRequired);
        }
        _tmpIsRequired = _tmp == null ? null : _tmp != 0;
        _item = new AppDropdown.DropdownData.Module(_tmpApplicationTypeId,_tmpModuleId,_tmpModuleName,_tmpIsRequired);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<AppDropdown.DropdownData.Module> loadById(final int applicationTypeId) {
    final String _sql = "SELECT * FROM module where applicationTypeId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, applicationTypeId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfApplicationTypeId = CursorUtil.getColumnIndexOrThrow(_cursor, "applicationTypeId");
      final int _cursorIndexOfModuleId = CursorUtil.getColumnIndexOrThrow(_cursor, "moduleId");
      final int _cursorIndexOfModuleName = CursorUtil.getColumnIndexOrThrow(_cursor, "moduleName");
      final int _cursorIndexOfIsRequired = CursorUtil.getColumnIndexOrThrow(_cursor, "IsRequired");
      final List<AppDropdown.DropdownData.Module> _result = new ArrayList<AppDropdown.DropdownData.Module>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final AppDropdown.DropdownData.Module _item;
        final Integer _tmpApplicationTypeId;
        if (_cursor.isNull(_cursorIndexOfApplicationTypeId)) {
          _tmpApplicationTypeId = null;
        } else {
          _tmpApplicationTypeId = _cursor.getInt(_cursorIndexOfApplicationTypeId);
        }
        final Integer _tmpModuleId;
        if (_cursor.isNull(_cursorIndexOfModuleId)) {
          _tmpModuleId = null;
        } else {
          _tmpModuleId = _cursor.getInt(_cursorIndexOfModuleId);
        }
        final String _tmpModuleName;
        if (_cursor.isNull(_cursorIndexOfModuleName)) {
          _tmpModuleName = null;
        } else {
          _tmpModuleName = _cursor.getString(_cursorIndexOfModuleName);
        }
        final Boolean _tmpIsRequired;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfIsRequired)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfIsRequired);
        }
        _tmpIsRequired = _tmp == null ? null : _tmp != 0;
        _item = new AppDropdown.DropdownData.Module(_tmpApplicationTypeId,_tmpModuleId,_tmpModuleName,_tmpIsRequired);
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
