package es.iesnervion.nyeghiazaryan.nbareturnsconfragmentsyvm.viewholders;

import android.widget.ImageView;
import android.widget.TextView;

/*en esta clase aparecen solo las cosas que queremos personalizar,
si hay algunos atributos que se tienen que qedar fijos no se ponen aqui*/
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
