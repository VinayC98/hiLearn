package com.educationdemo.educationdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.educationdemo.educationdemo.Stream;
public class class_11_12 extends AppCompatActivity {
    Button bt11,bt12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_class_11_12 );
        bt11 = (Button)findViewById( R.id.btn1_11 );
        bt12 = (Button)findViewById( R.id.btn2_12);


        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stem1();
            }
        });
    }

    public void stem1()
    {
        Intent intent = new Intent(this,Stream.class);
        startActivity(intent);
    }
    public void stem2(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }
    public void displayToastMsg(View v) {
        stem2("Comming Soon...");
    }
}