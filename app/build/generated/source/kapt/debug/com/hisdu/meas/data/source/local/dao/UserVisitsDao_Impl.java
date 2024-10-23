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
import com.hisdu.meas.ui.Visits.Visits;
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
public final class UserVisitsDao_Impl implements UserVisitsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Visits> __insertionAdapterOfVisits;

  private final EntityDeletionOrUpdateAdapter<Visits> __deletionAdapterOfVisits;

  private final EntityDeletionOrUpdateAdapter<Visits> __updateAdapterOfVisits;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllData;

  public UserVisitsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfVisits = new EntityInsertionAdapter<Visits>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Visits` (`fullName`,`hFMISCode`,`healthFacilityName`,`hfId`,`isRepeat`,`isSpecial`,`isVisited`,`shiftId`,`shiftName`,`userId`,`username`,`visitedDate`,`ModeName`,`VisitId`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Visits value) {
        if (value.getFullName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getFullName());
        }
        if (value.getHFMISCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getHFMISCode());
        }
        if (value.getHealthFacilityName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getHealthFacilityName());
        }
        if (value.getHfId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getHfId());
        }
        final Integer _tmp = value.isRepeat() == null ? null : (value.isRepeat() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp);
        }
        final Integer _tmp_1 = value.isSpecial() == null ? null : (value.isSpecial() ? 1 : 0);
        if (_tmp_1 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, _tmp_1);
        }
        final Integer _tmp_2 = value.isVisited() == null ? null : (value.isVisited() ? 1 : 0);
        if (_tmp_2 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp_2);
        }
        if (value.getShiftId() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getShiftId());
        }
        if (value.getShiftName() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getShiftName());
        }
        if (value.getUserId() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getUserId());
        }
        if (value.getUsername() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getUsername());
        }
        if (value.getVisitedDate() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getVisitedDate());
        }
        if (value.getModeName() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getModeName());
        }
        if (value.getVisitId() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getVisitId());
        }
      }
    };
    this.__deletionAdapterOfVisits = new EntityDeletionOrUpdateAdapter<Visits>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Visits` WHERE `VisitId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Visits value) {
        if (value.getVisitId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getVisitId());
        }
      }
    };
    this.__updateAdapterOfVisits = new EntityDeletionOrUpdateAdapter<Visits>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Visits` SET `fullName` = ?,`hFMISCode` = ?,`healthFacilityName` = ?,`hfId` = ?,`isRepeat` = ?,`isSpecial` = ?,`isVisited` = ?,`shiftId` = ?,`shiftName` = ?,`userId` = ?,`username` = ?,`visitedDate` = ?,`ModeName` = ?,`VisitId` = ? WHERE `VisitId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Visits value) {
        if (value.getFullName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getFullName());
        }
        if (value.getHFMISCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getHFMISCode());
        }
        if (value.getHealthFacilityName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getHealthFacilityName());
        }
        if (value.getHfId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getHfId());
        }
        final Integer _tmp = value.isRepeat() == null ? null : (value.isRepeat() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp);
        }
        final Integer _tmp_1 = value.isSpecial() == null ? null : (value.isSpecial() ? 1 : 0);
        if (_tmp_1 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, _tmp_1);
        }
        final Integer _tmp_2 = value.isVisited() == null ? null : (value.isVisited() ? 1 : 0);
        if (_tmp_2 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp_2);
        }
        if (value.getShiftId() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getShiftId());
        }
        if (value.getShiftName() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getShiftName());
        }
        if (value.getUserId() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getUserId());
        }
        if (value.getUsername() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getUsername());
        }
        if (value.getVisitedDate() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getVisitedDate());
        }
        if (value.getModeName() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getModeName());
        }
        if (value.getVisitId() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getVisitId());
        }
        if (value.getVisitId() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindLong(15, value.getVisitId());
        }
      }
    };
    this.__preparedStmtOfDeleteAllData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM visits";
        return _query;
      }
    };
  }

  @Override
  public void insert(final Visits facility) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfVisits.insert(facility);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(final List<Visits> visit) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfVisits.insert(visit);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Visits visit) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfVisits.handle(visit);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Visits visit) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfVisits.handle(visit);
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
  public List<Visits> loadAll() {
    final String _sql = "SELECT * FROM visits";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "fullName");
      final int _cursorIndexOfHFMISCode = CursorUtil.getColumnIndexOrThrow(_cursor, "hFMISCode");
      final int _cursorIndexOfHealthFacilityName = CursorUtil.getColumnIndexOrThrow(_cursor, "healthFacilityName");
      final int _cursorIndexOfHfId = CursorUtil.getColumnIndexOrThrow(_cursor, "hfId");
      final int _cursorIndexOfIsRepeat = CursorUtil.getColumnIndexOrThrow(_cursor, "isRepeat");
      final int _cursorIndexOfIsSpecial = CursorUtil.getColumnIndexOrThrow(_cursor, "isSpecial");
      final int _cursorIndexOfIsVisited = CursorUtil.getColumnIndexOrThrow(_cursor, "isVisited");
      final int _cursorIndexOfShiftId = CursorUtil.getColumnIndexOrThrow(_cursor, "shiftId");
      final int _cursorIndexOfShiftName = CursorUtil.getColumnIndexOrThrow(_cursor, "shiftName");
      final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
      final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
      final int _cursorIndexOfVisitedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visitedDate");
      final int _cursorIndexOfModeName = CursorUtil.getColumnIndexOrThrow(_cursor, "ModeName");
      final int _cursorIndexOfVisitId = CursorUtil.getColumnIndexOrThrow(_cursor, "VisitId");
      final List<Visits> _result = new ArrayList<Visits>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Visits _item;
        final String _tmpFullName;
        if (_cursor.isNull(_cursorIndexOfFullName)) {
          _tmpFullName = null;
        } else {
          _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
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
        final Integer _tmpHfId;
        if (_cursor.isNull(_cursorIndexOfHfId)) {
          _tmpHfId = null;
        } else {
          _tmpHfId = _cursor.getInt(_cursorIndexOfHfId);
        }
        final Boolean _tmpIsRepeat;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfIsRepeat)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfIsRepeat);
        }
        _tmpIsRepeat = _tmp == null ? null : _tmp != 0;
        final Boolean _tmpIsSpecial;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfIsSpecial)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfIsSpecial);
        }
        _tmpIsSpecial = _tmp_1 == null ? null : _tmp_1 != 0;
        final Boolean _tmpIsVisited;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfIsVisited)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfIsVisited);
        }
        _tmpIsVisited = _tmp_2 == null ? null : _tmp_2 != 0;
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
        final Integer _tmpUserId;
        if (_cursor.isNull(_cursorIndexOfUserId)) {
          _tmpUserId = null;
        } else {
          _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
        }
        final String _tmpUsername;
        if (_cursor.isNull(_cursorIndexOfUsername)) {
          _tmpUsername = null;
        } else {
          _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
        }
        final String _tmpVisitedDate;
        if (_cursor.isNull(_cursorIndexOfVisitedDate)) {
          _tmpVisitedDate = null;
        } else {
          _tmpVisitedDate = _cursor.getString(_cursorIndexOfVisitedDate);
        }
        final String _tmpModeName;
        if (_cursor.isNull(_cursorIndexOfModeName)) {
          _tmpModeName = null;
        } else {
          _tmpModeName = _cursor.getString(_cursorIndexOfModeName);
        }
        final Integer _tmpVisitId;
        if (_cursor.isNull(_cursorIndexOfVisitId)) {
          _tmpVisitId = null;
        } else {
          _tmpVisitId = _cursor.getInt(_cursorIndexOfVisitId);
        }
        _item = new Visits(_tmpFullName,_tmpHFMISCode,_tmpHealthFacilityName,_tmpHfId,_tmpIsRepeat,_tmpIsSpecial,_tmpIsVisited,_tmpShiftId,_tmpShiftName,_tmpUserId,_tmpUsername,_tmpVisitedDate,_tmpModeName,_tmpVisitId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Visits> loadVisitByid(final String hfcode, final int shiftId, final int userId) {
    final String _sql = "SELECT * FROM visits where hFMISCode = ? and shiftId=? and userId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    if (hfcode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, hfcode);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, shiftId);
    _argIndex = 3;
    _statement.bindLong(_argIndex, userId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "fullName");
      final int _cursorIndexOfHFMISCode = CursorUtil.getColumnIndexOrThrow(_cursor, "hFMISCode");
      final int _cursorIndexOfHealthFacilityName = CursorUtil.getColumnIndexOrThrow(_cursor, "healthFacilityName");
      final int _cursorIndexOfHfId = CursorUtil.getColumnIndexOrThrow(_cursor, "hfId");
      final int _cursorIndexOfIsRepeat = CursorUtil.getColumnIndexOrThrow(_cursor, "isRepeat");
      final int _cursorIndexOfIsSpecial = CursorUtil.getColumnIndexOrThrow(_cursor, "isSpecial");
      final int _cursorIndexOfIsVisited = CursorUtil.getColumnIndexOrThrow(_cursor, "isVisited");
      final int _cursorIndexOfShiftId = CursorUtil.getColumnIndexOrThrow(_cursor, "shiftId");
      final int _cursorIndexOfShiftName = CursorUtil.getColumnIndexOrThrow(_cursor, "shiftName");
      final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
      final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
      final int _cursorIndexOfVisitedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visitedDate");
      final int _cursorIndexOfModeName = CursorUtil.getColumnIndexOrThrow(_cursor, "ModeName");
      final int _cursorIndexOfVisitId = CursorUtil.getColumnIndexOrThrow(_cursor, "VisitId");
      final List<Visits> _result = new ArrayList<Visits>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Visits _item;
        final String _tmpFullName;
        if (_cursor.isNull(_cursorIndexOfFullName)) {
          _tmpFullName = null;
        } else {
          _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
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
        final Integer _tmpHfId;
        if (_cursor.isNull(_cursorIndexOfHfId)) {
          _tmpHfId = null;
        } else {
          _tmpHfId = _cursor.getInt(_cursorIndexOfHfId);
        }
        final Boolean _tmpIsRepeat;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfIsRepeat)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfIsRepeat);
        }
        _tmpIsRepeat = _tmp == null ? null : _tmp != 0;
        final Boolean _tmpIsSpecial;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfIsSpecial)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfIsSpecial);
        }
        _tmpIsSpecial = _tmp_1 == null ? null : _tmp_1 != 0;
        final Boolean _tmpIsVisited;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfIsVisited)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfIsVisited);
        }
        _tmpIsVisited = _tmp_2 == null ? null : _tmp_2 != 0;
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
        final Integer _tmpUserId;
        if (_cursor.isNull(_cursorIndexOfUserId)) {
          _tmpUserId = null;
        } else {
          _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
        }
        final String _tmpUsername;
        if (_cursor.isNull(_cursorIndexOfUsername)) {
          _tmpUsername = null;
        } else {
          _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
        }
        final String _tmpVisitedDate;
        if (_cursor.isNull(_cursorIndexOfVisitedDate)) {
          _tmpVisitedDate = null;
        } else {
          _tmpVisitedDate = _cursor.getString(_cursorIndexOfVisitedDate);
        }
        final String _tmpModeName;
        if (_cursor.isNull(_cursorIndexOfModeName)) {
          _tmpModeName = null;
        } else {
          _tmpModeName = _cursor.getString(_cursorIndexOfModeName);
        }
        final Integer _tmpVisitId;
        if (_cursor.isNull(_cursorIndexOfVisitId)) {
          _tmpVisitId = null;
        } else {
          _tmpVisitId = _cursor.getInt(_cursorIndexOfVisitId);
        }
        _item = new Visits(_tmpFullName,_tmpHFMISCode,_tmpHealthFacilityName,_tmpHfId,_tmpIsRepeat,_tmpIsSpecial,_tmpIsVisited,_tmpShiftId,_tmpShiftName,_tmpUserId,_tmpUsername,_tmpVisitedDate,_tmpModeName,_tmpVisitId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Visits loadByVisitId(final int visitid) {
    final String _sql = "SELECT * FROM visits where  visitid=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, visitid);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "fullName");
      final int _cursorIndexOfHFMISCode = CursorUtil.getColumnIndexOrThrow(_cursor, "hFMISCode");
      final int _cursorIndexOfHealthFacilityName = CursorUtil.getColumnIndexOrThrow(_cursor, "healthFacilityName");
      final int _cursorIndexOfHfId = CursorUtil.getColumnIndexOrThrow(_cursor, "hfId");
      final int _cursorIndexOfIsRepeat = CursorUtil.getColumnIndexOrThrow(_cursor, "isRepeat");
      final int _cursorIndexOfIsSpecial = CursorUtil.getColumnIndexOrThrow(_cursor, "isSpecial");
      final int _cursorIndexOfIsVisited = CursorUtil.getColumnIndexOrThrow(_cursor, "isVisited");
      final int _cursorIndexOfShiftId = CursorUtil.getColumnIndexOrThrow(_cursor, "shiftId");
      final int _cursorIndexOfShiftName = CursorUtil.getColumnIndexOrThrow(_cursor, "shiftName");
      final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
      final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
      final int _cursorIndexOfVisitedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visitedDate");
      final int _cursorIndexOfModeName = CursorUtil.getColumnIndexOrThrow(_cursor, "ModeName");
      final int _cursorIndexOfVisitId = CursorUtil.getColumnIndexOrThrow(_cursor, "VisitId");
      final Visits _result;
      if(_cursor.moveToFirst()) {
        final String _tmpFullName;
        if (_cursor.isNull(_cursorIndexOfFullName)) {
          _tmpFullName = null;
        } else {
          _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
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
        final Integer _tmpHfId;
        if (_cursor.isNull(_cursorIndexOfHfId)) {
          _tmpHfId = null;
        } else {
          _tmpHfId = _cursor.getInt(_cursorIndexOfHfId);
        }
        final Boolean _tmpIsRepeat;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfIsRepeat)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfIsRepeat);
        }
        _tmpIsRepeat = _tmp == null ? null : _tmp != 0;
        final Boolean _tmpIsSpecial;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfIsSpecial)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfIsSpecial);
        }
        _tmpIsSpecial = _tmp_1 == null ? null : _tmp_1 != 0;
        final Boolean _tmpIsVisited;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfIsVisited)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfIsVisited);
        }
        _tmpIsVisited = _tmp_2 == null ? null : _tmp_2 != 0;
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
        final Integer _tmpUserId;
        if (_cursor.isNull(_cursorIndexOfUserId)) {
          _tmpUserId = null;
        } else {
          _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
        }
        final String _tmpUsername;
        if (_cursor.isNull(_cursorIndexOfUsername)) {
          _tmpUsername = null;
        } else {
          _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
        }
        final String _tmpVisitedDate;
        if (_cursor.isNull(_cursorIndexOfVisitedDate)) {
          _tmpVisitedDate = null;
        } else {
          _tmpVisitedDate = _cursor.getString(_cursorIndexOfVisitedDate);
        }
        final String _tmpModeName;
        if (_cursor.isNull(_cursorIndexOfModeName)) {
          _tmpModeName = null;
        } else {
          _tmpModeName = _cursor.getString(_cursorIndexOfModeName);
        }
        final Integer _tmpVisitId;
        if (_cursor.isNull(_cursorIndexOfVisitId)) {
          _tmpVisitId = null;
        } else {
          _tmpVisitId = _cursor.getInt(_cursorIndexOfVisitId);
        }
        _result = new Visits(_tmpFullName,_tmpHFMISCode,_tmpHealthFacilityName,_tmpHfId,_tmpIsRepeat,_tmpIsSpecial,_tmpIsVisited,_tmpShiftId,_tmpShiftName,_tmpUserId,_tmpUsername,_tmpVisitedDate,_tmpModeName,_tmpVisitId);
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
