package com.andy.mvp.presenter;

import com.andy.mvp.bean.Data;
import com.andy.mvp.model.WarModel;
import com.andy.mvp.view.IMainView;
import com.example.library.http.MyCallback;

/**
 * 类描述：
 * 创建人：yekh
 * 创建时间：2017/7/21 15:19
 */
public class WarPresenter implements IWarPresenter{
    private String urlPath = "http://wangyi.butterfly.mopaasapp.com/news/api?type=war&limit=10&page=";
    private int page = 1;
    private IMainView mIMainView;
    private WarModel warModel;

    public WarPresenter(IMainView IMainView) {
        mIMainView = IMainView;
        warModel=new WarModel();
    }

    @Override
    public void refresh() {
        page=1;
        //加载数据
        mIMainView.clearListData();
        loadData();
    }

    @Override
    public void loadMore() {
        page++;
        loadData();
    }

    private void loadData() {
        warModel.loadDataWar(urlPath + page, new MyCallback<Data>() {
            @Override
            public void success(Data data) {
                mIMainView.success(data.getList());
                mIMainView.stopXlv();
            }

            @Override
            public void error(Throwable throwable) {
                mIMainView.fail(throwable.getMessage());
                mIMainView.stopXlv();
            }
        });
    }
}
