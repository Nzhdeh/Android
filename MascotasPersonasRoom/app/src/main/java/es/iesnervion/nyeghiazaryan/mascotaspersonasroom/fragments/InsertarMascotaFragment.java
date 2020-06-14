package es.iesnervion.nyeghiazaryan.mascotaspersonasroom.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.R;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.bbdd.MascotaIntermedio;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.clases.Mascota;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.clases.Persona;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.viewmodel.MascotasVM;

/**
 * A simple {@link Fragment} subclass.
 */
public class InsertarMascotaFragment extends Fragment
{
    private EditText nombreMascota;
    private TextView idPersona;
    private Button guardarMascota;
    private MascotaIntermedio intermedio;//compadre

    private MascotasVM viewModel;
    private Observer<Integer> observerIdPersona;

    public InsertarMascotaFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_insertar_mascota, container, false);

        viewModel = new ViewModelProvider(requireActivity()).get(MascotasVM.class);

        nombreMascota = view.findViewById(R.id.etNombreMascota);
        idPersona = view.findViewById(R.id.tvIdPersona);
        guardarMascota = view.findViewById(R.id.btnGuardarMascota);

        intermedio = MascotaIntermedio.get(requireContext());

        observerIdPersona = new Observer<Integer>()
        {
            @Override
            public void onChanged(Integer integer)
            {
                idPersona.setText(integer.toString());
            }
        };
        viewModel.getIdPersonaParaMascota().observe(getViewLifecycleOwner(),observerIdPersona);


        guardarMascota.setOnClickListener(new View.OnClickListener()
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
        Mascota oMascota = new Mascota();

        if (!nombreMascota.getText().toString().equals("") && !idPersona.getText().toString().equals("0"))
        {
            oMascota.setNombreMascota(nombreMascota.getText().toString());
            oMascota.setIdPersona(Integer.parseInt(idPersona.getText().toString()));

            //insertamos
            intermedio.addMascota(oMascota);
            nombreMascota.setText("");
            idPersona.setText("0");
            toast = Toast.makeText(requireContext(), "Se ha guardado correctamente", Toast.LENGTH_SHORT);
            toast.show();

        }else if(idPersona.getText().toString().equals("0"))
        {
            toast = Toast.makeText(requireContext(), "Selecciona una persona de la lista\nSi no hay personas inerta algunas", Toast.LENGTH_LONG);
            toast.show();
        }
        else
        {
            toast = Toast.makeText(requireContext(), "Los campos son obligatorios", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
