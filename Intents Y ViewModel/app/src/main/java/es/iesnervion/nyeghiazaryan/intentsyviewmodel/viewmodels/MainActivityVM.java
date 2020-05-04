package es.iesnervion.nyeghiazaryan.intentsyviewmodel.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import es.iesnervion.nyeghiazaryan.intentsyviewmodel.clases.Persona;
import es.iesnervion.nyeghiazaryan.intentsyviewmodel.utilidades.Util;

public class MainActivityVM extends ViewModel
{
    private MutableLiveData<List<Persona>> listadoPersonas;
    private List<Persona>personas;

    public MainActivityVM()
    {
        Util u=new Util();
        personas=u.cargarPersonasSinFoto();
        this.listadoPersonas = new MutableLiveData<>();
        this.listadoPersonas.setValue(personas);
    }

    public LiveData<List<Persona>> getListadoPersonas()
    {
//        if(listadoPersonas==null)
//        {
//            Util u=new Util();
//            personas=u.cargarPersonasSinFoto();
//            listadoPersonas.setValue(personas);
//        }
        return listadoPersonas;
    }

    public void cambiarImagen(List<Persona> personas)
    {
        listadoPersonas.setValue(personas);
    }
}
