package es.iesnervion.nyeghiazaryan.practicandoroom.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.iesnervion.nyeghiazaryan.practicandoroom.Nota;

@Dao
public interface NotaDao
{
    @Query("Select * from nota")
    List<Nota> getNotas();

    @Query("SELECT * FROM nota WHERE id LIKE :uuid")
    Nota getNota(String uuid);

    @Insert
    void addNota(Nota book);

    @Delete
    void deleteNota(Nota book);

    @Update
    void updateNota(Nota book);
}
