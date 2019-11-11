package es.iesnervion.nyeghiazaryan.nbaviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.iesnervion.nyeghiazaryan.nbaviewmodel.clases.MiViewModel;

public class MainActivity extends AppCompatActivity
{

    private MiViewModel miVM;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miVM= ViewModelProviders.of(this).get(MiViewModel.class);

    }

    public void AñadirMarcador(View v)
    {
        miVM.setMarcador(miVM.getMarcador()+1);
        Mostrar(miVM);
    }

    public void Mostrar(MiViewModel mvm)
    {
        //Context context = getApplicationContext();
        //int duracion=Toast.LENGTH_LONG;
        //int text=mvm.getMarcador();
        Toast toast = Toast.makeText(getApplicationContext(),mvm.getMarcador(),Toast.LENGTH_LONG);
        toast.show();
    }
}
