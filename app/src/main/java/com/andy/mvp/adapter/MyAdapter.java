package com.andy.mvp.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.andy.mvp.R;
import com.andy.mvp.bean.Data;
import com.example.library.adapter.CommAdapter;
import com.example.library.image.NetImageLoader;

import org.xutils.view.annotation.ViewInject;

import java.util.List;

/**
 * 类描述：
 * 创建人：yekh
 * 创建时间：2017/7/21 15:01
 */
public class MyAdapter extends CommAdapter<Data.ListBean,MyAdapter.ViewHolder>{

    public MyAdapter(Context context, List<Data.ListBean> list, int itemLayoutId) {
        super(context, list, itemLayoutId);
    }

    @Override
    public void setViewByHolder(ViewHolder viewHolder, Data.ListBean listBean) {
        viewHolder.title.setText(listBean.getTitle());
        viewHolder.time.setText(listBean.getTime());
        NetImageLoader.getInstance().display(listBean.getImgurl(),viewHolder.image);
    }

    @Override
    public ViewHolder getViewHolder() {
        return new ViewHolder();
    }

    class ViewHolder{
        @ViewInject(R.id.image)
        ImageView image;
        @ViewInject(R.id.title)
        TextView title;
        @ViewInject(R.id.time)
        TextView time;
    }
}
