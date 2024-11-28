package com.example.webapptoandroidapp.androidapps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.webapptoandroidapp.R;

public class DisplayName extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displayname);

        EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView);

        button.setOnClickListener(v -> {
            String name = editText.getText().toString();
            textView.setText("Hello, " + name + "!");
        });
    }
}
