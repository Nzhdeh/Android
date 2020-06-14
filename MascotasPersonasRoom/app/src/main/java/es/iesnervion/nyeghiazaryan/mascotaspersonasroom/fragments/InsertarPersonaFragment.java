package es.iesnervion.nyeghiazaryan.mascotaspersonasroom.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.R;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.bbdd.MascotaIntermedio;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.clases.Persona;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.viewmodel.MascotasVM;

/**
 * A simple {@link Fragment} subclass.
 */
public class InsertarPersonaFragment extends Fragment
{
    private EditText nombrePersona,apellidosPersona;
    private Button guardar;
    private MascotaIntermedio intermedio;//compadre

    public InsertarPersonaFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_insertar_persona, container, false);

        nombrePersona = view.findViewById(R.id.tvInsertarNombrePersona);
        apellidosPersona = view.findViewById(R.id.tvInsertarApellidosPersona);
        guardar = view.findViewById(R.id.btnGuardarPersona);

        intermedio = MascotaIntermedio.get(requireContext());

        guardar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                guardar();
            }
        });

        return view;
    }

    /*
    * sirve para guardar una persona en la bbdd
    * */
    private void guardar()
    {
        Toast toast;
        Persona oPersona = new Persona();

        if (!nombrePersona.getText().toString().equals("") && !apellidosPersona.getText().toString().equals("")) {
            oPersona.setNombre(nombrePersona.getText().toString());
            oPersona.setApellidos(apellidosPersona.getText().toString());

            //insertamos
            intermedio.addPersona(oPersona);
            nombrePersona.setText("");
            apellidosPersona.setText("");
            toast = Toast.makeText(requireContext(), "Se ha guardado correctamente", Toast.LENGTH_SHORT);
            toast.show();

        } else {
            toast = Toast.makeText(requireContext(), "Los campos son obligatorios", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
