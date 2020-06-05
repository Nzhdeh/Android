package es.iesnervion.nyeghiazaryan.roomviewmodelfragments.clases;

import android.annotation.SuppressLint;
import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.room.Room;

import java.util.List;

import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.bbdd.PersonaBBDD;
import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.bbdd.PersonaDAO;

public class PersonaIntermedio
{
    @SuppressLint("StaticFieldLeak")
    private static PersonaIntermedio intermedio;

    private PersonaDAO miPersonaDao;
    private PersonaBBDD database;

    private PersonaIntermedio(Context context)
    {
        Context appContext = context.getApplicationContext();
        database = Room.databaseBuilder(appContext, PersonaBBDD.class, "PersonaDB")
                .allowMainThreadQueries().build();
        miPersonaDao = database.getPersonaDao();
    }


    public static PersonaIntermedio get(Context context)
    {
        if (intermedio == null) {
            intermedio = new PersonaIntermedio(context);
        }
        return intermedio;
    }

    public LiveData<List<Persona>> getPersonas()
    {
        return miPersonaDao.getPersonas();
    }

    public Persona getPersona(int id)
    {
        return miPersonaDao.getPersona(id);
    }

    public void addPersona(Persona persona)
    {
        miPersonaDao.addPersona(persona);
    }

    public void updatePersona(Persona persona)
    {
        miPersonaDao.updatePersona(persona);
    }

    public void deletePersona(Persona persona)
    {
        miPersonaDao.deletePersona(persona);
    }
}
