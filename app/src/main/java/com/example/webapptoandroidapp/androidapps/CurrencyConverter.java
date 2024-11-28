package com.example.webapptoandroidapp.androidapps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.webapptoandroidapp.R;

public class CurrencyConverter extends AppCompatActivity {
    private final double USD_TO_PHP = 55.0; // Example conversion rate

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.currencyconverter);

        EditText usdInput = findViewById(R.id.usdInput);
        Button convertButton = findViewById(R.id.convertButton);
        TextView resultTextView = findViewById(R.id.resultTextView);

        convertButton.setOnClickListener(v -> {
            try {
                double usd = Double.parseDouble(usdInput.getText().toString());
                double php = usd * USD_TO_PHP;
                resultTextView.setText("PHP: " + php);
            } catch (NumberFormatException e) {
                resultTextView.setText("Please enter a valid amount.");
            }
        });
    }
}
