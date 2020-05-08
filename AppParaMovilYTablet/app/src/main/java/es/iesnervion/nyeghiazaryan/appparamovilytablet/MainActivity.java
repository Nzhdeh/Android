package es.iesnervion.nyeghiazaryan.appparamovilytablet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.Surface;
import android.view.ViewGroup;

import es.iesnervion.nyeghiazaryan.appparamovilytablet.fragments.BotonesFragment;
import es.iesnervion.nyeghiazaryan.appparamovilytablet.fragments.ContenidoFragment;
import es.iesnervion.nyeghiazaryan.appparamovilytablet.viewmodels.MainActivityVM;

public class MainActivity extends AppCompatActivity
{
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private MainActivityVM viewModel;

    private ViewGroup botones,contenido;

    private ViewGroup fragmentContenedor;

    //private Observer<String> observerTexto;
    private Observer<Integer> observerBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int rotacion = getWindowManager().getDefaultDisplay().getRotation();

        viewModel = new ViewModelProvider(this).get(MainActivityVM.class);



        if(rotacion == Surface.ROTATION_0 || rotacion == Surface.ROTATION_180)
        {
            fragmentContenedor = findViewById(R.id.flContenedor);
            fragmentManager=getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            BotonesFragment fragemntBotones = BotonesFragment.newInstance();
            fragmentTransaction.add(R.id.flContenedor,fragemntBotones).addToBackStack(null).commit();
        }
        else
        {
            if(rotacion == Surface.ROTATION_90 || rotacion == Surface.ROTATION_270)
            {
                botones=findViewById(R.id.fragBotones);
                contenido=findViewById(R.id.fragContenido);
            }
        }

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

                if(rotacion == Surface.ROTATION_0 || rotacion == Surface.ROTATION_180)
                {
                    ContenidoFragment fragemntContenido=new ContenidoFragment();
                    fragmentManager=getSupportFragmentManager();
                    fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.flContenedor,fragemntContenido).addToBackStack(null).commit();
                }
//                else
//                {
//                    if(rotacion == Surface.ROTATION_90 || rotacion == Surface.ROTATION_270)
//                    {
//                        botones=findViewById(R.id.fragBotones);
//                        contenido=findViewById(R.id.fragContenido);
//                    }
//                }
            }
        };
        viewModel.getBoton().observe(this,observerBoton);
    }
}
