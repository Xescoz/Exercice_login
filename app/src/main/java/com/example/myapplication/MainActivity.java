package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText emailEditText = findViewById(R.id.email);
        EditText passwordEditText = findViewById(R.id.password);
        final Button loginButton = findViewById(R.id.login);

        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    String password = passwordEditText.getText().toString();
                    String email = emailEditText.getText().toString();
                    if (email.equals("admin@admin.com") && password.equals("admin")) {
                        loginButton.setText("Login success");
                        Intent intent = new Intent(MainActivity.this,login_success.class);
                        startActivity(intent);
                    } else {
                        loginButton.setText("Login error try again");

                    }
            }
        });


    }
    }