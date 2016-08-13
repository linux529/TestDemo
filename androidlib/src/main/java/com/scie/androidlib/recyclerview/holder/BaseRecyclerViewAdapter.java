package com.scie.androidlib.recyclerview.holder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2016/8/12.
 */
public abstract class BaseRecyclerViewAdapter<T> extends RecyclerView.Adapter<BaseRecyclerViewHolder> {
    private SparseArray<BaseRecyclerViewHolder> mViewHolders;
    protected List<T> mDatas;
    protected LayoutInflater mLayoutInflater;

    public BaseRecyclerViewAdapter(@NonNull List<T> datas) {
        mDatas = datas;
        mViewHolders = new SparseArray<>();
    }

    @Override
    public BaseRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mLayoutInflater = getLayoutInflater(parent);
        setViewHolder(parent, mViewHolders);
        return mViewHolders.get(viewType);
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }


    public abstract void setViewHolder(ViewGroup parent, SparseArray<BaseRecyclerViewHolder> viewHolders);

    @Override
    public void onBindViewHolder(BaseRecyclerViewHolder holder, int position) {
        holder.onBindViewHolder(holder, position, mDatas);
    }

    private LayoutInflater getLayoutInflater(ViewGroup parent) {
        if (mLayoutInflater == null) {
            mLayoutInflater = LayoutInflater.from(parent.getContext());
        }
        return mLayoutInflater;

    }
}
