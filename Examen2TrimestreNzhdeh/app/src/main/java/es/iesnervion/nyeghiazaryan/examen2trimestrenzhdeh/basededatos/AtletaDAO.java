package es.iesnervion.nyeghiazaryan.examen2trimestrenzhdeh.basededatos;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import es.iesnervion.nyeghiazaryan.examen2trimestrenzhdeh.entidades.Atleta;

@Dao
public interface AtletaDAO {

    @Query("SELECT * FROM Atleta")
    List<Atleta> obtenerAtletas();

    @Insert
    void insertarAtletas(Atleta atleta);
}
