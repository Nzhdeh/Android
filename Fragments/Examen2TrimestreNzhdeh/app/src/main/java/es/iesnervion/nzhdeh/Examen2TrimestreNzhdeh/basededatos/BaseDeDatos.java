package es.iesnervion.nzhdeh.Examen2TrimestreNzhdeh.basededatos;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import es.iesnervion.nzhdeh.Examen2TrimestreNzhdeh.entidades.Atleta;

@Database(entities = {Atleta.class}, version = 1)
public abstract class BaseDeDatos extends RoomDatabase
{
    private static BaseDeDatos INSTANCE;
    public abstract AtletaDAO dao();

    public static BaseDeDatos getDataBase(final Context context)
    {
        if(INSTANCE == null)
        {
            synchronized (BaseDeDatos.class)
            {
                if(INSTANCE == null)
                {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), BaseDeDatos.class, "AtletasDB").allowMainThreadQueries().build();
                }
            }
        }
        return INSTANCE;
    }
}
