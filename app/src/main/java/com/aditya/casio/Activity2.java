package com.aditya.casio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

//here the buttons clicked functions are dealt through xml files of the user interface (Don't use this method)
//try to deal with the button click functions through java (PROGRAMICALLY)
public class Activity2 extends AppCompatActivity {
    TextView textView5;
    public void clk1(View view){
        EditText textView6 = (EditText) findViewById(R.id.textView6);
        String numa = textView6.getText().toString();
        Double doublenuma = Double.parseDouble(numa);

        EditText textView7 = (EditText) findViewById(R.id.textView7);
        String numb = textView7.getText().toString();
        Double doublenumb = Double.parseDouble(numb);

        Double doubleresult = doublenuma + doublenumb ;
        String toasttext = "ADD " + doubleresult.toString();
        textView5.setText(toasttext);
    }

    public void clk2(View view){
        EditText textView6 = (EditText) findViewById(R.id.textView6);
        String numa = textView6.getText().toString();
        Double doublenuma = Double.parseDouble(numa);

        EditText textView7 = (EditText) findViewById(R.id.textView7);
        String numb = textView7.getText().toString();
        Double doublenumb = Double.parseDouble(numb);

        Double doubleresult = doublenuma - doublenumb ;
        String toasttext = "SUB " + doubleresult.toString();
        textView5.setText(toasttext);
    }

    public void clk3(View view){
        EditText textView6 = (EditText) findViewById(R.id.textView6);
        String numa = textView6.getText().toString();
        Double doublenuma = Double.parseDouble(numa);

        EditText textView7 = (EditText) findViewById(R.id.textView7);
        String numb = textView7.getText().toString();
        Double doublenumb = Double.parseDouble(numb);

        Double doubleresult = doublenuma * doublenumb ;
        String toasttext = "MUL " + doubleresult.toString();
        textView5.setText(toasttext);
    }

    public void clk4(View view){
        EditText textView6 = (EditText) findViewById(R.id.textView6);
        String numa = textView6.getText().toString();
        Double doublenuma = Double.parseDouble(numa);

        EditText textView7 = (EditText) findViewById(R.id.textView7);
        String numb = textView7.getText().toString();
        Double doublenumb = Double.parseDouble(numb);

        Double doubleresult = doublenuma / doublenumb ;
        String toasttext = "DIV " + doubleresult.toString();
        textView5.setText(toasttext);
    }

    String Tag = "Activity2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Log.i(Tag, "--on create--");
        textView5 = (TextView) findViewById(R.id.textView5);  //output textView
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
