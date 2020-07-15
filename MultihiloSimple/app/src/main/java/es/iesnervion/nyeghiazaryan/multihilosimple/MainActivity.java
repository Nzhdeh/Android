package es.iesnervion.nyeghiazaryan.multihilosimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button prueba;
    private ProgressBar cargando;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prueba = findViewById(R.id.btnPrueba);
        cargando = findViewById(R.id.pbcargando);
        texto = findViewById(R.id.tvTexto);

        final Prueba hilo1=new Prueba();
        Prueba2 hilo2=new Prueba2();

        prueba.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                cargando.setVisibility(v.VISIBLE);
                hilo1.start();
            }
        });

        hilo2.start();
        for(int i = 1;i<10001;i++)
        {
            texto.setText(Integer.toString(i));
        }
    }

    public class Prueba extends Thread
    {
        @Override
        public void run()
        {
            try
            {
                Thread.sleep(10000);
                runOnUiThread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        Toast.makeText(MainActivity.this,"Hilo 1 terminado",Toast.LENGTH_LONG).show();
                        cargando.setVisibility(View.INVISIBLE);
                    }
                });

            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public class Prueba2 extends Thread
    {
        @Override
        public void run()
        {
            try
            {
                Thread.sleep(10000);
                runOnUiThread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        Toast.makeText(MainActivity.this,"Hilo 2 terminado",Toast.LENGTH_LONG).show();
                        cargando.setVisibility(View.INVISIBLE);
                    }
                });

            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
