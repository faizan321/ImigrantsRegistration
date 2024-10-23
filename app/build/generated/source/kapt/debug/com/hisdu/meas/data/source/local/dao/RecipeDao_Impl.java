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
import com.hisdu.meas.data.model.Recipe;
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
public final class RecipeDao_Impl implements RecipeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Recipe> __insertionAdapterOfRecipe;

  private final EntityDeletionOrUpdateAdapter<Recipe> __deletionAdapterOfRecipe;

  private final EntityDeletionOrUpdateAdapter<Recipe> __updateAdapterOfRecipe;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllData;

  public RecipeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRecipe = new EntityInsertionAdapter<Recipe>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Recipe` (`recipeId`,`title`,`image`,`instructions`,`tag`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Recipe value) {
        if (value.getRecipeId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getRecipeId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getImage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImage());
        }
        if (value.getInstructions() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getInstructions());
        }
        if (value.getTag() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTag());
        }
      }
    };
    this.__deletionAdapterOfRecipe = new EntityDeletionOrUpdateAdapter<Recipe>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Recipe` WHERE `recipeId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Recipe value) {
        if (value.getRecipeId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getRecipeId());
        }
      }
    };
    this.__updateAdapterOfRecipe = new EntityDeletionOrUpdateAdapter<Recipe>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Recipe` SET `recipeId` = ?,`title` = ?,`image` = ?,`instructions` = ?,`tag` = ? WHERE `recipeId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Recipe value) {
        if (value.getRecipeId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getRecipeId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getImage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImage());
        }
        if (value.getInstructions() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getInstructions());
        }
        if (value.getTag() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTag());
        }
        if (value.getRecipeId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getRecipeId());
        }
      }
    };
    this.__preparedStmtOfDeleteAllData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Recipe";
        return _query;
      }
    };
  }

  @Override
  public void insert(final Recipe recipe) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRecipe.insert(recipe);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Recipe recipe) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfRecipe.handle(recipe);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Recipe recipe) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfRecipe.handle(recipe);
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
  public List<Recipe> loadAll() {
    final String _sql = "SELECT * FROM Recipe";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfRecipeId = CursorUtil.getColumnIndexOrThrow(_cursor, "recipeId");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfInstructions = CursorUtil.getColumnIndexOrThrow(_cursor, "instructions");
      final int _cursorIndexOfTag = CursorUtil.getColumnIndexOrThrow(_cursor, "tag");
      final List<Recipe> _result = new ArrayList<Recipe>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Recipe _item;
        final String _tmpRecipeId;
        if (_cursor.isNull(_cursorIndexOfRecipeId)) {
          _tmpRecipeId = null;
        } else {
          _tmpRecipeId = _cursor.getString(_cursorIndexOfRecipeId);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpImage;
        if (_cursor.isNull(_cursorIndexOfImage)) {
          _tmpImage = null;
        } else {
          _tmpImage = _cursor.getString(_cursorIndexOfImage);
        }
        final String _tmpInstructions;
        if (_cursor.isNull(_cursorIndexOfInstructions)) {
          _tmpInstructions = null;
        } else {
          _tmpInstructions = _cursor.getString(_cursorIndexOfInstructions);
        }
        final String _tmpTag;
        if (_cursor.isNull(_cursorIndexOfTag)) {
          _tmpTag = null;
        } else {
          _tmpTag = _cursor.getString(_cursorIndexOfTag);
        }
        _item = new Recipe(_tmpRecipeId,_tmpTitle,_tmpImage,_tmpInstructions,_tmpTag);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Recipe loadOneByRecipeId(final String recipeId) {
    final String _sql = "SELECT * FROM Recipe where recipeId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (recipeId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, recipeId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfRecipeId = CursorUtil.getColumnIndexOrThrow(_cursor, "recipeId");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfInstructions = CursorUtil.getColumnIndexOrThrow(_cursor, "instructions");
      final int _cursorIndexOfTag = CursorUtil.getColumnIndexOrThrow(_cursor, "tag");
      final Recipe _result;
      if(_cursor.moveToFirst()) {
        final String _tmpRecipeId;
        if (_cursor.isNull(_cursorIndexOfRecipeId)) {
          _tmpRecipeId = null;
        } else {
          _tmpRecipeId = _cursor.getString(_cursorIndexOfRecipeId);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpImage;
        if (_cursor.isNull(_cursorIndexOfImage)) {
          _tmpImage = null;
        } else {
          _tmpImage = _cursor.getString(_cursorIndexOfImage);
        }
        final String _tmpInstructions;
        if (_cursor.isNull(_cursorIndexOfInstructions)) {
          _tmpInstructions = null;
        } else {
          _tmpInstructions = _cursor.getString(_cursorIndexOfInstructions);
        }
        final String _tmpTag;
        if (_cursor.isNull(_cursorIndexOfTag)) {
          _tmpTag = null;
        } else {
          _tmpTag = _cursor.getString(_cursorIndexOfTag);
        }
        _result = new Recipe(_tmpRecipeId,_tmpTitle,_tmpImage,_tmpInstructions,_tmpTag);
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
