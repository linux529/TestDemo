package com.scie.androidlib.recyclerview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2016/8/12.
 */
public abstract class BaseRecyclerViewAdapter<T> extends RecyclerView.Adapter<BaseViewHolder> {
    private SparseArray<Integer> mLayoutIds;
    protected List<T> mDatas;
    private LayoutInflater mLayoutInflater;
    public BaseRecyclerViewAdapter(@NonNull List<T> datas) {
        mDatas = datas;
        mLayoutIds = new SparseArray<>();
        setLayoutIds(mLayoutIds);
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mLayoutInflater = getLayoutInflater(parent);
        View itemView = mLayoutInflater.inflate(mLayoutIds.get(viewType), parent, false);
        return new BaseViewHolder(itemView);
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    private LayoutInflater getLayoutInflater(ViewGroup parent){
        if (mLayoutInflater == null){
            mLayoutInflater =  LayoutInflater.from(parent.getContext());
        }
        return mLayoutInflater;
    }

   public abstract void setLayoutIds(SparseArray<Integer> layoutIds);
}
