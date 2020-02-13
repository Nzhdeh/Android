package es.iesnervion.nzhdeh.Examen2TrimestreNzhdeh.viewholders;

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
