package com.example.webapptoandroidapp.androidapps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.webapptoandroidapp.R;

public class TextLength extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textlength);

        EditText inputText = findViewById(R.id.inputText);
        Button calculateButton = findViewById(R.id.calculateButton);
        TextView resultTextView = findViewById(R.id.resultTextView);

        calculateButton.setOnClickListener(v -> {
            String text = inputText.getText().toString();
            resultTextView.setText("Length: " + text.length());
        });
    }
}