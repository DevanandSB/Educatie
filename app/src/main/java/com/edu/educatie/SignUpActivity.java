package com.edu.educatie;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
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
        RadioIYear = findViewById(R.id.IstYearRadio);
        RadioIIYear = findViewById(R.id.IIndYearRadio);
        RadioIIIYear = findViewById(R.id.IIIrdYearRadio);


        passwordchecker = textPassword.getText().toString();

        signUpButton.setOnClickListener(v -> {
            if(textName.getText().toString().trim().isEmpty()){
                FancyToast.makeText(getBaseContext(), "Enter Your Name", FancyToast.LENGTH_SHORT, FancyToast.ERROR, false).show();
            } else if(textEmail.getText().toString().trim().isEmpty()) {
                FancyToast.makeText(getBaseContext(), "Enter Your Email", FancyToast.LENGTH_SHORT, FancyToast.ERROR, false).show();
            } else if(!Patterns.EMAIL_ADDRESS.matcher(textEmail.getText().toString()).matches()) {
                FancyToast.makeText(getBaseContext(), "Enter Valid Email", FancyToast.LENGTH_SHORT, FancyToast.ERROR, false).show();
            } else if(textPassword.getText().toString().trim().isEmpty()) {
                FancyToast.makeText(getBaseContext(), "Password can't be Empty", FancyToast.LENGTH_SHORT, FancyToast.ERROR, false).show();
            } else if (!RadioStudent.isChecked() && !RadioTeacher.isChecked()) {
                FancyToast.makeText(getBaseContext(), "Please Select Your Designation", FancyToast.LENGTH_SHORT, FancyToast.ERROR, false).show();
            } else if(RadioTeacher.isChecked()){
                FancyToast.makeText(getBaseContext(), "Validation Successful", FancyToast.LENGTH_SHORT, FancyToast.SUCCESS, false).show();
            }
        });

        RadioStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StudentYear.setVisibility(View.VISIBLE);
                if(RadioStudent.isChecked()) {
                    RadioIYear.setChecked(true);
                    if (!RadioIYear.isChecked() && !RadioIIYear.isChecked() && !RadioIIIYear.isChecked()) {
                        FancyToast.makeText(getBaseContext(), "Please Select Year", FancyToast.LENGTH_SHORT, FancyToast.ERROR, false).show();
                    }
                    signUpButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            FancyToast.makeText(getBaseContext(), "Validation Successful", FancyToast.LENGTH_SHORT, FancyToast.SUCCESS, false).show();
                        }
                    });
                }
            }
        });

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
}
