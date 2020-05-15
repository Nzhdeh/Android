package es.iesnervion.nyeghiazaryan.nbareturnsconfragmentsyvm.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import es.iesnervion.nyeghiazaryan.nbareturnsconfragmentsyvm.R;
import es.iesnervion.nyeghiazaryan.nbareturnsconfragmentsyvm.adaptadores.Adaptador;
import es.iesnervion.nyeghiazaryan.nbareturnsconfragmentsyvm.clases.Nba;
import es.iesnervion.nyeghiazaryan.nbareturnsconfragmentsyvm.util.Utilidades;
import es.iesnervion.nyeghiazaryan.nbareturnsconfragmentsyvm.viewmodels.NbaVM;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListaFragment extends Fragment
{
    private ListView listaDatos;
    private ArrayList<Nba> lista;
    private NbaVM viewModel;

    public ListaFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_lista, container, false);

        listaDatos = view.findViewById(R.id.lstNba);

        viewModel = new ViewModelProvider(requireActivity()).get(NbaVM.class);

        Utilidades u = new Utilidades();

        lista = u.cargarArrayNba();

        Adaptador miAdapter = new Adaptador(requireContext(),lista);



        listaDatos.setAdapter(miAdapter);

        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                viewModel.cambiarPosicion(lista.get(position));
            }
        });

        return view;
    }

}
