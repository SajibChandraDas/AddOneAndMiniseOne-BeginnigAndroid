package com.example.sdsajibdas.testaddorminiseone;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by SD Sajib Das on 5/2/2015.
 */
public class Menu extends ListActivity {

    String classes[]={"MainActivity","SearchEngine","Photo","VatCalculate","Calculator","TestPlay","TestPlay2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(Menu.this,android.R.layout.simple_list_item_1,classes));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String cheese=classes[position];


        try {
            Class ourClass = Class.forName("com.example.sdsajibdas.testaddorminiseone."+cheese);
            Intent ourIntent=new Intent(Menu.this,ourClass);
            startActivity(ourIntent);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


}
