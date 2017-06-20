package com.ankushinc.thereddragon.govtboardexamhp;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Launch extends AppCompatActivity {
        TextView t1;
    public void onAttachedToWindow(){
        super.onAttachedToWindow();
        Window window=getWindow();
        window.setFormat(PixelFormat.RGBA_8888);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);


        Thread t1=new Thread() {
            @Override
            public void run() {
                StartAnimations();
            }
        };

        Thread t2=new Thread() {
            @Override
            public void run() {
                try{
                    sleep(3500);
                    Intent intent=new Intent(getApplicationContext(),homeChoice.class);
                    startActivity(intent);
                    finish();
                }catch (InterruptedException e){

                }
            }
        };

        t1.start();
        try{
            t1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        t2.start();




    }



    private void StartAnimations(){
        Animation anim= AnimationUtils.loadAnimation(this,R.anim.alpha);
        anim.reset();
        RelativeLayout r=(RelativeLayout)findViewById(R.id.r1);
        r.clearAnimation();
        r.startAnimation(anim);


        anim=AnimationUtils.loadAnimation(this,R.anim.translate);
        anim.reset();
        ImageView i=(ImageView)findViewById(R.id.img2);
        i.clearAnimation();
        i.startAnimation(anim);


        anim=AnimationUtils.loadAnimation(this,R.anim.translate);
        anim.reset();
        TextView t=(TextView) findViewById(R.id.hello);
        t.clearAnimation();
        t.startAnimation(anim);



    }


}
