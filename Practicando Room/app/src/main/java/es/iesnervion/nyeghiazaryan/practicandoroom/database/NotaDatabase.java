package es.iesnervion.nyeghiazaryan.practicandoroom.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import es.iesnervion.nyeghiazaryan.practicandoroom.Nota;

@Database(entities = {Nota.class}, version = 1)
public abstract class NotaDatabase extends RoomDatabase
{
    public abstract NotaDao getNotaDao();
}
