package com.example.dell.samd_a_1;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.Random;


/**
 * Created by Huzaifa Khan on 3/26/2017.
 */
public class CustomAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String str[];
    private final String str2[];
    private String str3[];


    int colorId;
    TextView textView;
    TextView textViewName;
    TextView textViewNum;
    Drawable circle;
    public CustomAdapter(Activity context, String[] web, String[] imageId) {
        super(context, R.layout.my_adapter, web);
        this.context = context;
        this.str = web;
        this.str2 = imageId;


    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.my_adapter, null, true);
        TextView textViewTitle = (TextView) rowView.findViewById(R.id.tvName);
        textViewTitle.setText(str[position]);
        textView = (TextView) rowView.findViewById(R.id.TwoDig); //For two dig
        textViewName = (TextView) rowView.findViewById(R.id.tvName);//For Name
        textViewNum = (TextView) rowView.findViewById(R.id.tvNum);//For Number
        breakDown();
        //////////////////////////////////////////
        circle = context.getResources().getDrawable(R.drawable.circle);

        Random r = new Random();
        int num = r.nextInt(5);
        String s;
        int colorIdTemp[] ={R.color.changingColor1,R.color.changingColor2,R.color.changingColor3,R.color.changingColor4,R.color.changingColor5,R.color.changingColor6};

        int mycolor = context.getResources().getColor(colorId);

        circle.setColorFilter(mycolor, PorterDuff.Mode.SRC_ATOP);
        textView.setBackground(circle);



        ////////////////////////////////////////////
        textView.setText(str3[position]);
        textViewName.setText(""+str[position]);
        textViewNum.setText(""+str2[position]);

        return rowView;

    }

    public void breakDown() {
        String temp;
        int index;
        str3 = new String[str.length];
        String s;
        String s1;

        for (int i = 0; i < str.length; i++) {
            temp = str[i];
            index = temp.indexOf(" ");
            System.out.println(index);
            s = Character.toString(temp.charAt(0));
            s1 = Character.toString(temp.charAt(index + 1));

            str3[i] = s;
            str3[i] = str3[i].concat(s1);

        }
    }

}

