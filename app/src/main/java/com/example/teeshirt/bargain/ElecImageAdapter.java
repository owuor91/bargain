package com.example.teeshirt.bargain;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ElecImageAdapter extends BaseAdapter{
    private Context mContext;

    public ElecImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return electronics.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(180, 180));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);

        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(electronics[position]);
        return imageView;
    }

    // references to our images
    private Integer[] electronics = {
            R.drawable.cofeemaker, R.drawable.cooker,
            R.drawable.dvd, R.drawable.fridge,
            R.drawable.hometheatre, R.drawable.laptops,
            R.drawable.microwave, R.drawable.phone,
            R.drawable.ps4,R.drawable.radio,R.drawable.tv,R.drawable.xbox
    };
}
