package es.iesnervion.nyeghiazaryan.mascotaspersonasroom.bbdd;

import android.annotation.SuppressLint;
import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.room.Room;

import java.util.List;

import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.clases.Mascota;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.clases.Persona;

public class MascotaIntermedio
{
    @SuppressLint("StaticFieldLeak")
    private static MascotaIntermedio intermedio;

    private MascotasDAO miMascotaDao;
    private MascotasBBDD database;

    private MascotaIntermedio(Context context)
    {
        Context appContext = context.getApplicationContext();
        database = Room.databaseBuilder(appContext, MascotasBBDD.class, "MascotasDB")
                .allowMainThreadQueries().build();
        miMascotaDao = database.getMascotaDao();
    }


    public static MascotaIntermedio get(Context context)
    {
        if (intermedio == null) {
            intermedio = new MascotaIntermedio(context);
        }
        return intermedio;
    }

    public LiveData<List<Persona>> getPersonas()
    {
        return miMascotaDao.getPersonas();
    }

    public Persona getPersona(int id)
    {
        return miMascotaDao.getPersona(id);
    }

    public void addPersona(Persona... persona)
    {
        miMascotaDao.addPersona(persona);
    }

    public void updatePersona(Persona persona)
    {
        miMascotaDao.updatePersona(persona);
    }

    public void deletePersona(Persona persona)
    {
        miMascotaDao.deletePersona(persona);
    }

    /******************************************************************************************/

    public LiveData<List<Mascota>> getMascotas()
    {
        return miMascotaDao.getMascotas();
    }

    public List<Mascota> getMascotasPorPersona(int idPersona)
    {
        return miMascotaDao.getMascotaPorPersona(idPersona);
    }

//    public Persona getMascota(int idMascota)
//    {
//        return miMascotaDao.getMascota(idMascota);
//    }

    public void addMascota(Mascota... mascota)
    {
        miMascotaDao.addMascota(mascota);
    }

    public void updateMascota(Mascota mascota)
    {
        miMascotaDao.updateMascota(mascota);
    }

    public void deleteMascota(Mascota mascota)
    {
        miMascotaDao.deleteMascota(mascota);
    }
}
