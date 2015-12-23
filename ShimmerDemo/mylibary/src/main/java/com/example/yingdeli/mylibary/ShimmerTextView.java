package com.example.yingdeli.mylibary;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by yingde.li on 2015/12/23.
 */
public class ShimmerTextView extends TextView implements ShimmerViewBase {

    private ShimmerViewHelper shimmerViewHelper;

    public ShimmerTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public ShimmerTextView(Context context) {
        super(context);
        init(null);
    }

    public ShimmerTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    private void init(AttributeSet a) {
        shimmerViewHelper = new ShimmerViewHelper(this, getPaint(), a);
        shimmerViewHelper.setPrimaryColor(getCurrentTextColor());
    }

    @Override
    public float getGradientX() {
        return shimmerViewHelper.getGradientX();
    }

    @Override
    public void setGradientX(float gradientX) {
        shimmerViewHelper.setGradientX(gradientX);
    }

    @Override
    public boolean isShimmering() {
        return shimmerViewHelper.isShimmering();
    }

    @Override
    public void setShimmering(boolean flag) {
        shimmerViewHelper.setShimmering(flag);
    }

    @Override
    public boolean isSetUp() {
        return shimmerViewHelper.isSetUp();
    }

    @Override
    public void setAnimationSetupCallback(ShimmerViewHelper.AnimationSetupCallback callback) {
        shimmerViewHelper.setAnimationSetupCallback(callback);
    }

    @Override
    public int getPrimaryColor() {
        return shimmerViewHelper.getPrimaryColor();
    }

    @Override
    public void setPrimaryColor(int primaryColor) {
        shimmerViewHelper.setPrimaryColor(primaryColor);
    }


    @Override
    public int getReflectionColor() {
        return shimmerViewHelper.getReflectionColor();
    }

    @Override
    public void setReflectionColor(int reflectionColor) {
        shimmerViewHelper.setReflectionColor(reflectionColor);
    }

    @Override
    public void setTextColor(int color) {
        super.setTextColor(color);
        if (shimmerViewHelper != null) {
            shimmerViewHelper.setPrimaryColor(getCurrentTextColor());
        }
    }

    @Override
    public void setTextColor(ColorStateList colors) {
        super.setTextColor(colors);
        if (shimmerViewHelper != null) {
            shimmerViewHelper.setPrimaryColor(getCurrentTextColor());
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (shimmerViewHelper != null) {
            shimmerViewHelper.onDraw();
        }
        super.onDraw(canvas);

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if(shimmerViewHelper != null) {
            shimmerViewHelper.onSizeChanged();
        }
    }
}
