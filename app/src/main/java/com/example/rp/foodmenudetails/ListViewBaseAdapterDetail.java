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
public class ListViewBaseAdapterDetail extends BaseAdapter {


    Context context;
    ArrayList<Beandetail> beans;


    public ListViewBaseAdapterDetail(Context context, ArrayList<Beandetail> beans) {
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

            convertView = layoutInflater.inflate(R.layout.listviewdetail,null);


            viewHolder.image= (ImageView)convertView.findViewById(R.id.image);
            viewHolder.title= (TextView)convertView.findViewById(R.id.title);
            viewHolder.description= (TextView)convertView.findViewById(R.id.description);
            viewHolder.ratings= (RatingBar)convertView.findViewById(R.id.ratings);

            Typeface font = Typeface.createFromAsset(context.getAssets(), "fonts/Lato-Semibold.ttf");
           viewHolder.title.setTypeface(font);




            convertView.setTag(viewHolder);


        }else {

            viewHolder = (ViewHolder)convertView.getTag();

        }


        Beandetail beans = (Beandetail)getItem(position);

        viewHolder.image.setImageResource(beans.getImage());
        viewHolder.title.setText(beans.getTitle());
        viewHolder.description.setText(beans.getDescription());
        viewHolder.ratings.setRating(Float.parseFloat(beans.getRatings()));


        return convertView;
    }

    private class ViewHolder{

        ImageView image;
        TextView title;
        TextView description;
        RatingBar ratings;



    }

}
