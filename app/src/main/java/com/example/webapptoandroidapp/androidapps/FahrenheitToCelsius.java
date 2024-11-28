package com.example.webapptoandroidapp.androidapps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.webapptoandroidapp.R;

public class FahrenheitToCelsius extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fahrenheittocelsius);

        EditText fahrenheitEditText = findViewById(R.id.fahrenheitEditText);
        Button convertButton = findViewById(R.id.convertButton);
        TextView resultTextView = findViewById(R.id.resultTextView);

        convertButton.setOnClickListener(v -> {
            String input = fahrenheitEditText.getText().toString();
            if (!input.isEmpty()) {
                double fahrenheit = Double.parseDouble(input);
                double celsius = (fahrenheit - 32) * 5 / 9;
                resultTextView.setText("Celsius: " + celsius);
            } else {
                resultTextView.setText("Please enter a valid temperature.");
            }
        });
    }
}