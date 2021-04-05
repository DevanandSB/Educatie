package com.edu.educatie;

import android.os.Bundle;
import android.view.View;
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


        if(tcs.isChecked()){
            tcsLayout.setVisibility(View.VISIBLE);
            wiproLayout.setVisibility(View.GONE);
            infosysLayout.setVisibility(View.GONE);
            ctsLayout.setVisibility(View.GONE);
            zoholayout.setVisibility(View.GONE);
            techMahiLayout.setVisibility(View.GONE);
            othersLayout.setVisibility(View.GONE);
        }

        if(wipro.isChecked()){
            tcsLayout.setVisibility(View.GONE);
            wiproLayout.setVisibility(View.VISIBLE);
            infosysLayout.setVisibility(View.GONE);
            ctsLayout.setVisibility(View.GONE);
            zoholayout.setVisibility(View.GONE);
            techMahiLayout.setVisibility(View.GONE);
            othersLayout.setVisibility(View.GONE);
        }

        if(infosys.isChecked()){
            tcsLayout.setVisibility(View.VISIBLE);
            wiproLayout.setVisibility(View.GONE);
            infosysLayout.setVisibility(View.GONE);
            ctsLayout.setVisibility(View.GONE);
            zoholayout.setVisibility(View.GONE);
            techMahiLayout.setVisibility(View.GONE);
            othersLayout.setVisibility(View.GONE);
        }

        if(cts.isChecked()){
            tcsLayout.setVisibility(View.VISIBLE);
            wiproLayout.setVisibility(View.GONE);
            infosysLayout.setVisibility(View.GONE);
            ctsLayout.setVisibility(View.GONE);
            zoholayout.setVisibility(View.GONE);
            techMahiLayout.setVisibility(View.GONE);
            othersLayout.setVisibility(View.GONE);
        }

        if(zoho.isChecked()){
            tcsLayout.setVisibility(View.VISIBLE);
            wiproLayout.setVisibility(View.GONE);
            infosysLayout.setVisibility(View.GONE);
            ctsLayout.setVisibility(View.GONE);
            zoholayout.setVisibility(View.GONE);
            techMahiLayout.setVisibility(View.GONE);
            othersLayout.setVisibility(View.GONE);
        }

        if(techmahindra.isChecked()){
            tcsLayout.setVisibility(View.VISIBLE);
            wiproLayout.setVisibility(View.GONE);
            infosysLayout.setVisibility(View.GONE);
            ctsLayout.setVisibility(View.GONE);
            zoholayout.setVisibility(View.GONE);
            techMahiLayout.setVisibility(View.GONE);
            othersLayout.setVisibility(View.GONE);
        }

        if(others.isChecked()){
            tcsLayout.setVisibility(View.VISIBLE);
            wiproLayout.setVisibility(View.GONE);
            infosysLayout.setVisibility(View.GONE);
            ctsLayout.setVisibility(View.GONE);
            zoholayout.setVisibility(View.GONE);
            techMahiLayout.setVisibility(View.GONE);
            othersLayout.setVisibility(View.GONE);
        }
    }
}
