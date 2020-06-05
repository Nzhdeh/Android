package es.iesnervion.nyeghiazaryan.practicandoroomconvmyfragments.bbdd;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import es.iesnervion.nyeghiazaryan.practicandoroomconvmyfragments.clases.Nba;

@Dao
public interface NbaDAO
{
    @Query("select * from Nba")
    List<Nba> getEquiposNba();

    @Query("select detalles from Nba where id is :id")
    String obtenerDetalle(String id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertarEquipo(List<Nba> nbas);
}
