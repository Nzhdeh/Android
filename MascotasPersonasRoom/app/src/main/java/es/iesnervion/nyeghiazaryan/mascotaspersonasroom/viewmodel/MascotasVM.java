package es.iesnervion.nyeghiazaryan.mascotaspersonasroom.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.List;

import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.bbdd.MascotaIntermedio;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.clases.Mascota;
import es.iesnervion.nyeghiazaryan.mascotaspersonasroom.clases.Persona;

public class MascotasVM extends AndroidViewModel
{
    private MutableLiveData<String> spinner;
    private LiveData<List<Persona>> listadoPersonas;
    private LiveData<List<Mascota>> listadoMascotas;
    private List<Mascota> listadoMascotasPorPersona;
    private MutableLiveData<Integer> idPersonaParaMascota;

    public MascotasVM(@NonNull Application application)
    {
        super(application);

        this.listadoPersonas = MascotaIntermedio.get(application).getPersonas();
        this.listadoMascotas = MascotaIntermedio.get(application).getMascotas();
        this.listadoMascotasPorPersona = null;
        this.spinner = new MutableLiveData<>();
        this.idPersonaParaMascota = new MutableLiveData<>(new Integer(0));
    }

    public List<Mascota> getListadoMascotasPorPersona()
    {
        return listadoMascotasPorPersona;
    }

    public MutableLiveData<Integer> getIdPersonaParaMascota()
    {
        return idPersonaParaMascota;
    }

    public LiveData<List<Mascota>> getListadoMascotas()
    {
        return this.listadoMascotas;
    }

    public LiveData<List<Persona>> getListadoPersonas()
    {
        return this.listadoPersonas;
    }

    public LiveData<String> getSpinner()
    {
        return this.spinner;
    }

    public void setSpinner(MutableLiveData<String> spinner)
    {
        this.spinner = spinner;
    }

    public void cambiarSpinner(String spiner)
    {
        //if(!spiner.equals("Elige una opción"))
            this.spinner.setValue(spiner);
    }

    public void cambiarIdPersonaParaMascota(int idPersona)
    {
        this.idPersonaParaMascota.setValue(idPersona);
    }

    public List<Mascota> obtenerListadoMascotasPorPersona(int idPersona)
    {
        return MascotaIntermedio.get(getApplication()).getMascotasPorPersona(idPersona);
    }
}
