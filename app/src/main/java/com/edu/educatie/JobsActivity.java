package com.edu.educatie;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class JobsActivity extends AppCompatActivity {

    RadioButton tcs, wipro, infosys, cts, zoho, techmahindra, others;
    LinearLayout tcsLayout, wiproLayout, infosysLayout, ctsLayout, zoholayout, techMahiLayout, othersLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tcs = findViewById(R.id.TCS);
        wipro = findViewById(R.id.Wipro);
        infosys = findViewById(R.id.Infosys);
        cts = findViewById(R.id.cts);
        zoho = findViewById(R.id.Zoho);
        techmahindra = findViewById(R.id.techMahindra);
        others = findViewById(R.id.others);

        tcsLayout = findViewById(R.id.tcsLinearLayout);
        wiproLayout = findViewById(R.id.wiproLinearLayout);
        infosysLayout = findViewById(R.id.infoysLinearLayout);
        ctsLayout = findViewById(R.id.ctsLinearLayout);
        zoholayout = findViewById(R.id.zohoLinearLayout);
        techMahiLayout = findViewById(R.id.tech_mahindraLinearLayout);
        othersLayout = findViewById(R.id.OthersLinearLayout);




    }
}
