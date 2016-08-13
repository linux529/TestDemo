package com.scie.testdemo.recyclerview.holder;

import android.view.View;
import android.widget.ImageView;

import com.scie.androidlib.image.ImageUtils;
import com.scie.testdemo.R;
import com.scie.testdemo.recyclerview.base.adapter.BaseViewHolder;
import com.scie.testdemo.recyclerview.base.holder.BaseRecyclerViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2016/8/13.
 */
public class GlideHolder extends BaseRecyclerViewHolder {
    private ImageView ivUrl;
    public GlideHolder(View itemView) {
        super(itemView);
        ivUrl = (ImageView) getView(R.id.iv_url);
    }
    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position, List<?> datas) {

       ImageUtils.loadCircleImage(mContext,ivUrl, (String) datas.get(position));
    }
}
