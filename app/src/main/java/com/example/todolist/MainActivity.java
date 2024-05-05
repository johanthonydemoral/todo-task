package com.example.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button B1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        B1 = findViewById(R.id.buttonStart);

        B1.setOnClickListener(v -> {
            // Create an Intent to start the SplashScreen activity
            Intent intent = new Intent(MainActivity.this, HomePage.class);

            // Start the SplashScreen activity
            startActivity(intent);
        });
    }
}