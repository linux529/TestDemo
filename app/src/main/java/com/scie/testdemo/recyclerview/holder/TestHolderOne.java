package com.scie.testdemo.recyclerview.holder;

import android.view.View;
import android.widget.TextView;

import com.scie.testdemo.R;
import com.scie.testdemo.recyclerview.base.adapter.BaseViewHolder;
import com.scie.testdemo.recyclerview.base.holder.BaseRecyclerViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2016/8/13.
 */
public class TestHolderOne extends BaseRecyclerViewHolder {
    private TextView tvText;
    public TestHolderOne(View itemView) {
        super(itemView);
        tvText = (TextView) getView(R.id.tv_text);
    }
    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position, List<?> datas) {
       tvText.setText((CharSequence) datas.get(position));
    }
}
