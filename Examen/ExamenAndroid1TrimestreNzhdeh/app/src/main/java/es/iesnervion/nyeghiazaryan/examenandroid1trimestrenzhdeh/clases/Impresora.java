package es.iesnervion.nyeghiazaryan.examenandroid1trimestrenzhdeh.clases;

public class Impresora
{
    private int idImpresora;
    private String nombreImpresora;
    private int imagenDisponibilidad;
    private int imagenImpresora;
    private String tipoImpresora;

    public Impresora() {
        this.idImpresora=0;
        this.nombreImpresora = "no hay";
        this.imagenDisponibilidad = 0;
        this.imagenImpresora = 0;
        this.tipoImpresora = "no hay";
    }

    public Impresora(int idImpresora,String nombreImpresora, int imagenDisponibilidad, int imagenImpresora, String tipoImpresora) {
        this.idImpresora=idImpresora;
        this.nombreImpresora = nombreImpresora;
        this.imagenDisponibilidad = imagenDisponibilidad;
        this.imagenImpresora = imagenImpresora;
        this.tipoImpresora = tipoImpresora;
    }

    //getter y setters


    public int getIdImpresora() {
        return idImpresora;
    }

    public void setIdImpresora(int idImpresora) {
        this.idImpresora = idImpresora;
    }

    public String getNombreImpresora() {
        return nombreImpresora;
    }

    public void setNombreImpresora(String nombreImpresora) {
        this.nombreImpresora = nombreImpresora;
    }

    public int getImagenDisponibilidad() {
        return imagenDisponibilidad;
    }

    public void setImagenDisponibilidad(int imagenDisponibilidad) {
        this.imagenDisponibilidad = imagenDisponibilidad;
    }

    public int getImagenImpresora() {
        return imagenImpresora;
    }

    public void setImagenImpresora(int imagenImpresora) {
        this.imagenImpresora = imagenImpresora;
    }

    public String getTipoImpresora() {
        return tipoImpresora;
    }

    public void setTipoImpresora(String tipoImpresora) {
        this.tipoImpresora = tipoImpresora;
    }
}
