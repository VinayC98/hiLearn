package com.educationdemo.educationdemo;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.educationdemo.educationdemo.activities.LoginActivities;

import static java.lang.Thread.sleep;

public class Splash extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        startActivity(new Intent(Splash.this, LoginActivities.class));
        try {
            sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // close splash activity
        finish();
    }
}