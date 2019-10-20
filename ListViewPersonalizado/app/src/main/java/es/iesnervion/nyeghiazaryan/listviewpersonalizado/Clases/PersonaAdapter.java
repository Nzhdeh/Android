package es.iesnervion.nyeghiazaryan.listviewpersonalizado.Clases;

import android.app.Person;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

public class PersonaAdapter extends Adapter<Persona>
{
     Context contexto;
     int layoutResourceID;
     Persona [] personas=null;

    public PersonaAdapter(Context contexto,int layoutResourceID,Persona [] personas)
    {
        super(contexto,layoutResourceID,personas);
        this.contexto=contexto;
        this.layoutResourceID=layoutResourceID;
        this.personas=personas;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View vista=convertView;

        return null;
    }
}
