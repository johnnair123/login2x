package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private TextView textViewWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewWelcome = findViewById(R.id.textViewWelcome);

        // Get the username from the intent
        Intent intent = getIntent();
        String username = intent.getStringExtra("USERNAME");

        // Display the welcome message
        if (username != null) {
            textViewWelcome.setText("Welcome, " + username + "!");
        } else {
            textViewWelcome.setText("Welcome!");
        }
    }
}
