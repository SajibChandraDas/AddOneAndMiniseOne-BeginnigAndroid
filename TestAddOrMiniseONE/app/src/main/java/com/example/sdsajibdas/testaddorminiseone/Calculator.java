package com.example.sdsajibdas.testaddorminiseone;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by SD Sajib Das on 5/5/2015.
 */
public class Calculator extends ActionBarActivity {

    EditText etDisplay;
    Button b9,b8,b7,b6,b5,b4,b3,b2,b1,b0,bp,bs,bm,bd,bc,be;
    public String str="";
    Character op='q';
    int num,tempNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        etDisplay=(EditText)findViewById(R.id.etDisplay);

        b9=(Button)findViewById(R.id.bNine);
        b8=(Button)findViewById(R.id.bEight);
        b7=(Button)findViewById(R.id.bSeven);
        b6=(Button)findViewById(R.id.bSix);
        b5=(Button)findViewById(R.id.bFive);
        b4=(Button)findViewById(R.id.bFour);
        b3=(Button)findViewById(R.id.bThree);
        b2=(Button)findViewById(R.id.bTwo);
        b1=(Button)findViewById(R.id.bOne);
        b0=(Button)findViewById(R.id.bZero);

        bp=(Button)findViewById(R.id.bPlus);
        bs=(Button)findViewById(R.id.bSub);
        bm=(Button)findViewById(R.id.bMul);
        bd=(Button)findViewById(R.id.bDiv);

        bc=(Button)findViewById(R.id.bCancel);
        be=(Button)findViewById(R.id.bEqual);
    }

    public void buttonNine(View view) {
        insert(9);
    }

    public void buttonEight(View view) {
        insert(8);
    }

    public void buttonSeven(View view) {
        insert(7);
    }

    public void buttonSix(View view) {
        insert(6);
    }

    public void buttonFive(View view) {
        insert(5);
    }

    public void buttonFour(View view) {
        insert(4);
    }

    public void buttonThree(View view) {
        insert(3);
    }

    public void buttonTwo(View view) {
        insert(2);
    }

    public void buttonOne(View view) {
        insert(1);
    }

    public void buttonZero(View view) {
        insert(0);
    }



    public void buttonDiv(View view) {
        perform();
        op='/';
    }

    public void buttonMul(View view) {
        perform();
        op='*';
    }

    public void buttonSub(View view) {
        perform();
        op='-';
    }

    public void buttonPlus(View view) {
        perform();
        op='+';
    }



    public void buttonCancel(View view) {
        reset();
    }

    public void buttonEqual(View view) {
        calculate();
    }

    public void insert(int i){
        str=str+Integer.toString(i);
        num=Integer.valueOf(str).intValue();
        etDisplay.setText(str);
    }

    public void perform(){
        str="";
        tempNum=num;
    }

    public void calculate(){
        if(op=='+')
            num=tempNum+num;

        else if(op=='-')
            num=tempNum-num;
        else if(op=='/')
            num=tempNum/num;
        else if(op=='*')
            num=tempNum*num;

        etDisplay.setText(""+num);

    }

    public void reset(){
        str="";
        num=0;
        tempNum=0;
        op='q';
        etDisplay.setText("");
    }
}
