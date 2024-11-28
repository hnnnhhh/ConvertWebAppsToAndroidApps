package com.example.webapptoandroidapp.androidapps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.webapptoandroidapp.R;

public class UserGreeting extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usergreeting);

        EditText nameEditText = findViewById(R.id.nameEditText);
        Button greetButton = findViewById(R.id.greetButton);
        TextView greetingTextView = findViewById(R.id.greetingTextView);

        greetButton.setOnClickListener(v -> {
            String name = nameEditText.getText().toString();
            if (!name.isEmpty()) {
                greetingTextView.setText("Hello, " + name + "!");
            } else {
                greetingTextView.setText("Please enter your name.");
            }
        });
    }
}
