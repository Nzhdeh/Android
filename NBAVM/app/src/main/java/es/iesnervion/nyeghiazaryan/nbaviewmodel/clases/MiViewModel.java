package es.iesnervion.nyeghiazaryan.nbaviewmodel.clases;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MiViewModel extends ViewModel
{
    private int marcador;
    private MutableLiveData<String> mutableLiveData;

    public int getMarcador()
    {
        return marcador;
    }

    public void setMarcador(int marcador)
    {
        this.marcador = marcador;
    }

    public MutableLiveData<String> getMutableLiveData()
    {
        if(mutableLiveData==null)
        {
            mutableLiveData=new MutableLiveData<String>();
        }
        return mutableLiveData;
    }

    //para resetear o limpiar
    @Override
    protected void onCleared()
    {
        super.onCleared();
    }
}
