package com.ankushyerwar.floatingsnackbar;

import android.graphics.drawable.GradientDrawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;

import com.ankushyerwar.floatingsnackbar.definations.ColorInt;
import com.ankushyerwar.floatingsnackbar.definations.DrawableRes;
import com.ankushyerwar.floatingsnackbar.definations.Duration;
import com.ankushyerwar.floatingsnackbar.definations.StringRes;
import com.google.android.material.snackbar.Snackbar;

import static com.ankushyerwar.floatingsnackbar.utils.Constants.margin;
import static com.ankushyerwar.floatingsnackbar.utils.Constants.textSize;
import static com.ankushyerwar.floatingsnackbar.utils.Constants.maxLines;
import static com.ankushyerwar.floatingsnackbar.utils.Constants.noVal;

import static com.ankushyerwar.floatingsnackbar.utils.Constants.withIcon;
import static com.ankushyerwar.floatingsnackbar.utils.Constants.withNoIcon;

import java.util.Objects;

public class SnackBar {

    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_SHORT = -1;
    public static final int LENGTH_LONG = 0;

    @NonNull
    @CheckResult
    public static Snackbar success(@NonNull View view, CharSequence text, @Duration int length, boolean withIcon) {
        return build(view, text, length, Type.SUCCESS, withIcon);
    }

    @NonNull
    @CheckResult
    public static Snackbar success(@NonNull View view, @StringRes int resId, @Duration int length, boolean withIcon) {
        return build(view, resId, length, Type.SUCCESS, withIcon);
    }

    @NonNull
    @CheckResult
    public static Snackbar success(@NonNull View view, CharSequence text, @Duration int length) {
        return build(view, text, length, Type.SUCCESS, withIcon);
    }

    @NonNull
    @CheckResult
    public static Snackbar success(@NonNull View view, @StringRes int resId, @Duration int length) {
        return build(view, resId, length, Type.SUCCESS, withIcon);
    }

    @NonNull
    @CheckResult
    public static Snackbar error(@NonNull View view, CharSequence text, @Duration int length, boolean withIcon) {
        return build(view, text, length, Type.ERROR, withIcon);
    }

    @NonNull
    @CheckResult
    public static Snackbar error(@NonNull View view, @StringRes int resId, @Duration int length, boolean withIcon) {
        return build(view, resId, length, Type.ERROR, withIcon);
    }

    @NonNull
    @CheckResult
    public static Snackbar error(@NonNull View view, CharSequence text, @Duration int length) {
        return build(view, text, length, Type.ERROR, withIcon);
    }

    @NonNull
    @CheckResult
    public static Snackbar error(@NonNull View view, @StringRes int resId, @Duration int length) {
        return build(view, resId, length, Type.ERROR, withIcon);
    }

    @NonNull
    @CheckResult
    public static Snackbar warning(@NonNull View view, CharSequence text, @Duration int length, boolean withIcon) {
        return build(view, text, length, Type.WARNING, withIcon);
    }

    @NonNull
    @CheckResult
    public static Snackbar warning(@NonNull View view, @StringRes int resId, @Duration int length, boolean withIcon) {
        return build(view, resId, length, Type.WARNING, withIcon);
    }

    @NonNull
    @CheckResult
    public static Snackbar warning(@NonNull View view, CharSequence text, @Duration int length) {
        return build(view, text, length, Type.WARNING, withIcon);
    }

    @NonNull
    @CheckResult
    public static Snackbar warning(@NonNull View view, @StringRes int resId, @Duration int length) {
        return build(view, resId, length, Type.WARNING, withIcon);
    }

    @NonNull
    @CheckResult
    public static Snackbar info(@NonNull View view, CharSequence text, @Duration int length) {
        return build(view, text, length, Type.INFO, withIcon);
    }

    @NonNull
    @CheckResult
    public static Snackbar info(@NonNull View view, @StringRes int resId, @Duration int length) {
        return build(view, resId, length, Type.INFO, withIcon);
    }

    @NonNull
    @CheckResult
    public static Snackbar info(@NonNull View view, CharSequence text, @Duration int length, boolean withIcon) {
        return build(view, text, length, Type.INFO, withIcon);
    }


    @NonNull
    @CheckResult
    public static Snackbar info(@NonNull View view, @StringRes int resId, @Duration int length, boolean withIcon) {
        return build(view, resId, length, Type.INFO, withIcon);
    }

    @NonNull
    @CheckResult
    public static Snackbar normal(@NonNull View view, CharSequence text, @Duration int length) {
        return build(view, text, length, Type.DEFAULT, withNoIcon);
    }

    @NonNull
    @CheckResult
    public static Snackbar normal(@NonNull View view, @StringRes int resId, @Duration int length) {
        return build(view, resId, length, Type.DEFAULT, withNoIcon);
    }

    @NonNull
    @CheckResult
    public static Snackbar custom(@NonNull View view, CharSequence text, @Duration int length,
                                  @DrawableRes int iconId, @ColorInt int backgroundColor,
                                  @ColorInt int textColor) {
        return custom(iconId, view, text, length, backgroundColor,textColor);
    }

    @NonNull
    @CheckResult
    public static Snackbar custom(@NonNull View view, @StringRes int resId, @Duration int length,
                                  @DrawableRes int iconId, @ColorInt int backgroundColor,
                                  @ColorInt int textColor) {
        return custom(iconId, view, resId, length, backgroundColor, textColor);
    }

    private static ViewGroup.MarginLayoutParams setMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)
                view.getLayoutParams();

        marginLayoutParams.setMargins(marginLayoutParams.leftMargin + margin,
                marginLayoutParams.topMargin, marginLayoutParams.rightMargin + margin,
                marginLayoutParams.bottomMargin + margin);

        return marginLayoutParams;
    }

    private static void setTextStyle(View view, @DrawableRes int resId, boolean withIcon) {
        TextView textView = view.findViewById(R.id.snackbar_text);
        textView.setTextSize(textSize);
        textView.setMaxLines(maxLines);
        if (withIcon)
            textView.setCompoundDrawablesWithIntrinsicBounds(resId, noVal, noVal, noVal);
        textView.setCompoundDrawablePadding(textView.getResources().getDimensionPixelOffset(R.dimen.icon_padding));
    }

    private static Snackbar build(@NonNull View view, @StringRes int resId, @Duration int length,
                                  Type type, boolean withIcon) {

        Snackbar snackbar = Snackbar.make(view, resId, length);

        try {

            final View snackBarView = snackbar.getView();

            setTextStyle(snackBarView, type.getIcon(), withIcon);

            snackBarView.setLayoutParams(setMargins(snackBarView));

            snackBarView.setBackground(snackBarView.getContext().getDrawable(type.getBackground()));

            return snackbar;

        } catch (NullPointerException e) {
            Log.e("StackTrace", Objects.requireNonNull(e.getMessage()));
        } catch (ClassCastException e) {
            Log.e("StackTrace", Objects.requireNonNull(e.getMessage()));
        }

        return snackbar;
    }

    private static Snackbar build(@NonNull View view, CharSequence text, @Duration int length,
                                  Type type, boolean withIcon) {

        Snackbar snackbar = Snackbar.make(view, text, length);

        try {

            final View snackBarView = snackbar.getView();

            setTextStyle(snackBarView, type.getIcon(), withIcon);

            snackBarView.setLayoutParams(setMargins(snackBarView));

            snackBarView.setBackground(snackBarView.getContext().getDrawable(type.getBackground()));

            return snackbar;

        } catch (NullPointerException e) {
            Log.e("StackTrace", Objects.requireNonNull(e.getMessage()));
        } catch (ClassCastException e) {
            Log.e("StackTrace", Objects.requireNonNull(e.getMessage()));
        }

        return snackbar;
    }

    private static Snackbar custom(@DrawableRes int iconId, @NonNull View view, CharSequence text,
                                   @Duration int length, @ColorInt int backgroundColor,
                                   @ColorInt int textColor) {

        Snackbar snackbar = Snackbar.make(view, text, length);

        try {

            final View snackBarView = snackbar.getView();

            setTextStyle(snackBarView, iconId, textColor);

            snackBarView.setLayoutParams(setMargins(snackBarView));

            snackBarView.setBackground(setBackground(backgroundColor));

            return snackbar;

        } catch (NullPointerException e) {
            Log.e("StackTrace", Objects.requireNonNull(e.getMessage()));
        } catch (ClassCastException e) {
            Log.e("StackTrace", Objects.requireNonNull(e.getMessage()));
        }

        return snackbar;
    }

    private static Snackbar custom(@DrawableRes int iconId, @NonNull View view, @StringRes int resId,
                                   @Duration int length, @ColorInt int backgroundColor,
                                   @ColorInt int textColor) {

        Snackbar snackbar = Snackbar.make(view, resId, length);

        try {

            final View snackBarView = snackbar.getView();

            setTextStyle(snackBarView, iconId, textColor);

            snackBarView.setLayoutParams(setMargins(snackBarView));

            snackBarView.setBackground(setBackground(backgroundColor));

            return snackbar;

        } catch (NullPointerException e) {
            Log.e("StackTrace", Objects.requireNonNull(e.getMessage()));
        } catch (ClassCastException e) {
            Log.e("StackTrace", Objects.requireNonNull(e.getMessage()));
        }

        return snackbar;
    }

    private static void setTextStyle(View view, @DrawableRes int resId, @ColorInt int textColor) {
        TextView textView = view.findViewById(R.id.snackbar_text);
        textView.setTextSize(textSize);
        textView.setMaxLines(maxLines);
        textView.setTextColor(textColor);
        textView.setCompoundDrawablesWithIntrinsicBounds(resId, noVal, noVal, noVal);
        textView.setCompoundDrawablePadding(textView.getResources().getDimensionPixelOffset(R.dimen.icon_padding));
    }

    private static GradientDrawable setBackground(int backgroundColor) {
        GradientDrawable shape = new GradientDrawable();
        shape.setShape(GradientDrawable.RECTANGLE);
        shape.setCornerRadius(8);
        shape.setColor(backgroundColor);
        return shape;
    }

    private enum Type {

        DEFAULT(R.drawable.ic_default, R.drawable.bg_default),
        SUCCESS(R.drawable.ic_success, R.drawable.bg_success),
        ERROR(R.drawable.ic_error, R.drawable.bg_error),
        WARNING(R.drawable.ic_info, R.drawable.bg_warning),
        INFO(R.drawable.ic_info, R.drawable.bg_info);

        private int iconResId;
        private int backResId;

        Type(@DrawableRes int iconResId, @DrawableRes int backResId) {
            this.iconResId = iconResId;
            this.backResId = backResId;
        }

        public int getIcon() {
            return iconResId;
        }

        public int getBackground() {
            return backResId;
        }
    }
}