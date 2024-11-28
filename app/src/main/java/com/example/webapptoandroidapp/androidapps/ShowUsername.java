package com.example.webapptoandroidapp.androidapps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.webapptoandroidapp.R;

public class ShowUsername extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showusername);

        EditText nicknameEditText = findViewById(R.id.nicknameEditText);
        Button showUsernameButton = findViewById(R.id.showUsernameButton);
        TextView resultTextView = findViewById(R.id.resultTextView);

        showUsernameButton.setOnClickListener(v -> {
            String nickname = nicknameEditText.getText().toString();
            if (!nickname.isEmpty()) {
                resultTextView.setText("Your Username: " + nickname);
            } else {
                resultTextView.setText("Please enter your nickname.");
            }
        });
    }
}