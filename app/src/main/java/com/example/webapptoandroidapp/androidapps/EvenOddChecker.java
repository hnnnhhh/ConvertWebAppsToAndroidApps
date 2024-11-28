package com.example.webapptoandroidapp.androidapps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.webapptoandroidapp.R;

public class EvenOddChecker extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evenoddchecker);

        EditText numberEditText = findViewById(R.id.numberEditText);
        Button checkButton = findViewById(R.id.checkButton);
        TextView resultTextView = findViewById(R.id.resultTextView);

        checkButton.setOnClickListener(v -> {
            String input = numberEditText.getText().toString();
            if (!input.isEmpty()) {
                int number = Integer.parseInt(input);
                if (number % 2 == 0) {
                    resultTextView.setText(number + " is Even");
                } else {
                    resultTextView.setText(number + " is Odd");
                }
            } else {
                resultTextView.setText("Please enter a valid number.");
            }
        });
    }
}
