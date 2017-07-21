package com.andy.mvp.model;

import com.example.library.App;
import com.example.library.http.MyCallback;

/**
 * 类描述：
 * 创建人：yekh
 * 创建时间：2017/7/21 15:18
 */
public class WarModel implements IWarModel {

    @Override
    public void loadDataWar(String urlPath, MyCallback callBak){
        App.getApp().http().get(urlPath,callBak);
    }
}
