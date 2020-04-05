package com.example.newapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class haryana extends AppCompatActivity {
    TextView txt_ymca;
    TextView txt_deenba;
    TextView txt_kuk;
    TextView txt_gj;
    TextView txt_mdu;
    TextView txt_siet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haryana);


        txt_ymca = findViewById(R.id.ymca);
        txt_deenba=findViewById(R.id.deenba);
        txt_kuk=findViewById(R.id.kuk);
        txt_gj=findViewById(R.id.gj);
        txt_mdu=findViewById(R.id.mdu);
        txt_siet=findViewById(R.id.siet);

        txt_ymca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentr=new Intent(getApplicationContext(),ymca.class);
                startActivity(intentr);
            }
        });

        txt_deenba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inf=new Intent(getApplicationContext(),deen.class);
                startActivity(inf);
            }
        });

        txt_kuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),kuk.class);
                startActivity(in);
            }
        });

        txt_gj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ints=new Intent(getApplicationContext(),gj.class);
                startActivity(ints);
            }
        });
        txt_mdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte=new Intent(getApplicationContext(),mdu.class);
                startActivity(inte);
            }
        }); txt_siet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten=new Intent(getApplicationContext(),siet.class);
                startActivity(inten);
            }
        });
    }
}
