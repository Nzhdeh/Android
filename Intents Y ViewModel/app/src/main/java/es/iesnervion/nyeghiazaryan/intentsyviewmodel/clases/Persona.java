package es.iesnervion.nyeghiazaryan.intentsyviewmodel.clases;

import android.os.Parcel;
import android.os.Parcelable;

//se instala Android Parcelable code generator
//clic derecho parcelable/ elejir los atributos que queremos que sean parcelables
public class Persona implements Parcelable
{
    private String nombrePersona;
    private String apellidosPersona;
    private int idPersona;
    private int imagen;

    public Persona()
    {
        this.idPersona=0;
        this.nombrePersona = "";
        this.apellidosPersona = "";
        this.imagen=0;
    }

    public Persona(int idPersona,String nombrePersona, String apellidosPersona,int imagen)
    {
        this.nombrePersona = nombrePersona;
        this.apellidosPersona = apellidosPersona;
        this.idPersona = idPersona;
        this.imagen=imagen;
    }

    public Persona(int idPersona,String nombrePersona, String apellidosPersona)
    {
        this.nombrePersona = nombrePersona;
        this.apellidosPersona = apellidosPersona;
        this.idPersona = idPersona;
        this.imagen=0;
    }

    public int getImagen()
    {
        return imagen;
    }

    public void setImagen(int imagen)
    {
        this.imagen = imagen;
    }

    public String getNombrePersona()
    {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidosPersona() {
        return apellidosPersona;
    }

    public void setApellidosPersona(String apellidosPersona) {
        this.apellidosPersona = apellidosPersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nombrePersona);
        dest.writeString(this.apellidosPersona);
        dest.writeInt(this.idPersona);
        dest.writeInt(this.imagen);
    }

    protected Persona(Parcel in) {
        this.nombrePersona = in.readString();
        this.apellidosPersona = in.readString();
        this.idPersona = in.readInt();
        this.imagen = in.readInt();
    }

    public static final Creator<Persona> CREATOR = new Creator<Persona>() {
        @Override
        public Persona createFromParcel(Parcel source) {
            return new Persona(source);
        }

        @Override
        public Persona[] newArray(int size) {
            return new Persona[size];
        }
    };
}
