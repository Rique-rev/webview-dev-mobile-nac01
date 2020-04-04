package com.example.webview_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        //receive intent from activityMain and get username
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");

        WebView webview = findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());

        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl(url);

    }
}
