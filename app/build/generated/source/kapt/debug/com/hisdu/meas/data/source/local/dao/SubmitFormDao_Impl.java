package com.hisdu.meas.data.source.local.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.hisdu.meas.ui.Attendance.StaffModel;
import com.hisdu.meas.ui.Feedback.FeedbackSubmitModel;
import com.hisdu.meas.ui.Indicators.InspactorModel;
import com.hisdu.meas.ui.Indicators.ModuleToSave;
import com.hisdu.meas.ui.Indicators.SubmitFormModel;
import com.leopold.mvvm.data.db.converter.DateConverter;
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
public final class SubmitFormDao_Impl implements SubmitFormDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SubmitFormModel> __insertionAdapterOfSubmitFormModel;

  private final DateConverter __dateConverter = new DateConverter();

  private final EntityDeletionOrUpdateAdapter<SubmitFormModel> __deletionAdapterOfSubmitFormModel;

  private final EntityDeletionOrUpdateAdapter<SubmitFormModel> __updateAdapterOfSubmitFormModel;

  public SubmitFormDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSubmitFormModel = new EntityInsertionAdapter<SubmitFormModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `SubmitFormModel` (`HFMISCode`,`facilityType`,`visityType`,`visitId`,`facility`,`facilityName`,`facilityStatus`,`closeReason`,`comment`,`illegalOccupation`,`wholeOrPart`,`date`,`moduleId`,`applicationTypeid`,`latitude`,`longitude`,`CreatedOn`,`isFeedbackSubmited`,`attendanceList`,`listofModules`,`feedback`,`userid`,`isSync`,`incharge`,`id`,`visitTypeName`,`faciltyTypeName`,`AmbulanceNo`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SubmitFormModel value) {
        if (value.getHFMISCode() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getHFMISCode());
        }
        if (value.getFacilityType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFacilityType());
        }
        if (value.getVisityType() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getVisityType());
        }
        if (value.getVisitId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getVisitId());
        }
        if (value.getFacility() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getFacility());
        }
        if (value.getFacilityName() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getFacilityName());
        }
        final Integer _tmp = value.getFacilityStatus() == null ? null : (value.getFacilityStatus() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp);
        }
        if (value.getCloseReason() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getCloseReason());
        }
        if (value.getComment() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getComment());
        }
        final Integer _tmp_1 = value.getIllegalOccupation() == null ? null : (value.getIllegalOccupation() ? 1 : 0);
        if (_tmp_1 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, _tmp_1);
        }
        if (value.getWholeOrPart() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getWholeOrPart());
        }
        if (value.getDate() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getDate());
        }
        if (value.getModuleId() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindLong(13, value.getModuleId());
        }
        if (value.getApplicationTypeid() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getApplicationTypeid());
        }
        if (value.getLatitude() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getLatitude());
        }
        if (value.getLongitude() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getLongitude());
        }
        if (value.getCreatedOn() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getCreatedOn());
        }
        final Integer _tmp_2 = value.isFeedbackSubmited() == null ? null : (value.isFeedbackSubmited() ? 1 : 0);
        if (_tmp_2 == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindLong(18, _tmp_2);
        }
        final String _tmp_3 = __dateConverter.fromattendanceList(value.getAttendanceList());
        if (_tmp_3 == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, _tmp_3);
        }
        final String _tmp_4 = __dateConverter.fromModule(value.getListofModules());
        if (_tmp_4 == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, _tmp_4);
        }
        final String _tmp_5 = __dateConverter.fromfeedback(value.getFeedback());
        if (_tmp_5 == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, _tmp_5);
        }
        if (value.getUserid() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindLong(22, value.getUserid());
        }
        if (value.isSync() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindLong(23, value.isSync());
        }
        final String _tmp_6 = __dateConverter.frominspector(value.getIncharge());
        if (_tmp_6 == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, _tmp_6);
        }
        if (value.getId() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindLong(25, value.getId());
        }
        if (value.getVisitTypeName() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getVisitTypeName());
        }
        if (value.getFaciltyTypeName() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getFaciltyTypeName());
        }
        if (value.getAmbulanceNo() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getAmbulanceNo());
        }
      }
    };
    this.__deletionAdapterOfSubmitFormModel = new EntityDeletionOrUpdateAdapter<SubmitFormModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `SubmitFormModel` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SubmitFormModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfSubmitFormModel = new EntityDeletionOrUpdateAdapter<SubmitFormModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `SubmitFormModel` SET `HFMISCode` = ?,`facilityType` = ?,`visityType` = ?,`visitId` = ?,`facility` = ?,`facilityName` = ?,`facilityStatus` = ?,`closeReason` = ?,`comment` = ?,`illegalOccupation` = ?,`wholeOrPart` = ?,`date` = ?,`moduleId` = ?,`applicationTypeid` = ?,`latitude` = ?,`longitude` = ?,`CreatedOn` = ?,`isFeedbackSubmited` = ?,`attendanceList` = ?,`listofModules` = ?,`feedback` = ?,`userid` = ?,`isSync` = ?,`incharge` = ?,`id` = ?,`visitTypeName` = ?,`faciltyTypeName` = ?,`AmbulanceNo` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SubmitFormModel value) {
        if (value.getHFMISCode() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getHFMISCode());
        }
        if (value.getFacilityType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFacilityType());
        }
        if (value.getVisityType() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getVisityType());
        }
        if (value.getVisitId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getVisitId());
        }
        if (value.getFacility() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getFacility());
        }
        if (value.getFacilityName() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getFacilityName());
        }
        final Integer _tmp = value.getFacilityStatus() == null ? null : (value.getFacilityStatus() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp);
        }
        if (value.getCloseReason() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getCloseReason());
        }
        if (value.getComment() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getComment());
        }
        final Integer _tmp_1 = value.getIllegalOccupation() == null ? null : (value.getIllegalOccupation() ? 1 : 0);
        if (_tmp_1 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, _tmp_1);
        }
        if (value.getWholeOrPart() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getWholeOrPart());
        }
        if (value.getDate() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getDate());
        }
        if (value.getModuleId() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindLong(13, value.getModuleId());
        }
        if (value.getApplicationTypeid() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getApplicationTypeid());
        }
        if (value.getLatitude() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getLatitude());
        }
        if (value.getLongitude() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getLongitude());
        }
        if (value.getCreatedOn() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getCreatedOn());
        }
        final Integer _tmp_2 = value.isFeedbackSubmited() == null ? null : (value.isFeedbackSubmited() ? 1 : 0);
        if (_tmp_2 == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindLong(18, _tmp_2);
        }
        final String _tmp_3 = __dateConverter.fromattendanceList(value.getAttendanceList());
        if (_tmp_3 == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, _tmp_3);
        }
        final String _tmp_4 = __dateConverter.fromModule(value.getListofModules());
        if (_tmp_4 == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, _tmp_4);
        }
        final String _tmp_5 = __dateConverter.fromfeedback(value.getFeedback());
        if (_tmp_5 == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, _tmp_5);
        }
        if (value.getUserid() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindLong(22, value.getUserid());
        }
        if (value.isSync() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindLong(23, value.isSync());
        }
        final String _tmp_6 = __dateConverter.frominspector(value.getIncharge());
        if (_tmp_6 == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, _tmp_6);
        }
        if (value.getId() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindLong(25, value.getId());
        }
        if (value.getVisitTypeName() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getVisitTypeName());
        }
        if (value.getFaciltyTypeName() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getFaciltyTypeName());
        }
        if (value.getAmbulanceNo() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getAmbulanceNo());
        }
        if (value.getId() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindLong(29, value.getId());
        }
      }
    };
  }

  @Override
  public long insert(final SubmitFormModel recipe) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfSubmitFormModel.insertAndReturnId(recipe);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final SubmitFormModel recipe) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfSubmitFormModel.handle(recipe);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final SubmitFormModel recipe) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfSubmitFormModel.handle(recipe);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<SubmitFormModel> loadAll() {
    final String _sql = "SELECT * FROM submitformmodel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfHFMISCode = CursorUtil.getColumnIndexOrThrow(_cursor, "HFMISCode");
      final int _cursorIndexOfFacilityType = CursorUtil.getColumnIndexOrThrow(_cursor, "facilityType");
      final int _cursorIndexOfVisityType = CursorUtil.getColumnIndexOrThrow(_cursor, "visityType");
      final int _cursorIndexOfVisitId = CursorUtil.getColumnIndexOrThrow(_cursor, "visitId");
      final int _cursorIndexOfFacility = CursorUtil.getColumnIndexOrThrow(_cursor, "facility");
      final int _cursorIndexOfFacilityName = CursorUtil.getColumnIndexOrThrow(_cursor, "facilityName");
      final int _cursorIndexOfFacilityStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "facilityStatus");
      final int _cursorIndexOfCloseReason = CursorUtil.getColumnIndexOrThrow(_cursor, "closeReason");
      final int _cursorIndexOfComment = CursorUtil.getColumnIndexOrThrow(_cursor, "comment");
      final int _cursorIndexOfIllegalOccupation = CursorUtil.getColumnIndexOrThrow(_cursor, "illegalOccupation");
      final int _cursorIndexOfWholeOrPart = CursorUtil.getColumnIndexOrThrow(_cursor, "wholeOrPart");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfModuleId = CursorUtil.getColumnIndexOrThrow(_cursor, "moduleId");
      final int _cursorIndexOfApplicationTypeid = CursorUtil.getColumnIndexOrThrow(_cursor, "applicationTypeid");
      final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
      final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
      final int _cursorIndexOfCreatedOn = CursorUtil.getColumnIndexOrThrow(_cursor, "CreatedOn");
      final int _cursorIndexOfIsFeedbackSubmited = CursorUtil.getColumnIndexOrThrow(_cursor, "isFeedbackSubmited");
      final int _cursorIndexOfAttendanceList = CursorUtil.getColumnIndexOrThrow(_cursor, "attendanceList");
      final int _cursorIndexOfListofModules = CursorUtil.getColumnIndexOrThrow(_cursor, "listofModules");
      final int _cursorIndexOfFeedback = CursorUtil.getColumnIndexOrThrow(_cursor, "feedback");
      final int _cursorIndexOfUserid = CursorUtil.getColumnIndexOrThrow(_cursor, "userid");
      final int _cursorIndexOfIsSync = CursorUtil.getColumnIndexOrThrow(_cursor, "isSync");
      final int _cursorIndexOfIncharge = CursorUtil.getColumnIndexOrThrow(_cursor, "incharge");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfVisitTypeName = CursorUtil.getColumnIndexOrThrow(_cursor, "visitTypeName");
      final int _cursorIndexOfFaciltyTypeName = CursorUtil.getColumnIndexOrThrow(_cursor, "faciltyTypeName");
      final int _cursorIndexOfAmbulanceNo = CursorUtil.getColumnIndexOrThrow(_cursor, "AmbulanceNo");
      final List<SubmitFormModel> _result = new ArrayList<SubmitFormModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SubmitFormModel _item;
        final String _tmpHFMISCode;
        if (_cursor.isNull(_cursorIndexOfHFMISCode)) {
          _tmpHFMISCode = null;
        } else {
          _tmpHFMISCode = _cursor.getString(_cursorIndexOfHFMISCode);
        }
        final String _tmpFacilityType;
        if (_cursor.isNull(_cursorIndexOfFacilityType)) {
          _tmpFacilityType = null;
        } else {
          _tmpFacilityType = _cursor.getString(_cursorIndexOfFacilityType);
        }
        final String _tmpVisityType;
        if (_cursor.isNull(_cursorIndexOfVisityType)) {
          _tmpVisityType = null;
        } else {
          _tmpVisityType = _cursor.getString(_cursorIndexOfVisityType);
        }
        final Integer _tmpVisitId;
        if (_cursor.isNull(_cursorIndexOfVisitId)) {
          _tmpVisitId = null;
        } else {
          _tmpVisitId = _cursor.getInt(_cursorIndexOfVisitId);
        }
        final String _tmpFacility;
        if (_cursor.isNull(_cursorIndexOfFacility)) {
          _tmpFacility = null;
        } else {
          _tmpFacility = _cursor.getString(_cursorIndexOfFacility);
        }
        final String _tmpFacilityName;
        if (_cursor.isNull(_cursorIndexOfFacilityName)) {
          _tmpFacilityName = null;
        } else {
          _tmpFacilityName = _cursor.getString(_cursorIndexOfFacilityName);
        }
        final Boolean _tmpFacilityStatus;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfFacilityStatus)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfFacilityStatus);
        }
        _tmpFacilityStatus = _tmp == null ? null : _tmp != 0;
        final String _tmpCloseReason;
        if (_cursor.isNull(_cursorIndexOfCloseReason)) {
          _tmpCloseReason = null;
        } else {
          _tmpCloseReason = _cursor.getString(_cursorIndexOfCloseReason);
        }
        final String _tmpComment;
        if (_cursor.isNull(_cursorIndexOfComment)) {
          _tmpComment = null;
        } else {
          _tmpComment = _cursor.getString(_cursorIndexOfComment);
        }
        final Boolean _tmpIllegalOccupation;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfIllegalOccupation)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfIllegalOccupation);
        }
        _tmpIllegalOccupation = _tmp_1 == null ? null : _tmp_1 != 0;
        final String _tmpWholeOrPart;
        if (_cursor.isNull(_cursorIndexOfWholeOrPart)) {
          _tmpWholeOrPart = null;
        } else {
          _tmpWholeOrPart = _cursor.getString(_cursorIndexOfWholeOrPart);
        }
        final String _tmpDate;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmpDate = null;
        } else {
          _tmpDate = _cursor.getString(_cursorIndexOfDate);
        }
        final Integer _tmpModuleId;
        if (_cursor.isNull(_cursorIndexOfModuleId)) {
          _tmpModuleId = null;
        } else {
          _tmpModuleId = _cursor.getInt(_cursorIndexOfModuleId);
        }
        final Integer _tmpApplicationTypeid;
        if (_cursor.isNull(_cursorIndexOfApplicationTypeid)) {
          _tmpApplicationTypeid = null;
        } else {
          _tmpApplicationTypeid = _cursor.getInt(_cursorIndexOfApplicationTypeid);
        }
        final String _tmpLatitude;
        if (_cursor.isNull(_cursorIndexOfLatitude)) {
          _tmpLatitude = null;
        } else {
          _tmpLatitude = _cursor.getString(_cursorIndexOfLatitude);
        }
        final String _tmpLongitude;
        if (_cursor.isNull(_cursorIndexOfLongitude)) {
          _tmpLongitude = null;
        } else {
          _tmpLongitude = _cursor.getString(_cursorIndexOfLongitude);
        }
        final String _tmpCreatedOn;
        if (_cursor.isNull(_cursorIndexOfCreatedOn)) {
          _tmpCreatedOn = null;
        } else {
          _tmpCreatedOn = _cursor.getString(_cursorIndexOfCreatedOn);
        }
        final Boolean _tmpIsFeedbackSubmited;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfIsFeedbackSubmited)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfIsFeedbackSubmited);
        }
        _tmpIsFeedbackSubmited = _tmp_2 == null ? null : _tmp_2 != 0;
        final List<StaffModel> _tmpAttendanceList;
        final String _tmp_3;
        if (_cursor.isNull(_cursorIndexOfAttendanceList)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getString(_cursorIndexOfAttendanceList);
        }
        _tmpAttendanceList = __dateConverter.todattendanceList(_tmp_3);
        final List<ModuleToSave> _tmpListofModules;
        final String _tmp_4;
        if (_cursor.isNull(_cursorIndexOfListofModules)) {
          _tmp_4 = null;
        } else {
          _tmp_4 = _cursor.getString(_cursorIndexOfListofModules);
        }
        _tmpListofModules = __dateConverter.toModule(_tmp_4);
        final FeedbackSubmitModel _tmpFeedback;
        final String _tmp_5;
        if (_cursor.isNull(_cursorIndexOfFeedback)) {
          _tmp_5 = null;
        } else {
          _tmp_5 = _cursor.getString(_cursorIndexOfFeedback);
        }
        _tmpFeedback = __dateConverter.tofeedback(_tmp_5);
        final Integer _tmpUserid;
        if (_cursor.isNull(_cursorIndexOfUserid)) {
          _tmpUserid = null;
        } else {
          _tmpUserid = _cursor.getInt(_cursorIndexOfUserid);
        }
        final Integer _tmpIsSync;
        if (_cursor.isNull(_cursorIndexOfIsSync)) {
          _tmpIsSync = null;
        } else {
          _tmpIsSync = _cursor.getInt(_cursorIndexOfIsSync);
        }
        final InspactorModel _tmpIncharge;
        final String _tmp_6;
        if (_cursor.isNull(_cursorIndexOfIncharge)) {
          _tmp_6 = null;
        } else {
          _tmp_6 = _cursor.getString(_cursorIndexOfIncharge);
        }
        _tmpIncharge = __dateConverter.toinspector(_tmp_6);
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final String _tmpVisitTypeName;
        if (_cursor.isNull(_cursorIndexOfVisitTypeName)) {
          _tmpVisitTypeName = null;
        } else {
          _tmpVisitTypeName = _cursor.getString(_cursorIndexOfVisitTypeName);
        }
        final String _tmpFaciltyTypeName;
        if (_cursor.isNull(_cursorIndexOfFaciltyTypeName)) {
          _tmpFaciltyTypeName = null;
        } else {
          _tmpFaciltyTypeName = _cursor.getString(_cursorIndexOfFaciltyTypeName);
        }
        final String _tmpAmbulanceNo;
        if (_cursor.isNull(_cursorIndexOfAmbulanceNo)) {
          _tmpAmbulanceNo = null;
        } else {
          _tmpAmbulanceNo = _cursor.getString(_cursorIndexOfAmbulanceNo);
        }
        _item = new SubmitFormModel(_tmpHFMISCode,_tmpFacilityType,_tmpVisityType,_tmpVisitId,_tmpFacility,_tmpFacilityName,_tmpFacilityStatus,_tmpCloseReason,_tmpComment,_tmpIllegalOccupation,_tmpWholeOrPart,_tmpDate,_tmpModuleId,_tmpApplicationTypeid,_tmpLatitude,_tmpLongitude,_tmpCreatedOn,_tmpIsFeedbackSubmited,_tmpAttendanceList,_tmpListofModules,_tmpFeedback,_tmpUserid,_tmpIsSync,_tmpIncharge,_tmpId,_tmpVisitTypeName,_tmpFaciltyTypeName,_tmpAmbulanceNo);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SubmitFormModel> loadBySyncId(final int isSync, final String userid) {
    final String _sql = "SELECT * FROM submitformmodel where isSync = ? and userid=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, isSync);
    _argIndex = 2;
    if (userid == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userid);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfHFMISCode = CursorUtil.getColumnIndexOrThrow(_cursor, "HFMISCode");
      final int _cursorIndexOfFacilityType = CursorUtil.getColumnIndexOrThrow(_cursor, "facilityType");
      final int _cursorIndexOfVisityType = CursorUtil.getColumnIndexOrThrow(_cursor, "visityType");
      final int _cursorIndexOfVisitId = CursorUtil.getColumnIndexOrThrow(_cursor, "visitId");
      final int _cursorIndexOfFacility = CursorUtil.getColumnIndexOrThrow(_cursor, "facility");
      final int _cursorIndexOfFacilityName = CursorUtil.getColumnIndexOrThrow(_cursor, "facilityName");
      final int _cursorIndexOfFacilityStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "facilityStatus");
      final int _cursorIndexOfCloseReason = CursorUtil.getColumnIndexOrThrow(_cursor, "closeReason");
      final int _cursorIndexOfComment = CursorUtil.getColumnIndexOrThrow(_cursor, "comment");
      final int _cursorIndexOfIllegalOccupation = CursorUtil.getColumnIndexOrThrow(_cursor, "illegalOccupation");
      final int _cursorIndexOfWholeOrPart = CursorUtil.getColumnIndexOrThrow(_cursor, "wholeOrPart");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfModuleId = CursorUtil.getColumnIndexOrThrow(_cursor, "moduleId");
      final int _cursorIndexOfApplicationTypeid = CursorUtil.getColumnIndexOrThrow(_cursor, "applicationTypeid");
      final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
      final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
      final int _cursorIndexOfCreatedOn = CursorUtil.getColumnIndexOrThrow(_cursor, "CreatedOn");
      final int _cursorIndexOfIsFeedbackSubmited = CursorUtil.getColumnIndexOrThrow(_cursor, "isFeedbackSubmited");
      final int _cursorIndexOfAttendanceList = CursorUtil.getColumnIndexOrThrow(_cursor, "attendanceList");
      final int _cursorIndexOfListofModules = CursorUtil.getColumnIndexOrThrow(_cursor, "listofModules");
      final int _cursorIndexOfFeedback = CursorUtil.getColumnIndexOrThrow(_cursor, "feedback");
      final int _cursorIndexOfUserid = CursorUtil.getColumnIndexOrThrow(_cursor, "userid");
      final int _cursorIndexOfIsSync = CursorUtil.getColumnIndexOrThrow(_cursor, "isSync");
      final int _cursorIndexOfIncharge = CursorUtil.getColumnIndexOrThrow(_cursor, "incharge");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfVisitTypeName = CursorUtil.getColumnIndexOrThrow(_cursor, "visitTypeName");
      final int _cursorIndexOfFaciltyTypeName = CursorUtil.getColumnIndexOrThrow(_cursor, "faciltyTypeName");
      final int _cursorIndexOfAmbulanceNo = CursorUtil.getColumnIndexOrThrow(_cursor, "AmbulanceNo");
      final List<SubmitFormModel> _result = new ArrayList<SubmitFormModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SubmitFormModel _item;
        final String _tmpHFMISCode;
        if (_cursor.isNull(_cursorIndexOfHFMISCode)) {
          _tmpHFMISCode = null;
        } else {
          _tmpHFMISCode = _cursor.getString(_cursorIndexOfHFMISCode);
        }
        final String _tmpFacilityType;
        if (_cursor.isNull(_cursorIndexOfFacilityType)) {
          _tmpFacilityType = null;
        } else {
          _tmpFacilityType = _cursor.getString(_cursorIndexOfFacilityType);
        }
        final String _tmpVisityType;
        if (_cursor.isNull(_cursorIndexOfVisityType)) {
          _tmpVisityType = null;
        } else {
          _tmpVisityType = _cursor.getString(_cursorIndexOfVisityType);
        }
        final Integer _tmpVisitId;
        if (_cursor.isNull(_cursorIndexOfVisitId)) {
          _tmpVisitId = null;
        } else {
          _tmpVisitId = _cursor.getInt(_cursorIndexOfVisitId);
        }
        final String _tmpFacility;
        if (_cursor.isNull(_cursorIndexOfFacility)) {
          _tmpFacility = null;
        } else {
          _tmpFacility = _cursor.getString(_cursorIndexOfFacility);
        }
        final String _tmpFacilityName;
        if (_cursor.isNull(_cursorIndexOfFacilityName)) {
          _tmpFacilityName = null;
        } else {
          _tmpFacilityName = _cursor.getString(_cursorIndexOfFacilityName);
        }
        final Boolean _tmpFacilityStatus;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfFacilityStatus)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfFacilityStatus);
        }
        _tmpFacilityStatus = _tmp == null ? null : _tmp != 0;
        final String _tmpCloseReason;
        if (_cursor.isNull(_cursorIndexOfCloseReason)) {
          _tmpCloseReason = null;
        } else {
          _tmpCloseReason = _cursor.getString(_cursorIndexOfCloseReason);
        }
        final String _tmpComment;
        if (_cursor.isNull(_cursorIndexOfComment)) {
          _tmpComment = null;
        } else {
          _tmpComment = _cursor.getString(_cursorIndexOfComment);
        }
        final Boolean _tmpIllegalOccupation;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfIllegalOccupation)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfIllegalOccupation);
        }
        _tmpIllegalOccupation = _tmp_1 == null ? null : _tmp_1 != 0;
        final String _tmpWholeOrPart;
        if (_cursor.isNull(_cursorIndexOfWholeOrPart)) {
          _tmpWholeOrPart = null;
        } else {
          _tmpWholeOrPart = _cursor.getString(_cursorIndexOfWholeOrPart);
        }
        final String _tmpDate;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmpDate = null;
        } else {
          _tmpDate = _cursor.getString(_cursorIndexOfDate);
        }
        final Integer _tmpModuleId;
        if (_cursor.isNull(_cursorIndexOfModuleId)) {
          _tmpModuleId = null;
        } else {
          _tmpModuleId = _cursor.getInt(_cursorIndexOfModuleId);
        }
        final Integer _tmpApplicationTypeid;
        if (_cursor.isNull(_cursorIndexOfApplicationTypeid)) {
          _tmpApplicationTypeid = null;
        } else {
          _tmpApplicationTypeid = _cursor.getInt(_cursorIndexOfApplicationTypeid);
        }
        final String _tmpLatitude;
        if (_cursor.isNull(_cursorIndexOfLatitude)) {
          _tmpLatitude = null;
        } else {
          _tmpLatitude = _cursor.getString(_cursorIndexOfLatitude);
        }
        final String _tmpLongitude;
        if (_cursor.isNull(_cursorIndexOfLongitude)) {
          _tmpLongitude = null;
        } else {
          _tmpLongitude = _cursor.getString(_cursorIndexOfLongitude);
        }
        final String _tmpCreatedOn;
        if (_cursor.isNull(_cursorIndexOfCreatedOn)) {
          _tmpCreatedOn = null;
        } else {
          _tmpCreatedOn = _cursor.getString(_cursorIndexOfCreatedOn);
        }
        final Boolean _tmpIsFeedbackSubmited;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfIsFeedbackSubmited)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfIsFeedbackSubmited);
        }
        _tmpIsFeedbackSubmited = _tmp_2 == null ? null : _tmp_2 != 0;
        final List<StaffModel> _tmpAttendanceList;
        final String _tmp_3;
        if (_cursor.isNull(_cursorIndexOfAttendanceList)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getString(_cursorIndexOfAttendanceList);
        }
        _tmpAttendanceList = __dateConverter.todattendanceList(_tmp_3);
        final List<ModuleToSave> _tmpListofModules;
        final String _tmp_4;
        if (_cursor.isNull(_cursorIndexOfListofModules)) {
          _tmp_4 = null;
        } else {
          _tmp_4 = _cursor.getString(_cursorIndexOfListofModules);
        }
        _tmpListofModules = __dateConverter.toModule(_tmp_4);
        final FeedbackSubmitModel _tmpFeedback;
        final String _tmp_5;
        if (_cursor.isNull(_cursorIndexOfFeedback)) {
          _tmp_5 = null;
        } else {
          _tmp_5 = _cursor.getString(_cursorIndexOfFeedback);
        }
        _tmpFeedback = __dateConverter.tofeedback(_tmp_5);
        final Integer _tmpUserid;
        if (_cursor.isNull(_cursorIndexOfUserid)) {
          _tmpUserid = null;
        } else {
          _tmpUserid = _cursor.getInt(_cursorIndexOfUserid);
        }
        final Integer _tmpIsSync;
        if (_cursor.isNull(_cursorIndexOfIsSync)) {
          _tmpIsSync = null;
        } else {
          _tmpIsSync = _cursor.getInt(_cursorIndexOfIsSync);
        }
        final InspactorModel _tmpIncharge;
        final String _tmp_6;
        if (_cursor.isNull(_cursorIndexOfIncharge)) {
          _tmp_6 = null;
        } else {
          _tmp_6 = _cursor.getString(_cursorIndexOfIncharge);
        }
        _tmpIncharge = __dateConverter.toinspector(_tmp_6);
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final String _tmpVisitTypeName;
        if (_cursor.isNull(_cursorIndexOfVisitTypeName)) {
          _tmpVisitTypeName = null;
        } else {
          _tmpVisitTypeName = _cursor.getString(_cursorIndexOfVisitTypeName);
        }
        final String _tmpFaciltyTypeName;
        if (_cursor.isNull(_cursorIndexOfFaciltyTypeName)) {
          _tmpFaciltyTypeName = null;
        } else {
          _tmpFaciltyTypeName = _cursor.getString(_cursorIndexOfFaciltyTypeName);
        }
        final String _tmpAmbulanceNo;
        if (_cursor.isNull(_cursorIndexOfAmbulanceNo)) {
          _tmpAmbulanceNo = null;
        } else {
          _tmpAmbulanceNo = _cursor.getString(_cursorIndexOfAmbulanceNo);
        }
        _item = new SubmitFormModel(_tmpHFMISCode,_tmpFacilityType,_tmpVisityType,_tmpVisitId,_tmpFacility,_tmpFacilityName,_tmpFacilityStatus,_tmpCloseReason,_tmpComment,_tmpIllegalOccupation,_tmpWholeOrPart,_tmpDate,_tmpModuleId,_tmpApplicationTypeid,_tmpLatitude,_tmpLongitude,_tmpCreatedOn,_tmpIsFeedbackSubmited,_tmpAttendanceList,_tmpListofModules,_tmpFeedback,_tmpUserid,_tmpIsSync,_tmpIncharge,_tmpId,_tmpVisitTypeName,_tmpFaciltyTypeName,_tmpAmbulanceNo);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SubmitFormModel> loadSyncByHF(final int isSync, final int userid,
      final String facilityId) {
    final String _sql = "SELECT * FROM submitformmodel where isSync = ? and userid=? AND facility=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, isSync);
    _argIndex = 2;
    _statement.bindLong(_argIndex, userid);
    _argIndex = 3;
    if (facilityId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, facilityId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfHFMISCode = CursorUtil.getColumnIndexOrThrow(_cursor, "HFMISCode");
      final int _cursorIndexOfFacilityType = CursorUtil.getColumnIndexOrThrow(_cursor, "facilityType");
      final int _cursorIndexOfVisityType = CursorUtil.getColumnIndexOrThrow(_cursor, "visityType");
      final int _cursorIndexOfVisitId = CursorUtil.getColumnIndexOrThrow(_cursor, "visitId");
      final int _cursorIndexOfFacility = CursorUtil.getColumnIndexOrThrow(_cursor, "facility");
      final int _cursorIndexOfFacilityName = CursorUtil.getColumnIndexOrThrow(_cursor, "facilityName");
      final int _cursorIndexOfFacilityStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "facilityStatus");
      final int _cursorIndexOfCloseReason = CursorUtil.getColumnIndexOrThrow(_cursor, "closeReason");
      final int _cursorIndexOfComment = CursorUtil.getColumnIndexOrThrow(_cursor, "comment");
      final int _cursorIndexOfIllegalOccupation = CursorUtil.getColumnIndexOrThrow(_cursor, "illegalOccupation");
      final int _cursorIndexOfWholeOrPart = CursorUtil.getColumnIndexOrThrow(_cursor, "wholeOrPart");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfModuleId = CursorUtil.getColumnIndexOrThrow(_cursor, "moduleId");
      final int _cursorIndexOfApplicationTypeid = CursorUtil.getColumnIndexOrThrow(_cursor, "applicationTypeid");
      final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
      final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
      final int _cursorIndexOfCreatedOn = CursorUtil.getColumnIndexOrThrow(_cursor, "CreatedOn");
      final int _cursorIndexOfIsFeedbackSubmited = CursorUtil.getColumnIndexOrThrow(_cursor, "isFeedbackSubmited");
      final int _cursorIndexOfAttendanceList = CursorUtil.getColumnIndexOrThrow(_cursor, "attendanceList");
      final int _cursorIndexOfListofModules = CursorUtil.getColumnIndexOrThrow(_cursor, "listofModules");
      final int _cursorIndexOfFeedback = CursorUtil.getColumnIndexOrThrow(_cursor, "feedback");
      final int _cursorIndexOfUserid = CursorUtil.getColumnIndexOrThrow(_cursor, "userid");
      final int _cursorIndexOfIsSync = CursorUtil.getColumnIndexOrThrow(_cursor, "isSync");
      final int _cursorIndexOfIncharge = CursorUtil.getColumnIndexOrThrow(_cursor, "incharge");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfVisitTypeName = CursorUtil.getColumnIndexOrThrow(_cursor, "visitTypeName");
      final int _cursorIndexOfFaciltyTypeName = CursorUtil.getColumnIndexOrThrow(_cursor, "faciltyTypeName");
      final int _cursorIndexOfAmbulanceNo = CursorUtil.getColumnIndexOrThrow(_cursor, "AmbulanceNo");
      final List<SubmitFormModel> _result = new ArrayList<SubmitFormModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SubmitFormModel _item;
        final String _tmpHFMISCode;
        if (_cursor.isNull(_cursorIndexOfHFMISCode)) {
          _tmpHFMISCode = null;
        } else {
          _tmpHFMISCode = _cursor.getString(_cursorIndexOfHFMISCode);
        }
        final String _tmpFacilityType;
        if (_cursor.isNull(_cursorIndexOfFacilityType)) {
          _tmpFacilityType = null;
        } else {
          _tmpFacilityType = _cursor.getString(_cursorIndexOfFacilityType);
        }
        final String _tmpVisityType;
        if (_cursor.isNull(_cursorIndexOfVisityType)) {
          _tmpVisityType = null;
        } else {
          _tmpVisityType = _cursor.getString(_cursorIndexOfVisityType);
        }
        final Integer _tmpVisitId;
        if (_cursor.isNull(_cursorIndexOfVisitId)) {
          _tmpVisitId = null;
        } else {
          _tmpVisitId = _cursor.getInt(_cursorIndexOfVisitId);
        }
        final String _tmpFacility;
        if (_cursor.isNull(_cursorIndexOfFacility)) {
          _tmpFacility = null;
        } else {
          _tmpFacility = _cursor.getString(_cursorIndexOfFacility);
        }
        final String _tmpFacilityName;
        if (_cursor.isNull(_cursorIndexOfFacilityName)) {
          _tmpFacilityName = null;
        } else {
          _tmpFacilityName = _cursor.getString(_cursorIndexOfFacilityName);
        }
        final Boolean _tmpFacilityStatus;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfFacilityStatus)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfFacilityStatus);
        }
        _tmpFacilityStatus = _tmp == null ? null : _tmp != 0;
        final String _tmpCloseReason;
        if (_cursor.isNull(_cursorIndexOfCloseReason)) {
          _tmpCloseReason = null;
        } else {
          _tmpCloseReason = _cursor.getString(_cursorIndexOfCloseReason);
        }
        final String _tmpComment;
        if (_cursor.isNull(_cursorIndexOfComment)) {
          _tmpComment = null;
        } else {
          _tmpComment = _cursor.getString(_cursorIndexOfComment);
        }
        final Boolean _tmpIllegalOccupation;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfIllegalOccupation)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfIllegalOccupation);
        }
        _tmpIllegalOccupation = _tmp_1 == null ? null : _tmp_1 != 0;
        final String _tmpWholeOrPart;
        if (_cursor.isNull(_cursorIndexOfWholeOrPart)) {
          _tmpWholeOrPart = null;
        } else {
          _tmpWholeOrPart = _cursor.getString(_cursorIndexOfWholeOrPart);
        }
        final String _tmpDate;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmpDate = null;
        } else {
          _tmpDate = _cursor.getString(_cursorIndexOfDate);
        }
        final Integer _tmpModuleId;
        if (_cursor.isNull(_cursorIndexOfModuleId)) {
          _tmpModuleId = null;
        } else {
          _tmpModuleId = _cursor.getInt(_cursorIndexOfModuleId);
        }
        final Integer _tmpApplicationTypeid;
        if (_cursor.isNull(_cursorIndexOfApplicationTypeid)) {
          _tmpApplicationTypeid = null;
        } else {
          _tmpApplicationTypeid = _cursor.getInt(_cursorIndexOfApplicationTypeid);
        }
        final String _tmpLatitude;
        if (_cursor.isNull(_cursorIndexOfLatitude)) {
          _tmpLatitude = null;
        } else {
          _tmpLatitude = _cursor.getString(_cursorIndexOfLatitude);
        }
        final String _tmpLongitude;
        if (_cursor.isNull(_cursorIndexOfLongitude)) {
          _tmpLongitude = null;
        } else {
          _tmpLongitude = _cursor.getString(_cursorIndexOfLongitude);
        }
        final String _tmpCreatedOn;
        if (_cursor.isNull(_cursorIndexOfCreatedOn)) {
          _tmpCreatedOn = null;
        } else {
          _tmpCreatedOn = _cursor.getString(_cursorIndexOfCreatedOn);
        }
        final Boolean _tmpIsFeedbackSubmited;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfIsFeedbackSubmited)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfIsFeedbackSubmited);
        }
        _tmpIsFeedbackSubmited = _tmp_2 == null ? null : _tmp_2 != 0;
        final List<StaffModel> _tmpAttendanceList;
        final String _tmp_3;
        if (_cursor.isNull(_cursorIndexOfAttendanceList)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getString(_cursorIndexOfAttendanceList);
        }
        _tmpAttendanceList = __dateConverter.todattendanceList(_tmp_3);
        final List<ModuleToSave> _tmpListofModules;
        final String _tmp_4;
        if (_cursor.isNull(_cursorIndexOfListofModules)) {
          _tmp_4 = null;
        } else {
          _tmp_4 = _cursor.getString(_cursorIndexOfListofModules);
        }
        _tmpListofModules = __dateConverter.toModule(_tmp_4);
        final FeedbackSubmitModel _tmpFeedback;
        final String _tmp_5;
        if (_cursor.isNull(_cursorIndexOfFeedback)) {
          _tmp_5 = null;
        } else {
          _tmp_5 = _cursor.getString(_cursorIndexOfFeedback);
        }
        _tmpFeedback = __dateConverter.tofeedback(_tmp_5);
        final Integer _tmpUserid;
        if (_cursor.isNull(_cursorIndexOfUserid)) {
          _tmpUserid = null;
        } else {
          _tmpUserid = _cursor.getInt(_cursorIndexOfUserid);
        }
        final Integer _tmpIsSync;
        if (_cursor.isNull(_cursorIndexOfIsSync)) {
          _tmpIsSync = null;
        } else {
          _tmpIsSync = _cursor.getInt(_cursorIndexOfIsSync);
        }
        final InspactorModel _tmpIncharge;
        final String _tmp_6;
        if (_cursor.isNull(_cursorIndexOfIncharge)) {
          _tmp_6 = null;
        } else {
          _tmp_6 = _cursor.getString(_cursorIndexOfIncharge);
        }
        _tmpIncharge = __dateConverter.toinspector(_tmp_6);
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final String _tmpVisitTypeName;
        if (_cursor.isNull(_cursorIndexOfVisitTypeName)) {
          _tmpVisitTypeName = null;
        } else {
          _tmpVisitTypeName = _cursor.getString(_cursorIndexOfVisitTypeName);
        }
        final String _tmpFaciltyTypeName;
        if (_cursor.isNull(_cursorIndexOfFaciltyTypeName)) {
          _tmpFaciltyTypeName = null;
        } else {
          _tmpFaciltyTypeName = _cursor.getString(_cursorIndexOfFaciltyTypeName);
        }
        final String _tmpAmbulanceNo;
        if (_cursor.isNull(_cursorIndexOfAmbulanceNo)) {
          _tmpAmbulanceNo = null;
        } else {
          _tmpAmbulanceNo = _cursor.getString(_cursorIndexOfAmbulanceNo);
        }
        _item = new SubmitFormModel(_tmpHFMISCode,_tmpFacilityType,_tmpVisityType,_tmpVisitId,_tmpFacility,_tmpFacilityName,_tmpFacilityStatus,_tmpCloseReason,_tmpComment,_tmpIllegalOccupation,_tmpWholeOrPart,_tmpDate,_tmpModuleId,_tmpApplicationTypeid,_tmpLatitude,_tmpLongitude,_tmpCreatedOn,_tmpIsFeedbackSubmited,_tmpAttendanceList,_tmpListofModules,_tmpFeedback,_tmpUserid,_tmpIsSync,_tmpIncharge,_tmpId,_tmpVisitTypeName,_tmpFaciltyTypeName,_tmpAmbulanceNo);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public SubmitFormModel getPendingRecord(final int userid, final String facilityId) {
    final String _sql = "SELECT * FROM submitformmodel where isSync = 2 and userid=? AND facility=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, userid);
    _argIndex = 2;
    if (facilityId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, facilityId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfHFMISCode = CursorUtil.getColumnIndexOrThrow(_cursor, "HFMISCode");
      final int _cursorIndexOfFacilityType = CursorUtil.getColumnIndexOrThrow(_cursor, "facilityType");
      final int _cursorIndexOfVisityType = CursorUtil.getColumnIndexOrThrow(_cursor, "visityType");
      final int _cursorIndexOfVisitId = CursorUtil.getColumnIndexOrThrow(_cursor, "visitId");
      final int _cursorIndexOfFacility = CursorUtil.getColumnIndexOrThrow(_cursor, "facility");
      final int _cursorIndexOfFacilityName = CursorUtil.getColumnIndexOrThrow(_cursor, "facilityName");
      final int _cursorIndexOfFacilityStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "facilityStatus");
      final int _cursorIndexOfCloseReason = CursorUtil.getColumnIndexOrThrow(_cursor, "closeReason");
      final int _cursorIndexOfComment = CursorUtil.getColumnIndexOrThrow(_cursor, "comment");
      final int _cursorIndexOfIllegalOccupation = CursorUtil.getColumnIndexOrThrow(_cursor, "illegalOccupation");
      final int _cursorIndexOfWholeOrPart = CursorUtil.getColumnIndexOrThrow(_cursor, "wholeOrPart");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfModuleId = CursorUtil.getColumnIndexOrThrow(_cursor, "moduleId");
      final int _cursorIndexOfApplicationTypeid = CursorUtil.getColumnIndexOrThrow(_cursor, "applicationTypeid");
      final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
      final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
      final int _cursorIndexOfCreatedOn = CursorUtil.getColumnIndexOrThrow(_cursor, "CreatedOn");
      final int _cursorIndexOfIsFeedbackSubmited = CursorUtil.getColumnIndexOrThrow(_cursor, "isFeedbackSubmited");
      final int _cursorIndexOfAttendanceList = CursorUtil.getColumnIndexOrThrow(_cursor, "attendanceList");
      final int _cursorIndexOfListofModules = CursorUtil.getColumnIndexOrThrow(_cursor, "listofModules");
      final int _cursorIndexOfFeedback = CursorUtil.getColumnIndexOrThrow(_cursor, "feedback");
      final int _cursorIndexOfUserid = CursorUtil.getColumnIndexOrThrow(_cursor, "userid");
      final int _cursorIndexOfIsSync = CursorUtil.getColumnIndexOrThrow(_cursor, "isSync");
      final int _cursorIndexOfIncharge = CursorUtil.getColumnIndexOrThrow(_cursor, "incharge");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfVisitTypeName = CursorUtil.getColumnIndexOrThrow(_cursor, "visitTypeName");
      final int _cursorIndexOfFaciltyTypeName = CursorUtil.getColumnIndexOrThrow(_cursor, "faciltyTypeName");
      final int _cursorIndexOfAmbulanceNo = CursorUtil.getColumnIndexOrThrow(_cursor, "AmbulanceNo");
      final SubmitFormModel _result;
      if(_cursor.moveToFirst()) {
        final String _tmpHFMISCode;
        if (_cursor.isNull(_cursorIndexOfHFMISCode)) {
          _tmpHFMISCode = null;
        } else {
          _tmpHFMISCode = _cursor.getString(_cursorIndexOfHFMISCode);
        }
        final String _tmpFacilityType;
        if (_cursor.isNull(_cursorIndexOfFacilityType)) {
          _tmpFacilityType = null;
        } else {
          _tmpFacilityType = _cursor.getString(_cursorIndexOfFacilityType);
        }
        final String _tmpVisityType;
        if (_cursor.isNull(_cursorIndexOfVisityType)) {
          _tmpVisityType = null;
        } else {
          _tmpVisityType = _cursor.getString(_cursorIndexOfVisityType);
        }
        final Integer _tmpVisitId;
        if (_cursor.isNull(_cursorIndexOfVisitId)) {
          _tmpVisitId = null;
        } else {
          _tmpVisitId = _cursor.getInt(_cursorIndexOfVisitId);
        }
        final String _tmpFacility;
        if (_cursor.isNull(_cursorIndexOfFacility)) {
          _tmpFacility = null;
        } else {
          _tmpFacility = _cursor.getString(_cursorIndexOfFacility);
        }
        final String _tmpFacilityName;
        if (_cursor.isNull(_cursorIndexOfFacilityName)) {
          _tmpFacilityName = null;
        } else {
          _tmpFacilityName = _cursor.getString(_cursorIndexOfFacilityName);
        }
        final Boolean _tmpFacilityStatus;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfFacilityStatus)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfFacilityStatus);
        }
        _tmpFacilityStatus = _tmp == null ? null : _tmp != 0;
        final String _tmpCloseReason;
        if (_cursor.isNull(_cursorIndexOfCloseReason)) {
          _tmpCloseReason = null;
        } else {
          _tmpCloseReason = _cursor.getString(_cursorIndexOfCloseReason);
        }
        final String _tmpComment;
        if (_cursor.isNull(_cursorIndexOfComment)) {
          _tmpComment = null;
        } else {
          _tmpComment = _cursor.getString(_cursorIndexOfComment);
        }
        final Boolean _tmpIllegalOccupation;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfIllegalOccupation)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfIllegalOccupation);
        }
        _tmpIllegalOccupation = _tmp_1 == null ? null : _tmp_1 != 0;
        final String _tmpWholeOrPart;
        if (_cursor.isNull(_cursorIndexOfWholeOrPart)) {
          _tmpWholeOrPart = null;
        } else {
          _tmpWholeOrPart = _cursor.getString(_cursorIndexOfWholeOrPart);
        }
        final String _tmpDate;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmpDate = null;
        } else {
          _tmpDate = _cursor.getString(_cursorIndexOfDate);
        }
        final Integer _tmpModuleId;
        if (_cursor.isNull(_cursorIndexOfModuleId)) {
          _tmpModuleId = null;
        } else {
          _tmpModuleId = _cursor.getInt(_cursorIndexOfModuleId);
        }
        final Integer _tmpApplicationTypeid;
        if (_cursor.isNull(_cursorIndexOfApplicationTypeid)) {
          _tmpApplicationTypeid = null;
        } else {
          _tmpApplicationTypeid = _cursor.getInt(_cursorIndexOfApplicationTypeid);
        }
        final String _tmpLatitude;
        if (_cursor.isNull(_cursorIndexOfLatitude)) {
          _tmpLatitude = null;
        } else {
          _tmpLatitude = _cursor.getString(_cursorIndexOfLatitude);
        }
        final String _tmpLongitude;
        if (_cursor.isNull(_cursorIndexOfLongitude)) {
          _tmpLongitude = null;
        } else {
          _tmpLongitude = _cursor.getString(_cursorIndexOfLongitude);
        }
        final String _tmpCreatedOn;
        if (_cursor.isNull(_cursorIndexOfCreatedOn)) {
          _tmpCreatedOn = null;
        } else {
          _tmpCreatedOn = _cursor.getString(_cursorIndexOfCreatedOn);
        }
        final Boolean _tmpIsFeedbackSubmited;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfIsFeedbackSubmited)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfIsFeedbackSubmited);
        }
        _tmpIsFeedbackSubmited = _tmp_2 == null ? null : _tmp_2 != 0;
        final List<StaffModel> _tmpAttendanceList;
        final String _tmp_3;
        if (_cursor.isNull(_cursorIndexOfAttendanceList)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getString(_cursorIndexOfAttendanceList);
        }
        _tmpAttendanceList = __dateConverter.todattendanceList(_tmp_3);
        final List<ModuleToSave> _tmpListofModules;
        final String _tmp_4;
        if (_cursor.isNull(_cursorIndexOfListofModules)) {
          _tmp_4 = null;
        } else {
          _tmp_4 = _cursor.getString(_cursorIndexOfListofModules);
        }
        _tmpListofModules = __dateConverter.toModule(_tmp_4);
        final FeedbackSubmitModel _tmpFeedback;
        final String _tmp_5;
        if (_cursor.isNull(_cursorIndexOfFeedback)) {
          _tmp_5 = null;
        } else {
          _tmp_5 = _cursor.getString(_cursorIndexOfFeedback);
        }
        _tmpFeedback = __dateConverter.tofeedback(_tmp_5);
        final Integer _tmpUserid;
        if (_cursor.isNull(_cursorIndexOfUserid)) {
          _tmpUserid = null;
        } else {
          _tmpUserid = _cursor.getInt(_cursorIndexOfUserid);
        }
        final Integer _tmpIsSync;
        if (_cursor.isNull(_cursorIndexOfIsSync)) {
          _tmpIsSync = null;
        } else {
          _tmpIsSync = _cursor.getInt(_cursorIndexOfIsSync);
        }
        final InspactorModel _tmpIncharge;
        final String _tmp_6;
        if (_cursor.isNull(_cursorIndexOfIncharge)) {
          _tmp_6 = null;
        } else {
          _tmp_6 = _cursor.getString(_cursorIndexOfIncharge);
        }
        _tmpIncharge = __dateConverter.toinspector(_tmp_6);
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final String _tmpVisitTypeName;
        if (_cursor.isNull(_cursorIndexOfVisitTypeName)) {
          _tmpVisitTypeName = null;
        } else {
          _tmpVisitTypeName = _cursor.getString(_cursorIndexOfVisitTypeName);
        }
        final String _tmpFaciltyTypeName;
        if (_cursor.isNull(_cursorIndexOfFaciltyTypeName)) {
          _tmpFaciltyTypeName = null;
        } else {
          _tmpFaciltyTypeName = _cursor.getString(_cursorIndexOfFaciltyTypeName);
        }
        final String _tmpAmbulanceNo;
        if (_cursor.isNull(_cursorIndexOfAmbulanceNo)) {
          _tmpAmbulanceNo = null;
        } else {
          _tmpAmbulanceNo = _cursor.getString(_cursorIndexOfAmbulanceNo);
        }
        _result = new SubmitFormModel(_tmpHFMISCode,_tmpFacilityType,_tmpVisityType,_tmpVisitId,_tmpFacility,_tmpFacilityName,_tmpFacilityStatus,_tmpCloseReason,_tmpComment,_tmpIllegalOccupation,_tmpWholeOrPart,_tmpDate,_tmpModuleId,_tmpApplicationTypeid,_tmpLatitude,_tmpLongitude,_tmpCreatedOn,_tmpIsFeedbackSubmited,_tmpAttendanceList,_tmpListofModules,_tmpFeedback,_tmpUserid,_tmpIsSync,_tmpIncharge,_tmpId,_tmpVisitTypeName,_tmpFaciltyTypeName,_tmpAmbulanceNo);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SubmitFormModel> getPendingRecordByModule(final int userid,
      final int applicationTypeid) {
    final String _sql = "SELECT * FROM submitformmodel where isSync = 2 and userid=? AND  applicationTypeid=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, userid);
    _argIndex = 2;
    _statement.bindLong(_argIndex, applicationTypeid);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfHFMISCode = CursorUtil.getColumnIndexOrThrow(_cursor, "HFMISCode");
      final int _cursorIndexOfFacilityType = CursorUtil.getColumnIndexOrThrow(_cursor, "facilityType");
      final int _cursorIndexOfVisityType = CursorUtil.getColumnIndexOrThrow(_cursor, "visityType");
      final int _cursorIndexOfVisitId = CursorUtil.getColumnIndexOrThrow(_cursor, "visitId");
      final int _cursorIndexOfFacility = CursorUtil.getColumnIndexOrThrow(_cursor, "facility");
      final int _cursorIndexOfFacilityName = CursorUtil.getColumnIndexOrThrow(_cursor, "facilityName");
      final int _cursorIndexOfFacilityStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "facilityStatus");
      final int _cursorIndexOfCloseReason = CursorUtil.getColumnIndexOrThrow(_cursor, "closeReason");
      final int _cursorIndexOfComment = CursorUtil.getColumnIndexOrThrow(_cursor, "comment");
      final int _cursorIndexOfIllegalOccupation = CursorUtil.getColumnIndexOrThrow(_cursor, "illegalOccupation");
      final int _cursorIndexOfWholeOrPart = CursorUtil.getColumnIndexOrThrow(_cursor, "wholeOrPart");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfModuleId = CursorUtil.getColumnIndexOrThrow(_cursor, "moduleId");
      final int _cursorIndexOfApplicationTypeid = CursorUtil.getColumnIndexOrThrow(_cursor, "applicationTypeid");
      final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
      final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
      final int _cursorIndexOfCreatedOn = CursorUtil.getColumnIndexOrThrow(_cursor, "CreatedOn");
      final int _cursorIndexOfIsFeedbackSubmited = CursorUtil.getColumnIndexOrThrow(_cursor, "isFeedbackSubmited");
      final int _cursorIndexOfAttendanceList = CursorUtil.getColumnIndexOrThrow(_cursor, "attendanceList");
      final int _cursorIndexOfListofModules = CursorUtil.getColumnIndexOrThrow(_cursor, "listofModules");
      final int _cursorIndexOfFeedback = CursorUtil.getColumnIndexOrThrow(_cursor, "feedback");
      final int _cursorIndexOfUserid = CursorUtil.getColumnIndexOrThrow(_cursor, "userid");
      final int _cursorIndexOfIsSync = CursorUtil.getColumnIndexOrThrow(_cursor, "isSync");
      final int _cursorIndexOfIncharge = CursorUtil.getColumnIndexOrThrow(_cursor, "incharge");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfVisitTypeName = CursorUtil.getColumnIndexOrThrow(_cursor, "visitTypeName");
      final int _cursorIndexOfFaciltyTypeName = CursorUtil.getColumnIndexOrThrow(_cursor, "faciltyTypeName");
      final int _cursorIndexOfAmbulanceNo = CursorUtil.getColumnIndexOrThrow(_cursor, "AmbulanceNo");
      final List<SubmitFormModel> _result = new ArrayList<SubmitFormModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SubmitFormModel _item;
        final String _tmpHFMISCode;
        if (_cursor.isNull(_cursorIndexOfHFMISCode)) {
          _tmpHFMISCode = null;
        } else {
          _tmpHFMISCode = _cursor.getString(_cursorIndexOfHFMISCode);
        }
        final String _tmpFacilityType;
        if (_cursor.isNull(_cursorIndexOfFacilityType)) {
          _tmpFacilityType = null;
        } else {
          _tmpFacilityType = _cursor.getString(_cursorIndexOfFacilityType);
        }
        final String _tmpVisityType;
        if (_cursor.isNull(_cursorIndexOfVisityType)) {
          _tmpVisityType = null;
        } else {
          _tmpVisityType = _cursor.getString(_cursorIndexOfVisityType);
        }
        final Integer _tmpVisitId;
        if (_cursor.isNull(_cursorIndexOfVisitId)) {
          _tmpVisitId = null;
        } else {
          _tmpVisitId = _cursor.getInt(_cursorIndexOfVisitId);
        }
        final String _tmpFacility;
        if (_cursor.isNull(_cursorIndexOfFacility)) {
          _tmpFacility = null;
        } else {
          _tmpFacility = _cursor.getString(_cursorIndexOfFacility);
        }
        final String _tmpFacilityName;
        if (_cursor.isNull(_cursorIndexOfFacilityName)) {
          _tmpFacilityName = null;
        } else {
          _tmpFacilityName = _cursor.getString(_cursorIndexOfFacilityName);
        }
        final Boolean _tmpFacilityStatus;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfFacilityStatus)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfFacilityStatus);
        }
        _tmpFacilityStatus = _tmp == null ? null : _tmp != 0;
        final String _tmpCloseReason;
        if (_cursor.isNull(_cursorIndexOfCloseReason)) {
          _tmpCloseReason = null;
        } else {
          _tmpCloseReason = _cursor.getString(_cursorIndexOfCloseReason);
        }
        final String _tmpComment;
        if (_cursor.isNull(_cursorIndexOfComment)) {
          _tmpComment = null;
        } else {
          _tmpComment = _cursor.getString(_cursorIndexOfComment);
        }
        final Boolean _tmpIllegalOccupation;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfIllegalOccupation)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfIllegalOccupation);
        }
        _tmpIllegalOccupation = _tmp_1 == null ? null : _tmp_1 != 0;
        final String _tmpWholeOrPart;
        if (_cursor.isNull(_cursorIndexOfWholeOrPart)) {
          _tmpWholeOrPart = null;
        } else {
          _tmpWholeOrPart = _cursor.getString(_cursorIndexOfWholeOrPart);
        }
        final String _tmpDate;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmpDate = null;
        } else {
          _tmpDate = _cursor.getString(_cursorIndexOfDate);
        }
        final Integer _tmpModuleId;
        if (_cursor.isNull(_cursorIndexOfModuleId)) {
          _tmpModuleId = null;
        } else {
          _tmpModuleId = _cursor.getInt(_cursorIndexOfModuleId);
        }
        final Integer _tmpApplicationTypeid;
        if (_cursor.isNull(_cursorIndexOfApplicationTypeid)) {
          _tmpApplicationTypeid = null;
        } else {
          _tmpApplicationTypeid = _cursor.getInt(_cursorIndexOfApplicationTypeid);
        }
        final String _tmpLatitude;
        if (_cursor.isNull(_cursorIndexOfLatitude)) {
          _tmpLatitude = null;
        } else {
          _tmpLatitude = _cursor.getString(_cursorIndexOfLatitude);
        }
        final String _tmpLongitude;
        if (_cursor.isNull(_cursorIndexOfLongitude)) {
          _tmpLongitude = null;
        } else {
          _tmpLongitude = _cursor.getString(_cursorIndexOfLongitude);
        }
        final String _tmpCreatedOn;
        if (_cursor.isNull(_cursorIndexOfCreatedOn)) {
          _tmpCreatedOn = null;
        } else {
          _tmpCreatedOn = _cursor.getString(_cursorIndexOfCreatedOn);
        }
        final Boolean _tmpIsFeedbackSubmited;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfIsFeedbackSubmited)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfIsFeedbackSubmited);
        }
        _tmpIsFeedbackSubmited = _tmp_2 == null ? null : _tmp_2 != 0;
        final List<StaffModel> _tmpAttendanceList;
        final String _tmp_3;
        if (_cursor.isNull(_cursorIndexOfAttendanceList)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getString(_cursorIndexOfAttendanceList);
        }
        _tmpAttendanceList = __dateConverter.todattendanceList(_tmp_3);
        final List<ModuleToSave> _tmpListofModules;
        final String _tmp_4;
        if (_cursor.isNull(_cursorIndexOfListofModules)) {
          _tmp_4 = null;
        } else {
          _tmp_4 = _cursor.getString(_cursorIndexOfListofModules);
        }
        _tmpListofModules = __dateConverter.toModule(_tmp_4);
        final FeedbackSubmitModel _tmpFeedback;
        final String _tmp_5;
        if (_cursor.isNull(_cursorIndexOfFeedback)) {
          _tmp_5 = null;
        } else {
          _tmp_5 = _cursor.getString(_cursorIndexOfFeedback);
        }
        _tmpFeedback = __dateConverter.tofeedback(_tmp_5);
        final Integer _tmpUserid;
        if (_cursor.isNull(_cursorIndexOfUserid)) {
          _tmpUserid = null;
        } else {
          _tmpUserid = _cursor.getInt(_cursorIndexOfUserid);
        }
        final Integer _tmpIsSync;
        if (_cursor.isNull(_cursorIndexOfIsSync)) {
          _tmpIsSync = null;
        } else {
          _tmpIsSync = _cursor.getInt(_cursorIndexOfIsSync);
        }
        final InspactorModel _tmpIncharge;
        final String _tmp_6;
        if (_cursor.isNull(_cursorIndexOfIncharge)) {
          _tmp_6 = null;
        } else {
          _tmp_6 = _cursor.getString(_cursorIndexOfIncharge);
        }
        _tmpIncharge = __dateConverter.toinspector(_tmp_6);
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final String _tmpVisitTypeName;
        if (_cursor.isNull(_cursorIndexOfVisitTypeName)) {
          _tmpVisitTypeName = null;
        } else {
          _tmpVisitTypeName = _cursor.getString(_cursorIndexOfVisitTypeName);
        }
        final String _tmpFaciltyTypeName;
        if (_cursor.isNull(_cursorIndexOfFaciltyTypeName)) {
          _tmpFaciltyTypeName = null;
        } else {
          _tmpFaciltyTypeName = _cursor.getString(_cursorIndexOfFaciltyTypeName);
        }
        final String _tmpAmbulanceNo;
        if (_cursor.isNull(_cursorIndexOfAmbulanceNo)) {
          _tmpAmbulanceNo = null;
        } else {
          _tmpAmbulanceNo = _cursor.getString(_cursorIndexOfAmbulanceNo);
        }
        _item = new SubmitFormModel(_tmpHFMISCode,_tmpFacilityType,_tmpVisityType,_tmpVisitId,_tmpFacility,_tmpFacilityName,_tmpFacilityStatus,_tmpCloseReason,_tmpComment,_tmpIllegalOccupation,_tmpWholeOrPart,_tmpDate,_tmpModuleId,_tmpApplicationTypeid,_tmpLatitude,_tmpLongitude,_tmpCreatedOn,_tmpIsFeedbackSubmited,_tmpAttendanceList,_tmpListofModules,_tmpFeedback,_tmpUserid,_tmpIsSync,_tmpIncharge,_tmpId,_tmpVisitTypeName,_tmpFaciltyTypeName,_tmpAmbulanceNo);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public SubmitFormModel getPendingForId(final int userid, final int moduleId,
      final int applicationTypeid, final String facilityType, final String facilty,
      final String visitType) {
    final String _sql = "SELECT * FROM submitformmodel where isSync = 2 and userid=? AND moduleId=? AND applicationTypeid=? AND facilityType=? AND facility=? AND visityType=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 6);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, userid);
    _argIndex = 2;
    _statement.bindLong(_argIndex, moduleId);
    _argIndex = 3;
    _statement.bindLong(_argIndex, applicationTypeid);
    _argIndex = 4;
    if (facilityType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, facilityType);
    }
    _argIndex = 5;
    if (facilty == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, facilty);
    }
    _argIndex = 6;
    if (visitType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, visitType);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfHFMISCode = CursorUtil.getColumnIndexOrThrow(_cursor, "HFMISCode");
      final int _cursorIndexOfFacilityType = CursorUtil.getColumnIndexOrThrow(_cursor, "facilityType");
      final int _cursorIndexOfVisityType = CursorUtil.getColumnIndexOrThrow(_cursor, "visityType");
      final int _cursorIndexOfVisitId = CursorUtil.getColumnIndexOrThrow(_cursor, "visitId");
      final int _cursorIndexOfFacility = CursorUtil.getColumnIndexOrThrow(_cursor, "facility");
      final int _cursorIndexOfFacilityName = CursorUtil.getColumnIndexOrThrow(_cursor, "facilityName");
      final int _cursorIndexOfFacilityStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "facilityStatus");
      final int _cursorIndexOfCloseReason = CursorUtil.getColumnIndexOrThrow(_cursor, "closeReason");
      final int _cursorIndexOfComment = CursorUtil.getColumnIndexOrThrow(_cursor, "comment");
      final int _cursorIndexOfIllegalOccupation = CursorUtil.getColumnIndexOrThrow(_cursor, "illegalOccupation");
      final int _cursorIndexOfWholeOrPart = CursorUtil.getColumnIndexOrThrow(_cursor, "wholeOrPart");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfModuleId = CursorUtil.getColumnIndexOrThrow(_cursor, "moduleId");
      final int _cursorIndexOfApplicationTypeid = CursorUtil.getColumnIndexOrThrow(_cursor, "applicationTypeid");
      final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
      final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
      final int _cursorIndexOfCreatedOn = CursorUtil.getColumnIndexOrThrow(_cursor, "CreatedOn");
      final int _cursorIndexOfIsFeedbackSubmited = CursorUtil.getColumnIndexOrThrow(_cursor, "isFeedbackSubmited");
      final int _cursorIndexOfAttendanceList = CursorUtil.getColumnIndexOrThrow(_cursor, "attendanceList");
      final int _cursorIndexOfListofModules = CursorUtil.getColumnIndexOrThrow(_cursor, "listofModules");
      final int _cursorIndexOfFeedback = CursorUtil.getColumnIndexOrThrow(_cursor, "feedback");
      final int _cursorIndexOfUserid = CursorUtil.getColumnIndexOrThrow(_cursor, "userid");
      final int _cursorIndexOfIsSync = CursorUtil.getColumnIndexOrThrow(_cursor, "isSync");
      final int _cursorIndexOfIncharge = CursorUtil.getColumnIndexOrThrow(_cursor, "incharge");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfVisitTypeName = CursorUtil.getColumnIndexOrThrow(_cursor, "visitTypeName");
      final int _cursorIndexOfFaciltyTypeName = CursorUtil.getColumnIndexOrThrow(_cursor, "faciltyTypeName");
      final int _cursorIndexOfAmbulanceNo = CursorUtil.getColumnIndexOrThrow(_cursor, "AmbulanceNo");
      final SubmitFormModel _result;
      if(_cursor.moveToFirst()) {
        final String _tmpHFMISCode;
        if (_cursor.isNull(_cursorIndexOfHFMISCode)) {
          _tmpHFMISCode = null;
        } else {
          _tmpHFMISCode = _cursor.getString(_cursorIndexOfHFMISCode);
        }
        final String _tmpFacilityType;
        if (_cursor.isNull(_cursorIndexOfFacilityType)) {
          _tmpFacilityType = null;
        } else {
          _tmpFacilityType = _cursor.getString(_cursorIndexOfFacilityType);
        }
        final String _tmpVisityType;
        if (_cursor.isNull(_cursorIndexOfVisityType)) {
          _tmpVisityType = null;
        } else {
          _tmpVisityType = _cursor.getString(_cursorIndexOfVisityType);
        }
        final Integer _tmpVisitId;
        if (_cursor.isNull(_cursorIndexOfVisitId)) {
          _tmpVisitId = null;
        } else {
          _tmpVisitId = _cursor.getInt(_cursorIndexOfVisitId);
        }
        final String _tmpFacility;
        if (_cursor.isNull(_cursorIndexOfFacility)) {
          _tmpFacility = null;
        } else {
          _tmpFacility = _cursor.getString(_cursorIndexOfFacility);
        }
        final String _tmpFacilityName;
        if (_cursor.isNull(_cursorIndexOfFacilityName)) {
          _tmpFacilityName = null;
        } else {
          _tmpFacilityName = _cursor.getString(_cursorIndexOfFacilityName);
        }
        final Boolean _tmpFacilityStatus;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfFacilityStatus)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfFacilityStatus);
        }
        _tmpFacilityStatus = _tmp == null ? null : _tmp != 0;
        final String _tmpCloseReason;
        if (_cursor.isNull(_cursorIndexOfCloseReason)) {
          _tmpCloseReason = null;
        } else {
          _tmpCloseReason = _cursor.getString(_cursorIndexOfCloseReason);
        }
        final String _tmpComment;
        if (_cursor.isNull(_cursorIndexOfComment)) {
          _tmpComment = null;
        } else {
          _tmpComment = _cursor.getString(_cursorIndexOfComment);
        }
        final Boolean _tmpIllegalOccupation;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfIllegalOccupation)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfIllegalOccupation);
        }
        _tmpIllegalOccupation = _tmp_1 == null ? null : _tmp_1 != 0;
        final String _tmpWholeOrPart;
        if (_cursor.isNull(_cursorIndexOfWholeOrPart)) {
          _tmpWholeOrPart = null;
        } else {
          _tmpWholeOrPart = _cursor.getString(_cursorIndexOfWholeOrPart);
        }
        final String _tmpDate;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmpDate = null;
        } else {
          _tmpDate = _cursor.getString(_cursorIndexOfDate);
        }
        final Integer _tmpModuleId;
        if (_cursor.isNull(_cursorIndexOfModuleId)) {
          _tmpModuleId = null;
        } else {
          _tmpModuleId = _cursor.getInt(_cursorIndexOfModuleId);
        }
        final Integer _tmpApplicationTypeid;
        if (_cursor.isNull(_cursorIndexOfApplicationTypeid)) {
          _tmpApplicationTypeid = null;
        } else {
          _tmpApplicationTypeid = _cursor.getInt(_cursorIndexOfApplicationTypeid);
        }
        final String _tmpLatitude;
        if (_cursor.isNull(_cursorIndexOfLatitude)) {
          _tmpLatitude = null;
        } else {
          _tmpLatitude = _cursor.getString(_cursorIndexOfLatitude);
        }
        final String _tmpLongitude;
        if (_cursor.isNull(_cursorIndexOfLongitude)) {
          _tmpLongitude = null;
        } else {
          _tmpLongitude = _cursor.getString(_cursorIndexOfLongitude);
        }
        final String _tmpCreatedOn;
        if (_cursor.isNull(_cursorIndexOfCreatedOn)) {
          _tmpCreatedOn = null;
        } else {
          _tmpCreatedOn = _cursor.getString(_cursorIndexOfCreatedOn);
        }
        final Boolean _tmpIsFeedbackSubmited;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfIsFeedbackSubmited)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfIsFeedbackSubmited);
        }
        _tmpIsFeedbackSubmited = _tmp_2 == null ? null : _tmp_2 != 0;
        final List<StaffModel> _tmpAttendanceList;
        final String _tmp_3;
        if (_cursor.isNull(_cursorIndexOfAttendanceList)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getString(_cursorIndexOfAttendanceList);
        }
        _tmpAttendanceList = __dateConverter.todattendanceList(_tmp_3);
        final List<ModuleToSave> _tmpListofModules;
        final String _tmp_4;
        if (_cursor.isNull(_cursorIndexOfListofModules)) {
          _tmp_4 = null;
        } else {
          _tmp_4 = _cursor.getString(_cursorIndexOfListofModules);
        }
        _tmpListofModules = __dateConverter.toModule(_tmp_4);
        final FeedbackSubmitModel _tmpFeedback;
        final String _tmp_5;
        if (_cursor.isNull(_cursorIndexOfFeedback)) {
          _tmp_5 = null;
        } else {
          _tmp_5 = _cursor.getString(_cursorIndexOfFeedback);
        }
        _tmpFeedback = __dateConverter.tofeedback(_tmp_5);
        final Integer _tmpUserid;
        if (_cursor.isNull(_cursorIndexOfUserid)) {
          _tmpUserid = null;
        } else {
          _tmpUserid = _cursor.getInt(_cursorIndexOfUserid);
        }
        final Integer _tmpIsSync;
        if (_cursor.isNull(_cursorIndexOfIsSync)) {
          _tmpIsSync = null;
        } else {
          _tmpIsSync = _cursor.getInt(_cursorIndexOfIsSync);
        }
        final InspactorModel _tmpIncharge;
        final String _tmp_6;
        if (_cursor.isNull(_cursorIndexOfIncharge)) {
          _tmp_6 = null;
        } else {
          _tmp_6 = _cursor.getString(_cursorIndexOfIncharge);
        }
        _tmpIncharge = __dateConverter.toinspector(_tmp_6);
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final String _tmpVisitTypeName;
        if (_cursor.isNull(_cursorIndexOfVisitTypeName)) {
          _tmpVisitTypeName = null;
        } else {
          _tmpVisitTypeName = _cursor.getString(_cursorIndexOfVisitTypeName);
        }
        final String _tmpFaciltyTypeName;
        if (_cursor.isNull(_cursorIndexOfFaciltyTypeName)) {
          _tmpFaciltyTypeName = null;
        } else {
          _tmpFaciltyTypeName = _cursor.getString(_cursorIndexOfFaciltyTypeName);
        }
        final String _tmpAmbulanceNo;
        if (_cursor.isNull(_cursorIndexOfAmbulanceNo)) {
          _tmpAmbulanceNo = null;
        } else {
          _tmpAmbulanceNo = _cursor.getString(_cursorIndexOfAmbulanceNo);
        }
        _result = new SubmitFormModel(_tmpHFMISCode,_tmpFacilityType,_tmpVisityType,_tmpVisitId,_tmpFacility,_tmpFacilityName,_tmpFacilityStatus,_tmpCloseReason,_tmpComment,_tmpIllegalOccupation,_tmpWholeOrPart,_tmpDate,_tmpModuleId,_tmpApplicationTypeid,_tmpLatitude,_tmpLongitude,_tmpCreatedOn,_tmpIsFeedbackSubmited,_tmpAttendanceList,_tmpListofModules,_tmpFeedback,_tmpUserid,_tmpIsSync,_tmpIncharge,_tmpId,_tmpVisitTypeName,_tmpFaciltyTypeName,_tmpAmbulanceNo);
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
