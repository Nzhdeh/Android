package es.iesnervion.nyeghiazaryan.intentsyviewmodel.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import es.iesnervion.nyeghiazaryan.intentsyviewmodel.R;
import es.iesnervion.nyeghiazaryan.intentsyviewmodel.viewholders.ViewHolder;
import es.iesnervion.nyeghiazaryan.intentsyviewmodel.clases.Persona;

public class Adaptador extends BaseAdapter
{

    Context contexto;
    List<Persona> lista;

    public Adaptador(Context contexto, List<Persona> lista)
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
        return lista.get(position).getIdPersona();
    }

    //devuelve el tipo de layout correspondiente
    @Override
    public int getItemViewType(int position)
    {
        int tipo=0;
//        if(position%2!=0)
//        {
//            tipo=1;
//        }
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
        TextView apellidosPersona=null;
        TextView nombrePersona=null;
        ImageView imagen=null;

        if (vista==null)
        {
            //inflamos el layout con la imagen a la izquierda
            LayoutInflater inflate=LayoutInflater.from(contexto);
            vista=inflate.inflate(R.layout.para_listado_personas,null);

            apellidosPersona=vista.findViewById(R.id.tvApellidos);
            nombrePersona=vista.findViewById(R.id.tvNombre);
            imagen=vista.findViewById(R.id.ivFoto);

            holder = new ViewHolder (nombrePersona,apellidosPersona,imagen);
            vista.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) vista.getTag();
        }

        holder.getNombreEquipo().setText(lista.get(position).getNombrePersona());
        holder.getApellidosPersona().setText(lista.get(position).getApellidosPersona());
        holder.getImagen().setImageResource(lista.get(position).getImagen());

        return vista;
    }
}
