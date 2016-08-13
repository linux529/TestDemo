package com.scie.testdemo.recyclerview.sample;

import android.support.annotation.NonNull;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

import com.scie.testdemo.R;
import com.scie.testdemo.recyclerview.base.holder.BaseRecyclerViewAdapter;
import com.scie.testdemo.recyclerview.base.holder.BaseRecyclerViewHolder;
import com.scie.testdemo.recyclerview.holder.GlideHolder;
import com.scie.testdemo.recyclerview.holder.TestHolderOne;

import java.util.List;

/**
 * Created by Administrator on 2016/8/13.
 */
public class TestHolderAdapter extends BaseRecyclerViewAdapter<String> {

    public static final int TYPE_ONE = 1;
    public static final int TYPE_TWO = 2;
    public static final int TYPE_THREE = 3;

    public TestHolderAdapter(@NonNull List<String> datas) {
        super(datas);
    }

    @Override
    public void setViewHolder(ViewGroup parent, SparseArray<BaseRecyclerViewHolder> viewHolders) {
        View viewOne = mLayoutInflater.inflate(R.layout.item_one, parent, false);
        View viewTwo = mLayoutInflater.inflate(R.layout.item_two, parent, false);
        View viewThree = mLayoutInflater.inflate(R.layout.item_glide, parent, false);
        viewHolders.put(TYPE_ONE,new TestHolderOne(viewOne));
        viewHolders.put(TYPE_TWO,new TestHolderOne(viewTwo));
        viewHolders.put(TYPE_THREE,new GlideHolder(viewThree));
    }

    @Override
    public int getItemViewType(int position) {
        return position==0?TYPE_ONE:TYPE_THREE;
    }
}
