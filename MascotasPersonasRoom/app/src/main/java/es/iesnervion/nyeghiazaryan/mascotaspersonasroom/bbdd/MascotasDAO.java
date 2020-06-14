package es.iesnervion.nyeghiazaryan.mascotaspersonasroom.bbdd;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.clases.Mascota;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.clases.Persona;

@Dao
public interface MascotasDAO
{
    @Query("select * from persona order by id")
    LiveData<List<Persona>> getPersonas();

    @Query("select * from persona where id is :id")
    Persona getPersona(int id);

    @Insert
    void addPersona(Persona... persona);

    @Delete
    void deletePersona(Persona persona);

    @Update
    void updatePersona(Persona persona);

    /**********************************************************************/

    @Query("select * from mascota order by idMascota")
    LiveData<List<Mascota>> getMascotas();

    @Query("select * from mascota where idPersona is :idPersona")
    List<Mascota> getMascotaPorPersona(int idPersona);

//    @Query("select * from mascota where idMascota is :idMascota")
//    Persona getMascota(int idMascota);

    @Insert
    void addMascota(Mascota... mascota);

    @Delete
    void deleteMascota(Mascota mascota);

    @Update
    void updateMascota(Mascota mascota);
}
