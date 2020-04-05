package com.example.newapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class jl extends AppCompatActivity {
    ImageButton bt_jp;
    Button bt_jad;
    Button bt_jpl;
    Button bt_jc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jl);
        bt_jp=findViewById(R.id.jp);
        bt_jad=findViewById(R.id.jad);
        bt_jpl=findViewById(R.id.jpl);
        bt_jc=findViewById(R.id.jc);

        bt_jp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.jngec.ac.in/"));
                startActivity(intent);
            }
        });

        bt_jad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur3=bt_jad.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.jngec.ac.in/academics/ugp.php"));
                startActivity(b);
            }
        });

        bt_jpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur3=bt_jpl.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.jngec.ac.in/placements/placement_record.php"));
                startActivity(b);
            }
        });

        bt_jc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur3=bt_jc.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.jngec.ac.in/contact.php"));
                startActivity(b);
            }
        });
    }
}
