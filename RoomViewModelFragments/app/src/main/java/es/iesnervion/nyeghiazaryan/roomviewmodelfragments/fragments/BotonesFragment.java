package es.iesnervion.nyeghiazaryan.roomviewmodelfragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.R;
import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.viewmodels.PersonaVM;

/**
 * A simple {@link Fragment} subclass.
 */
public class BotonesFragment extends Fragment
{
    private Button botonInsertar,botonListar;
    private PersonaVM viewModel;


    public BotonesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_botones, container, false);

        viewModel = new ViewModelProvider(requireActivity()).get(PersonaVM.class);

        botonInsertar = view.findViewById(R.id.btnInsertar);
        botonListar = view.findViewById(R.id.btnListar);

        botonInsertar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                viewModel.cambiarBoton(v.getId());
            }
        });

        botonListar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                viewModel.cambiarBoton(v.getId());
            }
        });

        return view;
    }

}
