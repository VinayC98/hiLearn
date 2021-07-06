package com.educationdemo.educationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class chapter_list_english extends AppCompatActivity {
    Button list_sci_one,list_sci_two,list_sci_three,prev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_chapter_list_english );

        list_sci_one  = (Button)findViewById( R.id.u1_btn1_chap_one ) ;
        list_sci_two =(Button)findViewById( R.id. u1_btn2_chap_two);
        list_sci_three = (Button)findViewById( R.id.u1_btn2_chap_three );
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
                prev();
            }
        });
    }

    public void stem1()
    {
        Intent intent = new Intent(this,eng_sec_one.class);
        startActivity(intent);
    }
    public void stem2()
    {
        Intent intent = new Intent(this,eng_sec_two.class);
        startActivity(intent);
    }
    public void stem3()
    {
        Intent intent = new Intent(this,eng_sec_three.class);
        startActivity(intent);
    }
    public void prev()
    {
        Intent intent = new Intent(this,sci.class);
        startActivity(intent);
    }

}