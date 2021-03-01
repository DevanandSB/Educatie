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
                String CAI1s = "பொது தமிழ் - II";
                String CAI1t = "Dr. R. Sankar";
                String CAI2s = "English for Basic Communication";
                String CAI2t = "Mr. S. Prabhakaran";
                String CAI3s = "Allied Mathematics - II";
                String CAI3t = "Miss. D. Saraswathi";
                String CAI4s = "Computer Organisation and Architecture";
                String CAI4t = "Mr. M. Santhoshkumar";
                String CAI5s = "Programming With C";
                String CAI5t = "Mrs. A. Josephine Sagaya Mala";

                String CAII1s = "பொது தமிழ் - II";
                String CAII1t = "Dr. R. Sankar";
                String CAII2s = "English for Basic Communication";
                String CAII2t = "Mr. S. Parbhakaran";
                String CAII3s = "Allied Mathematics - II";
                String CAII3t = "Miss. D. Saraswathi";
                String CAII4s = "Computer Organisation and Architecture";
                String CAII4t = "Mr. M. Santhoshkumar";
                String CAII5s = "Programming with C";
                String CAII5t = "Mrs. A. Josephine Sagaya Mala";

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
                String CAI1s = "பொது தமிழ் - IV";
                String CAI1t = "Dr. M. Sarala Devi";
                String CAI2s = "English for Business Communication";
                String CAI2t = "Mr. Unknown";
                String CAI3s = "Allied Physics for Computer Science - II";
                String CAI3t = "Mr. L. Anandaraj";
                String CAI4s = "Computer Graphics";
                String CAI4t = "Mr. M. Sarlin Raj";
                String CAI5s = "Relational Database Management System";
                String CAI5t = "Mr. P. Karthik";

                String CAII1s = "பொது தமிழ் - IV";
                String CAII1t = "Dr. M. Sarala Devi";
                String CAII2s = "English for Business Communication";
                String CAII2t = "Mr. Unknown";
                String CAII3s = "Allied Physics for Computer Science - II";
                String CAII3t = "Mr. L. Anandaraj";
                String CAII4s = "Computer Graphics";
                String CAII4t = "Mr. M. Sarlin Raj";
                String CAII5s = "Relational Database Management System";
                String CAII5t = "Mr. P. Karthik";

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
                String CAI1s = "Microprocessor and its Applications";
                String CAI1t = "Mr. S. Mohanraj";
                String CAI2s = "Web Development using XML";
                String CAI2t = "Mr. M. Santhoshkumar";
                String CAI3s = "Mobile Apps - Android Development";
                String CAI3t = "Mr. P. Karthik";
                String CAI4s = "Programming with Python";
                String CAI4t = "Mr. M. Sarlin Raj";
                String CAI5s = "Computer Networks";
                String CAI5t = "Mrs. A. Josephine Sagaya Mala";

                String CAII1s = "Microprocessor and its Application";
                String CAII1t = "Mr. S. Mohanraj";
                String CAII2s = "Web Development using XML";
                String CAII2t = "Mr. M. Santhoshkumar";
                String CAII3s = "Mobile Apps - Android Development";
                String CAII3t = "Mr. P. Karthik";
                String CAII4s = "Programming With Python";
                String CAII4t = "Mr. M. Sarlin Raj";
                String CAII5s = "Computer Networks";
                String CAII5t = "Mrs. A. Josephine Sagaya Mala";

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