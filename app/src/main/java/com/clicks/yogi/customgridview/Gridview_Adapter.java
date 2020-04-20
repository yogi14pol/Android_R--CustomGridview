package com.clicks.yogi.customgridview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Gridview_Adapter extends BaseAdapter {

    private Context context;
    private String[] countryName;
    private String[] num;
    private Integer[] img;

    Gridview_Adapter(Context context, String[] countryName, String[] num, Integer[] img) {
        this.context = context;
        this.countryName = countryName;
        this.num = num;
        this.img = img;
    }

    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint({"ViewHolder", "InflateParams"})
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        view = layoutInflater.inflate(R.layout.custom_gridlist,null);

        TextView cName = view.findViewById(R.id.countryName);
        TextView number = view.findViewById(R.id.number);
        ImageView flag = view.findViewById(R.id.flag);

        cName.setText(countryName[position]);
        number.setText(num[position]);
        flag.setImageResource(img[position]);

        return view;
    }
}
