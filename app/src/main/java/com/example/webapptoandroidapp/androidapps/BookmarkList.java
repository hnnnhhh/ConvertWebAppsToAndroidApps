package com.example.webapptoandroidapp.androidapps;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

import com.example.webapptoandroidapp.R;

public class BookmarkList extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookmarklist);

        EditText urlEditText = findViewById(R.id.urlEditText);
        Button addButton = findViewById(R.id.addButton);
        ListView bookmarksListView = findViewById(R.id.bookmarksListView);

        ArrayList<String> bookmarks = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, bookmarks);
        bookmarksListView.setAdapter(adapter);

        addButton.setOnClickListener(v -> {
            String url = urlEditText.getText().toString();
            if (!url.isEmpty()) {
                bookmarks.add(url);
                adapter.notifyDataSetChanged();
                urlEditText.setText("");
            }
        });
    }
}