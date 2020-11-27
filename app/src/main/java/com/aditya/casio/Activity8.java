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


public class Activity8 extends AppCompatActivity {

    //initializing all the widgets
    TextView textView8;
    EditText editText19;
    Spinner spinner;
    Spinner spinner2;
    Button button20;
    String Tag = "Activity8";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);
        Log.i(Tag, "--on create--");

        //binding all the widgets to the activity code from the user interface xml file
        textView8 = findViewById(R.id.output);
        editText19 = findViewById(R.id.Input1);
        spinner = findViewById(R.id.spinner7);
        spinner2 = findViewById(R.id.spinner8);
        button20 = findViewById(R.id.convert);

        //setting up spinner item array that will be displayed inside the spinner
        String[] from = {"Watt", "Kilowatt", "Megawatt", "Gigawatt", "Terawatt", "Petawatt", "Milliwatt", "HP"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, from);
        spinner.setAdapter(ad);

        String[] to = {"Watt", "Kilowatt", "Megawatt", "Gigawatt", "Terawatt", "Petawatt", "Milliwatt", "HP"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, to);
        spinner2.setAdapter(ad1);

        //setting up onclickListener on button
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Double result;
                    String toasttext;
                    Double amount = Double.parseDouble(editText19.getText().toString());

                    //applying conditions for = Watt
                    if (spinner.getSelectedItem() == "Watt" && spinner2.getSelectedItem() == "Watt") {
                        toasttext = "Abe bin bijili ke khambe dekh ke fir convert kar na";
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Watt" && spinner2.getSelectedItem() == "Kilowatt") {
                        result = 0.001 * amount;
                        toasttext = "Watt to Kilowatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Watt" && spinner2.getSelectedItem() == "Megawatt") {
                        result = 1e-6 * amount;
                        toasttext = "Watt to Megawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Watt" && spinner2.getSelectedItem() == "Gigawatt") {
                        result = 1e-9 * amount;
                        toasttext = "Watt to Gigawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Watt" && spinner2.getSelectedItem() == "Terawatt") {
                        result = 1e-12 * amount;
                        toasttext = "Watt to Terawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Watt" && spinner2.getSelectedItem() == "Petawatt") {
                        result = 1e-15 * amount;
                        toasttext = "Watt to Petawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Watt" && spinner2.getSelectedItem() == "Milliwatt") {
                        result = 1000 * amount;
                        toasttext = "Watt to Milliwatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Watt" && spinner2.getSelectedItem() == "HP") {
                        result = 0.0013596216 * amount;
                        toasttext = "Watt to HP " + result.toString();
                        textView8.setText(toasttext);
                    }

                    //applying conditions from = Kilowatt
                    if (spinner.getSelectedItem() == "Kilowatt" && spinner2.getSelectedItem() == "Watt") {
                        result = 1000 * amount;
                        toasttext = "Kilowatt to Watt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Kilowatt" && spinner2.getSelectedItem() == "Kilowatt") {
                        toasttext = "Beta tumse na ho payga ";
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Kilowatt" && spinner2.getSelectedItem() == "Megawatt") {
                        result = 0.001 * amount;
                        toasttext = "Kilowatt to Megawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Kilowatt" && spinner2.getSelectedItem() == "Gigawatt") {
                        result = 1e-6 * amount;
                        toasttext = "Kilowatt to Gigawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Kilowatt" && spinner2.getSelectedItem() == "Terawatt") {
                        result = 1e-9 * amount;
                        toasttext = "Kilowatt to Terawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Kilowatt" && spinner2.getSelectedItem() == "Petawatt") {
                        result = 1e-12 * amount;
                        toasttext = "Kilowatt to Petawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Kilowatt" && spinner2.getSelectedItem() == "Milliwatt") {
                        result = 1e+6 * amount;
                        toasttext = "Kilowatt to Milliwatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Kilowatt" && spinner2.getSelectedItem() == "HP") {
                        result = 1.3596216173 * amount;
                        toasttext = "Kilowatt to HP " + result.toString();
                        textView8.setText(toasttext);
                    }

                    //applying conditions from = Megawatt
                    if (spinner.getSelectedItem() == "Megawatt" && spinner2.getSelectedItem() == "Watt") {
                        result = 1e+6 * amount;
                        toasttext = "Megawatt to Watt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Megawatt" && spinner2.getSelectedItem() == "Kilowatt") {
                        result = 1000 * amount;
                        toasttext = "Megawatt to Kilowatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Megawatt" && spinner2.getSelectedItem() == "Megawatt") {
                        toasttext = "Abe yr gajab aadmi ho yr tum";
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Megawatt" && spinner2.getSelectedItem() == "Gigawatt") {
                        result = 0.001 * amount;
                        toasttext = "Megawatt to Gigawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Megawatt" && spinner2.getSelectedItem() == "Terawatt") {
                        result = 1e-6 * amount;
                        toasttext = "Megawatt to Terawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Megawatt" && spinner2.getSelectedItem() == "Petawatt") {
                        result = 1e-9 * amount;
                        toasttext = "Megawatt to Petawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Megawatt" && spinner2.getSelectedItem() == "Milliwatt") {
                        result = 1e+9 * amount;
                        toasttext = "Megawatt to Milliwatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Megawatt" && spinner2.getSelectedItem() == "HP") {
                        result = 1359.6216173 * amount;
                        toasttext = "Megawatt to HP" + result.toString();
                        textView8.setText(toasttext);
                    }

                    //applying conditions from = Gigawatt
                    if (spinner.getSelectedItem() == "Gigawatt" && spinner2.getSelectedItem() == "Watt") {
                        result = 1e+9 * amount;
                        toasttext = "Gigawatt to Watt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Gigawatt" && spinner2.getSelectedItem() == "Kilowatt") {
                        result = 1e+6 * amount;
                        toasttext = "Gigawatt to Kilowatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Gigawatt" && spinner2.getSelectedItem() == "Megawatt") {
                        result = 1000 * amount;
                        toasttext = "Gigawatt to Megawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Gigawatt" && spinner2.getSelectedItem() == "Gigawatt") {
                        toasttext = "Kon hai ye LOG kaha se aate hai";
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Gigawatt" && spinner2.getSelectedItem() == "Terawatt") {
                        result = 0.001 * amount;
                        toasttext = "Gigawatt to Terawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Gigawatt" && spinner2.getSelectedItem() == "Petawatt") {
                        result = 1e-5 * amount;
                        toasttext = "Gigawatt to Petawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Gigawatt" && spinner2.getSelectedItem() == "Milliwatt") {
                        result = 1e+12 * amount;
                        toasttext = "Gigawatt to Milliwatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Gigawatt" && spinner2.getSelectedItem() == "HP") {
                        result = 1359621.6173 * amount;
                        toasttext = "Gigawatt to HP" + result.toString();
                        textView8.setText(toasttext);
                    }

                    //applying conditions from = Terawatt
                    if (spinner.getSelectedItem() == "Terawatt" && spinner2.getSelectedItem() == "Watt") {
                        result = 1e+12 * amount;
                        toasttext = "Terawatt to Watt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Terawatt" && spinner2.getSelectedItem() == "Kilowatt") {
                        result = 1e+9 * amount;
                        toasttext = "Terawatt to Kilowatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Terawatt" && spinner2.getSelectedItem() == "Megawatt") {
                        result = 1e+6 * amount;
                        toasttext = "Terawatt to Megawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Terawatt" && spinner2.getSelectedItem() == "Gigawatt") {
                        result = 1000 * amount;
                        toasttext = "Terawatt to Gigawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Terawatt" && spinner2.getSelectedItem() == "Terawatt") {
                        toasttext = "OK....Time to leave earth...";
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Terawatt" && spinner2.getSelectedItem() == "Petawatt") {
                        result = 0.001 * amount;
                        toasttext = "Terawatt to Petawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Terawatt" && spinner2.getSelectedItem() == "Milliwatt") {
                        result = 1e+15 * amount;
                        toasttext = "Terawatt to Milliwatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Terawatt" && spinner2.getSelectedItem() == "HP") {
                        result = 1359621617.3 * amount;
                        toasttext = "Terawatt to HP" + result.toString();
                        textView8.setText(toasttext);
                    }

                    //applying conditions from = Petawatt
                    if (spinner.getSelectedItem() == "Petawatt" && spinner2.getSelectedItem() == "Watt") {
                        result = 1e+15 * amount;
                        toasttext = "Petawatt to Watt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Petawatt" && spinner2.getSelectedItem() == "Kilowatt") {
                        result = 1e+12 * amount;
                        toasttext = "Petawatt to Kilowatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Petawatt" && spinner2.getSelectedItem() == "Megawatt") {
                        result = 1e+9 * amount;
                        toasttext = "Petawatt to Megawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Petawatt" && spinner2.getSelectedItem() == "Gigawatt") {
                        result = 1e+6 * amount;
                        toasttext = "Petawatt to Gigawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Petawatt" && spinner2.getSelectedItem() == "Terawatt") {
                        result = 1000 * amount;
                        toasttext = "Petawatt to Terawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Petawatt" && spinner2.getSelectedItem() == "Petawatt") {
                        toasttext = "You know..your stupidity is contagious just like COVID19..stay at home for christ sake";
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Petawatt" && spinner2.getSelectedItem() == "Milliwatt") {
                        result = 1e+18 * amount;
                        toasttext = "Petawatt to Milliwatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Petawatt" && spinner2.getSelectedItem() == "HP") {
                        result = 135962161e+4 * amount;
                        toasttext = "Petawatt to HP" + result.toString();
                        textView8.setText(toasttext);
                    }

                    //applying conditions from = Milliwatt
                    if (spinner.getSelectedItem() == "Milliwatt" && spinner2.getSelectedItem() == "Watt") {
                        result = 0.001 * amount;
                        toasttext = "Milliwatt to Watt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Milliwatt" && spinner2.getSelectedItem() == "Kilowatt") {
                        result = 1e-5 * amount;
                        toasttext = "Milliwatt to Kilowatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Milliwatt" && spinner2.getSelectedItem() == "Megawatt") {
                        result = 1e-9 * amount;
                        toasttext = "Milliwatt to Megawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Milliwatt" && spinner2.getSelectedItem() == "Gigawatt") {
                        result = 1e-12 * amount;
                        toasttext = "Milliwatt to Gigawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Milliwatt" && spinner2.getSelectedItem() == "Terawatt") {
                        result = 1e-15 * amount;
                        toasttext = "Milliwatt to Terawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Milliwatt" && spinner2.getSelectedItem() == "Petawatt") {
                        result = 1e-18 * amount;
                        toasttext = "Milliwatt to Petawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Milliwatt" && spinner2.getSelectedItem() == "Milliwatt") {
                        toasttext = "Mai sahi bata ra hu ab tu maar kha jayega ";
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Milliwatt" && spinner2.getSelectedItem() == "HP") {
                        result = 1.3596e-6 * amount;
                        toasttext = "Milliwatt to HP" + result.toString();
                        textView8.setText(toasttext);
                    }

                    //applying conditions from = HP
                    if (spinner.getSelectedItem() == "HP" && spinner2.getSelectedItem() == "Watt") {
                        result = 735.4987 * amount;
                        toasttext = "HP to Watt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "HP" && spinner2.getSelectedItem() == "Kilowatt") {
                        result = 0.7354987 * amount;
                        toasttext = "HP to Kilowatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "HP" && spinner2.getSelectedItem() == "Megawatt") {
                        result = 7.35498e-4 * amount;
                        toasttext = "HP to Megawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "HP" && spinner2.getSelectedItem() == "Gigawatt") {
                        result = 7.35498e-7 * amount;
                        toasttext = "HP to Gigawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "HP" && spinner2.getSelectedItem() == "Terawatt") {
                        result = 7.35498e-10 * amount;
                        toasttext = "HP to Terawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "HP" && spinner2.getSelectedItem() == "Petawatt") {
                        result = 7.35498e-13 * amount;
                        toasttext = "HP to Petawatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "HP" && spinner2.getSelectedItem() == "Milliwatt") {
                        result = 735498.75 * amount;
                        toasttext = "HP to Milliwatt " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "HP" && spinner2.getSelectedItem() == "HP") {
                        toasttext = "He bhagvaan utha le re isko";
                        textView8.setText(toasttext);
                    }
                }
                catch (Exception e)
                {
                    String messege="Input Field is Empty";
                    textView8.setText(messege);
                }
                /*
                   we will use try and catch to handel any unexpected errors in our application so that if something gos wrong our application does not crash
                   instead it can still function as normal with an error message like hey this is what went wrong to notify the user
                   try{
                     //the code here which you know might cause problem under a certain scenario
                     }
                     catch (Exception e)
                     {
                     //error message that you want to display to the user
                     }
                 */
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
