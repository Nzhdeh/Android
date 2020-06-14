package es.iesnervion.nyeghiazaryan.mascotaspersonasroom.clases;

import android.app.Person;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Mascota")
public class Mascota
{
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idMascota")
    @NonNull
    private int idMascota;
    @ColumnInfo(name = "nombreMascota")
    private String nombreMascota;
    @ColumnInfo(name = "raza")
    private String raza;

    @ColumnInfo(name = "idPersona")
    @ForeignKey(entity = Persona.class,
        parentColumns = "id",
        childColumns = "idPersona",
        onDelete = ForeignKey.CASCADE)
    @NonNull
    private int idPersona;

    public Mascota()
    {
        this.idMascota = 0;
        this.nombreMascota = "";
        this.raza = "";
        this.idPersona = 0;
    }

    @Ignore
    public Mascota(int idMascota, String nombreMascota, String raza, int idPersona)
    {
        this.idMascota = idMascota;
        this.nombreMascota = nombreMascota;
        this.raza = raza;
        this.idPersona = idPersona;
    }

    public int getIdMascota()
    {
        return idMascota;
    }

    public void setIdMascota(int idMascota)
    {
        this.idMascota = idMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
}
