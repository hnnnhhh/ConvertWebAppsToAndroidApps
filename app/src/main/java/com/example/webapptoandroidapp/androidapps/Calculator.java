package com.example.webapptoandroidapp.androidapps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.webapptoandroidapp.R;

public class Calculator extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        EditText number1EditText = findViewById(R.id.number1EditText);
        EditText number2EditText = findViewById(R.id.number2EditText);
        Button addButton = findViewById(R.id.addButton);
        Button subtractButton = findViewById(R.id.subtractButton);
        Button multiplyButton = findViewById(R.id.multiplyButton);
        Button divideButton = findViewById(R.id.divideButton);
        TextView resultTextView = findViewById(R.id.resultTextView);

        addButton.setOnClickListener(v -> {
            calculate(number1EditText, number2EditText, resultTextView, '+');
        });

        subtractButton.setOnClickListener(v -> {
            calculate(number1EditText, number2EditText, resultTextView, '-');
        });

        multiplyButton.setOnClickListener(v -> {
            calculate(number1EditText, number2EditText, resultTextView, '*');
        });

        divideButton.setOnClickListener(v -> {
            calculate(number1EditText, number2EditText, resultTextView, '/');
        });
    }

    private void calculate(EditText number1, EditText number2, TextView result, char operation) {
        try {
            double num1 = Double.parseDouble(number1.getText().toString());
            double num2 = Double.parseDouble(number2.getText().toString());
            double output = 0;

            switch (operation) {
                case '+': output = num1 + num2; break;
                case '-': output = num1 - num2; break;
                case '*': output = num1 * num2; break;
                case '/': output = num1 / num2; break;
            }

            result.setText("Result: " + output);
        } catch (NumberFormatException e) {
            result.setText("Please enter valid numbers.");
        }
    }
}