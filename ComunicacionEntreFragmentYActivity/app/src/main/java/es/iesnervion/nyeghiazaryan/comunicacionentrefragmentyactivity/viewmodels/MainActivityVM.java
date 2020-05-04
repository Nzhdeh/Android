package es.iesnervion.nyeghiazaryan.comunicacionentrefragmentyactivity.viewmodels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityVM extends ViewModel
{
    MutableLiveData<String> textView;

    public MainActivityVM(MutableLiveData<String> textView)
    {
        this.textView = textView;
    }

    public MutableLiveData<String> getTextView()
    {
        return textView;
    }

    public void cambiarTexto(String textView)
    {
        this.textView.setValue(textView);
    }
}
