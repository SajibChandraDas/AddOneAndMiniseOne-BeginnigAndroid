package com.example.sdsajibdas.testaddorminiseone;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.Random;

/**
 * Created by SD Sajib Das on 5/5/2015.
 */
public class TestPlay2 extends ActionBarActivity implements View.OnClickListener{

    EditText etPassword;
    Button buttonCheckCommand;
    ToggleButton tbChecked;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test2);
        sajibAndDroid();


        tbChecked.setOnClickListener(this);
        buttonCheckCommand.setOnClickListener(this);
    }

    private void sajibAndDroid() {
        etPassword=(EditText)findViewById(R.id.etPassword);
        buttonCheckCommand=(Button)findViewById(R.id.buttonEnter);
        tbChecked=(ToggleButton)findViewById(R.id.tbChecked);
        tvDisplay=(TextView)findViewById(R.id.tvInvalid);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.buttonEnter:
                String check= etPassword.getText().toString();

                etPassword.setText(check);
                if(check.contentEquals("left")){
                    tvDisplay.setGravity(Gravity.LEFT);

                }else if (check.contentEquals("center")){
                    tvDisplay.setGravity(Gravity.CENTER);

                }else if(check.contentEquals("right")){
                    tvDisplay.setGravity(Gravity.RIGHT);

                }else if(check.contentEquals("blue")){

                    tvDisplay.setTextColor(Color.BLUE);

                }else if(check.contains("WTF")){

                    Random crazy=new Random();
                    tvDisplay.setText("WTF!!!!!");
                    tvDisplay.setTextSize(crazy.nextInt(75));
                    tvDisplay.setTextColor(Color.rgb(crazy.nextInt(265),crazy.nextInt(265),crazy.nextInt(265)));

                    switch (crazy.nextInt(3)){

                        case 0:
                            tvDisplay.setGravity(Gravity.LEFT);
                            break;
                        case 1:
                            tvDisplay.setGravity(Gravity.CENTER);
                            break;
                        case 2:
                            tvDisplay.setGravity(Gravity.RIGHT);
                            break;
                    }

                }else{
                    tvDisplay.setText("Invalid");
                    tvDisplay.setGravity(Gravity.CENTER);
                    tvDisplay.setTextColor(Color.WHITE);
                }

                break;

            case R.id.tbChecked:
                if (tbChecked.isChecked()){
                    etPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

                }else{
                    etPassword.setInputType(InputType.TYPE_CLASS_TEXT);

                }
                break;
        }

    }
}
