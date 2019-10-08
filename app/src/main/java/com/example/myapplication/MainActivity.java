package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final String LAST_NAME = "com.example.myfirstapp.MESSAGE";
    public final String FIRST_NAME = "com.example.myfirstapp.MESSAGE";
    public static  final int countsign = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void goProfile(View view) {

        Intent profintent = new Intent(this, Profile.class);
        EditText lastNname = findViewById(R.id.lastName);
        String last_name = lastNname.getText().toString();
        profintent.putExtra("LAST_NAME", last_name);
        EditText firstNname =  findViewById(R.id.firstName);
        String first_name = firstNname.getText().toString();
        profintent.putExtra("FIRST_NAME", first_name);
        profintent.putExtra("department",getString(R.string.emptyString));
        startActivity(profintent);

    }

    public  void goRegister(View v)
    {
        Intent registerIntent = new Intent(this, Register.class);
        startActivity(registerIntent);
    }
}
