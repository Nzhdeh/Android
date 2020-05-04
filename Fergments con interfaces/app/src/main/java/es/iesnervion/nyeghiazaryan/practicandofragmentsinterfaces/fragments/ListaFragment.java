package es.iesnervion.nyeghiazaryan.practicandofragmentsinterfaces.fragments;

import android.content.Context;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import es.iesnervion.nyeghiazaryan.practicandofragmentsinterfaces.R;
import es.iesnervion.nyeghiazaryan.practicandofragmentsinterfaces.adaptadores.Adaptador;
import es.iesnervion.nyeghiazaryan.practicandofragmentsinterfaces.clases.Nba;
import es.iesnervion.nyeghiazaryan.practicandofragmentsinterfaces.interfaces.OnInteraccionFragment;
import es.iesnervion.nyeghiazaryan.practicandofragmentsinterfaces.util.Utilidades;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 *  interface
 * to handle interaction events.
 * Use the {@link ListaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListaFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ListView listaDatos;
    private ArrayList<Nba> lista;

    private OnInteraccionFragment actividad;

    public ListaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ListaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListaFragment newInstance(String param1, String param2) {
        ListaFragment fragment = new ListaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if (getArguments() != null)
        {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_lista, container, false);

        Utilidades util= new Utilidades();
        lista=util.cargarArrayNba();
        listaDatos = vista.findViewById(R.id.listJugadores);

        Adaptador miAdaptador=new Adaptador(getContext(),lista);
        listaDatos.setAdapter(miAdaptador);

        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                //Toast.makeText(getContext(),"inicioar desde el fragmento",Toast.LENGTH_SHORT).show();
                //avisamos a la actividad que cambie de fragmento
                actividad.OnAvisarAlActivitYMain(parent,  view,  position,  id);
            }
        });

        return vista;
    }

    // TODO: Rename method, update argument and hook method into UI event
//    public void onButtonPressed(Uri uri) {
//        if (actividad != null) {
//            actividad.OnAvisarAlActivitYMain(uri);
//        }
//    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnInteraccionFragment) {
            actividad = (OnInteraccionFragment) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnInteraccionFragment");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        actividad = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
//    public interface OnInteraccionFragment
//    {
//        // TODO: Update argument type and name
//        void OnAvisarAlActivitYMain(View view);
//    }
}
