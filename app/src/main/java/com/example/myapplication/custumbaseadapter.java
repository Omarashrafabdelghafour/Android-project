package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class custumbaseadapter  extends BaseAdapter {
    Context context;
    String listfood[];
    int listimage[];
    LayoutInflater inflater;
public  custumbaseadapter(Context ctx,String [] foodlist,int []images){
    this.context=ctx;
    this.listfood=foodlist;
            this.listimage=images;
            inflater=LayoutInflater.from(ctx);
}
    @Override
    public int getCount() {
        return listfood.length;

    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    convertView=inflater.inflate(R.layout.activity_custumlistview,null);
        TextView textView= (TextView) convertView.findViewById(R.id.textview);
        ImageView foodimage = (ImageView) convertView.findViewById(R.id.imageicon);
        textView.setText(listfood[position]);
        foodimage.setImageResource(listimage[position]);
        return  convertView;
    //return null;
    }
}
