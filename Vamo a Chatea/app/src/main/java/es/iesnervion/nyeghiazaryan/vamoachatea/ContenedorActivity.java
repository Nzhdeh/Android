package es.iesnervion.nyeghiazaryan.vamoachatea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ContenedorActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor);
        Bundle datos = this.getIntent().getExtras();
        String recuperamos_variable_string = datos.getString("variable_string");
    }

    public void Atras(View view)
    {
        Intent intent = new Intent(ContenedorActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
