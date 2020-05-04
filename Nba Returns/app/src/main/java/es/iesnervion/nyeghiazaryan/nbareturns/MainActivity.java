package es.iesnervion.nyeghiazaryan.nbareturns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import es.iesnervion.nyeghiazaryan.nbareturns.adaptadores.Adaptador;
import es.iesnervion.nyeghiazaryan.nbareturns.clases.Nba;
import es.iesnervion.nyeghiazaryan.nbareturns.util.Utilidades;

public class MainActivity extends AppCompatActivity
{
    ListView listaDatos;
    ArrayList<Nba> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utilidades u=new Utilidades();

        listaDatos=findViewById(R.id.lstNba);

        lista=u.cargarArrayNba();

        Adaptador miAdaptador=new Adaptador(getApplicationContext(),lista);

        listaDatos.setAdapter(miAdaptador);

        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent intent=new Intent(MainActivity.this,DetalleActivity.class);
                intent.putExtra("id",lista.get(position));
                startActivity(intent);
            }
        });
    }
}
