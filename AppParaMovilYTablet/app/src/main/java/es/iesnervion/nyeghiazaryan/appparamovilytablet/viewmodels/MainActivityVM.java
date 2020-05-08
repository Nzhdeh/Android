package es.iesnervion.nyeghiazaryan.appparamovilytablet.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityVM extends ViewModel
{
    private MutableLiveData<String> textView;
    private MutableLiveData<Integer> boton;


    public MainActivityVM()
    {
        this.textView = new MutableLiveData<>();
        this.boton = new MutableLiveData<>();
    }

    public LiveData<String> getTextView()
    {
        return textView;
    }

    public LiveData<Integer> getBoton()
    {
        return boton;
    }

    public void cambiarTexto(String textView)
    {
        this.textView.setValue(textView);
    }

    public void cambiarBoton(int boton)
    {
        this.boton.setValue(boton);

//        switch (this.getBoton().getValue().getId())
//        {
//            case R.id.boton1:
//                cambiarTexto("soy el boton 1");
//                break;
//
//            case R.id.boton2:
//                cambiarTexto("soy el boton 2");
//                break;
//        }
//        if(boton==R.id.boton1){
//            cambiarTexto("soy el boton 1");
//        }else if(boton==R.id.boton2){
//            cambiarTexto("soy el boton 2");
//        }

    }
}
