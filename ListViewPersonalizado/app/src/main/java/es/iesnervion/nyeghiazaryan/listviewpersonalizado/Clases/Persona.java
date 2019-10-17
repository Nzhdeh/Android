package es.iesnervion.nyeghiazaryan.listviewpersonalizado.Clases;

import android.media.Image;
import android.widget.ImageView;

public class Persona
{
    private String nombre;
   // private String apellidos;
    private int imagen;

    public Persona()
    {
        this.nombre="";
        //this.apellidos="";
        this.imagen=0;
    }

    public Persona(String nombre, int imagen)
    {
        this.nombre=nombre;
        //this.apellidos=apellidos;
        this.imagen=imagen;
    }

    public String getNombre()
    {
        return nombre;
    }

   // public String getApellidos()
//    {
//        return apellidos;
//    }

    public int getImagen()
    {
        return imagen;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    //public void setApellidos(String apellidos)
//    {
//        this.apellidos = apellidos;
//    }

    public void setImagen(int imagen)
    {
        this.imagen = imagen;
    }

    @Override
    public String toString()
    {
        return (getImagen()+","+getNombre());
    }
}
