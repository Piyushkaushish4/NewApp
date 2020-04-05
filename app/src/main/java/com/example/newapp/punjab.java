package com.example.newapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class punjab extends AppCompatActivity {
TextView txt_tiet;
TextView txt_gn;
TextView txt_gujral;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjab);
        txt_tiet=findViewById(R.id.tiet);
        txt_gn=findViewById(R.id.gn);
        txt_gujral=findViewById(R.id.gujral);


        txt_tiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p=new Intent(getApplicationContext(),tiet.class);
                startActivity(p);
            }
        });

        txt_gn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y=new Intent(getApplicationContext(),gn.class);
                startActivity(y);
            }
        });

        txt_gujral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u=new Intent(getApplicationContext(),gujral.class);
                startActivity(u);
            }
        });


    }
}
