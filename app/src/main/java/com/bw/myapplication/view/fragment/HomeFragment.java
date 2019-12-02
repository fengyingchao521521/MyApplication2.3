package com.bw.myapplication.view.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bw.myapplication.R;
import com.bw.myapplication.base.BaseFragment;
import com.bw.myapplication.util.NetUtil;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends BaseFragment {


    private TextView textView;
    private ImageView imageView;

    @Override
    protected void initView(View inflate) {
        textView = inflate.findViewById(R.id.tv);
        imageView = inflate.findViewById(R.id.img);

    }

    @Override
    protected int layoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initData() {
        if (NetUtil.getInstance().hasNet(getActivity())){
            textView.setVisibility(View.VISIBLE);
            imageView.setVisibility(View.GONE);
        }else {
            imageView.setVisibility(View.VISIBLE);
            textView.setVisibility(View.GONE);
        }


    }

}
