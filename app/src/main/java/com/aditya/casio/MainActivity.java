package com.aditya.casio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import android.widget.TextView;

//here the buttons clicked functions are dealt through java programming language (PROGRAMICAL METHOD) this method should be preferred
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    View view;
    String Tag = "Main Activity";
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(Tag, "--on create--");
        textView = findViewById(R.id.textView);
        textView.setOnClickListener(this);
        Button button6 = findViewById(R.id.six);
        Button button7 = findViewById(R.id.seven);
        Button button18 = findViewById(R.id.button18);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button18.setOnClickListener(this);

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

    @Override
    public void onClick(View view) {

        switch(view.getId())
        {
            case R.id.button:
                Intent intent = new Intent(this, Activity11.class);
                startActivity(intent);
                break;
            case R.id.six:
                Intent intent2 = new Intent(this, Activity3.class);
                startActivity(intent2);
                break;
            case R.id.seven:
                Intent intent3 = new Intent(this, Activity4.class);
                startActivity(intent3);
                break;
            case R.id.button18:
                Intent intent4 = new Intent(this, Activity12.class);
                startActivity(intent4);
                break;
            case R.id.textView:
                Intent intent6 = new Intent(this,  FragActivity.class);
                startActivity(intent6);
                break;
        }
    }
}
