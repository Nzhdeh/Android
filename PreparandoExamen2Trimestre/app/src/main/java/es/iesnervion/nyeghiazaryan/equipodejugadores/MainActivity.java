package es.iesnervion.nyeghiazaryan.equipodejugadores;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,InsertarFragment.OnFragmentInteractionListener,ListarFragment.OnFragmentInteractionListener {
    private Button insertar,listar;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InsertarFragment fInsertar=new InsertarFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.flcontenedor,fInsertar);
        insertar=findViewById(R.id.btnInsertar);
        listar=findViewById(R.id.btnListar);

        insertar.setOnClickListener(this);
        listar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.btnInsertar:
                InsertarFragment iFrag=new InsertarFragment();
                FragmentTransaction transaction1=getSupportFragmentManager().beginTransaction();
                transaction1.replace(R.id.flcontenedor,iFrag);
                transaction1.commit();
                break;

            case R.id.btnListar:

                ListarFragment lFrag=new ListarFragment();
                FragmentTransaction transaction2=getSupportFragmentManager().beginTransaction();
                transaction2.replace(R.id.flcontenedor,lFrag);
                transaction2.commit();
                break;
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
