package com.example.yingdeli.mylibary;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by yingde.li on 2015/12/23.
 */
public class ShimmerButton extends Button implements ShimmerViewBase {

    private ShimmerViewHelper shimmerViewHelper;
    public ShimmerButton(Context context) {
        super(context);
        init(null);
    }

    public ShimmerButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public ShimmerButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        shimmerViewHelper = new ShimmerViewHelper(this, getPaint(), attrs);
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
    public void setShimmering(boolean isShammering) {
        shimmerViewHelper.setShimmering(isShammering);
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
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if(shimmerViewHelper != null) {
            shimmerViewHelper.onSizeChanged();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(shimmerViewHelper != null) {
            shimmerViewHelper.onDraw();
        }
    }

    @Override
    public void setTextColor(ColorStateList colors) {
        super.setTextColor(colors);
        if(shimmerViewHelper != null) {
            shimmerViewHelper.setPrimaryColor(getCurrentTextColor());
        }
    }

    @Override
    public void setTextColor(int color) {
        super.setTextColor(color);
        if(shimmerViewHelper != null) {
            shimmerViewHelper.setPrimaryColor(getCurrentTextColor());
        }
    }
}
