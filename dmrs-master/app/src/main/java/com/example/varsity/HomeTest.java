package com.example.varsity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeTest} factory method to
 * create an instance of this fragment.
 */
public class HomeTest extends Fragment {

String module_first_title="Stock Market Basic";
String module_first_no="01";
String module_first_desc="Start with this module this module if you are a market newbie. this module will helo you understand the market basics includif the IPO markets, commonly used jargons,tradind termaial,and market events";
String module_Second_title="Technical Analysis";
String module_second_no="02";
String module_second_desc="This comprehensive module on 'Technical Analysis' helps you understand the japanese candlestick patterns, volum analysis,support , resistance, indicators,risk-reward ratio,and the Dow Theory ";
String module_third_title="Futures Trading";
String module_third_no="03";
String module_third_desc="This module helps you develop a comprehensive understanding of how the 'Futures Contract' is structured and traded in the Indian derivative market. ";
String module_fourth_title="Options Trading";
String module_fourth_no="04";
String module_fourth_desc="This comprehansive module on 'Options Theory', covers topics ranging from the very basics to advanced options trading concepts.";
String module_color="black";





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_home_test, container, false);
        CardView continue_reading_cd=root.findViewById(R.id.continue_reading_cd);
        CardView module_first_cd=root.findViewById(R.id.module_first_cd);
        CardView module_second_cd=root.findViewById(R.id.module_second_cd);
        CardView module_third_cd=root.findViewById(R.id.module_third_cd);
        CardView module_fourth_cd=root.findViewById(R.id.module_fourth_cd);
        CardView goalbtn=root.findViewById(R.id.goal_btn);
        CardView progress_btn=root.findViewById(R.id.progress_btn);

        continue_reading_cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireActivity(),Module_pages.class);
                startActivity(intent);
            }
        });

        progress_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireActivity(),Progress_page.class);
                startActivity(intent);
            }
        });

        goalbtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {


        ViewGroup viewGroup = root.findViewById(android.R.id.content);

        View dialogView = LayoutInflater.from(requireActivity()).inflate(R.layout.goal_alert_box, viewGroup, false);


        //Now we need an AlertDialog.Builder object
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());

        //setting the view of the builder to our custom view that we already inflated
        builder.setView(dialogView);

        //finally creating the alert dialog and displaying it
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        alertDialog.getWindow().setLayout(900, 1400);
    }
});

        module_first_cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(requireActivity(),Module_brief.class);
                intent.putExtra("module_title_string",module_first_title);
                intent.putExtra("module_no_string",module_first_no);
                intent.putExtra("module_desc_string",module_first_desc);
                intent.putExtra("module_color", Color.BLUE);

                startActivity(intent);
            }
        });

        module_second_cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(requireActivity(),Module_brief.class);
                intent.putExtra("module_title_string",module_Second_title);
                intent.putExtra("module_no_string",module_second_no);
                intent.putExtra("module_desc_string",module_second_desc);



                startActivity(intent);

            }
        });
        module_third_cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(requireActivity(),Module_brief.class);
                intent.putExtra("module_title_string",module_third_title);
                intent.putExtra("module_no_string",module_third_no);
                intent.putExtra("module_desc_string",module_third_desc);



                startActivity(intent);

            }
        });
        module_fourth_cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(requireActivity(),Module_brief.class);
                intent.putExtra("module_title_string",module_fourth_title);
                intent.putExtra("module_no_string",module_fourth_no);
                intent.putExtra("module_desc_string",module_fourth_desc);



                startActivity(intent);
            }
        });



        return  root;
    }


}