package com.bw.myapplication.modle;

import com.bw.myapplication.contract.IMycontract;
import com.bw.myapplication.modle.base.ShopBase;
import com.bw.myapplication.util.NetUtil;
import com.google.gson.Gson;

/*
 *@auther: 封英超
 *@Date: 2019/12/2
 *@Time:20:29
 *@Description:${DESCRIPTION}
 *
 */public class MyModle {
    public void getMyData(final IMycontract.IModleCallback iModleCallback) {
        NetUtil.getInstance().getJson("http://blog.zhaoliang5156.cn/api/shop/shop1.json", new NetUtil.MyCallback() {
            @Override
            public void onGetJson(String json) {
                ShopBase shopBase = new Gson().fromJson(json, ShopBase.class);
                iModleCallback.OnMysuccess(shopBase);
            }

            @Override
            public void onError(Throwable throwable) {
                iModleCallback.OnMyFuilure(throwable);
            }
        });
    }
}
