package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
String foodname[]= {"food1","food","food3"};
int foodimage[]={R.drawable.food1,R.drawable.food2,R.drawable.food3};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ListView listView = (android.widget.ListView) findViewById(R.id.custumlistview);
        custumbaseadapter custumbaseadapter=new custumbaseadapter(getApplicationContext(),foodname,foodimage);
        listView.setAdapter(custumbaseadapter);


    }
}