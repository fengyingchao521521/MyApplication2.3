package com.bw.myapplication.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bw.myapplication.R;
import com.bw.myapplication.modle.base.ShopBase;
import com.bw.myapplication.util.NetUtil;

import java.util.List;

/*
 *@auther: 封英超
 *@Date: 2019/12/2
 *@Time:18:56
 *@Description:${DESCRIPTION}
 *
 */public class MyAdapter extends BaseAdapter {

    private List<ShopBase.DataBean> list;

    public MyAdapter(List<ShopBase.DataBean> data) {
        this.list = data;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = View.inflate(parent.getContext(), R.layout.item, null);
            viewHolder.imageView = convertView.findViewById(R.id.img);
            viewHolder.textView = convertView.findViewById(R.id.tv);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        ShopBase.DataBean dataBean = list.get(position);
        viewHolder.textView.setText(dataBean.getGoods_name());
        NetUtil.getInstance().getPhoto(dataBean.getGoods_thumb(), viewHolder.imageView);
        return convertView;
    }

    class ViewHolder {
        ImageView imageView;
        TextView textView;
    }
}
