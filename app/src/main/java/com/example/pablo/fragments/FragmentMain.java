package com.example.pablo.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link FragmentMain} subclass.
 */
public class FragmentMain extends Fragment {


    public FragmentMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_, container, false);
    }

    public void copiarTexto(View v){
        Button b =(Button)v;
        String string =(String) b.getText();
        Intent intent =new Intent(getContext(), Fragment2Main.class);
        intent.putExtra("texto", string);
        startActivity(intent);

    }

}
