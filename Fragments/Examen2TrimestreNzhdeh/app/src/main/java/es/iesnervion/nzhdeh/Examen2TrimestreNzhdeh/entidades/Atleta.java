package es.iesnervion.nzhdeh.Examen2TrimestreNzhdeh.entidades;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Atleta
{
    //Propiedades privadas
    @PrimaryKey(autoGenerate = true)
    private int ID;
    private String nombre;
    private String apellidos;
    private String observaciones;

    //Constructor Por defecto
    public Atleta()
    {
        nombre = "no name";
        apellidos = "no name";
        observaciones = "no name";
    }

    //Constructor con parametros
    @Ignore
    public Atleta(String nombre, String apellidos, String observaciones)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.observaciones = observaciones;
    }

    //Propiedades publicas

    public int getID()
    {
        return ID;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellidos()
    {
        return apellidos;
    }
    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }

    public String getObservaciones()
    {
        return observaciones;
    }
    public void setObservaciones(String observaciones)
    {
        this.observaciones = observaciones;
    }
}
