package es.iesnervion.nyeghiazaryan.intentsyviewmodel.viewholders;

import android.widget.ImageView;

/*en esta clase aparecen solo las cosas que queremos personalizar,
si hay algunos atributos que se tienen que qedar fijos no se ponen aqui*/
public class ViewHolderImagen2Activity
{
    ImageView imagenPersona;

    public ViewHolderImagen2Activity(ImageView imagenPersona)
    {
        this.imagenPersona = imagenPersona;
    }

    public ImageView getImagenPersona()
    {
        return imagenPersona;
    }
}
