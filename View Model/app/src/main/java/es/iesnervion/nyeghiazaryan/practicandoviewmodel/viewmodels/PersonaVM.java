package es.iesnervion.nyeghiazaryan.practicandoviewmodel.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import es.iesnervion.nyeghiazaryan.practicandoviewmodel.clases.Persona;

public class PersonaVM extends ViewModel
{
    private MutableLiveData<Persona> persona;

    public PersonaVM()
    {
        this.persona = new MutableLiveData<>();
    }

    public LiveData<Persona> getPersona()
    {
        return persona;
    }

    public void cambiarPersona(Persona p)
    {
        if(!p.getNombre().equals("") && !p.getApellidos().equals(""))
            persona.setValue(new Persona(p.getNombre(),p.getApellidos()));
        else
            persona.setValue(new Persona());
    }
}
