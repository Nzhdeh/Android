package es.iesnervion.pablo.practica2eva.Entidades;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class ClsPersona {
    //Propiedades privadas
    @PrimaryKey(autoGenerate = true)
    private int ID;
    private String nombre;
    private String apellidos;
    private String direccion;

    //Constructores
    //Por defecto
    public ClsPersona(){
        nombre = "John";
        apellidos = "Doe";
        direccion  = "La piruleta SN";
    }

    //Con parametros
    @Ignore
    public ClsPersona(String nombre, String apellidos, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }

    //Propiedades publicas

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
