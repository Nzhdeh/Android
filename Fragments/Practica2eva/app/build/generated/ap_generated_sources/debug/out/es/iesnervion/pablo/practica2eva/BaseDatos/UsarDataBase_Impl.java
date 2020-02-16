package es.iesnervion.pablo.practica2eva.BaseDatos;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class UsarDataBase_Impl extends UsarDataBase {
  private volatile CustomDAO _customDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ClsPersona` (`ID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `nombre` TEXT, `apellidos` TEXT, `direccion` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"7e6bc51ce8ff98ffe1d301b4af6f1c99\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `ClsPersona`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsClsPersona = new HashMap<String, TableInfo.Column>(4);
        _columnsClsPersona.put("ID", new TableInfo.Column("ID", "INTEGER", true, 1));
        _columnsClsPersona.put("nombre", new TableInfo.Column("nombre", "TEXT", false, 0));
        _columnsClsPersona.put("apellidos", new TableInfo.Column("apellidos", "TEXT", false, 0));
        _columnsClsPersona.put("direccion", new TableInfo.Column("direccion", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysClsPersona = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesClsPersona = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoClsPersona = new TableInfo("ClsPersona", _columnsClsPersona, _foreignKeysClsPersona, _indicesClsPersona);
        final TableInfo _existingClsPersona = TableInfo.read(_db, "ClsPersona");
        if (! _infoClsPersona.equals(_existingClsPersona)) {
          throw new IllegalStateException("Migration didn't properly handle ClsPersona(es.iesnervion.pablo.practica2eva.Entidades.ClsPersona).\n"
                  + " Expected:\n" + _infoClsPersona + "\n"
                  + " Found:\n" + _existingClsPersona);
        }
      }
    }, "7e6bc51ce8ff98ffe1d301b4af6f1c99", "7a7eb5738989d66c2e4ecea2b10cea58");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "ClsPersona");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `ClsPersona`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public CustomDAO dao() {
    if (_customDAO != null) {
      return _customDAO;
    } else {
      synchronized(this) {
        if(_customDAO == null) {
          _customDAO = new CustomDAO_Impl(this);
        }
        return _customDAO;
      }
    }
  }
}
