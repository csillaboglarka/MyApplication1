package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


    }

                public void goRegister(View v) {
                Intent profileIntent = new Intent(Register.this, Profile.class);
                EditText lastNname = findViewById(R.id.lastName);
                String last_name = lastNname.getText().toString();
                profileIntent.putExtra("LAST_NAME", last_name);
                EditText firstNname =  findViewById(R.id.firstName);
                String first_name = firstNname.getText().toString();
                profileIntent.putExtra("FIRST_NAME", first_name);
                EditText departMent = findViewById(R.id.departMent);
                String dep = departMent.getText().toString();
                profileIntent.putExtra("department",dep);
                startActivity(profileIntent);
            }




}