package com.example.webapptoandroidapp.androidapps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

import com.example.webapptoandroidapp.R;

public class UserAge extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userage);

        EditText yearEditText = findViewById(R.id.yearEditText);
        Button calculateButton = findViewById(R.id.calculateButton);
        TextView resultTextView = findViewById(R.id.resultTextView);

        calculateButton.setOnClickListener(v -> {
            String yearString = yearEditText.getText().toString();
            if (!yearString.isEmpty()) {
                int birthYear = Integer.parseInt(yearString);
                int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                int age = currentYear - birthYear;
                resultTextView.setText("Your age: " + age);
            } else {
                resultTextView.setText("Please enter a valid year.");
            }
        });
    }
}