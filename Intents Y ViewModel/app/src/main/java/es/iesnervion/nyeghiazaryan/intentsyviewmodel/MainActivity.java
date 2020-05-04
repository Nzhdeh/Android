package es.iesnervion.nyeghiazaryan.intentsyviewmodel;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.Observer;

import es.iesnervion.nyeghiazaryan.intentsyviewmodel.adaptadores.Adaptador;
import es.iesnervion.nyeghiazaryan.intentsyviewmodel.clases.Persona;
import es.iesnervion.nyeghiazaryan.intentsyviewmodel.utilidades.Util;
import es.iesnervion.nyeghiazaryan.intentsyviewmodel.viewmodels.MainActivityVM;

public class MainActivity extends AppCompatActivity
{
    private ListView listadoPersonas;
    private ArrayList<Persona> listado;
    private MainActivityVM viewModel;
    private int pos;
    private Adaptador miAdaptador;
    private Observer<List<Persona>> observerListado;

    private final int CODIGO_RESPUESTA = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Util u=new Util();

        viewModel = new ViewModelProvider(this).get(MainActivityVM.class);
        listadoPersonas=findViewById(R.id.lvListadoPersonas);

        listado = (ArrayList<Persona>) viewModel.getListadoPersonas().getValue();



        miAdaptador=new Adaptador(getApplicationContext(),listado);
        listadoPersonas.setAdapter(miAdaptador);

        listadoPersonas.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent intent=new Intent(MainActivity.this,ImagenesActivity.class);
                startActivityForResult(intent,CODIGO_RESPUESTA);
                pos=position;
            }
        });


        //miAdaptador=new Adaptador(getApplicationContext(),viewModel.getListadoPersonas().getValue());
        observerListado = new Observer<List<Persona>>()
        {
            @Override
            public void onChanged( @Nullable List<Persona> personas)
            {
                miAdaptador.notifyDataSetChanged();
            }
        };
        viewModel.getListadoPersonas().observe(this,observerListado);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable final Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        int imagen;
        viewModel = new ViewModelProvider(this).get(MainActivityVM.class);

        if (requestCode == CODIGO_RESPUESTA)
        {
            if (resultCode == RESULT_OK) {
                //TODO hacer
                if (data != null)
                {
                    imagen = data.getIntExtra("img",0);//obtengo la imaagen
                    listado.get(pos).setImagen(imagen);//cambio la imagen de la persona correspondoente
                    viewModel.cambiarImagen(listado);//cambio en viewmodel
//                    miAdaptador=new Adaptador(getApplicationContext(),viewModel.getListadoPersonas().getValue());
//                    listadoPersonas.setAdapter(miAdaptador);
                }
            }
        }
    }
}
