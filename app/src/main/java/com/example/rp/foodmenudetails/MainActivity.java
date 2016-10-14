package com.example.rp.foodmenudetails;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

private TextView title;
    ExpandableHeightListView listview;


private int[] Image = {R.drawable.foodb,R.drawable.burgerchizz,R.drawable.cake,R.drawable.cupcake,R.drawable.noodles,R.drawable.whitepasta};

    private String[] Title ={"Italian Chocolate","Burger","Cake","Cupcake","Noodles","White Pasta"};

    private String[] Rupee = {"Rs 100","Rs 210 ","Rs 500 ","Rs 240","Rs 150","120"};
        private String[] Ratings ={"5","3","4","5","4","3"};

    private String[] Timetext = {"5 Min Away","10 Min Away ","10 Min Away ","30 Min Away","15 Min Away","20 Min Away"};

    private ArrayList<Bean> beans;
    private ListViewBaseAdapter listViewBaseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        TextView title = (TextView)findViewById(R.id.title);
//        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Lato-Semibold.ttf");
//        title.setTypeface(font);

        listview = (ExpandableHeightListView)findViewById(R.id.listview);
        beans= new ArrayList<Bean>();

        for (int i= 0; i< Title.length; i++) {

            Bean beanclass = new Bean(Image[i],Ratings[i], Rupee[i],Title[i],Timetext[i]);
            beans.add(beanclass);

        }
        listViewBaseAdapter = new ListViewBaseAdapter(MainActivity.this, beans);

        listview.setAdapter(listViewBaseAdapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent it = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(it);
            }
        });
    }
}
