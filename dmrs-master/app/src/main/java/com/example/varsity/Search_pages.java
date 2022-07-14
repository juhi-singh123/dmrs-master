package com.example.varsity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Search_pages extends AppCompatActivity {

    ViewPager mmViewpager;
    Search_ImageAdapter searchadapterView;
    private ImageView back_button_search;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_pages);

        mmViewpager = (ViewPager)findViewById(R.id.searchviewpage);
        back_button_search=findViewById(R.id.back_button_search);
        searchadapterView = new Search_ImageAdapter(this);
        mmViewpager.setAdapter(searchadapterView);

        back_button_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }}