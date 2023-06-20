package com.example.redirigirapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Youtube extends AppCompatActivity {
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.youtube_activity);

        WebView myWebView = findViewById(R.id.miWebView);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);

        String miUrlVideoYouTube = "https://www.youtube.com/embed/iC_ClvO-FZE?start=32304";
        String dataUrl = generateDataUrl(miUrlVideoYouTube);
        myWebView.loadData(dataUrl, "text/html", "utf-8");
    }

    private String generateDataUrl(String urlVideo) {
        return "<html>" +
                "<body>" +
                "<h2>Video desde YouTube</h2>" +
                "<br>" +
                "<iframe width=\"100%\" height=\"25%\" src=\"" + urlVideo + "\" frameborder=\"0\" allowfullscreen/>" +
                "</body>" +
                "</html>";
    }
}
