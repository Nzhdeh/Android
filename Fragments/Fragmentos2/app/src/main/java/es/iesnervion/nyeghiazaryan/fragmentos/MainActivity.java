package es.iesnervion.nyeghiazaryan.fragmentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements EjemploFragment.OnFragmentInteractionListener,Ejemplo2Fragment.OnFragmentInteractionListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when pointer capture is enabled or disabled for the current window.
     *
     * @param hasCapture True if the window has pointer capture.
     */
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void Fragment2(View view)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Ejemplo2Fragment fragment = new Ejemplo2Fragment();

        fragmentTransaction.add(R.id.fragmento,fragment);
        fragmentTransaction.commit();

    }

    public void Fragment1(View view)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        EjemploFragment fragment = new EjemploFragment();

        fragmentTransaction.add(R.id.fragmento,fragment);
        fragmentTransaction.commit();

    }
}
