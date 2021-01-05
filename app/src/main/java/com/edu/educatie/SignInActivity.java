package com.edu.educatie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {

    TextView textSignUp,test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        textSignUp = findViewById(R.id.textSignUp);
        test = findViewById(R.id.tempLogin);

        textSignUp.setOnClickListener(v -> {
            Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
            startActivity(intent);
            finish();
        });

        test.setOnClickListener(v -> {
            Intent intent = new Intent(SignInActivity.this, Home.class);
            startActivity(intent);
            finish();
        });

    }
}
