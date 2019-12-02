package com.bw.myapplication.contract;

import com.bw.myapplication.modle.base.ShopBase;

/*
 *@auther: 封英超
 *@Date: 2019/12/2
 *@Time:20:31
 *@Description:${DESCRIPTION}
 *
 */public interface IMycontract {
     interface IView{
         void OnMysuccess(ShopBase shopBase);
         void OnMyFuilure(Throwable throwable);
    }
    interface IModleCallback{
        void OnMysuccess(ShopBase shopBase);
        void OnMyFuilure(Throwable throwable);
    }


}
