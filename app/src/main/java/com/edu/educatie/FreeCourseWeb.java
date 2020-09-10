package com.edu.educatie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.github.ybq.android.spinkit.style.ChasingDots;
import com.github.ybq.android.spinkit.style.FoldingCube;
import com.github.ybq.android.spinkit.style.Wave;

public class FreeCourseWeb extends AppCompatActivity {

    WebView courseWebView;

    @Override
    public void onBackPressed() {
        if (courseWebView.canGoBack()) {
            courseWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_course_web);

        courseWebView = findViewById(R.id.courseYoutube);
        ProgressBar webprogress = findViewById(R.id.webProgress);
        ChasingDots wave = new ChasingDots();

        webprogress.setIndeterminateDrawable(wave);

        Intent intent = getIntent();
        String webSite = intent.getStringExtra("Links");

        assert webSite != null;
        courseWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                webprogress.setVisibility(View.VISIBLE);
                setTitle("Loading...");
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                webprogress.setVisibility(View.GONE);
                setTitle(view.getTitle());
            }
        });
        courseWebView.loadUrl(webSite);

        WebSettings webSettings = courseWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}