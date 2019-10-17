package es.iesnervion.nyeghiazaryan.listviewpersonalizado.Clases;

import android.app.Person;
import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import es.iesnervion.nyeghiazaryan.listviewpersonalizado.R;

public class PersonaAdapter extends BaseAdapter
{
     Context contexto;
     ArrayList <Persona> personas=null;

    public PersonaAdapter(Context contexto,ArrayList<Persona> personas)
    {
        //super();
        this.contexto=contexto;
        this.personas=personas;
    }

    @Override
    public int getCount()
    {
        return personas.size();
    }

    @Override
    public Object getItem(int position)
    {
        return personas.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Persona p= (Persona) getItem(position);
        convertView= LayoutInflater.from(contexto).inflate(R.layout.list_item_row,null);

        ImageView foto=convertView.findViewById(R.id.imagen);
        TextView nombre=convertView.findViewById(R.id.tv1);
        //TextView apellidos=convertView.findViewById(R.id.tv2);

        foto.setImageResource(p.getImagen());
        nombre.setText(p.getNombre());
        //apellidos.setText(p.getApellidos());

        return convertView;
    }
}
