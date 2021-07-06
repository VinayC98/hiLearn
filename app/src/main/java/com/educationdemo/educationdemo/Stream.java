package com.educationdemo.educationdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Stream extends AppCompatActivity {

    Button btn_sci,btn_art,btn_comm;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.streams);

        btn_sci = (Button)findViewById( R.id.btn1_sci );
        btn_art = (Button)findViewById( R.id.btn2_art);
        btn_comm = (Button)findViewById(R.id.btn2_comm);

        btn_sci.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            sci();
        }
        });
    }

    public void sci()
    {
        Intent intent = new Intent(this,sci.class);
        startActivity(intent);
    }
    public void art(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }
    public void displayToastMsg(View v) {
        art("Comming Soon...");
    }
}