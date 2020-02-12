package es.iesnervion.pablo.practica2eva.ViewHolders;

import android.widget.TextView;

public class filaVH {
    //ViewHolder para el listView con las personas

    private TextView nombreVH;
    private TextView apellidosVH;

    //Constructor con parametros
    public filaVH(TextView nombre, TextView apellidos){
        this.nombreVH = nombre;
        this.apellidosVH = apellidos;
    }

    //Getters
    public TextView getNombreVH() {
        return nombreVH;
    }

    public TextView getApellidosVH() {
        return apellidosVH;
    }
}
