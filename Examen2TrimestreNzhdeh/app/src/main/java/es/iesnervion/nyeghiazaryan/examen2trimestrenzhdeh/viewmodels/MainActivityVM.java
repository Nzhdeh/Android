package es.iesnervion.nyeghiazaryan.examen2trimestrenzhdeh.viewmodels;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import es.iesnervion.nyeghiazaryan.examen2trimestrenzhdeh.basededatos.BaseDeDatos;
import es.iesnervion.nyeghiazaryan.examen2trimestrenzhdeh.entidades.Atleta;

public class MainActivityVM extends AndroidViewModel
{
    //Propiedades privadas
    private MutableLiveData<ArrayList<Atleta>> listaAtletas;
    private MutableLiveData<Atleta> atletaSeleccionado;

    //Constructor por defecto
    public MainActivityVM(Application app)
    {
        super(app);
        atletaSeleccionado = new MutableLiveData<>();
    }

    //Propiedades publicas
    public LiveData<ArrayList<Atleta>> getListaAtletas()
    {
        if(listaAtletas == null){
            listaAtletas = new MutableLiveData<>();
            cargarAtletas();
        }
        return listaAtletas;
    }

    public LiveData<Atleta> getAtletaSeleccionado()
    {
        return atletaSeleccionado;
    }
    public void setAtletaSeleccionado(Atleta atleta)
    {
        atletaSeleccionado.setValue(atleta);
    }

    /**
     * Obtiene una ListadoFragment de atletas de una base de datos local ROOM.
     */
    private void cargarAtletas()
    {
        //Datos provisionales para pruebas
        ArrayList<Atleta> atletas;
        atletas = new ArrayList<>(BaseDeDatos.getDataBase(getApplication()).dao().obtenerAtletas());
        listaAtletas.setValue(atletas);
    }
}
