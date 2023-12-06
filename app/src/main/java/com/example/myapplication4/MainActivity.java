package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPagerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Page2Adapter adapter = new Page2Adapter(getSupportFragmentManager(),getLifecycle());
        viewPagerFragment = (ViewPager2) findViewById(R.id.viewpage2);
        viewPagerFragment.setOrientation(viewPagerFragment.ORIENTATION_HORIZONTAL);
        viewPagerFragment.setAdapter(adapter);
    }
}