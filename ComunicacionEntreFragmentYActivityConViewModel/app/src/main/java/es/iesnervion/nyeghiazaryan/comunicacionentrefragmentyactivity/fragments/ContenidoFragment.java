package es.iesnervion.nyeghiazaryan.comunicacionentrefragmentyactivity.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import es.iesnervion.nyeghiazaryan.comunicacionentrefragmentyactivity.R;
import es.iesnervion.nyeghiazaryan.comunicacionentrefragmentyactivity.viewmodels.MainActivityVM;

public class ContenidoFragment extends Fragment
{
    private TextView recibir;
    private MainActivityVM viewModel;

    public ContenidoFragment()
    {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        viewModel = new ViewModelProvider(requireActivity()).get(MainActivityVM.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contenido, container, false);
        recibir= view.findViewById(R.id.txtRecibir);

        recibir.setText(viewModel.getTextView().getValue());

        return view;
    }
}
