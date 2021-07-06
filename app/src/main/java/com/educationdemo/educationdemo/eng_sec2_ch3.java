package com.educationdemo.educationdemo;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.youtube.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class eng_sec2_ch3 extends AppCompatActivity {
    private YouTubePlayerView youTubePlayerView;
    @RequiresApi(api = Build.VERSION_CODES.P)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_eng_sec2_ch3 );
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading Data...");
        progressDialog.setCancelable(false);
        WebView web_view = findViewById(R.id.web_pdf_view);
        web_view.requestFocus();
        web_view.getSettings().setJavaScriptEnabled(true);
        String myPdfUrl = "";
        String url = "https://drive.google.com/file/d/16PM4TGCI6vlGimf1F6rpCyCjCoW-fE7c/view?usp=sharing"+myPdfUrl;
        web_view.loadUrl(url);
        web_view.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                view.loadUrl(url);
                return true;
            }
        });
        web_view.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                if (progress < 100) {
                    progressDialog.show();
                }
                if (progress == 100) {
                    progressDialog.dismiss();
                }
            }
        });

        youTubePlayerView = findViewById(R.id.activity_main_youtubePlayerView);
        getLifecycle().addObserver(youTubePlayerView);


        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "kZ1IiCxQzC8";
                youTubePlayer.loadVideo( videoId, 0 );
                youTubePlayerView.enterFullScreen();
                youTubePlayerView.exitFullScreen();
                youTubePlayerView.isFullScreen();
                youTubePlayerView.toggleFullScreen();
            }
        });
    }
}