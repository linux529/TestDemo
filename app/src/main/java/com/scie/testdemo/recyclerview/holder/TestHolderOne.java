package com.scie.testdemo.recyclerview.holder;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.scie.testdemo.GlideActivity;
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
        itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                return false;
            }
        });
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             mContext.startActivity(new Intent(mContext, GlideActivity.class));
            }
        });
       tvText.setText((CharSequence) datas.get(position));
    }
}
