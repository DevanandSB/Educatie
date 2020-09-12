package com.edu.educatie;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.edu.educatie.Onboarding.OnboardingActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.shashank.sony.fancytoastlib.FancyToast;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    LinearLayout profile;
    TextView enroll1, viewcertificate1;
    TextView profilEmail, profileName;
    LinearLayout sI3, sII3, sIII3, sIV3, sV3;
    LinearLayout sI2, sII2, sIII2, sIV2, sV2;
    LinearLayout sI1, sII1, sIII1, sIV1, sV1;
    CardView MoodleE;

    String[] urls = new String[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        profilEmail = findViewById(R.id.profilemail);
        profileName = findViewById(R.id.profilename);

        urls[0] = "https://learndigital.withgoogle.com/digitalunlocked/course/digital-marketing"; //Google Digital Marketing
        urls[1] = "http://educatie.me/certificate"; //Sample Certificate
        urls[2] = "http://educatie.me/lms/login/index.php"; //Moodle
        FloatingActionButton fab = findViewById(R.id.fab);

        //Third Year
        sI3 = findViewById(R.id.sI3);
        sII3 = findViewById(R.id.sII3);
        sIII3 = findViewById(R.id.sIII3);
        sIV3 = findViewById(R.id.sIV3);
        sV3 = findViewById(R.id.sV3);

        //Second Year
        sI2 = findViewById(R.id.sI2);
        sII2 = findViewById(R.id.sII2);
        sIII2 = findViewById(R.id.sIII2);
        sIV2 = findViewById(R.id.sIV2);
        sV2 = findViewById(R.id.sV2);

        //First Year
        sI1 = findViewById(R.id.sI1);
        sII1 = findViewById(R.id.sII1);
        sIII1 = findViewById(R.id.sIII1);
        sIV1 = findViewById(R.id.sIV1);
        sV1 = findViewById(R.id.sV1);

        enroll1 = findViewById(R.id.enroll1);
        viewcertificate1 = findViewById(R.id.viewcertificate1);
        MoodleE = findViewById(R.id.moodleEducatie);
        //Third Year
        sI3.setOnClickListener(view -> {

            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sI3.startAnimation(animation);
            String sname = "Mr. P. Karthik";
            String sname1 = "Mr. P. Karthik";
            String designation = "Assistant Professor";
            String Department = "Department of Computer Science";
            String qualification = "M.Sc., B.Ed.,";
            String place = "Tirupattur";
            String mail = "karthikp@shctpt.edu";
            Intent intent = new Intent(Home.this, MyProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("department", Department);
            intent.putExtra("department1", Department);
            intent.putExtra("sname1", sname1);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("mail", mail);
            startActivity(intent);
        });
        sII3.setOnClickListener(view -> {

            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sII3.startAnimation(animation);
            String sname = "Mrs. A. Josephine Sagaya Mala";
            String sname1 = "Mrs. A. Josephine Sagaya Mala";
            String Department = "Department of Computer Science";
            String designation = "Head of the Department (CS)";
            String qualification = "M.Com., M.C.A., M.Phil.,";
            String place = "Tirupattur";
            String mail = "sagayamala@shctpt.edu";
            Intent intent = new Intent(Home.this, MyProfile.class);
            intent.putExtra("department", Department);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("mail", mail);
            startActivity(intent);
        });
        sIII3.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sIII3.startAnimation(animation);
            String sname = "Mr. M. Sarlinraj";
            String sname1 = "Mr. M. Sarlinraj";
            String Department = "Department of Computer Science";
            String designation = "Assistant Professor";
            String qualification = "M.Sc., M.Phil., B.Ed.,";
            String place = "Tirupattur";
            String mail = "serlinraj@shctpt.edu";
            Intent intent = new Intent(Home.this, MyProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("department", Department);
            intent.putExtra("mail", mail);
            startActivity(intent);
        });
        sIV3.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sIV3.startAnimation(animation);
            String sname = "Mr. D. Adhiyaman";
            String sname1 = "Mr. D. Adhiyaman";
            String Department = "Department of Computer Science";
            String designation = "Assistant Professor";
            String qualification = "M.Sc., M.Phil., B.Ed.,";
            String place = "Tirupattur";
            String mail = "adhiyaman@shctpt.edu";
            Intent intent = new Intent(Home.this, MyProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("department", Department);
            intent.putExtra("mail", mail);
            startActivity(intent);
        });
        sV3.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sV3.startAnimation(animation);
            String sname = "Mr. S. Mohanraj";
            String sname1 = "Mr. S. Mohanraj";
            String designation = "Assistant Professor";
            String Department = "Department of Computer Science";
            String qualification = "M.C.A., M.Phil.,";
            String place = "Tirupattur";
            String mail = "mohanraj@shctpt.edu";
            Intent intent = new Intent(Home.this, MyProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("department", Department);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("mail", mail);
            startActivity(intent);
        });

        //Second Year
        sI2.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sI2.startAnimation(animation);
            String sname = "Dr. M. Sarala Devi";
            String sname1 = "Dr. M. Sarala Devi";
            String designation = "Assistant Professor";
            String qualification = "M.A., M.Phil., Ph.D.";
            String Department = "Department of Tamil";
            String place = "Unknown";
            String mail = "saraladevi@shctpt.edu";
            Intent intent = new Intent(Home.this, MyProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("department", Department);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("mail", mail);
            startActivity(intent);
        });
        sII2.setOnClickListener(view -> {

            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sII2.startAnimation(animation);
            String sname = "Mr. Unknown";
            String sname1 = "Mr. Unknown";
            String designation = "Assistant Professor";
            String Department = "Department of English";
            String qualification = "Unknown";
            String place = "Unknown";
            String mail = "unknown@shctpt.edu";
            Intent intent = new Intent(Home.this, MyProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("department", Department);
            intent.putExtra("sname1", sname1);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("mail", mail);
            startActivity(intent);
        });
        sIII2.setOnClickListener(view -> {

            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sIII2.startAnimation(animation);
            String sname = "Mr. L. Anandaraj";
            String sname1 = "Mr. L. Anandaraj";
            String designation = "Assistant Professor";
            String Department = "Department of Physics";
            String qualification = "M.Sc., M.Phil., B.Ed.,";
            String place = "Tirupattur";
            String mail = "anandaraj@shctpt.edu";
            Intent intent = new Intent(Home.this, MyProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("department", Department);
            intent.putExtra("mail", mail);
            startActivity(intent);
        });
        sIV2.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sIV2.startAnimation(animation);
            String sname = "Mr. S. Mohanraj";
            String sname1 = "Mr. S. Mohanraj";
            String designation = "Assistant Professor";
            String Department = "Department of Computer Science";
            String qualification = "M.C.A., M.Phil.,";
            String place = "Tirupattur";
            String mail = "mohanraj@shctpt.edu";
            Intent intent = new Intent(Home.this, MyProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("department", Department);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("mail", mail);
            startActivity(intent);
        });
        sV2.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sV2.startAnimation(animation);
            String sname = "Mr. M. Sarlinraj";
            String sname1 = "Mr. M. Sarlinraj";
            String Department = "Department of Computer Science";
            String designation = "Assistant Professor";
            String qualification = "M.Sc., M.Phil., B.Ed.,";
            String place = "Tirupattur";
            String mail = "serlinraj@shctpt.edu";
            Intent intent = new Intent(Home.this, MyProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("department", Department);
            intent.putExtra("mail", mail);
            startActivity(intent);
        });

        //Second Year
        sI1.setOnClickListener(view -> {

            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sI1.startAnimation(animation);
            String sname = "Name here";
            String sname1 = "Name here";
            String designation = "Assistant Professor";
            String qualification = "Qualification";
            String Department = "Department of Tamil";
            String place = "Unknown";
            String mail = "unknown@shctpt.edu";
            Intent intent = new Intent(Home.this, MyProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("department", Department);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("mail", mail);
            startActivity(intent);
        });
        sII1.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sII1.startAnimation(animation);
            String sname = "Mr. S. Prabakaran";
            String sname1 = "Mr. S. Prabakaran";
            String designation = "Assistant Professor";
            String Department = "Department of English";
            String qualification = "M.A., M.Phil.,";
            String place = "Unknown";
            String mail = "prabhakaran@shctpt.edu";
            Intent intent = new Intent(Home.this, MyProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("department", Department);
            intent.putExtra("sname1", sname1);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("mail", mail);
            startActivity(intent);
        });
        sIII1.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sIII1.startAnimation(animation);
            String sname = "Miss D. Saraswathi";
            String sname1 = "Miss D. Saraswathi";
            String designation = "Assistant Professor";
            String Department = "Department of Mathematics";
            String qualification = "M.Sc., M.Phil.,";
            String place = "Unknown";
            String mail = "saraswathi@shctpt.edu";
            Intent intent = new Intent(Home.this, MyProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("department", Department);
            intent.putExtra("mail", mail);
            startActivity(intent);
        });
        sIV1.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sIV1.startAnimation(animation);
            String sname = "Mr. D. Adhiyaman";
            String sname1 = "Mr. D. Adhiyaman";
            String Department = "Department of Computer Science";
            String designation = "Assistant Professor";
            String qualification = "M.Sc., M.Phil., B.Ed.,";
            String place = "Tirupattur";
            String mail = "adhiyaman@shctpt.edu";
            Intent intent = new Intent(Home.this, MyProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("department", Department);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("mail", mail);
            startActivity(intent);
        });
        sV1.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sV1.startAnimation(animation);
            String sname = "Mrs. A. Josephine Sagaya Mala";
            String sname1 = "Mrs. A. Josephine Sagaya Mala";
            String Department = "Department of Computer Science";
            String designation = "Head of the Department (CS)";
            String qualification = "M.Com., M.C.A., M.Phil.,";
            String place = "Tirupattur";
            String mail = "sagayamala@shctpt.edu";
            Intent intent = new Intent(Home.this, MyProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("department", Department);
            intent.putExtra("mail", mail);
            startActivity(intent);
        });

        MoodleE.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            MoodleE.startAnimation(animation);
            Intent intent = new Intent(getApplicationContext(), HomeWeb.class);
            intent.putExtra("Links",urls[2]);
            startActivity(intent);
            finish();
        });


        enroll1.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            enroll1.startAnimation(animation);
            Intent intent = new Intent(getApplicationContext(), HomeWeb.class);
            intent.putExtra("Links",urls[0]);
            startActivity(intent);
            finish();
        });

        viewcertificate1.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            viewcertificate1.startAnimation(animation);
            Intent intent = new Intent(getApplicationContext(), HomeWeb.class);
            intent.putExtra("Links",urls[1]);
            startActivity(intent);
            finish();
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        View header = navigationView.getHeaderView(0);

        profile = header.findViewById(R.id.profile);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_courses) {
            Intent intent = new Intent(getApplicationContext(), Subjects.class);
            startActivity(intent);
            finish();
        }else if(id == R.id.nav_home) {
            Intent intent = new Intent(getApplicationContext(), Home.class);
            startActivity(intent);
            finish();
//        } else if (id == R.id.nav_events) {
//            Intent intent = new Intent(getApplicationContext(), Events.class);
//            startActivity(intent);
        } else if (id == R.id.timetables) {
            Intent intent = new Intent(getApplicationContext(), TimeTableYear.class);
            startActivity(intent);
            finish();
        }else if (id == R.id.lounge) {
            FancyToast.makeText(Home.this, "Feature Available Soon", FancyToast.LENGTH_SHORT, FancyToast.INFO, false).show();
        }else if (id == R.id.myprofile) {
            FancyToast.makeText(Home.this, "Innum ready pannala irru da", FancyToast.LENGTH_SHORT, FancyToast.ERROR, false).show();
        }else if (id == R.id.onlinecourses) {
                Intent intent = new Intent(getApplicationContext(), FreeCourses.class);
                startActivity(intent);
                finish();
        } else if (id == R.id.exams) {
            Intent intent = new Intent(getApplicationContext(), RadioActivity.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.info) {
            Intent intent = new Intent(getApplicationContext(), OnboardingActivity.class);
            startActivity(intent);
            finish();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.profile) {

        }
    }
}