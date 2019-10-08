package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    private String firstName, lastName, department;
    private Button backButton;
    private TextView firstNameTextView, lastNameTextView, signInCounterText, registerCounterText;
    public static int signCounter = 0, registerCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        if (getIntent().getStringExtra("department").equals(getString(R.string.emptyString))){
            ++signCounter;
            Intent intent = getIntent();
            String last_name = intent.getStringExtra("LAST_NAME");
            TextView lastName = findViewById(R.id.lastName);
            lastName.setText(last_name);
            String first_name = intent.getStringExtra("FIRST_NAME");
            TextView firstName = findViewById(R.id.firstName);
            firstName.setText(first_name);
            String dep_artment = intent.getStringExtra("department");
            TextView departMent = findViewById(R.id.departMent);
            departMent.setText(dep_artment);

        }
        else
        {
            ++registerCounter;
            Intent intent = getIntent();
            String last_Name = intent.getStringExtra("LAST_NAME");
            TextView lastName = findViewById(R.id.lastName);
            lastName.setText(last_Name);
            String first_Name = intent.getStringExtra("FIRST_NAME");
            TextView firstName = findViewById(R.id.firstName);
            firstName.setText(first_Name);
            String dep_artment = intent.getStringExtra("department");
            TextView departMent = findViewById(R.id.departMent);
            departMent.setText(dep_artment);
            TextView resultText = findViewById(R.id.result);
            resultText.setText(last_Name + first_Name + dep_artment);

        }
        TextView signInCounterText = findViewById(R.id.numOfsign);
        String COUNT = getString(R.string.num_sign) + signCounter;
        signInCounterText.setText(getString(R.string.num_sign) + " " + signCounter);
        registerCounterText = findViewById(R.id.numOfreg);
        registerCounterText.setText(getString(R.string.num_register) + registerCounter);



    }

        public void goBack(View v)
        {
            finish();
        }


    }



