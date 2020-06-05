package es.iesnervion.nyeghiazaryan.roomsimple;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;
import java.util.zip.Inflater;

import es.iesnervion.nyeghiazaryan.roomsimple.bbdd.PersonaBBDD;
import es.iesnervion.nyeghiazaryan.roomsimple.clases.Persona;
import es.iesnervion.nyeghiazaryan.roomsimple.clases.PersonaIntermedio;

public class MainActivity extends AppCompatActivity implements View.OnCreateContextMenuListener
{
    private EditText mTextoNombre;
    private Button mGuardar;
    private Button btnListado;
    private ListView listView;
    //private PersonaBBDD bbdd;
    private PersonaIntermedio intermedio;
    private Persona oPersona;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextoNombre = findViewById(R.id.etNombre);
        mGuardar = findViewById(R.id.btnGuardar);
        btnListado = findViewById(R.id.btnListado);
        listView = findViewById(R.id.lvLListado);

        intermedio = PersonaIntermedio.get(this);
        //PersonaBBDD.getAppDatabase(this);

        //bbdd = PersonaBBDD.getAppDatabase(getApplicationContext());

        mGuardar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                guardar();
            }
        });

        btnListado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obtenerListado();
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
        {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long arg3)
            {
                List<Persona> listado = intermedio.getPersonas();
                registerForContextMenu(listView);
                return false;
            }
        });
    }

    /**
     *  sirev para cargar el menu contextual a la pantalla
     */
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_contextual, menu);
    }

    /**
     * sirve para dar funcionalidad a las opciones del menú contextual
     * @param item
     * @return
     */
    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();//obtenemos el elemento en el que se ha se ha hecho el click
        switch (item.getItemId())
        {
            case R.id.temEliminar:
                eliminarPersona(info);
                return true;
            case R.id.temEditar:
                actualizarPersona(info);
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

    /**
     * sirve para eliminar a la persona seleccionada
     * @param info
     */
    private void eliminarPersona(AdapterView.AdapterContextMenuInfo info)
    {
        Persona p = (Persona) listView.getItemAtPosition(info.position);
        if (p != null)
        {
            intermedio.deletePersona(p);
        }
    }

    /**
     * sirve para actualizar a la persona seleccionada
     * @param info
     */
    private void actualizarPersona(AdapterView.AdapterContextMenuInfo info)
    {
        Persona p = (Persona) listView.getItemAtPosition(info.position);
        if (p != null)
        {
            p.setNombre(mTextoNombre.getText().toString());
            intermedio.updatePersona(p);
        }
    }

    /**
     * sirve para guardar un objeto Persona en la bbdd room
     */
    private void guardar()
    {
        Toast toast;
        String nombre = mTextoNombre.getText().toString();

        if (!nombre.equals(""))
        {
            oPersona = new Persona();
            oPersona.setNombre(nombre);
            //insertamos
            intermedio.addPersona(oPersona);
            mTextoNombre.setText("");
            toast = Toast.makeText(this, "Se ha guardado correctamente",
                    Toast.LENGTH_SHORT);
            toast.show();
        }else
        {
            toast = Toast.makeText(this, "Inserta un nombre",
                    Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    /**
     *  sirve para obtener los datos guardados en la bbdd room
     */
    private void obtenerListado()
    {
        List<Persona> listado = intermedio.getPersonas();

        if(listado.size()>0){
            ArrayAdapter<Persona> adapter = new ArrayAdapter<Persona>(this,android.R.layout.simple_list_item_1,listado);
            listView.setAdapter(adapter);
        }else
        {
            Toast toast = Toast.makeText(this, "No hay nada en la lista",
                    Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
