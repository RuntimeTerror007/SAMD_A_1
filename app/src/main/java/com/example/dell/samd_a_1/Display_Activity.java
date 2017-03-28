package com.example.dell.samd_a_1;

/**
 * Created by Dell on 3/27/2017.
 */

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Huzaifa Khan on 3/27/2017.
 */
public class Display_Activity extends AppCompatActivity {
    String name="asd";
    String str="sad";
    String str1="sdad";
    String color;
    Drawable drawable;
    int id;


    TextView name1;
    TextView textView;
    TextView numDisplay;
    Drawable db;
    int cf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        Intent myIntent = getIntent();


        name = myIntent.getStringExtra("Name");
        str = myIntent.getStringExtra("Dig");
        str1 = myIntent.getStringExtra("Num");
        color = myIntent.getStringExtra("Color");
        numDisplay = (TextView) findViewById(R.id.tvDifNum);
        textView = (TextView) findViewById(R.id.bTwoDisp);
        name1 = (TextView) findViewById(R.id.tvDifName);
        textView.setBackground(My_Global_Activity.db);


        textView.setText(""+str);
        name1.setText(""+name);
        numDisplay.setText(""+str1);


    }
}

