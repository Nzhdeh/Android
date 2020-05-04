package es.iesnervion.nyeghiazaryan.comunicacionentrefragmentyactivity.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import es.iesnervion.nyeghiazaryan.comunicacionentrefragmentyactivity.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ContenidoFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ContenidoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContenidoFragment extends Fragment
{
    private OnFragmentInteractionListener mListener;
    private TextView recibir;

    public ContenidoFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static ContenidoFragment newInstance(/*String param1, String param2*/) {
        ContenidoFragment fragment = new ContenidoFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contenido, container, false);
        recibir= view.findViewById(R.id.txtRecibir);

        if(getArguments()!=null)
        {
            recibir.setText(getArguments().getString("dato","No se ha mandado nada"));
        }

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(View cadena) {
        if (mListener != null) {
            mListener.onFragmentInteraction(cadena);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
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
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(View cadena);
    }
}
