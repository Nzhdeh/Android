package es.iesnervion.nyeghiazaryan.practicandoviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import es.iesnervion.nyeghiazaryan.practicandoviewmodel.clases.Persona;
import es.iesnervion.nyeghiazaryan.practicandoviewmodel.viewmodels.PersonaVM;

public class MainActivity extends AppCompatActivity
{
    private EditText nombre,apellidos;
    private Button enviar;
    private TextView resultado;
    private PersonaVM viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel= ViewModelProviders.of(this).get(PersonaVM.class);
        nombre= findViewById(R.id.etNombre);
        apellidos=findViewById(R.id.etApellidos);
        enviar=findViewById(R.id.btnEnviar);
        resultado=findViewById(R.id.tvNombreApellidos);

        enviar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                viewModel.cambiarPersona(new Persona(nombre.getText().toString(),apellidos.getText().toString()));
            }
        });

        final Observer<Persona> observer = new Observer<Persona>()
        {
            @Override
            public void onChanged(Persona persona)
            {
                resultado.setText(persona.toString());
            }
        };

        viewModel.getPersona().observe(this,observer);
    }
}
