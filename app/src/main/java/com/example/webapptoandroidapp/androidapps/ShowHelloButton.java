package com.example.webapptoandroidapp.androidapps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.webapptoandroidapp.R;

public class ShowHelloButton extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showhellobutton);

        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView);

        button.setOnClickListener(v -> textView.setText("Hello World!"));
    }
}