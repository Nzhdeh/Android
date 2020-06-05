package es.iesnervion.nyeghiazaryan.roomsimple.clases;

import android.annotation.SuppressLint;
import android.content.Context;

import androidx.room.Room;

import java.util.List;

import es.iesnervion.nyeghiazaryan.roomsimple.bbdd.PersonaBBDD;
import es.iesnervion.nyeghiazaryan.roomsimple.bbdd.PersonaDao;

public class PersonaIntermedio
{
    @SuppressLint("StaticFieldLeak")
    private static PersonaIntermedio intermedio;

    private PersonaDao miPersonaDao;

    private PersonaIntermedio(Context context)
    {
        Context appContext = context.getApplicationContext();
        PersonaBBDD database = Room.databaseBuilder(appContext, PersonaBBDD.class, "PersonaDB")
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

    public List<Persona> getPersonas()
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

    public void deletePersona(int id)
    {
        miPersonaDao.deletePersona(id);
    }
}
