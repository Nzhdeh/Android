package es.iesnervion.pablo.practica2eva.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import es.iesnervion.pablo.practica2eva.Entidades.ClsPersona;
import es.iesnervion.pablo.practica2eva.R;
import es.iesnervion.pablo.practica2eva.ViewHolders.filaVH;

public class CustomAdapter extends BaseAdapter {
    private final Context context;
    private final ArrayList<ClsPersona> listaPersonas;

    public CustomAdapter(Context context, ArrayList<ClsPersona> listaPersonas) {
        this.context = context;
        this.listaPersonas = listaPersonas;
    }

    @Override
    public int getCount() {
        int tam;
        //Asi si no hay notas no se cierra la App.
        if(listaPersonas == null){
            tam = 0;
        }else{
            tam = listaPersonas.size();
        }

        return tam;
    }

    @Override
    public Object getItem(int position) {
        return listaPersonas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        TextView nombre;
        TextView apellidos;
        filaVH holder;
        View row = convertView;

        ClsPersona nota = listaPersonas.get(position);

        if(row == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            row = inflater.inflate(R.layout.list_row, parent, false);

            //Creamos las referencias
            nombre = row.findViewById(R.id.nombrePersona);
            apellidos = row.findViewById(R.id.apellidosPersona);
            holder = new filaVH(nombre, apellidos);

            row.setTag(holder);
        }else{
            holder = (filaVH) row.getTag();
        }

        //Establecemos el contenido de las vistas
        holder.getNombreVH().setText(nota.getNombre());
        holder.getApellidosVH().setText(nota.getApellidos());

        return row;
    }
}
