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

public class ImpresoraAdapter extends BaseAdapter
{
    Context contexto;
    private ArrayList<Impresora> impresoras;

    public ImpresoraAdapter(Context contexto, ArrayList<Impresora> impresoras) {
        this.contexto = contexto;
        this.impresoras = impresoras;
    }

    @Override
    public int getCount() {
        return impresoras.size();
    }

    @Override
    public Impresora getItem(int position) {
        return impresoras.get(position);
    }

    @Override
    public long getItemId(int position) {
        return impresoras.get(position).getIdImpresora();
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View vista=convertView;

        if (vista==null)
        {
            LayoutInflater inflate=LayoutInflater.from(contexto);
            vista=inflate.inflate(R.layout.fila_impresora,null);

        }


        ImageView imagenDisp=vista.findViewById(R.id.imgDisponibilidadImpr);
        ImageView imagenImpr=vista.findViewById(R.id.imgImpr);
        TextView nombreImpr=vista.findViewById(R.id.TVnombreImpr);
        TextView tipoImpr=vista.findViewById(R.id.TVtipoImpr);

        imagenDisp.setImageResource(impresoras.get(position).getImagenDisponibilidad());
        imagenImpr.setImageResource(impresoras.get(position).getIdImpresora());
        nombreImpr.setText(impresoras.get(position).getNombreImpresora());
        tipoImpr.setText(impresoras.get(position).getTipoImpresora());

        return vista;
    }
}
