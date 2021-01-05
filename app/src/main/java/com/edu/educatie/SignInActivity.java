package com.edu.educatie;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.shashank.sony.fancytoastlib.FancyToast;

public class SignInActivity extends AppCompatActivity {

    TextView textSignUp,test;
    Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        textSignUp = findViewById(R.id.textSignUp);
        test = findViewById(R.id.tempLogin);
        signInButton = findViewById(R.id.buttonSignIn);

        textSignUp.setOnClickListener(v -> {
            Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
            startActivity(intent);
            finish();
        });

        signInButton.setOnClickListener(v -> {
            FancyToast.makeText(getBaseContext(), "Login Successful", FancyToast.LENGTH_SHORT, FancyToast.SUCCESS, false).show();
        });

        test.setOnClickListener(v -> {
            Intent intent = new Intent(SignInActivity.this, Home.class);
            startActivity(intent);
            finish();
        });

    }
}
