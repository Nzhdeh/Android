package es.iesnervion.pablo.practica2eva.BaseDatos;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import es.iesnervion.pablo.practica2eva.Entidades.ClsPersona;

@Dao
public interface CustomDAO {

    @Query("SELECT * FROM ClsPersona")
    List<ClsPersona> obtenerPersonas();

    @Insert
    void insertarPersona(ClsPersona persona);
}
