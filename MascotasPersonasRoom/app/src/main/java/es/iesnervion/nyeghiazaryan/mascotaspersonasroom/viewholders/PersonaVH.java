package es.iesnervion.nyeghiazaryan.mascotaspersonasroom.viewholders;

import android.widget.TextView;

public class PersonaVH
{
    TextView nombrePersona;
    TextView apellidosPersona;

    public PersonaVH(TextView nombrePersona, TextView apellidosPersona)
    {
        this.nombrePersona = nombrePersona;
        this.apellidosPersona = apellidosPersona;
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
