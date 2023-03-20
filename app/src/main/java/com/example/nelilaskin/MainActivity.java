package com.example.nelilaskin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numberInput1;
    private EditText numberInput2;
    private TextView numberOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput1 = findViewById(R.id.numberInput1);
        numberInput2 = findViewById(R.id.numberInput2);
        numberOutput = findViewById(R.id.numberOutput);
    }

    public void calculateSum (View view){
        int a = Integer.parseInt(numberInput1.getText().toString());
        int b = Integer.parseInt(numberInput2.getText().toString());
        int result = a + b;
        this.printResult(result);
    }

    public void calculateDifference (View view){
        int a = Integer.parseInt(numberInput1.getText().toString());
        int b = Integer.parseInt(numberInput2.getText().toString());
        int result = a - b;
        this.printResult(result);
    }

    public void calculateMultiplication (View view){
        int a = Integer.parseInt(numberInput1.getText().toString());
        int b = Integer.parseInt(numberInput2.getText().toString());
        int result = a * b;
        this.printResult(result);
    }

    public void calculateDivision (View view){
        int a = Integer.parseInt(numberInput1.getText().toString());
        int b = Integer.parseInt(numberInput2.getText().toString());
        int result = a / b;
        this.printResult(result);
    }

    public void printResult(Integer result){

        numberOutput.setText(result.toString());
    }
}