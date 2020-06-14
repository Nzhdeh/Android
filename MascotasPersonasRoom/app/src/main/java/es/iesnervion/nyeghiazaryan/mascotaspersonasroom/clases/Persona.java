package es.iesnervion.nyeghiazaryan.mascotaspersonasroom.clases;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Persona")
public class Persona
{

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    @NonNull
    private int id;

    @ColumnInfo(name = "nombre")
    private String nombre;
    @ColumnInfo(name = "apellidos")
    private String apellidos;
//    @ColumnInfo(name = "biografia")
//    private String biografia;

    public Persona()
    {
        this.id = 0;
        this.nombre = "";
        this.apellidos = "";
        //this.biografia = "";
    }

    @Ignore
    public Persona(int id, String nombre, String apellidos/*, String biografia*/)
    {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        //this.biografia = biografia;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellidos()
    {
        return apellidos;
    }

    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }

//    public String getBiografia()
//    {
//        return biografia;
//    }
//
//    public void setBiografia(String biografia)
//    {
//        this.biografia = biografia;
//    }
}
