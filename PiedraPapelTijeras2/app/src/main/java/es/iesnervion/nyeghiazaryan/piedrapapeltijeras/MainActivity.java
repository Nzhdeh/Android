package es.iesnervion.nyeghiazaryan.piedrapapeltijeras;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;

import es.iesnervion.nyeghiazaryan.piedrapapeltijeras.fragmentos.JuegoFragment;
import es.iesnervion.nyeghiazaryan.piedrapapeltijeras.fragmentos.ResultadoFragment;
import es.iesnervion.nyeghiazaryan.piedrapapeltijeras.viewmodels.ViewModelPPT;

public class MainActivity extends AppCompatActivity
{
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private ViewGroup fragmentContenedor;
    private Button ranking;

    private ViewModelPPT viewModel;
    private Observer<Integer> observerBotoRankingn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(ViewModelPPT.class);

        fragmentContenedor = findViewById(R.id.flContenedor);

        fragmentManager=getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        JuegoFragment fragemntJuego = new JuegoFragment();
        fragmentTransaction.add(R.id.flContenedor,fragemntJuego).addToBackStack(null).commit();


        observerBotoRankingn = new Observer<Integer>()
        {
            @Override
            public void onChanged(Integer integer)
            {
                if(integer == R.id.btnRanking)
                {
                    ResultadoFragment resultadoFragment = new ResultadoFragment();
                    fragmentManager=getSupportFragmentManager();
                    fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(fragmentContenedor.getId(),resultadoFragment).addToBackStack(null).commit();
                }
            }
        };
        viewModel.getBotonRanking().observe(this,observerBotoRankingn);
    }
}
