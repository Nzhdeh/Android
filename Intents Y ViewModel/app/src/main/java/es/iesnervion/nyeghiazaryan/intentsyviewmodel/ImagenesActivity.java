package es.iesnervion.nyeghiazaryan.intentsyviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import es.iesnervion.nyeghiazaryan.intentsyviewmodel.adaptadores.AdaptadorImagen2Activity;
import es.iesnervion.nyeghiazaryan.intentsyviewmodel.utilidades.Util;

public class ImagenesActivity extends AppCompatActivity
{
    private ListView listadoImagenes;
    private int [] listado;
    //private MainActivityVM viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagenes);

        Util u=new Util();

        listadoImagenes=findViewById(R.id.lvImagenPersona);

        listado=u.cargarImasgenes();

        AdaptadorImagen2Activity miAdaptador=new AdaptadorImagen2Activity(getApplicationContext(),listado);
        listadoImagenes.setAdapter(miAdaptador);

        listadoImagenes.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id)
            {
                Intent intent=new Intent();
                intent.putExtra("img",listado[position]);
                setResult(Activity.RESULT_OK,intent);
                finish();
            }
        });
    }
}
