package es.iesnervion.nyeghiazaryan.listaheterogenea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    class IconicAdapter<T> extends ArrayAdapter<T>
    {
        IconicAdapter(Context context,int resourceID,int textID,T[] objects)
        {
            super(context, resourceID, textID, objects);
        }

        public View getView(int position, View convertView,ViewGroup parent)
        {
            View row=convertView;

            ImageView imagenEscudo=row.findViewById(R.id.ivFilaUno);

            if(row==null)
            {
                //TODO aprende hacer esto illo
            }

            return row;
        }


    }
}
