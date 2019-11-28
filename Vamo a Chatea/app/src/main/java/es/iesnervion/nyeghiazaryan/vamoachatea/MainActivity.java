package es.iesnervion.nyeghiazaryan.vamoachatea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    private EditText usuario;
    private EditText contraseña;
    private Button entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        usuario.findViewById(R.id.etUsuario);
//        contraseña.findViewById(R.id.etContraseña);
//        entrar.findViewById(R.id.btnEntrar);

//        entrar.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                Toast.makeText(MainActivity.this, "Entrando...", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
