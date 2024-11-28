package com.example.webapptoandroidapp.androidapps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.webapptoandroidapp.R;

public class WordReverser extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wordreverser);

        EditText wordEditText = findViewById(R.id.wordEditText);
        Button reverseButton = findViewById(R.id.reverseButton);
        TextView resultTextView = findViewById(R.id.resultTextView);

        reverseButton.setOnClickListener(v -> {
            String word = wordEditText.getText().toString();
            if (!word.isEmpty()) {
                String reversedWord = new StringBuilder(word).reverse().toString();
                resultTextView.setText("Reversed: " + reversedWord);
            } else {
                resultTextView.setText("Please enter a word.");
            }
        });
    }
}