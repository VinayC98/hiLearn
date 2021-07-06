package com.educationdemo.educationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class chapter_list_math extends AppCompatActivity {
    Button list_sci_one,list_sci_two,list_sci_three,list_sci_four,list_sci_five,list_sci_next,list_sci_prev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_chapter_list_math );

        list_sci_one  = (Button)findViewById( R.id.u1_btn1_chap_one ) ;
        list_sci_two =(Button)findViewById( R.id. u1_btn2_chap_two);
        list_sci_three = (Button)findViewById( R.id.u1_btn2_chap_three );
        list_sci_four =(Button)findViewById( R.id. u1_btn2_chap_four);
        list_sci_five =(Button)findViewById( R.id. u1_btn2_chap_five);
        list_sci_next = (Button)findViewById( R.id. u1_btn2_next);
        list_sci_prev = (Button)findViewById( R.id.u1_btn2_prev );

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
        list_sci_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stem4();
            }
        });
        list_sci_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stem5();
            }
        });
        list_sci_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prev();
            }
        });
    }

    public void stem1()
    {
        Intent intent = new Intent(this,math_part_one_chap1.class);
        startActivity(intent);
    }
    public void stem2()
    {
        Intent intent = new Intent(this,math_part_one_chap2.class);
        startActivity(intent);
    }
    public void stem3()
    {
        Intent intent = new Intent(this,math_part_one_chap3.class);
        startActivity(intent);
    }
    public void stem4()
    {
        Intent intent = new Intent(this,math_part_one_chap4.class);
        startActivity(intent);
    }
    public void stem5()
    {
        Intent intent = new Intent(this,math_part_one_chap5.class);
        startActivity(intent);
    }

    public void prev()
    {
        Intent intent = new Intent(this,sci.class);
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