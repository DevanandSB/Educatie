package com.edu.educatie;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

import com.shashank.sony.fancytoastlib.FancyToast;

public class RadioActivity extends AppCompatActivity {

    Button show;
    RadioButton I, II, III;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        show = findViewById(R.id.showtimetable);
        I = findViewById(R.id.Iexam);
        II = findViewById(R.id.IIexam);
        III = findViewById(R.id.IIIexam);


        show.setOnClickListener(view -> {
            if(I.isChecked())
            {
                String CAI1s = "பொது தமிழ் - I";
                String CAI1t = "Mr. Unknown";
                String CAI2s = "English for General Communication";
                String CAI2t = "Mr. Unknown";
                String CAI3s = "Allied Mathematics - I";
                String CAI3t = "Mr. Unknown";
                String CAI4s = "Digital Computer Fundamentals";
                String CAI4t = "Mr. Unknown";
                String CAI5s = "Web Design Concepts";
                String CAI5t = "Mr. Unknown";

                String CAII1s = "பொது தமிழ் - I";
                String CAII1t = "Mr. Unknown";
                String CAII2s = "English for General Communication";
                String CAII2t = "Mr. Unknown";
                String CAII3s = "Allied Mathematics - I";
                String CAII3t = "Mr. Unknown";
                String CAII4s = "Digital Computer Fundamentals";
                String CAII4t = "Mr. Unknown";
                String CAII5s = "Web Design Concepts";
                String CAII5t = "Mr. Unknown";

                Intent intent = new Intent(getApplicationContext(), Exams.class);

                intent.putExtra("CAI1s",CAI1s);
                intent.putExtra("CAI1t",CAI1t);
                intent.putExtra("CAI2s",CAI2s);
                intent.putExtra("CAI2t",CAI2t);
                intent.putExtra("CAI3s",CAI3s);
                intent.putExtra("CAI3t",CAI3t);
                intent.putExtra("CAI4s",CAI4s);
                intent.putExtra("CAI4t",CAI4t);
                intent.putExtra("CAI5s",CAI5s);
                intent.putExtra("CAI5t",CAI5t);

                intent.putExtra("CAII1s",CAII1s);
                intent.putExtra("CAII1t",CAII1t);
                intent.putExtra("CAII2s",CAII2s);
                intent.putExtra("CAII2t",CAII2t);
                intent.putExtra("CAII3s",CAII3s);
                intent.putExtra("CAII3t",CAII3t);
                intent.putExtra("CAII4s",CAII4s);
                intent.putExtra("CAII4t",CAII4t);
                intent.putExtra("CAII5s",CAII5s);
                intent.putExtra("CAII5t",CAII5t);

                startActivity(intent);
            }
            if(II.isChecked())
            {
                String CAI1s = "பொது தமிழ் - III";
                String CAI1t = "Dr. M. Sarala Devi";
                String CAI2s = "English for Public Communication";
                String CAI2t = "Mr. Unknown";
                String CAI3s = "Allied Physics for Computer Science - I";
                String CAI3t = "Mr. L. Anandaraj";
                String CAI4s = "Object Oriented Programming with C++";
                String CAI4t = "Mr. S. Mohanraj ";
                String CAI5s = "Data Structure and Algorithms";
                String CAI5t = "Mr. M. Sarlinraj";

                String CAII1s = "பொது தமிழ் - III";
                String CAII1t = "Dr. M. Sarala Devi";
                String CAII2s = "English for Public Communication";
                String CAII2t = "Mr. Unknown";
                String CAII3s = "Allied Physics for Computer Science - I";
                String CAII3t = "Mr. L. Anandaraj";
                String CAII4s = "Object Oriented Programming with C++";
                String CAII4t = "Mr. S. Mohanraj";
                String CAII5s = "DataStructure and Algorithms";
                String CAII5t = "Mr. M. Sarlinraj";

                Intent intent = new Intent(getApplicationContext(), Exams.class);

                intent.putExtra("CAI1s",CAI1s);
                intent.putExtra("CAI1t",CAI1t);
                intent.putExtra("CAI2s",CAI2s);
                intent.putExtra("CAI2t",CAI2t);
                intent.putExtra("CAI3s",CAI3s);
                intent.putExtra("CAI3t",CAI3t);
                intent.putExtra("CAI4s",CAI4s);
                intent.putExtra("CAI4t",CAI4t);
                intent.putExtra("CAI5s",CAI5s);
                intent.putExtra("CAI5t",CAI5t);

                intent.putExtra("CAII1s",CAII1s);
                intent.putExtra("CAII1t",CAII1t);
                intent.putExtra("CAII2s",CAII2s);
                intent.putExtra("CAII2t",CAII2t);
                intent.putExtra("CAII3s",CAII3s);
                intent.putExtra("CAII3t",CAII3t);
                intent.putExtra("CAII4s",CAII4s);
                intent.putExtra("CAII4t",CAII4t);
                intent.putExtra("CAII5s",CAII5s);
                intent.putExtra("CAII5t",CAII5t);

                startActivity(intent);
            }
            if(III.isChecked())
            {
                String CAI1s = "Programming with Java";
                String CAI1t = "Mr. P. Karthik";
                String CAI2s = "Operating System";
                String CAI2t = "Mrs. A. Josephine Sagaya Mala";
                String CAI3s = "Software Engineering";
                String CAI3t = "Mr. M. Sarlinraj";
                String CAI4s = "Linux and Shell Programming";
                String CAI4t = "Mr. D. Adhiyaman";
                String CAI5s = "Programming with PHP";
                String CAI5t = "Mr. S. Mohanraj";

                String CAII1s = "Programming with Java";
                String CAII1t = "Mr. P. Karthik";
                String CAII2s = "Operating System";
                String CAII2t = "Mrs. A. Josephine Sagaya Mala";
                String CAII3s = "Software Engineering";
                String CAII3t = "Mr. M. Sarlinraj";
                String CAII4s = "Linux and Shell Programming";
                String CAII4t = "Mr. D. Adhiyaman";
                String CAII5s = "Programming with PHP";
                String CAII5t = "Mr. S. Mohanraj";

                Intent intent = new Intent(getApplicationContext(), Exams.class);

                intent.putExtra("CAI1s",CAI1s);
                intent.putExtra("CAI1t",CAI1t);
                intent.putExtra("CAI2s",CAI2s);
                intent.putExtra("CAI2t",CAI2t);
                intent.putExtra("CAI3s",CAI3s);
                intent.putExtra("CAI3t",CAI3t);
                intent.putExtra("CAI4s",CAI4s);
                intent.putExtra("CAI4t",CAI4t);
                intent.putExtra("CAI5s",CAI5s);
                intent.putExtra("CAI5t",CAI5t);

                intent.putExtra("CAII1s",CAII1s);
                intent.putExtra("CAII1t",CAII1t);
                intent.putExtra("CAII2s",CAII2s);
                intent.putExtra("CAII2t",CAII2t);
                intent.putExtra("CAII3s",CAII3s);
                intent.putExtra("CAII3t",CAII3t);
                intent.putExtra("CAII4s",CAII4s);
                intent.putExtra("CAII4t",CAII4t);
                intent.putExtra("CAII5s",CAII5s);
                intent.putExtra("CAII5t",CAII5t);

                startActivity(intent);
            }
            if(!I.isChecked() && !II.isChecked() && !III.isChecked()) {
                Animation animation = AnimationUtils.loadAnimation(this,R.anim.bounce);
                show.startAnimation(animation);
                FancyToast.makeText(RadioActivity.this, "Select a Year", FancyToast.LENGTH_SHORT, FancyToast.INFO, false).show();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(RadioActivity.this, Home.class);
        startActivity(intent);
        finish();
    }
}