package com.dynobjx.vviewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dynobjx.vertical.VViewPager;
import com.dynobjx.vviewpager.adapters.VerticalAdapter;

public class MainActivity extends AppCompatActivity {

    private VViewPager VViewPager;
    private VerticalAdapter verticalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.VViewPager = (VViewPager) findViewById(R.id.view_pager);

        this.verticalAdapter = new VerticalAdapter(this, 5);
        this.VViewPager.setAdapter(verticalAdapter);
    }
}
