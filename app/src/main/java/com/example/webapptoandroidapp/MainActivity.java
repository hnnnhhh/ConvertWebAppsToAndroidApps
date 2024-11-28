package com.example.webapptoandroidapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.webapptoandroidapp.androidapps.BookmarkList;
import com.example.webapptoandroidapp.androidapps.Calculator;
import com.example.webapptoandroidapp.androidapps.CharacterCounter;
import com.example.webapptoandroidapp.androidapps.Counter;
import com.example.webapptoandroidapp.androidapps.CurrencyConverter;
import com.example.webapptoandroidapp.androidapps.DisplayHelloWorld;
import com.example.webapptoandroidapp.androidapps.DisplayName;
import com.example.webapptoandroidapp.androidapps.EvenOddChecker;
import com.example.webapptoandroidapp.androidapps.FahrenheitToCelsius;
import com.example.webapptoandroidapp.androidapps.MultiplicationTable;
import com.example.webapptoandroidapp.androidapps.PalindromeChecker;
import com.example.webapptoandroidapp.androidapps.ShowDate;
import com.example.webapptoandroidapp.androidapps.ShowHelloButton;
import com.example.webapptoandroidapp.androidapps.ShowUsername;
import com.example.webapptoandroidapp.androidapps.SimpleForm;
import com.example.webapptoandroidapp.androidapps.SimpleLogin;
import com.example.webapptoandroidapp.androidapps.TextLength;
import com.example.webapptoandroidapp.androidapps.UserAge;
import com.example.webapptoandroidapp.androidapps.UserGreeting;
import com.example.webapptoandroidapp.androidapps.WordReverser;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button displayhelloworld = findViewById(R.id.displayhelloworld);
        Button showhellobutton = findViewById(R.id.showhellobutton);
        Button displayname = findViewById(R.id.displayname);
        Button counter = findViewById(R.id.counter);
        Button simpleform = findViewById(R.id.simpleform);
        Button userage = findViewById(R.id.userage);
        Button usergreeting = findViewById(R.id.usergreeting);
        Button calculator = findViewById(R.id.calculator);
        Button textlength = findViewById(R.id.textlength);
        Button currencyconverter = findViewById(R.id.currencyconverter);

        Button evenoddchecker = findViewById(R.id.evenoddchecker);
        Button wordreverser = findViewById(R.id.wordreverser);
        Button showdate = findViewById(R.id.showdate);
        Button showusername = findViewById(R.id.showusername);
        Button multiplicationtable = findViewById(R.id.multiplicationtable);
        Button simplelogin = findViewById(R.id.simplelogin);
        Button fahrenheittocelsius = findViewById(R.id.fahrenheittocelcius);
        Button bookmarklist = findViewById(R.id.bookmarklist);
        Button charactercounter = findViewById(R.id.charactercounter);
        Button palindromechecker = findViewById(R.id.palindromechecker);

        displayhelloworld.setOnClickListener(v -> startActivity(new Intent(this, DisplayHelloWorld.class)));
        showhellobutton.setOnClickListener(v -> startActivity(new Intent(this, ShowHelloButton.class)));
        displayname.setOnClickListener(v -> startActivity(new Intent(this, DisplayName.class)));
        counter.setOnClickListener(v -> startActivity(new Intent(this, Counter.class)));
        simpleform.setOnClickListener(v -> startActivity(new Intent(this, SimpleForm.class)));
        userage.setOnClickListener(v -> startActivity(new Intent(this, UserAge.class)));
        usergreeting.setOnClickListener(v -> startActivity(new Intent(this, UserGreeting.class)));
        calculator.setOnClickListener(v -> startActivity(new Intent(this, Calculator.class)));
        textlength.setOnClickListener(v -> startActivity(new Intent(this, TextLength.class)));
        currencyconverter.setOnClickListener(v -> startActivity(new Intent(this, CurrencyConverter.class)));

        evenoddchecker.setOnClickListener(v -> startActivity(new Intent(this, EvenOddChecker.class)));
        wordreverser.setOnClickListener(v -> startActivity(new Intent(this, WordReverser.class)));
        showdate.setOnClickListener(v -> startActivity(new Intent(this, ShowDate.class)));
        showusername.setOnClickListener(v -> startActivity(new Intent(this, ShowUsername.class)));
        multiplicationtable.setOnClickListener(v -> startActivity(new Intent(this, MultiplicationTable.class)));
        simplelogin.setOnClickListener(v -> startActivity(new Intent(this, SimpleLogin.class)));
        fahrenheittocelsius.setOnClickListener(v -> startActivity(new Intent(this, FahrenheitToCelsius.class)));
        bookmarklist.setOnClickListener(v -> startActivity(new Intent(this, BookmarkList.class)));
        charactercounter.setOnClickListener(v -> startActivity(new Intent(this, CharacterCounter.class)));
        palindromechecker.setOnClickListener(v -> startActivity(new Intent(this, PalindromeChecker.class)));
    }
}
