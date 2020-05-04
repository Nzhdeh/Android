package es.iesnervion.nyeghiazaryan.practicandofragmentsinterfaces;


import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import java.util.ArrayList;

import es.iesnervion.nyeghiazaryan.practicandofragmentsinterfaces.clases.Nba;
import es.iesnervion.nyeghiazaryan.practicandofragmentsinterfaces.fragments.DetalleFragment;
import es.iesnervion.nyeghiazaryan.practicandofragmentsinterfaces.fragments.ListaFragment;
import es.iesnervion.nyeghiazaryan.practicandofragmentsinterfaces.interfaces.OnInteraccionFragment;

public class MainActivity extends AppCompatActivity implements OnInteraccionFragment
{
    ListView listaDatos;
    ArrayList<Nba> lista;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager=getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        ListaFragment fragemntListado=new ListaFragment();
        fragmentTransaction.add(R.id.fragmentContenedor,fragemntListado).commit();
    }

    public void OnAvisarAlActivitYMain(AdapterView<?> parent, View view, int position, long id)
    {
        fragmentTransaction = fragmentManager.beginTransaction();

        DetalleFragment miFragment=new DetalleFragment();

        fragmentTransaction.replace(R.id.fragmentContenedor,miFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
