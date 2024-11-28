package com.example.webapptoandroidapp.androidapps;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.webapptoandroidapp.R;

public class SimpleLogin extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simplelogin);

        EditText usernameEditText = findViewById(R.id.usernameEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);
        Button loginButton = findViewById(R.id.loginButton);
        TextView resultTextView = findViewById(R.id.resultTextView);

        loginButton.setOnClickListener(v -> {
            String username = usernameEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            if (username.equals("admin") && password.equals("password")) {
                resultTextView.setText("Login Successful!");
            } else {
                resultTextView.setText("Invalid credentials. Try again.");
            }
        });
    }
}