package es.iesnervion.nyeghiazaryan.practicandoroom;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.UUID;

@Entity(tableName = "nota")
public class Nota
{
    @PrimaryKey
    @NonNull
    private String id;

    @ColumnInfo(name = "contenido")
    private String contenido;

    public Nota()
    {
        this.id= UUID.randomUUID().toString();
        this.contenido="";
    }

//    public Nota(String id,String contenido)
//    {
//        this.id=id;
//        this.contenido=contenido;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
