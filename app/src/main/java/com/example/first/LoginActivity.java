package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent intent = getIntent();
        String n = intent.getStringExtra("name");

        name = (TextView) findViewById(R.id.name);

        name.setText(n);
    }
}