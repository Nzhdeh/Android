package es.iesnervion.nyeghiazaryan.mascotaspersonasroom.bbdd;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.clases.Mascota;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.clases.Persona;

@Database(entities = {Persona.class, Mascota.class}, version = 1)
public abstract class MascotasBBDD extends RoomDatabase
{
    @SuppressWarnings("WeakerAccess")
    public abstract MascotasDAO getMascotaDao();
}
