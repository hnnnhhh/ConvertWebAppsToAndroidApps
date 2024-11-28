package com.example.webapptoandroidapp.androidapps;


import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.webapptoandroidapp.R;

public class Counter extends AppCompatActivity {
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.counter);

        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            count++;
            textView.setText("Count: " + count);
        });
    }
}