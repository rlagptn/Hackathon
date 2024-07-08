//package com.example.hackathonevent;
//
//import android.os.Bundle;
//import android.view.MenuItem;
//
//import androidx.activity.EdgeToEdge;
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//
//import com.example.hackathonevent.FeedbackFragment;
//import com.example.hackathonevent.RegisterFragment;
//import com.google.android.material.bottomnavigation.BottomNavigationView;
//import com.google.android.material.navigation.NavigationBarView;
//
//public class MainActivity extends AppCompatActivity {
//
//    BottomNavigationView bottomNavigationView;
//
//    HomeFragment homeFragment = new HomeFragment();
//
//    ExploreFragment exploreFragment = new ExploreFragment();
//
//    FeedbackFragment feedbackFragment = new FeedbackFragment();
//
//    RegisterFragment registerFragment = new RegisterFragment();
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        bottomNavigationView = findViewById(R.id.bottom_nav);
//
//        getSupportFragmentManager().beginTransaction()
//                .add(R.id.container, homeFragment, "homeFragment")
//                .add(R.id.container, exploreFragment, "exploreFragment")
//                .add(R.id.container, registerFragment, "registerFragment")
//                .add(R.id.container, feedbackFragment, "feedbackFragment")
//                .hide(exploreFragment)
//                .hide(registerFragment)
//                .hide(feedbackFragment)
//                .commit();
//
//        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                int id = item.getItemId();
//
//                if (id == R.id.home) {
//                    getSupportFragmentManager().beginTransaction().hide(exploreFragment).hide(registerFragment).hide(feedbackFragment).show(homeFragment).commit();
//                    return true;
//                } else if (id == R.id.explore) {
//                    getSupportFragmentManager().beginTransaction().hide(homeFragment).hide(registerFragment).hide(feedbackFragment).show(exploreFragment).commit();
//                    return true;
//                } else if (id == R.id.register) {
//                    getSupportFragmentManager().beginTransaction().hide(homeFragment).hide(exploreFragment).hide(feedbackFragment).show(registerFragment).commit();
//                    return true;
//                } else if (id == R.id.feedback) {
//                    getSupportFragmentManager().beginTransaction().hide(homeFragment).hide(exploreFragment).hide(registerFragment).show(feedbackFragment).commit();
//                    return true;
//                }
//
//                return false;
//            }
//        });
//    }
//}
//
//
//
package com.example.hackathonevent;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment = new HomeFragment();
    ExploreFragment exploreFragment = new ExploreFragment();
    FeedbackFragment feedbackFragment = new FeedbackFragment();
    RegisterFragment registerFragment = new RegisterFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_nav);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, homeFragment, "homeFragment")
                .add(R.id.container, exploreFragment, "exploreFragment")
                .add(R.id.container, registerFragment, "registerFragment")
                .add(R.id.container, feedbackFragment, "feedbackFragment")
                .hide(exploreFragment)
                .hide(registerFragment)
                .hide(feedbackFragment)
                .commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.home) {
                    getSupportFragmentManager().beginTransaction().hide(exploreFragment).hide(registerFragment).hide(feedbackFragment).show(homeFragment).commit();
                    return true;
                } else if (id == R.id.explore) {
                    getSupportFragmentManager().beginTransaction().hide(homeFragment).hide(registerFragment).hide(feedbackFragment).show(exploreFragment).commit();
                    return true;
                } else if (id == R.id.register) {
                    getSupportFragmentManager().beginTransaction().hide(homeFragment).hide(exploreFragment).hide(feedbackFragment).show(registerFragment).commit();
                    return true;
                } else if (id == R.id.feedback) {
                    getSupportFragmentManager().beginTransaction().hide(homeFragment).hide(exploreFragment).hide(registerFragment).show(feedbackFragment).commit();
                    return true;
                }

                return false;
            }
        });
    }
}
