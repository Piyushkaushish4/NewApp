package com.example.newapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class deen extends AppCompatActivity {
ImageButton bt_dp;
Button bt_dad;
Button bt_dpl;
Button bt_dc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deen);
        bt_dp=findViewById((R.id.dp));
        bt_dad=findViewById((R.id.dad));
        bt_dpl=findViewById((R.id.dpl));
        bt_dc=findViewById((R.id.dc));

        bt_dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://dcrustm.ac.in/"));
                startActivity(intent);
            }
        });



        bt_dad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur1=bt_dad.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://dcrustm.ac.in/admission/"));
                startActivity(intent);
            }
        });


        bt_dpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur1=bt_dpl.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://dcrustm.ac.in/training-and-placement-cell-dcrust-murthal/"));
                startActivity(intent);
            }
        });


        bt_dc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur1=bt_dc.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://dcrustm.ac.in/contact-us/"));
                startActivity(intent);
            }
        });
    }
}
