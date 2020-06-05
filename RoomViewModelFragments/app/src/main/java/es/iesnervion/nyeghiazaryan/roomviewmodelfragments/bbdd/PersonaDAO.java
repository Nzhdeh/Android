package es.iesnervion.nyeghiazaryan.roomviewmodelfragments.bbdd;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.clases.Persona;


@Dao
public interface PersonaDAO
{
    @Query("select * from persona order by id")
    LiveData<List<Persona>> getPersonas();

    @Query("select * from persona where id is :id")
    Persona getPersona(int id);

    @Insert
    void addPersona(Persona... persona);

    @Delete
    void deletePersona(Persona persona);

//    @Query("delete from persona where id is :id")
//    void deletePersona(int id);

    @Update
    void updatePersona(Persona persona);
}
