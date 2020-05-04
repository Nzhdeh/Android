package es.iesnervion.nyeghiazaryan.intentsyviewmodel.utilidades;

import android.graphics.Bitmap;

import java.util.ArrayList;

import es.iesnervion.nyeghiazaryan.intentsyviewmodel.R;
import es.iesnervion.nyeghiazaryan.intentsyviewmodel.clases.Persona;

public class Util
{
    public ArrayList<Persona> cargarPersonasSinFoto()
    {
        ArrayList<Persona> listado = new ArrayList<>();

//        for(int i=0;i<300;i++)
//        {
//            listado.add(new Persona(1,"Francisco José","Folla Doblado", R.drawable.francisco_jose_folla_doblado));
//            listado.add(new Persona(2,"Armando","Bronca Segura",R.drawable.armando_bronca_segura));
//            listado.add(new Persona(3,"Domingo","Díaz Festivo",R.drawable.domingo_diaz_festivo));
//            listado.add(new Persona(4,"Ramona","Ponte Alegre",R.drawable.ramona_ponte_alegre));
//            listado.add(new Persona(5,"Margarita","Flores del Campo",R.drawable.margarita_flores_del_campo));
//            listado.add(new Persona(6,"José Luis","Lamata Feliz",R.drawable.jos_luis_lamata_feliz));
//            listado.add(new Persona(7,"Tomás","Viejo Feo",R.drawable.tomas_viejo_feo));
//            listado.add(new Persona(8,"Román","Calavera Calva",R.drawable.roman_calavera_calva));
//            listado.add(new Persona(9,"Umberta","Canas Revueltas",R.drawable.umberta_canas_revueltas));
//            listado.add(new Persona(10,"Silvia","Silba Fuerte",R.drawable.silvia_silba_fuerte));
//            listado.add(new Persona(11,"Ismael","Solo Y Triste",R.drawable.ismael_solo_y_triste));
//            listado.add(new Persona(12,"Ana","Pulpito Salido",R.drawable.ana_pulpito_salido));
//            listado.add(new Persona(13,"Fernando","Coco Cuadrado",R.drawable.fernando_coco_cuadrado));
//            listado.add(new Persona(14,"Pascual","Conejo Enamorado",R.drawable.pascual_conejo_enamorado));
//            listado.add(new Persona(15,"Benigno","Sordo Entero",R.drawable.benigno_sordo_entero));
        //}

        listado.add(new Persona(1,"Francisco José","Folla Doblado"));
        listado.add(new Persona(2,"Armando","Bronca Segura"));
        listado.add(new Persona(3,"Domingo","Díaz Festivo"));
        listado.add(new Persona(4,"Ramona","Ponte Alegre"));
        listado.add(new Persona(5,"Margarita","Flores del Campo"));
        listado.add(new Persona(6,"José Luis","Lamata Feliz"));
        listado.add(new Persona(7,"Tomás","Viejo Feo"));
        listado.add(new Persona(8,"Román","Calavera Calva"));
        listado.add(new Persona(9,"Umberta","Canas Revueltas"));
        listado.add(new Persona(10,"Silvia","Silba Fuerte"));
        listado.add(new Persona(11,"Ismael","Solo Y Triste"));
        listado.add(new Persona(12,"Ana","Pulpito Salido"));
        listado.add(new Persona(13,"Fernando","Coco Cuadrado"));
        listado.add(new Persona(14,"Pascual","Conejo Enamorado"));
        listado.add(new Persona(15,"Benigno","Sordo Entero"));

        return listado;
    }


    public int [] cargarImasgenes()
    {
        int [] listado = new int[15];

        listado[0]=R.drawable.francisco_jose_folla_doblado;
        listado[1]=R.drawable.armando_bronca_segura;
        listado[2]=R.drawable.domingo_diaz_festivo;
        listado[3]=R.drawable.ramona_ponte_alegre;
        listado[4]=R.drawable.margarita_flores_del_campo;
        listado[5]=R.drawable.jos_luis_lamata_feliz;
        listado[6]=R.drawable.tomas_viejo_feo;
        listado[7]=R.drawable.roman_calavera_calva;
        listado[8]=R.drawable.umberta_canas_revueltas;
        listado[9]=R.drawable.silvia_silba_fuerte;
        listado[10]=R.drawable.ismael_solo_y_triste;
        listado[11]=R.drawable.ana_pulpito_salido;
        listado[12]=R.drawable.fernando_coco_cuadrado;
        listado[13]=R.drawable.pascual_conejo_enamorado;
        listado[14]=R.drawable.benigno_sordo_entero;

        return listado;
    }
}
