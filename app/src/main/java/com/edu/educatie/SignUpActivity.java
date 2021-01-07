package com.edu.educatie;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.shashank.sony.fancytoastlib.FancyToast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUpActivity extends AppCompatActivity {

    TextView textLogin;
    Button signUpButton;
    EditText textName, textEmail, textPassword;
    String passwordchecker;
    LinearLayout StudentYear;
    RadioGroup RadioGroupDesignation, RadioStudentYear;
    RadioButton RadioStudent, RadioTeacher, RadioIYear, RadioIIYear, RadioIIIYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        textLogin = findViewById(R.id.textSignIn);
        signUpButton = findViewById(R.id.buttonSignUp);
        textName = findViewById(R.id.inputFirstName);
        textEmail = findViewById(R.id.inputEmail);
        textPassword = findViewById(R.id.inputsignupPassword);
        StudentYear = findViewById(R.id.studentYearLayout);
        RadioGroupDesignation = findViewById(R.id.designationRadioGroup);
        RadioStudentYear = findViewById(R.id.studentYearRadioGroup);
        RadioStudent = findViewById(R.id.studentRadioDesignation);
        RadioTeacher = findViewById(R.id.staffRadioDesignation);


        passwordchecker = textPassword.getText().toString();

        if(textName.getText().toString().trim().isEmpty()){
            FancyToast.makeText(getBaseContext(), "Enter Your Name", FancyToast.LENGTH_SHORT, FancyToast.ERROR, false).show();
        } else if(textEmail.getText().toString().trim().isEmpty()) {
            FancyToast.makeText(getBaseContext(), "Enter Your Email", FancyToast.LENGTH_SHORT, FancyToast.ERROR, false).show();
        } else if(textPassword.getText().toString().trim().isEmpty()) {
            FancyToast.makeText(getBaseContext(), "Password can't be Empty", FancyToast.LENGTH_SHORT, FancyToast.ERROR, false).show();
        } else if(!Patterns.EMAIL_ADDRESS.matcher(textEmail.getText().toString()).matches()) {
            FancyToast.makeText(getBaseContext(), "Enter Valid Email", FancyToast.LENGTH_SHORT, FancyToast.ERROR, false).show();
        } else if(!validPassword(textPassword.getText().toString())) {
            FancyToast.makeText(getBaseContext(), "Enter Valid Password", FancyToast.LENGTH_SHORT, FancyToast.ERROR, false).show();
        } else {
            signUpButton.setOnClickListener(v -> FancyToast.makeText(getBaseContext(), "Validation Successful", FancyToast.LENGTH_SHORT, FancyToast.SUCCESS, false).show());
        }

        textLogin.setOnClickListener(v -> {
            Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
            startActivity(intent);
            finish();
        });

    }

    public boolean checkRegex(String pattern, String input) {
        Pattern r = Pattern.compile(pattern);
        return r.matcher(input).matches();
    }

    public boolean validPassword(String password) {
        return checkRegex("(?-i)(?=^.{8,}$)((?!.*\\s)(?=.*[A-Z])(?=.*[a-z]))(?=(1)(?=.*\\d)|.*[^A-Za-z0-9])^.*$",passwordchecker);
//      At least 8 characters long
//      At least 1 uppercase and 1 lowercase
//      At least 1 digit (OR) at least 1 alphanumeric.
//      No spaces.
    }
}
