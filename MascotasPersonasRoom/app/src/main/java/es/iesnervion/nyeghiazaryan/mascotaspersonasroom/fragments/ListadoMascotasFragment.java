package es.iesnervion.nyeghiazaryan.mascotaspersonasroom.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.R;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.adaptadores.AdaptadorMascota;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.adaptadores.AdaptadorPersona;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.clases.Mascota;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.clases.Persona;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.viewmodel.MascotasVM;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListadoMascotasFragment extends Fragment
{
    private ListView listadoMascotas;
    private MascotasVM viewModel;
    private Observer<List<Mascota>> observerListado;
    private AdaptadorMascota adaptadorMascota;
    private List<Mascota> listado;

    public ListadoMascotasFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_listado_mascotas, container, false);

        viewModel = new ViewModelProvider(requireActivity()).get(MascotasVM.class);

        listadoMascotas = view.findViewById(R.id.lvListadoMascotas);

        observerListado = new Observer<List<Mascota>>()
        {
            @Override
            public void onChanged(List<Mascota> mascotas)
            {
                listado = mascotas;
                if(listado.size()>0)
                {
                    adaptadorMascota = new AdaptadorMascota(requireContext(),listado);
                    listadoMascotas.setAdapter(adaptadorMascota);
                }
                else
                {
                    Toast toast = Toast.makeText(requireContext(), "No hay nada en la lista de mascotas",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        };
        viewModel.getListadoMascotas().observe(getViewLifecycleOwner(),observerListado);//getViewLifecycleOwner() actua sobre su propio ciclo de vida
        return  view;
    }

}
