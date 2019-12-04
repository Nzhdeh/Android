package es.iesnervion.nyeghiazaryan.examennzhdehandroid.capaDAL.manejadoras;

import java.util.ArrayList;

import es.iesnervion.nyeghiazaryan.examennzhdehandroid.capaEntities.CocheImpl;

public class GestoraCoches
{
//    prototipo:
//    comentarios:
//    precondiciones:
//    entradas:
//    salidas:
//    entradas/salidas:
//    postcondiciones:

    public boolean EliminarCochePorId(int id, ArrayList<CocheImpl> coches)
    {
        boolean borrado=false;

        for (int i=0;i<coches.size() && borrado==false;i++)
        {
            if(coches.get(i).getId()==id)
            {
                coches.remove(coches.get(i));
                borrado=true;
            }
        }

        return borrado;
    }

    public void InsertarCoche(CocheImpl coche, ArrayList<CocheImpl> coches)
    {
        coches.add(coche);
    }
}
