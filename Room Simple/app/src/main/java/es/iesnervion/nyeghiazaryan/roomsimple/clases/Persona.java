package es.iesnervion.nyeghiazaryan.roomsimple.clases;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "persona")
public class Persona
{
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    @NonNull
    private int id;

    @ColumnInfo(name = "nombre")
    private String nombre;

    public Persona()
    {
        this.nombre = "";
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    @Override
    public String toString()
    {
        return this.getId()+" "+ this.getNombre();
    }
}
