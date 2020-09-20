package com.aditya.casio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class Activity7 extends AppCompatActivity {

    //initializing all the widgets
    TextView textView8;
    EditText editText19;
    Spinner spinner;
    Spinner spinner2;
    Button button20;
    String Tag = "Activity7";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);
        Log.i(Tag, "--on create--");

        //binding all the widgets to the activity code from the user interface xml file
        textView8 = findViewById(R.id.textView9);
        editText19 = findViewById(R.id.Input);
        spinner = findViewById(R.id.spinner5);
        spinner2 = findViewById(R.id.spinner6);
        button20 = findViewById(R.id.button9);

        //setting up spinner item array that will be displayed inside the spinner
        String[] from = {"Tonne", "Kilogram", "Gram", "Milligram", "Microgram", "Stone", "Pound", "Ounce"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, from);
        spinner.setAdapter(ad);

        String[] to = {"Tonne", "Kilogram", "Gram", "Milligram", "Microgram", "Stone", "Pound", "Ounce"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, to);
        spinner2.setAdapter(ad1);

        //setting up onclickListener on button
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result;
                String toasttext;
                Double amount = Double.parseDouble(editText19.getText().toString());

                //applying conditions for = Tonne
                if(spinner.getSelectedItem() == "Tonne" && spinner2.getSelectedItem() == "Tonne")
                {
                    toasttext = "Abe bin bijili ke khambe dekh ke fir convert kar na";
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Tonne" && spinner2.getSelectedItem() == "Kilogram")
                {
                    result = 1000 * amount;
                    toasttext = "Tonne to Kilogram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Tonne" && spinner2.getSelectedItem() == "Gram")
                {
                    result = 1e+6 * amount;
                    toasttext = "Tonne to Gram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Tonne" && spinner2.getSelectedItem() == "Milligram")
                {
                    result = 1e+9 * amount;
                    toasttext = "Tonne to Milligram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Tonne" && spinner2.getSelectedItem() == "Microgram")
                {
                    result = 1e+12 * amount;
                    toasttext = "Tonne to Microgram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Tonne" && spinner2.getSelectedItem() == "Stone")
                {
                    result = 157.473 * amount;
                    toasttext = "Tonne to Stone " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Tonne" && spinner2.getSelectedItem() == "Pound")
                {
                    result = 2204.62 * amount;
                    toasttext = "Tonne to Pound " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Tonne" && spinner2.getSelectedItem() == "Ounce")
                {
                    result = 35274 * amount;
                    toasttext = "Tonne to Ounce " + result.toString();
                    textView8.setText(toasttext);
                }

                //applying conditions from = Kilogram
                if(spinner.getSelectedItem() == "Kilogram" && spinner2.getSelectedItem() == "Tonne")
                {
                    result = 0.001 * amount;
                    toasttext = "Kilogram to Tonne " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Kilogram" && spinner2.getSelectedItem() == "Kilogram")
                {
                    toasttext = "Beta tumse na ho payga ";
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Kilogram" && spinner2.getSelectedItem() == "Gram")
                {
                    result = 1000 * amount;
                    toasttext = "Kilogram to Gram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Kilogram" && spinner2.getSelectedItem() == "Milligram")
                {
                    result = 1e+6 * amount;
                    toasttext = "Kilogram to Milligram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Kilogram" && spinner2.getSelectedItem() == "Microgram")
                {
                    result = 1e+9 * amount;
                    toasttext = "Kilogram to Microgram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Kilogram" && spinner2.getSelectedItem() == "Stone")
                {
                    result = 0.157473 * amount;
                    toasttext = "Kilogram to Stone " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Kilogram" && spinner2.getSelectedItem() == "Pound")
                {
                    result = 2.20462 * amount;
                    toasttext = "Kilogram to Pound " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Kilogram" && spinner2.getSelectedItem() == "Ounce")
                {
                    result = 35.274 * amount;
                    toasttext = "Kilogram to Ounce " + result.toString();
                    textView8.setText(toasttext);
                }

                //applying conditions from = Gram
                if(spinner.getSelectedItem() == "Gram" && spinner2.getSelectedItem() == "Tonne")
                {
                    result = 1e-6 * amount;
                    toasttext = "Gram to Tonne " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Gram" && spinner2.getSelectedItem() == "Kilogram")
                {
                    result = 0.001 * amount;
                    toasttext = "Gram to Kilogram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Gram" && spinner2.getSelectedItem() == "Gram")
                {
                    toasttext = "Abe yr gajab aadmi ho yr tum";
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Gram" && spinner2.getSelectedItem() == "Milligram")
                {
                    result = 1000 * amount;
                    toasttext = "Gram to Milligram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Gram" && spinner2.getSelectedItem() == "Microgram")
                {
                    result = 1e+6 * amount;
                    toasttext = "Gram to Microgram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Gram" && spinner2.getSelectedItem() == "Stone")
                {
                    result = 0.000157473 * amount;
                    toasttext = "Gram to Stone " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Gram" && spinner2.getSelectedItem() == "Pound")
                {
                    result = 0.00220462 * amount;
                    toasttext = "Gram to Pound " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Gram" && spinner2.getSelectedItem() == "Ounce")
                {
                    result = 0.035274 * amount;
                    toasttext = "Gram to Ounce" +  result.toString();
                    textView8.setText(toasttext);
                }

                //applying conditions from = Milligram
                if(spinner.getSelectedItem() == "Milligram" && spinner2.getSelectedItem() == "Tonne")
                {
                    result = 1e-9 * amount;
                    toasttext = "Milligram to Tonne " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Milligram" && spinner2.getSelectedItem() == "Kilogram")
                {
                    result = 1e-6 * amount;
                    toasttext = "Milligram to Kilogram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Milligram" && spinner2.getSelectedItem() == "Gram")
                {
                    result = 0.001 * amount;
                    toasttext = "Milligram to Gram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Milligram" && spinner2.getSelectedItem() == "Milligram")
                {
                    toasttext = "Kon hai ye LOG kaha se aate hai";
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Milligram" && spinner2.getSelectedItem() == "Microgram")
                {
                    result = 1000 * amount;
                    toasttext = "Milligram to Microgram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Milligram" && spinner2.getSelectedItem() == "Stone")
                {
                    result = 1.5747e-7 * amount;
                    toasttext = "Milligram to Stone " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Milligram" && spinner2.getSelectedItem() == "Pound")
                {
                    result = 2.2046e-6 * amount;
                    toasttext = "Milligram to Pound " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Milligram" && spinner2.getSelectedItem() == "Ounce")
                {
                    result = 3.5274e-5 * amount;
                    toasttext = "Milligram to Ounce" + result.toString();
                    textView8.setText(toasttext);
                }

                //applying conditions from = Microgram
                if(spinner.getSelectedItem() == "Microgram" && spinner2.getSelectedItem() == "Tonne")
                {
                    result = 1e-12 * amount;
                    toasttext = "Microgram to Tonne " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Microgram" && spinner2.getSelectedItem() == "Kilogram")
                {
                    result = 1e-9 * amount;
                    toasttext = "Microgram to Kilogram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Microgram" && spinner2.getSelectedItem() == "Gram")
                {
                    result = 1e-6 * amount;
                    toasttext = "Microgram to Gram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Microgram" && spinner2.getSelectedItem() == "Milligram")
                {
                    result = 0.001 * amount;
                    toasttext = "Microgram to Milligram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Microgram" && spinner2.getSelectedItem() == "Microgram")
                {
                    toasttext = "OK....Time to leave earth...";
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Microgram" && spinner2.getSelectedItem() == "Stone")
                {
                    result = 1.5747e-10 * amount;
                    toasttext = "Microgram to Stone " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Microgram" && spinner2.getSelectedItem() == "Pound")
                {
                    result = 2.2046e-9 * amount;
                    toasttext = "Microgram to Pound " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Microgram" && spinner2.getSelectedItem() == "Ounce")
                {
                    result = 3.5274e-8 * amount;
                    toasttext = "Microgram to Ounce" + result.toString();
                    textView8.setText(toasttext);
                }

                //applying conditions from = Stone
                if(spinner.getSelectedItem() == "Stone" && spinner2.getSelectedItem() == "Tonne")
                {
                    result = 0.00635029 * amount;
                    toasttext = "Stone to Tonne " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Stone" && spinner2.getSelectedItem() == "Kilogram")
                {
                    result = 6.35029 * amount;
                    toasttext = "Stone to Kilogram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Stone" && spinner2.getSelectedItem() == "Gram")
                {
                    result = 6350.29 * amount;
                    toasttext = "Stone to Gram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Stone" && spinner2.getSelectedItem() == "Milligram")
                {
                    result = 6.35e+6 * amount;
                    toasttext = "Stone to Milligram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Stone" && spinner2.getSelectedItem() == "Microgram")
                {
                    result = 6.35e+9 * amount;
                    toasttext = "Stone to Microgram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Stone" && spinner2.getSelectedItem() == "Stone")
                {
                    toasttext = "You know..your stupidity is contagious just like COVID19..stay at home for christ sake";
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Stone" && spinner2.getSelectedItem() == "Pound")
                {
                    result = 14 * amount;
                    toasttext = "Stone to Pound " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Stone" && spinner2.getSelectedItem() == "Ounce")
                {
                    result = 224 * amount;
                    toasttext = "Stone to Ounce" + result.toString();
                    textView8.setText(toasttext);
                }

                //applying conditions from = Pound
                if(spinner.getSelectedItem() == "Pound" && spinner2.getSelectedItem() == "Tonne")
                {
                    result = 0.000453592 * amount;
                    toasttext = "Pound to Tonne " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Pound" && spinner2.getSelectedItem() == "Kilogram")
                {
                    result = 0.453592 * amount;
                    toasttext = "Pound to Kilogram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Pound" && spinner2.getSelectedItem() == "Gram")
                {
                    result = 453.592 * amount;
                    toasttext = "Pound to Gram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Pound" && spinner2.getSelectedItem() == "Milligram")
                {
                    result = 453592 * amount;
                    toasttext = "Pound to Milligram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Pound" && spinner2.getSelectedItem() == "Microgram")
                {
                    result = 4.536e+8 * amount;
                    toasttext = "Pound to Microgram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Pound" && spinner2.getSelectedItem() == "Stone")
                {
                    result = 0.0714286 * amount;
                    toasttext = "Pound to Stone " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Pound" && spinner2.getSelectedItem() == "Pound")
                {
                    toasttext = "Mai sahi bata ra hu ab tu maar kha jayega ";
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Pound" && spinner2.getSelectedItem() == "Ounce")
                {
                    result = 16 * amount;
                    toasttext = "Pound to Ounce" + result.toString();
                    textView8.setText(toasttext);
                }

                //applying conditions from = Ounce
                if(spinner.getSelectedItem() == "Ounce" && spinner2.getSelectedItem() == "Tonne")
                {
                    result = 2.835e-5 * amount;
                    toasttext = "Ounce to Tonne " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Ounce" && spinner2.getSelectedItem() == "Kilogram")
                {
                    result = 0.0283495 * amount;
                    toasttext = "Ounce to Kilogram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Ounce" && spinner2.getSelectedItem() == "Gram")
                {
                    result = 28.3495 * amount;
                    toasttext = "Ounce to Gram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Ounce" && spinner2.getSelectedItem() == "Milligram")
                {
                    result = 28349.5 * amount;
                    toasttext = "Ounce to Milligram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Ounce" && spinner2.getSelectedItem() == "Microgram")
                {
                    result = 2.83495e+7 * amount;
                    toasttext = "Ounce to Microgram " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Ounce" && spinner2.getSelectedItem() == "Stone")
                {
                    result = 0.00446429 * amount;
                    toasttext = "Ounce to Stone " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Ounce" && spinner2.getSelectedItem() == "Pound")
                {
                    result = 0.0625 * amount;
                    toasttext = "Ounce to Pound " + result.toString();
                    textView8.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Ounce" && spinner2.getSelectedItem() == "Ounce")
                {
                    toasttext = "He bhagvaan utha le re isko";
                    textView8.setText(toasttext);
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
