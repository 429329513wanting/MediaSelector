package com.example.media.utils;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.media.R;

public class GlideUtils {
    public static void loadImage(@NonNull Context context, @NonNull String url, @NonNull ImageView imageView) {
        RequestOptions options = new RequestOptions().centerCrop().placeholder(R.mipmap.icon_image_background).error(R.mipmap.icon_image_background);
        Glide.with(context).asBitmap().apply(options).load(url).into(imageView);
    }

    public static void loadImage(@NonNull Context context, @NonNull String url, @NonNull ImageView imageView, boolean isCenterCrop) {
        RequestOptions options = new RequestOptions().placeholder(R.mipmap.icon_image_background).error(R.mipmap.icon_image_background);
        if (isCenterCrop) {
            options = options.centerCrop();
        } else {
            options = options.centerInside();
        }
        Glide.with(context).asBitmap().apply(options).load(url).into(imageView);
    }

    public static void loadImage(@NonNull Context context, @DrawableRes int resId, @NonNull ImageView imageView) {
        RequestOptions options = new RequestOptions().centerInside().placeholder(R.mipmap.icon_image_background).error(R.mipmap.icon_image_background);
        Glide.with(context).asBitmap().apply(options).load(resId).into(imageView);
    }

}
