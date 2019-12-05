package es.iesnervion.nyeghiazaryan.examenandroid1trimestrenzhdeh.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import es.iesnervion.nyeghiazaryan.examenandroid1trimestrenzhdeh.R;
import es.iesnervion.nyeghiazaryan.examenandroid1trimestrenzhdeh.clases.Impresora;
import es.iesnervion.nyeghiazaryan.examenandroid1trimestrenzhdeh.clases.Ordenador;
import es.iesnervion.nyeghiazaryan.examenandroid1trimestrenzhdeh.clases.OrdenadorImpresora;

public class OrdenadorImpresoraAdapter extends BaseAdapter
{
    Context contexto;
    private ArrayList<OrdenadorImpresora> lista;

    public OrdenadorImpresoraAdapter(Context contexto, ArrayList<OrdenadorImpresora> lista) {
        this.contexto = contexto;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public OrdenadorImpresora getItem(int position) {
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
        Ordenador o=lista.get(position).getOrdenador();
        Impresora i=lista.get(position).getImpresora();

        if (vista==null)
        {
            LayoutInflater inflate=LayoutInflater.from(contexto);
            if(lista.get(position).getOrdenador().equals(o))
            {
                vista=inflate.inflate(R.layout.fila_ordenador,null);
            }
            else
            {
                vista=inflate.inflate(R.layout.fila_impresora,null);
            }
        }

        TextView ord=vista.findViewById(R.id.tvOrdenador);
        TextView impr=vista.findViewById(R.id.tvImpresora);

        ord.setText(lista.get(position).getOrdenador().toString());
        impr.setText(lista.get(position).getImpresora().toString());

        return vista;
    }
}
