package es.iesnervion.nyeghiazaryan.practicandoroomconvmyfragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import es.iesnervion.nyeghiazaryan.practicandoroomconvmyfragments.R;
import es.iesnervion.nyeghiazaryan.practicandoroomconvmyfragments.clases.Nba;
import es.iesnervion.nyeghiazaryan.practicandoroomconvmyfragments.viewmodels.NbaVM;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleFragment extends Fragment
{
    private ImageView imagen;
    private TextView nombre, descripcion;
    private NbaVM viewModel;

    private Observer<Nba> observerNba;

    public DetalleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_detalle, container, false);

        nombre = view.findViewById(R.id.detalleNombreEquipo);
        imagen = view.findViewById(R.id.detalleImagen);
        descripcion = view.findViewById(R.id.detalleDetalles);

        viewModel = new ViewModelProvider(requireActivity()).get(NbaVM.class);

        observerNba= new Observer<Nba>()
        {
            @Override
            public void onChanged(Nba nba)
            {
                nombre.setText(nba.getNombreEquipo());
                imagen.setImageResource(nba.getImagen());
                descripcion.setText(nba.getDetalles());
            }
        };
        viewModel.getEquipo().observe(getActivity(),observerNba);

        return view;
    }

}
