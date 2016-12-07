package com.dynobjx.vviewpager.adapters;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dynobjx.vertical.PagerAdapter;

import android.support.v4.view.ViewPager;
import com.dynobjx.vviewpager.R;

import java.util.Random;

/**
 * Created by root on 12/7/16.
 */

public class VerticalAdapter extends PagerAdapter {

    private Context context;
    private int parent;
    private AppCompatActivity activity;

    public VerticalAdapter(Context context, int parent) {
        super();
        this.context = context;
        this.parent = parent;
        this.activity = (AppCompatActivity) context;
    }

    @Override
    public int getCount() {
        return this.parent;
    }

    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        final View v = LayoutInflater.from(this.context).inflate(R.layout.page, container, false);

        final ViewPager horizontalViewPager = (ViewPager) v.findViewById(R.id.horizontal_view_pager);
        final HorizontalAdapter horizontalAdapter = new HorizontalAdapter(this.context, 4, position);
        horizontalViewPager.setAdapter(horizontalAdapter);
        container.addView(horizontalViewPager);

        /*final ViewPager horizontalViewPager = (ViewPager) v.findViewById(R.id.horizontal_view_pager);
        final ImageAdapter imageAdapter = new ImageAdapter(activity.getSupportFragmentManager(), this.context, 4, position);
        horizontalViewPager.setAdapter(imageAdapter);
        container.removeAllViews();
        container.addView(horizontalViewPager);*/
        System.out.println("parent : " + position);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
