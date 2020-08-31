package com.aditya.casio;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class fragment2 extends ListFragment {

    String[] AndroidApps = new String[] //string array
            {
                    "Name",
                    "Course",
                    "Year",
                    "Branch",
                    "College name",
                    "College code",
                    "roll number"
            };

    String[] Discription = new String[]
            {
                    "Aditya Kumar",
                    "B.Tech",
                    "2nd year",
                    "Computer Science",
                    "Saroj Institute of Technology & Management",
                    "123",
                    "1901230100001"
            };


    public fragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState )
    {   //this adapter will pass the data to the lisview
        View view = inflater.inflate(R.layout.fragment_fragment2, container, false);
        ArrayAdapter<String> adapter  = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, AndroidApps);
        setListAdapter(adapter);
        return view;
    }

    // setting up on click listener on the list of items in the fragment 2
    @Override
    public void onListItemClick(ListView listView, View view, int position, long id)
    {
        fragment1 txt = (fragment1) getFragmentManager().findFragmentById(R.id.fragment1);
        txt.change(AndroidApps[position], Discription[position]);
        getListView().setSelector(android.R.color.holo_blue_dark); //list item selector color
    }

}
