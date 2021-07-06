package com.educationdemo.educationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sci extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sci );

        btn1 = (Button)findViewById( R.id.btn1 );
        btn2 = (Button)findViewById( R.id.btn2 );
        btn3 = (Button)findViewById( R.id.btn3 );
        btn4 = (Button)findViewById( R.id.btn4 );
        btn5 = (Button)findViewById( R.id.btn5 );
        btn6 = (Button)findViewById( R.id.btn6 );

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Main1();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Main2();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Main3();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Main4();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Main5();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Main6();
            }
        });
    }
    public void Main1()
    {
        Intent intent = new Intent(this,chapter_list_science.class);
        startActivity(intent);
    }
    public void Main2()
    {
        Intent intent = new Intent(this,chapter_list_chemistry.class);
        startActivity(intent);
    }
    public void Main3()
    {
        Intent intent = new Intent(this,chapter_list_math.class);
        startActivity(intent);
    }
    public void Main4()
    {
        Intent intent = new Intent(this,chapter_list_physics.class);
        startActivity(intent);
    }

    public void Main5()
    {
        Intent intent = new Intent(this,chapter_list_sanskrit.class);
        startActivity(intent);
    }
    public void Main6()
    {
        Intent intent = new Intent(this,chapter_list_english.class);
        startActivity(intent);
    }
}