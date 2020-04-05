package com.example.newapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class siet extends AppCompatActivity {
ImageButton bt_sp;
Button bt_sad;
Button bt_spl;
Button bt_sc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siet);

        bt_sp=findViewById(R.id.sp);
        bt_sad=findViewById(R.id.sad);
        bt_spl=findViewById(R.id.spl);
        bt_sc=findViewById(R.id.sc);

        bt_sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://gecnilokheri.ac.in/"));
                startActivity(intent);
            }
        });

        bt_sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur5=bt_sad.getText().toString();
                Intent f=new Intent(Intent.ACTION_VIEW, Uri.parse("http://gecnilokheri.ac.in/GEC_Admission.aspx"));
                startActivity(f);
            }
        });
        bt_spl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur4=bt_spl.getText().toString();
                Intent g=new Intent(Intent.ACTION_VIEW, Uri.parse("http://gecnilokheri.ac.in/Placement.aspx"));
                startActivity(g);
            }
        });

        bt_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur5=bt_sc.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("http://gecnilokheri.ac.in/GEC_ContactUs.aspx"));
                startActivity(b);
            }
        });
    }
}
