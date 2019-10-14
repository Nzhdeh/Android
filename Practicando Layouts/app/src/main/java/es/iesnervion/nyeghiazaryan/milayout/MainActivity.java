package es.iesnervion.nyeghiazaryan.milayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    ListView lw;
    String [] elementos={"Nzhdeh","Angela","Maria","Ole","David","nombre","Nzhdeh","Angela","Maria","Ole","David","nombre",
            "Nzhdeh","Angela","Maria","Ole","David","nombre","Nzhdeh","Angela","Maria","Ole","David","nombre"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lw=findViewById(R.id.lw1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,elementos);
        lw.setAdapter(adapter);

        lw.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            //esto muestra la posicion en la que esta cada elemeto
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(getApplicationContext(),String.valueOf(position+1),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
