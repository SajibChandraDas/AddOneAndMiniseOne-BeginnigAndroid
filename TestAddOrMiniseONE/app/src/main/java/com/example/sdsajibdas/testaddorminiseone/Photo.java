package com.example.sdsajibdas.testaddorminiseone;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by SD Sajib Das on 5/10/2015.
 */
public class Photo extends ActionBarActivity implements View.OnClickListener {

    ImageView iv;
    ImageButton ib;
    Button b;
    Intent i;
    int cameraData=0;
    Bitmap bmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo);
        initialize();
        InputStream is=getResources().openRawResource(R.drawable.icon);
        bmp= BitmapFactory.decodeStream(is);
    }

    private void initialize() {
        iv=(ImageView)findViewById(R.id.imageViewPic);
        ib=(ImageButton)findViewById(R.id.imageButtonTakePic);
        b=(Button)findViewById(R.id.buttonSetWallpaper);

        ib.setOnClickListener(this);
        b.setOnClickListener(this);
    }

    @Override




    public void onClick(View view) {

        switch (view.getId()){

            case R.id.buttonSetWallpaper:
                try {
                    getApplicationContext().setWallpaper(bmp);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                break;

            case R.id.imageButtonTakePic:
                i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,cameraData);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==RESULT_OK){
            Bundle extras=data.getExtras();
            bmp=(Bitmap)extras.get("data");
            iv.setImageBitmap(bmp);

        }
    }
}
