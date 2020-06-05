package es.iesnervion.nyeghiazaryan.roomviewmodelfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.ListFragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;

import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.clases.Persona;
import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.fragments.BotonesFragment;
import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.fragments.DetalleFragment;
import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.fragments.InsertarPersonaFragment;
import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.fragments.ListadoFragment;
import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.viewmodels.PersonaVM;

public class MainActivity extends AppCompatActivity
{
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private ViewGroup fragmentContenedor,insercionFrag,listadoFrag,detalleFrag;

    private PersonaVM viewModel;
    private Observer<Integer> observerBoton;
    private Observer<Persona> observerPersona;
    private Button insertar,listar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(PersonaVM.class);

        /**
        * para modificar e insertar usaré el mismo fragment
        * */

//        insertar = findViewById(R.id.btnInsertar);
//        listar = findViewById(R.id.btnListar);
        fragmentContenedor = findViewById(R.id.flContenedor);

        if(fragmentContenedor == null)
        {
            insercionFrag = findViewById(R.id.fragInsercion);
            listadoFrag = findViewById(R.id.fragListado);
            detalleFrag = findViewById(R.id.fragDetalle);
        }
        else
        {
            fragmentManager=getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();

            BotonesFragment fragemntBotones = new BotonesFragment();
            fragmentTransaction.add(R.id.flContenedor,fragemntBotones).addToBackStack(null).commit();


            observerBoton = new Observer<Integer>()
            {
                @Override
                public void onChanged(Integer integer)
                {
                    fragmentManager=getSupportFragmentManager();
                    fragmentTransaction = fragmentManager.beginTransaction();

                    switch (integer)
                    {
                        case R.id.btnInsertar:
                            InsertarPersonaFragment insertarPersonaFragment = new InsertarPersonaFragment();
                            fragmentTransaction.replace(R.id.flContenedor,insertarPersonaFragment).addToBackStack(null).commit();
                            break;

                        case R.id.btnListar:
                            ListadoFragment listadoFragment= new ListadoFragment();
                            fragmentTransaction.replace(R.id.flContenedor,listadoFragment).addToBackStack(null).commit();
                            break;
                    }
                }
            };
            viewModel.getBoton().observe(this,observerBoton);

            observerPersona = new Observer<Persona>()
            {
                @Override
                public void onChanged(Persona persona)
                {
                    fragmentManager=getSupportFragmentManager();
                    fragmentTransaction = fragmentManager.beginTransaction();

                    DetalleFragment fragemntDetalle = new DetalleFragment();
                    fragmentTransaction.replace(R.id.flContenedor,fragemntDetalle).addToBackStack(null).commit();
                }
            };

            viewModel.getPersona().observe(this,observerPersona);
        }
    }
}
