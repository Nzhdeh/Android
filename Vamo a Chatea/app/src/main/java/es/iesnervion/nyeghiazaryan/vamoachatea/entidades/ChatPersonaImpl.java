package es.iesnervion.nyeghiazaryan.vamoachatea.entidades;

import es.iesnervion.nyeghiazaryan.vamoachatea.interfaces.ChatPersona;

public class ChatPersonaImpl implements ChatPersona
{
    private int id;
    private String nombrePersona;
    private int imagen;

    public ChatPersonaImpl()
    {
        this.id=0;
        this.nombrePersona="no hay";
        this.imagen=0;
    }

    public ChatPersonaImpl(int id,String nombrePersona,int imagen)
    {
        this.id=id;
        this.nombrePersona=nombrePersona;
        this.imagen=imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
