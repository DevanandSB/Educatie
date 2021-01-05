package com.edu.educatie;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.shashank.sony.fancytoastlib.FancyToast;
public class SignUpActivity extends AppCompatActivity {

    TextView textLogin;
    Button signUpButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        textLogin = findViewById(R.id.textSignIn);
        signUpButton = findViewById(R.id.buttonSignUp);

        textLogin.setOnClickListener(v -> {
            Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
            startActivity(intent);
            finish();
        });

        signUpButton.setOnClickListener(v -> FancyToast.makeText(getBaseContext(), "Sign up Successful", FancyToast.LENGTH_SHORT, FancyToast.SUCCESS, false).show());

    }
}
