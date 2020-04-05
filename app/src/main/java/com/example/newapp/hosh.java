package com.example.newapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class hosh extends AppCompatActivity {
ImageButton bt_hp;
Button bt_had;
Button bt_hpl;
Button bt_hc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hosh);

        bt_hp=findViewById(R.id.hp);
        bt_had=findViewById(R.id.had);
        bt_hpl=findViewById(R.id.hpl);
        bt_hc=findViewById(R.id.hc);

        bt_hp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.uietkuk.ac.in"));
                startActivity(intent);
            }
        });

        bt_had.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur3=bt_had.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("http://uietkuk.ac.in/training_placement_cell/"));
                startActivity(b);
            }
        });

        bt_hpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur3=bt_hpl.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("http://uietkuk.ac.in/training_placement_cell/"));
                startActivity(b);
            }
        });


        bt_hc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur3=bt_hc.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("http://uietkuk.ac.in/training_placement_cell/"));
                startActivity(b);
            }
        });

    }
}
