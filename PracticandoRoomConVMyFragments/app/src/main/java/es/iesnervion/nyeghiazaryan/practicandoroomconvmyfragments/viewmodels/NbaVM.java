package es.iesnervion.nyeghiazaryan.practicandoroomconvmyfragments.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import es.iesnervion.nyeghiazaryan.practicandoroomconvmyfragments.clases.Nba;
import es.iesnervion.nyeghiazaryan.practicandoroomconvmyfragments.util.Utilidades;

public class NbaVM extends ViewModel
{
    private MutableLiveData<List<Nba>> equpos;
    private MutableLiveData<Nba> equpo;

    public NbaVM()
    {
        this.equpo = new MutableLiveData<>();
        this.equpos.setValue(new Utilidades().cargarArrayNba());
    }

    public LiveData<Nba> getEquipo()
    {
        return equpo;
    }

    public void cambiarPosicion(Nba nba)
    {
        equpo.setValue(nba);
    }
}
