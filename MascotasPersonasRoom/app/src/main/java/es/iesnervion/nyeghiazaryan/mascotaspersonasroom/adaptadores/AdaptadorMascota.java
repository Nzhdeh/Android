package es.iesnervion.nyeghiazaryan.mascotaspersonasroom.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.R;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.clases.Mascota;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.viewholders.MascotaVH;

public class AdaptadorMascota extends BaseAdapter
{
    Context contexto;
    List<Mascota> lista;

    public AdaptadorMascota(Context contexto, List<Mascota> lista)
    {
        this.contexto = contexto;
        this.lista = lista;
    }

    @Override
    public int getCount()
    {
        return lista.size();
    }

    @Override
    public Object getItem(int position)
    {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return lista.get(position).getIdMascota();
    }

    //devuelve el tipo de layout correspondiente
    @Override
    public int getItemViewType(int position)
    {
        int tipo=1;

        return tipo;
    }

    //devuelve el numero de layouts diferentes
    @Override
    public int getViewTypeCount()
    {
        return 1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View vista=convertView;
        MascotaVH holder=null;
        TextView nombreMascota=null;

        if (vista==null)
        {
            //inflamos el layout con la imagen a la izquierda
            LayoutInflater inflate=LayoutInflater.from(contexto);
            vista=inflate.inflate(R.layout.para_listado_mascotas,null);

            nombreMascota=vista.findViewById(R.id.tvNombreMascota);

            holder = new MascotaVH(nombreMascota);
            vista.setTag(holder);
        }
        else
        {
            holder = (MascotaVH) vista.getTag();
        }

        holder.getNombreMascota().setText(lista.get(position).getNombreMascota());

        return vista;
    }
}
