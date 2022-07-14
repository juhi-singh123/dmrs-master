package com.example.varsity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.view.View.GONE;

public class Module_brief extends AppCompatActivity {

    public TextView Module_title ,Module_no,Module_desc;
    private LinearLayout Beginner_Dropdown_layout,Intermediate_Dropdown_layout,Advanced_Dropdown_layout;
    private ImageView Beginner_Dropdown_image,Intermediate_Dropdown_image,Advanced_Dropdown_image,back_button_brief;
    public CardView Explore_beginner_cd_button,gotovideoo;
    public LinearLayout Module_brief_header;
    public LinearLayout Beginner_Dropdown_button,Intermediate_Dropdown_button,Advanced_Dropdown_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_brief);
        String moduletitle=getIntent().getStringExtra("module_title_string");
        String moduleno=getIntent().getStringExtra("module_no_string");
        String moduledesc=getIntent().getStringExtra("module_desc_string");
        String modulecolor=getIntent().getStringExtra("module_color");
        back_button_brief=findViewById(R.id.back_button_brief);
        Module_title= findViewById(R.id.Module_title);
        Module_no=findViewById(R.id.Module_no);
        Module_desc=findViewById(R.id.Module_desc);
        Beginner_Dropdown_layout=findViewById(R.id.beginner_drop_down_layout);
        Intermediate_Dropdown_layout=findViewById(R.id.Intermediate_drop_down_layout);
        Advanced_Dropdown_layout=findViewById(R.id.Advanced_drop_down_layout);
        Beginner_Dropdown_image=findViewById(R.id.beginner_drop_down_image);
        Intermediate_Dropdown_image=findViewById(R.id.Intermediate_drop_down_image);
        Advanced_Dropdown_image=findViewById(R.id.Advanced_drop_down_image);
        Beginner_Dropdown_button=findViewById(R.id.Beginner_Dropdown_button);
        Intermediate_Dropdown_button=findViewById(R.id.Intermediate_Dropdown_button);
        Advanced_Dropdown_button=findViewById(R.id.Advanced_Dropdown_button);
        Explore_beginner_cd_button=findViewById(R.id.Explore_beginner_cd_button);
        Module_brief_header=findViewById(R.id.Module_brief_header);
        gotovideoo=findViewById(R.id.gotovideo);
        Module_title.setText(moduletitle);
        Module_no.setText(moduleno);
        Module_desc.setText(moduledesc);

        if (moduleno.equals("01")){

            Module_brief_header.setBackgroundResource(R.color.first_module_color);
        }
        else if (moduleno.equals("02")){

            Module_brief_header.setBackgroundResource(R.color.second_module_color);
        }   if (moduleno.equals("03")){

            Module_brief_header.setBackgroundResource(R.color.third_module_color);
        }
        else if (moduleno.equals("04")){

            Module_brief_header.setBackgroundResource(R.color.fourth_module_color);
        }

        gotovideoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Video_activity.class);

                startActivity(intent);

            }
        });

        back_button_brief.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



        Beginner_Dropdown_button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {

                if (Beginner_Dropdown_layout.getVisibility()==8){

                    Beginner_Dropdown_layout.setVisibility(View.VISIBLE);
                    Beginner_Dropdown_image.setImageResource(R.drawable.minus);
                }

                else {
                    Beginner_Dropdown_layout.setVisibility(View.GONE);
                    Beginner_Dropdown_image.setImageResource(R.drawable.plus);
                }

            }
        });

        Intermediate_Dropdown_button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                if (Intermediate_Dropdown_layout.getVisibility()==8){

                    Intermediate_Dropdown_layout.setVisibility(View.VISIBLE);
                    Intermediate_Dropdown_image.setImageResource(R.drawable.minus);
                }else {
                    Intermediate_Dropdown_layout.setVisibility(View.GONE);
                    Intermediate_Dropdown_image.setImageResource(R.drawable.plus);
                }

            }
        });

        Advanced_Dropdown_button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                if (Advanced_Dropdown_layout.getVisibility()==8){
                    Advanced_Dropdown_layout.setVisibility(View.VISIBLE);
                    Advanced_Dropdown_image.setImageResource(R.drawable.minus);
                }else {
                    Advanced_Dropdown_layout.setVisibility(View.GONE);
                   Advanced_Dropdown_image.setImageResource(R.drawable.plus);

                }

            }
        });

        Explore_beginner_cd_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


//                String modulenoo=getIntent().getStringExtra("module_no_string");

                if(moduleno.equals("01"))
                {
                    Intent intent = new Intent(getApplicationContext(), Module_chapter.class);
                    intent.putExtra("moduleno",moduleno);
                    intent.putExtra("moduletitle",moduletitle);
                    startActivity(intent);
                }
                else if (moduleno.equals("02"))
                {
                    Intent intent = new Intent(getApplicationContext(), Module_chapter.class);
                    intent.putExtra("moduleno",moduleno);
                    intent.putExtra("moduletitle",moduletitle);
                    startActivity(intent);
                }
                else if (moduleno.equals("03"))
                {
                    Intent intent = new Intent(getApplicationContext(), Module_chapter.class);
                    intent.putExtra("moduleno",moduleno);
                    intent.putExtra("moduletitle",moduletitle);
                    startActivity(intent);
                }
                else if (moduleno.equals("04"))
                {
                    Intent intent = new Intent(getApplicationContext(), Module_chapter.class);
                    intent.putExtra("moduleno",moduleno);
                    intent.putExtra("moduletitle",moduletitle);
                    startActivity(intent);
                }

            }

        });
    }
}