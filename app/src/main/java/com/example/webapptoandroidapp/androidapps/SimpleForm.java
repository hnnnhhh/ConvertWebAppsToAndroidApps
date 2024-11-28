package com.example.webapptoandroidapp.androidapps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.webapptoandroidapp.R;

public class SimpleForm extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simpleform);

        EditText nameEditText = findViewById(R.id.nameEditText);
        EditText emailEditText = findViewById(R.id.emailEditText);
        Button submitButton = findViewById(R.id.submitButton);
        TextView resultTextView = findViewById(R.id.resultTextView);

        submitButton.setOnClickListener(v -> {
            String name = nameEditText.getText().toString();
            String email = emailEditText.getText().toString();
            resultTextView.setText("Name: " + name + "\nEmail: " + email);
        });
    }
}