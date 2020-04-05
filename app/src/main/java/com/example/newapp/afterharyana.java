package com.example.newapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class afterharyana extends AppCompatActivity {
    Button bt_rc;
    Button bt_col;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterharyana);
    bt_rc=findViewById(R.id.rc);
    bt_col=findViewById(R.id.col);

    bt_rc.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent in=new Intent(getApplicationContext(),haryana.class);
            startActivity(in);
        }
    });
        bt_col.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ur1=bt_col.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://techadmissionshry.gov.in/instwisemockrankcutoff.aspx"));
                startActivity(intent);

            }
        });

    }
}
