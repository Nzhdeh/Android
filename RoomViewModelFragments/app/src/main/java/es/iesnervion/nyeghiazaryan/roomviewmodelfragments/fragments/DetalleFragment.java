package es.iesnervion.nyeghiazaryan.roomviewmodelfragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.R;
import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.clases.Persona;
import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.viewmodels.PersonaVM;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleFragment extends Fragment
{
    private TextView nombre,apellidos,biografia;
    private PersonaVM viewModel;
    private Observer<Persona> observerPersona;

    public DetalleFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detalle, container, false);

        nombre = view.findViewById(R.id.twDetalleNombre);
        apellidos = view.findViewById(R.id.twDetalleApellidos);
        biografia = view.findViewById(R.id.twDetalleBiografia);

        viewModel = new ViewModelProvider(requireActivity()).get(PersonaVM.class);

        observerPersona = new Observer<Persona>()
        {
            @Override
            public void onChanged(Persona persona)
            {
                nombre.setText(persona.getNombre());
                apellidos.setText(persona.getApellidos());
                biografia.setText(persona.getBiografia());
            }
        };
        viewModel.getPersona().observe(getViewLifecycleOwner(),observerPersona);

        return  view;
    }

}
