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
import es.iesnervion.nyeghiazaryan.examenandroid1trimestrenzhdeh.clases.Ordenador;

public class OrdenadorAdapter extends BaseAdapter
{

    Context contexto;
    private ArrayList<Ordenador> ordenadores;

    public OrdenadorAdapter(Context contexto, ArrayList<Ordenador> ordenadores) {
        this.contexto = contexto;
        this.ordenadores = ordenadores;
    }

    @Override
    public int getCount() {
        return ordenadores.size();
    }

    @Override
    public Ordenador getItem(int position) {
        return ordenadores.get(position);
    }

    @Override
    public long getItemId(int position) {
        return ordenadores.get(position).getIdOrdenador();
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View vista=convertView;

        if (vista==null)
        {
            LayoutInflater inflate=LayoutInflater.from(contexto);
            vista=inflate.inflate(R.layout.fila_ordenador,null);

        }


        ImageView imagenDisp=vista.findViewById(R.id.imgDisponibilidadOrd);
        ImageView imagenOrd=vista.findViewById(R.id.imgOrd);
        ImageView imagenCPU=vista.findViewById(R.id.imgCPU);
        TextView nombreOrd=vista.findViewById(R.id.TVnombreOrd);

        imagenDisp.setImageResource(ordenadores.get(position).getImagenDisponibilidad());
        imagenOrd.setImageResource(ordenadores.get(position).getImagenOrdenador());
        imagenCPU.setImageResource(ordenadores.get(position).getImagenCPU());
        nombreOrd.setText(ordenadores.get(position).getNombreOrdenador());

        return vista;
    }
}
