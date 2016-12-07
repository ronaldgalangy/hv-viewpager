package com.dynobjx.vviewpager.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dynobjx.vviewpager.R;

/**
 * Created by root on 12/7/16.
 */

public class ImageFragment extends Fragment {

    private int child;
    private int parent;

    public static ImageFragment newInstance(int parent, int child) {
        final ImageFragment imageFragment = new ImageFragment();
        imageFragment.child = child;
        imageFragment.parent = parent;
        return imageFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View fragView = inflater.inflate(R.layout.horizontal_page, container, false);
        final TextView tView = (TextView) fragView.findViewById(R.id.text);
        tView.setText("Product #  " + this.parent + "\n" + "Product image  #" + child);
        return fragView;
    }
}
