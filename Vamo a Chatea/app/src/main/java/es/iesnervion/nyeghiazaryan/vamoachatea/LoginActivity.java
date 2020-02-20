package es.iesnervion.nyeghiazaryan.vamoachatea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity
{

    private EditText usuario;
    private Button entrar;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuario=findViewById(R.id.etUsuario);
        entrar=findViewById(R.id.btnEntrar);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EntrarAChatear(v,usuario.getText().toString());
            }
        });
       //el boton tiene que enviar el nombre del usuario
    }

    public void EntrarAChatear(View view,String usuario)
    {
        Intent intent = new Intent(this, ContenedorActivity.class);
        intent.putExtra("variable_string", usuario);
        startActivity(intent);
    }
}
