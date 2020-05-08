package es.iesnervion.nyeghiazaryan.nbareturnsconfragmentsyvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.ViewGroup;

import es.iesnervion.nyeghiazaryan.nbareturnsconfragmentsyvm.clases.Nba;
import es.iesnervion.nyeghiazaryan.nbareturnsconfragmentsyvm.fragments.DetalleFragment;
import es.iesnervion.nyeghiazaryan.nbareturnsconfragmentsyvm.fragments.ListaFragment;
import es.iesnervion.nyeghiazaryan.nbareturnsconfragmentsyvm.viewmodels.NbaVM;

public class MainActivity extends AppCompatActivity
{
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private ViewGroup fragmentContenedor, lista, detalle;

    private NbaVM viewModel;
    private Observer<Nba> observerNba;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(NbaVM.class);

        fragmentContenedor = findViewById(R.id.flContenedor);

        if(fragmentContenedor == null)
        {
            lista = findViewById(R.id.fragLista);
            detalle = findViewById(R.id.fragDetalle);
        }
        else
        {
            fragmentManager=getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();

            if(fragmentContenedor!=null)
            {
                ListaFragment fragemntLista = new ListaFragment();
                fragmentTransaction.add(R.id.flContenedor,fragemntLista).addToBackStack(null).commit();
            }


            observerNba = new Observer<Nba>()
            {
                @Override
                public void onChanged(Nba nba)
                {
                    fragmentManager=getSupportFragmentManager();
                    fragmentTransaction = fragmentManager.beginTransaction();

                    if(fragmentContenedor!=null)
                    {
                        DetalleFragment fragemntDetalle = new DetalleFragment();
                        fragmentTransaction.replace(R.id.flContenedor,fragemntDetalle).addToBackStack(null).commit();
                    }
                }
            };

            viewModel.getEquipo().observe(this,observerNba);
        }
    }
}
