package com.example.newapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class gn extends AppCompatActivity {
ImageButton bt_gp;
Button bt_gad;
Button bt_gpl;
Button bt_gc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gn);
        bt_gp=findViewById(R.id.gp);
        bt_gad=findViewById(R.id.gad);
        bt_gpl=findViewById(R.id.gpl);
        bt_gc=findViewById(R.id.gc);

        bt_gp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.gndec.ac.in/"));
                startActivity(intent);
            }
        });
        bt_gad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur6=bt_gad.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gndec.ac.in/?q=node/36"));
                startActivity(b);
            }
        });

        bt_gpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur6=bt_gpl.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gndec.ac.in/?q=node/31"));
                startActivity(b);
            }
        });

        bt_gc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur6=bt_gc.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gndec.ac.in/?q=node/65"));
                startActivity(b);
            }
        });

    }
}
