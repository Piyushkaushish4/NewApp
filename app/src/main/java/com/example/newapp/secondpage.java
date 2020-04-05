package com.example.newapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class secondpage extends AppCompatActivity {
    ImageButton bt_har;
ImageButton bt_pun;
ImageButton bt_chd;
ImageButton bt_him;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);

        bt_har=findViewById(R.id.bthar);
        bt_pun=findViewById(R.id.btpun);
        bt_chd=findViewById(R.id.btchd);
        bt_him=findViewById(R.id.bthim);

        bt_har.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent il=new Intent(getApplicationContext(),afterharyana.class);
                startActivity(il);
            }
        });

        bt_pun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(getApplicationContext(),afterpunjab.class);
                startActivity(intent2);
            }
        });

        bt_chd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent0=new Intent(getApplicationContext(),afterchandigarh.class);
                startActivity(intent0);
            }
        });
        bt_him.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentp=new Intent(getApplicationContext(),afterhimachal.class);
                startActivity(intentp);
            }
        });

    }
}
