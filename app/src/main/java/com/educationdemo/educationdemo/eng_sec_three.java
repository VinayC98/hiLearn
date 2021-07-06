package com.educationdemo.educationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class eng_sec_three extends AppCompatActivity {
    Button list_sci_one,list_sci_two,list_sci_three,next,prev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_eng_sec_three );

        list_sci_one  = (Button)findViewById( R.id.u1_btn1_chap_one ) ;
        list_sci_two =(Button)findViewById( R.id. u1_btn2_chap_two);
        list_sci_three = (Button)findViewById( R.id.u1_btn2_chap_three );
        next = (Button)findViewById( R.id.u1_btn2_next );
        prev = (Button)findViewById( R.id.u1_btn2_prev );

        list_sci_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stem1();
            }
        });
        list_sci_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stem2();
            }
        });
        list_sci_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stem3();
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stem4();
            }
        });
    }

    public void stem1()
    {
        Intent intent = new Intent(this,eng_sec3_ch1.class);
        startActivity(intent);
    }
    public void stem2()
    {
        Intent intent = new Intent(this,eng_sec3_ch2.class);
        startActivity(intent);
    }
    public void stem3()
    {
        Intent intent = new Intent(this,eng_sec3_ch3.class);
        startActivity(intent);
    }
    public void stem4()
    {
        Intent intent = new Intent(this,chapter_list_english.class);
        startActivity(intent);
    }
    public void next(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }
    public void displayToastMsg(View v) {
        next("Comming Soon...");
    }
}