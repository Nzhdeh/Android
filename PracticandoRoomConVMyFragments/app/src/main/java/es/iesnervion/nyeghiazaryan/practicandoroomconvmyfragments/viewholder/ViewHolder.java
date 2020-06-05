package es.iesnervion.nyeghiazaryan.practicandoroomconvmyfragments.viewholder;

import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder
{
    TextView nombreEquipo;
    ImageView imagenEquipo;

    public ViewHolder(ImageView dorsal, TextView nombre)
    {
        this.imagenEquipo = dorsal;
        this.nombreEquipo = nombre;
    }

    public TextView getNombreEquipo()
    {
        return nombreEquipo;
    }

    public ImageView getImagenEquipo()
    {
        return imagenEquipo;
    }
}
