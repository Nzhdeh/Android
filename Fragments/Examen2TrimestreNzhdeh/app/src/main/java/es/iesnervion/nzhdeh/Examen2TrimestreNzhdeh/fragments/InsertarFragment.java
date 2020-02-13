package es.iesnervion.nzhdeh.Examen2TrimestreNzhdeh.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import es.iesnervion.nzhdeh.Examen2TrimestreNzhdeh.basededatos.BaseDeDatos;
import es.iesnervion.nzhdeh.Examen2TrimestreNzhdeh.entidades.Atleta;
import es.iesnervion.nzhdeh.Examen2TrimestreNzhdeh.viewmodels.MainActivityVM;
import es.iesnervion.pablo.practica2eva.R;

public class InsertarFragment extends Fragment
{

    private EditText nombreAtleta;
    private EditText apellidosAtleta;
    private EditText observacionesAtleta;
    private Button btnCrear;
    private MainActivityVM vm;

    public InsertarFragment()
    {
        // Required empty public constructor
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View root = inflater.inflate(R.layout.fragment_insercion, container, false);

        nombreAtleta = root.findViewById(R.id.nombre);
        apellidosAtleta = root.findViewById(R.id.apellido);
        observacionesAtleta = root.findViewById(R.id.observacion);
        vm = new ViewModelProvider(getActivity()).get(MainActivityVM.class);
        btnCrear = root.findViewById(R.id.buttoncrear);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anadirAtleta();
            }
        });

        return root;
    }

    //Añade una persona a la ListadoFragment.
    private void anadirAtleta()
    {
        //Insertamos la persona en la ListadoFragment.
        vm.getListaAtletas().getValue().add(new Atleta(nombreAtleta.getText().toString(), apellidosAtleta.getText().toString(), observacionesAtleta.getText().toString()));
        BaseDeDatos.getDataBase(getContext()).dao().insertarAtletas(new Atleta(nombreAtleta.getText().toString(), apellidosAtleta.getText().toString(), observacionesAtleta.getText().toString()));
        vm.setAtletaSeleccionado(null);
    }

    //Limpia los campos
    private void limpiarCampos()
    {
        nombreAtleta.setText("");
        apellidosAtleta.setText("");
        observacionesAtleta.setText("");
    }

    @Override
    public void onResume()
    {
        super.onResume();
        limpiarCampos();
    }

}
