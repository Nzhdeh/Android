package es.iesnervion.nyeghiazaryan.toastpersonalizado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast toast3 = new Toast(getApplicationContext());

                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.activity_main,
                        (ViewGroup) findViewById(R.id.lytLayout));

                TextView txtMsg = layout.findViewById(R.id.txtMensaje);
                txtMsg.setText("Toast Personalizado");

                toast3.setDuration(Toast.LENGTH_SHORT);
                toast3.setView(layout);
                toast3.show();
            }
        });
    }
}
