package com.example.varsity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

public class Module_chapter extends AppCompatActivity {

    public TextView beginner_module_no;
    public TextView beginner_module_title;
    private ImageView back_button_brief;
    public CardView Module_cd_btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_chapter);
        String moduleno=getIntent().getStringExtra("moduleno");
        String moduletitle=getIntent().getStringExtra("moduletitle");
        Module_cd_btn=findViewById(R.id.Module_cd_btn);
        back_button_brief=findViewById(R.id.back_button_brief);
        beginner_module_no=findViewById(R.id.beginner_module_no);
        beginner_module_title=findViewById(R.id.beginner_module_title);
        beginner_module_no.setText(moduleno);
        beginner_module_title.setText(moduletitle);

        Module_cd_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Module_pages.class);
                startActivity(intent);
            }
        });

        back_button_brief.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}