package com.example.listbase;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
    TextView txtMsg;
    String[] items_first = {"ABC","DEF","GHI","KLM"};
    String[] items_second = {"123","456","789","987"};
    Integer[] thumbnails = {R.drawable.pic01,R.drawable.pic02,R.drawable.pic03,R.drawable.pic04};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMsg = (TextView) findViewById(R.id.txtMsg);
        CustomIconLabelAdapter adapter = new CustomIconLabelAdapter(this,R.layout.custom_row,items_first,items_second,thumbnails);
        setListAdapter(adapter);
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String text = "Position:" + position + " " + items_first[position];
        txtMsg.setText(text);
    }
}