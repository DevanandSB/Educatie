package com.edu.educatie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.github.ybq.android.spinkit.style.ChasingDots;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.shashank.sony.fancytoastlib.FancyToast;

public class HomeWeb extends AppCompatActivity {

    WebView courseWebView;
    private long backPressedTime;
    private Toast backToast;
    @Override
    public void onBackPressed() {
        if (courseWebView.canGoBack()) {
            courseWebView.goBack();
        } else {
            if (backPressedTime + 2000 > System.currentTimeMillis()) {
                backToast.cancel();
                super.onBackPressed();
                Intent intent = new Intent(HomeWeb.this, Home.class);
                startActivity(intent);
                finish();
                return;
            }else {
                backToast = FancyToast.makeText(getBaseContext(), "Press back again for Home", FancyToast.LENGTH_SHORT, FancyToast.INFO, false);
                backToast.show();
            }
            backPressedTime = System.currentTimeMillis();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_web);

        FloatingActionButton fab = findViewById(R.id.fab);
        courseWebView = findViewById(R.id.courseYoutube);
        ProgressBar webprogress = findViewById(R.id.webProgress);
        ChasingDots wave = new ChasingDots();

//        webprogress.setIndeterminateDrawable(wave);

        Intent intent = getIntent();
        String webSite = intent.getStringExtra("Links");

        fab.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.mixed_anim);
            fab.startAnimation(animation);
            Intent intent1 = new Intent(HomeWeb.this, Home.class);
            startActivity(intent1);
            finish();
        });

        assert webSite != null;
        courseWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                showProgressDialog();
                setTitle("Loading...");
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                DisableProgressDialog();
                setTitle(view.getTitle());
            }
        });
        courseWebView.loadUrl(webSite);

        WebSettings webSettings = courseWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }
    private void showProgressDialog(){
        new LottieDialogFragment().newInstance().
                show(getSupportFragmentManager(),"");
    }
    private void DisableProgressDialog(){
        new LottieDialogFragment().newInstance().dismiss();
    }
}