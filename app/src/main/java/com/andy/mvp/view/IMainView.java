package com.andy.mvp.view;

import com.andy.mvp.bean.Data;

import java.util.List;

/**
 * 类描述：
 * 创建人：yekh
 * 创建时间：2017/7/21 15:19
 */
public interface IMainView{
    void  clearListData();
    void  success(List<Data.ListBean> list);
    void  fail(String failMsg);
    void  stopXlv();
}
