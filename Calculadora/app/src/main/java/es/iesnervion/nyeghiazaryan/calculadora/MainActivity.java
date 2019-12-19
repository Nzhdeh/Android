package es.iesnervion.nyeghiazaryan.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText etCaja1;
    private EditText etCaja2;
    private TextView tvCaja3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etCaja1=findViewById(R.id.txtCaja1);
        etCaja2=findViewById(R.id.txtCaja2);
        tvCaja3=findViewById(R.id.txtCaja3);

    }

    public void Sumar(View view)
    {
        String caja1=etCaja1.getText().toString();
        String caja2=etCaja2.getText().toString();

        double num1=Double.parseDouble(caja1);
        double num2=Double.parseDouble(caja2);

        double suma=num1+num2;

        String res=String.valueOf(suma);

        tvCaja3.setText(res);
    }

    public void Restar(View view)
    {
        String caja1=etCaja1.getText().toString();
        String caja2=etCaja2.getText().toString();

        double num1=Double.parseDouble(caja1);
        double num2=Double.parseDouble(caja2);

        double suma=num1-num2;

        String res=String.valueOf(suma);

        tvCaja3.setText(res);
    }

    public void Limpiar(View view)
    {
//        String caja1=etCaja1.getText().toString();
//        String caja2=etCaja2.getText().toString();
//        String caja3=tvCaja3.getText().toString();

        etCaja1.setText("");
        etCaja2.setText("");
        tvCaja3.setText("");
    }

}
