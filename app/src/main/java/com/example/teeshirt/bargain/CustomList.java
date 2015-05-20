package com.example.teeshirt.bargain;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String>{
    private final Activity context;
    private final String[] television;
    private final Integer[] imageId;

    public CustomList(Activity context, String[] television, Integer[] imageId){
        super(context, R.layout.list,television);
        this.context = context;
        this.television = television;
        this.imageId = imageId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list, null, true);

        TextView txt = (TextView)rowView.findViewById(R.id.txt);
        ImageView img = (ImageView)rowView.findViewById(R.id.img);

        txt.setText(television[position]);
        img.setImageResource(imageId[position]);

        return rowView;
    }
}
