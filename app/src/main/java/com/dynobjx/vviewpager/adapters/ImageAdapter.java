package com.dynobjx.vviewpager.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.dynobjx.vviewpager.fragments.ImageFragment;

/**
 * Created by root on 12/7/16.
 */

public class ImageAdapter extends FragmentStatePagerAdapter {

    private Context context;
    private int child;
    private int parent;

    public ImageAdapter(FragmentManager fm, Context context, int child, int parent) {
        super(fm);
        this.context = context;
        this.child = child;
        this.parent = parent;
    }

    @Override
    public ImageFragment getItem(int position) {
        return ImageFragment.newInstance(this.parent, position);
    }

    @Override
    public int getCount() {
        return child;
    }
}
