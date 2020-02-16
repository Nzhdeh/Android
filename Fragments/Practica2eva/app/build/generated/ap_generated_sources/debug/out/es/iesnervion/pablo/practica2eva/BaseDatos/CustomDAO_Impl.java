package es.iesnervion.pablo.practica2eva.BaseDatos;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import es.iesnervion.pablo.practica2eva.Entidades.ClsPersona;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class CustomDAO_Impl implements CustomDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfClsPersona;

  public CustomDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfClsPersona = new EntityInsertionAdapter<ClsPersona>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `ClsPersona`(`ID`,`nombre`,`apellidos`,`direccion`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ClsPersona value) {
        stmt.bindLong(1, value.getID());
        if (value.getNombre() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNombre());
        }
        if (value.getApellidos() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getApellidos());
        }
        if (value.getDireccion() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDireccion());
        }
      }
    };
  }

  @Override
  public void insertarPersona(ClsPersona persona) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfClsPersona.insert(persona);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<ClsPersona> obtenerPersonas() {
    final String _sql = "SELECT * FROM ClsPersona";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfID = _cursor.getColumnIndexOrThrow("ID");
      final int _cursorIndexOfNombre = _cursor.getColumnIndexOrThrow("nombre");
      final int _cursorIndexOfApellidos = _cursor.getColumnIndexOrThrow("apellidos");
      final int _cursorIndexOfDireccion = _cursor.getColumnIndexOrThrow("direccion");
      final List<ClsPersona> _result = new ArrayList<ClsPersona>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ClsPersona _item;
        _item = new ClsPersona();
        final int _tmpID;
        _tmpID = _cursor.getInt(_cursorIndexOfID);
        _item.setID(_tmpID);
        final String _tmpNombre;
        _tmpNombre = _cursor.getString(_cursorIndexOfNombre);
        _item.setNombre(_tmpNombre);
        final String _tmpApellidos;
        _tmpApellidos = _cursor.getString(_cursorIndexOfApellidos);
        _item.setApellidos(_tmpApellidos);
        final String _tmpDireccion;
        _tmpDireccion = _cursor.getString(_cursorIndexOfDireccion);
        _item.setDireccion(_tmpDireccion);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
