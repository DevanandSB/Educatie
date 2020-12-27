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
        //        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

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
                String Subject1I = "Allied Mathematics - I";
                String Staff1I = "Miss D. Saraswathi ";
                String Subject2I = "Digital Computer Fundamentals";
                String Staff2I = "Mr. D. Adhiyaman";
                String Subject3I = "English for Basic Communication";
                String Staff3I = "PB-e";
                String Subject4I = "I Day Order, I Year, IV Hour";
                String Staff4I = "Staff Name";
                String Subject5I = "I Day Order, I Year, V Hour";
                String Staff5I = "Staff Name";

                String Subject1II = "Personal Skills";
                String Staff1II = "Staff Not mentioned";
                String Subject2II = "Web Design Concepts";
                String Staff2II = "Mrs. A. Josephine Sagaya Mala";
                String Subject3II = "பொது தமிழ் - I";
                String Staff3II = "Dr. A. Chandran";
                String Subject4II = "II Day Order, I Year, IV Hour";
                String Staff4II = "Staff Name";
                String Subject5II = "II Day Order, I Year, V Hour";
                String Staff5II = "Staff Name";

                String Subject1III = "English for Basic Communication";
                String Staff1III = "Mr. PB-e";
                String Subject2III = "Allied Mathematics - I";
                String Staff2III = "Mr. D S";
                String Subject3III = "Digital Computer Fundamentals";
                String Staff3III = "Mr. D. Adhiyaman";
                String Subject4III = "III Day Order, I Year, IV Hour";
                String Staff4III = "Staff Name";
                String Subject5III = "III Day Order, I Year, V Hour";
                String Staff5III = "Staff Name";

                String Subject1IV = "பொது தமிழ் - I";
                String Staff1IV = "Mr. B M";
                String Subject2IV = "Web Design Concepts";
                String Staff2IV = "Mrs. A. Josephine Sagaya Mala";
                String Subject3IV = "Personal Skills";
                String Staff3IV = "Staff not mentioned";
                String Subject4IV = "IV Day Order, I Year, IV Hour";
                String Staff4IV = "Staff Name";
                String Subject5IV = "IV Day Order, I Year, V Hour";
                String Staff5IV = "Staff Name";

                String Subject1V = "Value Education";
                String Staff1V = "Staff not mentioned";
                String Subject2V = "English for Basic Communication";
                String Staff2V = "Mr. PB-e";
                String Subject3V = "Allied Mathematics - I";
                String Staff3V = "Mr. D S";
                String Subject4V = "V Day Order, I Year, IV Hour";
                String Staff4V = "Staff Name";
                String Subject5V = "V Day Order, I Year, V Hour";
                String Staff5V = "Staff Name";

                String Subject1VI = "Hour not mentioned";
                String Staff1VI = " ";
                String Subject2VI = "பொது தமிழ் - I";
                String Staff2VI = "Mr. B M";
                String Subject3VI = "Value Education";
                String Staff3VI = "Staff not mentioned";
                String Subject4VI = "VI Day Order, I Year, IV Hour";
                String Staff4VI = "Staff Name";
                String Subject5VI = "VI Day Order, I Year, V Hour";
                String Staff5VI = "Staff Name";

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
                String Subject1I = "English for Public Communication";
                String Staff1I = "Mr. M L";
                String Subject2I = "Allied Physics for Computer Science - I";
                String Staff2I = "Mr. L. Anandaraj";
                String Subject3I = "Communication Skills";
                String Staff3I = "Staff not mentioned";
                String Subject4I = "I Day Order, II Year, IV Hour";
                String Staff4I = "Staff Name";
                String Subject5I = "I Day Order, II Year, V Hour";
                String Staff5I = "Staff Name";

                String Subject1II = "பொது தமிழ் - III";
                String Staff1II = "Dr. M. Sarala Devi";
                String Subject2II = "Value Education";
                String Staff2II = "Staff not  mentioned";
                String Subject3II = "Data Structures and Algorithms in C";
                String Staff3II = "Mr. M. Sarlinraj";
                String Subject4II = "II Day Order, II Year, IV Hour";
                String Staff4II = "Staff Name";
                String Subject5II = "II Day Order, II Year, V Hour";
                String Staff5II = "Staff Name";

                String Subject1III = "3";
                String Staff1III = " ";
                String Subject2III = "Object Oriented Programming with C++";
                String Staff2III = "Mr. S. Mohanraj";
                String Subject3III = "English for Public Communication";
                String Staff3III = "Mr. M L";
                String Subject4III = "III Day Order, II Year, IV Hour";
                String Staff4III = "Staff Name";
                String Subject5III = "III Day Order, II Year, V Hour";
                String Staff5III = "Staff Name";

                String Subject1IV = "Object Oriented Programming with C++";
                String Staff1IV = "Mr. S. Mohanraj";
                String Subject2IV = "Allied Physics for Computer Science - I";
                String Staff2IV = "Mr. L. Anandaraj";
                String Subject3IV = "பொது தமிழ் - III";
                String Staff3IV = "Dr. M. Sarala Devi";
                String Subject4IV = "IV Day Order, II Year, IV Hour";
                String Staff4IV = "Staff Name";
                String Subject5IV = "IV Day Order, II Year, V Hour";
                String Staff5IV = "Staff Name";

                String Subject1V = "Value Education";
                String Staff1V = "Staff not mentioned";
                String Subject2V = "English for Public Communication";
                String Staff2V = "Mr. M L";
                String Subject3V = "Data Structures and Algorithms in C";
                String Staff3V = "Mr. M. Sarlinraj";
                String Subject4V = "V Day Order, II Year, IV Hour";
                String Staff4V = "Staff Name";
                String Subject5V = "V Day Order, II Year, V Hour";
                String Staff5V = "Staff Name";

                String Subject1VI = "Data Structures and Algorithms in C";
                String Staff1VI = "Mr. M. Sarlinraj";
                String Subject2VI = "பொது தமிழ் - III";
                String Staff2VI = "Dr. M. Sarala Devi";
                String Subject3VI = "Allied Physics for Computer Science - I";
                String Staff3VI = "Mr. L. Anandaraj";
                String Subject4VI = "VI Day Order, II Year, IV Hour";
                String Staff4VI = "Staff Name";
                String Subject5VI = "VI Day Order, II Year, V Hour";
                String Staff5VI = "Staff Name";

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
                String Subject1I = "Linux and Shell Programming";
                String Staff1I = "Mr. D. Adhiyaman";
                String Subject2I = "Software Engineering";
                String Staff2I = "Mr. M. Sarlinraj";
                String Subject3I = "Operating System";
                String Staff3I = "Mrs. A. Joesphine Sagaya Mala";
                String Subject4I = "I Day Order, III Year, IV Hour";
                String Staff4I = "Staff Name";
                String Subject5I = "I Day Order, III Year, V Hour";
                String Staff5I = "Staff Name";

                String Subject1II = "1";
                String Staff1II = " ";
                String Subject2II = "Programming With Java";
                String Staff2II = "Mr. P. Karthik";
                String Subject3II = "Programming with PHP";
                String Staff3II = "Mr. S. Mohanraj";
                String Subject4II = "II Day Order, III Year, IV Hour";
                String Staff4II = "Staff Name";
                String Subject5II = "II Day Order, III Year, V Hour";
                String Staff5II = "Staff Name";

                String Subject1III = "Operating System";
                String Staff1III = "Mrs. A. Josephine Sagaya Mala";
                String Subject2III = "Linux and Shell Programming";
                String Staff2III = "Mr. D. Adhiyaman";
                String Subject3III = "Software Engineering";
                String Staff3III = "Mr. M. Sarlinraj";
                String Subject4III = "III Day Order, III Year, IV Hour";
                String Staff4III = "Staff Name";
                String Subject5III = "III Day Order, III Year, V Hour";
                String Staff5III = "Staff Name";

                String Subject1IV = "2";
                String Staff1IV = " ";
                String Subject2IV = "3";
                String Staff2IV = " ";
                String Subject3IV = "Programming with Java";
                String Staff3IV = "Mr. P. Karthik";
                String Subject4IV = "IV Day Order, III Year, IV Hour";
                String Staff4IV = "Staff Name";
                String Subject5IV = "IV Day Order, III Year, V Hour";
                String Staff5IV = "Staff Name";

                String Subject1V = "Programming with Java";
                String Staff1V = "Mr. P. Karthik";
                String Subject2V = "Linux and Shell programming";
                String Staff2V = "Mr. S. Mohanraj";
                String Subject3V = "Operating System";
                String Staff3V = "Mrs. A. Josephine Sagaya Mala";
                String Subject4V = "V Day Order, III Year, IV Hour";
                String Staff4V = "Staff Name";
                String Subject5V = "V Day Order, III Year, V Hour";
                String Staff5V = "Staff Name";

                String Subject1VI = "Programming with Java";
                String Staff1VI = "Mr. P. Karthik";
                String Subject2VI = "Programming With PHP";
                String Staff2VI = "Mr. S. Mohanraj";
                String Subject3VI = "Software Engineering";
                String Staff3VI = "Mr. M. Sarlinraj";
                String Subject4VI = "VI Day Order, III Year, IV Hour";
                String Staff4VI = "Staff Name";
                String Subject5VI = "VI Day Order, III Year, V Hour";
                String Staff5VI = "Staff Name";

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
