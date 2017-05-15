package com.afollestad.aesthetic.views;

import android.support.annotation.ColorInt;
import android.support.annotation.RestrictTo;

import com.google.auto.value.AutoValue;

import static android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP;

/** @author Aidan Follestad (afollestad) */
@RestrictTo(LIBRARY_GROUP)
@AutoValue
abstract class ColorIsDarkState {

  static ColorIsDarkState create(int color, boolean isDark) {
    return new AutoValue_ColorIsDarkState(color, isDark);
  }

  @ColorInt
  abstract int color();

  abstract boolean isDark();
}
