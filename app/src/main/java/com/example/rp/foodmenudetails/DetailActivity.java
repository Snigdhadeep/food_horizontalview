package com.example.rp.foodmenudetails;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    ExpandableHeightListView listView;
ImageView back;
    private int[] Image = {R.drawable.p1,R.drawable.p2,R.drawable.p3};

    private String[] Title ={"Mandi","Lissa","Clark"};

    private String[] description = {"Nice food it was awesome","Nice food it was awesome ","Nice food it was awesome "};
    private String[] Ratings ={"5","3","4"};
    private ArrayList<Beandetail> beans;
    private ListViewBaseAdapterDetail listViewBaseAdapterDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);

    back = (ImageView)findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DetailActivity.this,MainActivity.class);
                startActivity(it);
            }
        });


        ExpandableHeightListView listview = (ExpandableHeightListView) findViewById(R.id.listview);
        beans= new ArrayList<Beandetail>();

        for (int i= 0; i< Title.length; i++) {

            Beandetail beanclass = new Beandetail(Image[i],Title[i],description[i],Ratings[i]);
            beans.add(beanclass);

        }
        listViewBaseAdapterDetail = new ListViewBaseAdapterDetail(DetailActivity.this, beans);

        listview.setAdapter(listViewBaseAdapterDetail);

    }
}
