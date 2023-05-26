package com.example.altmyshbaevac2hw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText emailEditText = findViewById(R.id.et_email);
        EditText passwordEditText = findViewById(R.id.et_password);
        Button buttonEnter = findViewById(R.id.btn_enter);
        buttonEnter.setBackgroundResource(R.drawable.bg_button_enabled);
    }
}