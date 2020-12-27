package com.edu.educatie;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class Timetable extends AppCompatActivity {

    RadioButton Iyear, IIyear, IIIyear;

    TextView yearmeniton;

    TextView subject1I, subject2I, subject3I, subject4I, subject5I;
    TextView Teacher1I, Teacher2I, Teacher3I, Teacher4I, Teacher5I;

    TextView subject1II, subject2II, subject3II, subject4II, subject5II;
    TextView Teacher1II, Teacher2II, Teacher3II, Teacher4II, Teacher5II;

    TextView subject1III, subject2III, subject3III, subject4III, subject5III;
    TextView Teacher1III, Teacher2III, Teacher3III, Teacher4III, Teacher5III;

    TextView subject1IV, subject2IV, subject3IV, subject4IV, subject5IV;
    TextView Teacher1IV, Teacher2IV, Teacher3IV, Teacher4IV, Teacher5IV;

    TextView subject1V, subject2V, subject3V, subject4V, subject5V;
    TextView Teacher1V, Teacher2V, Teacher3V, Teacher4V, Teacher5V;

    TextView subject1VI, subject2VI, subject3VI, subject4VI, subject5VI;
    TextView Teacher1VI, Teacher2VI, Teacher3VI, Teacher4VI, Teacher5VI;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(false);

        Iyear = findViewById(R.id.Iexam);
        IIyear = findViewById(R.id.IIexam);
        IIIyear = findViewById(R.id.IIIexam);

        yearmeniton = findViewById(R.id.yearmention);

        subject1I = findViewById(R.id.subject1I);
        subject2I = findViewById(R.id.subject2I);
        subject3I = findViewById(R.id.subject3I);
        subject4I = findViewById(R.id.subject4I);
        subject5I = findViewById(R.id.subject5I);

        Teacher1I = findViewById(R.id.teacher1I);
        Teacher2I = findViewById(R.id.teacher2I);
        Teacher3I = findViewById(R.id.teacher3I);
        Teacher4I = findViewById(R.id.teacher4I);
        Teacher5I = findViewById(R.id.teacher5I);

        subject1II = findViewById(R.id.subject1II);
        subject2II = findViewById(R.id.subject2II);
        subject3II = findViewById(R.id.subject3II);
        subject4II = findViewById(R.id.subject4II);
        subject5II = findViewById(R.id.subject5II);

        Teacher1II = findViewById(R.id.teacher1II);
        Teacher2II = findViewById(R.id.teacher2II);
        Teacher3II = findViewById(R.id.teacher3II);
        Teacher4II = findViewById(R.id.teacher4II);
        Teacher5II = findViewById(R.id.teacher5II);

        subject1III = findViewById(R.id.subject1III);
        subject2III = findViewById(R.id.subject2III);
        subject3III = findViewById(R.id.subject3III);
        subject4III = findViewById(R.id.subject4III);
        subject5III = findViewById(R.id.subject5III);

        Teacher1III = findViewById(R.id.teacher1III);
        Teacher2III = findViewById(R.id.teacher2III);
        Teacher3III = findViewById(R.id.teacher3III);
        Teacher4III = findViewById(R.id.teacher4III);
        Teacher5III = findViewById(R.id.teacher5III);


        subject1IV = findViewById(R.id.subject1IV);
        subject2IV = findViewById(R.id.subject2IV);
        subject3IV = findViewById(R.id.subject3IV);
        subject4IV = findViewById(R.id.subject4IV);
        subject5IV = findViewById(R.id.subject5IV);

        Teacher1IV = findViewById(R.id.teacher1IV);
        Teacher2IV = findViewById(R.id.teacher2IV);
        Teacher3IV = findViewById(R.id.teacher3IV);
        Teacher4IV = findViewById(R.id.teacher4IV);
        Teacher5IV = findViewById(R.id.teacher5IV);

        subject1V = findViewById(R.id.subject1V);
        subject2V = findViewById(R.id.subject2V);
        subject3V = findViewById(R.id.subject3V);
        subject4V = findViewById(R.id.subject4V);
        subject5V = findViewById(R.id.subject5V);

        Teacher1V = findViewById(R.id.teacher1V);
        Teacher2V = findViewById(R.id.teacher2V);
        Teacher3V = findViewById(R.id.teacher3V);
        Teacher4V = findViewById(R.id.teacher4V);
        Teacher5V = findViewById(R.id.teacher5V);

        subject1VI = findViewById(R.id.subject1VI);
        subject2VI = findViewById(R.id.subject2VI);
        subject3VI = findViewById(R.id.subject3VI);
        subject4VI = findViewById(R.id.subject4VI);
        subject5VI = findViewById(R.id.subject5VI);

        Teacher1VI = findViewById(R.id.teacher1VI);
        Teacher2VI = findViewById(R.id.teacher2VI);
        Teacher3VI = findViewById(R.id.teacher3VI);
        Teacher4VI = findViewById(R.id.teacher4VI);
        Teacher5VI = findViewById(R.id.teacher5VI);


        String Year = getIntent().getStringExtra("year");
        String Subject1I = getIntent().getStringExtra("Subject1I");
        String Staff1I = getIntent().getStringExtra("Staff1I");
        String Subject2I = getIntent().getStringExtra("Subject2I");
        String Staff2I = getIntent().getStringExtra("Staff2I");
        String Subject3I = getIntent().getStringExtra("Subject3I");
        String Staff3I = getIntent().getStringExtra("Staff3I");
        String Subject4I = getIntent().getStringExtra("Subject4I");
        String Staff4I = getIntent().getStringExtra("Staff4I");
        String Subject5I = getIntent().getStringExtra("Subject5I");
        String Staff5I = getIntent().getStringExtra("Staff5I");


        String Subject1II = getIntent().getStringExtra("Subject1II");
        String Staff1II = getIntent().getStringExtra("Staff1II");
        String Subject2II = getIntent().getStringExtra("Subject2II");
        String Staff2II = getIntent().getStringExtra("Staff2II");
        String Subject3II = getIntent().getStringExtra("Subject3II");
        String Staff3II = getIntent().getStringExtra("Staff3II");
        String Subject4II = getIntent().getStringExtra("Subject4II");
        String Staff4II = getIntent().getStringExtra("Staff4II");
        String Subject5II = getIntent().getStringExtra("Subject5II");
        String Staff5II = getIntent().getStringExtra("Staff5II");


        String Subject1III = getIntent().getStringExtra("Subject1III");
        String Staff1III = getIntent().getStringExtra("Staff1III");
        String Subject2III = getIntent().getStringExtra("Subject2III");
        String Staff2III = getIntent().getStringExtra("Staff2III");
        String Subject3III = getIntent().getStringExtra("Subject3III");
        String Staff3III = getIntent().getStringExtra("Staff3III");
        String Subject4III = getIntent().getStringExtra("Subject4III");
        String Staff4III = getIntent().getStringExtra("Staff4III");
        String Subject5III = getIntent().getStringExtra("Subject5III");
        String Staff5III = getIntent().getStringExtra("Staff5III");


        String Subject1IV = getIntent().getStringExtra("Subject1IV");
        String Staff1IV = getIntent().getStringExtra("Staff1IV");
        String Subject2IV = getIntent().getStringExtra("Subject2IV");
        String Staff2IV = getIntent().getStringExtra("Staff2IV");
        String Subject3IV = getIntent().getStringExtra("Subject3IV");
        String Staff3IV = getIntent().getStringExtra("Staff3IV");
        String Subject4IV = getIntent().getStringExtra("Subject4IV");
        String Staff4IV = getIntent().getStringExtra("Staff4IV");
        String Subject5IV = getIntent().getStringExtra("Subject5IV");
        String Staff5IV = getIntent().getStringExtra("Staff5IV");

        String Subject1V = getIntent().getStringExtra("Subject1V");
        String Staff1V = getIntent().getStringExtra("Staff1V");
        String Subject2V = getIntent().getStringExtra("Subject2V");
        String Staff2V = getIntent().getStringExtra("Staff2V");
        String Subject3V = getIntent().getStringExtra("Subject3V");
        String Staff3V = getIntent().getStringExtra("Staff3V");
        String Subject4V = getIntent().getStringExtra("Subject4V");
        String Staff4V = getIntent().getStringExtra("Staff4V");
        String Subject5V = getIntent().getStringExtra("Subject5V");
        String Staff5V = getIntent().getStringExtra("Staff5V");

        String Subject1VI = getIntent().getStringExtra("Subject1VI");
        String Staff1VI = getIntent().getStringExtra("Staff1VI");
        String Subject2VI = getIntent().getStringExtra("Subject2VI");
        String Staff2VI = getIntent().getStringExtra("Staff2VI");
        String Subject3VI = getIntent().getStringExtra("Subject3VI");
        String Staff3VI = getIntent().getStringExtra("Staff3VI");
        String Subject4VI = getIntent().getStringExtra("Subject4VI");
        String Staff4VI = getIntent().getStringExtra("Staff4VI");
        String Subject5VI = getIntent().getStringExtra("Subject5VI");
        String Staff5VI = getIntent().getStringExtra("Staff5VI");

        yearmeniton.setText(Year);

        Teacher1I.setText(Staff1I);
        Teacher2I.setText(Staff2I);
        Teacher3I.setText(Staff3I);
        Teacher4I.setText(Staff4I);
        Teacher5I.setText(Staff5I);
        subject1I.setText(Subject1I);
        subject2I.setText(Subject2I);
        subject3I.setText(Subject3I);
        subject4I.setText(Subject4I);
        subject5I.setText(Subject5I);

        Teacher1II.setText(Staff1II);
        Teacher2II.setText(Staff2II);
        Teacher3II.setText(Staff3II);
        Teacher4II.setText(Staff4II);
        Teacher5II.setText(Staff5II);
        subject1II.setText(Subject1II);
        subject2II.setText(Subject2II);
        subject3II.setText(Subject3II);
        subject4II.setText(Subject4II);
        subject5II.setText(Subject5II);

        Teacher1III.setText(Staff1III);
        Teacher2III.setText(Staff2III);
        Teacher3III.setText(Staff3III);
        Teacher5III.setText(Staff5III);
        subject1III.setText(Subject1III);
        subject2III.setText(Subject2III);
        subject3III.setText(Subject3III);
        subject4III.setText(Subject4III);
        subject5III.setText(Subject5III);

        Teacher1IV.setText(Staff1IV);
        Teacher2IV.setText(Staff2IV);
        Teacher3IV.setText(Staff3IV);
        Teacher4IV.setText(Staff4IV);
        Teacher5IV.setText(Staff5IV);
        subject1IV.setText(Subject1IV);
        subject2IV.setText(Subject2IV);
        subject3IV.setText(Subject3IV);
        subject4IV.setText(Subject4IV);
        subject5IV.setText(Subject5IV);

        Teacher1V.setText(Staff1V);
        Teacher2V.setText(Staff2V);
        Teacher3V.setText(Staff3V);
        Teacher4V.setText(Staff4V);
        Teacher5V.setText(Staff5V);
        subject1V.setText(Subject1V);
        subject2V.setText(Subject2V);
        subject3V.setText(Subject3V);
        subject4V.setText(Subject4V);
        subject5V.setText(Subject5V);

        Teacher1VI.setText(Staff1VI);
        Teacher2VI.setText(Staff2VI);
        Teacher3VI.setText(Staff3VI);
        Teacher4VI.setText(Staff4VI);
        Teacher5VI.setText(Staff5VI);
        subject1VI.setText(Subject1VI);
        subject2VI.setText(Subject2VI);
        subject3VI.setText(Subject3VI);
        subject4VI.setText(Subject4VI);
        subject5VI.setText(Subject5VI);

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(Timetable.this, Home.class);
        startActivity(intent);
        finish();
    }
}
