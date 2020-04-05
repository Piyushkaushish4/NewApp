package com.example.newapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class counselpage extends AppCompatActivity {
Button bt_state;
Button bt_josaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counselpage);
        bt_state=findViewById(R.id.btstate);
        bt_josaa=findViewById(R.id.josaa);


        bt_josaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(getApplicationContext(),josaa.class);
                startActivity(intent4);
            }
        });
        bt_state.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(getApplicationContext(),secondpage.class);
                startActivity(intent5);
            }
        });
    }
}
