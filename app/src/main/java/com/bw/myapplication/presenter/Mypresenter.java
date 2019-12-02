package com.bw.myapplication.presenter;

import com.bw.myapplication.contract.IMycontract;
import com.bw.myapplication.modle.MyModle;
import com.bw.myapplication.modle.base.ShopBase;

/*
 *@auther: 封英超
 *@Date: 2019/12/2
 *@Time:20:35
 *@Description:${DESCRIPTION}
 *
 */public class Mypresenter {

    private MyModle myModle;

    public void getMyData(final IMycontract.IView iView) {
        myModle = new MyModle();
        myModle.getMyData(new IMycontract.IModleCallback() {
            @Override
            public void OnMysuccess(ShopBase shopBase) {
                iView.OnMysuccess(shopBase);
            }

            @Override
            public void OnMyFuilure(Throwable throwable) {
                iView.OnMyFuilure(throwable);
            }
        });
    }

}
