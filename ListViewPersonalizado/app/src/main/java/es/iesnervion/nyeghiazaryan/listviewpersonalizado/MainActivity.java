package es.iesnervion.nyeghiazaryan.listviewpersonalizado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import es.iesnervion.nyeghiazaryan.listviewpersonalizado.Clases.Persona;
import es.iesnervion.nyeghiazaryan.listviewpersonalizado.Clases.PersonaAdapter;

public class MainActivity extends AppCompatActivity
{
    private ListView lvItem;
    private PersonaAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        lvItem=findViewById(R.id.lv1);
//        adaptador=new PersonaAdapter(this,Lista());
//        lvItem.setAdapter(adaptador);
    }

    private ArrayList<Persona> Lista()
    {
        ArrayList<Persona> p=new ArrayList<>();

        p.add(new Persona("Nzhdeh",R.drawable.ic_launcher));
        p.add(new Persona("Nzhdeh",R.drawable.ic_launcher));
        p.add(new Persona("Nzhdeh",R.drawable.ic_launcher));
        p.add(new Persona("Nzhdeh",R.drawable.ic_launcher));
        p.add(new Persona("Nzhdeh",R.drawable.ic_launcher));
        p.add(new Persona("Nzhdeh",R.drawable.ic_launcher));
        p.add(new Persona("Nzhdeh",R.drawable.ic_launcher));
        p.add(new Persona("Nzhdeh",R.drawable.ic_launcher));
        p.add(new Persona("Nzhdeh",R.drawable.ic_launcher));
        p.add(new Persona("Nzhdeh",R.drawable.ic_launcher));
        p.add(new Persona("Nzhdeh",R.drawable.ic_launcher));
        p.add(new Persona("Nzhdeh",R.drawable.ic_launcher));


        return p;
    }
}
