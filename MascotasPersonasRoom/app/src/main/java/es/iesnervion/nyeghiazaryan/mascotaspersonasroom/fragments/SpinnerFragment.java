package es.iesnervion.nyeghiazaryan.mascotaspersonasroom.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.R;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.viewmodel.MascotasVM;

/**
 * A simple {@link Fragment} subclass.
 */
public class SpinnerFragment extends Fragment
{

    private Spinner spinner;
    private MascotasVM viewModel;

    public SpinnerFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_spinner, container, false);

        viewModel = new ViewModelProvider(requireActivity()).get(MascotasVM.class);

        spinner = view.findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapterSpinner = ArrayAdapter.createFromResource(requireContext(),R.array.spinnerOpciones,R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapterSpinner);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                viewModel.cambiarSpinner(parent.getItemAtPosition(position).toString());
                spinner.setSelection(0);//sino cuando intento volver al fragment anterior no funciona
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                Toast toast = Toast.makeText(requireContext(), "Selecciona una opción", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        return view;
    }
}
