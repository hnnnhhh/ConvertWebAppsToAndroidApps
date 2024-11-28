package com.example.webapptoandroidapp.androidapps;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayHelloWorld extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("Hello World!");
        textView.setTextSize(24);
        setContentView(textView);
    }
}