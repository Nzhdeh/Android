package es.iesnervion.nyeghiazaryan.vamoachatea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity
{

    private EditText usuario;
    private Button entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       //el boton tiene que enviar el nombre del usuario
    }

    public void ChatsActinity(View view)
    {
        Intent intent = new Intent(LoginActivity.this, ContenedorActivity.class);
        startActivity(intent);
    }
}
