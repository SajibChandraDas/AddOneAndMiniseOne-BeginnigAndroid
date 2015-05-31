package com.example.sdsajibdas.testaddorminiseone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Sajib Chandra Das on 5/23/2015.
 */
public class SearchEngine extends ActionBarActivity implements View.OnClickListener{

    EditText etInput;
    Button bGo;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_engine);

        initialization();

    }

    private void initialization() {

        etInput=(EditText)findViewById(R.id.etInput);
        bGo=(Button)findViewById(R.id.bGo);
        bGo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String Go=etInput.getText().toString();
        i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://"+Go));
        startActivity(i);
    }
}
