package es.iesnervion.pablo.practica2eva.Fragments;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import es.iesnervion.pablo.practica2eva.Entidades.ClsPersona;
import es.iesnervion.pablo.practica2eva.R;
import es.iesnervion.pablo.practica2eva.ViewModels.MainVM;

public class detallesPersona extends Fragment {

    private TextView nombrePersona;
    private TextView apellidosPersona;
    private TextView direccionPersona;
    private MainVM vm;

    public detallesPersona() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_detalles_persona, container, false);

        nombrePersona = root.findViewById(R.id.detallesNombre);
        apellidosPersona = root.findViewById(R.id.detallesApellidos);
        direccionPersona = root.findViewById(R.id.detallesDireccion);

        vm = new ViewModelProvider(getActivity()).get(MainVM.class);

        //Establecemos el contenido de las vistas
        ClsPersona persona = vm.getPersonaSeleccionada().getValue();

        nombrePersona.setText(persona.getNombre());
        apellidosPersona.setText(persona.getApellidos());
        direccionPersona.setText(persona.getDireccion());

        return root;
    }

}
