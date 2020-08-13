package com.aditya.casio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    TextView textView8;
    public void clk1(View view)
    {
        EditText textView4 = (EditText) findViewById(R.id.textView4);
        String value = textView4.getText().toString();
        Double doublevalue = Double.parseDouble(value);

        Double doubleresult = doublevalue * 1.60934;
        String toasttext = "Mile to Km " + doubleresult.toString();
        textView8.setText(toasttext);
    }

    public void clk2(View view)
    {
        EditText textView4 = (EditText) findViewById(R.id.textView4);
        String value = textView4.getText().toString();
        Double doublevalue = Double.parseDouble(value);

        Double doubleresult = doublevalue * 0.621371;
        String toasttext = "Km to Miles " + doubleresult.toString();
        textView8.setText(toasttext);
    }

    public void clk3(View view)
    {
        EditText textView4 = (EditText) findViewById(R.id.textView4);
        String value = textView4.getText().toString();
        Double doublevalue = Double.parseDouble(value);

        Double doubleresult = doublevalue * 25.4;
        String toasttext = "Inch to mm " + doubleresult.toString();
        textView8.setText(toasttext);
    }

    public void clk4(View view)
    {
        EditText textView4 = (EditText) findViewById(R.id.textView4);
        String value = textView4.getText().toString();
        Double doublevalue = Double.parseDouble(value);

        Double doubleresult = doublevalue * 0.0393701;
        String toasttext = "mm to inch " + doubleresult.toString();
        textView8.setText(toasttext);
    }

    public void clk5(View view)
    {
        EditText textView4 = (EditText) findViewById(R.id.textView4);
        String value = textView4.getText().toString();
        Double doublevalue = Double.parseDouble(value);

        Double doubleresult = doublevalue * 0.453592;
        String toasttext = "pound to kg " + doubleresult.toString();
        textView8.setText(toasttext);
    }

    public void clk6(View view)
    {
        EditText textView4 = (EditText) findViewById(R.id.textView4);
        String value = textView4.getText().toString();
        Double doublevalue = Double.parseDouble(value);

        Double doubleresult = doublevalue * 2.20462;
        String toasttext = "kg to pound " + doubleresult.toString();
        textView8.setText(toasttext);
    }

    public void clk7(View view)
    {
        EditText textView4 = (EditText) findViewById(R.id.textView4);
        String value = textView4.getText().toString();
        Double doublevalue = Double.parseDouble(value);

        Double doubleresult = doublevalue * 0.7457;
        String toasttext = "hp to kw " + doubleresult.toString();
        textView8.setText(toasttext);
    }

    public void clk8(View view)
    {
        EditText textView4 = (EditText) findViewById(R.id.textView4);
        String value = textView4.getText().toString();
        Double doublevalue = Double.parseDouble(value);

        Double doubleresult = doublevalue * 1.34102;
        String toasttext = "kw to hp " + doubleresult.toString();
        textView8.setText(toasttext);
    }

    String Tag = "Activity3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Log.i(Tag, "--on create--");
        textView8 = (TextView) findViewById(R.id.textView8);
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
