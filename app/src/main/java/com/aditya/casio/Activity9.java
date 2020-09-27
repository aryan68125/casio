package com.aditya.casio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class Activity9 extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button button;
    Spinner spinnerinput;
    Spinner spinneroutput;
    String Tag = "Activity9";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9);
        Log.i(Tag, "--on create--");

        //binding all the widgets to the activity code from the user interface xml file
        textView = findViewById(R.id.Output11);
        editText = findViewById(R.id.Input11);
        spinnerinput = findViewById(R.id.inputspinner12);
        spinneroutput = findViewById(R.id.outputspinner11);
        button = findViewById(R.id.convertbutton40);

        //Setting up the spinner item array that will display the items inside the spinner
        String[] input = {"Celsius", "Fahrenheit", "Kelvin"}; //for input spinner
        ArrayAdapter in = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, input);
        spinnerinput.setAdapter(in);

        String[] output = {"Celsius", "Fahrenheit", "Kelvin"}; //for output spinner
        ArrayAdapter out = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, output);
        spinneroutput.setAdapter(out);

        //setting up an onclick listener for the button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result;
                String toasttext;
                Double amount = Double.parseDouble(editText.getText().toString());
                //for celsius
                if(spinnerinput.getSelectedItem() == "Celsius" && spinneroutput.getSelectedItem() == "Celsius")
                {
                    toasttext = "Abe bin bijili ke khambe dekh ke fir convert kar na";
                    textView.setText(toasttext);
                }
                if(spinnerinput.getSelectedItem() == "Celsius" && spinneroutput.getSelectedItem() == "Fahrenheit")
                {
                    result = 33.8 *amount;
                    toasttext = "Celsius to Fahrenheit = "+ result.toString();
                    textView.setText(toasttext);
                }
                if(spinnerinput.getSelectedItem() == "Celsius" && spinneroutput.getSelectedItem() == "Kelvin")
                {
                    result = 274.15 *amount;
                    toasttext = "Celsius to Kelvin = "+ result.toString();
                    textView.setText(toasttext);
                }
                //for Fahrenheit
                if(spinnerinput.getSelectedItem() == "Fahrenheit" && spinneroutput.getSelectedItem() == "Celsius")
                {
                    result = -17.2222 *amount;
                    toasttext = "Fahrenheit to Celsius = "+ result.toString();
                    textView.setText(toasttext);
                }
                if(spinnerinput.getSelectedItem() == "Fahrenheit" && spinneroutput.getSelectedItem() == "Fahrenheit")
                {
                    toasttext = "Kyu tum mera sir khane aa jate ho mujhey samajh ni aata";
                    textView.setText(toasttext);
                }
                if(spinnerinput.getSelectedItem() == "Fahrenheit" && spinneroutput.getSelectedItem() == "Kelvin")
                {
                    result = 255.928 *amount;
                    toasttext = "Fahrenheit to Kelvin = "+ result.toString();
                    textView.setText(toasttext);
                }
                //for Kelvin
                if(spinnerinput.getSelectedItem() == "Kelvin" && spinneroutput.getSelectedItem() == "Celsius")
                {
                    result = -272.15 *amount;
                    toasttext = "Kelvin to Celsius = "+ result.toString();
                    textView.setText(toasttext);
                }
                if(spinnerinput.getSelectedItem() == "Kelvin" && spinneroutput.getSelectedItem() == "Fahrenheit")
                {
                    result = -457.87 *amount;
                    toasttext = "Kelvin to Fahrenheit = "+ result.toString();
                    textView.setText(toasttext);
                }
                if(spinnerinput.getSelectedItem() == "Kelvin" && spinneroutput.getSelectedItem() == "Kelvin")
                {
                    toasttext = "Beta andar se khol ke baja dunga dekh ke fir convert kar na";
                    textView.setText(toasttext);
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