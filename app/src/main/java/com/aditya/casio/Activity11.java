package com.aditya.casio;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.icu.text.DecimalFormat;
import android.view.View;
import com.aditya.casio.databinding.Activity11Binding;

public class Activity11 extends AppCompatActivity {
    private Activity11Binding binding; //step two of gradle data binding method

    // the variables below will hold the value of the entered number on which we want to perform the operations
    private double valueOne = Double.NaN; //Double Nan is a Not a number
    private double valueTwo;
    private double result;

    //defining the operations that this calculator will be able to perform
    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';

    //CURRENT_ACTION variable holds the next operation we intend to perform.
    private char CURRENT_ACTION;

    DecimalFormat decimalFormat; //instanciating decimal format class

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_11); //step 3 of using gradle data binding method

        decimalFormat = new DecimalFormat("#.##########"); //setting up how the decimal numbers are to be shown

        //Whenever the user clicks a number (or dot),
        // we simply want to add that number to the editText.
        // The code sample below shows how we accomplish this for number zero (0).
        //handling clicks on number buttons
        //setting up onclick listener on button 0
        binding.buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "0");
            }
        });
        //setting up onclick listener on button 1
        binding.buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "1");
            }
        });
        //setting up onclick listener on button 2
        binding.buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "2");
            }
        });
        //setting up onclick listener on button 3
        binding.buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "3");
            }
        });
        //setting up onclick listener on button 4
        binding.buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "4");
            }
        });
        //setting up onclick listener on button 5
        binding.buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "5");
            }
        });
        //setting up onclick listener on button 6
        binding.buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "6");
            }
        });
        //setting up onclick listener on button 7
        binding.buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "7");
            }
        });
        //setting up onclick listener on button 8
        binding.buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "8");
            }
        });
        //setting up onclick listener on button 9
        binding.buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "9");
            }
        });
        //setting up onclick listener on button Dot
        binding.buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + ".");
            }
        });

//..................................................................................................

        //setting up the onclick listeners on the operations buttons of the calculator
        binding.buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = ADDITION; //char value that has been declared above '+'
                binding.infoTextView.setText(decimalFormat.format(valueOne) + "+");
                binding.editText.setText(null);
            }
        });

        binding.buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = SUBTRACTION; //char value that has been declared above '-'
                binding.infoTextView.setText(decimalFormat.format(valueOne) + "-");
                binding.editText.setText(null);
            }
        });

        binding.buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = MULTIPLICATION; //char value that has been declared above '*'
                binding.infoTextView.setText(decimalFormat.format(valueOne) + "*");
                binding.editText.setText(null);
            }
        });

        binding.buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = DIVISION; //char value that has been declared above '/'
                binding.infoTextView.setText(decimalFormat.format(valueOne) + "/");
                binding.editText.setText(null);
            }
        });

        // setting up the onclick listener on the equal to button
        binding.buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                binding.infoTextView.setText(binding.infoTextView.getText().toString() +
                        decimalFormat.format(valueTwo) + " = " + decimalFormat.format(result));
                valueOne = Double.NaN;
                CURRENT_ACTION = '0';
            }
        });

        //setting up the clear button onclicklistener
        binding.buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(null);
                binding.infoTextView.setText(null);
                CURRENT_ACTION = '0';
            }
        });

        //setting up the Answer button
        binding.buttonAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(result +""); //setText(result + "") is necessary dont write it like
                //setText((int) result) the program will crash
                CURRENT_ACTION = '0';
            }
        });

    }// protected void oncreate closed

    //handling clicks on Operation buttons +,-,*,/
    //first compute any pending calculations first in order to do that
    //define a computeCalculation method
    private void computeCalculation() {
        if(!Double.isNaN(valueOne)) //if valueOne not NaN
        //if valueOne is a valid number
        //we read valueTwo from the editText
        //and perform the current queued operation
        {
            valueTwo = Double.parseDouble(binding.editText.getText().toString()); //we read valueTwo from the editText
            binding.editText.setText(null); //setting up the edit Text as null after the operation is complete

            if(CURRENT_ACTION == ADDITION) //and perform the current queued operation
                result = this.valueOne + valueTwo;
            else if(CURRENT_ACTION == SUBTRACTION)
                result = this.valueOne - valueTwo;
            else if(CURRENT_ACTION == MULTIPLICATION)
                result = this.valueOne * valueTwo;
            else if(CURRENT_ACTION == DIVISION)
                result = this.valueOne / valueTwo;
        }
        else //On the other hand, if valueOne is NaN, valueOne assigned the number in the editText
        {
            try {
                valueOne = Double.parseDouble(binding.editText.getText().toString());
            }
            catch (Exception e){}
        }
    }//private void computeCalculation() closed

}//main activity close