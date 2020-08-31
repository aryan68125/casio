package com.aditya.casio;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class fragment1 extends Fragment {

    TextView textView1,textView2;
    View view;

    public fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view  = inflater.inflate(R.layout.fragment_fragment1, container, false);

        textView1 = (TextView) view.findViewById(R.id.AndroidApp);
        textView2 = (TextView) view.findViewById(R.id.Discription);



        // Inflate the layout for this fragment
        return view;
    }

    public void change(String txt1, String txt2) //this method will set the text in our text views
    {
        textView1.setText(txt1);
        textView2.setText(txt2);
    }

}
