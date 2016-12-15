package com.example.pablo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2Main extends Fragment {


    public Fragment2Main() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        String data = getActivity().getIntent().getStringExtra("texto");
        View view = inflater.inflate(R.layout.fragment_fragment2_main, container, false);
        TextView texto = (TextView) view.findViewById(R.id.texto);
        texto.setText(data);
        return inflater.inflate(R.layout.fragment_fragment2_main, container, false);
    }

}
