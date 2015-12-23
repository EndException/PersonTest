package com.example.yingdeli.mylibary;

/**
 * Created by yingde.li on 2015/12/22.
 */
public interface ShimmerViewBase {
    float getGradientX();
    void setGradientX(float gradientX);
    boolean isShimmering();
    void setShimmering(boolean isShammering);
    boolean isSetUp();
    void setAnimationSetupCallback(ShimmerViewHelper.AnimationSetupCallback callback);
    int getPrimaryColor();
    void setPrimaryColor(int primaryColor);
    int getReflectionColor();
    void setReflectionColor(int reflectionColor);
}
