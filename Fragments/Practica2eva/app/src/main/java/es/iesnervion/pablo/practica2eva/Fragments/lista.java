package es.iesnervion.pablo.practica2eva.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import es.iesnervion.pablo.practica2eva.Adaptadores.CustomAdapter;
import es.iesnervion.pablo.practica2eva.Entidades.ClsPersona;
import es.iesnervion.pablo.practica2eva.R;
import es.iesnervion.pablo.practica2eva.ViewModels.MainVM;

public class lista extends Fragment implements AdapterView.OnItemClickListener {
    private ListView lista;
    private MainVM vm;
    private Button anadir;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_lista, container, false);
        lista = root.findViewById(R.id.listviewPersonas);
        anadir = root.findViewById(R.id.btnAnadir);

        vm = new ViewModelProvider(getActivity()).get(MainVM.class);

        //Establecemos el adapter
        lista.setAdapter(new CustomAdapter(getActivity().getBaseContext(), vm.getListaPersonas().getValue()));

        //Observamos la lista
        vm.getListaPersonas().observe(getActivity(), new Observer<ArrayList<ClsPersona>>() {
            @Override
            public void onChanged(ArrayList<ClsPersona> clsPersonas) {
                //Actualizamos la lista
                lista.setAdapter(new CustomAdapter(getActivity(), vm.getListaPersonas().getValue()));
            }
        });

        anadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vm.setPersonaSeleccionada(null);
            }
        });

        //Listener para saber sobre que persona ha pulsado.
        lista.setOnItemClickListener(this);

        return root;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //Cuando pulsa sobre un elemento lo establecemos como la persona seleccionada en el VM
        ClsPersona persona = null;

        if(position >= 0){
            persona = vm.getListaPersonas().getValue().get(position);
        }

        vm.setPersonaSeleccionada(persona);
    }

}
