package es.iesnervion.nyeghiazaryan.usandosharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.service.notification.NotificationListenerService;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.Serializable;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    private ImageButton piedra,papel,tijeras;
    private Button ranking;
    private int contPiedra=0, contPapel=0,contTijeras=0;

    private SharedPreferences sharedPref;
    private SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        piedra=findViewById(R.id.piedra);
        papel = findViewById(R.id.papel);
        tijeras = findViewById(R.id.tijeras);
        ranking = findViewById(R.id.btnRanking);

        sharedPref = this.getSharedPreferences("MyPref", Context.MODE_PRIVATE);
        editor = sharedPref.edit();



        piedra.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(generarNumero()==1)
                {
                    contPiedra++;
//                    editor.putBoolean("key_name", true); // Storing boolean - true/false
//                    editor.putString("piedra", ""+contPiedra); // Storing string
                    editor.putInt("piedra", contPiedra); // Storing integer
//                    editor.putFloat("key_name", "float value"); // Storing float
//                    editor.putLong("key_name", "long value"); // Storing long

                    editor.commit(); // commit changes
                }
            }
        });

        papel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(generarNumero()==2)
                {
                    contPapel++;
                    editor.putInt("papel", contPapel);
                    editor.commit();
                }
            }
        });

        tijeras.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(generarNumero()==3)
                {
                    contTijeras++;
                    editor.putInt("tijeras", contTijeras);
                    editor.commit();
                }
            }
        });

        ranking.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent (MainActivity.this, RankingActivity.class);
                startActivity(intent);
            }
        });
    }

    /**
     * sirve para generar un numero entero entre 1 y 3 ambos inclusive
     */
    public int generarNumero()
    {
        Random random = new Random();
        return  random.nextInt(3)+1;
    }
}
