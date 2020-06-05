package es.iesnervion.nyeghiazaryan.roomsimple.bbdd;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import es.iesnervion.nyeghiazaryan.roomsimple.clases.Persona;

@Database(entities = {Persona.class}, version = 1)
public abstract class PersonaBBDD extends RoomDatabase
{
    @SuppressWarnings("WeakerAccess")
    public abstract PersonaDao getPersonaDao();

//    private static PersonaBBDD sInstance;//bbdd
//
//    public static synchronized PersonaBBDD getAppDatabase(Context context)
//    {
//        if (sInstance == null)
//        {
//            sInstance = Room.databaseBuilder(context.getApplicationContext(), PersonaBBDD.class, "PersonaDB")
//                .fallbackToDestructiveMigration()
//                .build();
//        }
//        return sInstance;
//    }
//
//    public static void destroyInstance()
//    {
//        sInstance = null;
//    }
}
