package com.edu.educatie;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import com.shashank.sony.fancytoastlib.FancyToast;

import java.util.Objects;

public class TimeTableYear extends AppCompatActivity {

    RadioButton Iyear, IIyear, IIIyear;
    TextView yearmention;
    Button showdayorder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable_year);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        Iyear = findViewById(R.id.Iexam);
        IIyear = findViewById(R.id.IIexam);
        IIIyear = findViewById(R.id.IIIexam);

        yearmention = findViewById(R.id.yearmention);

        showdayorder = findViewById(R.id.showtimetable);

        showdayorder.setOnClickListener(view -> {
            if (Iyear.isChecked()) {
                Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
                showdayorder.startAnimation(animation);
                Intent intent = new Intent(TimeTableYear.this, Timetable.class);

                String year = "I Year";
                String Subject1I = "Computer Organisation and Architecture";
                String Staff1I = "Mr. M. Santhoshkumar";
                String Subject2I = "English for Basic Communication";
                String Staff2I = "Mr. S. Prabakaran";
                String Subject3I = "Allied Mathematics - II";
                String Staff3I = "Miss. D. Saraswathi";
                String Subject4I = "Programming with C (Practical)";
                String Staff4I = "Mrs. A. Josephine Sagaya Mala";
                String Subject5I = "Programming with C (Practical)";
                String Staff5I = "Mrs. A. Josephine Sagaya Mala";

                String Subject1II = "English for Basic Communication";
                String Staff1II = "Mr. S. Prabakaran";
                String Subject2II = "Personal Skills";
                String Staff2II = "Staff Name Here";
                String Subject3II = "பொது தமிழ் - II";
                String Staff3II = "Staff Name Here";
                String Subject4II = "Allied Mathematics - II";
                String Staff4II = "Miss. D. Saraswathi";
                String Subject5II = "Value Education";
                String Staff5II = "Mr. M. SarlinRaj";

                String Subject1III = "Programming with C";
                String Staff1III = "Mrs. A. Josephine Sagaya Mala";
                String Subject2III = "English for Basic Communication";
                String Staff2III = "Mr. S. Prabakaran";
                String Subject3III = "Computer Organisation and Architecture";
                String Staff3III = "Mr. M. Santhoshkumar";
                String Subject4III = "பொது தமிழ் - II";
                String Staff4III = "Dr. R. Sankar";
                String Subject5III = "Allied Mathematics - II";
                String Staff5III = "Miss. D. Saraswathi";

                String Subject1IV = "Value Education";
                String Staff1IV = "Mr. M. SarlinRaj";
                String Subject2IV = "Allied Mathematics - II";
                String Staff2IV = "Miss. D. Saraswathi";
                String Subject3IV = "Computer Organisation and Architecture";
                String Staff3IV = "Mr. M. Santhoshkumar";
                String Subject4IV = "Programming with C";
                String Staff4IV = "Mrs. A. Josephine Sagaya Mala";
                String Subject5IV = "பொது தமிழ் - II";
                String Staff5IV = "Dr. R. Sankar";

                String Subject1V = "பொது தமிழ் - II";
                String Staff1V = "Dr. R. Sankar";
                String Subject2V = "English for Basic Communication";
                String Staff2V = "Mr. S. Prasanth";
                String Subject3V = "Personal Skills";
                String Staff3V = "Staff Name Here";
                String Subject4V = "Allied Mathematics - II";
                String Staff4V = "Miss. D. Saraswathi";
                String Subject5V = "Programming with C";
                String Staff5V = "Mrs. A. Josephine Sagaya Mala";

                String Subject1VI = "Allied Mathematics - II";
                String Staff1VI = "Miss. D. Saraswathi";
                String Subject2VI = "பொது தமிழ் - II";
                String Staff2VI = "Dr. R. Sankar";
                String Subject3VI = "Programming with C";
                String Staff3VI = "Mrs. A. Josephine Sagaya Mala";
                String Subject4VI = "English for Basic Communication";
                String Staff4VI = "Mr. S. Prasanth";
                String Subject5VI = "Computer Organisation and Architecture";
                String Staff5VI = "Mr. M. Santhoshkumar";

                intent.putExtra("year",year);
                intent.putExtra("Subject1I", Subject1I);
                intent.putExtra("Staff1I", Staff1I);
                intent.putExtra("Subject2I", Subject2I);
                intent.putExtra("Staff2I", Staff2I);
                intent.putExtra("Subject3I", Subject3I);
                intent.putExtra("Staff3I", Staff3I);
                intent.putExtra("Subject4I", Subject4I);
                intent.putExtra("Staff4I", Staff4I);
                intent.putExtra("Subject5I", Subject5I);
                intent.putExtra("Staff5I", Staff5I);

                intent.putExtra("Subject1II", Subject1II);
                intent.putExtra("Staff1II", Staff1II);
                intent.putExtra("Subject2II", Subject2II);
                intent.putExtra("Staff2II", Staff2II);
                intent.putExtra("Subject3II", Subject3II);
                intent.putExtra("Staff3II", Staff3II);
                intent.putExtra("Subject4II", Subject4II);
                intent.putExtra("Staff4II", Staff4II);
                intent.putExtra("Subject5II", Subject5II);
                intent.putExtra("Staff5II", Staff5II);

                intent.putExtra("Subject1III", Subject1III);
                intent.putExtra("Staff1III", Staff1III);
                intent.putExtra("Subject2III", Subject2III);
                intent.putExtra("Staff2III", Staff2III);
                intent.putExtra("Subject3III", Subject3III);
                intent.putExtra("Staff3III", Staff3III);
                intent.putExtra("Subject4III", Subject4III);
                intent.putExtra("Staff4III", Staff4III);
                intent.putExtra("Subject5III", Subject5III);
                intent.putExtra("Staff5III", Staff5III);

                intent.putExtra("Subject1IV", Subject1IV);
                intent.putExtra("Staff1IV", Staff1IV);
                intent.putExtra("Subject2IV", Subject2IV);
                intent.putExtra("Staff2IV", Staff2IV);
                intent.putExtra("Subject3IV", Subject3IV);
                intent.putExtra("Staff3IV", Staff3IV);
                intent.putExtra("Subject4IV", Subject4IV);
                intent.putExtra("Staff4IV", Staff4IV);
                intent.putExtra("Subject5IV", Subject5IV);
                intent.putExtra("Staff5IV", Staff5IV);

                intent.putExtra("Subject1V", Subject1V);
                intent.putExtra("Staff1V", Staff1V);
                intent.putExtra("Subject2V", Subject2V);
                intent.putExtra("Staff2V", Staff2V);
                intent.putExtra("Subject3V", Subject3V);
                intent.putExtra("Staff3V", Staff3V);
                intent.putExtra("Subject4V", Subject4V);
                intent.putExtra("Staff4V", Staff4V);
                intent.putExtra("Subject5V", Subject5V);
                intent.putExtra("Staff5V", Staff5V);

                intent.putExtra("Subject1VI", Subject1VI);
                intent.putExtra("Staff1VI", Staff1VI);
                intent.putExtra("Subject2VI", Subject2VI);
                intent.putExtra("Staff2VI", Staff2VI);
                intent.putExtra("Subject3VI", Subject3VI);
                intent.putExtra("Staff3VI", Staff3VI);
                intent.putExtra("Subject4VI", Subject4VI);
                intent.putExtra("Staff4VI", Staff4VI);
                intent.putExtra("Subject5VI", Subject5VI);
                intent.putExtra("Staff5VI", Staff5VI);

                startActivity(intent);
                finish();
            }
            if (IIyear.isChecked()) {
                Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
                showdayorder.startAnimation(animation);
                Intent intent = new Intent(TimeTableYear.this, Timetable.class);

                String year = "II Year";
                String Subject1I = "பொது தமிழ் - IV";
                String Staff1I = "Staff Name Here | Staff Name Here";
                String Subject2I = "English for Business Communication";
                String Staff2I = "Staff Name Here";
                String Subject3I = "Environmental Studies";
                String Staff3I = "Mr. M. SarlinRaj";
                String Subject4I = "Employability Skills";
                String Staff4I = "Mr. Picasso";
                String Subject5I = "Relational Database Management System";
                String Staff5I = "Mr. P. Karthik";

                String Subject1II = "Allied Physics for Computer Science - II";
                String Staff1II = "Mr. L. Anandaraj";
                String Subject2II = "பொது தமிழ் - IV";
                String Staff2II = "Staff Name Here | Staff Name Here";
                String Subject3II = "English for Business Communication";
                String Staff3II = "Staff Name Here";
                String Subject4II = "Computer Graphics";
                String Staff4II = "Mr. M. SarlinRaj";
                String Subject5II = "Relational Database Management System";
                String Staff5II = "Mr. P. Karthik";

                String Subject1III = "Computer Graphics";
                String Staff1III = "Mr. M. SarlinRaj";
                String Subject2III = "Employability Skills";
                String Staff2III = "Staff Name Here";
                String Subject3III = "பொது தமிழ் - IV";
                String Staff3III = "Staff Name Here | Staff Name Here";
                String Subject4III = "Allied Physics for Computer Science - II";
                String Staff4III = "Mr. L. Anandaraj";
                String Subject5III = "Environmental Studies";
                String Staff5III = "Mr. M. SarlinRaj";

                String Subject1IV = "Relational Database Management System";
                String Staff1IV = "Mr. P. Karthik";
                String Subject2IV = "English for Business Communication";
                String Staff2IV = "Staff Name Here";
                String Subject3IV = "Computer Graphics";
                String Staff3IV = "Mr. M. SarlinRaj";
                String Subject4IV = "பொது தமிழ் - IV";
                String Staff4IV = "Staff Name Here | Staff Name Here";
                String Subject5IV = "Allied Physics for Computer Science - II";
                String Staff5IV = "Mr. L. Ananadaraj";

                String Subject1V = "English for Business Communication";
                String Staff1V = "Staff not mentioned";
                String Subject2V = "Relational Database Management System (Practical)";
                String Staff2V = "Mr. P. Karthik | Mr. S. Mohanraj | Mrs. A. Josephine Sagaya Mala";
                String Subject3V = "Relational Database Management System (Practical)";
                String Staff3V = "Mr. P. Karthik | Mr. S. Mohanraj | Mrs. A. Josephine Sagaya Mala";
                String Subject4V = "Allied Physics for Computer Science - II (Practical)";
                String Staff4V = "Mr. L. Anandaraj";
                String Subject5V = "Allied Physics for Computer Science - II (Practical)";
                String Staff5V = "Mr. L. Anandaraj";

                String Subject1VI = "Relational Database Management System";
                String Staff1VI = "Mr. P. Karthik";
                String Subject2VI = "Computer Graphics";
                String Staff2VI = "Mr. M. SarlinRaj";
                String Subject3VI = "Allied Physics for Computer Science - II";
                String Staff3VI = "Mr. L. Anandaraj";
                String Subject4VI = "English for Business Communication";
                String Staff4VI = "Staff Name Here";
                String Subject5VI = "பொது தமிழ் - IV";
                String Staff5VI = "Staff Name Here | Staff Name Here";

                intent.putExtra("year",year);

                intent.putExtra("Subject1I", Subject1I);
                intent.putExtra("Staff1I", Staff1I);
                intent.putExtra("Subject2I", Subject2I);
                intent.putExtra("Staff2I", Staff2I);
                intent.putExtra("Subject3I", Subject3I);
                intent.putExtra("Staff3I", Staff3I);
                intent.putExtra("Subject4I", Subject4I);
                intent.putExtra("Staff4I", Staff4I);
                intent.putExtra("Subject5I", Subject5I);
                intent.putExtra("Staff5I", Staff5I);

                intent.putExtra("Subject1II", Subject1II);
                intent.putExtra("Staff1II", Staff1II);
                intent.putExtra("Subject2II", Subject2II);
                intent.putExtra("Staff2II", Staff2II);
                intent.putExtra("Subject3II", Subject3II);
                intent.putExtra("Staff3II", Staff3II);
                intent.putExtra("Subject4II", Subject4II);
                intent.putExtra("Staff4II", Staff4II);
                intent.putExtra("Subject5II", Subject5II);
                intent.putExtra("Staff5II", Staff5II);

                intent.putExtra("Subject1III", Subject1III);
                intent.putExtra("Staff1III", Staff1III);
                intent.putExtra("Subject2III", Subject2III);
                intent.putExtra("Staff2III", Staff2III);
                intent.putExtra("Subject3III", Subject3III);
                intent.putExtra("Staff3III", Staff3III);
                intent.putExtra("Subject4III", Subject4III);
                intent.putExtra("Staff4III", Staff4III);
                intent.putExtra("Subject5III", Subject5III);
                intent.putExtra("Staff5III", Staff5III);

                intent.putExtra("Subject1IV", Subject1IV);
                intent.putExtra("Staff1IV", Staff1IV);
                intent.putExtra("Subject2IV", Subject2IV);
                intent.putExtra("Staff2IV", Staff2IV);
                intent.putExtra("Subject3IV", Subject3IV);
                intent.putExtra("Staff3IV", Staff3IV);
                intent.putExtra("Subject4IV", Subject4IV);
                intent.putExtra("Staff4IV", Staff4IV);
                intent.putExtra("Subject5IV", Subject5IV);
                intent.putExtra("Staff5IV", Staff5IV);

                intent.putExtra("Subject1V", Subject1V);
                intent.putExtra("Staff1V", Staff1V);
                intent.putExtra("Subject2V", Subject2V);
                intent.putExtra("Staff2V", Staff2V);
                intent.putExtra("Subject3V", Subject3V);
                intent.putExtra("Staff3V", Staff3V);
                intent.putExtra("Subject4V", Subject4V);
                intent.putExtra("Staff4V", Staff4V);
                intent.putExtra("Subject5V", Subject5V);
                intent.putExtra("Staff5V", Staff5V);

                intent.putExtra("Subject1VI", Subject1VI);
                intent.putExtra("Staff1VI", Staff1VI);
                intent.putExtra("Subject2VI", Subject2VI);
                intent.putExtra("Staff2VI", Staff2VI);
                intent.putExtra("Subject3VI", Subject3VI);
                intent.putExtra("Staff3VI", Staff3VI);
                intent.putExtra("Subject4VI", Subject4VI);
                intent.putExtra("Staff4VI", Staff4VI);
                intent.putExtra("Subject5VI", Subject5VI);
                intent.putExtra("Staff5VI", Staff5VI);

                startActivity(intent);
                finish();
            }
            if (IIIyear.isChecked()) {

                Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
                showdayorder.startAnimation(animation);
                Intent intent = new Intent(TimeTableYear.this, Timetable.class);

                String year = "III Year";
                String Subject1I = "Programming with Python";
                String Staff1I = "Mr. M. Sarlinraj";
                String Subject2I = "Microprocessor and its Applications";
                String Staff2I = "Mr. S. Mohanraj";
                String Subject3I = "Non Major Elective";
                String Staff3I = " ";
                String Subject4I = "Mobile Applications - Android Development";
                String Staff4I = "Mr. P. Karthik";
                String Subject5I = "Programming with XML";
                String Staff5I = "Mr. M. Santhoshkumar";

                String Subject1II = "Microprocessor and its Applications";
                String Staff1II = "Mr. S. Mohanraj";
                String Subject2II = "Programming With Python";
                String Staff2II = "Mr. M. Sarlinraj";
                String Subject3II = "Mobile Applications - Android Development";
                String Staff3II = "Mr. P. Karthik";
                String Subject4II = "Computer Networks";
                String Staff4II = "Mrs. A. Josephine Sagaya Mala";
                String Subject5II = "Programming with XML";
                String Staff5II = "Mr. M. Santhoshkumar";

                String Subject1III = "Mobile Application - Android Development";
                String Staff1III = "Mr. P. Karthik";
                String Subject2III = "Programming with XML";
                String Staff2III = "Mr. M. Santhoshkumar";
                String Subject3III = "Computer Networks";
                String Staff3III = "Mrs. A. Josephine Sagaya Mala";
                String Subject4III = "Programming with XML (Practical)";
                String Staff4III = "Mr. M. Santhoshkumar | Mr. M. SarlinRaj | Mrs. A. Josephine Sagaya Mala";
                String Subject5III = "Programming with XML (Practical)";
                String Staff5III = "Mr. M. Santhoshkumar | Mr. M. SarlinRaj | Mrs. A. Josephine Sagaya Mala";

                String Subject1IV = "Computer Networks";
                String Staff1IV = "Mrs. A. Josephine Sagaya Mala";
                String Subject2IV = "Microprocessor and its Applications";
                String Staff2IV = "Mr. S. MohanRaj";
                String Subject3IV = "Mobile Apps - Android Development";
                String Staff3IV = "Mr. P. Karthik";
                String Subject4IV = "Programming with Python (Practical)";
                String Staff4IV = "Mr. M. SarlinRaj | Mr. S. MohanRaj | Mr. M. Santhoshkumar";
                String Subject5IV = "Programming with Python (Practical)";
                String Staff5IV = "Mr. M. SarlinRaj | Mr. S. MohanRaj | Mr. M. Santhoshkumar";

                String Subject1V = "Microprocessor and its Applications";
                String Staff1V = "Mr. S. Mohanraj";
                String Subject2V = "Programming with XML";
                String Staff2V = "Mr. M. Santhoshkumar";
                String Subject3V = "Non Major Elective";
                String Staff3V = " ";
                String Subject4V = "Microprocessor and its Applications (Practical)";
                String Staff4V = "Mr. S. MohanRaj | Mr. M. SarlinRaj | Mr. M. Santhoshkumar";
                String Subject5V = "Microprocessor and its Applications (Practical)";
                String Staff5V = "Mr. S. MohanRaj | Mr. M. SarlinRaj | Mr. M. Santhoshkumar";

                String Subject1VI = "Microprocessor and its Applications";
                String Staff1VI = "Mr. S. MohanRaj";
                String Subject2VI = "Computer Networks";
                String Staff2VI = "Mrs. A. Josephine Sagaya Mala";
                String Subject3VI = "Mobile Apps - Android Development";
                String Staff3VI = "Mr. P. Karthik";
                String Subject4VI = "Programming with XML";
                String Staff4VI = "Mr. M. Santhoshkumar";
                String Subject5VI = "Project";
                String Staff5VI = "Mr. S. MohanRaj";

                intent.putExtra("year",year);
                intent.putExtra("Subject1I", Subject1I);
                intent.putExtra("Staff1I", Staff1I);
                intent.putExtra("Subject2I", Subject2I);
                intent.putExtra("Staff2I", Staff2I);
                intent.putExtra("Subject3I", Subject3I);
                intent.putExtra("Staff3I", Staff3I);
                intent.putExtra("Subject4I", Subject4I);
                intent.putExtra("Staff4I", Staff4I);
                intent.putExtra("Subject5I", Subject5I);
                intent.putExtra("Staff5I", Staff5I);

                intent.putExtra("Subject1II", Subject1II);
                intent.putExtra("Staff1II", Staff1II);
                intent.putExtra("Subject2II", Subject2II);
                intent.putExtra("Staff2II", Staff2II);
                intent.putExtra("Subject3II", Subject3II);
                intent.putExtra("Staff3II", Staff3II);
                intent.putExtra("Subject4II", Subject4II);
                intent.putExtra("Staff4II", Staff4II);
                intent.putExtra("Subject5II", Subject5II);
                intent.putExtra("Staff5II", Staff5II);

                intent.putExtra("Subject1III", Subject1III);
                intent.putExtra("Staff1III", Staff1III);
                intent.putExtra("Subject2III", Subject2III);
                intent.putExtra("Staff2III", Staff2III);
                intent.putExtra("Subject3III", Subject3III);
                intent.putExtra("Staff3III", Staff3III);
                intent.putExtra("Subject4III", Subject4III);
                intent.putExtra("Staff4III", Staff4III);
                intent.putExtra("Subject5III", Subject5III);
                intent.putExtra("Staff5III", Staff5III);

                intent.putExtra("Subject1IV", Subject1IV);
                intent.putExtra("Staff1IV", Staff1IV);
                intent.putExtra("Subject2IV", Subject2IV);
                intent.putExtra("Staff2IV", Staff2IV);
                intent.putExtra("Subject3IV", Subject3IV);
                intent.putExtra("Staff3IV", Staff3IV);
                intent.putExtra("Subject4IV", Subject4IV);
                intent.putExtra("Staff4IV", Staff4IV);
                intent.putExtra("Subject5IV", Subject5IV);
                intent.putExtra("Staff5IV", Staff5IV);

                intent.putExtra("Subject1V", Subject1V);
                intent.putExtra("Staff1V", Staff1V);
                intent.putExtra("Subject2V", Subject2V);
                intent.putExtra("Staff2V", Staff2V);
                intent.putExtra("Subject3V", Subject3V);
                intent.putExtra("Staff3V", Staff3V);
                intent.putExtra("Subject4V", Subject4V);
                intent.putExtra("Staff4V", Staff4V);
                intent.putExtra("Subject5V", Subject5V);
                intent.putExtra("Staff5V", Staff5V);

                intent.putExtra("Subject1VI", Subject1VI);
                intent.putExtra("Staff1VI", Staff1VI);
                intent.putExtra("Subject2VI", Subject2VI);
                intent.putExtra("Staff2VI", Staff2VI);
                intent.putExtra("Subject3VI", Subject3VI);
                intent.putExtra("Staff3VI", Staff3VI);
                intent.putExtra("Subject4VI", Subject4VI);
                intent.putExtra("Staff4VI", Staff4VI);
                intent.putExtra("Subject5VI", Subject5VI);
                intent.putExtra("Staff5VI", Staff5VI);

                startActivity(intent);
                finish();
            }
          if(!Iyear.isChecked() && !IIyear.isChecked() && !IIIyear.isChecked()) {
              Animation animation = AnimationUtils.loadAnimation(this,R.anim.bounce);
              showdayorder.startAnimation(animation);
              FancyToast.makeText(TimeTableYear.this, "Select a Year", FancyToast.LENGTH_SHORT, FancyToast.INFO, false).show();
          }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(TimeTableYear.this, Home.class);
        startActivity(intent);
        finish();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
