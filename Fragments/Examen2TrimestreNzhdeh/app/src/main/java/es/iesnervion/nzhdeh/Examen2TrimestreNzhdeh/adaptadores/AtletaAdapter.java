package es.iesnervion.nzhdeh.Examen2TrimestreNzhdeh.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

import es.iesnervion.nzhdeh.Examen2TrimestreNzhdeh.entidades.Atleta;
import es.iesnervion.nzhdeh.Examen2TrimestreNzhdeh.viewholders.FilaListadoVH;
import es.iesnervion.pablo.practica2eva.R;

public class AtletaAdapter extends BaseAdapter
{
    private final Context context;
    private final ArrayList<Atleta> listaAtletas;

    public AtletaAdapter(Context context, ArrayList<Atleta> listaAtletas)
    {
        this.context = context;
        this.listaAtletas = listaAtletas;
    }

    @Override
    public int getCount()
    {
        int tam;
        //Asi si no hay notas no se cierra la App.
        if(listaAtletas == null){
            tam = 0;
        }else{
            tam = listaAtletas.size();
        }

        return tam;
    }

    @Override
    public Object getItem(int position)
    {
        return listaAtletas.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        TextView nombre;
        FilaListadoVH holder;
        View row = convertView;

        Atleta nota = listaAtletas.get(position);

        if(row == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            row = inflater.inflate(R.layout.list_row, parent, false);


            nombre = row.findViewById(R.id.nombreAtleta);
            holder = new FilaListadoVH(nombre);

            row.setTag(holder);
        }else{
            holder = (FilaListadoVH) row.getTag();
        }


        holder.getNombreVH().setText(nota.getNombre());

        return row;
    }
}
