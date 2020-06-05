package es.iesnervion.nyeghiazaryan.practicandoroomconvmyfragments.clases;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.UUID;

@Entity(tableName = "Nba")
public class Nba
{
    @PrimaryKey
    @NonNull
    private String id;

    @ColumnInfo(name = "nombreEquipo")
    private String nombreEquipo;

    @ColumnInfo(name = "imagen")
    private int imagen;

    @ColumnInfo(name = "detalles")
    private String detalles;


    public Nba()
    {
        //this.id = UUID.randomUUID().toString();
        this.id ="0";
        this.nombreEquipo = "";
        this.imagen = 0;
        this.detalles = "";
    }

    public Nba(String nombreEquipo, int imagen, String detalles)
    {
        this.id = UUID.randomUUID().toString();
        this.nombreEquipo = nombreEquipo;
        this.imagen = imagen;
        this.detalles = detalles;
    }

    @NonNull
    public String getId()
    {
        return id;
    }

    public void setId(@NonNull String id)
    {
        this.id = id;
    }

    public String getNombreEquipo()
    {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo)
    {
        this.nombreEquipo = nombreEquipo;
    }

    public int getImagen()
    {
        return imagen;
    }

    public void setImagen(int imagen)
    {
        this.imagen = imagen;
    }

    public String getDetalles()
    {
        return detalles;
    }

    public void setDetalles(String detalles)
    {
        this.detalles = detalles;
    }
}
