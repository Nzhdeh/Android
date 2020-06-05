package es.iesnervion.nyeghiazaryan.roomviewmodelfragments.bbdd;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.clases.Persona;

@Database(entities = {Persona.class}, version = 1)
public abstract class PersonaBBDD extends RoomDatabase
{
    @SuppressWarnings("WeakerAccess")
    public abstract PersonaDAO getPersonaDao();
}
