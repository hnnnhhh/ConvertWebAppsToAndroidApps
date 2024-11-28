package com.example.webapptoandroidapp.androidapps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.webapptoandroidapp.R;

public class MultiplicationTable extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiplicationtable);

        EditText numberEditText = findViewById(R.id.numberEditText);
        Button generateButton = findViewById(R.id.generateButton);
        TextView resultTextView = findViewById(R.id.resultTextView);

        generateButton.setOnClickListener(v -> {
            String input = numberEditText.getText().toString();
            if (!input.isEmpty()) {
                int number = Integer.parseInt(input);
                StringBuilder result = new StringBuilder();
                for (int i = 1; i <= 10; i++) {
                    result.append(number).append(" x ").append(i).append(" = ").append(number * i).append("\n");
                }
                resultTextView.setText(result.toString());
            } else {
                resultTextView.setText("Please enter a valid number.");
            }
        });
    }
}
