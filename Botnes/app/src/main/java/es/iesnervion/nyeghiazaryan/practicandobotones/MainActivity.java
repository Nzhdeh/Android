package es.iesnervion.nyeghiazaryan.practicandobotones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageButton ibtn;
    CheckBox ch;
    RadioGroup rg;
    RadioButton rb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibtn=findViewById(R.id.imagenboton);
        btn=findViewById(R.id.boton);

        ch=findViewById(R.id.chekbox);

        rg=findViewById(R.id.radiogrupo);
        rb=findViewById(R.id.radiobuton2);
        //rg.check(R.id.radiobuton2); //para marcar un radiobutton
        //rg.clearCheck(); //para limpiar los radiobuton seleccionados

        //rg.getCheckedRadioButtonId();  //para obtener el radiobuton seleccionado

    }

    public void Pulsar(View view)
    {
        Toast toast1 = Toast.makeText(getApplicationContext(), "Probando botones", Toast.LENGTH_SHORT);
        //toast1.setGravity(Gravity.CENTER, , );

        toast1.show();
    }

    public void Chequear(View v)
    {
        if(ch.isChecked())
        {
            ch.setChecked(true);
        }
    }
}
