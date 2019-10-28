package es.iesnervion.nyeghiazaryan.nba;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    TextView selection;
    ListView listaDatos;
    ArrayList<Nba> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDatos=findViewById(R.id.lstNba);

        lista=CargarListaNba();

        Adaptador miAdaptador=new Adaptador(getApplicationContext(),lista);

        listaDatos.setAdapter(miAdaptador);

    }

    public ArrayList<Nba> CargarListaNba()
    {
        ArrayList<Nba> lista = new ArrayList<>();

        lista.add(new Nba(1,"Atlanta Hawks", R.drawable.atlanta_hawks));
        lista.add(new Nba(2,"Boston Celtics", R.drawable.boston_celtics));
        lista.add(new Nba(3,"Brooklin Nets", R.drawable.brooklyn_nets));
        lista.add(new Nba(4,"Charlotte Hornetts", R.drawable.charlottehornetts));
        lista.add(new Nba(5,"Chicago Bulls", R.drawable.chicago_bulls));
        lista.add(new Nba(6,"Cleveland Cavaliers", R.drawable.cleveland_cavaliers));
        lista.add(new Nba(7,"Detroit Pistones", R.drawable.detroit_pistons));
        lista.add(new Nba(8,"Indiana Pacers", R.drawable.indiana_pacers));
        lista.add(new Nba(9,"Miami Heat", R.drawable.miami_heat));
        lista.add(new Nba(10,"Milwaukee Bucks", R.drawable.milwaukee_bucks));
        lista.add(new Nba(11,"New York Knicks", R.drawable.new_york_knicks));
        lista.add(new Nba(12,"Orlando Magic", R.drawable.orlando_magic));
        lista.add(new Nba(13,"Philadelphia 78ers", R.drawable.philadelphia_78ers));
        lista.add(new Nba(14,"Toronto Raptors", R.drawable.toronto_raptors));
        lista.add(new Nba(15,"washington Wizards", R.drawable.washington_wizards));

        return lista;
    }
}
