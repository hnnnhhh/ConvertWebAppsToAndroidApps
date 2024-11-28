package com.example.webapptoandroidapp.androidapps;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.webapptoandroidapp.R;


public class PalindromeChecker extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.palindromechecker);

        EditText wordEditText = findViewById(R.id.wordEditText);
        Button checkButton = findViewById(R.id.checkButton);
        TextView resultTextView = findViewById(R.id.resultTextView);

        checkButton.setOnClickListener(v -> {
            String word = wordEditText.getText().toString();
            if (!word.isEmpty()) {
                String reversedWord = new StringBuilder(word).reverse().toString();
                if (word.equalsIgnoreCase(reversedWord)) {
                    resultTextView.setText(word + " is a Palindrome");
                } else {
                    resultTextView.setText(word + " is not a Palindrome");
                }
            } else {
                resultTextView.setText("Please enter a word.");
            }
        });
    }
}