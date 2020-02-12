package es.iesnervion.pablo.practica2eva.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import es.iesnervion.pablo.practica2eva.BaseDatos.UsarDataBase;
import es.iesnervion.pablo.practica2eva.Entidades.ClsPersona;
import es.iesnervion.pablo.practica2eva.R;
import es.iesnervion.pablo.practica2eva.ViewModels.MainVM;

public class crearPersona extends Fragment {

    private EditText nombrePersona;
    private EditText apellidosPersona;
    private EditText direccionPersona;
    private Button btnCrear;
    private MainVM vm;

    public crearPersona() {
        // Required empty public constructor
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_crear_persona, container, false);

        nombrePersona = root.findViewById(R.id.crearNombre);
        apellidosPersona = root.findViewById(R.id.crearApellido);
        direccionPersona = root.findViewById(R.id.crearDireccion);
        vm = new ViewModelProvider(getActivity()).get(MainVM.class);
        btnCrear = root.findViewById(R.id.buttoncrear);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anadirPersona();
            }
        });

        return root;
    }

    //Añade una persona a la lista.
    private void anadirPersona(){
        //Insertamos la persona en la lista.
        vm.getListaPersonas().getValue().add(new ClsPersona(nombrePersona.getText().toString(), apellidosPersona.getText().toString(), direccionPersona.getText().toString()));
        UsarDataBase.getDataBase(getContext()).dao().insertarPersona(new ClsPersona(nombrePersona.getText().toString(), apellidosPersona.getText().toString(), direccionPersona.getText().toString()));
        vm.setPersonaSeleccionada(null);
    }

    //Limpia los campos
    private void limpiarCampos(){
        nombrePersona.setText("");
        apellidosPersona.setText("");
        direccionPersona.setText("");
    }

    @Override
    public void onResume(){
        super.onResume();
        limpiarCampos();
    }

}
