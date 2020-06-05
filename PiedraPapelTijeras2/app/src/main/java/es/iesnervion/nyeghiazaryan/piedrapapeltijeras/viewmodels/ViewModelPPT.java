package es.iesnervion.nyeghiazaryan.piedrapapeltijeras.viewmodels;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class ViewModelPPT extends AndroidViewModel//para shared preferences
{
    private int piedra, papel,tijeras;//estas variables guardan las veces que el usuario ha elegido piedra, papel o tijeras
    private int partidasGanadas,partidasPerdidas,empate;
    private SharedPreferences sharedPref;
    private SharedPreferences.Editor editor;
    private MutableLiveData<Integer> botonRanking;

    public ViewModelPPT(Application application)
    {
        super(application);
        sharedPref = getApplication().getSharedPreferences("RankingPreferences", Context.MODE_PRIVATE);
        editor = sharedPref.edit();

        this.piedra = sharedPref.getInt("piedra",0);
        this.papel = sharedPref.getInt("papel",0);
        this.tijeras = sharedPref.getInt("tijeras",0);
        this.partidasGanadas = sharedPref.getInt("partidaGanada",0);
        this.partidasPerdidas = sharedPref.getInt("partidaPerdida",0);
        this.empate = sharedPref.getInt("empate",0);
        this.botonRanking = new MutableLiveData<>();
    }

    public int getPiedra() {
        return piedra;
    }

    public int getPapel() {
        return papel;
    }

    public int getTijeras() {
        return tijeras;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public int getEmpate() {
        return empate;
    }

    public void setPiedra(int piedra) {
        this.piedra = piedra;
    }

    public void setPapel(int papel) {
        this.papel = papel;
    }

    public void setTijeras(int tijeras) {
        this.tijeras = tijeras;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public MutableLiveData<Integer> getBotonRanking()
    {
        return botonRanking;
    }


    public void cambiarBoton(int boton)
    {
        this.botonRanking.setValue(boton);
    }

    /*
     * sirev para guardar los datos en el fichero de sharedpreferences
     */
    public void GuardarDatosEnShared(int piedra, int papel, int tijeras, int partidasGanadas, int partidasPerdidas, int empate)
    {
        editor.putInt("piedra",piedra);
        editor.putInt("papel",papel);
        editor.putInt("tijeras",tijeras);
        editor.putInt("partidaGanada",partidasGanadas);
        editor.putInt("partidaPerdida",partidasPerdidas);
        editor.putInt("empate",empate);
        editor.commit();
    }
}
