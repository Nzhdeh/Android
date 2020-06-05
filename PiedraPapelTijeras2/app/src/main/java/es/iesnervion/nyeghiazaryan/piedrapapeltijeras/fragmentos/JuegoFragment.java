package es.iesnervion.nyeghiazaryan.piedrapapeltijeras.fragmentos;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;

import es.iesnervion.nyeghiazaryan.piedrapapeltijeras.R;
import es.iesnervion.nyeghiazaryan.piedrapapeltijeras.viewmodels.ViewModelPPT;

/**
 * A simple {@link Fragment} subclass.
 */
public class JuegoFragment extends Fragment implements View.OnClickListener
{
    private ImageButton piedra,papel,tijeras;
    private Button ranking;

    private SharedPreferences sharedPref;
    private SharedPreferences.Editor editor;

    private int contPiedra=0,contPapel=0,contTijeras=0;//estas variables guardan las veces que el usuario ha elegido piedra, papel o tijeras
    private int contPartidaGanada=0,contPartidaPerdida=0,contEmpate = 0;

    private ViewModelPPT viewModel;

    public JuegoFragment()
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
        View view = inflater.inflate(R.layout.fragment_juego, container, false);

        piedra = view.findViewById(R.id.piedra);
        papel = view.findViewById(R.id.papel);
        tijeras  = view.findViewById(R.id.tijeras);
        ranking = view.findViewById(R.id.btnRanking);

        sharedPref = getActivity().getSharedPreferences("RankingPreferences", Context.MODE_PRIVATE);
        editor = sharedPref.edit();

        piedra.setOnClickListener(this);
        papel.setOnClickListener(this);
        tijeras.setOnClickListener(this);
        ranking.setOnClickListener(this);

        return view;
    }

    @Override
    public void onPause()
    {
        viewModel.GuardarDatosEnShared(viewModel.getPiedra() ,viewModel.getPapel(),viewModel.getTijeras(),viewModel.getPartidasGanadas(),viewModel.getPartidasPerdidas(),viewModel.getEmpate());
        super.onPause();
    }

    /**
     * sirve para generar un numero entero entre 1 y 3 ambos inclusive
     */
    public int generarNumero()
    {
        Random random = new Random();
        return  random.nextInt(3)+1;
    }

    @Override
    public void onClick(View v)
    {
        int num = generarNumero();

        switch (v.getId())
        {
            case R.id.piedra:
                viewModel.setPiedra(viewModel.getPiedra() + 1);
                if(num == 1)//1 es piedra
                {
                    viewModel.setEmpate(viewModel.getEmpate() + 1);
                    Toast.makeText(requireContext(), "Has empatadooo", Toast.LENGTH_SHORT).show();
                }
                else if(num == 2)//dos es papel
                {
                    viewModel.setPartidasPerdidas(viewModel.getPartidasPerdidas() + 1);
                    Toast.makeText(requireContext(), "Ha salido papel. Has perdido", Toast.LENGTH_SHORT).show();
                }
                else//3 es tijeras
                {
                    viewModel.setPartidasGanadas(viewModel.getPartidasGanadas() + 1);
                    Toast.makeText(requireContext(), "Ha salido tijeras. Has ganado!!!", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.papel:
                viewModel.setPapel(viewModel.getPapel() + 1);
                if(num == 1)//1 es piedra
                {
                    viewModel.setPartidasGanadas(viewModel.getPartidasGanadas() + 1);
                    Toast.makeText(requireContext(), "Ha salido piedra. Has ganado!!!", Toast.LENGTH_SHORT).show();
                }
                else if(num == 2)//dos es papel
                {
                    viewModel.setEmpate(viewModel.getEmpate() + 1);
                    Toast.makeText(requireContext(), "Has empatadooo", Toast.LENGTH_SHORT).show();
                }
                else//3 es tijeras
                {
                    viewModel.setPartidasPerdidas(viewModel.getPartidasPerdidas() + 1);
                    Toast.makeText(requireContext(), "Ha salido tijeras. Has perdido", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.tijeras:
                viewModel.setTijeras(viewModel.getTijeras() + 1);
                if(num == 1)//1 es piedra
                {
                    viewModel.setPartidasPerdidas(viewModel.getPartidasPerdidas() + 1);
                    Toast.makeText(requireContext(), "Ha salido piedra. Has perdido", Toast.LENGTH_SHORT).show();
                }
                else if(num == 2)//dos es papel
                {
                    viewModel.setPartidasGanadas(viewModel.getPartidasGanadas() + 1);
                    Toast.makeText(requireContext(), "Ha salido papel. Has ganado!!!", Toast.LENGTH_SHORT).show();
                }
                else//3 es tijeras
                {
                    viewModel.setEmpate(viewModel.getEmpate() + 1);
                    Toast.makeText(requireContext(), "Has empatadooo", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btnRanking:
                viewModel.cambiarBoton(v.getId());
                break;
        }
    }
}
