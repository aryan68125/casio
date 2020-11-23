package com.aditya.casio;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.IDNA;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONArray;

public class Activity12 extends AppCompatActivity {
EditText editText;
TextView textView;
TextView textView2;
TextView Information;
private double valueOne;
private double valueTwo;
private double valueThree;
    String Tag = "Activity12";
View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_12);
        Log.i(Tag, "--on create--");
        editText = findViewById(R.id.editText223);
        textView = findViewById(R.id.root1);
        textView2 = findViewById(R.id.root2);
        Information = findViewById(R.id.information);
        Button button1 = (Button) findViewById(R.id.one);
        Button button2 = (Button) findViewById(R.id.two);
        Button button3 = (Button) findViewById(R.id.three);
        Button button4 = (Button) findViewById(R.id.four);
        Button button5 = (Button) findViewById(R.id.five);
        Button button6 = (Button) findViewById(R.id.six);
        Button button7 = (Button) findViewById(R.id.seven);
        Button button8 = (Button) findViewById(R.id.eight);
        Button button9 = (Button) findViewById(R.id.nine);
        Button button0 = (Button) findViewById(R.id.zero);
        Button buttonDot = (Button) findViewById(R.id.dot);
        Button  buttonClear = (Button) findViewById(R.id.clear);
        Button  buttonCalculate = (Button) findViewById(R.id.button23);
        final Button buttonXsq = (Button) findViewById(R.id.Xsquare);
        Button  buttonX = (Button) findViewById(R.id.X);
        Button buttonConstant = (Button) findViewById(R.id.C);
        Button buttonminus = (Button) findViewById(R.id.Minus);

        //setting up onclick Listener on buttons
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "1");

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "2");

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "3");

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "4");

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "5");

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "6");

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "7");

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "8");

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "9");

            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "0");

            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + ".");

            }
        });

        buttonminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText == null) {
                    editText.setText("");
                }
                else
                {
                    editText.setText(editText.getText() + "-");
                }

            }
        });

        //detting up onclink listener on operations button
        buttonXsq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText == null) {
                    editText.setText("");
                }
                else
                {
                    valueOne = Double.parseDouble(editText.getText().toString() + ""); //if you press button x^2 it will set valueOne
                    Information.setText(valueOne + " X^2");
                    editText.setText(null);

                }

            }
        });
        buttonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText == null) {
                    editText.setText("");
                }
                else
                {
                    valueTwo = Double.parseDouble(editText.getText().toString() + ""); //if you press button x it will set valueTwo
                    Information.setText(valueTwo + " X");
                    editText.setText(null);
                }

            }
        });
        buttonConstant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText == null) {
                    editText.setText("");
                }
                else
                {
                    valueThree = Double.parseDouble(editText.getText().toString() + ""); //if you press button Constant it will set valueThree
                    Information.setText(valueThree + " Constant");
                    editText.setText(null);
                }

            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText == null) {
                    editText.setText("");
                }
                else
                {
                    editText.setText(null);
                    Information.setText(null);
                    textView.setText(null);
                    textView2.setText(null);
                }

            }
        });

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double doublea = valueOne;
                Double doubleb = valueTwo;
                Double doublec = valueThree;
                Double doubleDiscriminant = (doubleb * doubleb) - (4 * doublea * doublec);
                if(doubleDiscriminant>0)
                {
                    Double doubleroot1 = (-doubleb + Math.sqrt(doubleDiscriminant))/ (2 * doublea);
                    Double doubleroot2 = (-doubleb - Math.sqrt(doubleDiscriminant)) / (2 * doublea);
                    String toasttext = "Root1 = " + doubleroot1.toString();
                    textView.setText(toasttext);
                    String toasttext2 = "Root2 = " + doubleroot2.toString();
                    textView2.setText(toasttext2);
                }
                else if(doubleDiscriminant == 0)
                {
                    Double doubleroot1 = (-doubleb)/(2 * doublea);
                    String toasttext = "Root1 " + doubleroot1.toString();
                    textView.setText(toasttext);
                    String toasttext2 = "Root2 " + doubleroot1.toString();
                    textView2.setText(toasttext2);
                }
                else
                {
                    Double real = -doubleb / (2 * doublea);
                    Double imagPart = Math.sqrt(-doubleDiscriminant) / (2 * doublea);
                    String doubleroot1 = real + " + " + " i " + imagPart;
                    String doubleroot2 = real + " - " + " i " + imagPart;
                    textView.setText(doubleroot1);
                    textView2.setText(doubleroot2);
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