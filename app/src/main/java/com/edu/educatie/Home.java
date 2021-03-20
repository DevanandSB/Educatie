package com.edu.educatie;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.edu.educatie.Onboarding.OnboardingActivity;
import com.edu.educatie.activities.MainActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.shashank.sony.fancytoastlib.FancyToast;

import java.util.Objects;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    LinearLayout profile;
    TextView enroll1, viewcertificate1;
    TextView profilEmail, profileName;
    LinearLayout sI3, sII3, sIII3, sIV3, sV3;
    LinearLayout sI2, sII2, sIII2, sIV2, sV2;
    LinearLayout sI1, sII1, sIII1, sIV1, sV1;
    CardView MoodleE;
    TextView enrollLinux, enrollPython, certiLinux, certiPython;

    private long backPressedTime;
    private Toast backToast;
    String[] urls = new String[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        profilEmail = findViewById(R.id.profilemail);
        profileName = findViewById(R.id.profilename);
        viewcertificate1 = findViewById(R.id.viewcertificate1);

        urls[0] = "https://learndigital.withgoogle.com/digitalunlocked/course/digital-marketing"; //Google Digital Marketing
        urls[1] = "https://educatie.me/certificate"; //Sample Certificate
        urls[2] = "https://educatie.me/CS/login/index.php"; //Moodle
        urls[3] = "https://educatie.me/linuxCerti"; //Linux Udemy Certificate
        urls[4] = "https://educatie.me/pythonCerti"; //Python Udemy Certificate
        urls[5] = "https://www.udemy.com/course/linux-operating-system-for-beginners-in-tamil/"; //Linux Udemy Certificate
        urls[6] = "https://www.udemy.com/course/python-programming-with-real-life-example/";
        urls[7] = "https://www.buymeacoffee.com/DevanandSB";
        urls[8] = "https://github.com/DevanandSB";

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
        MoodleE = findViewById(R.id.moodleEducatie);

        enrollLinux = findViewById(R.id.myeCourseEnroll1);
        certiLinux = findViewById(R.id.myCourseViewCertificate1);
        enrollPython = findViewById(R.id.myeCourseEnroll2);
        certiPython = findViewById(R.id.myCourseViewCertificate2);


        //Third Year
        sI3.setOnClickListener(view -> {

            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sI3.startAnimation(animation);
            String sname = "Mr. S. Mohanraj";
            String sname1 = "Mr. S. Mohanraj";
            String designation = "Assistant Professor";
            String Department = "Department of Computer Science";
            String qualification = "M.C.A., M.Phil.,";
            String place = "Tirupattur";
            String mail = "mohanraj@shctpt.edu";
            Intent intent = new Intent(Home.this, StaffProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("department", Department);
            intent.putExtra("department1", Department);
            intent.putExtra("sname1", sname1);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("mail", mail);
            startActivity(intent);
            finish();
        });
        sII3.setOnClickListener(view -> {

            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sII3.startAnimation(animation);
            String sname = "Santhoshkumar M";
            String sname1 = "Santhoshkumar M";
            String Department = "Department of Computer Science";
            String designation = "Assistant Professor";
            String qualification = "M.Sc., M.Phil., B.Ed., Ph.D.,";
            String place = "Tirupattur";
            String mail = "santhosh@shctpt.edu";
            Intent intent = new Intent(Home.this, StaffProfile.class);
            intent.putExtra("department", Department);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("mail", mail);
            startActivity(intent);
            finish();
        });
        sIII3.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sIII3.startAnimation(animation);
            String sname = "Mr. P. Karthik";
            String sname1 = "Mr. P. Karthik";
            String Department = "Department of Computer Science";
            String designation = "Assistant Professor";
            String qualification = "M.Sc., M.Phil., B.Ed.,";
            String place = "Tirupattur";
            String mail = "karthikp@shctpt.edu";
            Intent intent = new Intent(Home.this, StaffProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("department", Department);
            intent.putExtra("mail", mail);
            startActivity(intent);
            finish();
        });
        sIV3.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sIV3.startAnimation(animation);
            String sname = "Mr. M. SarlinRaj";
            String sname1 = "Mr. M. SarlinRaj";
            String Department = "Department of Computer Science";
            String designation = "Assistant Professor";
            String qualification = "M.Sc., M.Phil., B.Ed.,";
            String place = "Tirupattur";
            String mail = "serlinraj@shctpt.edu";
            Intent intent = new Intent(Home.this, StaffProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("department", Department);
            intent.putExtra("mail", mail);
            startActivity(intent);
            finish();
        });
        sV3.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sV3.startAnimation(animation);
            String sname = "Mrs. A. Josephine Sagaya Mala";
            String sname1 = "Mrs. A. Josephine Sagaya Mala";
            String Department = "Department of Computer Science";
            String designation = "Head of the Department (CS)";
            String qualification = "M.Com., M.C.A., M.Phil.,";
            String place = "Tirupattur";
            String mail = "sagayamala@shctpt.edu";
            Intent intent = new Intent(Home.this, StaffProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("department", Department);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("mail", mail);
            startActivity(intent);
            finish();
        });

        //Second Year
        // TODO: Change for Second Year
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
            Intent intent = new Intent(Home.this, StaffProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("department", Department);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("mail", mail);
            startActivity(intent);
            finish();
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
            Intent intent = new Intent(Home.this, StaffProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("department", Department);
            intent.putExtra("sname1", sname1);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("mail", mail);
            startActivity(intent);
            finish();
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
            Intent intent = new Intent(Home.this, StaffProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("department", Department);
            intent.putExtra("mail", mail);
            startActivity(intent);
            finish();
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
            Intent intent = new Intent(Home.this, StaffProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("department", Department);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("mail", mail);
            startActivity(intent);
            finish();
        });
        sV2.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sV2.startAnimation(animation);
            String sname = "Mr. P. Karthik";
            String sname1 = "Mr. M. P. Karthik";
            String Department = "Department of Computer Science";
            String designation = "Assistant Professor";
            String qualification = "M.Sc., B.Ed.,";
            String place = "Tirupattur";
            String mail = "karthikp@shctpt.edu";
            Intent intent = new Intent(Home.this, StaffProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("department", Department);
            intent.putExtra("mail", mail);
            startActivity(intent);
            finish();
        });

        //First Year
        sI1.setOnClickListener(view -> {

            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sI1.startAnimation(animation);
            String sname = "Dr. R. Sankar";
            String sname1 = "Dr. R. Sankar";
            String designation = "Assistant Professor";
            String qualification = "M.A., M.Phil., Ph.D.";
            String Department = "Department of Tamil";
            String place = "Tirupattur";
            String mail = "sankarr@shctpt.edu";
            Intent intent = new Intent(Home.this, StaffProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("department", Department);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("mail", mail);
            startActivity(intent);
            finish();
        });
        sII1.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sII1.startAnimation(animation);
            String sname = "Mr. S. Prabakaran";
            String sname1 = "Mr. S. Prabakaran";
            String designation = "Assistant Professor";
            String Department = "Department of English";
            String qualification = "M.A., M.Phil.,";
            String place = "Tirupattur";
            String mail = "prabhakaran@shctpt.edu";
            Intent intent = new Intent(Home.this, StaffProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("department", Department);
            intent.putExtra("sname1", sname1);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("mail", mail);
            startActivity(intent);
            finish();
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
            Intent intent = new Intent(Home.this, StaffProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("department", Department);
            intent.putExtra("mail", mail);
            startActivity(intent);
            finish();
        });
        sIV1.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            sIV1.startAnimation(animation);
            String sname = "Mr. M. Santhoshkumar";
            String sname1 = "Mr. M. Santhoshkumar";
            String Department = "Department of Computer Science";
            String designation = "Assistant Professor";
            String qualification = "M.Sc., M.Phil., B.Ed., Ph.D.";
            String place = "Tirupattur";
            String mail = "santhosh@shctpt.edu";
            Intent intent = new Intent(Home.this, StaffProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("department", Department);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("mail", mail);
            startActivity(intent);
            finish();
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
            Intent intent = new Intent(Home.this, StaffProfile.class);
            intent.putExtra("sname", sname);
            intent.putExtra("sname1", sname1);
            intent.putExtra("designation", designation);
            intent.putExtra("qualification", qualification);
            intent.putExtra("place", place);
            intent.putExtra("department", Department);
            intent.putExtra("mail", mail);
            startActivity(intent);
            finish();
        });



        MoodleE.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            MoodleE.startAnimation(animation);
            Intent intent = new Intent(getApplicationContext(), HomeWeb.class);
            intent.putExtra("Links",urls[2]);
            startActivity(intent);
            finish();
        });


        enrollLinux.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            enrollLinux.startAnimation(animation);
            Intent intent = new Intent(getApplicationContext(), HomeWeb.class);
            intent.putExtra("Links",urls[5]);
            startActivity(intent);
            finish();
        });

        certiLinux.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            certiLinux.startAnimation(animation);
            Intent intent = new Intent(getApplicationContext(), HomeWeb.class);
            intent.putExtra("Links",urls[3]);
            startActivity(intent);
            finish();
        });

        enrollPython.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            enrollPython.startAnimation(animation);
            Intent intent = new Intent(getApplicationContext(), HomeWeb.class);
            intent.putExtra("Links",urls[6]);
            startActivity(intent);
            finish();
        });

        certiPython.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            certiPython.startAnimation(animation);
            Intent intent = new Intent(getApplicationContext(), HomeWeb.class);
            intent.putExtra("Links",urls[4]);
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

            if (backPressedTime + 2000 > System.currentTimeMillis()) {
                backToast.cancel();
                super.onBackPressed();
                return;
            }else {
                backToast = FancyToast.makeText(getBaseContext(), "Press back again to exit", FancyToast.LENGTH_SHORT, FancyToast.INFO, false);
                backToast.show();
            }
            backPressedTime = System.currentTimeMillis();

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
        }else if(id == R.id.enterNotes) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.job_activity) {
            Intent intent = new Intent(getApplicationContext(), JobsActivity.class);
            startActivity(intent);
        } else if (id == R.id.timetables) {
            Intent intent = new Intent(getApplicationContext(), TimeTableYear.class);
            startActivity(intent);
            finish();
        }else if (id == R.id.lounge) {
            Intent intent = new Intent(getApplicationContext(), HomeWeb.class);
            intent.putExtra("Links",urls[2]);
            startActivity(intent);
            finish();
        }else if (id == R.id.myprofile) {
            Intent intent = new Intent(getApplicationContext(), AboutDeveloper.class);
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
//        else if (id == R.id.messageChat) {
//            FancyToast.makeText(Home.this, "This Feature Available Soon", FancyToast.LENGTH_SHORT, FancyToast.INFO, false).show();
//        }

        else if (id == R.id.buymeacoffee) {
            Intent intent = new Intent(getApplicationContext(), HomeWeb.class);
            intent.putExtra("Links",urls[7]);
            startActivity(intent);
            finish();
        } else if (id == R.id.github) {
            Intent intent = new Intent(getApplicationContext(), HomeWeb.class);
            intent.putExtra("Links",urls[8]);
            startActivity(intent);
            finish();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//
//        inflater.inflate(R.menu.main, menu);
//        return super.onCreateOptionsMenu(menu);
//    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.profile) {

        }
    }
}
