package com.example.varsity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView goal_btn=findViewById(R.id.goal_btn);

        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigationView);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_conatiner,
                new HomeTest()).commit();


    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull  MenuItem item) {

                    Fragment selectedFragment = null;

                    switch (item.getItemId()){
                        case R.id.navigation_home:
                            selectedFragment = new HomeTest();
                            break;
                        case R.id.navigation_search:
                            selectedFragment = new search();
                            break;
                        case R.id.navigation_favourites:
                            selectedFragment = new favourites();
                            break;
                        case R.id.navigation_profile:
                            selectedFragment = new profile();
                            break;

                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_conatiner,selectedFragment).commit();

                    return true;

                }
            };
    }


