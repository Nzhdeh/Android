package es.iesnervion.nyeghiazaryan.mascotaspersonasroom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.ViewGroup;

import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.fragments.InsertarMascotaFragment;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.fragments.InsertarPersonaFragment;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.fragments.ListadoMascotasFragment;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.fragments.ListadoPersonasFragment;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.fragments.MascotasPorPersonaFragment;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.fragments.SpinnerFragment;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.viewmodel.MascotasVM;

public class MainActivity extends AppCompatActivity
{
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private ViewGroup fragmentContenedor;

    private MascotasVM viewModel;
    private Observer<String> observerSpinneer;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(MascotasVM.class);

        fragmentContenedor = findViewById(R.id.flContenedor);

        fragmentManager=getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        SpinnerFragment spinnerFragment = new SpinnerFragment();
        fragmentTransaction.add(R.id.flContenedor,spinnerFragment).commit();

        observerSpinneer = new Observer<String>()
        {
            @Override
            public void onChanged(String s)
            {
                switch (s)
                {
                    case "Insertar persona":
                        InsertarPersonaFragment frInsPers = new InsertarPersonaFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.flContenedor,frInsPers).addToBackStack(null).commit();
                        break;

                    case "Insertar mascota":
                        InsertarMascotaFragment frInsMasc = new InsertarMascotaFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.flContenedor,frInsMasc).addToBackStack(null).commit();
                        break;

                    case "Listado de personas":
                        ListadoPersonasFragment listadoPersonasFragment = new ListadoPersonasFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.flContenedor,listadoPersonasFragment).addToBackStack(null).commit();
                        break;

                    case "Listado de mascotas":
                        ListadoMascotasFragment listadoMascotasFragment = new ListadoMascotasFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.flContenedor,listadoMascotasFragment).addToBackStack(null).commit();
                        break;

                    case "Listado de mascotas por persona":
                        MascotasPorPersonaFragment mascotasPorPersonaFragment = new MascotasPorPersonaFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.flContenedor,mascotasPorPersonaFragment).addToBackStack(null).commit();
                        break;
                }
            }
        };
        viewModel.getSpinner().observe(this,observerSpinneer);
    }
}
