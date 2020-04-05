package com.example.newapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class himachal extends AppCompatActivity {
TextView txt_shimla;
TextView txt_jl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himachal);
        txt_shimla=findViewById(R.id.shimla);
        txt_jl=findViewById(R.id.jl);
        txt_shimla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s=new Intent(getApplicationContext(),shimla.class);
                startActivity(s);
            }
        });
        txt_jl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h=new Intent(getApplicationContext(),jl.class);
                startActivity(h);
            }
        });

    }
}
