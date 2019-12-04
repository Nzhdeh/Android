package es.iesnervion.nyeghiazaryan.examennzhdehandroid.capaEntities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import es.iesnervion.nyeghiazaryan.examennzhdehandroid.R;

public class CocheAdapter extends BaseAdapter
{
    Context contexto;
    private ArrayList<CocheImpl> coches;

    public CocheAdapter(Context contexto, ArrayList<CocheImpl> coches)
    {
        this.contexto = contexto;
        this.coches = coches;
    }

    @Override
    public int getCount() {
        return coches.size();
    }

    @Override
    public CocheImpl getItem(int position) {
        return coches.get(position);
    }

    @Override
    public long getItemId(int position) {
        return coches.get(position).getId();
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View vista=convertView;

        if (vista==null)
        {
            LayoutInflater inflate=LayoutInflater.from(contexto);
            if(coches.get(position).getEstado()=="Malo")
            {
                vista=inflate.inflate(R.layout.list_item_row,null);
            }
            else
            {
                 vista=inflate.inflate(R.layout.list_item_row_imagen_derecha,null);
            }

        }


        ImageView imagen=vista.findViewById(R.id.imagen);
        TextView marca=vista.findViewById(R.id.marca);
        TextView modelo=vista.findViewById(R.id.modelo);

        marca.setText(coches.get(position).getMarca());
        modelo.setText(coches.get(position).getModelo());
        imagen.setImageResource(coches.get(position).getImagen());

        return vista;
    }
}
