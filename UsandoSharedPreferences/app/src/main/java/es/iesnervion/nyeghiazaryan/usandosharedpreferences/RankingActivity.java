package es.iesnervion.nyeghiazaryan.usandosharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import java.io.File;

public class RankingActivity extends AppCompatActivity
{
    TextView piedra,papel,tijeras;
    private SharedPreferences sharedPref;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);

        piedra=findViewById(R.id.piedra);
        papel = findViewById(R.id.papel);
        tijeras = findViewById(R.id.tijeras);

        sharedPref = this.getSharedPreferences("MyPref",Context.MODE_PRIVATE);
        editor = sharedPref.edit();

        piedra.setText(Integer.toString(sharedPref.getInt("piedra",0)));
        //piedra.setText(sharedPref.getString("piedra","No hay"));

        papel.setText(Integer.toString(sharedPref.getInt("papel",0)));

        tijeras.setText(Integer.toString(sharedPref.getInt("tijeras",0)));
    }
}
