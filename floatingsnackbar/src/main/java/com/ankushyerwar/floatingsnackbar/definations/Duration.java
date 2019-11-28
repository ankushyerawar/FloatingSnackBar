package com.ankushyerwar.floatingsnackbar.definations;

import androidx.annotation.IntDef;
import androidx.annotation.RestrictTo;

import static com.ankushyerwar.floatingsnackbar.SnackBar.LENGTH_INDEFINITE;
import static com.ankushyerwar.floatingsnackbar.SnackBar.LENGTH_SHORT;
import static com.ankushyerwar.floatingsnackbar.SnackBar.LENGTH_LONG;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
@IntDef({LENGTH_INDEFINITE, LENGTH_SHORT, LENGTH_LONG})
@Retention(RetentionPolicy.SOURCE)
public @interface Duration {
}


