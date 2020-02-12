package es.iesnervion.nyeghiazaryan.equipodejugadores.adaptadors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import es.iesnervion.nyeghiazaryan.equipodejugadores.R;
import es.iesnervion.nyeghiazaryan.equipodejugadores.clases.Jugador;

public class AdaptadorFragmentListar extends BaseAdapter
{

    Context contexto;
    List<Jugador> lista;

    public AdaptadorFragmentListar(Context contexto, List<Jugador> lista)
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
            vista=inflate.inflate(R.layout.fragment_listar,null);
        }

        TextView nombre=vista.findViewById(R.id.etnombre);
        TextView apellidos=vista.findViewById(R.id.etapellidos);

        nombre.setText(lista.get(position).getNombre());
        apellidos.setText(lista.get(position).getApellidos());

        return vista;
    }
}
