package com.example.rp.foodmenudetails;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rp on 4/9/2016.
 */
public class ListViewBaseAdapter extends BaseAdapter {


    Context context;
    ArrayList<Bean> beans;


    public ListViewBaseAdapter(Context context, ArrayList<Bean> beans) {
        this.context = context;
        this.beans = beans;
    }


    @Override
    public int getCount() {
        return beans.size();
    }

    @Override
    public Object getItem(int position) {
        return beans.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder = null;


     ;


        if (convertView == null){

            LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            viewHolder = new ViewHolder();

            convertView = layoutInflater.inflate(R.layout.list,null);


            viewHolder.image= (ImageView)convertView.findViewById(R.id.image);
            viewHolder.title= (TextView)convertView.findViewById(R.id.title);
            viewHolder.rupee= (TextView)convertView.findViewById(R.id.rupee);
            viewHolder.timetext= (TextView)convertView.findViewById(R.id.timetext);
            viewHolder.ratings= (RatingBar)convertView.findViewById(R.id.ratings);

            Typeface font = Typeface.createFromAsset(context.getAssets(), "fonts/Lato-Semibold.ttf");
           viewHolder.title.setTypeface(font);




            convertView.setTag(viewHolder);


        }else {

            viewHolder = (ViewHolder)convertView.getTag();

        }


        Bean beans = (Bean)getItem(position);

        viewHolder.image.setImageResource(beans.getImage());
        viewHolder.title.setText(beans.getTitle());
        viewHolder.rupee.setText(beans.getRupee());
        viewHolder.timetext.setText(beans.getTimetext());
        viewHolder.ratings.setRating(Float.parseFloat(beans.getRatings()));


        return convertView;
    }

    private class ViewHolder{

        ImageView image;
        TextView title;
        TextView rupee;
        TextView timetext;
        RatingBar ratings;


    }

}
