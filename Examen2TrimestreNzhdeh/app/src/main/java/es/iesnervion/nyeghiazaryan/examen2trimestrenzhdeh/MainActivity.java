package es.iesnervion.nyeghiazaryan.examen2trimestrenzhdeh;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import es.iesnervion.nyeghiazaryan.examen2trimestrenzhdeh.fragments.DetallesFragment;
import es.iesnervion.nyeghiazaryan.examen2trimestrenzhdeh.fragments.EleccionFragment;
import es.iesnervion.nyeghiazaryan.examen2trimestrenzhdeh.fragments.InsertarFragment;
import es.iesnervion.nyeghiazaryan.examen2trimestrenzhdeh.fragments.ListadoFragment;
import es.iesnervion.nyeghiazaryan.examen2trimestrenzhdeh.viewmodels.MainActivityVM;


/*
la lista sale, se puede insertar
Para la tablet no está hecha
los fragmentos se superponen
y no se puede ir atras ,hay que volver a ejecutar
los detalles no estan hechos
*/
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

        fragmentTransaction.replace(R.id.flContenedor,fragment);
        fragmentTransaction.commit();

    }

    public void Listar(View view)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ListadoFragment fragment = new ListadoFragment();

        fragmentTransaction.replace(R.id.flContenedor,fragment);
        fragmentTransaction.commit();
    }
}
