package com.bw.myapplication.view.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.bw.myapplication.R;
import com.bw.myapplication.base.BaseFragment;
import com.bw.myapplication.contract.IMycontract;
import com.bw.myapplication.modle.base.ShopBase;
import com.bw.myapplication.presenter.Mypresenter;
import com.bw.myapplication.view.adapter.MyAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends BaseFragment implements IMycontract.IView {

    private GridView gridView;
    private Mypresenter mypresenter;

    @Override
    protected void initView(View inflate) {
        gridView = inflate.findViewById(R.id.gv);


    }

    @Override
    protected int layoutId() {
        return R.layout.fragment_my;
    }

    @Override
    protected void initData() {
        mypresenter = new Mypresenter();
        mypresenter.getMyData(this);

    }

    @Override
    public void OnMysuccess(ShopBase shopBase) {
        gridView.setAdapter(new MyAdapter(shopBase.getData()) );
    }

    @Override
    public void OnMyFuilure(Throwable throwable) {

    }
}
