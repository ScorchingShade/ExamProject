package com.ankushinc.thereddragon.govtboardexamhp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Ankush on 6/15/2017.
 */


public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
   Button b1;
   TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        b1=(Button)findViewById(R.id.email_sign_in_button);
        t1=(TextView)findViewById(R.id.signupText);

        t1.setOnClickListener(this);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplicationContext(),Form.class);
                startActivity(intent);
            }
        });





    }

    @Override
    public void onClick(View v) {
        if(v==t1){
            startActivity(new Intent(getApplicationContext(), SignUp.class));
        }
    }
}
