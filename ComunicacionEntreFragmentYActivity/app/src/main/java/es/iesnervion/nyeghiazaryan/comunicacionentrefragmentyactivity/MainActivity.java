package es.iesnervion.nyeghiazaryan.comunicacionentrefragmentyactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import es.iesnervion.nyeghiazaryan.comunicacionentrefragmentyactivity.fragments.BotonesFragment;
import es.iesnervion.nyeghiazaryan.comunicacionentrefragmentyactivity.fragments.ContenidoFragment;

public class MainActivity extends AppCompatActivity implements BotonesFragment.OnFragmentInteractionListener, ContenidoFragment.OnFragmentInteractionListener
{
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private Button boton1;
    private Button boton2;
    private TextView enviar;
    private ViewGroup fragmentContenedor;
    private ViewGroup fragmentContenido;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentContenedor = findViewById(R.id.flContenedor);

        fragmentManager=getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        Fragment fragemntBotones=BotonesFragment.newInstance();
        fragmentTransaction.add(R.id.flContenedor,fragemntBotones).addToBackStack(null).commit();
    }


    @Override
    public void onFragmentInteraction(View view)
    {
        fragmentManager=getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        Fragment fragemntContenido= ContenidoFragment.newInstance();


         Bundle data = new Bundle();
         if(view!=null)
         {
             switch (view.getId())
             {
                 case R.id.boton1:
                     data.putString("dato", "soy el boton 1");
                     break;

                 case R.id.boton2:
                     data.putString("dato", "soy el boton 2");
                     break;
             }
         }
         fragemntContenido.setArguments(data);

         //hay que mandar los parametros antes de lanzar el fragmento
        fragmentTransaction.replace(R.id.flContenedor,fragemntContenido);
        fragmentTransaction.addToBackStack(null).commit();

    }
}
