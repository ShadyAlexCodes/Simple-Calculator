package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onInteract(View view) {
        EditText etNumberOne = (EditText) findViewById(R.id.numberOne);
        int firstNumber = Integer.parseInt(etNumberOne.getText().toString());

        EditText etNumberTwo = (EditText) findViewById(R.id.numberTwo);
        int secondNumber = Integer.parseInt(etNumberTwo.getText().toString());

        TextView finalValue = (TextView) findViewById(R.id.finalValue);

        int add = firstNumber + secondNumber;
        int subtract = firstNumber - secondNumber;
        int multiply = firstNumber * secondNumber;
        int divide = firstNumber / secondNumber;

        finalValue.setText(
                firstNumber + " + " + secondNumber + " = " + add
                        + "\n" + firstNumber + " - " + secondNumber + " = " + subtract
                        + "\n" + firstNumber + " * " + secondNumber + " = " + multiply
                        + "\n" + firstNumber + " / " + secondNumber + " = " + divide);
    }
}