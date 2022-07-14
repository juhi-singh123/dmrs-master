package com.example.varsity;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link search#} factory method to
 * create an instance of this fragment.
 */
public class search extends Fragment {

    CardView search_button_for_pages;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_search2, container, false);

        search_button_for_pages=root.findViewById(R.id.search_button_for_pages);

        search_button_for_pages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireActivity(),Search_pages.class);
                startActivity(intent);
            }
        });



return root;
}
}