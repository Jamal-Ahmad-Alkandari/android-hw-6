package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Movie m = new Movie("rocky","sevester stalon","10.0","13","kids");

        Movie m2 = new Movie("rocky2","sevester stalon","10.0","13","kids");
    }
}