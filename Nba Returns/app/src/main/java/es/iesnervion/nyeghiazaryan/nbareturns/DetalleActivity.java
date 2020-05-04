package es.iesnervion.nyeghiazaryan.nbareturns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import es.iesnervion.nyeghiazaryan.nbareturns.clases.Nba;

public class DetalleActivity extends AppCompatActivity
{
    private Nba item;
    private TextView nombre,detalle;
    private ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        item= (Nba)getIntent().getSerializableExtra("id");
        nombre=findViewById(R.id.detalleNombreEquipo);
        imagen=findViewById(R.id.detalleImagen);
        detalle=findViewById(R.id.detalleDetalles);

        nombre.setText(item.getNombreEquipo());
        imagen.setImageResource(item.getImagen());
        detalle.setText(item.getDetalles());
    }
}
