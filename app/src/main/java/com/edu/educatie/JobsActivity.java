package com.edu.educatie;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class JobsActivity extends AppCompatActivity {

    RadioButton tcs, wipro, infosys, cts, zoho, techmahindra, others;
    LinearLayout tcsLayout, wiproLayout, ctsLayout, zoholayout, techMahiLayout, othersLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tcs = findViewById(R.id.TCS);
        tcs = findViewById(R.id.Wipro);
        tcs = findViewById(R.id.Infosys);
        tcs = findViewById(R.id.cts);
        tcs = findViewById(R.id.Zoho);
        tcs = findViewById(R.id.techMahindra);
        tcs = findViewById(R.id.others);

    }
}
