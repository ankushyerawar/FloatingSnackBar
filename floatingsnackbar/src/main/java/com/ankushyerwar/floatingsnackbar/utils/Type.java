package com.ankushyerwar.floatingsnackbar.utils;

import android.graphics.Color;

import com.ankushyerwar.floatingsnackbar.R;
import com.ankushyerwar.floatingsnackbar.definations.DrawableRes;

public enum Type {

    DEFAULT(R.drawable.ic_default, R.drawable.bg_default),
    SUCCESS(R.drawable.ic_success, R.drawable.bg_success),
    ERROR(R.drawable.ic_error, R.drawable.bg_error),
    WARNING(R.drawable.ic_info, R.drawable.bg_warning),
    INFO(R.drawable.ic_info, R.drawable.bg_info);

    private int iconResId;
    private int backResId;
    private int textColor = Color.WHITE;
    private int backColor = Color.DKGRAY;

    Type(@DrawableRes int iconResId, @DrawableRes int backResId) {
        this.iconResId = iconResId;
        this.backResId = backResId;
    }

    public int getBackColor() {
        return backColor;
    }

    public int getTextColor() {
        return textColor;
    }

    public int getIcon() {
        return iconResId;
    }

    public int getBackground() {
        return backResId;
    }

}
