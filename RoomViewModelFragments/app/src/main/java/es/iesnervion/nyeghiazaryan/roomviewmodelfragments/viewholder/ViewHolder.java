package es.iesnervion.nyeghiazaryan.roomviewmodelfragments.viewholder;

import android.widget.TextView;

public class ViewHolder
{
    TextView nombrePersona;
    TextView apellidosPersona;

    public ViewHolder(TextView nombrePersona, TextView apellidosPersona)
    {
        this.nombrePersona = nombrePersona;
        this.apellidosPersona = apellidosPersona;
    }

    public ViewHolder(TextView nombrePersona)
    {
        this.nombrePersona = nombrePersona;
    }

    public TextView getNombrePersona()
    {
        return nombrePersona;
    }

    public TextView getApellidosPersona()
    {
        return apellidosPersona;
    }
}
