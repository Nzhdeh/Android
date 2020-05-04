package es.iesnervion.nyeghiazaryan.practicandofragmentsinterfaces.clases;

import java.io.Serializable;

public class Nba implements Serializable
{
    private int id;
    private String nombreEquipo;
    private int imagen;
    private String detalles;

    public Nba() {
        this.id = 0;
        this.nombreEquipo = "nombreEquipo";
        this.imagen = 0;
        this.detalles="detalles";
    }

    public Nba(int id, String nombreEquipo, int imagen, String detalles) {
        this.id = id;
        this.nombreEquipo = nombreEquipo;
        this.imagen = imagen;
        this.detalles=detalles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
}
