package com.aditya.casio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    //instanciating the widgets
    ListView listView;
    String Tag = "Activity3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Log.i(Tag, "--on create--");

        listView = findViewById(R.id.listView);

        //creating an item holder array for listView
        String[] item = {"Length Converter", "Weight Converter" , "Power Converter", "Temperature converter" , "Force Converter"};

        final ListAdapter listItem = new ArrayAdapter<String>(this, R.layout.row, item); //this will set the contents inside the string array to the listView
        listView.setAdapter(listItem);

        //now setting up onItemClickListener on the listView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            /*
            AdapterView<?> passes the the items in an array to the onItemClick method and onItemClick passes that item to the OnItemClickListener
            view helps the onItemClick to know what item in an array of list is actually tapped on
            position returns the position of an item in an array of list to the onItemClick
            long l is connected with the id of the item its function as almost the same as int position
             */
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Log.i("item",(String) listItem.getItem(position));
                if(position == 0)
                { //Length Converter
                    Intent intent = new Intent(Activity3.this, Activity6.class);
                    startActivity(intent);
                }

                if(position == 1)
                { //weight converter
                    Intent intent = new Intent(Activity3.this, Activity7.class);
                    startActivity(intent);
                }

                if(position == 2)
                {
                    Intent intent = new Intent(Activity3.this, Activity8.class);
                    startActivity(intent);
                }
                if(position == 3)
                {
                    Intent intent = new Intent(Activity3.this, Activity9.class);
                    startActivity(intent);
                }

                if(position == 4)
                {
                    Intent intent = new Intent(Activity3.this, Activity10.class);
                    startActivity(intent);
                }

            }
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag, "--on Restart--");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag, "--on Start--");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag, "--on Resume--");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag, "--on Pause--");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag, "--on Stop--");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag, "--on Destroy--");
    }

}
