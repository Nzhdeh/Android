package es.iesnervion.nyeghiazaryan.examen2trimestrenzhdeh.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import java.util.ArrayList;

import es.iesnervion.nyeghiazaryan.examen2trimestrenzhdeh.R;
import es.iesnervion.nyeghiazaryan.examen2trimestrenzhdeh.adaptadores.AtletaAdapter;
import es.iesnervion.nyeghiazaryan.examen2trimestrenzhdeh.entidades.Atleta;
import es.iesnervion.nyeghiazaryan.examen2trimestrenzhdeh.viewmodels.MainActivityVM;

public class ListadoFragment extends Fragment implements AdapterView.OnItemClickListener
{
    private ListView lista;
    private MainActivityVM vm;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_listado, container, false);
        lista = root.findViewById(R.id.listadoAtletas);

        vm = new ViewModelProvider(getActivity()).get(MainActivityVM.class);

        lista.setAdapter(new AtletaAdapter(getActivity().getBaseContext(), vm.getListaAtletas().getValue()));

        vm.getListaAtletas().observe(getActivity(), new Observer<ArrayList<Atleta>>()
        {
            @Override
            public void onChanged(ArrayList<Atleta> atletas)
            {
                lista.setAdapter(new AtletaAdapter(getActivity(), vm.getListaAtletas().getValue()));
            }
        });

        lista.setOnItemClickListener(this);

        return root;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        Atleta atleta = null;

        if(position >= 0){
            atleta = vm.getListaAtletas().getValue().get(position);
        }

        vm.setAtletaSeleccionado(atleta);
    }

}
