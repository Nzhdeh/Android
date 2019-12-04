package es.iesnervion.nyeghiazaryan.examennzhdehandroid.capaDAL.listados;

import java.util.ArrayList;

import es.iesnervion.nyeghiazaryan.examennzhdehandroid.R;
import es.iesnervion.nyeghiazaryan.examennzhdehandroid.capaEntities.CocheImpl;

public class ListadoCoches
{
    public ArrayList<CocheImpl> ObtenerListadoCoches()
    {
        ArrayList<CocheImpl> listado=new ArrayList<>();

        CocheImpl c1=new CocheImpl(1,"Seat","Toledo","Rojo",2500.0,"Bueno", R.drawable.toledo);
        CocheImpl c2=new CocheImpl(1,"Dacia","Sandero","Blanco",7000.0,"Malo",R.drawable.sandero);
        CocheImpl c3=new CocheImpl(1,"Mercedes","C200","Azul",25000.0,"Bueno",R.drawable.c200);
        CocheImpl c4=new CocheImpl(1,"Volvo","S40","Rojo",2500.0,"Malo",R.drawable.s40);
        CocheImpl c5=new CocheImpl(1,"Renault","Clio","Rojo",2500.0,"Malo",R.drawable.clio);

        CocheImpl c6=new CocheImpl(1,"Seat","Toledo","Rojo",2500.0,"Bueno", R.drawable.toledo);
        CocheImpl c7=new CocheImpl(1,"Dacia","Sandero","Blanco",7000.0,"Malo",R.drawable.sandero);
        CocheImpl c8=new CocheImpl(1,"Mercedes","C200","Azul",25000.0,"Bueno",R.drawable.c200);
        CocheImpl c9=new CocheImpl(1,"Volvo","S40","Rojo",2500.0,"Malo",R.drawable.s40);
        CocheImpl c10=new CocheImpl(1,"Renault","Clio","Rojo",2500.0,"Malo",R.drawable.clio);

        listado.add(c1);
        listado.add(c2);
        listado.add(c3);
        listado.add(c4);
        listado.add(c5);

        listado.add(c6);
        listado.add(c7);
        listado.add(c8);
        listado.add(c9);
        listado.add(c10);

        return  listado;
    }
}
