package es.iesnervion.nyeghiazaryan.roomviewmodelfragments.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.R;
import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.clases.Persona;
import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.viewholder.ViewHolder;

public class AdaptadorPersona extends BaseAdapter
{
    Context contexto;
    List<Persona> lista;

    public AdaptadorPersona(Context contexto, List<Persona> lista)
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
        return lista.get(position).getId();
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
        ViewHolder holder=null;
        //TextView apellidosPersona=null;
        TextView nombrePersona=null;

        if (vista==null)
        {
            //inflamos el layout con la imagen a la izquierda
            LayoutInflater inflate=LayoutInflater.from(contexto);
            vista=inflate.inflate(R.layout.para_listado_personas,null);

            nombrePersona=vista.findViewById(R.id.tvListaNombre);
            //apellidosPersona=vista.findViewById(R.id.tvListaApellidos);

            //holder = new ViewHolder (nombrePersona,apellidosPersona);
            holder = new ViewHolder (nombrePersona);
            vista.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) vista.getTag();
        }

        holder.getNombrePersona().setText(lista.get(position).getNombre());
        //holder.getApellidosPersona().setText(lista.get(position).getApellidos());

        return vista;
    }
}
