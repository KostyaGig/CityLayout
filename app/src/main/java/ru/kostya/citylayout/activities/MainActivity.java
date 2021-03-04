package ru.kostya.citylayout.activities;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;


import ru.kostya.citylayout.R;
import ru.kostya.citylayout.fragments.MainFragment;
import ru.kostya.citylayout.fragments.NewsFragment;
import ru.kostya.citylayout.fragments.ProfileFragment;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();

        ft.replace(R.id.cont,new NewsFragment());
        ft.addToBackStack(null);
        ft.commit();

        BottomNavigationView bottomBar =  findViewById(R.id.bottomBar);
        bottomBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction ft = manager.beginTransaction();
                switch (item.getItemId()){
                    case R.id.news:
                        ft.replace(R.id.cont,new NewsFragment());
                        ft.addToBackStack(null);

                        break;

                    case R.id.main:
                        ft.replace(R.id.cont,new MainFragment());
                        ft.addToBackStack(null);

                        break;
                    case R.id.profile:
                        ft.replace(R.id.cont,new ProfileFragment());
                        ft.addToBackStack(null);

                        break;
                }
                ft.commit();
                return true;
            }
        });
    }
}