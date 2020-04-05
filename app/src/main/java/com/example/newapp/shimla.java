package com.example.newapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class shimla extends AppCompatActivity {
ImageButton bt_ship;
Button bt_shiad;
Button bt_shipal;
Button bt_shic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shimla);
        bt_ship=findViewById(R.id.ship);
        bt_shiad=findViewById(R.id.shiad);
        bt_shipal=findViewById(R.id.shipal);
        bt_shic=findViewById(R.id.shic);

        bt_ship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://uiit.ac.in/"));
                startActivity(intent);
            }
        });

        bt_shiad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur3=bt_shiad.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("http://uiit.ac.in/admission/"));
                startActivity(b);
            }
        });

        bt_shipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur3=bt_shipal.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("http://uiit.ac.in/placements/"));
                startActivity(b);
            }
        });

        bt_shic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur3=bt_shic.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("http://uiit.ac.in/contact-us/"));
                startActivity(b);
            }
        });
    }
}
