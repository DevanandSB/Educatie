package com.edu.educatie;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StaffProfile extends AppCompatActivity {
    TextView sName,splace,sName1,sDesignation,sQualify,sMail,sDepartment;
    Button backpress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        sName = findViewById(R.id.staffname);
        sName1 = findViewById(R.id.staffname1);
        splace = findViewById(R.id.place);
        sDesignation = findViewById(R.id.staffDesignation);
        sQualify = findViewById(R.id.staffQualify);
        sMail = findViewById(R.id.staffMail);
        sDepartment = findViewById(R.id.staffdept);
        backpress = findViewById(R.id.back);

        String Name = getIntent().getStringExtra("sname");
        String Name1 = getIntent().getStringExtra("sname1");
        String Department = getIntent().getStringExtra("department");
        String Designation = getIntent().getStringExtra("designation");
        String Qualification = getIntent().getStringExtra("qualification");
        String place = getIntent().getStringExtra("place");
        String mail = getIntent().getStringExtra("mail");

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        sName.setText(Name);
        sName1.setText(Name1);
        sDepartment.setText(Department);
        sDesignation.setText(Designation);
        sQualify.setText(Qualification);
        splace.setText(place);
        sMail.setText(mail);

        backpress.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            backpress.startAnimation(animation);
            Intent intent = new Intent(StaffProfile.this, Home.class);
            startActivity(intent);
            finish();
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(StaffProfile.this, Home.class);
        startActivity(intent);
        finish();
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent intent = new Intent(StaffProfile.this, Home.class);
        startActivity(intent);
        finish();
        return true;
    }


}
