package com.example.newapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ymca extends AppCompatActivity {
ImageButton bt_yp;
Button bt_yad;
Button bt_ypl;
Button bt_yc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ymca);
        bt_yp=findViewById(R.id.yp);
        bt_yad=findViewById(R.id.yad);
        bt_ypl=findViewById(R.id.ypl);
        bt_yc=findViewById(R.id.yc);

        bt_yp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://ymcaust.ac.in/"));
                startActivity(intent);
            }
        });

        bt_yad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur2=bt_yad.getText().toString();
                Intent a=new Intent(Intent.ACTION_VIEW, Uri.parse("http://ymcaust.ac.in/index.php/admissions-ymca/b-tech-b-tech-leet"));
                startActivity(a);
            }
        });

        bt_ypl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur2=bt_ypl.getText().toString();
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ymcaust.ac.in/tpo/index.php/company/placement-record"));
                startActivity(b);
            }
        });

        bt_yc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur2=bt_yc.getText().toString();
                Intent c=new Intent(Intent.ACTION_VIEW, Uri.parse("http://ymcaust.ac.in/index.php/contact-us"));
                startActivity(c);
            }
        });
    }
}
