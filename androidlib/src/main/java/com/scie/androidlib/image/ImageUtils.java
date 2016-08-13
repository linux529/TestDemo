package com.scie.androidlib.image;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Administrator on 2016/8/13.
 */
public class ImageUtils {

    public static void loadCircleImage(Context context, ImageView view,String url){
        Glide.with(context).load(url).into(view);
    }
}
