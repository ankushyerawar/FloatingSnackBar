package com.ankushyerwar.floatingsnackbar;

import android.view.View;

import androidx.annotation.NonNull;

import com.ankushyerwar.floatingsnackbar.definations.ColorInt;
import com.ankushyerwar.floatingsnackbar.definations.DrawableRes;
import com.ankushyerwar.floatingsnackbar.definations.Duration;
import com.ankushyerwar.floatingsnackbar.definations.StringRes;
import com.ankushyerwar.floatingsnackbar.utils.Type;
import com.google.android.material.snackbar.Snackbar;

import static com.ankushyerwar.floatingsnackbar.customization.Customize.customIcon;
import static com.ankushyerwar.floatingsnackbar.customization.Customize.defaultRes;
import static com.ankushyerwar.floatingsnackbar.customization.Customize.defaultChar;
import static com.ankushyerwar.floatingsnackbar.customization.Customize.customChar;
import static com.ankushyerwar.floatingsnackbar.customization.Customize.customRes;

import static com.ankushyerwar.floatingsnackbar.utils.Constants.withIcon;
import static com.ankushyerwar.floatingsnackbar.utils.Constants.withNoIcon;


public class SnackBar {

    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_SHORT = -1;
    public static final int LENGTH_LONG = 0;

    @NonNull
    public static Snackbar success(@NonNull View view, CharSequence text, @Duration int length, boolean withIcon) {
        return defaultChar(view, text, length, Type.SUCCESS, withIcon);
    }

    @NonNull
    public static Snackbar success(@NonNull View view, @StringRes int resId, @Duration int length, boolean withIcon) {
        return defaultRes(view, resId, length, Type.SUCCESS, withIcon);
    }

    @NonNull
    public static Snackbar success(@NonNull View view, CharSequence text, @Duration int length,
                                   @DrawableRes int iconId) {
        return customIcon(view, text, length, Type.SUCCESS, iconId);
    }

    @NonNull
    public static Snackbar success(@NonNull View view, @StringRes int resId, @Duration int length,
                                   @DrawableRes int iconId) {
        return customIcon(view, resId, length, Type.SUCCESS, iconId);
    }

    @NonNull
    public static Snackbar success(@NonNull View view, CharSequence text, @Duration int length) {
        return defaultChar(view, text, length, Type.SUCCESS, withIcon);
    }

    @NonNull
    public static Snackbar success(@NonNull View view, @StringRes int resId, @Duration int length) {
        return defaultRes(view, resId, length, Type.SUCCESS, withIcon);
    }

    @NonNull
    public static Snackbar error(@NonNull View view, CharSequence text, @Duration int length, boolean withIcon) {
        return defaultChar(view, text, length, Type.ERROR, withIcon);
    }

    @NonNull
    public static Snackbar error(@NonNull View view, @StringRes int resId, @Duration int length, boolean withIcon) {
        return defaultRes(view, resId, length, Type.ERROR, withIcon);
    }

    @NonNull
    public static Snackbar error(@NonNull View view, CharSequence text, @Duration int length,
                                   @DrawableRes int iconId) {
        return customIcon(view, text, length, Type.ERROR, iconId);
    }

    @NonNull
    public static Snackbar error(@NonNull View view, @StringRes int resId, @Duration int length,
                                   @DrawableRes int iconId) {
        return customIcon(view, resId, length, Type.ERROR, iconId);
    }

    @NonNull
    public static Snackbar error(@NonNull View view, CharSequence text, @Duration int length) {
        return defaultChar(view, text, length, Type.ERROR, withIcon);
    }

    @NonNull
    public static Snackbar error(@NonNull View view, @StringRes int resId, @Duration int length) {
        return defaultRes(view, resId, length, Type.ERROR, withIcon);
    }

    @NonNull
    public static Snackbar warning(@NonNull View view, CharSequence text, @Duration int length, boolean withIcon) {
        return defaultChar(view, text, length, Type.WARNING, withIcon);
    }

    @NonNull
    public static Snackbar warning(@NonNull View view, @StringRes int resId, @Duration int length, boolean withIcon) {
        return defaultRes(view, resId, length, Type.WARNING, withIcon);
    }

    @NonNull
    public static Snackbar warning(@NonNull View view, CharSequence text, @Duration int length,
                                 @DrawableRes int iconId) {
        return customIcon(view, text, length, Type.WARNING, iconId);
    }

    @NonNull
    public static Snackbar warning(@NonNull View view, @StringRes int resId, @Duration int length,
                                 @DrawableRes int iconId) {
        return customIcon(view, resId, length, Type.WARNING, iconId);
    }


    @NonNull
    public static Snackbar warning(@NonNull View view, CharSequence text, @Duration int length) {
        return defaultChar(view, text, length, Type.WARNING, withIcon);
    }

    @NonNull
    public static Snackbar warning(@NonNull View view, @StringRes int resId, @Duration int length) {
        return defaultRes(view, resId, length, Type.WARNING, withIcon);
    }

    @NonNull
    public static Snackbar info(@NonNull View view, CharSequence text, @Duration int length) {
        return defaultChar(view, text, length, Type.INFO, withIcon);
    }

    @NonNull
    public static Snackbar info(@NonNull View view, @StringRes int resId, @Duration int length) {
        return defaultRes(view, resId, length, Type.INFO, withIcon);
    }

    @NonNull
    public static Snackbar info(@NonNull View view, CharSequence text, @Duration int length,
                                   @DrawableRes int iconId) {
        return customIcon(view, text, length, Type.INFO, iconId);
    }

    @NonNull
    public static Snackbar info(@NonNull View view, @StringRes int resId, @Duration int length,
                                   @DrawableRes int iconId) {
        return customIcon(view, resId, length, Type.INFO, iconId);
    }

    @NonNull
    public static Snackbar info(@NonNull View view, CharSequence text, @Duration int length, boolean withIcon) {
        return defaultChar(view, text, length, Type.INFO, withIcon);
    }


    @NonNull
    public static Snackbar info(@NonNull View view, @StringRes int resId, @Duration int length, boolean withIcon) {
        return defaultRes(view, resId, length, Type.INFO, withIcon);
    }

    @NonNull
    public static Snackbar normal(@NonNull View view, CharSequence text, @Duration int length) {
        return defaultChar(view, text, length, Type.DEFAULT, withNoIcon);
    }

    @NonNull
    public static Snackbar normal(@NonNull View view, @StringRes int resId, @Duration int length) {
        return defaultRes(view, resId, length, Type.DEFAULT, withNoIcon);
    }

    @NonNull
    public static Snackbar normal(@NonNull View view, CharSequence text, @Duration int length,
                                  @DrawableRes int iconId, boolean supportsRTL) {
        return customChar(iconId, view, text, length, Type.DEFAULT.getBackColor(), Type.DEFAULT.getTextColor(), supportsRTL);
    }

    @NonNull
    public static Snackbar normal(@NonNull View view, @StringRes int resId, @Duration int length,
                                  @DrawableRes int iconId, boolean supportsRTL) {
        return customRes(iconId, view, resId, length, Type.DEFAULT.getBackColor(), Type.DEFAULT.getTextColor(), supportsRTL);
    }

    @NonNull
    public static Snackbar custom(@NonNull View view, CharSequence text, @Duration int length,
                                  @DrawableRes int iconId, @ColorInt int backgroundColor,
                                  @ColorInt int textColor, boolean supportsRTL) {
        return customChar(iconId, view, text, length, backgroundColor, textColor, supportsRTL);
    }

    @NonNull
    public static Snackbar custom(@NonNull View view, @StringRes int resId, @Duration int length,
                                  @DrawableRes int iconId, @ColorInt int backgroundColor,
                                  @ColorInt int textColor, boolean supportsRTL) {
        return customRes(iconId, view, resId, length, backgroundColor, textColor, supportsRTL);
    }

}