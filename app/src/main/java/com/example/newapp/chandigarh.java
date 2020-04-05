package com.example.newapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class chandigarh extends AppCompatActivity {
TextView txt_pu;
TextView txt_cgc;
TextView txt_hosh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chandigarh);
        txt_pu=findViewById(R.id.pu);
        txt_cgc=findViewById(R.id.cgc);
        txt_hosh=findViewById(R.id.hosh);

        txt_pu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s=new Intent(getApplicationContext(),pu.class);
                startActivity(s);
            }
        });

        txt_cgc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m=new Intent(getApplicationContext(),cgc.class);
                startActivity(m);
            }
        });

        txt_hosh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),hosh.class);
                startActivity(a);
            }
        });

    }
}
