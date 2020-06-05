package es.iesnervion.nyeghiazaryan.roomsimple.bbdd;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.iesnervion.nyeghiazaryan.roomsimple.clases.Persona;

@Dao
public interface PersonaDao
{
    @Query("select * from persona")
    List<Persona> getPersonas();

    @Query("select * from persona where id is :id")
    Persona getPersona(int id);

    @Insert
    void addPersona(Persona... persona);

//    @Insert
//    void addPersona(Persona persona);

    @Delete
    void deletePersona(Persona persona);
    @Query("delete from persona where id is :id")
    void deletePersona(int id);

    @Update
    void updatePersona(Persona persona);
}
