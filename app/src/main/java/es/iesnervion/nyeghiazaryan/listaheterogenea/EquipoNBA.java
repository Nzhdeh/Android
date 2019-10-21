package es.iesnervion.nyeghiazaryan.listaheterogenea;

import java.io.Serializable;

public class EquipoNBA implements Serializable
{
    private String nombreEquipo;
    private int imagenEscudo;

    public EquipoNBA(String nombreEquipo, int imagenEscudo)
    {
        this.nombreEquipo = nombreEquipo;
        this.imagenEscudo = imagenEscudo;
    }

    public String getNombreEquipo()
    {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo)
    {
        this.nombreEquipo = nombreEquipo;
    }

    public int getImagenEscudo()
    {
        return imagenEscudo;
    }

    public void setImagenEscudo(int imagenEscudo)
    {
        this.imagenEscudo = imagenEscudo;
    }

    @Override
    public String toString()
    {
        return (getNombreEquipo()+", "+getImagenEscudo());
    }
}
