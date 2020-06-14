package es.iesnervion.nyeghiazaryan.mascotaspersonasroom.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.R;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.adaptadores.AdaptadorPersona;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.clases.Persona;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.viewmodel.MascotasVM;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListadoPersonasFragment extends Fragment
{
    private ListView listadoPersonas;
    private MascotasVM viewModel;
    private Observer<List<Persona>> observerListado;
    private AdaptadorPersona adaptadorPersona;
    private List<Persona> listado;

    public ListadoPersonasFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_listado_personas, container, false);

        viewModel = new ViewModelProvider(requireActivity()).get(MascotasVM.class);

        listadoPersonas = view.findViewById(R.id.lvListadoPersonas);

        observerListado = new Observer<List<Persona>>()
        {
            @Override
            public void onChanged(List<Persona> personas)
            {
                listado = personas;
                if(listado.size()>0)
                {
                    adaptadorPersona = new AdaptadorPersona(requireContext(),listado);
                    listadoPersonas.setAdapter(adaptadorPersona);
                }
                else
                {
                    Toast toast = Toast.makeText(requireContext(), "No hay nada en la lista de personas",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        };
        viewModel.getListadoPersonas().observe(getViewLifecycleOwner(),observerListado);//getViewLifecycleOwner() actua sobre su propio ciclo de vida

        listadoPersonas.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                viewModel.cambiarIdPersonaParaMascota(listado.get(position).getId());
            }
        });
        return view;
    }

}
