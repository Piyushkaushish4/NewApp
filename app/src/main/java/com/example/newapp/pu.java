package com.example.newapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class pu extends AppCompatActivity {
ImageButton bt_pup;
Button bt_puad;
Button bt_pupl;
Button bt_puc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pu);
        bt_pup=findViewById(R.id.pup);
        bt_puad=findViewById(R.id.puad);
        bt_pupl=findViewById(R.id.pupl);
        bt_puc=findViewById(R.id.puc);

        bt_pup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://uiet.puchd.ac.in/"));
                startActivity(intent);
            }
        });

        bt_pupl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur3=bt_pupl.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("http://uiet.puchd.ac.in/?page_id=2769"));
                startActivity(b);
            }
        });

        bt_puad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur3=bt_puad.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("http://uiet.puchd.ac.in/?page_id=109"));
                startActivity(b);
            }
        });

        bt_puc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur3=bt_puc.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("http://uiet.puchd.ac.in/?page_id=273"));
                startActivity(b);
            }
        });
    }
}
