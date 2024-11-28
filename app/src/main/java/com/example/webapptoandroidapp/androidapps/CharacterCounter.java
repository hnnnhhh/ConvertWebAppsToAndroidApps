package com.example.webapptoandroidapp.androidapps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.webapptoandroidapp.R;

public class CharacterCounter extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.charactercounter);

        EditText inputEditText = findViewById(R.id.inputEditText);
        Button countButton = findViewById(R.id.countButton);
        TextView resultTextView = findViewById(R.id.resultTextView);

        countButton.setOnClickListener(v -> {
            String input = inputEditText.getText().toString();
            resultTextView.setText("Character Count: " + input.length());
        });
    }
}