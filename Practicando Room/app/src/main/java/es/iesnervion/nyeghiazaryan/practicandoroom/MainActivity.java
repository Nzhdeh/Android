package es.iesnervion.nyeghiazaryan.practicandoroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText mTextoNota;
    private Button mGuardar;
    private Button btnGravity;
    private Button mBorrar;

    private NotaLab mNotaLab;
    private Nota mNota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextoNota = findViewById(R.id.textoNota);

        mNotaLab = NotaLab.get(this);
        List<Nota> notas = mNotaLab.getNotas();
        if(notas.size() > 0) {
            mNota = notas.get(0);
            mTextoNota.setText(mNota.getContenido());
        }

        mGuardar = findViewById(R.id.boton_guardar);
        mGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guardar();
            }
        });

        mBorrar = findViewById(R.id.boton_borrar);
        mBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                borrar();
            }
        });

    }



    /**
     * Borra la nota si existe (si mNota no es null).
     */
    private void borrar()
    {
        Toast toast1;

        if(mNota != null) {
            mNotaLab.deleteNota(mNota);
            mNota = null;
            mTextoNota.setText("");
            toast1=Toast.makeText(this, "Se ha borrado correctamente",
                    Toast.LENGTH_SHORT);
            toast1.show();
        } else {
            toast1=Toast.makeText(this, "La nota no existe",
                    Toast.LENGTH_SHORT);
            toast1.show();
        }

        //es para cambiar la posicion del mensaje toast
        toast1.setGravity(Gravity.CENTER,0,0);
    }

    /**
     * Guarda la nota si no existe (mNota es null), o la actualiza si existe.
     */
    private void guardar() {
        Toast toast1;
        String textoNota = mTextoNota.getText().toString();
        if(!textoNota.equals("")) {
            if(mNota == null) {
                mNota = new Nota();
                mNota.setContenido(textoNota);
                mNotaLab.addNota(mNota);
                toast1 = Toast.makeText(this, "Se ha creado correctamente",
                        Toast.LENGTH_SHORT);
                        toast1.show();
            } else {
                mNota.setContenido(textoNota);
                mNotaLab.updateNota(mNota);
                toast1 = Toast.makeText(this, "Se ha actualizado correctamente",
                        Toast.LENGTH_SHORT);
                toast1.show();
            }
        } else {
            toast1 = Toast.makeText(this, "Crea la nota primero",
                    Toast.LENGTH_SHORT);
            toast1.show();
        }
        //es para cambiar la posicion del mensaje toast
        toast1.setGravity(Gravity.CENTER|Gravity.LEFT,0,0);
    }

    /**obtiene la lista de todas las notas pero no funciona de momento*/

    private void ObtenerLasNotas() {
        //String textoNota = mTextoNota.getText().toString();
        List<Nota> listaNotas=null;

        listaNotas=mNotaLab.getNotas();

//        if(!textoNota.equals("")) {
//            if(mNota == null) {
//                mNota = new Nota();
//                mNota.setContenido(textoNota);
//                mNotaLab.addNota(mNota);
//                Toast.makeText(this, "Se ha creado correctamente",
//                        Toast.LENGTH_SHORT).show();
//            } else {
//                mNota.setContenido(textoNota);
//                mNotaLab.updateNota(mNota);
//                Toast.makeText(this, "Se ha actualizado correctamente",
//                        Toast.LENGTH_SHORT).show();
//            }
//        } else {
//            Toast.makeText(this, "Crea la nota primero",
//                    Toast.LENGTH_SHORT).show();
//        }
    }

//    btnGravity.setOnClickListener(new OnClickListener() {
//        @Override
//        public void onClick(View arg0) {
//            Toast toast2 =
//                    Toast.makeText(getApplicationContext(),
//                            "Toast con gravity", Toast.LENGTH_SHORT);
//
//            toast2.setGravity(Gravity.CENTER|Gravity.LEFT,0,0);
//
//            toast2.show();
//        }
//    });
}
