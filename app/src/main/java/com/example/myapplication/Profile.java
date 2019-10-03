package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Intent intent = getIntent();
        String last_name = intent.getStringExtra("LAST_NAME");
        TextView lastName = findViewById(R.id.lastName);
        lastName.setText(last_name);
        String first_name = intent.getStringExtra("FIRST_NAME");
        TextView firstName = findViewById(R.id.firstName);
        firstName.setText(first_name);
    }



}
