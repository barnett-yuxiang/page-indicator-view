package com.yu.android.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

public class PageIndicatorView extends View {

    public PageIndicatorView(Context context) {
        this(context, null);
    }

    public PageIndicatorView(Context context, @androidx.annotation.Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.PageIndicatorView);
        int count = typedArray.getInt(R.styleable.PageIndicatorView_piv_count, 0);
        typedArray.recycle();
    }

    public PageIndicatorView(Context context, @androidx.annotation.Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
