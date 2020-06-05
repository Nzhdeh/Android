package es.iesnervion.nyeghiazaryan.roomviewmodelfragments.viewmodels;

import android.app.Application;
import android.content.Context;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.clases.Persona;
import es.iesnervion.nyeghiazaryan.roomviewmodelfragments.clases.PersonaIntermedio;

public class PersonaVM extends AndroidViewModel
{
    private LiveData<List<Persona>> listadoPersonas;
    private MutableLiveData<Integer> boton;
    private MutableLiveData<Persona> persona;

    public PersonaVM(Application application)
    {
        super(application);
        this.listadoPersonas = PersonaIntermedio.get(application).getPersonas();
        this.boton = new MutableLiveData<>();
        this.persona = new MutableLiveData<>();
    }

//    public PersonaVM(Application application,MutableLiveData<List<Persona>> listadoPersonas, MutableLiveData<Integer> boton)
//    {
//        super(application);
//        this.listadoPersonas = listadoPersonas;
//        this.boton = boton;
//    }

    public LiveData<List<Persona>> getListadoPersonas()
    {
        return this.listadoPersonas;
    }

    public LiveData<Integer> getBoton()
    {
        return this.boton;
    }

    public MutableLiveData<Persona> getPersona()
    {
        return this.persona;
    }

    public void cambiarBoton(int boton)
    {
        this.boton.setValue(boton);
    }

    public void cambiarPosicion(Persona person)
    {
        this.persona.setValue(person);
    }
}
