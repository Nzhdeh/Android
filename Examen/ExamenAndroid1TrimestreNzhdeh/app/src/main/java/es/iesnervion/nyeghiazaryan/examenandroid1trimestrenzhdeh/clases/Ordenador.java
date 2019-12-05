package es.iesnervion.nyeghiazaryan.examenandroid1trimestrenzhdeh.clases;

public class Ordenador
{
    private  int idOrdenador;
    private String nombreOrdenador;
    private int imagenDisponibilidad;
    private int imagenOrdenador;
    private int imagenCPU;


    public Ordenador() {
        this.idOrdenador=0;
        this.nombreOrdenador = "no hay";
        this.imagenDisponibilidad = 0;
        this.imagenOrdenador = 0;
        this.imagenCPU = 0;
    }

    public Ordenador(int idOrdenador,String nombreOrdenador, int imagenDisponibilidad, int imagenOrdenador, int imagenCPU) {
        this.idOrdenador=idOrdenador;
        this.nombreOrdenador = nombreOrdenador;
        this.imagenDisponibilidad = imagenDisponibilidad;
        this.imagenOrdenador = imagenOrdenador;
        this.imagenCPU = imagenCPU;
    }

    //getters y setters


    public int getIdOrdenador() {
        return idOrdenador;
    }

    public void setIdOrdenador(int idOrdenador) {
        this.idOrdenador = idOrdenador;
    }

    public String getNombreOrdenador() {
        return nombreOrdenador;
    }

    public void setNombreOrdenador(String nombreOrdenador) {
        this.nombreOrdenador = nombreOrdenador;
    }

    public int getImagenDisponibilidad() {
        return imagenDisponibilidad;
    }

    public void setImagenDisponibilidad(int imagenDisponibilidad) {
        this.imagenDisponibilidad = imagenDisponibilidad;
    }

    public int getImagenOrdenador() {
        return imagenOrdenador;
    }

    public void setImagenOrdenador(int imagenOrdenador) {
        this.imagenOrdenador = imagenOrdenador;
    }

    public int getImagenCPU() {
        return imagenCPU;
    }

    public void setImagenCPU(int imagenCPU) {
        this.imagenCPU = imagenCPU;
    }
}
