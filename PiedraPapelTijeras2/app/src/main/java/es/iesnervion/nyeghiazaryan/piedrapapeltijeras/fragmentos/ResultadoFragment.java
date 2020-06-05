package es.iesnervion.nyeghiazaryan.piedrapapeltijeras.fragmentos;


import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import es.iesnervion.nyeghiazaryan.piedrapapeltijeras.R;
import es.iesnervion.nyeghiazaryan.piedrapapeltijeras.viewmodels.ViewModelPPT;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResultadoFragment extends Fragment
{
    private TextView piedra,papel,tijeras;//estas variables guardan las veces que el usuario ha elegido piedra, papel o tijeras
    private TextView partidasGanadas,partidasPerdidas,empate;
    private ViewModelPPT viewModel;
    private Observer<SharedPreferences> observerPref;

    public ResultadoFragment()
    {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        viewModel = new ViewModelProvider(requireActivity()).get(ViewModelPPT.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_resultado, container, false);


        piedra= view.findViewById(R.id.tvPiedra);
        papel= view.findViewById(R.id.tvPapel);
        tijeras= view.findViewById(R.id.tvTijeras);
        partidasGanadas= view.findViewById(R.id.tvPartidasGanadas);
        partidasPerdidas= view.findViewById(R.id.tvPartidasPerdidas);
        empate = view.findViewById(R.id.tvEmpate);


        piedra.setText(viewModel.getPiedra()+"");
        papel.setText(viewModel.getPapel()+"");
        tijeras.setText(viewModel.getTijeras()+"");
        partidasGanadas.setText(viewModel.getPartidasGanadas()+"");
        partidasPerdidas.setText(viewModel.getPartidasPerdidas()+"");
        empate.setText(viewModel.getEmpate()+"");

        return view;
    }


}
