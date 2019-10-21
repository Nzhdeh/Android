package es.iesnervion.nyeghiazaryan.nba;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends BaseAdapter
{

    Context contexto;
    List<Nba> lista;

    public Adaptador(Context contexto, List<Nba> lista)
    {
        this.contexto = contexto;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return lista.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View vista=convertView;

        if (vista==null)
        {
            LayoutInflater inflate=LayoutInflater.from(contexto);
            vista=inflate.inflate(R.layout.item_list_view,null);
        }


        ImageView imagen=vista.findViewById(R.id.imview);
        TextView nombreEquipo=vista.findViewById(R.id.nombreEquipo);

        nombreEquipo.setText(lista.get(position).getNombreEquipo());
        imagen.setImageResource(lista.get(position).getImagen());

        return vista;
    }
}
