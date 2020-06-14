package es.iesnervion.nyeghiazaryan.mascotaspersonasroom.viewholders;

import android.widget.TextView;

public class MascotaVH
{
    TextView nombreMascota;

    public MascotaVH(TextView nombreMascota)
    {
        this.nombreMascota = nombreMascota;
    }

    public TextView getNombreMascota()
    {
        return nombreMascota;
    }

    public void setNombreMascota(TextView nombreMascota)
    {
        this.nombreMascota = nombreMascota;
    }
}
