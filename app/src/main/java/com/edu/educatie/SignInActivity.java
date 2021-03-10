package com.edu.educatie;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.shashank.sony.fancytoastlib.FancyToast;

public class SignInActivity extends AppCompatActivity {

    TextView textSignUp,test;
    EditText textEmail, textPassword;
    Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        textSignUp = findViewById(R.id.textSignUp);
        test = findViewById(R.id.tempLogin);
        textEmail = findViewById(R.id.inputEmail);
        textPassword = findViewById(R.id.inputPassword);


        signInButton = findViewById(R.id.buttonSignIn);

        textSignUp.setOnClickListener(v -> {
            Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
            startActivity(intent);
            finish();
        });

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textEmail.getText().toString().trim().isEmpty()) {
                    FancyToast.makeText(getBaseContext(), "Enter Your Email", FancyToast.LENGTH_SHORT, FancyToast.ERROR, false).show();
                } else if(!Patterns.EMAIL_ADDRESS.matcher(textEmail.getText().toString()).matches()) {
                    FancyToast.makeText(getBaseContext(), "Enter Valid Email", FancyToast.LENGTH_SHORT, FancyToast.ERROR, false).show();
                } else if(textPassword.getText().toString().trim().isEmpty()) {
                    FancyToast.makeText(getBaseContext(), "Password can't be Empty", FancyToast.LENGTH_SHORT, FancyToast.ERROR, false).show();
                } else {
                    FancyToast.makeText(getBaseContext(), "Validation Successful", FancyToast.LENGTH_SHORT, FancyToast.SUCCESS, false).show();
                }
            }
        });

        test.setOnClickListener(v -> {
            Intent intent = new Intent(SignInActivity.this, Home.class);
            startActivity(intent);
            finish();
        });

    }
}
