package com.example.newapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class josaa extends AppCompatActivity {
Button bt_rcj;
Button bt_lyc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_josaa);
        bt_rcj=findViewById(R.id.rcj);
        bt_lyc=findViewById(R.id.lyc);

        bt_rcj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur1=bt_rcj.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nirfindia.org/engg"));
                startActivity(intent);
            }
        });
        bt_lyc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur1=bt_rcj.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://josaa.nic.in/Result/Result/OpeningClosingRankArchieve.aspx"));
                startActivity(intent);

            }
        });
    }
}
