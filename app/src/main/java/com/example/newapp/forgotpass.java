package com.example.newapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class forgotpass extends AppCompatActivity {
    Button btn,bfg;
    EditText em,un,efg,newpassword;
    Database db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpass);
        btn=findViewById(R.id.btncon);
        db=new Database(this);
        em=findViewById(R.id.et_email1);
        un=findViewById(R.id.et_username1);
        bfg=findViewById(R.id.btnupdate);

        newpassword=findViewById(R.id.et_newpass);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=em.getText().toString();
                String emails=un.getText().toString();
                String result = db.getUserData1(user,emails);
                if(result.equals("found"))
                {

                    bfg.setVisibility(View.VISIBLE);
                    newpassword.setVisibility(View.VISIBLE);
                    Toast.makeText(forgotpass.this, "ok", Toast.LENGTH_SHORT).show();
                }
                else
                {

                    Toast.makeText(forgotpass.this, "Invalid", Toast.LENGTH_SHORT).show();
                }

            }
        });
        bfg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname=un.getText().toString();
                String passs=newpassword.getText().toString();
                Boolean isUpdate = db.updatedata(uname,passs);
                if(isUpdate==true)
                {
                    Toast.makeText(forgotpass.this, "password changed", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(forgotpass.this, "not updated", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
