package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
    }



    public void createBirthdayCard(View view) {
        String n = name.getText().toString();
//        Toast.makeText(this, "Entered name is " + n, Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, LoginActivity.class);
        intent.putExtra("name", n);
        startActivity(intent);
    }
}