package es.iesnervion.nzhdeh.Examen2TrimestreNzhdeh.fragments;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import es.iesnervion.nzhdeh.Examen2TrimestreNzhdeh.entidades.Atleta;
import es.iesnervion.nzhdeh.Examen2TrimestreNzhdeh.viewmodels.MainActivityVM;
import es.iesnervion.pablo.practica2eva.R;

public class DetallesFragment extends Fragment {

    private TextView nombrePersona;
    private TextView apellidosPersona;
    private TextView observacionesAtleta;
    private MainActivityVM vm;

    public DetallesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_detalle, container, false);

        nombrePersona = root.findViewById(R.id.detallesNombre);
        apellidosPersona = root.findViewById(R.id.detallesApellidos);
        observacionesAtleta = root.findViewById(R.id.detallesObservacion);

        vm = new ViewModelProvider(getActivity()).get(MainActivityVM.class);

        //Establecemos el contenido de las vistas
        Atleta atleta = vm.getAtletaSeleccionado().getValue();

        nombrePersona.setText(atleta.getNombre());
        apellidosPersona.setText(atleta.getApellidos());
        observacionesAtleta.setText(atleta.getObservaciones());

        return root;
    }

}
