package com.bw.myapplication.view.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.bw.myapplication.R;
import com.bw.myapplication.base.BaseActivity;
import com.bw.myapplication.view.fragment.HomeFragment;
import com.bw.myapplication.view.fragment.MyFragment;
import com.bw.myapplication.view.fragment.NewsFragment;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    private ViewPager viewPager;
    private RadioGroup radioGroup;
    private ArrayList<Fragment> list=new ArrayList<>();

    @Override
    protected void initData() {

        list.add(new HomeFragment());
        list.add(new NewsFragment());
        list.add(new MyFragment());

        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });

    }

    @Override
    protected void initView() {
        viewPager = findViewById(R.id.vp);
        radioGroup = findViewById(R.id.rg);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                radioGroup.check(radioGroup.getChildAt(position).getId());
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbtn_home:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.rbtn_new:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.rbtn_my:
                        viewPager.setCurrentItem(2);
                        break;
                }
            }
        });


    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }

    public void toMypage(){
        viewPager.setCurrentItem(2);
    }

}
