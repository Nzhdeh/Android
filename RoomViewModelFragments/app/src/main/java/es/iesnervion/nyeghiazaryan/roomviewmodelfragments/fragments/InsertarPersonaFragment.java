package es.iesnervion.nyeghiazaryan.roomviewmodelfragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.R;
import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.clases.Persona;
import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.clases.PersonaIntermedio;

/**
 * A simple {@link Fragment} subclass.
 */
public class InsertarPersonaFragment extends Fragment
{
    private EditText nombre,apellidos,biografia;
    private Button botonGuardar;
    private PersonaIntermedio intermedio;//compadre

    public InsertarPersonaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_insertar_persona, container, false);

        nombre = view.findViewById(R.id.etNombre);
        apellidos = view.findViewById(R.id.etApellidos);
        biografia = view.findViewById(R.id.etBiografia);
        botonGuardar = view.findViewById(R.id.bntGuardar);

        intermedio = PersonaIntermedio.get(requireContext());

        botonGuardar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                guardar();
            }
        });
        return view;
    }

    private void guardar()
    {
        Toast toast;
        Persona oPersona = new Persona();
        String nom = nombre.getText().toString();

        if (!nombre.getText().toString().equals("") && !apellidos.getText().toString().equals("") && !biografia.getText().toString().equals(""))
        {
            oPersona.setNombre(nombre.getText().toString());
            oPersona.setApellidos(apellidos.getText().toString());
            oPersona.setBiografia(biografia.getText().toString());
            //insertamos
            intermedio.addPersona(oPersona);
            nombre.setText("");
            apellidos.setText("");
            biografia.setText("");
            toast = Toast.makeText(requireContext(), "Se ha guardado correctamente",Toast.LENGTH_SHORT);
            toast.show();

        }else
        {
            toast = Toast.makeText(requireContext(), "Los campos son obligatorios",Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
