package es.iesnervion.pablo.practica2eva;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import es.iesnervion.pablo.practica2eva.Entidades.ClsPersona;
import es.iesnervion.pablo.practica2eva.Fragments.crearPersona;
import es.iesnervion.pablo.practica2eva.Fragments.detallesPersona;
import es.iesnervion.pablo.practica2eva.Fragments.lista;
import es.iesnervion.pablo.practica2eva.ViewModels.MainVM;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private lista fragmentLista;
    private detallesPersona fragmentDetalles;
    private crearPersona fragmentCrear;
    private MainVM vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentLista = new lista();
        fragmentDetalles = new detallesPersona();
        fragmentCrear = new crearPersona();
        vm = new ViewModelProvider(this).get(MainVM.class);

        //Observer de la persona seleccionada
        vm.getPersonaSeleccionada().observe(this, new Observer<ClsPersona>() {
            @Override
            public void onChanged(ClsPersona clsPersona) {
                if(vm.getPersonaSeleccionada().getValue() != null){ //Si hay alguna persona seleccionada
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, fragmentDetalles).addToBackStack(null).commit(); //AddToBackStack permite volver atras cuando pasamos de unfragment a otro.
                }else{
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, fragmentCrear).addToBackStack(null).commit(); //AddToBackStack permite volver atras cuando pasamos de unfragment a otro.
                }
            }
        });

        //Ponemos el fragment que contiene la lista de personas
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, fragmentLista).commit();
    }
}
