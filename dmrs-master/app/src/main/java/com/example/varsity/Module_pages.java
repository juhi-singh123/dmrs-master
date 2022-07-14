package com.example.varsity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Module_pages extends AppCompatActivity {

    ViewPager mViewpager;
    ImageAdapter adapterView;
    private ImageView back_button_brief;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_pages);

        mViewpager = (ViewPager)findViewById(R.id.viewpage);
        back_button_brief=findViewById(R.id.back_button_brief);
        adapterView = new ImageAdapter(this);
        mViewpager.setAdapter(adapterView);

        back_button_brief.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}