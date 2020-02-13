package es.iesnervion.nyeghiazaryan.examen2trimestrenzhdeh.viewholders;

import android.widget.TextView;

public class FilaListadoVH
{
    //ViewHolder para el listView con los atletas

    private TextView nombreVH;

    //Constructor con parametros
    public FilaListadoVH(TextView nombre)
    {
        this.nombreVH = nombre;
    }

    //Getters
    public TextView getNombreVH()
    {
        return nombreVH;
    }
}
