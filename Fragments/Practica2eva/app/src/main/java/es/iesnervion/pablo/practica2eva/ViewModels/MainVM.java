package es.iesnervion.pablo.practica2eva.ViewModels;

import android.app.Application;
import java.util.ArrayList;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import es.iesnervion.pablo.practica2eva.BaseDatos.UsarDataBase;
import es.iesnervion.pablo.practica2eva.Entidades.ClsPersona;

public class MainVM extends AndroidViewModel {
    //Propiedades privadas
    private MutableLiveData<ArrayList<ClsPersona>> listaPersonas;
    private MutableLiveData<ClsPersona> personaSeleccionada;

    //Constructor por defecto
    public MainVM(Application app){
        super(app);
        personaSeleccionada = new MutableLiveData<>();
    }

    //Propiedades publicas
    public LiveData<ArrayList<ClsPersona>> getListaPersonas(){
        if(listaPersonas == null){
            listaPersonas = new MutableLiveData<>();
            cargarPersonas();
        }
        return listaPersonas;
    }

    public LiveData<ClsPersona> getPersonaSeleccionada(){
        return personaSeleccionada;
    }
    public void setPersonaSeleccionada(ClsPersona persona){
        personaSeleccionada.setValue(persona);
    }

    /**
     * Obtiene una lista de personas de una base de datos local ROOM.
     */
    private void cargarPersonas(){
        //Datos provisionales para pruebas
        ArrayList<ClsPersona> personas;
         personas = new ArrayList<>(UsarDataBase.getDataBase(getApplication()).dao().obtenerPersonas());
        listaPersonas.setValue(personas);
    }
}
