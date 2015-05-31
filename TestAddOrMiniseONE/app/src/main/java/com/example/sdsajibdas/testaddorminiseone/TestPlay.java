package com.example.sdsajibdas.testaddorminiseone;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

/**
 * Created by SD Sajib Das on 5/5/2015.
 */
public class TestPlay extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        final EditText etCommand=(EditText)findViewById(R.id.etCommand);
        Button bResults=(Button)findViewById(R.id.bResults);
        final ToggleButton tbPassword=(ToggleButton)findViewById(R.id.tbPassword);
        final TextView tvResults=(TextView)findViewById(R.id.tvResults);

        tbPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbPassword.isChecked()){
                    etCommand.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

                }else {
                    etCommand.setInputType(InputType.TYPE_CLASS_TEXT);

                }
            }
        });
    }
}
