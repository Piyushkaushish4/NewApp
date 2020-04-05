package com.example.newapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class kuk extends AppCompatActivity {
    ImageButton bt_kp;
    Button bt_kad;
    Button bt_kpl;
    Button bt_kc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuk);
        bt_kp=findViewById(R.id.kp);
        bt_kad=findViewById(R.id.kad);
        bt_kpl=findViewById(R.id.kpl);
        bt_kc=findViewById(R.id.kc);

        bt_kp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.uietkuk.ac.in"));
                startActivity(intent);
            }
        });

        bt_kad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur3=bt_kad.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.uietkuk.ac.in/admission/"));
                startActivity(b);
            }
        });

        bt_kpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur3=bt_kpl.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("http://uietkuk.ac.in/training_placement_cell/"));
                startActivity(b);
            }
        });


        bt_kc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur3=bt_kc.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("http://uietkuk.ac.in/training_placement_cell/"));
                startActivity(b);
            }
        });
    }
}
