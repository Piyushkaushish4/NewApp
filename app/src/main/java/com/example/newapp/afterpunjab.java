package com.example.newapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class afterpunjab extends AppCompatActivity {

    Button bt_rcp;
    Button bt_colp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterpunjab);

        bt_rcp=findViewById(R.id.rcp);
        bt_colp=findViewById(R.id.colp);

        bt_rcp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),punjab.class);
                startActivity(in);
            }
        });
        bt_colp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur1=bt_colp.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://ptuadmissions.nic.in/PTUAdmissionRegSys/info/CutoffRanks_Old.aspx"));
                startActivity(intent);

            }
        });

    }
}
