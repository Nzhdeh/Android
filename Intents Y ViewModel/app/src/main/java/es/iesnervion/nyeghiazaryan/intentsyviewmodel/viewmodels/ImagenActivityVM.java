package es.iesnervion.nyeghiazaryan.intentsyviewmodel.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import es.iesnervion.nyeghiazaryan.intentsyviewmodel.clases.Persona;

public class ImagenActivityVM extends ViewModel
{
    private MutableLiveData<Persona> persona;

    public ImagenActivityVM()
    {
        this.persona = new MutableLiveData<>();
    }

    public LiveData<Persona> getPersona()
    {
        return persona;
    }

    public void cambiarImagen(Persona p,int img)
    {
        p.setImagen(img);
        persona.setValue(new Persona(p.getIdPersona(),p.getNombrePersona(),p.getApellidosPersona(),p.getImagen()));
    }
}
