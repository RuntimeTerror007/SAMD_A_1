package com.example.dell.samd_a_1;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static Drawable db2;
    ListView myCustomList;
    //  String[] str = getResources().getStringArray(R.array.name);

    String str[];
    String str2[];
    // String str[] = {"Huzaifa Ahmed", "Tayyab Satti", "Abdul Wahab"};
    //String str2[] = {"03115115588", "0342557561", "090078601"};
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        str=getResources().getStringArray(R.array.name);
        str2=getResources().getStringArray(R.array.num);
        list = (ListView) findViewById(R.id.lv);
        CustomAdapter adapter = new CustomAdapter(MainActivity.this, str, str2);

        list.setAdapter(adapter);
       /* CustomAdapter adapter = new CustomAdapter(MainActivity.this,str,str2);
        list=(ListView) findViewById(R.id.lv);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +str[+ position], Toast.LENGTH_SHORT).show();

            }
        });

*/

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position,
                                    long arg3) {
                String value = (String) adapter.getItemAtPosition(position);
                // assuming string and if you want to get the value on click of list item
                // do what you intend to do on click of listview row
                String temp;
                String temp1;
                String temp2;
                TextView textView = (TextView) v.findViewById(R.id.TwoDig);
                TextView textViewName = (TextView) v.findViewById(R.id.tvName);
                TextView textViewNum = (TextView) v.findViewById(R.id.tvNum);

                temp = textView.getText().toString();
                temp1 = textViewName.getText().toString();
                temp2 = textViewNum.getText().toString();

                String color = ""+textView.getBackground();
                //   Toast.makeText(getApplicationContext(),""+myColor.getColorFilter(),Toast.LENGTH_SHORT).show();


                Intent myIntent = new Intent(MainActivity.this,Display_Activity.class);
                myIntent.putExtra("Dig",temp);
                myIntent.putExtra("Name",temp1);
                myIntent.putExtra("Num",temp2);
                myIntent.putExtra("Color",color);
                My_Global_Activity.db = textView.getBackground();
                startActivity(myIntent);

            }
        });

    }
}

