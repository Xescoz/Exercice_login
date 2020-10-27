package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    private final String EMAIL_USER = "admin@admin.com";
    private final String PASSWORD_USER = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText emailEditText = findViewById(R.id.email_edit);
        EditText passwordEditText = findViewById(R.id.password_edit);
        Button loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    String password = passwordEditText.getText().toString();
                    String email = emailEditText.getText().toString();
                    if (email.equals(EMAIL_USER) && password.equals(PASSWORD_USER)) {
                        loginButton.setText(getString(R.string.login_successful));
                        Intent intent = new Intent(MainActivity.this, LoginSuccessActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(),getString(R.string.login_error), Toast.LENGTH_SHORT).show();
                    }
            }
        });


    }
    }