package es.iesnervion.nyeghiazaryan.nbareturnsconfragmentsyvm.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import es.iesnervion.nyeghiazaryan.nbareturnsconfragmentsyvm.clases.Nba;

public class NbaVM extends ViewModel
{
    private MutableLiveData<Nba> equpo;

    public NbaVM()
    {
        this.equpo = new MutableLiveData<>();
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
