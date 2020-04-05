package com.example.newapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class gujral extends AppCompatActivity {
ImageButton bt_gup;
Button bt_guad;
Button bt_gupl;
Button bt_guc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gujral);
      bt_gup=findViewById(R.id.gup);
      bt_guad=findViewById(R.id.guad);
      bt_gupl=findViewById(R.id.gupl);
      bt_guc=findViewById(R.id.guc);

        bt_gup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://ptu.ac.in"));
                startActivity(intent);
            }
        });

      bt_guad.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String ur3=bt_guad.getText().toString();
              Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ptu.ac.in/admissions/helpdesk.aspx"));
              startActivity(b);
          }
      });

      bt_gupl.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String ur3=bt_gupl.getText().toString();
              Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ptu.ac.in/Placements.aspx"));
              startActivity(b);
          }
      });
      bt_guc.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String ur3=bt_guc.getText().toString();
              Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("https://ptu.ac.in/ContactUs.aspx"));
              startActivity(b);
          }
      });
    }
}
