package com.example.newapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class afterchandigarh extends AppCompatActivity {

    Button bt_rcc;
    Button bt_colc;
    Button bt_colp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterchandigarh);

        bt_rcc=findViewById(R.id.rcc);
        bt_colc=findViewById(R.id.colc);
        bt_colp=findViewById(R.id.colp);

        bt_rcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),chandigarh.class);
                startActivity(in);
            }
        });
        bt_colc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur1=bt_colc.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://chdenggadmissions.nic.in/JACCMS/Handler/FileHandler.ashx?i=File&ii=16&iii=Y"));
                startActivity(intent);

            }
        });


        bt_colp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),chdcl.class);
                startActivity(in);
            }
        });



    }
}
