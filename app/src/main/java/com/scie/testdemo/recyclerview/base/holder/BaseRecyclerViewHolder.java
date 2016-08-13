package com.scie.testdemo.recyclerview.base.holder;

import android.view.View;

import com.scie.testdemo.recyclerview.base.adapter.BaseViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2016/8/13.
 */
public abstract class BaseRecyclerViewHolder extends BaseViewHolder {

    public BaseRecyclerViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void onBindViewHolder(BaseViewHolder holder, int position, List<?> datas);
}
