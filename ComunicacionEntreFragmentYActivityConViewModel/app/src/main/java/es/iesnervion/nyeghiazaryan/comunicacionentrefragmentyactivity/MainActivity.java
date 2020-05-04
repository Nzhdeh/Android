package es.iesnervion.nyeghiazaryan.comunicacionentrefragmentyactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.ViewGroup;

import es.iesnervion.nyeghiazaryan.comunicacionentrefragmentyactivity.fragments.BotonesFragment;
import es.iesnervion.nyeghiazaryan.comunicacionentrefragmentyactivity.fragments.ContenidoFragment;
import es.iesnervion.nyeghiazaryan.comunicacionentrefragmentyactivity.viewmodels.MainActivityVM;

public class MainActivity extends AppCompatActivity
{
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private MainActivityVM viewModel;

    private ViewGroup fragmentContenedor;

    private Observer<String> observerTexto;
    private Observer<Integer> observerBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(MainActivityVM.class);

        fragmentContenedor = findViewById(R.id.flContenedor);

        fragmentManager=getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();


        BotonesFragment fragemntBotones=new BotonesFragment();
        fragmentTransaction.add(R.id.flContenedor,fragemntBotones).addToBackStack(null).commit();

        observerBoton = new Observer<Integer>()
        {
            @Override
            public void onChanged(Integer integer)
            {
                if(integer==R.id.boton1){
                    viewModel.cambiarTexto("soy el boton 1");
                }else if(integer==R.id.boton2){
                    viewModel.cambiarTexto("soy el boton 2");
                }
            }
        };
        viewModel.getBoton().observe(this,observerBoton);

        observerTexto = new Observer<String>()
        {
            @Override
            public void onChanged(String s)
            {
                ContenidoFragment fragemntContenido=new ContenidoFragment();
                fragmentManager=getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.flContenedor,fragemntContenido).addToBackStack(null).commit();
            }
        };
        viewModel.getTextView().observe(this,observerTexto);
    }
}
