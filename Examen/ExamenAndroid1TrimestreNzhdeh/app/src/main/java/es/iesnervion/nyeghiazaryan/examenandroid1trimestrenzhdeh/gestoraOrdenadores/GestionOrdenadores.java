package es.iesnervion.nyeghiazaryan.examenandroid1trimestrenzhdeh.gestoraOrdenadores;

import java.util.ArrayList;

import es.iesnervion.nyeghiazaryan.examenandroid1trimestrenzhdeh.R;
import es.iesnervion.nyeghiazaryan.examenandroid1trimestrenzhdeh.clases.Ordenador;

public class GestionOrdenadores
{
//    prototipo: public ArrayList<Ordenador> EditarOrdenador(Ordenador ordenador, ArrayList<Ordenador> lista)
//    comentarios: este metodo sirve para editar un objeto Ordenador
//    precondiciones: no hay
//    entradas: Objeto ordenador
//    salidas:
//    entradas/salidas: listado de ordenadores
//    postcondiciones: Asociado al nombre devuelve un listado de ordenadores con algun elemento modificado o
//                      la misma lista si no se ha modificado ningun elemento

    public ArrayList<Ordenador> EditarOrdenador(Ordenador ordenador, ArrayList<Ordenador> lista)
    {
        ArrayList<Ordenador> aux=new ArrayList<>();

        if(lista.size()>0)
        {
            for (int i=0;i<lista.size();i++)
            {
                if(lista.get(i).getIdOrdenador()== ordenador.getIdOrdenador())
                {
                    lista.set(i,ordenador);
                }

                aux.add(lista.get(i));

            }
        }
        else
        {
            aux=lista;
        }
        return aux;
    }

//    prototipo: public ArrayList<Ordenador> ListadoOrdenadoresAMD(ArrayList<Ordenador> lista,String tipo)
//    comentarios: este metodo sirve para devolver un listado de ordenadores segun su CPU
//    precondiciones: no hay
//    entradas: cadena tipo cpu, lista de ordenadores
//    salidas: listado filtrado de ordenadores
//    entradas/salidas: no hay
//    postcondiciones: Asociado al nombre devuelve un listado filtrado de ordenadores o
//                      la misma lista si se quiere la lista completa

    public ArrayList<Ordenador> ListadoOrdenadoresAMD(ArrayList<Ordenador> lista,String tipo)
    {
        ArrayList<Ordenador> aux=new ArrayList<>();

        switch (tipo)
        {
            case "amd":
                if(lista.size()>0)
                {
                    for (int i=0;i<lista.size();i++)
                    {
                        if(lista.get(i).getImagenCPU()== R.drawable.amd)
                        {
                            aux.add(lista.get(i));
                        }
                    }
                }
                break;

            case "intel":

                if(lista.size()>0)
                {
                    for (int i=0;i<lista.size();i++)
                    {
                        if(lista.get(i).getImagenCPU()== R.drawable.intel)
                        {
                            aux.add(lista.get(i));
                        }
                    }
                }

                break;

            case "Todos":

                if(lista.size()>0)
                    aux=lista;

                break;
        }

        return aux;
    }
}
