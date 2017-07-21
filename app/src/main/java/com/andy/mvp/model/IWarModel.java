package com.andy.mvp.model;

import com.example.library.http.MyCallback;

/**
 * 类描述：
 * 创建人：yekh
 * 创建时间：2017/7/21 15:41
 */
public interface IWarModel {
    void loadDataWar(String urlPath, MyCallback callBak);
}
