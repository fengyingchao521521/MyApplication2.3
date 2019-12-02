package com.bw.myapplication.view.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.bw.myapplication.R;
import com.bw.myapplication.base.BaseFragment;
import com.bw.myapplication.view.activity.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends BaseFragment {

    private Button button;

    @Override
    protected void initView(View inflate) {
        button = inflate.findViewById(R.id.tbn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity mainActivity= (MainActivity) getActivity();
                mainActivity.toMypage();
            }
        });

    }

    @Override
    protected int layoutId() {
        return R.layout.fragment_news;
    }

    @Override
    protected void initData() {

    }

}
