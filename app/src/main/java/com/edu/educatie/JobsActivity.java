package com.edu.educatie;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class JobsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
