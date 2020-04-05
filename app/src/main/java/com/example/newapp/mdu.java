package com.example.newapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class mdu extends AppCompatActivity {
    ImageButton bt_mp;

















































    Button bt_mad;
Button bt_mpl;
Button bt_mc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mdu);

        bt_mp=findViewById(R.id.mp);
        bt_mad=findViewById(R.id.mad);
        bt_mpl=findViewById(R.id.mpl);
        bt_mc=findViewById(R.id.mc);

        bt_mp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://uietmdu.com/"));
                startActivity(intent);
            }
        });

        bt_mad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=bt_mad.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://uietmdu.com/Pages/Admission"));
                startActivity(intent);
            }
        });

        bt_mpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m=bt_mpl.getText().toString();
                Intent k=new Intent(Intent.ACTION_VIEW, Uri.parse("http://placement.uietmdu.com/"));
                startActivity(k);
            }
        });


        bt_mc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m=bt_mc.getText().toString();
                Intent j=new Intent(Intent.ACTION_VIEW, Uri.parse("http://uietmdu.com/Pages/Contacts"));
                startActivity(j);
            }
        });
    }
}
