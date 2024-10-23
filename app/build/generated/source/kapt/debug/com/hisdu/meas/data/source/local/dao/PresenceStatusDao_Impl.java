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
public final class PresenceStatusDao_Impl implements PresenceStatusDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AppDropdown.DropdownData.PresanceStatus> __insertionAdapterOfPresanceStatus;

  private final EntityDeletionOrUpdateAdapter<AppDropdown.DropdownData.PresanceStatus> __deletionAdapterOfPresanceStatus;

  private final EntityDeletionOrUpdateAdapter<AppDropdown.DropdownData.PresanceStatus> __updateAdapterOfPresanceStatus;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllData;

  public PresenceStatusDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPresanceStatus = new EntityInsertionAdapter<AppDropdown.DropdownData.PresanceStatus>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `PresanceStatus` (`ProfileId`,`ProfileName`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AppDropdown.DropdownData.PresanceStatus value) {
        if (value.getProfileId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getProfileId());
        }
        if (value.getProfileName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getProfileName());
        }
      }
    };
    this.__deletionAdapterOfPresanceStatus = new EntityDeletionOrUpdateAdapter<AppDropdown.DropdownData.PresanceStatus>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `PresanceStatus` WHERE `ProfileId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AppDropdown.DropdownData.PresanceStatus value) {
        if (value.getProfileId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getProfileId());
        }
      }
    };
    this.__updateAdapterOfPresanceStatus = new EntityDeletionOrUpdateAdapter<AppDropdown.DropdownData.PresanceStatus>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `PresanceStatus` SET `ProfileId` = ?,`ProfileName` = ? WHERE `ProfileId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AppDropdown.DropdownData.PresanceStatus value) {
        if (value.getProfileId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getProfileId());
        }
        if (value.getProfileName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getProfileName());
        }
        if (value.getProfileId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getProfileId());
        }
      }
    };
    this.__preparedStmtOfDeleteAllData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM presancestatus";
        return _query;
      }
    };
  }

  @Override
  public void insert(final AppDropdown.DropdownData.PresanceStatus facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPresanceStatus.insert(facility);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(final List<AppDropdown.DropdownData.PresanceStatus> facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPresanceStatus.insert(facility);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final AppDropdown.DropdownData.PresanceStatus facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfPresanceStatus.handle(facility);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final AppDropdown.DropdownData.PresanceStatus facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfPresanceStatus.handle(facility);
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
  public List<AppDropdown.DropdownData.PresanceStatus> loadAll() {
    final String _sql = "SELECT * FROM presancestatus";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfProfileId = CursorUtil.getColumnIndexOrThrow(_cursor, "ProfileId");
      final int _cursorIndexOfProfileName = CursorUtil.getColumnIndexOrThrow(_cursor, "ProfileName");
      final List<AppDropdown.DropdownData.PresanceStatus> _result = new ArrayList<AppDropdown.DropdownData.PresanceStatus>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final AppDropdown.DropdownData.PresanceStatus _item;
        final Integer _tmpProfileId;
        if (_cursor.isNull(_cursorIndexOfProfileId)) {
          _tmpProfileId = null;
        } else {
          _tmpProfileId = _cursor.getInt(_cursorIndexOfProfileId);
        }
        final String _tmpProfileName;
        if (_cursor.isNull(_cursorIndexOfProfileName)) {
          _tmpProfileName = null;
        } else {
          _tmpProfileName = _cursor.getString(_cursorIndexOfProfileName);
        }
        _item = new AppDropdown.DropdownData.PresanceStatus(_tmpProfileId,_tmpProfileName);
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
