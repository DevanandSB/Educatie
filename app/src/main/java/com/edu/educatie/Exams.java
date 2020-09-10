package com.edu.educatie;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Exams extends AppCompatActivity {

    TextView CAI1S,CAI2S, CAI3S,CAI4S,CAI5S;
    TextView CAII1S,CAII2S, CAII3S,CAII4S,CAII5S;
    TextView CAI1t,CAI2t, CAI3t,CAI4t,CAI5t;
    TextView CAII1t,CAII2t, CAII3t,CAII4t,CAII5t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exams);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CAI1S = findViewById(R.id.sI1);
        CAI2S = findViewById(R.id.sI2);
        CAI3S = findViewById(R.id.sI3);
        CAI4S = findViewById(R.id.sI4);
        CAI5S = findViewById(R.id.sI5);

        CAI1t = findViewById(R.id.tI1);
        CAI2t = findViewById(R.id.tI2);
        CAI3t = findViewById(R.id.tI3);
        CAI4t = findViewById(R.id.tI4);
        CAI5t = findViewById(R.id.tI5);

        CAII1S = findViewById(R.id.sII1);
        CAII2S  = findViewById(R.id.sII2);
        CAII3S = findViewById(R.id.sII3);
        CAII4S = findViewById(R.id.sII4);
        CAII5S = findViewById(R.id.sII5);

        CAII1t = findViewById(R.id.tII1);
        CAII2t = findViewById(R.id.tII2);
        CAII3t = findViewById(R.id.tII3);
        CAII4t  = findViewById(R.id.tII4);
        CAII5t = findViewById(R.id.tII5);


        String s1CAI = getIntent().getStringExtra("CAI1s");
        String s2CAI = getIntent().getStringExtra("CAI2s");
        String s3CAI = getIntent().getStringExtra("CAI3s");
        String s4CAI = getIntent().getStringExtra("CAI4s");
        String s5CAI = getIntent().getStringExtra("CAI5s");

        String t1CAI = getIntent().getStringExtra("CAI1t");
        String t2CAI = getIntent().getStringExtra("CAI2t");
        String t3CAI = getIntent().getStringExtra("CAI3t");
        String t4CAI = getIntent().getStringExtra("CAI4t");
        String t5CAI = getIntent().getStringExtra("CAI5t");

        String s1CAII = getIntent().getStringExtra("CAII1s");
        String s2CAII = getIntent().getStringExtra("CAII2s");
        String s3CAII = getIntent().getStringExtra("CAII3s");
        String s4CAII = getIntent().getStringExtra("CAII4s");
        String s5CAII = getIntent().getStringExtra("CAII5s");

        String t1CAII = getIntent().getStringExtra("CAII1t");
        String t2CAII = getIntent().getStringExtra("CAII2t");
        String t3CAII = getIntent().getStringExtra("CAII3t");
        String t4CAII = getIntent().getStringExtra("CAII4t");
        String t5CAII = getIntent().getStringExtra("CAII5t");


        CAI1S.setText(s1CAI);
        CAI2S.setText(s2CAI);
        CAI3S.setText(s3CAI);
        CAI4S.setText(s4CAI);
        CAI5S.setText(s5CAI);

        CAI1t.setText(t1CAI);
        CAI2t.setText(t2CAI);
        CAI3t.setText(t3CAI);
        CAI4t.setText(t4CAI);
        CAI5t.setText(t5CAI);

        CAII1S.setText(s1CAII);
        CAII2S.setText(s2CAII);
        CAII3S.setText(s3CAII);
        CAII4S.setText(s4CAII);
        CAII5S.setText(s5CAII);

        CAII1t.setText(t1CAII);
        CAII2t.setText(t2CAII);
        CAII3t.setText(t3CAII);
        CAII4t.setText(t4CAII);
        CAII5t.setText(t5CAII);

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(getApplicationContext(), Home.class);
        startActivity(intent);
        finish();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
