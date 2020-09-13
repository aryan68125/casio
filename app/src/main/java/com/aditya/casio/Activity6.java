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


public class Activity6 extends AppCompatActivity {

    //initializing all the widgets
    TextView textView20;
    EditText editText18;
    Spinner spinner;
    Spinner spinner2;
    Button button20;
    String Tag = "Activity6";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
        Log.i(Tag, "--on create--");

        //binding all the widgets to the activity code from the user interface xml file
        textView20 = findViewById(R.id.textView20);
        editText18 = findViewById(R.id.editText18);
        spinner = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner2);
        button20 = findViewById(R.id.button20);

        //setting up spinner item array that will be displayed inside the spinner
        String[] from = {"Mile", "Kilometer", "Inch", "Millimeter", "Metre", "Yard", "Foot", "Nautical Mile"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, from);
        spinner.setAdapter(ad);

        String[] to = {"Mile", "Kilometer", "Inch", "Millimeter", "Metre", "Yard", "Foot", "Nautical Mile"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, to);
        spinner2.setAdapter(ad1);

        //setting up onclickListener on button
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result;
                String toasttext;
                Double amount = Double.parseDouble(editText18.getText().toString());

                //applying conditions from = mile
                if(spinner.getSelectedItem() == "Mile" && spinner2.getSelectedItem() == "Kilometer")
                {
                   result = 1.60934 * amount;
                   toasttext = "Mile to Km " + result.toString();
                   textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Mile" && spinner2.getSelectedItem() == "Inch")
                {
                    result = 63360 * amount;
                    toasttext = "Mile to Inch " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Mile" && spinner2.getSelectedItem() == "Millimeter")
                {
                    result = 1.609e+6 * amount;
                    toasttext = "Mile to Millimeter " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Mile" && spinner2.getSelectedItem() == "Metre")
                {
                    result = 1609.34 * amount;
                    toasttext = "Mile to Metre " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Mile" && spinner2.getSelectedItem() == "Yard")
                {
                    result = 1760 * amount;
                    toasttext = "Mile to Yard " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Mile" && spinner2.getSelectedItem() == "Foot")
                {
                    result = 5280 * amount;
                    toasttext = "Mile to Foot " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Mile" && spinner2.getSelectedItem() == "Nautical Mile")
                {
                    result = 0.868976 * amount;
                    toasttext = "Mile to Nautical Mile " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Mile" && spinner2.getSelectedItem() == "Mile")
                {
                    toasttext = "Beta tu nikal yaha se chutiye";
                    textView20.setText(toasttext);
                }

                //applying conditions from = Kilometer
                if(spinner.getSelectedItem() == "Kilometer" && spinner2.getSelectedItem() == "Mile")
                {
                    result = 0.621371 * amount;
                    toasttext = "Kilometer to Mile " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Kilometer" && spinner2.getSelectedItem() == "Inch")
                {
                    result = 39370.1 * amount;
                    toasttext = "Kilometer to Inch " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Kilometer" && spinner2.getSelectedItem() == "Millimeter")
                {
                    result = 1e+6 * amount;
                    toasttext = "Kilometer to Millimeter " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Kilometer" && spinner2.getSelectedItem() == "Metre")
                {
                    result = 1000 * amount;
                    toasttext = "Kilometer to Metre " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Kilometer" && spinner2.getSelectedItem() == "Yard")
                {
                    result = 1093.61 * amount;
                    toasttext = "Kilometer to Yard " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Kilometer" && spinner2.getSelectedItem() == "Foot")
                {
                    result = 3280.84 * amount;
                    toasttext = "Kilometer to Foot " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Kilometer" && spinner2.getSelectedItem() == "Nautical Mile")
                {
                    result = 0.539957 * amount;
                    toasttext = "Kilometer to Nautical Mile " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Kilometer" && spinner2.getSelectedItem() == "Kilometer")
                {
                    toasttext = "Chutiya ho gaya hai kya";
                    textView20.setText(toasttext);
                }

                //applying conditions from = Inch
                if(spinner.getSelectedItem() == "Inch" && spinner2.getSelectedItem() == "Mile")
                {
                    result = 1.5783e-5 * amount;
                    toasttext = "Inch to Mile " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Inch" && spinner2.getSelectedItem() == "Kilometer")
                {
                    result = 2.54e-5 * amount;
                    toasttext = "Inch to Kilometer " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Inch" && spinner2.getSelectedItem() == "Inch")
                {
                    toasttext = "Abe yr gajab aadmi ho yr tum";
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Inch" && spinner2.getSelectedItem() == "Millimeter")
                {
                    result = 25.4 * amount;
                    toasttext = "Inch to Millimeter " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Inch" && spinner2.getSelectedItem() == "Metre")
                {
                    result = 0.0254 * amount;
                    toasttext = "Inch to Metre " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Inch" && spinner2.getSelectedItem() == "Yard")
                {
                    result = 0.0277778 * amount;
                    toasttext = "Inch to Yard " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Inch" && spinner2.getSelectedItem() == "Foot")
                {
                    result = 0.0833333 * amount;
                    toasttext = "Inch to Foot " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Inch" && spinner2.getSelectedItem() == "Nautical Mile")
                {
                    result = 1.3715e-5 * amount;
                    toasttext = "Inch to Nautical Mile" +  result.toString();
                    textView20.setText(toasttext);
                }

                //applying conditions from = Millimeter
                if(spinner.getSelectedItem() == "Millimeter" && spinner2.getSelectedItem() == "Mile")
                {
                    result = 6.2137e-7 * amount;
                    toasttext = "Millimeter to Mile " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Millimeter" && spinner2.getSelectedItem() == "Kilometer")
                {
                    result = 1e-6 * amount;
                    toasttext = "Millimeter to Kilometer " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Millimeter" && spinner2.getSelectedItem() == "Inch")
                {
                    result = 0.0393701 * amount;
                    toasttext = "Millimeter to Inch " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Millimeter" && spinner2.getSelectedItem() == "Millimeter")
                {
                    toasttext = "Go see a doctor";
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Millimeter" && spinner2.getSelectedItem() == "Metre")
                {
                    result = 0.001 * amount;
                    toasttext = "Millimeter to Metre " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Millimeter" && spinner2.getSelectedItem() == "Yard")
                {
                    result = 0.00109361 * amount;
                    toasttext = "Millimeter to Yard " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Millimeter" && spinner2.getSelectedItem() == "Foot")
                {
                    result = 0.00328084 * amount;
                    toasttext = "Millimeter to Foot " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Millimeter" && spinner2.getSelectedItem() == "Nautical Mile")
                {
                    result = 5.3996e-7 * amount;
                    toasttext = "Millimeter to Nautical Mile" + result.toString();
                    textView20.setText(toasttext);
                }

                //applying conditions from = Meter
                if(spinner.getSelectedItem() == "Meter" && spinner2.getSelectedItem() == "Mile")
                {
                    result = 0.000621371 * amount;
                    toasttext = "Meter to Mile " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Metre" && spinner2.getSelectedItem() == "Kilometer")
                {
                    result = 0.001 * amount;
                    toasttext = "Metre to Kilometer " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Metre" && spinner2.getSelectedItem() == "Inch")
                {
                    result = 39.3701 * amount;
                    toasttext = "Metre to Inch " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Metre" && spinner2.getSelectedItem() == "Millimeter")
                {
                    result = 1000 * amount;
                    toasttext = "Metre to Millimeter " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Metre" && spinner2.getSelectedItem() == "Metre")
                {
                    toasttext = "Abe chutiye cashma pehen";
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Metre" && spinner2.getSelectedItem() == "Yard")
                {
                    result = 1.09361 * amount;
                    toasttext = "Metre to Yard " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Metre" && spinner2.getSelectedItem() == "Foot")
                {
                    result = 3.28084 * amount;
                    toasttext = "Metre to Foot " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Metre" && spinner2.getSelectedItem() == "Nautical Mile")
                {
                    result = 0.000539957 * amount;
                    toasttext = "Metre to Nautical Mile" + result.toString();
                    textView20.setText(toasttext);
                }

                //applying conditions from = Yard
                if(spinner.getSelectedItem() == "Yard" && spinner2.getSelectedItem() == "Mile")
                {
                    result = 0.000568182 * amount;
                    toasttext = "Yard to Mile " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Yard" && spinner2.getSelectedItem() == "Kilometer")
                {
                    result = 0.0009144 * amount;
                    toasttext = "Yard to Kilometer " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Yard" && spinner2.getSelectedItem() == "Inch")
                {
                    result = 36 * amount;
                    toasttext = "Yard to Inch " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Yard" && spinner2.getSelectedItem() == "Millimeter")
                {
                    result = 914.4 * amount;
                    toasttext = "Yard to Millimeter " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Yard" && spinner2.getSelectedItem() == "Metre")
                {
                    result = 0.9144 * amount;
                    toasttext = "Yard to Metre " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Yard" && spinner2.getSelectedItem() == "Yard")
                {
                    toasttext = "Abe lockdown me bavla ho gayo hai ke";
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Yard" && spinner2.getSelectedItem() == "Foot")
                {
                    result = 3 * amount;
                    toasttext = "Yard to Foot " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Yard" && spinner2.getSelectedItem() == "Nautical Mile")
                {
                    result = 0.000493737 * amount;
                    toasttext = "Yard to Nautical Mile" + result.toString();
                    textView20.setText(toasttext);
                }

                //applying conditions from = Foot
                if(spinner.getSelectedItem() == "Foot" && spinner2.getSelectedItem() == "Mile")
                {
                    result = 0.000189394 * amount;
                    toasttext = "Foot to Mile " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Foot" && spinner2.getSelectedItem() == "Kilometer")
                {
                    result = 0.0003048 * amount;
                    toasttext = "Foot to Kilometer " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Foot" && spinner2.getSelectedItem() == "Inch")
                {
                    result = 12 * amount;
                    toasttext = "Foot to Inch " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Foot" && spinner2.getSelectedItem() == "Millimeter")
                {
                    result = 304.8 * amount;
                    toasttext = "Foot to Millimeter " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Foot" && spinner2.getSelectedItem() == "Metre")
                {
                    result = 0.3048 * amount;
                    toasttext = "Foot to Metre " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Foot" && spinner2.getSelectedItem() == "Yard")
                {
                    result = 0.333333 * amount;
                    toasttext = "Foot to Yard " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Foot" && spinner2.getSelectedItem() == "Foot")
                {
                    toasttext = "Mai sahi bata ra hu ab tu maar kha jayega ";
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Foot" && spinner2.getSelectedItem() == "Nautical Mile")
                {
                    result = 0.000164579 * amount;
                    toasttext = "Foot to Nautical Mile" + result.toString();
                    textView20.setText(toasttext);
                }

                //applying conditions from = Nautical Mile
                if(spinner.getSelectedItem() == "Nautical Mile" && spinner2.getSelectedItem() == "Mile")
                {
                    result = 1.15078 * amount;
                    toasttext = "Nautical Mile to Mile " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Nautical Mile" && spinner2.getSelectedItem() == "Kilometer")
                {
                    result = 1.852 * amount;
                    toasttext = "Nautical Mile to Kilometer " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Nautical Mile" && spinner2.getSelectedItem() == "Inch")
                {
                    result = 72913.4 * amount;
                    toasttext = "Nautical Mile to Inch " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Nautical Mile" && spinner2.getSelectedItem() == "Millimeter")
                {
                    result = 1.852e+6 * amount;
                    toasttext = "Nautical Mile to Millimeter " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Nautical Mile" && spinner2.getSelectedItem() == "Metre")
                {
                    result = 1852 * amount;
                    toasttext = "Nautical Mile to Metre " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Nautical Mile" && spinner2.getSelectedItem() == "Yard")
                {
                    result = 2025.37 * amount;
                    toasttext = "Nautical Mile to Yard " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Nautical Mile" && spinner2.getSelectedItem() == "Foot")
                {
                    result = 6076.12 * amount;
                    toasttext = "Nautical Mile to Foot " + result.toString();
                    textView20.setText(toasttext);
                }
                if(spinner.getSelectedItem() == "Nautical Mile" && spinner2.getSelectedItem() == "Nautical Mile")
                {
                    toasttext = "He bhagvaan utha le re isko";
                    textView20.setText(toasttext);
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
