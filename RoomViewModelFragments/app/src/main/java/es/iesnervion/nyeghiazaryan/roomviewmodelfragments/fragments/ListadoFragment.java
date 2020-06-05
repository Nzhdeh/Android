package es.iesnervion.nyeghiazaryan.roomviewmodelfragments.fragments;


import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.R;
import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.adapters.AdaptadorPersona;
import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.clases.Persona;
import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.viewmodels.PersonaVM;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListadoFragment extends Fragment
{
    private ListView listadoPersonas;
    private PersonaVM viewModel;
    private List<Persona> listado;
    private Observer<List<Persona>> observerListado;
    private AdaptadorPersona miAdapter;

    public ListadoFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_listado, container, false);

        viewModel = new ViewModelProvider(requireActivity()).get(PersonaVM.class);

        listadoPersonas = view.findViewById(R.id.lwListado);

        listadoPersonas.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                viewModel.cambiarPosicion(listado.get(position));
            }
        });


        observerListado = new Observer<List<Persona>>()
        {
            @Override
            public void onChanged(List<Persona> personas)
            {
//                if(getActivity() != null)//porque cuando inserto, la actividad no está en primer plano y devuelve un null
//                {
                    listado = personas;
                    if(listado.size()>0)
                    {
                        miAdapter = new AdaptadorPersona(requireContext(),listado);
                        listadoPersonas.setAdapter(miAdapter);
                    }
                    else
                    {
                        Toast toast = Toast.makeText(requireContext(), "No hay nada en la lista",Toast.LENGTH_SHORT);
                        toast.show();
                    }
                //}
            }
        };
        viewModel.getListadoPersonas().observe(getViewLifecycleOwner(),observerListado);//getViewLifecycleOwner() actua sobre su propio ciclo de vida

        return view;
    }

//    @Override
//    public void onPause()
//    {
//        listado = null;
//        super.onPause();
//    }

}
