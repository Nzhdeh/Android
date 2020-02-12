package es.iesnervion.pablo.practica2eva.BaseDatos;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import es.iesnervion.pablo.practica2eva.Entidades.ClsPersona;

@Database(entities = {ClsPersona.class}, version = 1)
public abstract class UsarDataBase extends RoomDatabase {
    private static UsarDataBase INSTANCE;
    public abstract CustomDAO dao();

    public static UsarDataBase getDataBase(final Context context){
        if(INSTANCE == null){
            synchronized (UsarDataBase.class){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), UsarDataBase.class, "PersonasDB").allowMainThreadQueries().build();
                }
            }
        }
        return INSTANCE;
    }
}
