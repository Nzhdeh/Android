package es.iesnervion.nyeghiazaryan.listviewpersonalizado.Clases;

import android.media.Image;

public class Persona
{
    private String nombre;
    private String apellidos;
    private int imagen;

    public Persona()
    {
        this.nombre="";
        this.apellidos="";
        this.imagen=0;
    }

    public Persona(String nombre,String apellidos,int imagen)
    {
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.imagen=imagen;
    }
}
