package es.iesnervion.nyeghiazaryan.comunicacionentrefragmentyactivity.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import es.iesnervion.nyeghiazaryan.comunicacionentrefragmentyactivity.R;
import es.iesnervion.nyeghiazaryan.comunicacionentrefragmentyactivity.viewmodels.MainActivityVM;


public class BotonesFragment extends Fragment
{
    private MainActivityVM viewModel;
    private Button boton1;
    private Button boton2;

    public BotonesFragment()
    {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static BotonesFragment newInstance()
    {
        BotonesFragment fragment = new BotonesFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        viewModel = new ViewModelProvider(requireActivity()).get(MainActivityVM.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_botones, container, false);

        boton1 = view.findViewById(R.id.boton1);
        boton2 = view.findViewById(R.id.boton2);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.cambiarBoton(boton1.getId());
            }
        });


        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.cambiarBoton(boton2.getId());
            }
        });
        return view;
    }
}
