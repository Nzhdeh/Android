package es.iesnervion.nyeghiazaryan.examennzhdehandroid.capaUI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import es.iesnervion.nyeghiazaryan.examennzhdehandroid.R;
import es.iesnervion.nyeghiazaryan.examennzhdehandroid.capaDAL.listados.ListadoCoches;
import es.iesnervion.nyeghiazaryan.examennzhdehandroid.capaEntities.CocheAdapter;
import es.iesnervion.nyeghiazaryan.examennzhdehandroid.capaEntities.CocheImpl;

public class MainActivity extends AppCompatActivity {

    ListView listaDatos;
    //RecyclerView listaDatos;
    ArrayList<CocheImpl> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDatos=findViewById(R.id.lstCoches);

        lista=new ArrayList<>();
        ListadoCoches lc=new ListadoCoches();
        lista=lc.ObtenerListadoCoches();

        CocheAdapter miAdaptador=new CocheAdapter(getApplicationContext(),lista);

        listaDatos.setAdapter(miAdaptador);
    }
}
/*
*public class ViewHolder {
    private ImageView imagen;
    private TextView nombre;
    private TextView posicion;
    private TextView peso;
    private TextView altura;

    public ViewHolder (View vista)
    {
        this.imagen = (ImageView) vista.findViewById(R.id.imagenRow);
        this.nombre = (TextView) vista.findViewById(R.id.nombreRow);
        this.posicion = (TextView) vista.findViewById(R.id.posicionRow);
        this.peso = (TextView) vista.findViewById(R.id.pesoRow);
        this.altura = (TextView) vista.findViewById(R.id.alturaRow);
    }

    public ImageView getImagen() {
        return imagen;
    }

    public void setImagen(ImageView imagen) {
        this.imagen = imagen;
    }

    public TextView getNombre() {
        return nombre;
    }

    public void setNombre(TextView nombre) {
        this.nombre = nombre;
    }

    public TextView getPosicion() {
        return posicion;
    }

    public void setPosicion(TextView posicion) {
        this.posicion = posicion;
    }

    public TextView getPeso() {
        return peso;
    }

    public void setPeso(TextView peso) {
        this.peso = peso;
    }

    public TextView getAltura() {
        return altura;
    }

    public void setAltura(TextView altura) {
        this.altura = altura;
    }
}
*/
