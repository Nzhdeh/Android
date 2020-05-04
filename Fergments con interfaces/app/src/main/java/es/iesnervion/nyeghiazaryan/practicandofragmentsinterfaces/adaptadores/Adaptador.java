package es.iesnervion.nyeghiazaryan.practicandofragmentsinterfaces.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import es.iesnervion.nyeghiazaryan.practicandofragmentsinterfaces.R;
import es.iesnervion.nyeghiazaryan.practicandofragmentsinterfaces.ViewHolder.ViewHolder;
import es.iesnervion.nyeghiazaryan.practicandofragmentsinterfaces.clases.Nba;

public class Adaptador extends BaseAdapter
{

    Context contexto;
    List<Nba> lista;

    public Adaptador(Context contexto, List<Nba> lista)
    {
        this.contexto = contexto;
        this.lista = lista;
    }

    //devuelve la cantidad de elementos que hay en una lista
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

    //devuelve el tipo de layout correspondiente
    @Override
    public int getItemViewType(int position)
    {
        int tipo=0;//imagen izquierda
        if(position%2!=0)
        {
            tipo=1;//imagen derecha
        }
        return tipo;
    }

    //devuelve el numero de layouts diferentes
    @Override
    public int getViewTypeCount()
    {
        return 2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View vista=convertView;
        ViewHolder holder=null;
        ImageView imagen=null;
        TextView nombreEquipo=null;

        if (vista==null)
        {
            if(getItemViewType(position)==0)
            {
                //inflamos el layout con la imagen a la izquierda
                LayoutInflater inflate=LayoutInflater.from(contexto);
                vista=inflate.inflate(R.layout.lista_foto_izquierda,null);

            }else
            {
                //inflamos el layout con la imagen a la derecha
                LayoutInflater inflate=LayoutInflater.from(contexto);
                vista=inflate.inflate(R.layout.lista_foto_derecha,null);
            }

            imagen=vista.findViewById(R.id.imview);
            nombreEquipo=vista.findViewById(R.id.nombreEquipo);

            holder = new ViewHolder (imagen,nombreEquipo);
            vista.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) vista.getTag();
        }



        holder.getNombreEquipo().setText(lista.get(position).getNombreEquipo());
        holder.getImagenEquipo().setImageResource(lista.get(position).getImagen());

        return vista;
    }
}
