package com.example.newapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class tiet extends AppCompatActivity {
    ImageButton bt_tp;
    Button bt_tad;
    Button bt_tpl;
    Button bt_tc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiet);
        bt_tp = findViewById(R.id.tp);
        bt_tad = findViewById(R.id.tad);
        bt_tpl = findViewById(R.id.tpl);
        bt_tc = findViewById(R.id.tc);
        bt_tp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.thapar.edu"));
                startActivity(intent);
            }
        });

        bt_tad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur3 = bt_tad.getText().toString();
                Intent b = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.thapar.edu/admissions"));
                startActivity(b);
            }
        });

        bt_tpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur3 = bt_tpl.getText().toString();
                Intent b = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.thapar.edu/placements"));
                startActivity(b);
            }
        });

        bt_tc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur3=bt_tc.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.thapar.edu/pages/contactus"));
                startActivity(b);
            }
        });
    }
}
