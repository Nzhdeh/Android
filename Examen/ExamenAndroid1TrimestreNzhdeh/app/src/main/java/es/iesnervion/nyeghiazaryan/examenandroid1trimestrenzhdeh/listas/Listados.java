package es.iesnervion.nyeghiazaryan.examenandroid1trimestrenzhdeh.listas;

import java.util.ArrayList;

import es.iesnervion.nyeghiazaryan.examenandroid1trimestrenzhdeh.R;
import es.iesnervion.nyeghiazaryan.examenandroid1trimestrenzhdeh.clases.Impresora;
import es.iesnervion.nyeghiazaryan.examenandroid1trimestrenzhdeh.clases.Ordenador;

public class Listados
{
//    prototipo: public ArrayList<Ordenador> listaOrdenadores()
//    comentarios: el metodo sirve para obtener un listado de ordenadores portatiles
//    precondiciones: no hay
//    entradas: no hay
//    salidas: listado de ordenadores
//    entradas/salidas: no hay
//    postcondiciones: asociado al nombre devuelve el listado de ordenadores

    public ArrayList<Ordenador> listaOrdenadores()
    {
        ArrayList<Ordenador> lista=new ArrayList<>();

        Ordenador ord1 = new Ordenador(1,"Acer A315", R.drawable.verde, R.drawable.acera315, R.drawable.intel);
        Ordenador ord2 = new Ordenador(2,"Acer A515", R.drawable.rojo,R.drawable.acera515, R.drawable.amd);
        Ordenador ord3 = new Ordenador(3,"HP 255 G7",R.drawable.verde, R.drawable.hp255g7, R.drawable.intel);
        Ordenador ord4 = new Ordenador(4,"Lenovo Ideapad S340",R.drawable.rojo, R.drawable.ideapads340, R.drawable.amd);
        Ordenador ord5 = new Ordenador(5,"Lenovo 81 N3",R.drawable.verde, R.drawable.lenovo81n3, R.drawable.amd);
        Ordenador ord6 = new Ordenador(6,"MSI 047 XES", R.drawable.rojo,R.drawable.msi047xes, R.drawable.intel);

        lista.add(ord1);
        lista.add(ord2);
        lista.add(ord3);
        lista.add(ord4);
        lista.add(ord5);
        lista.add(ord6);

        return  lista;
    }

    //    prototipo: public ArrayList<Ordenador> listaOrdenadores()
//    comentarios: el metodo sirve para obtener un listado de ordenadores portatiles
//    precondiciones: no hay
//    entradas: no hay
//    salidas: listado de ordenadores
//    entradas/salidas: no hay
//    postcondiciones: asociado al nombre devuelve el listado de ordenadores

    public ArrayList<Impresora> listaImpresoras()
    {
        ArrayList<Impresora> lista=new ArrayList<>();

        Impresora impr1 = new Impresora(1,"HP 5010",R.drawable.verde, R.drawable.hp5010, "Tinta");
        Impresora impr2 = new Impresora(2,"Canon TS 705",R.drawable.rojo, R.drawable.canonts705, "Láser");
        Impresora impr3 = new Impresora(3,"Epson WF 2810",R.drawable.verde, R.drawable.epsonwf2810, "Láser");
        Impresora impr4 = new Impresora(4,"HP 2630", R.drawable.rojo,R.drawable.hp2630, "Tinta");
        Impresora impr5 = new Impresora(5,"HP 3720", R.drawable.verde,R.drawable.hp3720, "Láser");
        Impresora impr6 = new Impresora(6,"HP 3750",R.drawable.rojo, R.drawable.hp3750, "Tinta");
        Impresora impr7 = new Impresora(7,"HP 5230",R.drawable.verde, R.drawable.hp5230, "Láser");

        lista.add(impr1);
        lista.add(impr2);
        lista.add(impr3);
        lista.add(impr4);
        lista.add(impr5);
        lista.add(impr6);
        lista.add(impr7);

        return  lista;
    }
}
