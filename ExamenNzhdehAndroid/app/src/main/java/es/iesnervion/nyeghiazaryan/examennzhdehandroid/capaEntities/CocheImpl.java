package es.iesnervion.nyeghiazaryan.examennzhdehandroid.capaEntities;
/*
* BL    -DAL y Entities
* DAL   -Entities
* UI    -BL y Entidades
* */
public class CocheImpl
{
    private int id;
    private String marca;
    private String modelo;
    private String color;
    private double precio;
    private String estado;
    private int imagen;

    public CocheImpl()
    {
        this.id = 0;
        this.marca = "nada";
        this.modelo = "nada";
        this.color = "nada";
        this.precio = 0.0;
        this.estado = "nada";
        this.imagen=0;
    }

    public CocheImpl(int id, String marca, String modelo, String color, double precio, String estado, int imagen)
    {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.estado = estado;
        this.imagen=imagen;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
