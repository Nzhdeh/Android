package es.iesnervion.nyeghiazaryan.examenandroid1trimestrenzhdeh.gestoraImpresoras;

import java.util.ArrayList;

import es.iesnervion.nyeghiazaryan.examenandroid1trimestrenzhdeh.clases.Impresora;

public class GestionImpresoras
{
//    prototipo: public ArrayList<Impresora> EditarOrdenador(Impresora impresora, ArrayList<Impresora> lista)
//    comentarios: este metodo sirve para editar un objeto Impresora
//    precondiciones: no hay
//    entradas: Objeto Impresora
//    salidas: no hay
//    entradas/salidas: listado de impresoras
//    postcondiciones: Asociado al nombre devuelve un listado de impresoras con algun elemento modificado o
//                      la misma lista si no se ha modificado ningun elemento

    public ArrayList<Impresora> EditarImpresora(Impresora impresora, ArrayList<Impresora> lista)
    {
        ArrayList<Impresora> aux=new ArrayList<>();

        if(lista.size()>0)
        {
            for (int i=0;i<lista.size();i++)
            {
                if(lista.get(i).getIdImpresora()== impresora.getIdImpresora())
                {
                    lista.set(i,impresora);
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
}
