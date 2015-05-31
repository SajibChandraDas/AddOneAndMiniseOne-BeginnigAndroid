package com.example.sdsajibdas.testaddorminiseone;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by SD Sajib Das on 5/10/2015.
 */
public class VatCalculate extends ActionBarActivity {
    EditText productPrice,vat,discount,totalProductPrice;
    Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vat_calculate);

        productPrice=(EditText)findViewById(R.id.etProductPrice);
        vat=(EditText)findViewById(R.id.etVat);
        discount=(EditText)findViewById(R.id.etDiscount);
        totalProductPrice=(EditText)findViewById(R.id.etTotalPrice);
        calculate=(Button)findViewById(R.id.bCalculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double PP=Double.parseDouble(productPrice.getText().toString());
                Double pVat=Double.parseDouble(vat.getText().toString());
                Double pDiscount=Double.parseDouble(discount.getText().toString());


                Double currentProductPriceWithVat=PP+(PP*pVat)/100;
                Double totalPrice=currentProductPriceWithVat-(currentProductPriceWithVat*pDiscount)/100;

                totalProductPrice.setText("Your total price is: "+totalPrice);

            }
        });



    }
}
