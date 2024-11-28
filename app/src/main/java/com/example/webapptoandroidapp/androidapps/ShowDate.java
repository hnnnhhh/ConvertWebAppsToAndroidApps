package com.example.webapptoandroidapp.androidapps;


import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.example.webapptoandroidapp.R;


public class ShowDate extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showdate);

        Button showDateTimeButton = findViewById(R.id.showDateTimeButton);
        TextView dateTimeTextView = findViewById(R.id.dateTimeTextView);

        showDateTimeButton.setOnClickListener(v -> {
            String currentDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date());
            dateTimeTextView.setText("Current Date and Time: " + currentDateTime);
        });
    }
}
