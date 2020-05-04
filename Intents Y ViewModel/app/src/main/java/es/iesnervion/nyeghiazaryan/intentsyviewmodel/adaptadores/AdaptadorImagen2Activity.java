package es.iesnervion.nyeghiazaryan.intentsyviewmodel.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import es.iesnervion.nyeghiazaryan.intentsyviewmodel.R;
import es.iesnervion.nyeghiazaryan.intentsyviewmodel.viewholders.ViewHolderImagen2Activity;

public class AdaptadorImagen2Activity extends BaseAdapter
{

    Context contexto;
    int [] lista;

    public AdaptadorImagen2Activity(Context context, int[] lista)
    {
        this.contexto = context;
        this.lista = lista;
    }

    //devuelve la cantidad de elementos que hay en una lista
    @Override
    public int getCount() {
        return lista.length;
    }

    @Override
    public Object getItem(int position) {
        return lista[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    //devuelve el tipo de layout correspondiente
    @Override
    public int getItemViewType(int position)
    {
        return 0;
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
        ViewHolderImagen2Activity holder=null;
        ImageView imagenPersona=null;

        if (vista==null)
        {
            //inflamos el layout con la imagen a la izquierda
            LayoutInflater inflate=LayoutInflater.from(contexto);
            vista=inflate.inflate(R.layout.imagen_individual_activity2,null);

            imagenPersona=vista.findViewById(R.id.ivImagenIndividual);

            holder = new ViewHolderImagen2Activity (imagenPersona);
            vista.setTag(holder);
        }
        else
        {
            holder = (ViewHolderImagen2Activity) vista.getTag();
        }

        holder.getImagenPersona().setImageResource(lista[position]);

        return vista;
    }
}
