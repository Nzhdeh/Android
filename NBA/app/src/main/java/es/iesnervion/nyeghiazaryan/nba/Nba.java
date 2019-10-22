package es.iesnervion.nyeghiazaryan.nba;

public class Nba
{
    private int id;
    private String nombreEquipo;
    private int imagen;

    public Nba(int id, String nombreEquipo, int imagen) {
        this.id = id;
        this.nombreEquipo = nombreEquipo;
        this.imagen = imagen;
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
}
