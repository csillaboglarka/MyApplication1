package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final String LAST_NAME = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void goProfile(View view) {

        Intent profintent = new Intent(this, Profile.class);
        EditText lastNname = (EditText) findViewById(R.id.lastName);
        String last_name = lastNname.getText().toString();
        profintent.putExtra("LAST_NAME", last_name);
        startActivity(profintent);
    }


}
