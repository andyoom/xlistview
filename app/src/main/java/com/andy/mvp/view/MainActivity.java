package com.andy.mvp.view;

import android.os.Bundle;
import android.widget.Toast;

import com.andy.mvp.R;
import com.andy.mvp.adapter.MyAdapter;
import com.andy.mvp.bean.Data;
import com.andy.mvp.presenter.IWarPresenter;
import com.andy.mvp.presenter.WarPresenter;
import com.example.library.BaseActvity;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

import java.util.ArrayList;
import java.util.List;

import me.maxwin.view.XListView;

@ContentView(R.layout.activity_main)
public class MainActivity extends BaseActvity implements IMainView,XListView.IXListViewListener{

    @ViewInject(R.id.xlv)
    private XListView xlv;
    private List<Data.ListBean> list=new ArrayList<>();
    private MyAdapter adapter;
    private IWarPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        xlv.setPullLoadEnable(true);
        xlv.setXListViewListener(this);
        adapter=new MyAdapter(this,list,R.layout.item);
        xlv.setAdapter(adapter);

        presenter=new WarPresenter(this);

        onRefresh();
    }
    @Override
    public void onRefresh() {
        presenter.refresh();
    }

    @Override
    public void onLoadMore() {
        presenter.loadMore();
    }

    @Override
    public void stopXlv(){
        xlv.stopRefresh();
        xlv.stopLoadMore();
        xlv.setRefreshTime("刚刚");
    }

    @Override
    public void clearListData() {
        list.clear();
    }

    @Override
    public void success(List<Data.ListBean> list) {
        this.list.addAll(list);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void fail(String failMsg) {
        Toast.makeText(this, failMsg, Toast.LENGTH_SHORT).show();
    }
}
