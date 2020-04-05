package com.example.newapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class cgc extends AppCompatActivity {
ImageButton bt_cgp;
Button bt_cgad;
Button bt_cgpl;
Button bt_cgc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgc);
        bt_cgp=findViewById(R.id.cgp);
        bt_cgad=findViewById(R.id.cgad);
        bt_cgpl=findViewById(R.id.cgpl);
        bt_cgc=findViewById(R.id.cgc);

        bt_cgp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.ccet.ac.in"));
                startActivity(intent);
            }
        });


        bt_cgad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur3=bt_cgad.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ccet.ac.in/notices"));
                startActivity(b);
            }
        });

        bt_cgpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur3=bt_cgpl.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ccet.ac.in/tnp/index.html"));
                startActivity(b);
            }
        });

        bt_cgc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur3=bt_cgc.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ccet.ac.in/contact.php"));
                startActivity(b);
            }
        });
    }
}
