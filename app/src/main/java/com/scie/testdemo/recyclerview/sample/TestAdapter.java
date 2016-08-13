package com.scie.testdemo.recyclerview.sample;

import android.support.annotation.NonNull;
import android.util.SparseArray;
import android.widget.TextView;

import com.scie.testdemo.R;
import com.scie.testdemo.recyclerview.base.adapter.BaseRecyclerViewAdapter;
import com.scie.testdemo.recyclerview.base.adapter.BaseViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2016/8/13.
 */
public class TestAdapter extends BaseRecyclerViewAdapter<String> {

    public static final int TYPE_ONE = 1;
    public static final int TYPE_TWO = 2;

    public TestAdapter(@NonNull List<String> datas) {
        super(datas);
    }

    @Override
    public void setLayoutIds(SparseArray<Integer> layoutIds) {
        layoutIds.put(TYPE_ONE, R.layout.item_one);
        layoutIds.put(TYPE_TWO, R.layout.item_two);
    }


    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        TextView view = (TextView) holder.getView(R.id.tv_text);
        view.setText(mDatas.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        return position%2==0?TYPE_ONE:TYPE_TWO;
    }
}
