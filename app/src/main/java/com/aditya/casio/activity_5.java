package com.aditya.casio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
public class activity_5 extends AppCompatActivity {
    TextView textView15;
    TextView textView16;
    public void clk1(View view){
        EditText textView12 = (EditText) findViewById(R.id.textView12);
        String a = textView12.getText().toString();
        Double doublea = Double.parseDouble(a);

        EditText textView13 = (EditText) findViewById(R.id.textView13);
        String b = textView13.getText().toString();
        Double doubleb = Double.parseDouble(b);

        EditText textView14 = (EditText) findViewById(R.id.textView14);
        String c = textView14.getText().toString();
        Double doublec = Double.parseDouble(c);

        Double doubled = (doubleb * doubleb) - (4 * doublea * doublec); //discriminant
        if(doubled<0)
        {
            Double doublealpha1 = (-doubleb/(2 * doublea));
            Double doublebeta1 = Math.sqrt(-doubled/(2 * doublea));
            String toasttext = "Root1 " + doublealpha1.toString() + " + "  + " i" + doublebeta1.toString();
            textView15.setText(toasttext);
            String toasttext2 = "Root2 " + doublealpha1.toString() + " - " + " i" + doublebeta1.toString();
            textView16.setText(toasttext2);
        }
        else if(doubled == 0)
        {
            Double doubleroot0 = (-doubleb)/(2 * doublea);
            String toasttext = "Root1 " + doubleroot0.toString();
            textView15.setText(toasttext);
            String toasttext2 = "Root2 " + doubleroot0.toString();
            textView16.setText(toasttext2);
        }
        else
        {
            Double doubleroot3 = (-doubleb + Math.sqrt(doubled))/(2 * doublea);
            Double doubleroot4 = (-doubleb - Math.sqrt(doubled))/(2 * doublea);
            String toasttext = "Root1 " + doubleroot3.toString();
            textView15.setText(toasttext);
            String toasttext2 = "Root2 " + doubleroot4.toString();
            textView16.setText(toasttext2);
        }
    }
    String Tag = "activity_5";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        Log.i(Tag, "--on create--");
        textView15 = (TextView) findViewById(R.id.textView15);
        textView16 = (TextView) findViewById(R.id.textView16);
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
