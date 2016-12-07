package com.dynobjx.vviewpager.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dynobjx.vertical.PagerAdapter;
import com.dynobjx.vviewpager.R;

/**
 * Created by root on 12/7/16.
 */

public class HorizontalAdapter extends PagerAdapter {

    private Context context;
    private int child;
    private int parent;

    public HorizontalAdapter(Context context, int child, int parent) {
        this.context = context;
        this.child = child;
        this.parent = parent;
    }

    @Override
    public int getCount() {
        return this.child;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        final View v = LayoutInflater.from(this.context).inflate(R.layout.horizontal_page, container, false);

        TextView content = (TextView) v.findViewById(R.id.text);
        content.setText("Product #  " + this.parent + "\n" + "Product image  #" + position);
        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
