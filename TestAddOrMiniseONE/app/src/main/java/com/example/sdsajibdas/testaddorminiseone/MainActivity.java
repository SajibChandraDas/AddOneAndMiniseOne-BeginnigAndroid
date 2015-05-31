package com.example.sdsajibdas.testaddorminiseone;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button bAddOne, bSubOne;
    TextView tvTotalNumber;
    int counter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter=0;
        bAddOne=(Button)findViewById(R.id.bAddOne);
        bSubOne=(Button)findViewById(R.id.bSubtractOne);
        tvTotalNumber=(TextView)findViewById(R.id.tvTotalNumber);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void addOne(View view) {

        counter++;
        tvTotalNumber.setText("Your total is "+counter);
        String addResponse=("You have added one");
        Toast.makeText(this,addResponse,Toast.LENGTH_SHORT).show();
    }

    public void subOne(View view) {

        counter--;
        tvTotalNumber.setText("Your total is "+counter);
        String subResponse="You have subtracted one";
        Toast.makeText(this,subResponse,Toast.LENGTH_SHORT).show();
    }
}
