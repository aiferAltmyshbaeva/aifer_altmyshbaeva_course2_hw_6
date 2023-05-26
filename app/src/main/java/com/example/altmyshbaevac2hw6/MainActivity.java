package com.example.altmyshbaevac2hw6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText emailEditText = findViewById(R.id.et_email);
        EditText passwordEditText = findViewById(R.id.et_password);
        Button buttonEnter = findViewById(R.id.btn_enter);
        LinearLayout container = findViewById(R.id.container);
        RelativeLayout containerTvForgetPassword = findViewById(R.id.container_tv_forget_password);
        emailEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (passwordEditText.getText().toString().isEmpty()) {
                    buttonEnter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));
                } else {
                    buttonEnter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        buttonEnter.setOnClickListener(v -> {
        if(emailEditText.getText().toString().equals("admin") && passwordEditText.getText().toString().equals("admin")){
        container.setVisibility(View.GONE);
            Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(MainActivity.this, "Неправильный логин и пароль", Toast.LENGTH_SHORT).show();
        }
        });

        passwordEditText.setOnEditorActionListener((v, actionId, event) -> {
            if (actionId == EditorInfo.IME_ACTION_DONE) {
            buttonEnter.performClick();
            return true;
        }
            return false;
        });
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
    }

        }

