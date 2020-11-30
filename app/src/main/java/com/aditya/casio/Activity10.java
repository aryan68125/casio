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


public class Activity10 extends AppCompatActivity {

    //initializing all the widgets
    TextView textView8;
    EditText editText19;
    Spinner spinner;
    Spinner spinner2;
    Button button20;
    String Tag = "Activity10";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);
        Log.i(Tag, "--on create--");

        //binding all the widgets to the activity code from the user interface xml file
        textView8 = findViewById(R.id.output18);
        editText19 = findViewById(R.id.Input8);
        spinner = findViewById(R.id.inputspinner3);
        spinner2 = findViewById(R.id.outputspinner4);
        button20 = findViewById(R.id.convert8);

        //setting up spinner item array that will be displayed inside the spinner
        String[] from = {"Newton", "Kilo newton", "Gram-force", "Kilogram-force", "Ton-force", "Giga newton", "Mega newton"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, R.layout.row, from);
        spinner.setAdapter(ad); //input spinner

        String[] to = {"Newton", "Kilo newton", "Gram-force", "Kilogram-force", "Ton-force", "Giga newton", "Mega newton"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, R.layout.row, to);
        spinner2.setAdapter(ad1); //output spinner

        //setting up onclickListener on button
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Double result;
                    String toasttext;
                    Double amount = Double.parseDouble(editText19.getText().toString());

                    //applying conditions for = Newton
                    if (spinner.getSelectedItem() == "Newton" && spinner2.getSelectedItem() == "Newton") {
                        toasttext = "Abe bin bijili ke khambe dekh ke fir convert kar na";
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Newton" && spinner2.getSelectedItem() == "Kilo newton") {
                        result = 0.001 * amount;
                        toasttext = "Newton to Kilo newton " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Newton" && spinner2.getSelectedItem() == "Gram-force") {
                        result = 101.9716213 * amount;
                        toasttext = "Newton to Gram-force " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Newton" && spinner2.getSelectedItem() == "Kilogram-force") {
                        result = 0.1019716213 * amount;
                        toasttext = "Newton to Kilogram-force " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Newton" && spinner2.getSelectedItem() == "Ton-force") {
                        result = 0.0001019716213 * amount;
                        toasttext = "Newton to Ton-force " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Newton" && spinner2.getSelectedItem() == "Giga newton") {
                        result = 1e-9 * amount;
                        toasttext = "Newton to Giga newton " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Newton" && spinner2.getSelectedItem() == "Mega newton") {
                        result = 1e-6 * amount;
                        toasttext = "Newton to Mega newton " + result.toString();
                        textView8.setText(toasttext);
                    }

                    //applying conditions from = Kilo newton
                    if (spinner.getSelectedItem() == "Kilo newton" && spinner2.getSelectedItem() == "Newton") {
                        result = 1000 * amount;
                        toasttext = "Kilo newton to Newton " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Kilo newton" && spinner2.getSelectedItem() == "Kilo newton") {
                        toasttext = "Beta tumse na ho payga ";
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Kilo newton" && spinner2.getSelectedItem() == "Gram-force") {
                        result = 101971.6213 * amount;
                        toasttext = "Kilo newton to Gram-force " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Kilo newton" && spinner2.getSelectedItem() == "Kilogram-force") {
                        result = 101.9716213 * amount;
                        toasttext = "Kilo newton to Kilogram-force " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Kilo newton" && spinner2.getSelectedItem() == "Ton-force") {
                        result = 0.1019716213 * amount;
                        toasttext = "Kilo newton to Ton-force " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Kilo newton" && spinner2.getSelectedItem() == "Giga newton") {
                        result = 1e-6 * amount;
                        toasttext = "Kilo newton to Giga newton " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Kilo newton" && spinner2.getSelectedItem() == "Mega newton") {
                        result = 0.001 * amount;
                        toasttext = "Kilo newton to Mega newton " + result.toString();
                        textView8.setText(toasttext);
                    }

                    //applying conditions from = Gram-force
                    if (spinner.getSelectedItem() == "Gram-force" && spinner2.getSelectedItem() == "Newton") {
                        result = 0.00980665 * amount;
                        toasttext = "Gram-force to Newton " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Gram-force" && spinner2.getSelectedItem() == "Kilo newton") {
                        result = 0.0000098067 * amount;
                        toasttext = "Gram-force to Kilo newton " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Gram-force" && spinner2.getSelectedItem() == "Gram-force") {
                        toasttext = "Abe yr gajab aadmi ho yr tum";
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Gram-force" && spinner2.getSelectedItem() == "Kilogram-force") {
                        result = 0.001 * amount;
                        toasttext = "Gram-force to Kilogram-force " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Gram-force" && spinner2.getSelectedItem() == "Ton-force") {
                        result = 1e-6 * amount;
                        toasttext = "Gram-force to Ton-force " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Gram-force" && spinner2.getSelectedItem() == "Giga newton") {
                        result = 9.80665e-12 * amount;
                        toasttext = "Gram-force to Giga newton " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Gram-force" && spinner2.getSelectedItem() == "Mega newton") {
                        result = 9.80665e-9 * amount;
                        toasttext = "Gram-force to Mega newton " + result.toString();
                        textView8.setText(toasttext);
                    }

                    //applying conditions from = Kilogram-force
                    if (spinner.getSelectedItem() == "Kilogram-force" && spinner2.getSelectedItem() == "Newton") {
                        result = 9.80665 * amount;
                        toasttext = "Kilogram-force to Newton " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Kilogram-force" && spinner2.getSelectedItem() == "Kilo newton") {
                        result = 0.00980665 * amount;
                        toasttext = "Kilogram-force to Kilo newton " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Kilogram-force" && spinner2.getSelectedItem() == "Gram-force") {
                        result = 1000 * amount;
                        toasttext = "Kilogram-force to Gram-force " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Kilogram-force" && spinner2.getSelectedItem() == "Kilogram-force") {
                        toasttext = "Kon hai ye LOG kaha se aate hai";
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Kilogram-force" && spinner2.getSelectedItem() == "Ton-force") {
                        result = 0.001 * amount;
                        toasttext = "Kilogram-force to Ton-force " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Kilogram-force" && spinner2.getSelectedItem() == "Giga newton") {
                        result = 9.80665e-9 * amount;
                        toasttext = "Kilogram-force to Giga newton " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Kilogram-force" && spinner2.getSelectedItem() == "Mega newton") {
                        result = 9.80665e-6 * amount;
                        toasttext = "Kilogram-force to Mega newton " + result.toString();
                        textView8.setText(toasttext);
                    }

                    //applying conditions from = Ton-force
                    if (spinner.getSelectedItem() == "Ton-force" && spinner2.getSelectedItem() == "Newton") {
                        result = 9806.65 * amount;
                        toasttext = "Ton-force to Newton " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Ton-force" && spinner2.getSelectedItem() == "Kilo newton") {
                        result = 9.80665 * amount;
                        toasttext = "Ton-force to Kilo newton " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Ton-force" && spinner2.getSelectedItem() == "Gram-force") {
                        result = 1e+6 * amount;
                        toasttext = "Ton-force to Gram-force " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Ton-force" && spinner2.getSelectedItem() == "Kilogram-force") {
                        result = 1000 * amount;
                        toasttext = "Ton-force to Kilogram-force " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Ton-force" && spinner2.getSelectedItem() == "Ton-force") {
                        toasttext = "OK....Time to leave earth...";
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Ton-force" && spinner2.getSelectedItem() == "Giga newton") {
                        result = 9.8067e-6 * amount;
                        toasttext = "Ton-force to Giga newton " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Ton-force" && spinner2.getSelectedItem() == "Mega newton") {
                        result = 0.00980665 * amount;
                        toasttext = "Ton-force to Mega newton " + result.toString();
                        textView8.setText(toasttext);
                    }

                    //applying conditions from = Giga newton
                    if (spinner.getSelectedItem() == "Giga newton" && spinner2.getSelectedItem() == "Newton") {
                        result = 1e+9 * amount;
                        toasttext = "Giga newton to Newton " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Giga newton" && spinner2.getSelectedItem() == "Kilo newton") {
                        result = 1e+6 * amount;
                        toasttext = "Giga newton to Kilo newton " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Giga newton" && spinner2.getSelectedItem() == "Gram-force") {
                        result = 1.01971621e+11 * amount;
                        toasttext = "Giga newton to Gram-force " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Giga newton" && spinner2.getSelectedItem() == "Kilogram-force") {
                        result = 101971621.3 * amount;
                        toasttext = "Giga newton to Kilogram-force " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Giga newton" && spinner2.getSelectedItem() == "Ton-force") {
                        result = 101971.6213 * amount;
                        toasttext = "Giga newton to Ton-force " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Giga newton" && spinner2.getSelectedItem() == "Giga newton") {
                        toasttext = "You know..your stupidity is contagious just like COVID19..stay at home for christ sake";
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Giga newton" && spinner2.getSelectedItem() == "Mega newton") {
                        result = 1000 * amount;
                        toasttext = "Giga newton to Mega newton " + result.toString();
                        textView8.setText(toasttext);
                    }

                    //applying conditions from = Mega newton
                    if (spinner.getSelectedItem() == "Mega newton" && spinner2.getSelectedItem() == "Newton") {
                        result = 1e+6 * amount;
                        toasttext = "Mega newton to Newton " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Mega newton" && spinner2.getSelectedItem() == "Kilo newton") {
                        result = 1000 * amount;
                        toasttext = "Mega newton to Kilo newton " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Mega newton" && spinner2.getSelectedItem() == "Gram-force") {
                        result = 101971621.3 * amount;
                        toasttext = "Mega newton to Gram-force " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Mega newton" && spinner2.getSelectedItem() == "Kilogram-force") {
                        result = 101971.6213 * amount;
                        toasttext = "Mega newton to Kilogram-force " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Mega newton" && spinner2.getSelectedItem() == "Ton-force") {
                        result = 101.9716213 * amount;
                        toasttext = "Mega newton to Ton-force " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Mega newton" && spinner2.getSelectedItem() == "Giga newton") {
                        result = 0.001 * amount;
                        toasttext = "Mega newton to Giga newton " + result.toString();
                        textView8.setText(toasttext);
                    }
                    if (spinner.getSelectedItem() == "Mega newton" && spinner2.getSelectedItem() == "Mega newton") {
                        toasttext = "Mai sahi bata ra hu ab tu maar kha jayega ";
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
