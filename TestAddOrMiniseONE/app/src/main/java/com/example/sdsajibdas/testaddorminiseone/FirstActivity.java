package com.example.sdsajibdas.testaddorminiseone;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by SD Sajib Das on 5/1/2015.
 */
public class FirstActivity extends ActionBarActivity {
    MediaPlayer ourSong;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        ourSong=MediaPlayer.create(FirstActivity.this,R.raw.arnav);
        ourSong.start();

        Thread timer=new Thread(){
            public void run(){
                try {
                    sleep(10000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    Intent openMainActivity=new Intent("com.example.sdsajibdas.testaddorminiseone.MENU");
                    startActivity(openMainActivity);
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        ourSong.release();
        finish();
    }
}
