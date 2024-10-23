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
import com.zest.android.ui.login.UserModel;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserModel> __insertionAdapterOfUserModel;

  private final EntityDeletionOrUpdateAdapter<UserModel> __deletionAdapterOfUserModel;

  private final EntityDeletionOrUpdateAdapter<UserModel> __updateAdapterOfUserModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllData;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserModel = new EntityInsertionAdapter<UserModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `userModel` (`access_token`,`token_type`,`UserName`,`Id`,`HealthFacility`,`HFCode`,`role`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserModel value) {
        if (value.getAccess_token() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getAccess_token());
        }
        if (value.getToken_type() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getToken_type());
        }
        if (value.getUserName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUserName());
        }
        if (value.getId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getId());
        }
        if (value.getHealthFacility() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getHealthFacility());
        }
        if (value.getHFCode() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getHFCode());
        }
        if (value.getRole() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getRole());
        }
      }
    };
    this.__deletionAdapterOfUserModel = new EntityDeletionOrUpdateAdapter<UserModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `userModel` WHERE `Id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfUserModel = new EntityDeletionOrUpdateAdapter<UserModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `userModel` SET `access_token` = ?,`token_type` = ?,`UserName` = ?,`Id` = ?,`HealthFacility` = ?,`HFCode` = ?,`role` = ? WHERE `Id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserModel value) {
        if (value.getAccess_token() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getAccess_token());
        }
        if (value.getToken_type() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getToken_type());
        }
        if (value.getUserName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUserName());
        }
        if (value.getId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getId());
        }
        if (value.getHealthFacility() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getHealthFacility());
        }
        if (value.getHFCode() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getHFCode());
        }
        if (value.getRole() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getRole());
        }
        if (value.getId() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAllData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM userModel";
        return _query;
      }
    };
  }

  @Override
  public void insert(final UserModel recipe) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserModel.insert(recipe);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final UserModel recipe) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfUserModel.handle(recipe);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final UserModel recipe) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfUserModel.handle(recipe);
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
  public List<UserModel> loadAll() {
    final String _sql = "SELECT * FROM userModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfAccessToken = CursorUtil.getColumnIndexOrThrow(_cursor, "access_token");
      final int _cursorIndexOfTokenType = CursorUtil.getColumnIndexOrThrow(_cursor, "token_type");
      final int _cursorIndexOfUserName = CursorUtil.getColumnIndexOrThrow(_cursor, "UserName");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "Id");
      final int _cursorIndexOfHealthFacility = CursorUtil.getColumnIndexOrThrow(_cursor, "HealthFacility");
      final int _cursorIndexOfHFCode = CursorUtil.getColumnIndexOrThrow(_cursor, "HFCode");
      final int _cursorIndexOfRole = CursorUtil.getColumnIndexOrThrow(_cursor, "role");
      final List<UserModel> _result = new ArrayList<UserModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final UserModel _item;
        final String _tmpAccess_token;
        if (_cursor.isNull(_cursorIndexOfAccessToken)) {
          _tmpAccess_token = null;
        } else {
          _tmpAccess_token = _cursor.getString(_cursorIndexOfAccessToken);
        }
        final String _tmpToken_type;
        if (_cursor.isNull(_cursorIndexOfTokenType)) {
          _tmpToken_type = null;
        } else {
          _tmpToken_type = _cursor.getString(_cursorIndexOfTokenType);
        }
        final String _tmpUserName;
        if (_cursor.isNull(_cursorIndexOfUserName)) {
          _tmpUserName = null;
        } else {
          _tmpUserName = _cursor.getString(_cursorIndexOfUserName);
        }
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final String _tmpHealthFacility;
        if (_cursor.isNull(_cursorIndexOfHealthFacility)) {
          _tmpHealthFacility = null;
        } else {
          _tmpHealthFacility = _cursor.getString(_cursorIndexOfHealthFacility);
        }
        final String _tmpHFCode;
        if (_cursor.isNull(_cursorIndexOfHFCode)) {
          _tmpHFCode = null;
        } else {
          _tmpHFCode = _cursor.getString(_cursorIndexOfHFCode);
        }
        final String _tmpRole;
        if (_cursor.isNull(_cursorIndexOfRole)) {
          _tmpRole = null;
        } else {
          _tmpRole = _cursor.getString(_cursorIndexOfRole);
        }
        _item = new UserModel(_tmpAccess_token,_tmpToken_type,_tmpUserName,_tmpId,_tmpHealthFacility,_tmpHFCode,_tmpRole);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public UserModel loadOneByUserId(final String userid) {
    final String _sql = "SELECT * FROM userModel where Id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userid == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userid);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfAccessToken = CursorUtil.getColumnIndexOrThrow(_cursor, "access_token");
      final int _cursorIndexOfTokenType = CursorUtil.getColumnIndexOrThrow(_cursor, "token_type");
      final int _cursorIndexOfUserName = CursorUtil.getColumnIndexOrThrow(_cursor, "UserName");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "Id");
      final int _cursorIndexOfHealthFacility = CursorUtil.getColumnIndexOrThrow(_cursor, "HealthFacility");
      final int _cursorIndexOfHFCode = CursorUtil.getColumnIndexOrThrow(_cursor, "HFCode");
      final int _cursorIndexOfRole = CursorUtil.getColumnIndexOrThrow(_cursor, "role");
      final UserModel _result;
      if(_cursor.moveToFirst()) {
        final String _tmpAccess_token;
        if (_cursor.isNull(_cursorIndexOfAccessToken)) {
          _tmpAccess_token = null;
        } else {
          _tmpAccess_token = _cursor.getString(_cursorIndexOfAccessToken);
        }
        final String _tmpToken_type;
        if (_cursor.isNull(_cursorIndexOfTokenType)) {
          _tmpToken_type = null;
        } else {
          _tmpToken_type = _cursor.getString(_cursorIndexOfTokenType);
        }
        final String _tmpUserName;
        if (_cursor.isNull(_cursorIndexOfUserName)) {
          _tmpUserName = null;
        } else {
          _tmpUserName = _cursor.getString(_cursorIndexOfUserName);
        }
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final String _tmpHealthFacility;
        if (_cursor.isNull(_cursorIndexOfHealthFacility)) {
          _tmpHealthFacility = null;
        } else {
          _tmpHealthFacility = _cursor.getString(_cursorIndexOfHealthFacility);
        }
        final String _tmpHFCode;
        if (_cursor.isNull(_cursorIndexOfHFCode)) {
          _tmpHFCode = null;
        } else {
          _tmpHFCode = _cursor.getString(_cursorIndexOfHFCode);
        }
        final String _tmpRole;
        if (_cursor.isNull(_cursorIndexOfRole)) {
          _tmpRole = null;
        } else {
          _tmpRole = _cursor.getString(_cursorIndexOfRole);
        }
        _result = new UserModel(_tmpAccess_token,_tmpToken_type,_tmpUserName,_tmpId,_tmpHealthFacility,_tmpHFCode,_tmpRole);
      } else {
        _result = null;
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
