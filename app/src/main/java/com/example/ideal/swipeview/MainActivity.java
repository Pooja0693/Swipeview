package com.example.ideal.swipeview;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager v1=(ViewPager) findViewById(R.id.V1);
        Custom c= new Custom(this);
        v1.setAdapter(c);
    }
}
