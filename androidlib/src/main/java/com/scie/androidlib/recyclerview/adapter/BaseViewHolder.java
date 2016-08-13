package com.scie.androidlib.recyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;

/**
 * Created by Administrator on 2016/8/12.
 */
public class BaseViewHolder extends RecyclerView.ViewHolder{
    private SparseArray<View> mViews;
    protected Context mContext;

    public BaseViewHolder(View itemView) {
        super(itemView);
        mContext =  super.itemView.getContext();
        mViews = new SparseArray();
    }

    public View getView(int id){
        View view = mViews.get(id);
        if(view == null){
            view = itemView.findViewById(id);
        }
        return view;
    }

}
