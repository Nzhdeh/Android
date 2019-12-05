package es.iesnervion.nyeghiazaryan.examenandroid1trimestrenzhdeh.clases;

public class OrdenadorImpresora
{
    private  int id;
    private Ordenador ordenador;
    private  Impresora impresora;

    public OrdenadorImpresora() {
        this.id=0;
        this.ordenador = new Ordenador();
        this.impresora = new Impresora();
    }

    public OrdenadorImpresora(int id,Ordenador ordenador, Impresora impresora) {
        this.id=id;
        this.ordenador = ordenador;
        this.impresora = impresora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ordenador getOrdenador() {
        return ordenador;
    }

    public void setOrdenador(Ordenador ordenador) {
        this.ordenador = ordenador;
    }

    public Impresora getImpresora() {
        return impresora;
    }

    public void setImpresora(Impresora impresora) {
        this.impresora = impresora;
    }
}
