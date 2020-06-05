package es.iesnervion.nyeghiazaryan.practicandoroomconvmyfragments.bbdd;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import es.iesnervion.nyeghiazaryan.practicandoroomconvmyfragments.clases.Nba;

@Database(entities = {Nba.class}, version = 1)
public abstract class NbaDatabase extends RoomDatabase
{
    public abstract NbaDAO getNbaDao();
}
