package es.iesnervion.nyeghiazaryan.mascotaspersonasroom.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
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
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.bbdd.MascotaIntermedio;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.clases.Mascota;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.viewmodel.MascotasVM;

/**
 * A simple {@link Fragment} subclass.
 */
public class MascotasPorPersonaFragment extends Fragment
{
    private MascotasVM viewModel;
    private Observer<Integer> observerIdPersona;
    private List<Mascota> listado;
    private ListView listadoMascotas;


    public MascotasPorPersonaFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mascotas_por_persona, container, false);

        viewModel = new ViewModelProvider(requireActivity()).get(MascotasVM.class);

        listadoMascotas = view.findViewById(R.id.lvListadoMascotasPorPersona);

        observerIdPersona = new Observer<Integer>()
        {
            @Override
            public void onChanged(Integer integer)
            {
                Toast toast;
                listado = viewModel.obtenerListadoMascotasPorPersona(integer.intValue());
                if(listado.size()>0)
                {
                    AdaptadorMascota adapter = new AdaptadorMascota(requireActivity(),listado);
                    listadoMascotas.setAdapter(adapter);
                }else
                {
                    toast = Toast.makeText(requireContext(), "No tine mascotas", Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        };
        viewModel.getIdPersonaParaMascota().observe(getViewLifecycleOwner(),observerIdPersona);

        return  view;
    }

}
