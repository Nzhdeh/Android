package es.iesnervion.nyeghiazaryan.intentsyviewmodel.viewholders;

import android.widget.ImageView;
import android.widget.TextView;

import es.iesnervion.nyeghiazaryan.intentsyviewmodel.R;

/*en esta clase aparecen solo las cosas que queremos personalizar,
si hay algunos atributos que se tienen que qedar fijos no se ponen aqui*/
public class ViewHolder
{
    TextView nombrePersona;
    TextView apellidosPersona;
    ImageView imagen;

    public ViewHolder(TextView nombre,TextView apellidos,ImageView imagen)
    {
        this.apellidosPersona = apellidos;
        this.nombrePersona = nombre;
        this.imagen=imagen;
    }

    public TextView getNombreEquipo()
    {
        return nombrePersona;
    }

    public TextView getApellidosPersona()
    {
        return apellidosPersona;
    }

    public ImageView getImagen()
    {
        return imagen;
    }
}
