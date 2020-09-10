package com.edu.educatie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.shashank.sony.fancytoastlib.FancyToast;

public class FreeCourses extends AppCompatActivity {

    CardView java, AWS, android, python, linux, database;
    LinearLayout anim;

    String[] urls = new String[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_courses);

        java = findViewById(R.id.freejavacourse);
        AWS = findViewById(R.id.freeawscourse);
        android = findViewById(R.id.freeandroidcourse);
        python = findViewById(R.id.freepythoncourse);
        linux = findViewById(R.id.freelinuxcourse);
        database = findViewById(R.id.freedatabasecourse);
        anim = findViewById(R.id.animlayout);

        urls[0] = "https://www.youtube.com/playlist?list=PLzTEv3l8hsKeAIaS8zQ4YsnyUcmoSJwLa"; //Java
        urls[1] = "https://www.youtube.com/playlist?list=PLzTEv3l8hsKe0atlMAbWckI62INlxmiV_"; //Amazon
        urls[2] = "https://www.youtube.com/playlist?list=PLzTEv3l8hsKd4UECHfkQi0_ZuwcjpuyRd"; //Database
        urls[3] = "https://www.youtube.com/playlist?list=PLzTEv3l8hsKfFhySjMRpMyIxEe2SCM_0T"; //Ethical Hacking using Python
        urls[4] = "https://www.youtube.com/playlist?list=PLzTEv3l8hsKcbcxFNSDhMFFNjWHTBX2p8"; //Linux Administration
        urls[5] = "https://www.youtube.com/playlist?list=PLzTEv3l8hsKffFAEhlQRq0FR3XnkE49gt"; //Android

        java.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            java.startAnimation(animation);
            Intent intent = new Intent(getApplicationContext(), FreeCourseWeb.class);
            intent.putExtra("Links",urls[0]);
            startActivity(intent);
        });

        AWS.setOnClickListener(view -> {
//            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
//            AWS.startAnimation(animation);
//            Intent intent = new Intent(getApplicationContext(), FreeCourseWeb.class);
//            intent.putExtra("Links",urls[1]);
//            startActivity(intent);
            FancyToast.makeText(FreeCourses.this, "Amazon Web Services will available soon", FancyToast.LENGTH_SHORT, FancyToast.INFO, false).show();
        });

        android.setOnClickListener(view -> {
//            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
//            android.startAnimation(animation);
//            Intent intent = new Intent(getApplicationContext(), FreeCourseWeb.class);
//            intent.putExtra("Links",urls[5]);
//            startActivity(intent);
            FancyToast.makeText(FreeCourses.this, "Android Application Development will available soon", FancyToast.LENGTH_SHORT, FancyToast.INFO, false).show();
        });

        python.setOnClickListener(view -> {
//            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
//            python.startAnimation(animation);
//            Intent intent = new Intent(getApplicationContext(), FreeCourseWeb.class);
//            intent.putExtra("Links",urls[3]);
//            startActivity(intent);
            FancyToast.makeText(FreeCourses.this, "Ethical Hacking using Python will available soon", FancyToast.LENGTH_SHORT, FancyToast.INFO, false).show();
        });

        linux.setOnClickListener(view -> {
//            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
//            linux.startAnimation(animation);
//            Intent intent = new Intent(getApplicationContext(), FreeCourseWeb.class);
//            intent.putExtra("Links",urls[4]);
//            startActivity(intent);
            FancyToast.makeText(FreeCourses.this, "Linux Administration will available soon", FancyToast.LENGTH_SHORT, FancyToast.INFO, false).show();
        });

        database.setOnClickListener(view -> {
//            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
//            database.startAnimation(animation);
//            Intent intent = new Intent(getApplicationContext(), FreeCourseWeb.class);
//            intent.putExtra("Links",urls[2]);
//            startActivity(intent);
            FancyToast.makeText(FreeCourses.this, "Database Management System will available soon", FancyToast.LENGTH_SHORT, FancyToast.INFO, false).show();
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(FreeCourses.this, Home.class);
        startActivity(intent);
        finish();
    }
}