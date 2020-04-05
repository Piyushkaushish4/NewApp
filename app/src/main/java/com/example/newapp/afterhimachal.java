package com.example.newapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class afterhimachal extends AppCompatActivity {
 Button bt_rch;
 Button bt_colh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterhimachal);

        bt_rch=findViewById(R.id.rch);
        bt_colh=findViewById(R.id.colh);

        bt_rch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),himachal.class);
                startActivity(in);
            }
        });
        bt_colh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur1=bt_colh.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://techadmissionshry.gov.in/instwisemockrankcutoff.aspx"));
                startActivity(intent);

            }
        });

    }
}
