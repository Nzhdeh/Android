package es.iesnervion.nzhdeh.Examen2TrimestreNzhdeh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import es.iesnervion.nzhdeh.Examen2TrimestreNzhdeh.fragments.*;
import es.iesnervion.nzhdeh.Examen2TrimestreNzhdeh.viewmodels.*;
import es.iesnervion.pablo.practica2eva.R;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements EleccionFragment.OnFragmentInteractionListener

{

    private ListadoFragment fragmentListadoFragment;
    private DetallesFragment fragmentDetalles;
    private InsertarFragment fragmentInsertar;
    private MainActivityVM vm;
    private EleccionFragment fragmentEleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        fragmentListadoFragment = new ListadoFragment();
//        fragmentDetalles = new DetallesFragment();
//        fragmentInsertar = new InsertarFragment();
//        vm = new ViewModelProvider(this).get(MainActivityVM.class);

        //Ponemos el fragment que contiene el ListadoFragment de atletas
        //getSupportFragmentManager().beginTransaction().replace(R.id.flContenedor, fragmentEleccion).commit();

        //Observer del atleta seleccionado
//        vm.getAtletaSeleccionado().observe(this, new Observer<Atleta>()
//        {
//            @Override
//            public void onChanged(Atleta atleta)
//            {
//                if(vm.getAtletaSeleccionado().getValue() != null){ //Si hay algun atleta seleccionado
//                    getSupportFragmentManager().beginTransaction().replace(R.id.flContenedor, fragmentDetalles).addToBackStack(null).commit(); //AddToBackStack permite volver atras cuando pasamos de unfragment a otro.
//                }else{
//                    getSupportFragmentManager().beginTransaction().replace(R.id.flContenedor, fragmentInsertar).addToBackStack(null).commit(); //AddToBackStack permite volver atras cuando pasamos de unfragment a otro.
//                }
//            }
//        });

    }

    @Override
    public void onFragmentInteraction(Uri uri)
    {

    }

    public void Insertar(View view)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        InsertarFragment fragment = new InsertarFragment();

        fragmentTransaction.add(R.id.flContenedor,fragment);
        fragmentTransaction.commit();

    }

    public void Listar(View view)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ListadoFragment fragment = new ListadoFragment();

        fragmentTransaction.add(R.id.flContenedor,fragment);
        fragmentTransaction.commit();

    }
}
