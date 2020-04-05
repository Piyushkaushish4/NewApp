package com.example.newapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class navigate1 extends AppCompatActivity {
    Button bt_stc;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigate1);
        bt_stc=findViewById(R.id.stc);
        bt_stc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p=new Intent(getApplicationContext(),secondpage.class);
                startActivity(p);
            }

        });
}

}
