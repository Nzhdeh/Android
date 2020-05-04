package es.iesnervion.nyeghiazaryan.comunicacionentrefragmentyactivity.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import es.iesnervion.nyeghiazaryan.comunicacionentrefragmentyactivity.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BotonesFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BotonesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BotonesFragment extends Fragment
{
    private OnFragmentInteractionListener mListener;
    private Button boton1;
    private Button boton2;
    //private TextView textView;//para pasar al otro fragment


    public BotonesFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static BotonesFragment newInstance(/*String param1, String param2*/)
    {
        BotonesFragment fragment = new BotonesFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
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
        View view = inflater.inflate(R.layout.fragment_botones, container, false);

        boton1= view.findViewById(R.id.boton1);
        boton2= view.findViewById(R.id.boton2);
        //textView=getActivity().findViewById(R.id.txtRecibir);

        boton1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mListener.onFragmentInteraction(boton1);
            }
        });

        boton2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mListener.onFragmentInteraction(boton2);
            }
        });

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(View view) {
        if (mListener != null) {
            mListener.onFragmentInteraction(view);
        }
    }

    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener)
        {
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
    public interface OnFragmentInteractionListener
    {
        // TODO: Update argument type and name
        void onFragmentInteraction(View view);
    }
}
