package com.aditya.casio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {
    TextView textView11;
    ImageView imageView;
    public void clk1(View view){
        EditText textView10 = (EditText) findViewById(R.id.textView10);
        String dollar = textView10.getText().toString();
        Double doubledollar = Double.parseDouble(dollar);
        Double doublerupees = 71.72 * doubledollar;
        String toasttext = "$ to rs. = " + doublerupees.toString();
        textView11.setText(toasttext);
        imageView.setImageResource(R.drawable.inr);
    }

    public void clk2(View view){
        EditText textView10 = (EditText) findViewById(R.id.textView10);
        String dollar = textView10.getText().toString();
        Double doubledollar = Double.parseDouble(dollar);
        Double doublerupees = 0.01 * doubledollar;
        String toasttext = "rs. to $ = " + doublerupees.toString();
        textView11.setText(toasttext);
        imageView.setImageResource(R.drawable.usd);
    }

    String Tag = "Activity4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        Log.i(Tag, "--on create--");
        textView11 = (TextView) findViewById(R.id.textView11);
        imageView = findViewById(R.id.imageView);
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
