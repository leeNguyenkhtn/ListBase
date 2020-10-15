package com.example.listbase;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomIconLabelAdapter extends ArrayAdapter<String> {
    Context context;
    Integer[] thumbnails;
    String[] items_first;
    String[] items_second;
    public CustomIconLabelAdapter(Context context, int layoutToBeInflated, String[]items_first,String[] items_second, Integer[] thumbnails)
    {
        super(context,R.layout.custom_row,items_first);
        this.context = context;
        this.thumbnails = thumbnails;
        this.items_first = items_first;
        this.items_second = items_second;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        @SuppressLint("ViewHolder") View row = inflater.inflate(R.layout.custom_row,null);
        TextView label_first = (TextView) row.findViewById(R.id.label_first);
        TextView label_second = (TextView) row.findViewById(R.id.label_second);
        ImageView icon = (ImageView) row.findViewById(R.id.icon);
        label_first.setText(items_first[position]);
        label_second.setText(items_second[position]);
        icon.setImageResource(thumbnails[position]);
        return row;
    }
}
