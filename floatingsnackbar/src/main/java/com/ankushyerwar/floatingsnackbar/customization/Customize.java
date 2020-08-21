package com.ankushyerwar.floatingsnackbar.customization;

import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.ankushyerwar.floatingsnackbar.R;
import com.ankushyerwar.floatingsnackbar.definations.ColorInt;
import com.ankushyerwar.floatingsnackbar.definations.DrawableRes;
import com.ankushyerwar.floatingsnackbar.definations.Duration;
import com.ankushyerwar.floatingsnackbar.definations.StringRes;
import com.ankushyerwar.floatingsnackbar.utils.Type;
import com.google.android.material.snackbar.Snackbar;

import java.lang.reflect.Field;
import java.util.Objects;

import static com.ankushyerwar.floatingsnackbar.utils.Constants.TAG;
import static com.ankushyerwar.floatingsnackbar.utils.Constants.corner;
import static com.ankushyerwar.floatingsnackbar.utils.Constants.margin;
import static com.ankushyerwar.floatingsnackbar.utils.Constants.maxLines;
import static com.ankushyerwar.floatingsnackbar.utils.Constants.noVal;
import static com.ankushyerwar.floatingsnackbar.utils.Constants.textSize;

/** Last Updated: 04\12\2019
*  @author: Ankush Yerawar
*/

public class Customize {

    private static Snackbar makeSnack(@NonNull View view, @StringRes int resId, @Duration int length) {
        return Snackbar.make(view, resId, length);
    }

    private static Snackbar makeSnack(@NonNull View view, CharSequence text, @Duration int length) {
        return Snackbar.make(view, text, length);
    }

    public static Snackbar defaultRes(@NonNull View view, @StringRes int resId, @Duration int length,
                                      Type type, boolean withIcon) {

        return modify(makeSnack(view, resId, length), type, withIcon);
    }

    public static Snackbar defaultChar(@NonNull View view, CharSequence text, @Duration int length,
                                       Type type, boolean withIcon) {

        return modify(makeSnack(view, text, length), type, withIcon);
    }

    public static Snackbar customIcon(@NonNull View view, CharSequence text, @Duration int length,
                                      Type type, @DrawableRes int iconId) {

        return modifyIcon(makeSnack(view, text, length),type,iconId);
    }

    public static Snackbar customIcon(@NonNull View view, @StringRes int resId, @Duration int length,
                                      Type type, @DrawableRes int iconId) {

        return modifyIcon(makeSnack(view, resId, length),type,iconId);
    }

    public static Snackbar customChar(@DrawableRes int iconId, @NonNull View view, CharSequence text,
                                      @Duration int length, @ColorInt int backgroundColor,
                                      @ColorInt int textColor, @NonNull boolean supportsRTL) {

        return customModify(makeSnack(view, text, length), iconId, textColor, backgroundColor, supportsRTL);
    }

    public static Snackbar customRes(@DrawableRes int iconId, @NonNull View view, @StringRes int resId,
                                     @Duration int length, @ColorInt int backgroundColor,
                                     @ColorInt int textColor, @NonNull boolean supportsRTL) {

        return customModify(makeSnack(view, resId, length), iconId, textColor, backgroundColor, supportsRTL);
    }

    private static Snackbar modify(Snackbar snackbar, Type type, boolean withIcon) {
        try {

            final View snackBarView = snackbar.getView();

            setTextStyle(snackBarView, type.getIcon(), withIcon);

            //snackBarView.setLayoutParams(setMargins(snackBarView));
            fixSnackBarMarginBottomBug(snackbar);

            snackBarView.setBackground(snackBarView.getContext().getDrawable(type.getBackground()));

            return snackbar;

        } catch (NullPointerException | ClassCastException exception) {
            Log.e(TAG,"Exception" + exception.getMessage());
        }
        return snackbar;
    }

    private static Snackbar modifyIcon(Snackbar snackbar, Type type, @DrawableRes int iconId) {
        try {

            final View snackBarView = snackbar.getView();

            setTextStyle(snackBarView, iconId, true);

            //snackBarView.setLayoutParams(setMargins(snackBarView));
            fixSnackBarMarginBottomBug(snackbar);

            snackBarView.setBackground(snackBarView.getContext().getDrawable(type.getBackground()));

            return snackbar;

        } catch (NullPointerException | ClassCastException exception) {
            Log.e(TAG,"Exception" + exception.getMessage());
        }
        return snackbar;
    }

    private static Snackbar customModify(Snackbar snackbar, @DrawableRes int iconId, @ColorInt int textColor,
                                         @ColorInt int backgroundColor, boolean supportsRTL) {
        try {

            final View snackBarView = snackbar.getView();

            setCustomTextStyle(snackBarView, iconId, textColor, supportsRTL);

            //snackBarView.setLayoutParams(setMargins(snackBarView));
            fixSnackBarMarginBottomBug(snackbar);

            snackBarView.setBackground(setBackground(backgroundColor));

            return snackbar;

        } catch (NullPointerException | ClassCastException exception) {
            Log.e(TAG,"Exception" + exception.getMessage());
        }
        return snackbar;
    }

    private static void setTextStyle(View view, @DrawableRes int resId, boolean withIcon) {
        TextView textView = view.findViewById(R.id.snackbar_text);
        textView.setTextSize(textSize);
        textView.setMaxLines(maxLines);
        if (withIcon) {
            textView.setCompoundDrawablesWithIntrinsicBounds(resId, noVal, noVal, noVal);
            textView.setCompoundDrawablePadding(textView.getResources().getDimensionPixelOffset(R.dimen.icon_padding));
        }
    }

    private static void setCustomTextStyle(View view, @DrawableRes int resId, @ColorInt int textColor, boolean supportsRTL) {
        TextView textView = view.findViewById(R.id.snackbar_text);
        textView.setTextSize(textSize);
        textView.setMaxLines(maxLines);
        textView.setTextColor(textColor);
        textView.setCompoundDrawablePadding(textView.getResources().getDimensionPixelOffset(R.dimen.icon_padding));
        if (supportsRTL) {
            textView.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
            textView.setCompoundDrawablesWithIntrinsicBounds(noVal, noVal, resId, noVal);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(resId, noVal, noVal, noVal);
        }
    }

    /*private static ViewGroup.MarginLayoutParams setMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)
                view.getLayoutParams();

        marginLayoutParams.setMargins(marginLayoutParams.leftMargin + margin,
                marginLayoutParams.topMargin, marginLayoutParams.rightMargin + margin,
                marginLayoutParams.bottomMargin + margin);



        return marginLayoutParams;
    }*/

    private static void fixSnackBarMarginBottomBug(Object snackBar) {
        try {
            Class snackbarClass = Class.forName("com.google.android.material.snackbar.Snackbar");
            Field originalMarginsField = Objects.requireNonNull(snackbarClass.getSuperclass()).getDeclaredField("originalMargins");
            originalMarginsField.setAccessible(true);
            Rect fixedOriginalMargins = new Rect();
            fixedOriginalMargins.left = margin;
            fixedOriginalMargins.right = margin;
            fixedOriginalMargins.bottom = margin;
            originalMarginsField.set(snackBar, fixedOriginalMargins);
        } catch (IllegalAccessException | NoSuchFieldException | ClassNotFoundException ignored) {

        }
    }

    private static GradientDrawable setBackground(int backgroundColor) {
        GradientDrawable shape = new GradientDrawable();
        shape.setShape(GradientDrawable.RECTANGLE);
        shape.setCornerRadius(corner);
        shape.setColor(backgroundColor);
        return shape;
    }
}
